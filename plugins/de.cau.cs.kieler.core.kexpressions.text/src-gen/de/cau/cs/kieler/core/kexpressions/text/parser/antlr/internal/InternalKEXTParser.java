package de.cau.cs.kieler.core.kexpressions.text.parser.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.text.services.KEXTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKEXTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scope'", "'{'", "'}'", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "';'", "':'", "'ref'", "'extern'", "'['", "']'", "'='", "'combine'", "'('", "')'", "'()'", "'<'", "'>'", "'\\''", "'.'", "'!'", "'&'", "'@'", "'#'", "'-'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKEXTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKEXTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKEXTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKEXT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KEXTGrammarAccess grammarAccess;
     	
        public InternalKEXTParser(TokenStream input, KEXTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Kext";	
       	}
       	
       	@Override
       	protected KEXTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKext"
    // InternalKEXT.g:74:1: entryRuleKext returns [EObject current=null] : iv_ruleKext= ruleKext EOF ;
    public final EObject entryRuleKext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKext = null;


        try {
            // InternalKEXT.g:75:2: (iv_ruleKext= ruleKext EOF )
            // InternalKEXT.g:76:2: iv_ruleKext= ruleKext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKextRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKext=ruleKext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKext; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKext"


    // $ANTLR start "ruleKext"
    // InternalKEXT.g:83:1: ruleKext returns [EObject current=null] : ( (lv_scopes_0_0= ruleRootScope ) ) ;
    public final EObject ruleKext() throws RecognitionException {
        EObject current = null;

        EObject lv_scopes_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:86:28: ( ( (lv_scopes_0_0= ruleRootScope ) ) )
            // InternalKEXT.g:87:1: ( (lv_scopes_0_0= ruleRootScope ) )
            {
            // InternalKEXT.g:87:1: ( (lv_scopes_0_0= ruleRootScope ) )
            // InternalKEXT.g:88:1: (lv_scopes_0_0= ruleRootScope )
            {
            // InternalKEXT.g:88:1: (lv_scopes_0_0= ruleRootScope )
            // InternalKEXT.g:89:3: lv_scopes_0_0= ruleRootScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKextAccess().getScopesRootScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_scopes_0_0=ruleRootScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKextRule());
              	        }
                     		add(
                     			current, 
                     			"scopes",
                      		lv_scopes_0_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.RootScope");
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
    // $ANTLR end "ruleKext"


    // $ANTLR start "entryRuleRootScope"
    // InternalKEXT.g:113:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootScope = null;


        try {
            // InternalKEXT.g:114:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalKEXT.g:115:2: iv_ruleRootScope= ruleRootScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRootScope=ruleRootScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootScope; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootScope"


    // $ANTLR start "ruleRootScope"
    // InternalKEXT.g:122:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:125:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalKEXT.g:126:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalKEXT.g:126:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalKEXT.g:126:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalKEXT.g:126:2: ()
            // InternalKEXT.g:127:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootScopeAccess().getKEXTScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKEXT.g:135:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalKEXT.g:136:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalKEXT.g:136:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalKEXT.g:137:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKEXT.g:153:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_HOSTCODE||LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==19||LA2_0==29||LA2_0==37||LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKEXT.g:154:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalKEXT.g:154:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalKEXT.g:155:3: lv_entities_2_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getEntitiesTestEntityParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_entities_2_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_2_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKEXT.g:171:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKEXT.g:171:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:175:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalKEXT.g:176:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalKEXT.g:176:1: (lv_scopes_4_0= ruleScope )
            	    // InternalKEXT.g:177:3: lv_scopes_4_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getScopesScopeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_scopes_4_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Scope");
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
    // $ANTLR end "ruleRootScope"


    // $ANTLR start "entryRuleScope"
    // InternalKEXT.g:201:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalKEXT.g:202:2: (iv_ruleScope= ruleScope EOF )
            // InternalKEXT.g:203:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalKEXT.g:210:1: ruleScope returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:213:28: ( ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalKEXT.g:214:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalKEXT.g:214:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalKEXT.g:214:2: () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalKEXT.g:214:2: ()
            // InternalKEXT.g:215:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeAccess().getKEXTScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKEXT.g:223:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKEXT.g:224:1: (lv_id_1_0= RULE_ID )
                    {
                    // InternalKEXT.g:224:1: (lv_id_1_0= RULE_ID )
                    // InternalKEXT.g:225:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getScopeAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKEXT.g:245:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalKEXT.g:246:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalKEXT.g:246:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalKEXT.g:247:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalKEXT.g:263:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_HOSTCODE||LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==19||LA6_0==29||LA6_0==37||LA6_0==43) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKEXT.g:264:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalKEXT.g:264:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalKEXT.g:265:3: lv_entities_4_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getEntitiesTestEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_entities_4_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalKEXT.g:281:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKEXT.g:281:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalKEXT.g:285:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalKEXT.g:286:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalKEXT.g:286:1: (lv_scopes_6_0= ruleScope )
            	    // InternalKEXT.g:287:3: lv_scopes_6_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getScopesScopeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_scopes_6_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_6_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Scope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getScopeAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTestEntity"
    // InternalKEXT.g:315:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalKEXT.g:316:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalKEXT.g:317:2: iv_ruleTestEntity= ruleTestEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestEntity=ruleTestEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestEntity"


    // $ANTLR start "ruleTestEntity"
    // InternalKEXT.g:324:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:327:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalKEXT.g:328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalKEXT.g:328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKEXT.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalKEXT.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalKEXT.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalKEXT.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalKEXT.g:330:3: lv_expression_0_0= ruleAnnotatedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_0_0=ruleAnnotatedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:347:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalKEXT.g:347:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalKEXT.g:348:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalKEXT.g:348:1: (lv_effect_1_0= ruleEffect )
                    // InternalKEXT.g:349:3: lv_effect_1_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getEffectEffectParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_effect_1_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_1_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalKEXT.g:373:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalKEXT.g:374:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalKEXT.g:375:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotatedExpression=ruleAnnotatedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // InternalKEXT.g:382:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:385:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKEXT.g:386:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKEXT.g:386:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKEXT.g:386:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKEXT.g:386:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKEXT.g:387:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:387:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:388:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalKEXT.g:408:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKEXT.g:409:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKEXT.g:409:1: (lv_expression_2_0= ruleExpression )
            // InternalKEXT.g:410:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalKEXT.g:434:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalKEXT.g:435:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalKEXT.g:436:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalKEXT.g:443:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:446:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) )
            // InternalKEXT.g:447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            {
            // InternalKEXT.g:447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalKEXT.g:448:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKEXT.g:461:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceDeclaration_1=ruleReferenceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceDeclaration_1; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalKEXT.g:482:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKEXT.g:483:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKEXT.g:484:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:491:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:494:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // InternalKEXT.g:495:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // InternalKEXT.g:495:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // InternalKEXT.g:495:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // InternalKEXT.g:495:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMENT_ANNOTATION||LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKEXT.g:496:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:496:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:497:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalKEXT.g:513:3: ( (lv_const_1_0= 'const' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKEXT.g:514:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKEXT.g:514:1: (lv_const_1_0= 'const' )
                    // InternalKEXT.g:515:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:528:3: ( (lv_input_2_0= 'input' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKEXT.g:529:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKEXT.g:529:1: (lv_input_2_0= 'input' )
                    // InternalKEXT.g:530:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,21,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationAccess().getInputInputKeyword_2_0());
                          
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

            // InternalKEXT.g:543:3: ( (lv_output_3_0= 'output' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKEXT.g:544:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKEXT.g:544:1: (lv_output_3_0= 'output' )
                    // InternalKEXT.g:545:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,22,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationAccess().getOutputOutputKeyword_3_0());
                          
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

            // InternalKEXT.g:558:3: ( (lv_static_4_0= 'static' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKEXT.g:559:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKEXT.g:559:1: (lv_static_4_0= 'static' )
                    // InternalKEXT.g:560:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,23,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:573:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=69 && LA17_1<=75)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==RULE_ID||LA17_1==RULE_COMMENT_ANNOTATION||LA17_1==43) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=69 && LA17_0<=75)) ) {
                alt17=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKEXT.g:573:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKEXT.g:573:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKEXT.g:573:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKEXT.g:573:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKEXT.g:574:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKEXT.g:574:1: (lv_signal_5_0= 'signal' )
                            // InternalKEXT.g:575:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,24,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKEXT.g:588:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKEXT.g:589:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKEXT.g:589:1: (lv_type_6_0= ruleValueType )
                    // InternalKEXT.g:590:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:607:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKEXT.g:607:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKEXT.g:608:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKEXT.g:608:1: (lv_signal_7_0= 'signal' )
                    // InternalKEXT.g:609:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:622:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKEXT.g:623:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKEXT.g:623:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKEXT.g:624:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:640:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKEXT.g:640:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKEXT.g:644:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKEXT.g:645:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKEXT.g:645:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKEXT.g:646:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_8());
                  
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


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalKEXT.g:674:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            // InternalKEXT.g:675:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalKEXT.g:676:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclarationWOSemicolon=ruleVariableDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWOSemicolon; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationWOSemicolon"


    // $ANTLR start "ruleVariableDeclarationWOSemicolon"
    // InternalKEXT.g:683:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:686:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) )
            // InternalKEXT.g:687:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            {
            // InternalKEXT.g:687:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            // InternalKEXT.g:687:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            {
            // InternalKEXT.g:687:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKEXT.g:688:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:688:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:689:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalKEXT.g:705:3: ( (lv_const_1_0= 'const' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKEXT.g:706:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKEXT.g:706:1: (lv_const_1_0= 'const' )
                    // InternalKEXT.g:707:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:720:3: ( (lv_input_2_0= 'input' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKEXT.g:721:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKEXT.g:721:1: (lv_input_2_0= 'input' )
                    // InternalKEXT.g:722:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,21,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:735:3: ( (lv_output_3_0= 'output' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKEXT.g:736:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKEXT.g:736:1: (lv_output_3_0= 'output' )
                    // InternalKEXT.g:737:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,22,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:750:3: ( (lv_static_4_0= 'static' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKEXT.g:751:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKEXT.g:751:1: (lv_static_4_0= 'static' )
                    // InternalKEXT.g:752:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,23,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKEXT.g:765:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=69 && LA25_1<=75)) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_ID||LA25_1==RULE_COMMENT_ANNOTATION||LA25_1==43) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA25_0>=69 && LA25_0<=75)) ) {
                alt25=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKEXT.g:765:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKEXT.g:765:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKEXT.g:765:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKEXT.g:765:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==24) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalKEXT.g:766:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKEXT.g:766:1: (lv_signal_5_0= 'signal' )
                            // InternalKEXT.g:767:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,24,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKEXT.g:780:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKEXT.g:781:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKEXT.g:781:1: (lv_type_6_0= ruleValueType )
                    // InternalKEXT.g:782:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:799:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKEXT.g:799:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKEXT.g:800:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKEXT.g:800:1: (lv_signal_7_0= 'signal' )
                    // InternalKEXT.g:801:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,24,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:814:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKEXT.g:815:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKEXT.g:815:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKEXT.g:816:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:832:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKEXT.g:832:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKEXT.g:836:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKEXT.g:837:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKEXT.g:837:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKEXT.g:838:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
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
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalKEXT.g:862:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            // InternalKEXT.g:863:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalKEXT.g:864:2: iv_ruleNamespaceID= ruleNamespaceID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamespaceID=ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceID"


    // $ANTLR start "ruleNamespaceID"
    // InternalKEXT.g:871:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PrimeID_2 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:874:28: ( (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* ) )
            // InternalKEXT.g:875:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            {
            // InternalKEXT.g:875:1: (this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            // InternalKEXT.g:875:6: this_ID_0= RULE_ID (kw= ':' this_PrimeID_2= rulePrimeID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKEXT.g:882:1: (kw= ':' this_PrimeID_2= rulePrimeID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKEXT.g:883:2: kw= ':' this_PrimeID_2= rulePrimeID
            	    {
            	    kw=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceIDAccess().getPrimeIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    this_PrimeID_2=rulePrimeID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PrimeID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleNamespaceID"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalKEXT.g:907:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalKEXT.g:908:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalKEXT.g:909:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclaration=ruleReferenceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalKEXT.g:916:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:919:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' ) )
            // InternalKEXT.g:920:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' )
            {
            // InternalKEXT.g:920:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';' )
            // InternalKEXT.g:920:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* otherlv_8= ';'
            {
            // InternalKEXT.g:920:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKEXT.g:921:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:921:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:922:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalKEXT.g:938:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalKEXT.g:938:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKEXT.g:938:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKEXT.g:938:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKEXT.g:942:1: ( ( ruleNamespaceID ) )
                    // InternalKEXT.g:943:1: ( ruleNamespaceID )
                    {
                    // InternalKEXT.g:943:1: ( ruleNamespaceID )
                    // InternalKEXT.g:944:3: ruleNamespaceID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceIdentifiableCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:961:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalKEXT.g:961:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalKEXT.g:961:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKEXT.g:965:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalKEXT.g:966:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalKEXT.g:966:1: (lv_extern_4_0= RULE_STRING )
                    // InternalKEXT.g:967:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:983:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKEXT.g:984:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKEXT.g:984:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKEXT.g:985:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1001:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKEXT.g:1001:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:1005:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKEXT.g:1006:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKEXT.g:1006:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKEXT.g:1007:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getReferenceDeclarationAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalKEXT.g:1035:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            // InternalKEXT.g:1036:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalKEXT.g:1037:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclarationWOSemicolon=ruleReferenceDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclarationWOSemicolon; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceDeclarationWOSemicolon"


    // $ANTLR start "ruleReferenceDeclarationWOSemicolon"
    // InternalKEXT.g:1044:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_extern_4_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_5_0 = null;

        EObject lv_valuedObjects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1047:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* ) )
            // InternalKEXT.g:1048:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* )
            {
            // InternalKEXT.g:1048:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )* )
            // InternalKEXT.g:1048:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) ) ( (lv_valuedObjects_5_0= ruleValuedObject ) ) (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            {
            // InternalKEXT.g:1048:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKEXT.g:1049:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:1049:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:1050:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalKEXT.g:1066:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            else if ( (LA32_0==29) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalKEXT.g:1066:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKEXT.g:1066:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKEXT.g:1066:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKEXT.g:1070:1: ( ( ruleNamespaceID ) )
                    // InternalKEXT.g:1071:1: ( ruleNamespaceID )
                    {
                    // InternalKEXT.g:1071:1: ( ruleNamespaceID )
                    // InternalKEXT.g:1072:3: ruleNamespaceID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getReferenceIdentifiableCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    ruleNamespaceID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:1089:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    {
                    // InternalKEXT.g:1089:6: (otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) ) )
                    // InternalKEXT.g:1089:8: otherlv_3= 'extern' ( (lv_extern_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKEXT.g:1093:1: ( (lv_extern_4_0= RULE_STRING ) )
                    // InternalKEXT.g:1094:1: (lv_extern_4_0= RULE_STRING )
                    {
                    // InternalKEXT.g:1094:1: (lv_extern_4_0= RULE_STRING )
                    // InternalKEXT.g:1095:3: lv_extern_4_0= RULE_STRING
                    {
                    lv_extern_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extern_4_0, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternSTRINGTerminalRuleCall_1_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:1111:4: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            // InternalKEXT.g:1112:1: (lv_valuedObjects_5_0= ruleValuedObject )
            {
            // InternalKEXT.g:1112:1: (lv_valuedObjects_5_0= ruleValuedObject )
            // InternalKEXT.g:1113:3: lv_valuedObjects_5_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_valuedObjects_5_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_5_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1129:2: (otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKEXT.g:1129:4: otherlv_6= ',' ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:1133:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            	    // InternalKEXT.g:1134:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    {
            	    // InternalKEXT.g:1134:1: (lv_valuedObjects_7_0= ruleValuedObject )
            	    // InternalKEXT.g:1135:3: lv_valuedObjects_7_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_valuedObjects_7_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_7_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
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
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleValuedObject"
    // InternalKEXT.g:1159:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalKEXT.g:1160:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalKEXT.g:1161:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalKEXT.g:1168:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_cardinalities_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_initialValue_6_0 = null;

        Enumerator lv_combineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1171:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalKEXT.g:1172:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalKEXT.g:1172:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalKEXT.g:1172:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalKEXT.g:1172:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==43) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKEXT.g:1173:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKEXT.g:1173:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKEXT.g:1174:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalKEXT.g:1190:3: ( (lv_name_1_0= rulePrimeID ) )
            // InternalKEXT.g:1191:1: (lv_name_1_0= rulePrimeID )
            {
            // InternalKEXT.g:1191:1: (lv_name_1_0= rulePrimeID )
            // InternalKEXT.g:1192:3: lv_name_1_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectAccess().getNamePrimeIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_name_1_0=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1208:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKEXT.g:1208:4: otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKEXT.g:1212:1: ( (lv_cardinalities_3_0= RULE_INT ) )
            	    // InternalKEXT.g:1213:1: (lv_cardinalities_3_0= RULE_INT )
            	    {
            	    // InternalKEXT.g:1213:1: (lv_cardinalities_3_0= RULE_INT )
            	    // InternalKEXT.g:1214:3: lv_cardinalities_3_0= RULE_INT
            	    {
            	    lv_cardinalities_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_cardinalities_3_0, grammarAccess.getValuedObjectAccess().getCardinalitiesINTTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_3_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalKEXT.g:1234:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKEXT.g:1234:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalKEXT.g:1238:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalKEXT.g:1239:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalKEXT.g:1239:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalKEXT.g:1240:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:1256:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKEXT.g:1256:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalKEXT.g:1260:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalKEXT.g:1261:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalKEXT.g:1261:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalKEXT.g:1262:3: lv_combineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_combineOperator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_8_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CombineOperator");
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
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalKEXT.g:1286:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalKEXT.g:1287:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalKEXT.g:1288:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalKEXT.g:1295:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;

        EObject this_FunctionCallEffect_5 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1298:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect ) )
            // InternalKEXT.g:1299:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )
            {
            // InternalKEXT.g:1299:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )
            int alt38=6;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalKEXT.g:1300:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKEXT.g:1313:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PostfixEffect_1=rulePostfixEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKEXT.g:1326:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Emission_2=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKEXT.g:1339:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_HostcodeEffect_3=ruleHostcodeEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostcodeEffect_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKEXT.g:1352:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getReferenceCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCallEffect_4=ruleReferenceCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCallEffect_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalKEXT.g:1365:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCallEffect_5=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_5; 
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalKEXT.g:1384:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalKEXT.g:1385:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalKEXT.g:1386:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalKEXT.g:1393:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1396:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalKEXT.g:1397:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalKEXT.g:1397:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalKEXT.g:1397:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalKEXT.g:1397:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalKEXT.g:1398:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKEXT.g:1398:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKEXT.g:1399:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalKEXT.g:1415:3: ( ( rulePrimeID ) )
            // InternalKEXT.g:1416:1: ( rulePrimeID )
            {
            // InternalKEXT.g:1416:1: ( rulePrimeID )
            // InternalKEXT.g:1417:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_30);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1433:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKEXT.g:1433:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalKEXT.g:1437:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalKEXT.g:1438:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalKEXT.g:1438:1: (lv_newValue_3_0= ruleExpression )
                    // InternalKEXT.g:1439:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_newValue_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"newValue",
                              		lv_newValue_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalKEXT.g:1467:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalKEXT.g:1468:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalKEXT.g:1469:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:1476:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1479:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalKEXT.g:1480:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalKEXT.g:1480:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalKEXT.g:1480:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalKEXT.g:1480:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMENT_ANNOTATION||LA41_0==43) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKEXT.g:1481:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:1481:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:1482:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalKEXT.g:1498:3: ( ( rulePrimeID ) )
            // InternalKEXT.g:1499:1: ( rulePrimeID )
            {
            // InternalKEXT.g:1499:1: ( rulePrimeID )
            // InternalKEXT.g:1500:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1516:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==30) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKEXT.g:1516:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKEXT.g:1520:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalKEXT.g:1521:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalKEXT.g:1521:1: (lv_indices_3_0= ruleExpression )
            	    // InternalKEXT.g:1522:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalKEXT.g:1542:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalKEXT.g:1543:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalKEXT.g:1543:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalKEXT.g:1544:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_operator_5_0=ruleAssignOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1560:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalKEXT.g:1561:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalKEXT.g:1561:1: (lv_expression_6_0= ruleExpression )
            // InternalKEXT.g:1562:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalKEXT.g:1586:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalKEXT.g:1587:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalKEXT.g:1588:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalKEXT.g:1595:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1598:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalKEXT.g:1599:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalKEXT.g:1599:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalKEXT.g:1599:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalKEXT.g:1599:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_COMMENT_ANNOTATION||LA43_0==43) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalKEXT.g:1600:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:1600:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:1601:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalKEXT.g:1617:3: ( ( rulePrimeID ) )
            // InternalKEXT.g:1618:1: ( rulePrimeID )
            {
            // InternalKEXT.g:1618:1: ( rulePrimeID )
            // InternalKEXT.g:1619:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_33);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1635:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKEXT.g:1635:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKEXT.g:1639:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalKEXT.g:1640:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalKEXT.g:1640:1: (lv_indices_3_0= ruleExpression )
            	    // InternalKEXT.g:1641:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalKEXT.g:1661:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalKEXT.g:1662:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalKEXT.g:1662:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalKEXT.g:1663:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_operator_5_0=rulePostfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.PostfixOperator");
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
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalKEXT.g:1687:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalKEXT.g:1688:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalKEXT.g:1689:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalKEXT.g:1696:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1699:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKEXT.g:1700:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKEXT.g:1700:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKEXT.g:1700:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKEXT.g:1700:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_COMMENT_ANNOTATION||LA45_0==43) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalKEXT.g:1701:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:1701:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:1702:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHostcodeEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalKEXT.g:1718:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKEXT.g:1719:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKEXT.g:1719:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKEXT.g:1720:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getHostcodeEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHostcodeEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleReferenceCallEffect"
    // InternalKEXT.g:1744:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallEffect = null;


        try {
            // InternalKEXT.g:1745:2: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalKEXT.g:1746:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCallEffect=ruleReferenceCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCallEffect"


    // $ANTLR start "ruleReferenceCallEffect"
    // InternalKEXT.g:1753:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1756:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKEXT.g:1757:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKEXT.g:1757:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKEXT.g:1757:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( rulePrimeID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            // InternalKEXT.g:1757:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_COMMENT_ANNOTATION||LA46_0==43) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKEXT.g:1758:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKEXT.g:1758:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKEXT.g:1759:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalKEXT.g:1775:3: ( ( rulePrimeID ) )
            // InternalKEXT.g:1776:1: ( rulePrimeID )
            {
            // InternalKEXT.g:1776:1: ( rulePrimeID )
            // InternalKEXT.g:1777:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallEffectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_35);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:1793:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            else if ( (LA48_0==36) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalKEXT.g:1793:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKEXT.g:1793:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKEXT.g:1793:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKEXT.g:1797:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKEXT.g:1798:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKEXT.g:1798:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKEXT.g:1799:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:1815:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==25) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalKEXT.g:1815:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKEXT.g:1819:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKEXT.g:1820:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKEXT.g:1820:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKEXT.g:1821:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
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

                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:1842:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
    // $ANTLR end "ruleReferenceCallEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalKEXT.g:1854:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalKEXT.g:1855:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalKEXT.g:1856:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalKEXT.g:1863:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_functionName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:1866:28: ( ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) ) )
            // InternalKEXT.g:1867:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            {
            // InternalKEXT.g:1867:1: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) | (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_COMMENT_ANNOTATION||LA54_0==29||LA54_0==43) ) {
                alt54=1;
            }
            else if ( (LA54_0==37) ) {
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
                    // InternalKEXT.g:1867:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    {
                    // InternalKEXT.g:1867:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
                    // InternalKEXT.g:1867:3: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    {
                    // InternalKEXT.g:1867:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_COMMENT_ANNOTATION||LA49_0==43) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalKEXT.g:1868:1: (lv_annotations_0_0= ruleAnnotation )
                    	    {
                    	    // InternalKEXT.g:1868:1: (lv_annotations_0_0= ruleAnnotation )
                    	    // InternalKEXT.g:1869:3: lv_annotations_0_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_annotations_0_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_0_0, 
                    	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    // InternalKEXT.g:1885:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
                    // InternalKEXT.g:1885:5: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_0_1_0());
                          
                    }
                    // InternalKEXT.g:1889:1: ( (lv_functionName_2_0= RULE_ID ) )
                    // InternalKEXT.g:1890:1: (lv_functionName_2_0= RULE_ID )
                    {
                    // InternalKEXT.g:1890:1: (lv_functionName_2_0= RULE_ID )
                    // InternalKEXT.g:1891:3: lv_functionName_2_0= RULE_ID
                    {
                    lv_functionName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_0_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_2_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:1907:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==34) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==36) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalKEXT.g:1907:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            {
                            // InternalKEXT.g:1907:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                            // InternalKEXT.g:1907:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                            {
                            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_0_1_2_0_0());
                                  
                            }
                            // InternalKEXT.g:1911:1: ( (lv_parameters_4_0= ruleParameter ) )
                            // InternalKEXT.g:1912:1: (lv_parameters_4_0= ruleParameter )
                            {
                            // InternalKEXT.g:1912:1: (lv_parameters_4_0= ruleParameter )
                            // InternalKEXT.g:1913:3: lv_parameters_4_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_parameters_4_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_4_0, 
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKEXT.g:1929:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==25) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalKEXT.g:1929:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                            	    {
                            	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_0_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKEXT.g:1933:1: ( (lv_parameters_6_0= ruleParameter ) )
                            	    // InternalKEXT.g:1934:1: (lv_parameters_6_0= ruleParameter )
                            	    {
                            	    // InternalKEXT.g:1934:1: (lv_parameters_6_0= ruleParameter )
                            	    // InternalKEXT.g:1935:3: lv_parameters_6_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_0_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
                            	    lv_parameters_6_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_6_0, 
                            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_0_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKEXT.g:1956:7: otherlv_8= '()'
                            {
                            otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_0_1_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:1961:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    {
                    // InternalKEXT.g:1961:6: (otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>' )
                    // InternalKEXT.g:1961:8: otherlv_9= '<' ( (lv_functionName_10_0= RULE_ID ) ) ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' ) otherlv_17= '>'
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalKEXT.g:1965:1: ( (lv_functionName_10_0= RULE_ID ) )
                    // InternalKEXT.g:1966:1: (lv_functionName_10_0= RULE_ID )
                    {
                    // InternalKEXT.g:1966:1: (lv_functionName_10_0= RULE_ID )
                    // InternalKEXT.g:1967:3: lv_functionName_10_0= RULE_ID
                    {
                    lv_functionName_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_10_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:1983:2: ( (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' ) | otherlv_16= '()' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==34) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==36) ) {
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
                            // InternalKEXT.g:1983:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            {
                            // InternalKEXT.g:1983:3: (otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')' )
                            // InternalKEXT.g:1983:5: otherlv_11= '(' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= ')'
                            {
                            otherlv_11=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                                  
                            }
                            // InternalKEXT.g:1987:1: ( (lv_parameters_12_0= ruleParameter ) )
                            // InternalKEXT.g:1988:1: (lv_parameters_12_0= ruleParameter )
                            {
                            // InternalKEXT.g:1988:1: (lv_parameters_12_0= ruleParameter )
                            // InternalKEXT.g:1989:3: lv_parameters_12_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_parameters_12_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_12_0, 
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKEXT.g:2005:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==25) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalKEXT.g:2005:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                            	    {
                            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKEXT.g:2009:1: ( (lv_parameters_14_0= ruleParameter ) )
                            	    // InternalKEXT.g:2010:1: (lv_parameters_14_0= ruleParameter )
                            	    {
                            	    // InternalKEXT.g:2010:1: (lv_parameters_14_0= ruleParameter )
                            	    // InternalKEXT.g:2011:3: lv_parameters_14_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
                            	    lv_parameters_14_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_14_0, 
                            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKEXT.g:2032:7: otherlv_16= '()'
                            {
                            otherlv_16=(Token)match(input,36,FollowSets000.FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalKEXT.g:2050:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKEXT.g:2051:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKEXT.g:2052:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:2059:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2062:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKEXT.g:2063:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKEXT.g:2063:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalKEXT.g:2064:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:2077:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalKEXT.g:2096:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKEXT.g:2097:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKEXT.g:2098:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalKEXT.g:2105:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2108:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKEXT.g:2110:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalKEXT.g:2129:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKEXT.g:2130:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKEXT.g:2131:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:2138:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2141:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalKEXT.g:2142:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2142:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalKEXT.g:2143:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2154:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKEXT.g:2154:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalKEXT.g:2154:2: ()
                    // InternalKEXT.g:2155:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKEXT.g:2163:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==67) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalKEXT.g:2163:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalKEXT.g:2163:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalKEXT.g:2164:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalKEXT.g:2164:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalKEXT.g:2165:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_operator_2_0=ruleLogicalOrOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2181:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalKEXT.g:2182:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKEXT.g:2182:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalKEXT.g:2183:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_subExpressions_3_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKEXT.g:2207:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKEXT.g:2208:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKEXT.g:2209:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:2216:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2219:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalKEXT.g:2220:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2220:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalKEXT.g:2221:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2232:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalKEXT.g:2232:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalKEXT.g:2232:2: ()
                    // InternalKEXT.g:2233:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKEXT.g:2241:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==68) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalKEXT.g:2241:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalKEXT.g:2241:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalKEXT.g:2242:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalKEXT.g:2242:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalKEXT.g:2243:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_operator_2_0=ruleLogicalAndOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2259:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalKEXT.g:2260:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKEXT.g:2260:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalKEXT.g:2261:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
                    	    lv_subExpressions_3_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKEXT.g:2285:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKEXT.g:2286:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKEXT.g:2287:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:2294:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2297:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalKEXT.g:2298:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2298:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalKEXT.g:2299:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_42);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2310:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==61) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKEXT.g:2310:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalKEXT.g:2310:2: ()
                    // InternalKEXT.g:2311:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKEXT.g:2319:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==61) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalKEXT.g:2319:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalKEXT.g:2319:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalKEXT.g:2320:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalKEXT.g:2320:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalKEXT.g:2321:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_operator_2_0=ruleBitwiseOrOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2337:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalKEXT.g:2338:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKEXT.g:2338:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalKEXT.g:2339:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_42);
                    	    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKEXT.g:2363:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKEXT.g:2364:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKEXT.g:2365:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:2372:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2375:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalKEXT.g:2376:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalKEXT.g:2376:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalKEXT.g:2377:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2388:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==42) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKEXT.g:2388:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalKEXT.g:2388:2: ()
                    // InternalKEXT.g:2389:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKEXT.g:2397:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==42) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalKEXT.g:2397:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalKEXT.g:2397:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalKEXT.g:2398:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalKEXT.g:2398:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalKEXT.g:2399:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_operator_2_0=ruleBitwiseAndOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2415:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalKEXT.g:2416:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalKEXT.g:2416:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalKEXT.g:2417:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_43);
                    	    lv_subExpressions_3_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKEXT.g:2441:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKEXT.g:2442:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKEXT.g:2443:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalKEXT.g:2450:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2453:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKEXT.g:2454:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKEXT.g:2454:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKEXT.g:2455:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_44);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2466:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalKEXT.g:2466:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKEXT.g:2466:2: ()
                    // InternalKEXT.g:2467:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKEXT.g:2475:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKEXT.g:2476:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKEXT.g:2476:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKEXT.g:2477:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:2493:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKEXT.g:2494:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKEXT.g:2494:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKEXT.g:2495:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotOrValuedExpression");
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKEXT.g:2519:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKEXT.g:2520:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKEXT.g:2521:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalKEXT.g:2528:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2531:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKEXT.g:2532:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKEXT.g:2532:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalKEXT.g:2533:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:2546:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKEXT.g:2565:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKEXT.g:2566:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKEXT.g:2567:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalKEXT.g:2574:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2577:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKEXT.g:2578:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKEXT.g:2578:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==41) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID||LA66_0==RULE_HOSTCODE||LA66_0==RULE_BOOLEAN||LA66_0==29||LA66_0==34||LA66_0==37||LA66_0==60||LA66_0==66) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalKEXT.g:2578:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKEXT.g:2578:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKEXT.g:2578:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKEXT.g:2578:3: ()
                    // InternalKEXT.g:2579:2: 
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

                    // InternalKEXT.g:2587:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKEXT.g:2588:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKEXT.g:2588:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKEXT.g:2589:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:2605:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKEXT.g:2606:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKEXT.g:2606:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKEXT.g:2607:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:2625:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKEXT.g:2644:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKEXT.g:2645:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKEXT.g:2646:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalKEXT.g:2653:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2656:28: (this_AddExpression_0= ruleAddExpression )
            // InternalKEXT.g:2658:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKEXT.g:2677:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKEXT.g:2678:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKEXT.g:2679:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalKEXT.g:2686:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2689:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalKEXT.g:2690:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2690:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalKEXT.g:2691:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_45);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2702:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalKEXT.g:2702:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalKEXT.g:2702:2: ()
                    // InternalKEXT.g:2703:2: 
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

                    // InternalKEXT.g:2711:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==62) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalKEXT.g:2711:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalKEXT.g:2711:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalKEXT.g:2712:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalKEXT.g:2712:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalKEXT.g:2713:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.AddOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2729:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalKEXT.g:2730:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalKEXT.g:2730:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalKEXT.g:2731:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKEXT.g:2755:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKEXT.g:2756:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKEXT.g:2757:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalKEXT.g:2764:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2767:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalKEXT.g:2768:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2768:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalKEXT.g:2769:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_47);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2780:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==45) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalKEXT.g:2780:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalKEXT.g:2780:2: ()
                    // InternalKEXT.g:2781:2: 
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

                    // InternalKEXT.g:2789:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==45) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalKEXT.g:2789:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalKEXT.g:2789:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalKEXT.g:2790:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalKEXT.g:2790:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalKEXT.g:2791:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2807:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalKEXT.g:2808:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalKEXT.g:2808:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalKEXT.g:2809:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKEXT.g:2833:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKEXT.g:2834:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKEXT.g:2835:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalKEXT.g:2842:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2845:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalKEXT.g:2846:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2846:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalKEXT.g:2847:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_48);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2858:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==63) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalKEXT.g:2858:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalKEXT.g:2858:2: ()
                    // InternalKEXT.g:2859:2: 
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

                    // InternalKEXT.g:2867:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==63) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalKEXT.g:2867:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalKEXT.g:2867:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalKEXT.g:2868:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalKEXT.g:2868:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalKEXT.g:2869:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.MultOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2885:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalKEXT.g:2886:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalKEXT.g:2886:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalKEXT.g:2887:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_48);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.DivExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKEXT.g:2911:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKEXT.g:2912:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKEXT.g:2913:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalKEXT.g:2920:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:2923:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalKEXT.g:2924:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalKEXT.g:2924:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalKEXT.g:2925:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_49);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:2936:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalKEXT.g:2936:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalKEXT.g:2936:2: ()
                    // InternalKEXT.g:2937:2: 
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

                    // InternalKEXT.g:2945:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==65) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalKEXT.g:2945:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalKEXT.g:2945:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalKEXT.g:2946:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalKEXT.g:2946:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalKEXT.g:2947:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.DivOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:2963:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalKEXT.g:2964:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalKEXT.g:2964:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalKEXT.g:2965:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_49);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ModExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKEXT.g:2989:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKEXT.g:2990:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKEXT.g:2991:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalKEXT.g:2998:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3001:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalKEXT.g:3002:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalKEXT.g:3002:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalKEXT.g:3003:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_50);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKEXT.g:3014:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==64) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalKEXT.g:3014:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalKEXT.g:3014:2: ()
                    // InternalKEXT.g:3015:2: 
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

                    // InternalKEXT.g:3023:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==64) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalKEXT.g:3023:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalKEXT.g:3023:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalKEXT.g:3024:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalKEXT.g:3024:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalKEXT.g:3025:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ModOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalKEXT.g:3041:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalKEXT.g:3042:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKEXT.g:3042:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalKEXT.g:3043:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKEXT.g:3067:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKEXT.g:3068:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKEXT.g:3069:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalKEXT.g:3076:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3079:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalKEXT.g:3080:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalKEXT.g:3080:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==45) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_BOOLEAN)||LA77_0==29||LA77_0==34||LA77_0==37||LA77_0==60||LA77_0==66) ) {
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
                    // InternalKEXT.g:3080:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKEXT.g:3080:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKEXT.g:3080:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKEXT.g:3080:3: ()
                    // InternalKEXT.g:3081:2: 
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

                    // InternalKEXT.g:3089:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKEXT.g:3090:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKEXT.g:3090:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKEXT.g:3091:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:3107:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKEXT.g:3108:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKEXT.g:3108:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKEXT.g:3109:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:3127:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKEXT.g:3146:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKEXT.g:3147:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKEXT.g:3148:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalKEXT.g:3155:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_TextExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3158:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) )
            // InternalKEXT.g:3159:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            {
            // InternalKEXT.g:3159:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            int alt78=6;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalKEXT.g:3160:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:3173:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:3185:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKEXT.g:3185:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKEXT.g:3185:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEXT.g:3207:2: this_ReferenceCall_5= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_5=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKEXT.g:3220:2: this_FunctionCall_6= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalKEXT.g:3233:2: this_TextExpression_7= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_7=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_7; 
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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalKEXT.g:3252:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKEXT.g:3253:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKEXT.g:3254:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalKEXT.g:3261:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3264:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalKEXT.g:3265:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalKEXT.g:3265:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt79=5;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalKEXT.g:3266:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:3279:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:3292:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKEXT.g:3304:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalKEXT.g:3304:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalKEXT.g:3304:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEXT.g:3326:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalKEXT.g:3345:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKEXT.g:3346:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKEXT.g:3347:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalKEXT.g:3354:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3357:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKEXT.g:3358:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKEXT.g:3358:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==60||LA81_0==66) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_ID) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalKEXT.g:3358:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKEXT.g:3358:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKEXT.g:3358:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKEXT.g:3358:3: ()
                    // InternalKEXT.g:3359:2: 
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

                    // InternalKEXT.g:3367:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKEXT.g:3368:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKEXT.g:3368:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKEXT.g:3369:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKEXT.g:3369:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==60) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==66) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalKEXT.g:3370:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_51);
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
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalKEXT.g:3385:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_51);
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
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKEXT.g:3407:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKEXT.g:3408:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKEXT.g:3408:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKEXT.g:3409:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:3431:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
        }
        return current;
    }
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKEXT.g:3450:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKEXT.g:3451:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKEXT.g:3452:2: iv_rulePrimeID= rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimeID=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimeID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalKEXT.g:3459:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:3462:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKEXT.g:3463:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKEXT.g:3463:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKEXT.g:3463:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKEXT.g:3470:1: (kw= '\\'' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==39) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalKEXT.g:3471:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
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
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKEXT.g:3484:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKEXT.g:3485:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKEXT.g:3486:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalKEXT.g:3493:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subReference_2_0 = null;

        EObject lv_indices_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3496:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) )
            // InternalKEXT.g:3497:1: ( ( ( rulePrimeID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            {
            // InternalKEXT.g:3497:1: ( ( ( rulePrimeID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            // InternalKEXT.g:3497:2: ( ( rulePrimeID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            {
            // InternalKEXT.g:3497:2: ( ( rulePrimeID ) )
            // InternalKEXT.g:3498:1: ( rulePrimeID )
            {
            // InternalKEXT.g:3498:1: ( rulePrimeID )
            // InternalKEXT.g:3499:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_54);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:3515:2: (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==40) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalKEXT.g:3515:4: otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    {
                    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_1_0());
                          
                    }
                    // InternalKEXT.g:3519:1: ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    // InternalKEXT.g:3520:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    {
                    // InternalKEXT.g:3520:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    // InternalKEXT.g:3521:3: lv_subReference_2_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_subReference_2_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_2_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:3537:4: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==30) ) {
                    int LA84_2 = input.LA(2);

                    if ( (synpred95_InternalKEXT()) ) {
                        alt84=1;
                    }


                }


                switch (alt84) {
            	case 1 :
            	    // InternalKEXT.g:3537:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
            	    {
            	    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKEXT.g:3541:1: ( (lv_indices_4_0= ruleExpression ) )
            	    // InternalKEXT.g:3542:1: (lv_indices_4_0= ruleExpression )
            	    {
            	    // InternalKEXT.g:3542:1: (lv_indices_4_0= ruleExpression )
            	    // InternalKEXT.g:3543:3: lv_indices_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_indices_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKEXT.g:3571:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKEXT.g:3572:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKEXT.g:3573:2: iv_ruleReferenceCall= ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCall=ruleReferenceCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalKEXT.g:3580:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3583:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKEXT.g:3584:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKEXT.g:3584:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKEXT.g:3584:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKEXT.g:3584:2: ( ( rulePrimeID ) )
            // InternalKEXT.g:3585:1: ( rulePrimeID )
            {
            // InternalKEXT.g:3585:1: ( rulePrimeID )
            // InternalKEXT.g:3586:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_35);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:3602:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==34) ) {
                alt86=1;
            }
            else if ( (LA86_0==36) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalKEXT.g:3602:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKEXT.g:3602:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKEXT.g:3602:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKEXT.g:3606:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKEXT.g:3607:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKEXT.g:3607:1: (lv_parameters_2_0= ruleParameter )
                    // InternalKEXT.g:3608:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:3624:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==25) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalKEXT.g:3624:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKEXT.g:3628:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKEXT.g:3629:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKEXT.g:3629:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKEXT.g:3630:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_4_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:3651:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                          
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
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKEXT.g:3663:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKEXT.g:3664:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKEXT.g:3665:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKEXT.g:3672:1: ruleFunctionCall returns [EObject current=null] : ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_functionName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3675:28: ( ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) ) )
            // InternalKEXT.g:3676:1: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) )
            {
            // InternalKEXT.g:3676:1: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) | (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==29) ) {
                alt91=1;
            }
            else if ( (LA91_0==37) ) {
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
                    // InternalKEXT.g:3676:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
                    {
                    // InternalKEXT.g:3676:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
                    // InternalKEXT.g:3676:4: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
                    {
                    otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0_0());
                          
                    }
                    // InternalKEXT.g:3680:1: ( (lv_functionName_1_0= RULE_ID ) )
                    // InternalKEXT.g:3681:1: (lv_functionName_1_0= RULE_ID )
                    {
                    // InternalKEXT.g:3681:1: (lv_functionName_1_0= RULE_ID )
                    // InternalKEXT.g:3682:3: lv_functionName_1_0= RULE_ID
                    {
                    lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:3698:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==34) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==36) ) {
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
                            // InternalKEXT.g:3698:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                            {
                            // InternalKEXT.g:3698:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                            // InternalKEXT.g:3698:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_0_2_0_0());
                                  
                            }
                            // InternalKEXT.g:3702:1: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalKEXT.g:3703:1: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalKEXT.g:3703:1: (lv_parameters_3_0= ruleParameter )
                            // InternalKEXT.g:3704:3: lv_parameters_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
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
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKEXT.g:3720:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==25) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // InternalKEXT.g:3720:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_0_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKEXT.g:3724:1: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalKEXT.g:3725:1: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalKEXT.g:3725:1: (lv_parameters_5_0= ruleParameter )
                            	    // InternalKEXT.g:3726:3: lv_parameters_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_0_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
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
                            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_0_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKEXT.g:3747:7: otherlv_7= '()'
                            {
                            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_0_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:3752:6: (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' )
                    {
                    // InternalKEXT.g:3752:6: (otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>' )
                    // InternalKEXT.g:3752:8: otherlv_8= '<' ( (lv_functionName_9_0= RULE_ID ) ) ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' ) otherlv_16= '>'
                    {
                    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // InternalKEXT.g:3756:1: ( (lv_functionName_9_0= RULE_ID ) )
                    // InternalKEXT.g:3757:1: (lv_functionName_9_0= RULE_ID )
                    {
                    // InternalKEXT.g:3757:1: (lv_functionName_9_0= RULE_ID )
                    // InternalKEXT.g:3758:3: lv_functionName_9_0= RULE_ID
                    {
                    lv_functionName_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_9_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_9_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalKEXT.g:3774:2: ( (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' ) | otherlv_15= '()' )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==34) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==36) ) {
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
                            // InternalKEXT.g:3774:3: (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' )
                            {
                            // InternalKEXT.g:3774:3: (otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')' )
                            // InternalKEXT.g:3774:5: otherlv_10= '(' ( (lv_parameters_11_0= ruleParameter ) ) (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )* otherlv_14= ')'
                            {
                            otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_2_0_0());
                                  
                            }
                            // InternalKEXT.g:3778:1: ( (lv_parameters_11_0= ruleParameter ) )
                            // InternalKEXT.g:3779:1: (lv_parameters_11_0= ruleParameter )
                            {
                            // InternalKEXT.g:3779:1: (lv_parameters_11_0= ruleParameter )
                            // InternalKEXT.g:3780:3: lv_parameters_11_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_parameters_11_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_11_0, 
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalKEXT.g:3796:2: (otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==25) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // InternalKEXT.g:3796:4: otherlv_12= ',' ( (lv_parameters_13_0= ruleParameter ) )
                            	    {
                            	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // InternalKEXT.g:3800:1: ( (lv_parameters_13_0= ruleParameter ) )
                            	    // InternalKEXT.g:3801:1: (lv_parameters_13_0= ruleParameter )
                            	    {
                            	    // InternalKEXT.g:3801:1: (lv_parameters_13_0= ruleParameter )
                            	    // InternalKEXT.g:3802:3: lv_parameters_13_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
                            	    lv_parameters_13_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_13_0, 
                            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop89;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_2_0_3());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalKEXT.g:3823:7: otherlv_15= '()'
                            {
                            otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKEXT.g:3839:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKEXT.g:3840:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKEXT.g:3841:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:3848:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:3851:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKEXT.g:3852:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKEXT.g:3852:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKEXT.g:3852:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKEXT.g:3852:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==41) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==42) ) {
                    alt93=1;
                }
            }
            else if ( (LA93_0==42) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalKEXT.g:3852:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKEXT.g:3852:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==41) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalKEXT.g:3853:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKEXT.g:3853:1: (lv_pureOutput_0_0= '!' )
                            // InternalKEXT.g:3854:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,41,FollowSets000.FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_0_0, grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "!");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalKEXT.g:3867:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKEXT.g:3868:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKEXT.g:3868:1: (lv_callByReference_1_0= '&' )
                    // InternalKEXT.g:3869:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,42,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_1_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKEXT.g:3882:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKEXT.g:3883:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKEXT.g:3883:1: (lv_expression_2_0= ruleExpression )
            // InternalKEXT.g:3884:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalKEXT.g:3908:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKEXT.g:3909:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKEXT.g:3910:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalKEXT.g:3917:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:3920:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKEXT.g:3921:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKEXT.g:3921:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKEXT.g:3922:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKEXT.g:3922:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKEXT.g:3923:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKEXT.g:3947:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKEXT.g:3948:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKEXT.g:3949:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalKEXT.g:3956:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:3959:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKEXT.g:3960:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKEXT.g:3960:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKEXT.g:3961:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKEXT.g:3961:1: (lv_value_0_0= RULE_INT )
            // InternalKEXT.g:3962:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
              	    
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalKEXT.g:3986:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKEXT.g:3987:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKEXT.g:3988:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalKEXT.g:3995:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:3998:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKEXT.g:3999:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKEXT.g:3999:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKEXT.g:4000:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKEXT.g:4000:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKEXT.g:4001:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalKEXT.g:4025:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKEXT.g:4026:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKEXT.g:4027:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalKEXT.g:4034:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:4037:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKEXT.g:4038:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKEXT.g:4038:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKEXT.g:4039:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKEXT.g:4039:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKEXT.g:4040:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.BOOLEAN");
              	    
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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalKEXT.g:4064:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKEXT.g:4065:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKEXT.g:4066:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalKEXT.g:4073:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:4076:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKEXT.g:4077:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKEXT.g:4077:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKEXT.g:4078:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKEXT.g:4078:1: (lv_value_0_0= RULE_STRING )
            // InternalKEXT.g:4079:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKEXT.g:4105:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKEXT.g:4106:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKEXT.g:4107:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKEXT.g:4114:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4117:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEXT.g:4118:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEXT.g:4118:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt94=4;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalKEXT.g:4119:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:4132:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKEXT.g:4145:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKEXT.g:4158:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalKEXT.g:4183:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalKEXT.g:4184:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalKEXT.g:4185:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedStringAnnotation=ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalKEXT.g:4192:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4195:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKEXT.g:4196:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKEXT.g:4196:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt95=4;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalKEXT.g:4197:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalKEXT.g:4210:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedKeyStringValueAnnotation_1=ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedKeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKEXT.g:4223:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedTypedKeyStringValueAnnotation_2=ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedTypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKEXT.g:4236:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
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
    // $ANTLR end "ruleQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKEXT.g:4255:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKEXT.g:4256:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKEXT.g:4257:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalKEXT.g:4264:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:4267:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKEXT.g:4268:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKEXT.g:4268:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKEXT.g:4269:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKEXT.g:4269:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKEXT.g:4270:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKEXT.g:4294:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKEXT.g:4295:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKEXT.g:4296:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalKEXT.g:4303:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4306:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEXT.g:4307:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEXT.g:4307:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEXT.g:4307:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4311:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4312:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4312:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4313:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRulePragmaTagAnnotation"
    // InternalKEXT.g:4337:1: entryRulePragmaTagAnnotation returns [EObject current=null] : iv_rulePragmaTagAnnotation= rulePragmaTagAnnotation EOF ;
    public final EObject entryRulePragmaTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTagAnnotation = null;


        try {
            // InternalKEXT.g:4338:2: (iv_rulePragmaTagAnnotation= rulePragmaTagAnnotation EOF )
            // InternalKEXT.g:4339:2: iv_rulePragmaTagAnnotation= rulePragmaTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragmaTagAnnotation=rulePragmaTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePragmaTagAnnotation"


    // $ANTLR start "rulePragmaTagAnnotation"
    // InternalKEXT.g:4346:1: rulePragmaTagAnnotation returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4349:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKEXT.g:4350:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKEXT.g:4350:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKEXT.g:4350:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAnnotationAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKEXT.g:4354:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4355:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4355:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4356:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPragmaTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPragmaTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
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
    // $ANTLR end "rulePragmaTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKEXT.g:4380:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4381:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4382:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalKEXT.g:4389:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4392:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEXT.g:4393:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEXT.g:4393:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEXT.g:4393:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4397:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4398:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4398:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4399:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4415:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEXT.g:4416:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEXT.g:4416:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEXT.g:4417:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4433:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==25) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalKEXT.g:4433:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:4437:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEXT.g:4438:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEXT.g:4438:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEXT.g:4439:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKEXT.g:4463:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4464:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4465:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalKEXT.g:4472:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4475:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEXT.g:4476:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEXT.g:4476:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKEXT.g:4476:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4480:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4481:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4481:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4482:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4498:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKEXT.g:4499:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKEXT.g:4499:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKEXT.g:4500:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4516:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==25) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalKEXT.g:4516:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:4520:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKEXT.g:4521:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKEXT.g:4521:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKEXT.g:4522:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRulePramgaKeyStringValueAnnotation"
    // InternalKEXT.g:4546:1: entryRulePramgaKeyStringValueAnnotation returns [EObject current=null] : iv_rulePramgaKeyStringValueAnnotation= rulePramgaKeyStringValueAnnotation EOF ;
    public final EObject entryRulePramgaKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePramgaKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4547:2: (iv_rulePramgaKeyStringValueAnnotation= rulePramgaKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4548:2: iv_rulePramgaKeyStringValueAnnotation= rulePramgaKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPramgaKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePramgaKeyStringValueAnnotation=rulePramgaKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePramgaKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePramgaKeyStringValueAnnotation"


    // $ANTLR start "rulePramgaKeyStringValueAnnotation"
    // InternalKEXT.g:4555:1: rulePramgaKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject rulePramgaKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4558:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEXT.g:4559:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEXT.g:4559:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKEXT.g:4559:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKEXT.g:4563:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4564:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4564:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4565:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_57);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPramgaKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4581:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKEXT.g:4582:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKEXT.g:4582:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKEXT.g:4583:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPramgaKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4599:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==25) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalKEXT.g:4599:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getPramgaKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:4603:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKEXT.g:4604:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEXT.g:4604:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKEXT.g:4605:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPramgaKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
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
    // $ANTLR end "rulePramgaKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4629:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4630:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4631:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4638:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4641:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKEXT.g:4642:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKEXT.g:4642:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKEXT.g:4642:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4646:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4647:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4647:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4648:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKEXT.g:4668:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEXT.g:4669:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEXT.g:4669:1: (lv_type_3_0= ruleExtendedID )
            // InternalKEXT.g:4670:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_27);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKEXT.g:4690:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKEXT.g:4691:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKEXT.g:4691:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKEXT.g:4692:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_5_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4708:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==25) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalKEXT.g:4708:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKEXT.g:4712:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKEXT.g:4713:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKEXT.g:4713:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKEXT.g:4714:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_7_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4738:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4739:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4740:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4747:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4750:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKEXT.g:4751:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKEXT.g:4751:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKEXT.g:4751:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4755:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4756:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4756:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4757:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKEXT.g:4777:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEXT.g:4778:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEXT.g:4778:1: (lv_type_3_0= ruleExtendedID )
            // InternalKEXT.g:4779:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKEXT.g:4799:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKEXT.g:4800:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKEXT.g:4800:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKEXT.g:4801:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4817:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==25) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalKEXT.g:4817:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKEXT.g:4821:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKEXT.g:4822:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKEXT.g:4822:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKEXT.g:4823:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKEXT.g:4847:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4848:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4849:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalKEXT.g:4856:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4859:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKEXT.g:4860:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKEXT.g:4860:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKEXT.g:4860:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4864:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4865:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4865:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4866:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKEXT.g:4882:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKEXT.g:4883:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKEXT.g:4883:1: (lv_values_2_0= RULE_STRING )
            // InternalKEXT.g:4884:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKEXT.g:4900:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==25) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalKEXT.g:4900:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKEXT.g:4904:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKEXT.g:4905:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKEXT.g:4905:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKEXT.g:4906:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4930:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKEXT.g:4931:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKEXT.g:4932:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalKEXT.g:4939:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:4942:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKEXT.g:4943:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKEXT.g:4943:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKEXT.g:4943:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKEXT.g:4947:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKEXT.g:4948:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKEXT.g:4948:1: (lv_name_1_0= ruleExtendedID )
            // InternalKEXT.g:4949:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKEXT.g:4969:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKEXT.g:4970:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKEXT.g:4970:1: (lv_type_3_0= ruleExtendedID )
            // InternalKEXT.g:4971:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKEXT.g:4991:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKEXT.g:4992:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKEXT.g:4992:1: (lv_values_5_0= RULE_STRING )
            // InternalKEXT.g:4993:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKEXT.g:5009:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==25) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalKEXT.g:5009:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKEXT.g:5013:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKEXT.g:5014:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKEXT.g:5014:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKEXT.g:5015:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKEXT.g:5041:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKEXT.g:5042:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKEXT.g:5043:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalKEXT.g:5050:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:5053:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKEXT.g:5054:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKEXT.g:5054:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt103=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt103=1;
                }
                break;
            case RULE_ID:
                {
                alt103=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt103=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalKEXT.g:5054:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5063:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5074:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                          
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
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKEXT.g:5089:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKEXT.g:5090:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKEXT.g:5091:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalKEXT.g:5098:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKEXT.g:5101:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKEXT.g:5102:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKEXT.g:5102:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt104=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt104=1;
                }
                break;
            case RULE_ID:
                {
                alt104=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt104=3;
                }
                break;
            case 45:
                {
                int LA104_4 = input.LA(2);

                if ( (LA104_4==RULE_INT) ) {
                    alt104=4;
                }
                else if ( (LA104_4==RULE_FLOAT) ) {
                    alt104=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt104=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt104=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalKEXT.g:5102:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5111:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5122:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalKEXT.g:5131:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKEXT.g:5143:5: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Floateger_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKEXT.g:5161:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKEXT.g:5162:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKEXT.g:5163:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalKEXT.g:5170:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:5173:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalKEXT.g:5174:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalKEXT.g:5174:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalKEXT.g:5174:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKEXT.g:5181:1: (kw= '.' this_ID_2= RULE_ID )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==40) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalKEXT.g:5182:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // InternalKEXT.g:5194:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==44) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalKEXT.g:5195:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKEXT.g:5217:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKEXT.g:5218:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKEXT.g:5219:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalKEXT.g:5226:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:5229:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKEXT.g:5230:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKEXT.g:5230:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKEXT.g:5230:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKEXT.g:5230:2: (kw= '-' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==45) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalKEXT.g:5231:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalKEXT.g:5251:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKEXT.g:5252:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKEXT.g:5253:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalKEXT.g:5260:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKEXT.g:5263:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKEXT.g:5264:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKEXT.g:5264:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKEXT.g:5264:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKEXT.g:5264:2: (kw= '-' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==45) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalKEXT.g:5265:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FLOAT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleAssignOperator"
    // InternalKEXT.g:5285:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
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

         enterRule(); 
        try {
            // InternalKEXT.g:5287:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) ) )
            // InternalKEXT.g:5288:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) )
            {
            // InternalKEXT.g:5288:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) )
            int alt109=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt109=1;
                }
                break;
            case 46:
                {
                alt109=2;
                }
                break;
            case 47:
                {
                alt109=3;
                }
                break;
            case 48:
                {
                alt109=4;
                }
                break;
            case 49:
                {
                alt109=5;
                }
                break;
            case 50:
                {
                alt109=6;
                }
                break;
            case 51:
                {
                alt109=7;
                }
                break;
            case 52:
                {
                alt109=8;
                }
                break;
            case 53:
                {
                alt109=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalKEXT.g:5288:2: (enumLiteral_0= '=' )
                    {
                    // InternalKEXT.g:5288:2: (enumLiteral_0= '=' )
                    // InternalKEXT.g:5288:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5294:6: (enumLiteral_1= '+=' )
                    {
                    // InternalKEXT.g:5294:6: (enumLiteral_1= '+=' )
                    // InternalKEXT.g:5294:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5300:6: (enumLiteral_2= '-=' )
                    {
                    // InternalKEXT.g:5300:6: (enumLiteral_2= '-=' )
                    // InternalKEXT.g:5300:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEXT.g:5306:6: (enumLiteral_3= '*=' )
                    {
                    // InternalKEXT.g:5306:6: (enumLiteral_3= '*=' )
                    // InternalKEXT.g:5306:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEXT.g:5312:6: (enumLiteral_4= '/=' )
                    {
                    // InternalKEXT.g:5312:6: (enumLiteral_4= '/=' )
                    // InternalKEXT.g:5312:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEXT.g:5318:6: (enumLiteral_5= '%=' )
                    {
                    // InternalKEXT.g:5318:6: (enumLiteral_5= '%=' )
                    // InternalKEXT.g:5318:8: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEXT.g:5324:6: (enumLiteral_6= '&=' )
                    {
                    // InternalKEXT.g:5324:6: (enumLiteral_6= '&=' )
                    // InternalKEXT.g:5324:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKEXT.g:5330:6: (enumLiteral_7= '|=' )
                    {
                    // InternalKEXT.g:5330:6: (enumLiteral_7= '|=' )
                    // InternalKEXT.g:5330:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKEXT.g:5336:6: (enumLiteral_8= '^=' )
                    {
                    // InternalKEXT.g:5336:6: (enumLiteral_8= '^=' )
                    // InternalKEXT.g:5336:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                          
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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalKEXT.g:5346:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5348:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalKEXT.g:5349:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalKEXT.g:5349:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==54) ) {
                alt110=1;
            }
            else if ( (LA110_0==55) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalKEXT.g:5349:2: (enumLiteral_0= '++' )
                    {
                    // InternalKEXT.g:5349:2: (enumLiteral_0= '++' )
                    // InternalKEXT.g:5349:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5355:6: (enumLiteral_1= '--' )
                    {
                    // InternalKEXT.g:5355:6: (enumLiteral_1= '--' )
                    // InternalKEXT.g:5355:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalKEXT.g:5365:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5367:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKEXT.g:5368:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKEXT.g:5368:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt111=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt111=1;
                }
                break;
            case 37:
                {
                alt111=2;
                }
                break;
            case 57:
                {
                alt111=3;
                }
                break;
            case 38:
                {
                alt111=4;
                }
                break;
            case 58:
                {
                alt111=5;
                }
                break;
            case 59:
                {
                alt111=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalKEXT.g:5368:2: (enumLiteral_0= '==' )
                    {
                    // InternalKEXT.g:5368:2: (enumLiteral_0= '==' )
                    // InternalKEXT.g:5368:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5374:6: (enumLiteral_1= '<' )
                    {
                    // InternalKEXT.g:5374:6: (enumLiteral_1= '<' )
                    // InternalKEXT.g:5374:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5380:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKEXT.g:5380:6: (enumLiteral_2= '<=' )
                    // InternalKEXT.g:5380:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEXT.g:5386:6: (enumLiteral_3= '>' )
                    {
                    // InternalKEXT.g:5386:6: (enumLiteral_3= '>' )
                    // InternalKEXT.g:5386:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEXT.g:5392:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKEXT.g:5392:6: (enumLiteral_4= '>=' )
                    // InternalKEXT.g:5392:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEXT.g:5398:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKEXT.g:5398:6: (enumLiteral_5= '!=' )
                    // InternalKEXT.g:5398:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalKEXT.g:5408:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5410:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKEXT.g:5411:1: (enumLiteral_0= 'pre' )
            {
            // InternalKEXT.g:5411:1: (enumLiteral_0= 'pre' )
            // InternalKEXT.g:5411:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKEXT.g:5421:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5423:28: ( (enumLiteral_0= '|' ) )
            // InternalKEXT.g:5424:1: (enumLiteral_0= '|' )
            {
            // InternalKEXT.g:5424:1: (enumLiteral_0= '|' )
            // InternalKEXT.g:5424:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalKEXT.g:5434:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5436:28: ( (enumLiteral_0= '&' ) )
            // InternalKEXT.g:5437:1: (enumLiteral_0= '&' )
            {
            // InternalKEXT.g:5437:1: (enumLiteral_0= '&' )
            // InternalKEXT.g:5437:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKEXT.g:5447:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5449:28: ( (enumLiteral_0= '!' ) )
            // InternalKEXT.g:5450:1: (enumLiteral_0= '!' )
            {
            // InternalKEXT.g:5450:1: (enumLiteral_0= '!' )
            // InternalKEXT.g:5450:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalKEXT.g:5460:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5462:28: ( (enumLiteral_0= '+' ) )
            // InternalKEXT.g:5463:1: (enumLiteral_0= '+' )
            {
            // InternalKEXT.g:5463:1: (enumLiteral_0= '+' )
            // InternalKEXT.g:5463:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalKEXT.g:5473:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5475:28: ( (enumLiteral_0= '-' ) )
            // InternalKEXT.g:5476:1: (enumLiteral_0= '-' )
            {
            // InternalKEXT.g:5476:1: (enumLiteral_0= '-' )
            // InternalKEXT.g:5476:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalKEXT.g:5486:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5488:28: ( (enumLiteral_0= '*' ) )
            // InternalKEXT.g:5489:1: (enumLiteral_0= '*' )
            {
            // InternalKEXT.g:5489:1: (enumLiteral_0= '*' )
            // InternalKEXT.g:5489:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalKEXT.g:5499:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5501:28: ( (enumLiteral_0= '%' ) )
            // InternalKEXT.g:5502:1: (enumLiteral_0= '%' )
            {
            // InternalKEXT.g:5502:1: (enumLiteral_0= '%' )
            // InternalKEXT.g:5502:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalKEXT.g:5512:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5514:28: ( (enumLiteral_0= '/' ) )
            // InternalKEXT.g:5515:1: (enumLiteral_0= '/' )
            {
            // InternalKEXT.g:5515:1: (enumLiteral_0= '/' )
            // InternalKEXT.g:5515:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalKEXT.g:5525:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5527:28: ( (enumLiteral_0= 'val' ) )
            // InternalKEXT.g:5528:1: (enumLiteral_0= 'val' )
            {
            // InternalKEXT.g:5528:1: (enumLiteral_0= 'val' )
            // InternalKEXT.g:5528:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalKEXT.g:5538:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5540:28: ( (enumLiteral_0= '||' ) )
            // InternalKEXT.g:5541:1: (enumLiteral_0= '||' )
            {
            // InternalKEXT.g:5541:1: (enumLiteral_0= '||' )
            // InternalKEXT.g:5541:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalKEXT.g:5551:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5553:28: ( (enumLiteral_0= '&&' ) )
            // InternalKEXT.g:5554:1: (enumLiteral_0= '&&' )
            {
            // InternalKEXT.g:5554:1: (enumLiteral_0= '&&' )
            // InternalKEXT.g:5554:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalKEXT.g:5568:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // InternalKEXT.g:5570:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalKEXT.g:5571:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalKEXT.g:5571:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt112=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt112=1;
                }
                break;
            case 70:
                {
                alt112=2;
                }
                break;
            case 71:
                {
                alt112=3;
                }
                break;
            case 72:
                {
                alt112=4;
                }
                break;
            case 73:
                {
                alt112=5;
                }
                break;
            case 74:
                {
                alt112=6;
                }
                break;
            case 75:
                {
                alt112=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalKEXT.g:5571:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalKEXT.g:5571:2: (enumLiteral_0= 'pure' )
                    // InternalKEXT.g:5571:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5577:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalKEXT.g:5577:6: (enumLiteral_1= 'bool' )
                    // InternalKEXT.g:5577:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5583:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalKEXT.g:5583:6: (enumLiteral_2= 'unsigned' )
                    // InternalKEXT.g:5583:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEXT.g:5589:6: (enumLiteral_3= 'int' )
                    {
                    // InternalKEXT.g:5589:6: (enumLiteral_3= 'int' )
                    // InternalKEXT.g:5589:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEXT.g:5595:6: (enumLiteral_4= 'float' )
                    {
                    // InternalKEXT.g:5595:6: (enumLiteral_4= 'float' )
                    // InternalKEXT.g:5595:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEXT.g:5601:6: (enumLiteral_5= 'string' )
                    {
                    // InternalKEXT.g:5601:6: (enumLiteral_5= 'string' )
                    // InternalKEXT.g:5601:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEXT.g:5607:6: (enumLiteral_6= 'host' )
                    {
                    // InternalKEXT.g:5607:6: (enumLiteral_6= 'host' )
                    // InternalKEXT.g:5607:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalKEXT.g:5619:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

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
            // InternalKEXT.g:5621:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalKEXT.g:5622:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalKEXT.g:5622:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt113=8;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt113=1;
                }
                break;
            case 62:
                {
                alt113=2;
                }
                break;
            case 63:
                {
                alt113=3;
                }
                break;
            case 77:
                {
                alt113=4;
                }
                break;
            case 78:
                {
                alt113=5;
                }
                break;
            case 61:
                {
                alt113=6;
                }
                break;
            case 42:
                {
                alt113=7;
                }
                break;
            case 75:
                {
                alt113=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalKEXT.g:5622:2: (enumLiteral_0= 'none' )
                    {
                    // InternalKEXT.g:5622:2: (enumLiteral_0= 'none' )
                    // InternalKEXT.g:5622:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKEXT.g:5628:6: (enumLiteral_1= '+' )
                    {
                    // InternalKEXT.g:5628:6: (enumLiteral_1= '+' )
                    // InternalKEXT.g:5628:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKEXT.g:5634:6: (enumLiteral_2= '*' )
                    {
                    // InternalKEXT.g:5634:6: (enumLiteral_2= '*' )
                    // InternalKEXT.g:5634:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKEXT.g:5640:6: (enumLiteral_3= 'max' )
                    {
                    // InternalKEXT.g:5640:6: (enumLiteral_3= 'max' )
                    // InternalKEXT.g:5640:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKEXT.g:5646:6: (enumLiteral_4= 'min' )
                    {
                    // InternalKEXT.g:5646:6: (enumLiteral_4= 'min' )
                    // InternalKEXT.g:5646:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKEXT.g:5652:6: (enumLiteral_5= '|' )
                    {
                    // InternalKEXT.g:5652:6: (enumLiteral_5= '|' )
                    // InternalKEXT.g:5652:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKEXT.g:5658:6: (enumLiteral_6= '&' )
                    {
                    // InternalKEXT.g:5658:6: (enumLiteral_6= '&' )
                    // InternalKEXT.g:5658:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKEXT.g:5664:6: (enumLiteral_7= 'host' )
                    {
                    // InternalKEXT.g:5664:6: (enumLiteral_7= 'host' )
                    // InternalKEXT.g:5664:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        }
        return current;
    }
    // $ANTLR end "ruleCombineOperator"

    // $ANTLR start synpred8_InternalKEXT
    public final void synpred8_InternalKEXT_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalKEXT.g:328:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalKEXT.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalKEXT.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalKEXT.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalKEXT.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalKEXT.g:330:3: lv_expression_0_0= ruleAnnotatedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_expression_0_0=ruleAnnotatedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalKEXT

    // $ANTLR start synpred38_InternalKEXT
    public final void synpred38_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalKEXT.g:1300:2: (this_Assignment_0= ruleAssignment )
        // InternalKEXT.g:1300:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalKEXT

    // $ANTLR start synpred39_InternalKEXT
    public final void synpred39_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalKEXT.g:1313:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalKEXT.g:1313:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalKEXT

    // $ANTLR start synpred40_InternalKEXT
    public final void synpred40_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalKEXT.g:1326:2: (this_Emission_2= ruleEmission )
        // InternalKEXT.g:1326:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalKEXT

    // $ANTLR start synpred41_InternalKEXT
    public final void synpred41_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalKEXT.g:1339:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalKEXT.g:1339:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalKEXT

    // $ANTLR start synpred42_InternalKEXT
    public final void synpred42_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_ReferenceCallEffect_4 = null;


        // InternalKEXT.g:1352:2: (this_ReferenceCallEffect_4= ruleReferenceCallEffect )
        // InternalKEXT.g:1352:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ReferenceCallEffect_4=ruleReferenceCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalKEXT

    // $ANTLR start synpred59_InternalKEXT
    public final void synpred59_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKEXT.g:2064:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKEXT.g:2064:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalKEXT

    // $ANTLR start synpred68_InternalKEXT
    public final void synpred68_InternalKEXT_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalKEXT.g:2466:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // InternalKEXT.g:2466:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // InternalKEXT.g:2466:2: ()
        // InternalKEXT.g:2467:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKEXT.g:2475:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // InternalKEXT.g:2476:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // InternalKEXT.g:2476:1: (lv_operator_2_0= ruleCompareOperator )
        // InternalKEXT.g:2477:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_12);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKEXT.g:2493:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // InternalKEXT.g:2494:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // InternalKEXT.g:2494:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // InternalKEXT.g:2495:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred68_InternalKEXT

    // $ANTLR start synpred69_InternalKEXT
    public final void synpred69_InternalKEXT_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKEXT.g:2533:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKEXT.g:2533:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalKEXT

    // $ANTLR start synpred90_InternalKEXT
    public final void synpred90_InternalKEXT_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalKEXT.g:3304:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalKEXT.g:3304:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalKEXT.g:3304:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalKEXT.g:3304:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_46); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_31);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred90_InternalKEXT

    // $ANTLR start synpred95_InternalKEXT
    public final void synpred95_InternalKEXT_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_indices_4_0 = null;


        // InternalKEXT.g:3537:6: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )
        // InternalKEXT.g:3537:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
        {
        otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalKEXT.g:3541:1: ( (lv_indices_4_0= ruleExpression ) )
        // InternalKEXT.g:3542:1: (lv_indices_4_0= ruleExpression )
        {
        // InternalKEXT.g:3542:1: (lv_indices_4_0= ruleExpression )
        // InternalKEXT.g:3543:3: lv_indices_4_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_27);
        lv_indices_4_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_InternalKEXT

    // Delegated rules

    public final boolean synpred39_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalKEXT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalKEXT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String dfa_1s = "\121\uffff";
    static final String dfa_2s = "\1\3\12\uffff\1\3\105\uffff";
    static final String dfa_3s = "\3\4\1\uffff\1\4\1\uffff\2\4\1\6\4\4\1\6\4\4\1\37\2\4\1\6\4\4\1\6\4\4\1\6\6\4\2\37\3\4\1\6\3\4\1\6\1\4\1\6\5\4\1\6\5\4\1\37\3\4\1\6\6\4\1\6\2\4\1\6\2\37\3\4";
    static final String dfa_4s = "\2\113\1\4\1\uffff\1\5\1\uffff\1\113\1\4\1\6\1\4\3\113\1\10\4\113\1\54\1\55\1\4\1\6\1\55\1\113\2\4\1\6\1\55\3\113\1\10\6\113\1\54\1\37\3\113\1\10\2\113\1\4\1\6\1\4\1\6\2\113\1\4\1\55\1\4\1\6\1\55\4\113\1\54\3\113\1\10\5\113\1\4\1\6\1\55\1\4\1\6\1\54\1\37\3\113";
    static final String dfa_5s = "\3\uffff\1\2\1\uffff\1\1\113\uffff";
    static final String dfa_6s = "\121\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\5\uffff\1\3\2\uffff\1\3\5\5\3\uffff\1\5\1\4\7\uffff\1\3\5\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5",
            "",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\11\uffff\1\7\2\uffff\1\2\1\10\1\15\27\uffff\7\5",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\5\uffff\1\3\2\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\24\2\uffff\1\2\1\25\1\uffff\12\3\15\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\16\1\uffff\1\17",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\11\uffff\1\7\2\uffff\1\2\1\10\1\15\27\uffff\7\5",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\14\uffff\1\2\1\uffff\1\15\27\uffff\7\5",
            "\1\33\10\uffff\1\31\3\uffff\1\32",
            "\1\35\1\34\1\40\1\uffff\1\41\1\36\43\uffff\1\37",
            "\1\42",
            "\1\43",
            "\1\35\1\44\1\40\1\uffff\1\41\1\36\43\uffff\1\37",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\1\50\1\54\1\uffff\1\55\1\52\43\uffff\1\53",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\56\2\uffff\1\30\1\57\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\40\1\uffff\1\41",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\24\2\uffff\1\30\1\25\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\63\1\62\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\64\11\uffff\1\60\2\uffff\1\30\1\61\1\15\27\uffff\7\5",
            "\1\33\10\uffff\1\31\3\uffff\1\32",
            "\1\33",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\65\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\66\2\uffff\1\30\1\67\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\54\1\uffff\1\55",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\24\2\uffff\1\30\1\25\1\uffff\12\3\15\uffff\7\5",
            "\1\75",
            "\1\77\1\76\1\102\1\uffff\1\103\1\100\43\uffff\1\101",
            "\1\104",
            "\1\105",
            "\1\77\1\106\1\102\1\uffff\1\103\1\100\43\uffff\1\101",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\56\2\uffff\1\30\1\57\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\63\1\62\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\64\11\uffff\1\60\2\uffff\1\30\1\61\1\15\27\uffff\7\5",
            "\1\63\1\62\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\64\14\uffff\1\30\1\uffff\1\15\27\uffff\7\5",
            "\1\111\10\uffff\1\107\3\uffff\1\110",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\65\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\112\2\uffff\1\30\1\113\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\102\1\uffff\1\103",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\66\2\uffff\1\30\1\67\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\114",
            "\1\115",
            "\1\51\1\116\1\54\1\uffff\1\55\1\52\43\uffff\1\53",
            "\1\117",
            "\1\120",
            "\1\111\10\uffff\1\107\3\uffff\1\110",
            "\1\111",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\112\2\uffff\1\30\1\113\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 135:2: ( (lv_declarations_1_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_8s = "\2\113\1\4\1\uffff\1\5\1\uffff\1\113\1\4\1\6\1\4\3\113\1\10\4\113\1\54\1\55\1\4\1\6\1\55\1\113\2\4\1\6\1\55\3\113\1\10\6\113\1\54\1\37\3\113\1\10\2\113\1\4\1\6\1\4\1\6\1\4\2\113\1\55\1\4\1\6\1\55\4\113\1\54\3\113\1\10\5\113\1\4\1\6\1\55\1\4\1\6\1\54\1\37\3\113";
    static final String[] dfa_9s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\5\uffff\1\3\1\uffff\2\3\5\5\3\uffff\1\5\1\4\7\uffff\1\3\5\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5",
            "",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\11\uffff\1\7\2\uffff\1\2\1\10\1\15\27\uffff\7\5",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\1\5\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\24\2\uffff\1\2\1\25\1\uffff\12\3\15\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\16\1\uffff\1\17",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\11\uffff\1\7\2\uffff\1\2\1\10\1\15\27\uffff\7\5",
            "\1\13\1\12\1\16\1\3\1\17\1\14\1\1\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\11\14\uffff\1\2\1\uffff\1\15\27\uffff\7\5",
            "\1\33\10\uffff\1\31\3\uffff\1\32",
            "\1\35\1\34\1\40\1\uffff\1\41\1\36\43\uffff\1\37",
            "\1\42",
            "\1\43",
            "\1\35\1\44\1\40\1\uffff\1\41\1\36\43\uffff\1\37",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\1\50\1\54\1\uffff\1\55\1\52\43\uffff\1\53",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\56\2\uffff\1\30\1\57\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\40\1\uffff\1\41",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\24\2\uffff\1\30\1\25\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\63\1\64\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\62\11\uffff\1\60\2\uffff\1\30\1\61\1\15\27\uffff\7\5",
            "\1\33\10\uffff\1\31\3\uffff\1\32",
            "\1\33",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\65\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\66\2\uffff\1\30\1\67\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\54\1\uffff\1\55",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\24\2\uffff\1\30\1\25\1\uffff\12\3\15\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\77\1\76\1\102\1\uffff\1\103\1\100\43\uffff\1\101",
            "\1\104",
            "\1\105",
            "\1\77\1\106\1\102\1\uffff\1\103\1\100\43\uffff\1\101",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\12\uffff\1\56\2\uffff\1\30\1\57\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\63\1\64\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\62\11\uffff\1\60\2\uffff\1\30\1\61\1\15\27\uffff\7\5",
            "\1\63\1\64\1\16\1\3\1\17\1\14\1\27\10\uffff\1\3\5\5\3\uffff\1\5\1\4\1\62\14\uffff\1\30\1\uffff\1\15\27\uffff\7\5",
            "\1\111\10\uffff\1\107\3\uffff\1\110",
            "\1\3\2\uffff\1\3\2\uffff\1\1\10\uffff\1\3\5\5\1\65\2\uffff\1\5\1\4\15\uffff\1\2\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\112\2\uffff\1\30\1\113\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\102\1\uffff\1\103",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\66\2\uffff\1\30\1\67\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\114",
            "\1\115",
            "\1\51\1\116\1\54\1\uffff\1\55\1\52\43\uffff\1\53",
            "\1\117",
            "\1\120",
            "\1\111\10\uffff\1\107\3\uffff\1\110",
            "\1\111",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\12\uffff\1\112\2\uffff\1\30\1\113\30\uffff\7\5",
            "\1\3\2\uffff\1\3\2\uffff\1\27\10\uffff\1\3\5\5\1\70\2\uffff\1\5\1\4\15\uffff\1\30\31\uffff\7\5"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 245:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_10s = "\120\uffff";
    static final String dfa_11s = "\3\4\2\uffff\2\4\1\6\1\0\2\4\1\6\11\4\1\37\3\4\1\6\5\4\1\6\2\4\1\6\1\4\1\6\3\4\2\37\3\4\1\6\7\4\1\6\1\37\2\4\1\6\4\4\1\6\4\4\1\6\5\4\2\37\2\4\1\6\2\4";
    static final String dfa_12s = "\2\53\1\4\2\uffff\1\55\1\4\1\6\1\0\2\53\1\10\2\53\1\4\4\55\1\53\1\4\1\54\1\53\1\54\1\53\1\10\3\53\1\55\1\4\1\6\1\55\1\4\1\6\1\4\1\6\1\67\1\53\1\4\1\54\1\37\1\53\1\54\1\53\1\10\2\53\1\54\1\53\2\55\1\4\1\6\1\54\1\55\1\4\1\6\1\55\1\54\1\53\1\4\1\6\1\55\1\53\1\54\1\53\1\10\2\53\1\54\2\53\1\54\1\37\1\53\1\4\1\6\1\54\1\53";
    static final String dfa_13s = "\3\uffff\1\1\1\2\113\uffff";
    static final String dfa_14s = "\10\uffff\1\0\107\uffff}>";
    static final String[] dfa_15s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\11\uffff\1\4\7\uffff\1\4\5\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\11\uffff\1\4\15\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\10\1\11\1\14\1\4\1\15\1\12\1\1\10\uffff\1\3\11\uffff\1\4\1\16\11\uffff\1\6\2\uffff\1\2\1\7\1\13",
            "\1\17",
            "\1\20",
            "\1\uffff",
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\5\uffff\1\21\3\uffff\1\4\15\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\14\1\uffff\1\15",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\25",
            "\1\10\1\11\1\14\1\4\1\15\1\12\1\1\10\uffff\1\3\11\uffff\1\4\1\16\11\uffff\1\6\2\uffff\1\2\1\7\1\13",
            "\1\10\1\11\1\14\1\4\1\15\1\12\1\1\10\uffff\1\3\11\uffff\1\4\1\16\14\uffff\1\2\1\uffff\1\13",
            "\1\27\1\26\1\32\1\uffff\1\33\1\30\43\uffff\1\31",
            "\1\27\1\34\1\32\1\uffff\1\33\1\30\43\uffff\1\31",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\11\uffff\1\4\15\uffff\1\24",
            "\1\35",
            "\1\40\10\uffff\1\36\3\uffff\1\37",
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\5\uffff\1\21\3\uffff\1\4\15\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\12\uffff\1\41\2\uffff\1\24\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\32\1\uffff\1\33",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\45\1\46\1\14\1\4\1\15\1\12\1\23\10\uffff\1\3\11\uffff\1\4\1\47\11\uffff\1\43\2\uffff\1\24\1\44\1\13",
            "\1\50",
            "\1\51",
            "\1\53\1\52\1\56\1\uffff\1\57\1\54\43\uffff\1\55",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\64\2\uffff\1\24\1\65\1\uffff\12\4",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\66",
            "\1\40\10\uffff\1\36\3\uffff\1\37",
            "\1\40",
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\5\uffff\1\67\3\uffff\1\4\15\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\12\uffff\1\70\2\uffff\1\24\1\71",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\56\1\uffff\1\57",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\12\uffff\1\41\2\uffff\1\24\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\45\1\46\1\14\1\4\1\15\1\12\1\23\10\uffff\1\3\11\uffff\1\4\1\47\11\uffff\1\43\2\uffff\1\24\1\44\1\13",
            "\1\45\1\46\1\14\1\4\1\15\1\12\1\23\10\uffff\1\3\11\uffff\1\4\1\47\14\uffff\1\24\1\uffff\1\13",
            "\1\73",
            "\1\74",
            "\1\77\10\uffff\1\75\3\uffff\1\76",
            "\1\101\1\100\1\104\1\uffff\1\105\1\102\43\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\101\1\110\1\104\1\uffff\1\105\1\102\43\uffff\1\103",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\12\uffff\1\64\2\uffff\1\24\1\65",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\22\3\uffff\1\4\15\uffff\1\24",
            "\1\111",
            "\1\112",
            "\1\53\1\113\1\56\1\uffff\1\57\1\54\43\uffff\1\55",
            "\1\4\2\uffff\1\4\2\uffff\1\1\10\uffff\1\3\5\uffff\1\67\3\uffff\1\4\15\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\12\uffff\1\114\2\uffff\1\24\1\115",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\104\1\uffff\1\105",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\12\uffff\1\70\2\uffff\1\24\1\71",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\77\10\uffff\1\75\3\uffff\1\76",
            "\1\77",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24",
            "\1\116",
            "\1\117",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\12\uffff\1\114\2\uffff\1\24\1\115",
            "\1\4\2\uffff\1\4\2\uffff\1\23\10\uffff\1\3\5\uffff\1\72\3\uffff\1\4\15\uffff\1\24"
    };

    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_10;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKEXT()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_16s = "\73\uffff";
    static final String dfa_17s = "\2\12\1\4\2\uffff\2\4\1\6\3\12\1\6\2\12\5\4\1\6\1\37\3\12\1\6\4\12\1\4\1\6\2\4\1\6\2\37\3\12\1\6\4\12\2\4\1\6\3\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_18s = "\2\113\1\4\2\uffff\1\113\1\4\1\6\3\113\1\10\2\113\1\4\2\113\1\55\1\4\1\6\1\54\3\113\1\10\4\113\1\4\1\6\1\55\1\4\1\6\1\54\1\37\3\113\1\10\4\113\1\55\1\4\1\6\3\113\1\10\4\113\1\4\1\6\2\113";
    static final String dfa_19s = "\3\uffff\1\1\1\2\66\uffff";
    static final String dfa_20s = "\73\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\11\uffff\5\3\3\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\3\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\11\uffff\5\3\3\uffff\2\4\1\16\11\uffff\1\6\2\uffff\1\2\1\7\1\13\27\uffff\7\3",
            "\1\17",
            "\1\20",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\12\uffff\1\22\2\uffff\1\2\1\23\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\14\1\uffff\1\15",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\24",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\11\uffff\5\3\3\uffff\2\4\1\16\11\uffff\1\6\2\uffff\1\2\1\7\1\13\27\uffff\7\3",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\11\uffff\5\3\3\uffff\2\4\1\16\14\uffff\1\2\1\uffff\1\13\27\uffff\7\3",
            "\1\26\1\25\1\31\1\uffff\1\32\1\27\43\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\37\10\uffff\1\35\3\uffff\1\36",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\12\uffff\1\40\2\uffff\1\2\1\41\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\31\1\uffff\1\32",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\12\uffff\1\22\2\uffff\1\2\1\23\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\42",
            "\1\43",
            "\1\45\1\44\1\50\1\uffff\1\51\1\46\43\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\37\10\uffff\1\35\3\uffff\1\36",
            "\1\37",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\12\uffff\1\55\2\uffff\1\2\1\56\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\50\1\uffff\1\51",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\12\uffff\1\40\2\uffff\1\2\1\41\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\21\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\43\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\12\uffff\1\67\2\uffff\1\2\1\70\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\63\1\uffff\1\64",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\12\uffff\1\55\2\uffff\1\2\1\56\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3",
            "\1\71",
            "\1\72",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\12\uffff\1\67\2\uffff\1\2\1\70\30\uffff\7\3",
            "\1\1\11\uffff\5\3\1\54\2\uffff\2\4\15\uffff\1\2\31\uffff\7\3"
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )";
        }
    }
    static final String dfa_22s = "\13\uffff";
    static final String dfa_23s = "\1\4\3\0\7\uffff";
    static final String dfa_24s = "\1\53\3\0\7\uffff";
    static final String dfa_25s = "\4\uffff\1\4\1\6\1\uffff\1\1\1\2\1\3\1\5";
    static final String dfa_26s = "\1\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] dfa_27s = {
            "\1\3\2\uffff\1\4\2\uffff\1\1\22\uffff\1\5\7\uffff\1\5\5\uffff\1\2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1299:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 7;}

                        else if ( (synpred39_InternalKEXT()) ) {s = 8;}

                        else if ( (synpred40_InternalKEXT()) ) {s = 9;}

                        else if ( (synpred41_InternalKEXT()) ) {s = 4;}

                        else if ( (synpred42_InternalKEXT()) ) {s = 10;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 7;}

                        else if ( (synpred39_InternalKEXT()) ) {s = 8;}

                        else if ( (synpred40_InternalKEXT()) ) {s = 9;}

                        else if ( (synpred41_InternalKEXT()) ) {s = 4;}

                        else if ( (synpred42_InternalKEXT()) ) {s = 10;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKEXT()) ) {s = 7;}

                        else if ( (synpred39_InternalKEXT()) ) {s = 8;}

                        else if ( (synpred40_InternalKEXT()) ) {s = 9;}

                        else if ( (synpred42_InternalKEXT()) ) {s = 10;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\17\uffff";
    static final String dfa_29s = "\1\4\14\0\2\uffff";
    static final String dfa_30s = "\1\102\14\0\2\uffff";
    static final String dfa_31s = "\15\uffff\1\1\1\2";
    static final String dfa_32s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_33s = {
            "\1\11\1\4\1\2\1\14\1\3\1\6\23\uffff\1\12\4\uffff\1\5\2\uffff\1\13\3\uffff\1\15\3\uffff\1\1\16\uffff\1\7\5\uffff\1\10",
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
            ""
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "2063:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKEXT()) ) {s = 13;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\31\uffff";
    static final String dfa_35s = "\1\7\30\uffff";
    static final String dfa_36s = "\1\4\1\uffff\1\0\26\uffff";
    static final String dfa_37s = "\1\104\1\uffff\1\0\26\uffff";
    static final String dfa_38s = "\1\uffff\1\1\5\uffff\1\2\21\uffff";
    static final String dfa_39s = "\2\uffff\1\0\26\uffff}>";
    static final String[] dfa_40s = {
            "\1\7\2\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\uffff\2\7\5\uffff\2\7\2\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\2\1\1\3\uffff\2\7\14\uffff\4\1\1\uffff\1\7\5\uffff\2\7",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "2466:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\16\uffff";
    static final String dfa_42s = "\1\4\4\uffff\10\0\1\uffff";
    static final String dfa_43s = "\1\102\4\uffff\10\0\1\uffff";
    static final String dfa_44s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_45s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] dfa_46s = {
            "\1\11\2\1\1\14\1\1\1\6\23\uffff\1\12\4\uffff\1\5\2\uffff\1\13\3\uffff\1\15\3\uffff\1\1\16\uffff\1\7\5\uffff\1\10",
            "",
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

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "2532:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_5 = input.LA(1);

                         
                        int index65_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_6 = input.LA(1);

                         
                        int index65_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_7 = input.LA(1);

                         
                        int index65_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA65_8 = input.LA(1);

                         
                        int index65_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA65_9 = input.LA(1);

                         
                        int index65_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA65_10 = input.LA(1);

                         
                        int index65_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA65_11 = input.LA(1);

                         
                        int index65_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA65_12 = input.LA(1);

                         
                        int index65_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalKEXT()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index65_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_47s = "\11\uffff";
    static final String dfa_48s = "\3\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String dfa_49s = "\1\4\2\uffff\1\4\3\uffff\1\4\1\uffff";
    static final String dfa_50s = "\1\102\2\uffff\1\104\3\uffff\1\104\1\uffff";
    static final String dfa_51s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\uffff\1\4";
    static final String dfa_52s = "\11\uffff}>";
    static final String[] dfa_53s = {
            "\1\3\2\uffff\1\6\1\uffff\1\1\23\uffff\1\5\4\uffff\1\4\2\uffff\1\5\26\uffff\1\2\5\uffff\1\2",
            "",
            "",
            "\1\2\2\uffff\1\2\2\uffff\1\2\5\uffff\1\2\1\uffff\2\2\5\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\10\1\2\1\10\2\2\1\7\1\2\1\uffff\2\2\1\uffff\1\2\12\uffff\4\2\1\uffff\5\2\1\uffff\2\2",
            "",
            "",
            "",
            "\1\2\2\uffff\1\2\2\uffff\1\2\5\uffff\1\2\1\uffff\2\2\5\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\10\1\2\1\10\2\2\1\7\1\2\1\uffff\2\2\1\uffff\1\2\12\uffff\4\2\1\uffff\5\2\1\uffff\2\2",
            ""
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_47;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "3159:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )";
        }
    }
    static final String dfa_54s = "\15\uffff";
    static final String dfa_55s = "\1\4\3\uffff\1\0\10\uffff";
    static final String dfa_56s = "\1\102\3\uffff\1\0\10\uffff";
    static final String dfa_57s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\6\uffff\1\4";
    static final String dfa_58s = "\4\uffff\1\0\10\uffff}>";
    static final String[] dfa_59s = {
            "\1\5\1\3\1\1\1\5\1\2\1\5\23\uffff\1\5\4\uffff\1\4\2\uffff\1\5\26\uffff\1\5\5\uffff\1\5",
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
            ""
    };

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_54;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "3265:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred90_InternalKEXT()) ) {s = 12;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_60s = "\14\uffff";
    static final String dfa_61s = "\3\uffff\1\11\4\uffff\1\7\1\uffff\2\11";
    static final String dfa_62s = "\1\12\1\uffff\3\4\1\6\2\uffff\1\4\1\uffff\2\4";
    static final String dfa_63s = "\1\53\1\uffff\1\4\1\113\1\4\1\6\2\uffff\1\113\1\uffff\2\113";
    static final String dfa_64s = "\1\uffff\1\1\4\uffff\1\3\1\2\1\uffff\1\4\2\uffff";
    static final String dfa_65s = "\14\uffff}>";
    static final String[] dfa_66s = {
            "\1\1\40\uffff\1\2",
            "",
            "\1\3",
            "\1\10\2\7\1\11\2\7\1\11\10\uffff\6\11\3\uffff\2\11\1\6\11\uffff\1\4\2\uffff\1\11\1\5\1\7\27\uffff\7\11",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\7\2\uffff\1\7\2\uffff\1\7\10\uffff\7\7\2\uffff\2\7\1\11\1\uffff\1\11\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\7\2\uffff\2\7\1\uffff\12\11\15\uffff\7\7",
            "",
            "\1\10\2\7\1\11\2\7\1\11\10\uffff\6\11\3\uffff\2\11\1\6\11\uffff\1\4\2\uffff\1\11\1\5\1\7\27\uffff\7\11",
            "\1\10\2\7\1\11\2\7\1\11\10\uffff\6\11\3\uffff\2\11\1\6\14\uffff\1\11\1\uffff\1\7\27\uffff\7\11"
    };

    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[][] dfa_66 = unpackEncodedStringArray(dfa_66s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_60;
            this.eof = dfa_61;
            this.min = dfa_62;
            this.max = dfa_63;
            this.accept = dfa_64;
            this.special = dfa_65;
            this.transition = dfa_66;
        }
        public String getDescription() {
            return "4118:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_67s = "\3\uffff\1\7\5\uffff\2\7";
    static final String dfa_68s = "\1\12\1\uffff\3\4\1\6\3\uffff\2\4";
    static final String dfa_69s = "\1\53\1\uffff\1\4\1\54\1\4\1\6\3\uffff\1\54\1\53";
    static final String dfa_70s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\2\2\uffff";
    static final String dfa_71s = "\13\uffff}>";
    static final String[] dfa_72s = {
            "\1\1\40\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\10\4\uffff\1\7\23\uffff\1\6\11\uffff\1\4\2\uffff\1\7\1\5",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\7\1\10\4\uffff\1\7\23\uffff\1\6\11\uffff\1\4\2\uffff\1\7\1\5",
            "\1\7\1\10\4\uffff\1\7\23\uffff\1\6\14\uffff\1\7"
    };
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_22;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "4196:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000082031F90492L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000082020090492L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000082031FD0490L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000820200D0490L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000080400L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x10002A24200007F0L,0x0000000000000004L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080001F00400L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E00000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000410L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080030000400L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000340000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xE000040000000000L,0x0000000000007800L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x003FC00140000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00C0000040000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000480L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x10002E24200007F0L,0x0000000000000004L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000802000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080020000400L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0F00006000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x10002824200007F0L,0x0000000000000004L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000080000000410L,0x0000000000000004L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010040000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000000370L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000110000000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000100L});
    }


}