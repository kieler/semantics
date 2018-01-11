package de.cau.cs.kieler.kexpressions.kext.parser.antlr.internal; 

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
import de.cau.cs.kieler.kexpressions.kext.services.KExtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_SL_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'scope'", "'{'", "'}'", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "';'", "':'", "'ref'", "'extern'", "'schedule'", "'global'", "'['", "']'", "'='", "'combine'", "'('", "')'", "'call'", "'()'", "'print'", "'randomize'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'\\''", "'.'", "'random'", "'!'", "'_'", "'@'", "'#'", "'conflict'", "'confluent'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'min='", "'max='", "'++'", "'--'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
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
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalKExtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKExtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKExtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKExt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KExtGrammarAccess grammarAccess;
     	
        public InternalKExtParser(TokenStream input, KExtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Kext";	
       	}
       	
       	@Override
       	protected KExtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKext"
    // InternalKExt.g:74:1: entryRuleKext returns [EObject current=null] : iv_ruleKext= ruleKext EOF ;
    public final EObject entryRuleKext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKext = null;


        try {
            // InternalKExt.g:75:2: (iv_ruleKext= ruleKext EOF )
            // InternalKExt.g:76:2: iv_ruleKext= ruleKext EOF
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
    // InternalKExt.g:83:1: ruleKext returns [EObject current=null] : ( (lv_scopes_0_0= ruleRootScope ) ) ;
    public final EObject ruleKext() throws RecognitionException {
        EObject current = null;

        EObject lv_scopes_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:86:28: ( ( (lv_scopes_0_0= ruleRootScope ) ) )
            // InternalKExt.g:87:1: ( (lv_scopes_0_0= ruleRootScope ) )
            {
            // InternalKExt.g:87:1: ( (lv_scopes_0_0= ruleRootScope ) )
            // InternalKExt.g:88:1: (lv_scopes_0_0= ruleRootScope )
            {
            // InternalKExt.g:88:1: (lv_scopes_0_0= ruleRootScope )
            // InternalKExt.g:89:3: lv_scopes_0_0= ruleRootScope
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.RootScope");
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
    // InternalKExt.g:113:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootScope = null;


        try {
            // InternalKExt.g:114:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalKExt.g:115:2: iv_ruleRootScope= ruleRootScope EOF
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
    // InternalKExt.g:122:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:125:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalKExt.g:126:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalKExt.g:126:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalKExt.g:126:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalKExt.g:126:2: ()
            // InternalKExt.g:127:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKExt.g:135:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalKExt.g:136:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalKExt.g:136:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalKExt.g:137:3: lv_declarations_1_0= ruleDeclaration
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKExt.g:153:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_HOSTCODE||LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==20||LA2_0==30||LA2_0==39||(LA2_0>=41 && LA2_0<=42)||LA2_0==61) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKExt.g:154:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalKExt.g:154:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalKExt.g:155:3: lv_entities_2_0= ruleTestEntity
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKExt.g:171:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKExt.g:171:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:175:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalKExt.g:176:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalKExt.g:176:1: (lv_scopes_4_0= ruleScope )
            	    // InternalKExt.g:177:3: lv_scopes_4_0= ruleScope
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
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
    // InternalKExt.g:201:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalKExt.g:202:2: (iv_ruleScope= ruleScope EOF )
            // InternalKExt.g:203:2: iv_ruleScope= ruleScope EOF
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
    // InternalKExt.g:210:1: ruleScope returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:213:28: ( ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalKExt.g:214:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalKExt.g:214:1: ( () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalKExt.g:214:2: () ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalKExt.g:214:2: ()
            // InternalKExt.g:215:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeAccess().getKExtScopeAction_0(),
                          current);
                  
            }

            }

            // InternalKExt.g:223:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKExt.g:224:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalKExt.g:224:1: (lv_name_1_0= RULE_ID )
                    // InternalKExt.g:225:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKExt.g:245:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalKExt.g:246:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalKExt.g:246:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalKExt.g:247:3: lv_declarations_3_0= ruleDeclaration
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalKExt.g:263:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_HOSTCODE||LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==20||LA6_0==30||LA6_0==39||(LA6_0>=41 && LA6_0<=42)||LA6_0==61) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKExt.g:264:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalKExt.g:264:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalKExt.g:265:3: lv_entities_4_0= ruleTestEntity
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalKExt.g:281:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKExt.g:281:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalKExt.g:285:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalKExt.g:286:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalKExt.g:286:1: (lv_scopes_6_0= ruleScope )
            	    // InternalKExt.g:287:3: lv_scopes_6_0= ruleScope
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Scope");
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

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:315:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalKExt.g:316:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalKExt.g:317:2: iv_ruleTestEntity= ruleTestEntity EOF
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
    // InternalKExt.g:324:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:327:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalKExt.g:328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalKExt.g:328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalKExt.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalKExt.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalKExt.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalKExt.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalKExt.g:330:3: lv_expression_0_0= ruleAnnotatedExpression
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
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:347:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalKExt.g:347:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalKExt.g:348:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalKExt.g:348:1: (lv_effect_1_0= ruleEffect )
                    // InternalKExt.g:349:3: lv_effect_1_0= ruleEffect
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
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
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
    // InternalKExt.g:373:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalKExt.g:374:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalKExt.g:375:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
    // InternalKExt.g:382:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:385:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKExt.g:386:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKExt.g:386:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKExt.g:386:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKExt.g:386:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==61) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKExt.g:387:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:387:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:388:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalKExt.g:408:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKExt.g:409:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKExt.g:409:1: (lv_expression_2_0= ruleExpression )
            // InternalKExt.g:410:3: lv_expression_2_0= ruleExpression
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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
    // InternalKExt.g:434:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalKExt.g:435:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalKExt.g:436:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalKExt.g:443:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;

        EObject this_ScheduleDeclaration_2 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:446:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration ) )
            // InternalKExt.g:447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            {
            // InternalKExt.g:447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalKExt.g:448:2: this_VariableDeclaration_0= ruleVariableDeclaration
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
                    // InternalKExt.g:461:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
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
                case 3 :
                    // InternalKExt.g:474:2: this_ScheduleDeclaration_2= ruleScheduleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getScheduleDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ScheduleDeclaration_2=ruleScheduleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScheduleDeclaration_2; 
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
    // InternalKExt.g:495:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalKExt.g:496:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalKExt.g:497:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalKExt.g:504:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) ;
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

        EObject lv_annotations_12_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:507:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:508:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:508:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:508:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:508:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMENT_ANNOTATION||LA11_0==61) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKExt.g:509:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:509:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:510:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalKExt.g:526:3: ( (lv_const_1_0= 'const' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKExt.g:527:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKExt.g:527:1: (lv_const_1_0= 'const' )
                    // InternalKExt.g:528:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
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

            // InternalKExt.g:541:3: ( (lv_input_2_0= 'input' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKExt.g:542:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKExt.g:542:1: (lv_input_2_0= 'input' )
                    // InternalKExt.g:543:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,22,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalKExt.g:556:3: ( (lv_output_3_0= 'output' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKExt.g:557:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKExt.g:557:1: (lv_output_3_0= 'output' )
                    // InternalKExt.g:558:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalKExt.g:571:3: ( (lv_static_4_0= 'static' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKExt.g:572:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKExt.g:572:1: (lv_static_4_0= 'static' )
                    // InternalKExt.g:573:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,24,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            // InternalKExt.g:586:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=90 && LA17_1<=96)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==RULE_ID||LA17_1==RULE_COMMENT_ANNOTATION||LA17_1==61) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=90 && LA17_0<=96)) ) {
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
                    // InternalKExt.g:586:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKExt.g:586:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKExt.g:586:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKExt.g:586:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalKExt.g:587:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKExt.g:587:1: (lv_signal_5_0= 'signal' )
                            // InternalKExt.g:588:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

                    // InternalKExt.g:601:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKExt.g:602:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKExt.g:602:1: (lv_type_6_0= ruleValueType )
                    // InternalKExt.g:603:3: lv_type_6_0= ruleValueType
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:620:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKExt.g:620:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKExt.g:621:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKExt.g:621:1: (lv_signal_7_0= 'signal' )
                    // InternalKExt.g:622:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
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

            // InternalKExt.g:635:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKExt.g:636:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKExt.g:636:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKExt.g:637:3: lv_valuedObjects_8_0= ruleValuedObject
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:653:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKExt.g:653:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKExt.g:657:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKExt.g:658:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:658:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKExt.g:659:3: lv_valuedObjects_10_0= ruleValuedObject
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_8());
                  
            }
            // InternalKExt.g:679:1: ( (lv_annotations_12_0= ruleCommentAnnotatonSL ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKExt.g:680:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:680:1: (lv_annotations_12_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:681:3: lv_annotations_12_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_9_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_12_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_12_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalKExt.g:705:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            // InternalKExt.g:706:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalKExt.g:707:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
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
    // InternalKExt.g:714:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) ;
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

        EObject lv_annotations_11_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:717:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:718:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:718:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:718:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:718:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKExt.g:719:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:719:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:720:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalKExt.g:736:3: ( (lv_const_1_0= 'const' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExt.g:737:1: (lv_const_1_0= 'const' )
                    {
                    // InternalKExt.g:737:1: (lv_const_1_0= 'const' )
                    // InternalKExt.g:738:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
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

            // InternalKExt.g:751:3: ( (lv_input_2_0= 'input' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKExt.g:752:1: (lv_input_2_0= 'input' )
                    {
                    // InternalKExt.g:752:1: (lv_input_2_0= 'input' )
                    // InternalKExt.g:753:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,22,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalKExt.g:766:3: ( (lv_output_3_0= 'output' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKExt.g:767:1: (lv_output_3_0= 'output' )
                    {
                    // InternalKExt.g:767:1: (lv_output_3_0= 'output' )
                    // InternalKExt.g:768:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,23,FollowSets000.FOLLOW_16); if (state.failed) return current;
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

            // InternalKExt.g:781:3: ( (lv_static_4_0= 'static' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKExt.g:782:1: (lv_static_4_0= 'static' )
                    {
                    // InternalKExt.g:782:1: (lv_static_4_0= 'static' )
                    // InternalKExt.g:783:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,24,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

            // InternalKExt.g:796:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID||LA26_1==RULE_COMMENT_ANNOTATION||LA26_1==61) ) {
                    alt26=2;
                }
                else if ( ((LA26_1>=90 && LA26_1<=96)) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA26_0>=90 && LA26_0<=96)) ) {
                alt26=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalKExt.g:796:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalKExt.g:796:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalKExt.g:796:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalKExt.g:796:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==25) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalKExt.g:797:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalKExt.g:797:1: (lv_signal_5_0= 'signal' )
                            // InternalKExt.g:798:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
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

                    // InternalKExt.g:811:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalKExt.g:812:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalKExt.g:812:1: (lv_type_6_0= ruleValueType )
                    // InternalKExt.g:813:3: lv_type_6_0= ruleValueType
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:830:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalKExt.g:830:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalKExt.g:831:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalKExt.g:831:1: (lv_signal_7_0= 'signal' )
                    // InternalKExt.g:832:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
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

            // InternalKExt.g:845:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalKExt.g:846:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalKExt.g:846:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalKExt.g:847:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:863:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKExt.g:863:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalKExt.g:867:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalKExt.g:868:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:868:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalKExt.g:869:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalKExt.g:885:4: ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKExt.g:886:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:886:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:887:3: lv_annotations_11_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_11_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_11_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalKExt.g:911:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            // InternalKExt.g:912:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalKExt.g:913:2: iv_ruleNamespaceID= ruleNamespaceID EOF
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
    // InternalKExt.g:920:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExtendedID_0= ruleExtendedID (kw= ':' this_PrimeID_2= rulePrimeID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExtendedID_0 = null;

        AntlrDatatypeRuleToken this_PrimeID_2 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:923:28: ( (this_ExtendedID_0= ruleExtendedID (kw= ':' this_PrimeID_2= rulePrimeID )* ) )
            // InternalKExt.g:924:1: (this_ExtendedID_0= ruleExtendedID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            {
            // InternalKExt.g:924:1: (this_ExtendedID_0= ruleExtendedID (kw= ':' this_PrimeID_2= rulePrimeID )* )
            // InternalKExt.g:925:5: this_ExtendedID_0= ruleExtendedID (kw= ':' this_PrimeID_2= rulePrimeID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNamespaceIDAccess().getExtendedIDParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_ExtendedID_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExtendedID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:935:1: (kw= ':' this_PrimeID_2= rulePrimeID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKExt.g:936:2: kw= ':' this_PrimeID_2= rulePrimeID
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceIDAccess().getPrimeIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	    break loop29;
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
    // InternalKExt.g:960:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalKExt.g:961:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalKExt.g:962:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
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
    // InternalKExt.g:969:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_extern_4_0 = null;

        EObject lv_extern_6_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_valuedObjects_9_0 = null;

        EObject lv_annotations_11_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:972:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:973:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:973:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:973:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* otherlv_10= ';' ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:973:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKExt.g:974:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:974:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:975:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalKExt.g:991:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            else if ( (LA32_0==30) ) {
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
                    // InternalKExt.g:991:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKExt.g:991:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKExt.g:991:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKExt.g:995:1: ( ( ruleNamespaceID ) )
                    // InternalKExt.g:996:1: ( ruleNamespaceID )
                    {
                    // InternalKExt.g:996:1: ( ruleNamespaceID )
                    // InternalKExt.g:997:3: ruleNamespaceID
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
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
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
                    // InternalKExt.g:1014:6: (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* )
                    {
                    // InternalKExt.g:1014:6: (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* )
                    // InternalKExt.g:1014:8: otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )*
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKExt.g:1018:1: ( (lv_extern_4_0= ruleExternString ) )
                    // InternalKExt.g:1019:1: (lv_extern_4_0= ruleExternString )
                    {
                    // InternalKExt.g:1019:1: (lv_extern_4_0= ruleExternString )
                    // InternalKExt.g:1020:3: lv_extern_4_0= ruleExternString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getExternExternStringParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_extern_4_0=ruleExternString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.ExternString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:1036:2: (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalKExt.g:1036:4: otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_1_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:1040:1: ( (lv_extern_6_0= ruleExternString ) )
                    	    // InternalKExt.g:1041:1: (lv_extern_6_0= ruleExternString )
                    	    {
                    	    // InternalKExt.g:1041:1: (lv_extern_6_0= ruleExternString )
                    	    // InternalKExt.g:1042:3: lv_extern_6_0= ruleExternString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getExternExternStringParserRuleCall_1_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_extern_6_0=ruleExternString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extern",
                    	              		lv_extern_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ExternString");
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


                    }
                    break;

            }

            // InternalKExt.g:1058:6: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            // InternalKExt.g:1059:1: (lv_valuedObjects_7_0= ruleValuedObject )
            {
            // InternalKExt.g:1059:1: (lv_valuedObjects_7_0= ruleValuedObject )
            // InternalKExt.g:1060:3: lv_valuedObjects_7_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:1076:2: (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKExt.g:1076:4: otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:1080:1: ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    // InternalKExt.g:1081:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:1081:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    // InternalKExt.g:1082:3: lv_valuedObjects_9_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_valuedObjects_9_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_9_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getReferenceDeclarationAccess().getSemicolonKeyword_4());
                  
            }
            // InternalKExt.g:1102:1: ( (lv_annotations_11_0= ruleCommentAnnotatonSL ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKExt.g:1103:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:1103:1: (lv_annotations_11_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:1104:3: lv_annotations_11_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_11_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_11_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalKExt.g:1128:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            // InternalKExt.g:1129:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalKExt.g:1130:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
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
    // InternalKExt.g:1137:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_extern_4_0 = null;

        EObject lv_extern_6_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_valuedObjects_9_0 = null;

        EObject lv_annotations_10_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1140:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:1141:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:1141:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:1141:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:1141:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKExt.g:1142:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:1142:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:1143:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalKExt.g:1159:3: ( (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) ) | (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            else if ( (LA37_0==30) ) {
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
                    // InternalKExt.g:1159:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    {
                    // InternalKExt.g:1159:4: (otherlv_1= 'ref' ( ( ruleNamespaceID ) ) )
                    // InternalKExt.g:1159:6: otherlv_1= 'ref' ( ( ruleNamespaceID ) )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getRefKeyword_1_0_0());
                          
                    }
                    // InternalKExt.g:1163:1: ( ( ruleNamespaceID ) )
                    // InternalKExt.g:1164:1: ( ruleNamespaceID )
                    {
                    // InternalKExt.g:1164:1: ( ruleNamespaceID )
                    // InternalKExt.g:1165:3: ruleNamespaceID
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
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getReferenceNamedObjectCrossReference_1_0_1_0()); 
                      	    
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
                    // InternalKExt.g:1182:6: (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* )
                    {
                    // InternalKExt.g:1182:6: (otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )* )
                    // InternalKExt.g:1182:8: otherlv_3= 'extern' ( (lv_extern_4_0= ruleExternString ) ) (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )*
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternKeyword_1_1_0());
                          
                    }
                    // InternalKExt.g:1186:1: ( (lv_extern_4_0= ruleExternString ) )
                    // InternalKExt.g:1187:1: (lv_extern_4_0= ruleExternString )
                    {
                    // InternalKExt.g:1187:1: (lv_extern_4_0= ruleExternString )
                    // InternalKExt.g:1188:3: lv_extern_4_0= ruleExternString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternExternStringParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_extern_4_0=ruleExternString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"extern",
                              		lv_extern_4_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.ExternString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:1204:2: (otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==26) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalKExt.g:1204:4: otherlv_5= ',' ( (lv_extern_6_0= ruleExternString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_1_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:1208:1: ( (lv_extern_6_0= ruleExternString ) )
                    	    // InternalKExt.g:1209:1: (lv_extern_6_0= ruleExternString )
                    	    {
                    	    // InternalKExt.g:1209:1: (lv_extern_6_0= ruleExternString )
                    	    // InternalKExt.g:1210:3: lv_extern_6_0= ruleExternString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getExternExternStringParserRuleCall_1_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_extern_6_0=ruleExternString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"extern",
                    	              		lv_extern_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ExternString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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


                    }
                    break;

            }

            // InternalKExt.g:1226:6: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            // InternalKExt.g:1227:1: (lv_valuedObjects_7_0= ruleValuedObject )
            {
            // InternalKExt.g:1227:1: (lv_valuedObjects_7_0= ruleValuedObject )
            // InternalKExt.g:1228:3: lv_valuedObjects_7_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:1244:2: (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKExt.g:1244:4: otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:1248:1: ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    // InternalKExt.g:1249:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:1249:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    // InternalKExt.g:1250:3: lv_valuedObjects_9_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_valuedObjects_9_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_9_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            // InternalKExt.g:1266:4: ( (lv_annotations_10_0= ruleCommentAnnotatonSL ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKExt.g:1267:1: (lv_annotations_10_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:1267:1: (lv_annotations_10_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:1268:3: lv_annotations_10_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_10_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_10_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleExternString"
    // InternalKExt.g:1292:1: entryRuleExternString returns [EObject current=null] : iv_ruleExternString= ruleExternString EOF ;
    public final EObject entryRuleExternString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternString = null;


        try {
            // InternalKExt.g:1293:2: (iv_ruleExternString= ruleExternString EOF )
            // InternalKExt.g:1294:2: iv_ruleExternString= ruleExternString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExternString=ruleExternString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternString; 
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
    // $ANTLR end "entryRuleExternString"


    // $ANTLR start "ruleExternString"
    // InternalKExt.g:1301:1: ruleExternString returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleTagAnnotation ) )* ( (lv_code_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleExternString() throws RecognitionException {
        EObject current = null;

        Token lv_code_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1304:28: ( ( ( (lv_annotations_0_0= ruleTagAnnotation ) )* ( (lv_code_1_0= RULE_STRING ) ) ) )
            // InternalKExt.g:1305:1: ( ( (lv_annotations_0_0= ruleTagAnnotation ) )* ( (lv_code_1_0= RULE_STRING ) ) )
            {
            // InternalKExt.g:1305:1: ( ( (lv_annotations_0_0= ruleTagAnnotation ) )* ( (lv_code_1_0= RULE_STRING ) ) )
            // InternalKExt.g:1305:2: ( (lv_annotations_0_0= ruleTagAnnotation ) )* ( (lv_code_1_0= RULE_STRING ) )
            {
            // InternalKExt.g:1305:2: ( (lv_annotations_0_0= ruleTagAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==61) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKExt.g:1306:1: (lv_annotations_0_0= ruleTagAnnotation )
            	    {
            	    // InternalKExt.g:1306:1: (lv_annotations_0_0= ruleTagAnnotation )
            	    // InternalKExt.g:1307:3: lv_annotations_0_0= ruleTagAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExternStringAccess().getAnnotationsTagAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_annotations_0_0=ruleTagAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExternStringRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.TagAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalKExt.g:1323:3: ( (lv_code_1_0= RULE_STRING ) )
            // InternalKExt.g:1324:1: (lv_code_1_0= RULE_STRING )
            {
            // InternalKExt.g:1324:1: (lv_code_1_0= RULE_STRING )
            // InternalKExt.g:1325:3: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_code_1_0, grammarAccess.getExternStringAccess().getCodeSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExternStringRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"code",
                      		lv_code_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
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
    // $ANTLR end "ruleExternString"


    // $ANTLR start "entryRuleScheduleDeclaration"
    // InternalKExt.g:1349:1: entryRuleScheduleDeclaration returns [EObject current=null] : iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF ;
    public final EObject entryRuleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclaration = null;


        try {
            // InternalKExt.g:1350:2: (iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF )
            // InternalKExt.g:1351:2: iv_ruleScheduleDeclaration= ruleScheduleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleDeclaration=ruleScheduleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclaration; 
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
    // $ANTLR end "entryRuleScheduleDeclaration"


    // $ANTLR start "ruleScheduleDeclaration"
    // InternalKExt.g:1358:1: ruleScheduleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_global_4_0 = null;

        Enumerator lv_priorities_6_0 = null;

        Enumerator lv_priorities_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_valuedObjects_12_0 = null;

        EObject lv_annotations_14_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1361:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:1362:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:1362:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:1362:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:1362:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMENT_ANNOTATION||LA41_0==61) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalKExt.g:1363:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:1363:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:1364:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationAccess().getScheduleKeyword_1());
                  
            }
            // InternalKExt.g:1384:1: ( (lv_name_2_0= RULE_STRING ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKExt.g:1385:1: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalKExt.g:1385:1: (lv_name_2_0= RULE_STRING )
                    // InternalKExt.g:1386:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getScheduleDeclarationAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKExt.g:1402:3: (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKExt.g:1402:5: otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getScheduleDeclarationAccess().getGlobalKeyword_3_0());
                          
                    }
                    // InternalKExt.g:1406:1: ( (lv_global_4_0= rulePriorityProtocol ) )
                    // InternalKExt.g:1407:1: (lv_global_4_0= rulePriorityProtocol )
                    {
                    // InternalKExt.g:1407:1: (lv_global_4_0= rulePriorityProtocol )
                    // InternalKExt.g:1408:3: lv_global_4_0= rulePriorityProtocol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getGlobalPriorityProtocolEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_global_4_0=rulePriorityProtocol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_4_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKExt.g:1424:4: (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==18) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKExt.g:1424:6: otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getScheduleDeclarationAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // InternalKExt.g:1428:1: ( (lv_priorities_6_0= rulePriorityProtocol ) )
                    // InternalKExt.g:1429:1: (lv_priorities_6_0= rulePriorityProtocol )
                    {
                    // InternalKExt.g:1429:1: (lv_priorities_6_0= rulePriorityProtocol )
                    // InternalKExt.g:1430:3: lv_priorities_6_0= rulePriorityProtocol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getPrioritiesPriorityProtocolEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_priorities_6_0=rulePriorityProtocol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"priorities",
                              		lv_priorities_6_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:1446:2: (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==26) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalKExt.g:1446:4: otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getScheduleDeclarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:1450:1: ( (lv_priorities_8_0= rulePriorityProtocol ) )
                    	    // InternalKExt.g:1451:1: (lv_priorities_8_0= rulePriorityProtocol )
                    	    {
                    	    // InternalKExt.g:1451:1: (lv_priorities_8_0= rulePriorityProtocol )
                    	    // InternalKExt.g:1452:3: lv_priorities_8_0= rulePriorityProtocol
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getPrioritiesPriorityProtocolEnumRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
                    	    lv_priorities_8_0=rulePriorityProtocol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"priorities",
                    	              		lv_priorities_8_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getScheduleDeclarationAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalKExt.g:1472:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalKExt.g:1473:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalKExt.g:1473:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalKExt.g:1474:3: lv_valuedObjects_10_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_valuedObjects_10_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_10_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:1490:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==26) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKExt.g:1490:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getScheduleDeclarationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKExt.g:1494:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalKExt.g:1495:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:1495:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalKExt.g:1496:3: lv_valuedObjects_12_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_valuedObjects_12_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_12_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getScheduleDeclarationAccess().getSemicolonKeyword_7());
                  
            }
            // InternalKExt.g:1516:1: ( (lv_annotations_14_0= ruleCommentAnnotatonSL ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKExt.g:1517:1: (lv_annotations_14_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:1517:1: (lv_annotations_14_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:1518:3: lv_annotations_14_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_14_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_14_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleScheduleDeclaration"


    // $ANTLR start "entryRuleScheduleDeclarationWOSemicolon"
    // InternalKExt.g:1542:1: entryRuleScheduleDeclarationWOSemicolon returns [EObject current=null] : iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF ;
    public final EObject entryRuleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleDeclarationWOSemicolon = null;


        try {
            // InternalKExt.g:1543:2: (iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF )
            // InternalKExt.g:1544:2: iv_ruleScheduleDeclarationWOSemicolon= ruleScheduleDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleDeclarationWOSemicolon=ruleScheduleDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleDeclarationWOSemicolon; 
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
    // $ANTLR end "entryRuleScheduleDeclarationWOSemicolon"


    // $ANTLR start "ruleScheduleDeclarationWOSemicolon"
    // InternalKExt.g:1551:1: ruleScheduleDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )? ) ;
    public final EObject ruleScheduleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_global_4_0 = null;

        Enumerator lv_priorities_6_0 = null;

        Enumerator lv_priorities_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_valuedObjects_12_0 = null;

        EObject lv_annotations_13_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1554:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )? ) )
            // InternalKExt.g:1555:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )? )
            {
            // InternalKExt.g:1555:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )? )
            // InternalKExt.g:1555:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'schedule' ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )? (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )? ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )?
            {
            // InternalKExt.g:1555:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_COMMENT_ANNOTATION||LA48_0==61) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalKExt.g:1556:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:1556:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:1557:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getScheduleKeyword_1());
                  
            }
            // InternalKExt.g:1577:1: ( (lv_name_2_0= RULE_STRING ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKExt.g:1578:1: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalKExt.g:1578:1: (lv_name_2_0= RULE_STRING )
                    // InternalKExt.g:1579:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getNameSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKExt.g:1595:3: (otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKExt.g:1595:5: otherlv_3= 'global' ( (lv_global_4_0= rulePriorityProtocol ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getGlobalKeyword_3_0());
                          
                    }
                    // InternalKExt.g:1599:1: ( (lv_global_4_0= rulePriorityProtocol ) )
                    // InternalKExt.g:1600:1: (lv_global_4_0= rulePriorityProtocol )
                    {
                    // InternalKExt.g:1600:1: (lv_global_4_0= rulePriorityProtocol )
                    // InternalKExt.g:1601:3: lv_global_4_0= rulePriorityProtocol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getGlobalPriorityProtocolEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_global_4_0=rulePriorityProtocol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"global",
                              		lv_global_4_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKExt.g:1617:4: (otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalKExt.g:1617:6: otherlv_5= '{' ( (lv_priorities_6_0= rulePriorityProtocol ) ) (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // InternalKExt.g:1621:1: ( (lv_priorities_6_0= rulePriorityProtocol ) )
                    // InternalKExt.g:1622:1: (lv_priorities_6_0= rulePriorityProtocol )
                    {
                    // InternalKExt.g:1622:1: (lv_priorities_6_0= rulePriorityProtocol )
                    // InternalKExt.g:1623:3: lv_priorities_6_0= rulePriorityProtocol
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getPrioritiesPriorityProtocolEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_priorities_6_0=rulePriorityProtocol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"priorities",
                              		lv_priorities_6_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:1639:2: (otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==26) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKExt.g:1639:4: otherlv_7= ',' ( (lv_priorities_8_0= rulePriorityProtocol ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:1643:1: ( (lv_priorities_8_0= rulePriorityProtocol ) )
                    	    // InternalKExt.g:1644:1: (lv_priorities_8_0= rulePriorityProtocol )
                    	    {
                    	    // InternalKExt.g:1644:1: (lv_priorities_8_0= rulePriorityProtocol )
                    	    // InternalKExt.g:1645:3: lv_priorities_8_0= rulePriorityProtocol
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getPrioritiesPriorityProtocolEnumRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_32);
                    	    lv_priorities_8_0=rulePriorityProtocol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"priorities",
                    	              		lv_priorities_8_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.PriorityProtocol");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getRightCurlyBracketKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // InternalKExt.g:1665:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalKExt.g:1666:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalKExt.g:1666:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalKExt.g:1667:3: lv_valuedObjects_10_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_valuedObjects_10_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_10_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:1683:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==26) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKExt.g:1683:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getScheduleDeclarationWOSemicolonAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKExt.g:1687:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalKExt.g:1688:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalKExt.g:1688:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalKExt.g:1689:3: lv_valuedObjects_12_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_valuedObjects_12_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_12_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
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

            // InternalKExt.g:1705:4: ( (lv_annotations_13_0= ruleCommentAnnotatonSL ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_SL_COMMENT_ANNOTATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKExt.g:1706:1: (lv_annotations_13_0= ruleCommentAnnotatonSL )
                    {
                    // InternalKExt.g:1706:1: (lv_annotations_13_0= ruleCommentAnnotatonSL )
                    // InternalKExt.g:1707:3: lv_annotations_13_0= ruleCommentAnnotatonSL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScheduleDeclarationWOSemicolonAccess().getAnnotationsCommentAnnotatonSLParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_annotations_13_0=ruleCommentAnnotatonSL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScheduleDeclarationWOSemicolonRule());
                      	        }
                             		add(
                             			current, 
                             			"annotations",
                              		lv_annotations_13_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.CommentAnnotatonSL");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleScheduleDeclarationWOSemicolon"


    // $ANTLR start "entryRuleValuedObject"
    // InternalKExt.g:1731:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalKExt.g:1732:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalKExt.g:1733:2: iv_ruleValuedObject= ruleValuedObject EOF
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
    // InternalKExt.g:1740:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_cardinalities_3_0 = null;

        EObject lv_initialValue_6_0 = null;

        Enumerator lv_combineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1743:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalKExt.g:1744:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalKExt.g:1744:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalKExt.g:1744:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= rulePrimeID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalKExt.g:1744:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_COMMENT_ANNOTATION||LA55_0==61) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalKExt.g:1745:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKExt.g:1745:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKExt.g:1746:3: lv_annotations_0_0= ruleQuotedStringAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalKExt.g:1762:3: ( (lv_name_1_0= rulePrimeID ) )
            // InternalKExt.g:1763:1: (lv_name_1_0= rulePrimeID )
            {
            // InternalKExt.g:1763:1: (lv_name_1_0= rulePrimeID )
            // InternalKExt.g:1764:3: lv_name_1_0= rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuedObjectAccess().getNamePrimeIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_33);
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.PrimeID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:1780:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==33) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalKExt.g:1780:4: otherlv_2= '[' ( (lv_cardinalities_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalKExt.g:1784:1: ( (lv_cardinalities_3_0= ruleExpression ) )
            	    // InternalKExt.g:1785:1: (lv_cardinalities_3_0= ruleExpression )
            	    {
            	    // InternalKExt.g:1785:1: (lv_cardinalities_3_0= ruleExpression )
            	    // InternalKExt.g:1786:3: lv_cardinalities_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    lv_cardinalities_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalKExt.g:1806:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKExt.g:1806:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalKExt.g:1810:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalKExt.g:1811:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalKExt.g:1811:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalKExt.g:1812:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKExt.g:1828:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalKExt.g:1828:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalKExt.g:1832:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalKExt.g:1833:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalKExt.g:1833:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalKExt.g:1834:3: lv_combineOperator_8_0= ruleCombineOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CombineOperator");
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
    // InternalKExt.g:1858:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalKExt.g:1859:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalKExt.g:1860:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalKExt.g:1867:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_ReferenceCallEffect_4 = null;

        EObject this_FunctionCallEffect_5 = null;

        EObject this_PrintCallEffect_6 = null;

        EObject this_RandomizeCallEffect_7 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1870:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect ) )
            // InternalKExt.g:1871:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect )
            {
            // InternalKExt.g:1871:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect )
            int alt59=8;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalKExt.g:1872:2: this_Assignment_0= ruleAssignment
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
                    // InternalKExt.g:1885:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalKExt.g:1898:2: this_Emission_2= ruleEmission
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
                    // InternalKExt.g:1911:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalKExt.g:1924:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
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
                    // InternalKExt.g:1937:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
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
                case 7 :
                    // InternalKExt.g:1950:2: this_PrintCallEffect_6= rulePrintCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPrintCallEffectParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrintCallEffect_6=rulePrintCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrintCallEffect_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalKExt.g:1963:2: this_RandomizeCallEffect_7= ruleRandomizeCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getRandomizeCallEffectParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCallEffect_7=ruleRandomizeCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RandomizeCallEffect_7; 
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
    // InternalKExt.g:1982:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalKExt.g:1983:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalKExt.g:1984:2: iv_ruleEmission= ruleEmission EOF
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
    // InternalKExt.g:1991:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        EObject lv_newValue_3_0 = null;

        EObject lv_schedule_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:1994:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKExt.g:1995:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKExt.g:1995:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKExt.g:1995:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKExt.g:1995:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_COMMENT_ANNOTATION||LA60_0==61) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalKExt.g:1996:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalKExt.g:1996:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalKExt.g:1997:3: lv_annotations_0_0= ruleQuotedStringAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalKExt.g:2013:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKExt.g:2014:1: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKExt.g:2014:1: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKExt.g:2015:3: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmissionAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmissionRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2031:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKExt.g:2031:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalKExt.g:2035:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalKExt.g:2036:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalKExt.g:2036:1: (lv_newValue_3_0= ruleExpression )
                    // InternalKExt.g:2037:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // InternalKExt.g:2057:3: (otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+ )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKExt.g:2057:5: otherlv_5= 'schedule' ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEmissionAccess().getScheduleKeyword_3_0());
                          
                    }
                    // InternalKExt.g:2061:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // InternalKExt.g:2062:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKExt.g:2062:1: (lv_schedule_6_0= ruleScheduleObjectReference )
                    	    // InternalKExt.g:2063:3: lv_schedule_6_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEmissionAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_schedule_6_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalKExt.g:2087:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalKExt.g:2088:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalKExt.g:2089:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalKExt.g:2096:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_schedule_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2099:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKExt.g:2100:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKExt.g:2100:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKExt.g:2100:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= ruleAssignOperator ) ) ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKExt.g:2100:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_COMMENT_ANNOTATION||LA64_0==61) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalKExt.g:2101:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2101:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2102:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalKExt.g:2118:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKExt.g:2119:1: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKExt.g:2119:1: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKExt.g:2120:3: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2136:2: ( (lv_operator_2_0= ruleAssignOperator ) )
            // InternalKExt.g:2137:1: (lv_operator_2_0= ruleAssignOperator )
            {
            // InternalKExt.g:2137:1: (lv_operator_2_0= ruleAssignOperator )
            // InternalKExt.g:2138:3: lv_operator_2_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_operator_2_0=ruleAssignOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_2_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2154:2: ( (lv_expression_3_0= ruleExpression ) )
            // InternalKExt.g:2155:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalKExt.g:2155:1: (lv_expression_3_0= ruleExpression )
            // InternalKExt.g:2156:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2172:2: (otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==31) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalKExt.g:2172:4: otherlv_4= 'schedule' ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getScheduleKeyword_4_0());
                          
                    }
                    // InternalKExt.g:2176:1: ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        alt65 = dfa65.predict(input);
                        switch (alt65) {
                    	case 1 :
                    	    // InternalKExt.g:2177:1: (lv_schedule_5_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKExt.g:2177:1: (lv_schedule_5_0= ruleScheduleObjectReference )
                    	    // InternalKExt.g:2178:3: lv_schedule_5_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getScheduleScheduleObjectReferenceParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_schedule_5_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalKExt.g:2202:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalKExt.g:2203:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalKExt.g:2204:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
    // InternalKExt.g:2211:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_reference_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_schedule_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2214:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKExt.g:2215:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKExt.g:2215:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKExt.g:2215:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reference_1_0= ruleValuedObjectReference ) ) ( (lv_operator_2_0= rulePostfixOperator ) ) (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKExt.g:2215:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_COMMENT_ANNOTATION||LA67_0==61) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalKExt.g:2216:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2216:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2217:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalKExt.g:2233:3: ( (lv_reference_1_0= ruleValuedObjectReference ) )
            // InternalKExt.g:2234:1: (lv_reference_1_0= ruleValuedObjectReference )
            {
            // InternalKExt.g:2234:1: (lv_reference_1_0= ruleValuedObjectReference )
            // InternalKExt.g:2235:3: lv_reference_1_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getReferenceValuedObjectReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_reference_1_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2251:2: ( (lv_operator_2_0= rulePostfixOperator ) )
            // InternalKExt.g:2252:1: (lv_operator_2_0= rulePostfixOperator )
            {
            // InternalKExt.g:2252:1: (lv_operator_2_0= rulePostfixOperator )
            // InternalKExt.g:2253:3: lv_operator_2_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_operator_2_0=rulePostfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_2_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.PostfixOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2269:2: (otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+ )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKExt.g:2269:4: otherlv_3= 'schedule' ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPostfixEffectAccess().getScheduleKeyword_3_0());
                          
                    }
                    // InternalKExt.g:2273:1: ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        alt68 = dfa68.predict(input);
                        switch (alt68) {
                    	case 1 :
                    	    // InternalKExt.g:2274:1: (lv_schedule_4_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKExt.g:2274:1: (lv_schedule_4_0= ruleScheduleObjectReference )
                    	    // InternalKExt.g:2275:3: lv_schedule_4_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getScheduleScheduleObjectReferenceParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_schedule_4_0=ruleScheduleObjectReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"schedule",
                    	              		lv_schedule_4_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ScheduleObjectReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
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
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalKExt.g:2299:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalKExt.g:2300:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalKExt.g:2301:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
    // InternalKExt.g:2308:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2311:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKExt.g:2312:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKExt.g:2312:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKExt.g:2312:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKExt.g:2312:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_COMMENT_ANNOTATION||LA70_0==61) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalKExt.g:2313:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2313:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2314:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalKExt.g:2330:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKExt.g:2331:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKExt.g:2331:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKExt.g:2332:3: lv_text_1_0= RULE_HOSTCODE
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // InternalKExt.g:2356:1: entryRuleReferenceCallEffect returns [EObject current=null] : iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF ;
    public final EObject entryRuleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCallEffect = null;


        try {
            // InternalKExt.g:2357:2: (iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF )
            // InternalKExt.g:2358:2: iv_ruleReferenceCallEffect= ruleReferenceCallEffect EOF
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
    // InternalKExt.g:2365:1: ruleReferenceCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'call' ( ( rulePrimeID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ;
    public final EObject ruleReferenceCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2368:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'call' ( ( rulePrimeID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKExt.g:2369:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'call' ( ( rulePrimeID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKExt.g:2369:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'call' ( ( rulePrimeID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKExt.g:2369:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'call' ( ( rulePrimeID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            // InternalKExt.g:2369:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_COMMENT_ANNOTATION||LA71_0==61) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalKExt.g:2370:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2370:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2371:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceCallEffectAccess().getCallKeyword_1());
                  
            }
            // InternalKExt.g:2391:1: ( ( rulePrimeID ) )
            // InternalKExt.g:2392:1: ( rulePrimeID )
            {
            // InternalKExt.g:2392:1: ( rulePrimeID )
            // InternalKExt.g:2393:3: rulePrimeID
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
               
              	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getValuedObjectValuedObjectCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_45);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2409:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==37) ) {
                alt73=1;
            }
            else if ( (LA73_0==40) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalKExt.g:2409:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKExt.g:2409:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKExt.g:2409:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalKExt.g:2413:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKExt.g:2414:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKExt.g:2414:1: (lv_parameters_4_0= ruleParameter )
                    // InternalKExt.g:2415:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:2431:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==26) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalKExt.g:2431:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:2435:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKExt.g:2436:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKExt.g:2436:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKExt.g:2437:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
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

                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReferenceCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:2458:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getReferenceCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
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
    // InternalKExt.g:2470:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalKExt.g:2471:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalKExt.g:2472:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalKExt.g:2479:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2482:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ) )
            // InternalKExt.g:2483:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            {
            // InternalKExt.g:2483:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKExt.g:2483:2: ( (lv_annotations_0_0= ruleAnnotation ) )* (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKExt.g:2483:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_COMMENT_ANNOTATION||LA74_0==61) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalKExt.g:2484:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2484:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2485:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_48);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // InternalKExt.g:2501:3: (otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKExt.g:2501:5: otherlv_1= 'extern' ( (lv_functionName_2_0= RULE_ID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getExternKeyword_1_0());
                  
            }
            // InternalKExt.g:2505:1: ( (lv_functionName_2_0= RULE_ID ) )
            // InternalKExt.g:2506:1: (lv_functionName_2_0= RULE_ID )
            {
            // InternalKExt.g:2506:1: (lv_functionName_2_0= RULE_ID )
            // InternalKExt.g:2507:3: lv_functionName_2_0= RULE_ID
            {
            lv_functionName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionCallEffectAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ID");
              	    
            }

            }


            }

            // InternalKExt.g:2523:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==37) ) {
                alt76=1;
            }
            else if ( (LA76_0==40) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalKExt.g:2523:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKExt.g:2523:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKExt.g:2523:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_1_2_0_0());
                          
                    }
                    // InternalKExt.g:2527:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKExt.g:2528:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKExt.g:2528:1: (lv_parameters_4_0= ruleParameter )
                    // InternalKExt.g:2529:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:2545:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==26) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalKExt.g:2545:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_1_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:2549:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKExt.g:2550:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKExt.g:2550:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKExt.g:2551:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_1_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
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

                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_1_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:2572:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_1_2_1());
                          
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
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRulePrintCallEffect"
    // InternalKExt.g:2584:1: entryRulePrintCallEffect returns [EObject current=null] : iv_rulePrintCallEffect= rulePrintCallEffect EOF ;
    public final EObject entryRulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCallEffect = null;


        try {
            // InternalKExt.g:2585:2: (iv_rulePrintCallEffect= rulePrintCallEffect EOF )
            // InternalKExt.g:2586:2: iv_rulePrintCallEffect= rulePrintCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrintCallEffect=rulePrintCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintCallEffect; 
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
    // $ANTLR end "entryRulePrintCallEffect"


    // $ANTLR start "rulePrintCallEffect"
    // InternalKExt.g:2593:1: rulePrintCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) ;
    public final EObject rulePrintCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2596:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ) )
            // InternalKExt.g:2597:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            {
            // InternalKExt.g:2597:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalKExt.g:2597:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'print' (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalKExt.g:2597:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_COMMENT_ANNOTATION||LA77_0==61) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalKExt.g:2598:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2598:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExt.g:2599:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrintCallEffectAccess().getPrintKeyword_1());
                  
            }
            // InternalKExt.g:2619:1: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalKExt.g:2619:3: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrintCallEffectAccess().getLeftParenthesisKeyword_2_0());
                  
            }
            // InternalKExt.g:2623:1: ( (lv_parameters_3_0= ruleParameter ) )
            // InternalKExt.g:2624:1: (lv_parameters_3_0= ruleParameter )
            {
            // InternalKExt.g:2624:1: (lv_parameters_3_0= ruleParameter )
            // InternalKExt.g:2625:3: lv_parameters_3_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_parameters_3_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_3_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:2641:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==26) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalKExt.g:2641:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPrintCallEffectAccess().getCommaKeyword_2_2_0());
            	          
            	    }
            	    // InternalKExt.g:2645:1: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalKExt.g:2646:1: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalKExt.g:2646:1: (lv_parameters_5_0= ruleParameter )
            	    // InternalKExt.g:2647:3: lv_parameters_5_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrintCallEffectAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrintCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_5_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPrintCallEffectAccess().getRightParenthesisKeyword_2_3());
                  
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
    // $ANTLR end "rulePrintCallEffect"


    // $ANTLR start "entryRuleRandomizeCallEffect"
    // InternalKExt.g:2675:1: entryRuleRandomizeCallEffect returns [EObject current=null] : iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF ;
    public final EObject entryRuleRandomizeCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCallEffect = null;


        try {
            // InternalKExt.g:2676:2: (iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF )
            // InternalKExt.g:2677:2: iv_ruleRandomizeCallEffect= ruleRandomizeCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCallEffect=ruleRandomizeCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCallEffect; 
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
    // $ANTLR end "entryRuleRandomizeCallEffect"


    // $ANTLR start "ruleRandomizeCallEffect"
    // InternalKExt.g:2684:1: ruleRandomizeCallEffect returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) ;
    public final EObject ruleRandomizeCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2687:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) ) )
            // InternalKExt.g:2688:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            {
            // InternalKExt.g:2688:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' ) )
            // InternalKExt.g:2688:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'randomize' ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            {
            // InternalKExt.g:2688:2: ()
            // InternalKExt.g:2689:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRandomizeCallEffectAccess().getRandomizeCallEffectAction_0(),
                          current);
                  
            }

            }

            // InternalKExt.g:2697:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_COMMENT_ANNOTATION||LA79_0==61) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalKExt.g:2698:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalKExt.g:2698:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalKExt.g:2699:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRandomizeCallEffectAccess().getRandomizeKeyword_2());
                  
            }
            // InternalKExt.g:2719:1: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==37) ) {
                alt81=1;
            }
            else if ( (LA81_0==40) ) {
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
                    // InternalKExt.g:2719:2: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalKExt.g:2719:2: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalKExt.g:2719:4: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRandomizeCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalKExt.g:2723:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalKExt.g:2724:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalKExt.g:2724:1: (lv_parameters_4_0= ruleParameter )
                    // InternalKExt.g:2725:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:2741:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==26) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalKExt.g:2741:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getRandomizeCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:2745:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalKExt.g:2746:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalKExt.g:2746:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalKExt.g:2747:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRandomizeCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRandomizeCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRandomizeCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:2768:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRandomizeCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
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
    // $ANTLR end "ruleRandomizeCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalKExt.g:2782:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKExt.g:2783:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKExt.g:2784:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKExt.g:2791:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2794:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKExt.g:2795:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKExt.g:2795:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // InternalKExt.g:2796:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKExt.g:2809:2: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalKExt.g:2828:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKExt.g:2829:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKExt.g:2830:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKExt.g:2837:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2840:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKExt.g:2842:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKExt.g:2861:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKExt.g:2862:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKExt.g:2863:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKExt.g:2870:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2873:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKExt.g:2874:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKExt.g:2874:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKExt.g:2875:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_52);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:2886:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==43) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalKExt.g:2886:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKExt.g:2886:2: ()
                    // InternalKExt.g:2887:2: 
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

                    // InternalKExt.g:2895:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKExt.g:2895:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKExt.g:2895:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKExt.g:2896:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKExt.g:2896:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKExt.g:2897:3: lv_operator_2_0= ruleLogicalOrOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:2913:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKExt.g:2914:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKExt.g:2914:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKExt.g:2915:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:2931:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==43) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalKExt.g:2931:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:2935:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKExt.g:2936:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKExt.g:2936:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKExt.g:2937:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
                    	    lv_subExpressions_5_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
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


            }


            }

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
    // InternalKExt.g:2961:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKExt.g:2962:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKExt.g:2963:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKExt.g:2970:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:2973:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKExt.g:2974:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKExt.g:2974:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKExt.g:2975:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_53);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:2986:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==44) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalKExt.g:2986:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKExt.g:2986:2: ()
                    // InternalKExt.g:2987:2: 
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

                    // InternalKExt.g:2995:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKExt.g:2995:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKExt.g:2995:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKExt.g:2996:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKExt.g:2996:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKExt.g:2997:3: lv_operator_2_0= ruleLogicalAndOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3013:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKExt.g:3014:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKExt.g:3014:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKExt.g:3015:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3031:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==44) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalKExt.g:3031:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3035:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKExt.g:3036:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKExt.g:3036:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKExt.g:3037:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
                    	    lv_subExpressions_5_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
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
    // InternalKExt.g:3061:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKExt.g:3062:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKExt.g:3063:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKExt.g:3070:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3073:28: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKExt.g:3074:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKExt.g:3074:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKExt.g:3075:2: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_54);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseXOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3086:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==45) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalKExt.g:3086:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKExt.g:3086:2: ()
                    // InternalKExt.g:3087:2: 
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

                    // InternalKExt.g:3095:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKExt.g:3095:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKExt.g:3095:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKExt.g:3096:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKExt.g:3096:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKExt.g:3097:3: lv_operator_2_0= ruleBitwiseOrOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3113:2: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKExt.g:3114:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKExt.g:3114:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKExt.g:3115:3: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_subExpressions_3_0=ruleBitwiseXOrExpression();

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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3131:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==45) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalKExt.g:3131:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3135:1: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKExt.g:3136:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKExt.g:3136:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKExt.g:3137:3: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
                    	    lv_subExpressions_5_0=ruleBitwiseXOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
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


    // $ANTLR start "entryRuleBitwiseXOrExpression"
    // InternalKExt.g:3161:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKExt.g:3162:2: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKExt.g:3163:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseXOrExpression=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXOrExpression; 
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
    // $ANTLR end "entryRuleBitwiseXOrExpression"


    // $ANTLR start "ruleBitwiseXOrExpression"
    // InternalKExt.g:3170:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3173:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKExt.g:3174:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKExt.g:3174:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKExt.g:3175:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_55);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3186:1: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==46) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalKExt.g:3186:2: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKExt.g:3186:2: ()
                    // InternalKExt.g:3187:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseXOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:3195:2: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKExt.g:3195:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKExt.g:3195:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKExt.g:3196:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKExt.g:3196:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKExt.g:3197:3: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_operator_2_0=ruleBitwiseXOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3213:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKExt.g:3214:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKExt.g:3214:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKExt.g:3215:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3231:3: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==46) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalKExt.g:3231:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3235:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKExt.g:3236:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKExt.g:3236:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKExt.g:3237:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_55);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
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
    // $ANTLR end "ruleBitwiseXOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKExt.g:3261:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKExt.g:3262:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKExt.g:3263:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKExt.g:3270:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3273:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKExt.g:3274:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKExt.g:3274:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKExt.g:3275:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_56);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3286:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==47) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalKExt.g:3286:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKExt.g:3286:2: ()
                    // InternalKExt.g:3287:2: 
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

                    // InternalKExt.g:3295:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKExt.g:3295:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKExt.g:3295:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKExt.g:3296:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKExt.g:3296:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKExt.g:3297:3: lv_operator_2_0= ruleBitwiseAndOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3313:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKExt.g:3314:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKExt.g:3314:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKExt.g:3315:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3331:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==47) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalKExt.g:3331:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3335:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKExt.g:3336:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKExt.g:3336:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKExt.g:3337:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_subExpressions_5_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKExt.g:3361:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKExt.g:3362:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKExt.g:3363:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKExt.g:3370:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3373:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKExt.g:3374:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKExt.g:3374:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKExt.g:3375:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_57);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3386:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=80 && LA93_0<=85)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalKExt.g:3386:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKExt.g:3386:2: ()
                    // InternalKExt.g:3387:2: 
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

                    // InternalKExt.g:3395:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKExt.g:3396:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKExt.g:3396:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKExt.g:3397:3: lv_operator_2_0= ruleCompareOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3413:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKExt.g:3414:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKExt.g:3414:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKExt.g:3415:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOrValuedExpression");
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
    // InternalKExt.g:3439:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKExt.g:3440:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKExt.g:3441:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKExt.g:3448:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3451:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKExt.g:3452:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKExt.g:3452:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalKExt.g:3453:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKExt.g:3466:2: this_NotExpression_1= ruleNotExpression
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


    // $ANTLR start "entryRuleBitwiseNotExpression"
    // InternalKExt.g:3485:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKExt.g:3486:2: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKExt.g:3487:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseNotExpression=ruleBitwiseNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseNotExpression; 
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
    // $ANTLR end "entryRuleBitwiseNotExpression"


    // $ANTLR start "ruleBitwiseNotExpression"
    // InternalKExt.g:3494:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3497:28: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKExt.g:3498:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKExt.g:3498:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==87) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_ID||LA95_0==RULE_HOSTCODE||LA95_0==RULE_BOOLEAN||LA95_0==30||LA95_0==37||LA95_0==42||LA95_0==58||LA95_0==86||LA95_0==88) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalKExt.g:3498:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKExt.g:3498:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKExt.g:3498:3: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKExt.g:3498:3: ()
                    // InternalKExt.g:3499:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBitwiseNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:3507:2: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKExt.g:3508:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKExt.g:3508:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKExt.g:3509:3: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_operator_1_0=ruleBitwiseNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3525:2: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKExt.g:3526:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKExt.g:3526:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKExt.g:3527:3: lv_subExpressions_2_0= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getSubExpressionsBitwiseNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:3545:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
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
    // $ANTLR end "ruleBitwiseNotExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKExt.g:3564:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKExt.g:3565:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKExt.g:3566:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKExt.g:3573:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3576:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKExt.g:3577:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKExt.g:3577:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==59) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_ID||LA96_0==RULE_HOSTCODE||LA96_0==RULE_BOOLEAN||LA96_0==30||LA96_0==37||LA96_0==42||LA96_0==58||(LA96_0>=86 && LA96_0<=88)) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalKExt.g:3577:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKExt.g:3577:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKExt.g:3577:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKExt.g:3577:3: ()
                    // InternalKExt.g:3578:2: 
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

                    // InternalKExt.g:3586:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKExt.g:3587:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKExt.g:3587:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKExt.g:3588:3: lv_operator_1_0= ruleNotOperator
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3604:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKExt.g:3605:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKExt.g:3605:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKExt.g:3606:3: lv_subExpressions_2_0= ruleNotExpression
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:3624:2: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getBitwiseNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BitwiseNotExpression_3=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BitwiseNotExpression_3; 
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
    // InternalKExt.g:3643:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKExt.g:3644:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKExt.g:3645:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKExt.g:3652:1: ruleValuedExpression returns [EObject current=null] : this_ShiftLeftExpression_0= ruleShiftLeftExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftLeftExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3655:28: (this_ShiftLeftExpression_0= ruleShiftLeftExpression )
            // InternalKExt.g:3657:2: this_ShiftLeftExpression_0= ruleShiftLeftExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getShiftLeftExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ShiftLeftExpression_0=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftLeftExpression_0; 
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


    // $ANTLR start "entryRuleShiftLeftExpression"
    // InternalKExt.g:3676:1: entryRuleShiftLeftExpression returns [EObject current=null] : iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF ;
    public final EObject entryRuleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftExpression = null;


        try {
            // InternalKExt.g:3677:2: (iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF )
            // InternalKExt.g:3678:2: iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftLeftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftLeftExpression=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftLeftExpression; 
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
    // $ANTLR end "entryRuleShiftLeftExpression"


    // $ANTLR start "ruleShiftLeftExpression"
    // InternalKExt.g:3685:1: ruleShiftLeftExpression returns [EObject current=null] : (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) ;
    public final EObject ruleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3688:28: ( (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) )
            // InternalKExt.g:3689:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            {
            // InternalKExt.g:3689:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            // InternalKExt.g:3690:2: this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getShiftRightExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_58);
            this_ShiftRightExpression_0=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3701:1: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==48) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalKExt.g:3701:2: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    {
                    // InternalKExt.g:3701:2: ()
                    // InternalKExt.g:3702:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftLeftExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:3710:2: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) )
                    // InternalKExt.g:3710:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    {
                    // InternalKExt.g:3710:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKExt.g:3711:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKExt.g:3711:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKExt.g:3712:3: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3728:2: ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    // InternalKExt.g:3729:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    {
                    // InternalKExt.g:3729:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    // InternalKExt.g:3730:3: lv_subExpressions_3_0= ruleShiftRightExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_subExpressions_3_0=ruleShiftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3746:3: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==48) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalKExt.g:3746:5: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftLeftExpressionAccess().getLessThanSignLessThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3750:1: ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    // InternalKExt.g:3751:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    {
                    	    // InternalKExt.g:3751:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    // InternalKExt.g:3752:3: lv_subExpressions_5_0= ruleShiftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_58);
                    	    lv_subExpressions_5_0=ruleShiftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
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
    // $ANTLR end "ruleShiftLeftExpression"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKExt.g:3776:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKExt.g:3777:2: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKExt.g:3778:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightExpression=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightExpression; 
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
    // $ANTLR end "entryRuleShiftRightExpression"


    // $ANTLR start "ruleShiftRightExpression"
    // InternalKExt.g:3785:1: ruleShiftRightExpression returns [EObject current=null] : (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightUnsignedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3788:28: ( (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKExt.g:3789:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKExt.g:3789:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKExt.g:3790:2: this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getShiftRightUnsignedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_60);
            this_ShiftRightUnsignedExpression_0=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightUnsignedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3801:1: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==49) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalKExt.g:3801:2: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExt.g:3801:2: ()
                    // InternalKExt.g:3802:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:3810:2: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKExt.g:3810:3: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKExt.g:3810:3: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKExt.g:3811:1: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKExt.g:3811:1: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKExt.g:3812:3: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_operator_2_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3828:2: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKExt.g:3829:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKExt.g:3829:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKExt.g:3830:3: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
                    lv_subExpressions_3_0=ruleShiftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3846:3: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==49) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalKExt.g:3846:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3850:1: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKExt.g:3851:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKExt.g:3851:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKExt.g:3852:3: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_subExpressions_5_0=ruleShiftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
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
    // $ANTLR end "ruleShiftRightExpression"


    // $ANTLR start "entryRuleShiftRightUnsignedExpression"
    // InternalKExt.g:3876:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKExt.g:3877:2: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKExt.g:3878:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightUnsignedExpression=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightUnsignedExpression; 
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
    // $ANTLR end "entryRuleShiftRightUnsignedExpression"


    // $ANTLR start "ruleShiftRightUnsignedExpression"
    // InternalKExt.g:3885:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3888:28: ( (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) )
            // InternalKExt.g:3889:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            {
            // InternalKExt.g:3889:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            // InternalKExt.g:3890:2: this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getAddExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_61);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:3901:1: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==50) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalKExt.g:3901:2: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    {
                    // InternalKExt.g:3901:2: ()
                    // InternalKExt.g:3902:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:3910:2: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) )
                    // InternalKExt.g:3910:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    {
                    // InternalKExt.g:3910:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExt.g:3911:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExt.g:3911:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKExt.g:3912:3: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_operator_2_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:3928:2: ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    // InternalKExt.g:3929:1: (lv_subExpressions_3_0= ruleAddExpression )
                    {
                    // InternalKExt.g:3929:1: (lv_subExpressions_3_0= ruleAddExpression )
                    // InternalKExt.g:3930:3: lv_subExpressions_3_0= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
                    lv_subExpressions_3_0=ruleAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:3946:3: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==50) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalKExt.g:3946:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:3950:1: ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    // InternalKExt.g:3951:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    {
                    	    // InternalKExt.g:3951:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    // InternalKExt.g:3952:3: lv_subExpressions_5_0= ruleAddExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    lv_subExpressions_5_0=ruleAddExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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
    // $ANTLR end "ruleShiftRightUnsignedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKExt.g:3976:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKExt.g:3977:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKExt.g:3978:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalKExt.g:3985:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:3988:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKExt.g:3989:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKExt.g:3989:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKExt.g:3990:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_62);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:4001:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==51) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalKExt.g:4001:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKExt.g:4001:2: ()
                    // InternalKExt.g:4002:2: 
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

                    // InternalKExt.g:4010:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKExt.g:4010:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKExt.g:4010:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKExt.g:4011:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKExt.g:4011:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalKExt.g:4012:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4028:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKExt.g:4029:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKExt.g:4029:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKExt.g:4030:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:4046:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==51) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalKExt.g:4046:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:4050:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKExt.g:4051:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKExt.g:4051:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKExt.g:4052:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_62);
                    	    lv_subExpressions_5_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKExt.g:4076:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKExt.g:4077:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKExt.g:4078:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalKExt.g:4085:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4088:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKExt.g:4089:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKExt.g:4089:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKExt.g:4090:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_63);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:4101:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==52) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalKExt.g:4101:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKExt.g:4101:2: ()
                    // InternalKExt.g:4102:2: 
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

                    // InternalKExt.g:4110:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKExt.g:4110:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKExt.g:4110:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKExt.g:4111:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKExt.g:4111:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalKExt.g:4112:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4128:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKExt.g:4129:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKExt.g:4129:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKExt.g:4130:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:4146:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==52) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalKExt.g:4146:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:4150:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKExt.g:4151:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKExt.g:4151:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKExt.g:4152:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_63);
                    	    lv_subExpressions_5_0=ruleMultExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalKExt.g:4176:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKExt.g:4177:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKExt.g:4178:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalKExt.g:4185:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4188:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKExt.g:4189:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKExt.g:4189:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKExt.g:4190:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_64);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:4201:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==53) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalKExt.g:4201:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKExt.g:4201:2: ()
                    // InternalKExt.g:4202:2: 
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

                    // InternalKExt.g:4210:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKExt.g:4210:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKExt.g:4210:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKExt.g:4211:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKExt.g:4211:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalKExt.g:4212:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4228:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKExt.g:4229:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKExt.g:4229:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKExt.g:4230:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:4246:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==53) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalKExt.g:4246:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:4250:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKExt.g:4251:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKExt.g:4251:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKExt.g:4252:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_64);
                    	    lv_subExpressions_5_0=ruleDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalKExt.g:4276:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKExt.g:4277:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKExt.g:4278:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalKExt.g:4285:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4288:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKExt.g:4289:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKExt.g:4289:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKExt.g:4290:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_65);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:4301:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==54) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalKExt.g:4301:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKExt.g:4301:2: ()
                    // InternalKExt.g:4302:2: 
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

                    // InternalKExt.g:4310:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKExt.g:4310:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKExt.g:4310:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKExt.g:4311:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKExt.g:4311:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalKExt.g:4312:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4328:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKExt.g:4329:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKExt.g:4329:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKExt.g:4330:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_65);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:4346:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==54) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalKExt.g:4346:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:4350:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKExt.g:4351:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKExt.g:4351:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKExt.g:4352:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_65);
                    	    lv_subExpressions_5_0=ruleModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalKExt.g:4376:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKExt.g:4377:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKExt.g:4378:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalKExt.g:4385:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4388:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKExt.g:4389:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKExt.g:4389:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKExt.g:4390:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_66);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKExt.g:4401:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==55) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalKExt.g:4401:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKExt.g:4401:2: ()
                    // InternalKExt.g:4402:2: 
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

                    // InternalKExt.g:4410:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKExt.g:4410:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKExt.g:4410:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKExt.g:4411:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKExt.g:4411:1: (lv_operator_2_0= ruleModOperator )
                    // InternalKExt.g:4412:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4428:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExt.g:4429:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExt.g:4429:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExt.g:4430:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKExt.g:4446:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==55) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalKExt.g:4446:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:4450:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKExt.g:4451:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKExt.g:4451:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKExt.g:4452:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_66);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKExt.g:4476:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKExt.g:4477:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKExt.g:4478:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKExt.g:4485:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4488:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKExt.g:4489:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKExt.g:4489:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==52) ) {
                alt113=1;
            }
            else if ( ((LA113_0>=RULE_ID && LA113_0<=RULE_BOOLEAN)||LA113_0==18||LA113_0==30||LA113_0==37||LA113_0==42||LA113_0==58||LA113_0==86||LA113_0==88) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalKExt.g:4489:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKExt.g:4489:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKExt.g:4489:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKExt.g:4489:3: ()
                    // InternalKExt.g:4490:2: 
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

                    // InternalKExt.g:4498:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKExt.g:4499:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKExt.g:4499:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKExt.g:4500:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4516:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKExt.g:4517:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKExt.g:4517:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKExt.g:4518:3: lv_subExpressions_2_0= ruleNegExpression
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:4536:2: this_TernaryOperation_3= ruleTernaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getTernaryOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TernaryOperation_3=ruleTernaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TernaryOperation_3; 
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


    // $ANTLR start "entryRuleTernaryOperation"
    // InternalKExt.g:4555:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKExt.g:4556:2: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKExt.g:4557:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTernaryOperation=ruleTernaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTernaryOperation; 
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
    // $ANTLR end "entryRuleTernaryOperation"


    // $ANTLR start "ruleTernaryOperation"
    // InternalKExt.g:4564:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_AtomicValuedExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4567:28: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) )
            // InternalKExt.g:4568:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            {
            // InternalKExt.g:4568:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            int alt114=2;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // InternalKExt.g:4568:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKExt.g:4568:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    // InternalKExt.g:4568:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKExt.g:4568:3: ()
                    // InternalKExt.g:4569:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTernaryOperationAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalKExt.g:4577:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKExt.g:4578:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExt.g:4578:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKExt.g:4579:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4595:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKExt.g:4596:1: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKExt.g:4596:1: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKExt.g:4597:3: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_operator_2_0=ruleConditionalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ConditionalOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:4613:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExt.g:4614:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExt.g:4614:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExt.g:4615:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_69);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4());
                          
                    }
                    // InternalKExt.g:4635:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    // InternalKExt.g:4636:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExt.g:4636:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    // InternalKExt.g:4637:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:4655:2: this_AtomicValuedExpression_6= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTernaryOperationAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_6=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_6; 
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
    // $ANTLR end "ruleTernaryOperation"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKExt.g:4674:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKExt.g:4675:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKExt.g:4676:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKExt.g:4683:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_RandomCall_7 = null;

        EObject this_RandomizeCall_8 = null;

        EObject this_TextExpression_9 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4686:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) )
            // InternalKExt.g:4687:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            {
            // InternalKExt.g:4687:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            int alt115=8;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // InternalKExt.g:4688:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalKExt.g:4701:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalKExt.g:4713:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKExt.g:4713:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKExt.g:4713:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExt.g:4735:2: this_ReferenceCall_5= ruleReferenceCall
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
                    // InternalKExt.g:4748:2: this_FunctionCall_6= ruleFunctionCall
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
                    // InternalKExt.g:4761:2: this_RandomCall_7= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_7=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RandomCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalKExt.g:4774:2: this_RandomizeCall_8= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_8=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RandomizeCall_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalKExt.g:4787:2: this_TextExpression_9= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_9=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_9; 
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
    // InternalKExt.g:4806:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKExt.g:4807:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKExt.g:4808:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKExt.g:4815:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_VectorValue_3 = null;

        EObject this_ValuedExpression_5 = null;

        EObject this_AtomicExpression_7 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:4818:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKExt.g:4819:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKExt.g:4819:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt116=6;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // InternalKExt.g:4820:2: this_IntValue_0= ruleIntValue
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
                    // InternalKExt.g:4833:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalKExt.g:4846:2: this_StringValue_2= ruleStringValue
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
                    // InternalKExt.g:4859:2: this_VectorValue_3= ruleVectorValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVectorValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VectorValue_3=ruleVectorValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VectorValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalKExt.g:4871:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKExt.g:4871:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKExt.g:4871:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExt.g:4893:2: this_AtomicExpression_7= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_7=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_7; 
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
    // InternalKExt.g:4912:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKExt.g:4913:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKExt.g:4914:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKExt.g:4921:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalKExt.g:4924:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKExt.g:4925:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKExt.g:4925:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==86||LA118_0==88) ) {
                alt118=1;
            }
            else if ( (LA118_0==RULE_ID) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalKExt.g:4925:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKExt.g:4925:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKExt.g:4925:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKExt.g:4925:3: ()
                    // InternalKExt.g:4926:2: 
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

                    // InternalKExt.g:4934:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKExt.g:4935:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKExt.g:4935:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKExt.g:4936:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKExt.g:4936:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==86) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==88) ) {
                        alt117=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // InternalKExt.g:4937:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_50);
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
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalKExt.g:4952:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_50);
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
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKExt.g:4974:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKExt.g:4975:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKExt.g:4975:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKExt.g:4976:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:4998:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalKExt.g:5017:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKExt.g:5018:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKExt.g:5019:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKExt.g:5026:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5029:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKExt.g:5030:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKExt.g:5030:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKExt.g:5030:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKExt.g:5037:1: (kw= '\\'' )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==56) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalKExt.g:5038:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // InternalKExt.g:5051:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKExt.g:5052:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKExt.g:5053:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKExt.g:5060:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5063:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKExt.g:5064:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKExt.g:5064:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKExt.g:5064:2: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKExt.g:5064:2: ( ( rulePrimeID ) )
            // InternalKExt.g:5065:1: ( rulePrimeID )
            {
            // InternalKExt.g:5065:1: ( rulePrimeID )
            // InternalKExt.g:5066:3: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_72);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:5082:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==33) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // InternalKExt.g:5082:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalKExt.g:5086:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKExt.g:5087:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKExt.g:5087:1: (lv_indices_2_0= ruleExpression )
            	    // InternalKExt.g:5088:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            // InternalKExt.g:5108:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==57) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalKExt.g:5108:5: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalKExt.g:5112:1: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKExt.g:5113:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKExt.g:5113:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKExt.g:5114:3: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalKExt.g:5138:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKExt.g:5139:2: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKExt.g:5140:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleObjectReference=ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleObjectReference; 
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
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalKExt.g:5147:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5150:28: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKExt.g:5151:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKExt.g:5151:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKExt.g:5151:2: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKExt.g:5151:2: ( ( rulePrimeID ) )
            // InternalKExt.g:5152:1: ( rulePrimeID )
            {
            // InternalKExt.g:5152:1: ( rulePrimeID )
            // InternalKExt.g:5153:3: rulePrimeID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_73);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:5169:2: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKExt.g:5170:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalKExt.g:5170:1: (lv_priority_1_0= RULE_INT )
            // InternalKExt.g:5171:3: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_1_0, grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKExt.g:5195:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKExt.g:5196:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKExt.g:5197:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKExt.g:5204:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
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
            // InternalKExt.g:5207:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKExt.g:5208:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKExt.g:5208:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKExt.g:5208:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKExt.g:5208:2: ( ( rulePrimeID ) )
            // InternalKExt.g:5209:1: ( rulePrimeID )
            {
            // InternalKExt.g:5209:1: ( rulePrimeID )
            // InternalKExt.g:5210:3: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_45);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:5226:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==37) ) {
                alt123=1;
            }
            else if ( (LA123_0==40) ) {
                alt123=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalKExt.g:5226:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKExt.g:5226:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKExt.g:5226:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKExt.g:5230:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKExt.g:5231:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKExt.g:5231:1: (lv_parameters_2_0= ruleParameter )
                    // InternalKExt.g:5232:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:5248:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==26) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalKExt.g:5248:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:5252:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKExt.g:5253:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKExt.g:5253:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKExt.g:5254:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:5275:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleRandomCall"
    // InternalKExt.g:5287:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKExt.g:5288:2: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKExt.g:5289:2: iv_ruleRandomCall= ruleRandomCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomCall=ruleRandomCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomCall; 
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
    // $ANTLR end "entryRuleRandomCall"


    // $ANTLR start "ruleRandomCall"
    // InternalKExt.g:5296:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5299:28: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKExt.g:5300:1: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKExt.g:5300:1: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKExt.g:5300:2: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKExt.g:5300:2: ()
            // InternalKExt.g:5301:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRandomCallAccess().getRandomCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
                  
            }
            // InternalKExt.g:5313:1: (otherlv_2= '()' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==40) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalKExt.g:5313:3: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRandomCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                          
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
    // $ANTLR end "ruleRandomCall"


    // $ANTLR start "entryRuleRandomizeCall"
    // InternalKExt.g:5325:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKExt.g:5326:2: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKExt.g:5327:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCall=ruleRandomizeCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCall; 
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
    // $ANTLR end "entryRuleRandomizeCall"


    // $ANTLR start "ruleRandomizeCall"
    // InternalKExt.g:5334:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5337:28: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKExt.g:5338:1: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKExt.g:5338:1: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKExt.g:5338:2: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKExt.g:5338:2: ()
            // InternalKExt.g:5339:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRandomizeCallAccess().getRandomizeCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
                  
            }
            // InternalKExt.g:5351:1: (otherlv_2= '()' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==40) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalKExt.g:5351:3: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRandomizeCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                          
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
    // $ANTLR end "ruleRandomizeCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKExt.g:5363:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKExt.g:5364:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKExt.g:5365:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKExt.g:5372:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

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
            // InternalKExt.g:5375:28: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKExt.g:5376:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKExt.g:5376:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKExt.g:5376:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
                  
            }
            // InternalKExt.g:5380:1: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKExt.g:5381:1: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKExt.g:5381:1: (lv_functionName_1_0= RULE_ID )
            // InternalKExt.g:5382:3: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.annotations.Annotations.ID");
              	    
            }

            }


            }

            // InternalKExt.g:5398:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==37) ) {
                alt127=1;
            }
            else if ( (LA127_0==40) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalKExt.g:5398:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKExt.g:5398:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKExt.g:5398:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKExt.g:5402:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKExt.g:5403:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKExt.g:5403:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKExt.g:5404:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKExt.g:5420:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==26) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalKExt.g:5420:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKExt.g:5424:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKExt.g:5425:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKExt.g:5425:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKExt.g:5426:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:5447:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKExt.g:5459:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKExt.g:5460:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKExt.g:5461:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKExt.g:5468:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5471:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKExt.g:5472:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKExt.g:5472:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKExt.g:5472:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKExt.g:5472:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==59) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==47) ) {
                    alt129=1;
                }
            }
            else if ( (LA129_0==47) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalKExt.g:5472:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKExt.g:5472:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==59) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalKExt.g:5473:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKExt.g:5473:1: (lv_pureOutput_0_0= '!' )
                            // InternalKExt.g:5474:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,59,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

                    // InternalKExt.g:5487:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKExt.g:5488:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKExt.g:5488:1: (lv_callByReference_1_0= '&' )
                    // InternalKExt.g:5489:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,47,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            // InternalKExt.g:5502:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKExt.g:5503:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKExt.g:5503:1: (lv_expression_2_0= ruleExpression )
            // InternalKExt.g:5504:3: lv_expression_2_0= ruleExpression
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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
    // InternalKExt.g:5528:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKExt.g:5529:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKExt.g:5530:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKExt.g:5537:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5540:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKExt.g:5541:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKExt.g:5541:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKExt.g:5542:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKExt.g:5542:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKExt.g:5543:3: lv_text_0_0= RULE_HOSTCODE
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // InternalKExt.g:5567:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKExt.g:5568:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKExt.g:5569:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKExt.g:5576:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5579:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKExt.g:5580:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKExt.g:5580:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKExt.g:5581:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKExt.g:5581:1: (lv_value_0_0= RULE_INT )
            // InternalKExt.g:5582:3: lv_value_0_0= RULE_INT
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
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // InternalKExt.g:5606:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKExt.g:5607:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKExt.g:5608:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKExt.g:5615:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5618:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKExt.g:5619:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKExt.g:5619:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKExt.g:5620:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKExt.g:5620:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKExt.g:5621:3: lv_value_0_0= RULE_FLOAT
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
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // InternalKExt.g:5645:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKExt.g:5646:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKExt.g:5647:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKExt.g:5654:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5657:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKExt.g:5658:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKExt.g:5658:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKExt.g:5659:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKExt.g:5659:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKExt.g:5660:3: lv_value_0_0= RULE_BOOLEAN
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
                      		"de.cau.cs.kieler.annotations.Annotations.BOOLEAN");
              	    
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
    // InternalKExt.g:5684:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKExt.g:5685:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKExt.g:5686:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKExt.g:5693:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5696:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKExt.g:5697:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKExt.g:5697:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKExt.g:5698:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKExt.g:5698:1: (lv_value_0_0= RULE_STRING )
            // InternalKExt.g:5699:3: lv_value_0_0= RULE_STRING
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
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
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


    // $ANTLR start "entryRuleVectorValue"
    // InternalKExt.g:5723:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKExt.g:5724:2: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKExt.g:5725:2: iv_ruleVectorValue= ruleVectorValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValue=ruleVectorValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValue; 
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
    // $ANTLR end "entryRuleVectorValue"


    // $ANTLR start "ruleVectorValue"
    // InternalKExt.g:5732:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5735:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKExt.g:5736:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKExt.g:5736:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKExt.g:5736:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalKExt.g:5740:1: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKExt.g:5741:1: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKExt.g:5741:1: (lv_values_1_0= ruleVectorValueMember )
            // InternalKExt.g:5742:3: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_values_1_0=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:5758:2: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==26) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalKExt.g:5758:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalKExt.g:5762:1: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKExt.g:5763:1: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKExt.g:5763:1: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKExt.g:5764:3: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_values_3_0=ruleVectorValueMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVectorValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleVectorValue"


    // $ANTLR start "entryRuleVectorValueMember"
    // InternalKExt.g:5792:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKExt.g:5793:2: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKExt.g:5794:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValueMember=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValueMember; 
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
    // $ANTLR end "entryRuleVectorValueMember"


    // $ANTLR start "ruleVectorValueMember"
    // InternalKExt.g:5801:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5804:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKExt.g:5805:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKExt.g:5805:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt131=3;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // InternalKExt.g:5806:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getBoolExpressionParserRuleCall_0()); 
                          
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
                    // InternalKExt.g:5819:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getValuedExpressionParserRuleCall_1()); 
                          
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
                case 3 :
                    // InternalKExt.g:5832:2: this_IgnoreValue_2= ruleIgnoreValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVectorValueMemberAccess().getIgnoreValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IgnoreValue_2=ruleIgnoreValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IgnoreValue_2; 
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
    // $ANTLR end "ruleVectorValueMember"


    // $ANTLR start "entryRuleIgnoreValue"
    // InternalKExt.g:5851:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKExt.g:5852:2: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKExt.g:5853:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIgnoreValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgnoreValue=ruleIgnoreValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIgnoreValue; 
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
    // $ANTLR end "entryRuleIgnoreValue"


    // $ANTLR start "ruleIgnoreValue"
    // InternalKExt.g:5860:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:5863:28: ( ( () otherlv_1= '_' ) )
            // InternalKExt.g:5864:1: ( () otherlv_1= '_' )
            {
            // InternalKExt.g:5864:1: ( () otherlv_1= '_' )
            // InternalKExt.g:5864:2: () otherlv_1= '_'
            {
            // InternalKExt.g:5864:2: ()
            // InternalKExt.g:5865:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIgnoreValueAccess().getIgnoreValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIgnoreValueAccess().get_Keyword_1());
                  
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
    // $ANTLR end "ruleIgnoreValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKExt.g:5889:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKExt.g:5890:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKExt.g:5891:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalKExt.g:5898:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5901:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExt.g:5902:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExt.g:5902:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt132=4;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalKExt.g:5903:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKExt.g:5916:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalKExt.g:5929:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
                    // InternalKExt.g:5942:2: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKExt.g:5967:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalKExt.g:5968:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalKExt.g:5969:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
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
    // InternalKExt.g:5976:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:5979:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExt.g:5980:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExt.g:5980:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt133=4;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // InternalKExt.g:5981:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKExt.g:5994:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalKExt.g:6007:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalKExt.g:6020:2: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKExt.g:6039:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKExt.g:6040:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKExt.g:6041:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKExt.g:6048:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:6051:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKExt.g:6052:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKExt.g:6052:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKExt.g:6053:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKExt.g:6053:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKExt.g:6054:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
                      		"de.cau.cs.kieler.annotations.Annotations.COMMENT_ANNOTATION");
              	    
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


    // $ANTLR start "entryRuleCommentAnnotatonSL"
    // InternalKExt.g:6078:1: entryRuleCommentAnnotatonSL returns [EObject current=null] : iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF ;
    public final EObject entryRuleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotatonSL = null;


        try {
            // InternalKExt.g:6079:2: (iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF )
            // InternalKExt.g:6080:2: iv_ruleCommentAnnotatonSL= ruleCommentAnnotatonSL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotatonSLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotatonSL=ruleCommentAnnotatonSL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotatonSL; 
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
    // $ANTLR end "entryRuleCommentAnnotatonSL"


    // $ANTLR start "ruleCommentAnnotatonSL"
    // InternalKExt.g:6087:1: ruleCommentAnnotatonSL returns [EObject current=null] : ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotatonSL() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:6090:28: ( ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) ) )
            // InternalKExt.g:6091:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            {
            // InternalKExt.g:6091:1: ( (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION ) )
            // InternalKExt.g:6092:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            {
            // InternalKExt.g:6092:1: (lv_values_0_0= RULE_SL_COMMENT_ANNOTATION )
            // InternalKExt.g:6093:3: lv_values_0_0= RULE_SL_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_SL_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotatonSLAccess().getValuesSL_COMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotatonSLRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.SL_COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotatonSL"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKExt.g:6117:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKExt.g:6118:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKExt.g:6119:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKExt.g:6126:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6129:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExt.g:6130:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExt.g:6130:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExt.g:6130:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6134:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6135:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6135:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6136:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
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


    // $ANTLR start "entryRulePragmaTag"
    // InternalKExt.g:6160:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKExt.g:6161:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKExt.g:6162:2: iv_rulePragmaTag= rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragmaTag=rulePragmaTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTag; 
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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKExt.g:6169:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6172:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExt.g:6173:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExt.g:6173:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExt.g:6173:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKExt.g:6177:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6178:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6178:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6179:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPragmaTagRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
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
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKExt.g:6203:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6204:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKExt.g:6205:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6212:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6215:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExt.g:6216:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExt.g:6216:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExt.g:6216:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6220:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6221:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6221:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6222:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_77);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6238:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExt.g:6239:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExt.g:6239:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExt.g:6240:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_78);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6256:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==26) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // InternalKExt.g:6256:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:6260:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExt.g:6261:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExt.g:6261:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExt.g:6262:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop134;
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
    // InternalKExt.g:6286:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6287:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExt.g:6288:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6295:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6298:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExt.g:6299:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExt.g:6299:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKExt.g:6299:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6303:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6304:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6304:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6305:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_79);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6321:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKExt.g:6322:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKExt.g:6322:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKExt.g:6323:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_78);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6339:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==26) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalKExt.g:6339:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:6343:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKExt.g:6344:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKExt.g:6344:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKExt.g:6345:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
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


    // $ANTLR start "entryRuleStringPragma"
    // InternalKExt.g:6369:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKExt.g:6370:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKExt.g:6371:2: iv_ruleStringPragma= ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringPragma=ruleStringPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringPragma; 
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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKExt.g:6378:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6381:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExt.g:6382:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExt.g:6382:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExt.g:6382:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKExt.g:6386:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6387:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6387:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6388:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_77);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6404:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExt.g:6405:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExt.g:6405:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExt.g:6406:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_78);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6422:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==26) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalKExt.g:6422:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:6426:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExt.g:6427:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExt.g:6427:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExt.g:6428:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringPragmaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop136;
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
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKExt.g:6452:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6453:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExt.g:6454:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6461:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKExt.g:6464:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExt.g:6465:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExt.g:6465:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKExt.g:6465:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6469:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6470:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6470:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6471:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_80);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKExt.g:6491:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExt.g:6492:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExt.g:6492:1: (lv_type_3_0= ruleExtendedID )
            // InternalKExt.g:6493:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_34);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKExt.g:6513:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKExt.g:6514:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKExt.g:6514:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKExt.g:6515:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_78);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6531:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==26) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // InternalKExt.g:6531:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKExt.g:6535:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKExt.g:6536:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExt.g:6536:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKExt.g:6537:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop137;
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
    // InternalKExt.g:6561:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6562:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExt.g:6563:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6570:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKExt.g:6573:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExt.g:6574:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExt.g:6574:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKExt.g:6574:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6578:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6579:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6579:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6580:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_80);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKExt.g:6600:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExt.g:6601:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExt.g:6601:1: (lv_type_3_0= ruleExtendedID )
            // InternalKExt.g:6602:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_34);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKExt.g:6622:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKExt.g:6623:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKExt.g:6623:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKExt.g:6624:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_78);
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
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6640:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==26) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // InternalKExt.g:6640:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKExt.g:6644:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKExt.g:6645:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKExt.g:6645:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKExt.g:6646:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop138;
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
    // InternalKExt.g:6670:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6671:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExt.g:6672:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6679:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6682:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKExt.g:6683:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKExt.g:6683:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKExt.g:6683:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6687:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6688:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6688:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6689:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_81);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKExt.g:6705:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKExt.g:6706:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKExt.g:6706:1: (lv_values_2_0= RULE_STRING )
            // InternalKExt.g:6707:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_78); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKExt.g:6723:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==26) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // InternalKExt.g:6723:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKExt.g:6727:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKExt.g:6728:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKExt.g:6728:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKExt.g:6729:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_78); if (state.failed) return current;
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
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop139;
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
    // InternalKExt.g:6753:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExt.g:6754:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExt.g:6755:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExt.g:6762:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKExt.g:6765:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKExt.g:6766:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKExt.g:6766:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKExt.g:6766:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKExt.g:6770:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExt.g:6771:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExt.g:6771:1: (lv_name_1_0= ruleExtendedID )
            // InternalKExt.g:6772:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_80);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKExt.g:6792:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExt.g:6793:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExt.g:6793:1: (lv_type_3_0= ruleExtendedID )
            // InternalKExt.g:6794:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_34);
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKExt.g:6814:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKExt.g:6815:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKExt.g:6815:1: (lv_values_5_0= RULE_STRING )
            // InternalKExt.g:6816:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_78); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalKExt.g:6832:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==26) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // InternalKExt.g:6832:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKExt.g:6836:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKExt.g:6837:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKExt.g:6837:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKExt.g:6838:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_78); if (state.failed) return current;
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
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop140;
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
    // InternalKExt.g:6864:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKExt.g:6865:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKExt.g:6866:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKExt.g:6873:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6876:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKExt.g:6877:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKExt.g:6877:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt141=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt141=1;
                }
                break;
            case RULE_ID:
                {
                alt141=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt141=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalKExt.g:6877:6: this_STRING_0= RULE_STRING
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
                    // InternalKExt.g:6886:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKExt.g:6897:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKExt.g:6912:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKExt.g:6913:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKExt.g:6914:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKExt.g:6921:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKExt.g:6924:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKExt.g:6925:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKExt.g:6925:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt142=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt142=1;
                }
                break;
            case RULE_ID:
                {
                alt142=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt142=3;
                }
                break;
            case 52:
                {
                int LA142_4 = input.LA(2);

                if ( (LA142_4==RULE_INT) ) {
                    alt142=4;
                }
                else if ( (LA142_4==RULE_FLOAT) ) {
                    alt142=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt142=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt142=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // InternalKExt.g:6925:6: this_STRING_0= RULE_STRING
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
                    // InternalKExt.g:6934:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKExt.g:6945:10: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKExt.g:6954:5: this_Integer_3= ruleInteger
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
                    // InternalKExt.g:6966:5: this_Floateger_4= ruleFloateger
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
    // InternalKExt.g:6984:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKExt.g:6985:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKExt.g:6986:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKExt.g:6993:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:6996:28: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKExt.g:6997:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKExt.g:6997:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKExt.g:6997:6: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKExt.g:7004:1: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==52) ) {
                    int LA144_2 = input.LA(2);

                    if ( (LA144_2==RULE_ID) ) {
                        alt144=1;
                    }


                }
                else if ( (LA144_0==57) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalKExt.g:7004:2: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKExt.g:7004:2: (kw= '.' | kw= '-' )
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==57) ) {
            	        alt143=1;
            	    }
            	    else if ( (LA143_0==52) ) {
            	        alt143=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 143, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // InternalKExt.g:7005:2: kw= '.'
            	            {
            	            kw=(Token)match(input,57,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKExt.g:7012:2: kw= '-'
            	            {
            	            kw=(Token)match(input,52,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);

            // InternalKExt.g:7024:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==62) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalKExt.g:7025:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // InternalKExt.g:7047:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKExt.g:7048:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKExt.g:7049:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKExt.g:7056:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:7059:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKExt.g:7060:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKExt.g:7060:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKExt.g:7060:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKExt.g:7060:2: (kw= '-' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==52) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalKExt.g:7061:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_73); if (state.failed) return current;
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
    // InternalKExt.g:7081:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKExt.g:7082:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKExt.g:7083:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKExt.g:7090:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKExt.g:7093:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKExt.g:7094:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKExt.g:7094:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKExt.g:7094:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKExt.g:7094:2: (kw= '-' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==52) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalKExt.g:7095:2: kw= '-'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_83); if (state.failed) return current;
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


    // $ANTLR start "rulePriorityProtocol"
    // InternalKExt.g:7119:1: rulePriorityProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) ;
    public final Enumerator rulePriorityProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKExt.g:7121:28: ( ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) ) )
            // InternalKExt.g:7122:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            {
            // InternalKExt.g:7122:1: ( (enumLiteral_0= 'conflict' ) | (enumLiteral_1= 'confluent' ) )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==63) ) {
                alt148=1;
            }
            else if ( (LA148_0==64) ) {
                alt148=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // InternalKExt.g:7122:2: (enumLiteral_0= 'conflict' )
                    {
                    // InternalKExt.g:7122:2: (enumLiteral_0= 'conflict' )
                    // InternalKExt.g:7122:4: enumLiteral_0= 'conflict'
                    {
                    enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPriorityProtocolAccess().getCONFLICTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPriorityProtocolAccess().getCONFLICTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7128:6: (enumLiteral_1= 'confluent' )
                    {
                    // InternalKExt.g:7128:6: (enumLiteral_1= 'confluent' )
                    // InternalKExt.g:7128:8: enumLiteral_1= 'confluent'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPriorityProtocolAccess().getCONFLUENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPriorityProtocolAccess().getCONFLUENTEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "rulePriorityProtocol"


    // $ANTLR start "ruleAssignOperator"
    // InternalKExt.g:7138:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) ;
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
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;

         enterRule(); 
        try {
            // InternalKExt.g:7140:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) ) )
            // InternalKExt.g:7141:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            {
            // InternalKExt.g:7141:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) | (enumLiteral_9= '<<=' ) | (enumLiteral_10= '>>=' ) | (enumLiteral_11= '>>>=' ) | (enumLiteral_12= 'min=' ) | (enumLiteral_13= 'max=' ) )
            int alt149=14;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt149=1;
                }
                break;
            case 65:
                {
                alt149=2;
                }
                break;
            case 66:
                {
                alt149=3;
                }
                break;
            case 67:
                {
                alt149=4;
                }
                break;
            case 68:
                {
                alt149=5;
                }
                break;
            case 69:
                {
                alt149=6;
                }
                break;
            case 70:
                {
                alt149=7;
                }
                break;
            case 71:
                {
                alt149=8;
                }
                break;
            case 72:
                {
                alt149=9;
                }
                break;
            case 73:
                {
                alt149=10;
                }
                break;
            case 74:
                {
                alt149=11;
                }
                break;
            case 75:
                {
                alt149=12;
                }
                break;
            case 76:
                {
                alt149=13;
                }
                break;
            case 77:
                {
                alt149=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalKExt.g:7141:2: (enumLiteral_0= '=' )
                    {
                    // InternalKExt.g:7141:2: (enumLiteral_0= '=' )
                    // InternalKExt.g:7141:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7147:6: (enumLiteral_1= '+=' )
                    {
                    // InternalKExt.g:7147:6: (enumLiteral_1= '+=' )
                    // InternalKExt.g:7147:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExt.g:7153:6: (enumLiteral_2= '-=' )
                    {
                    // InternalKExt.g:7153:6: (enumLiteral_2= '-=' )
                    // InternalKExt.g:7153:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExt.g:7159:6: (enumLiteral_3= '*=' )
                    {
                    // InternalKExt.g:7159:6: (enumLiteral_3= '*=' )
                    // InternalKExt.g:7159:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExt.g:7165:6: (enumLiteral_4= '/=' )
                    {
                    // InternalKExt.g:7165:6: (enumLiteral_4= '/=' )
                    // InternalKExt.g:7165:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExt.g:7171:6: (enumLiteral_5= '%=' )
                    {
                    // InternalKExt.g:7171:6: (enumLiteral_5= '%=' )
                    // InternalKExt.g:7171:8: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExt.g:7177:6: (enumLiteral_6= '&=' )
                    {
                    // InternalKExt.g:7177:6: (enumLiteral_6= '&=' )
                    // InternalKExt.g:7177:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExt.g:7183:6: (enumLiteral_7= '|=' )
                    {
                    // InternalKExt.g:7183:6: (enumLiteral_7= '|=' )
                    // InternalKExt.g:7183:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKExt.g:7189:6: (enumLiteral_8= '^=' )
                    {
                    // InternalKExt.g:7189:6: (enumLiteral_8= '^=' )
                    // InternalKExt.g:7189:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKExt.g:7195:6: (enumLiteral_9= '<<=' )
                    {
                    // InternalKExt.g:7195:6: (enumLiteral_9= '<<=' )
                    // InternalKExt.g:7195:8: enumLiteral_9= '<<='
                    {
                    enumLiteral_9=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTLEFTEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalKExt.g:7201:6: (enumLiteral_10= '>>=' )
                    {
                    // InternalKExt.g:7201:6: (enumLiteral_10= '>>=' )
                    // InternalKExt.g:7201:8: enumLiteral_10= '>>='
                    {
                    enumLiteral_10=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalKExt.g:7207:6: (enumLiteral_11= '>>>=' )
                    {
                    // InternalKExt.g:7207:6: (enumLiteral_11= '>>>=' )
                    // InternalKExt.g:7207:8: enumLiteral_11= '>>>='
                    {
                    enumLiteral_11=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getAssignOperatorAccess().getASSIGNSHIFTRIGHTUNSIGNEDEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalKExt.g:7213:6: (enumLiteral_12= 'min=' )
                    {
                    // InternalKExt.g:7213:6: (enumLiteral_12= 'min=' )
                    // InternalKExt.g:7213:8: enumLiteral_12= 'min='
                    {
                    enumLiteral_12=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getAssignOperatorAccess().getASSIGNMINEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalKExt.g:7219:6: (enumLiteral_13= 'max=' )
                    {
                    // InternalKExt.g:7219:6: (enumLiteral_13= 'max=' )
                    // InternalKExt.g:7219:8: enumLiteral_13= 'max='
                    {
                    enumLiteral_13=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getAssignOperatorAccess().getASSIGNMAXEnumLiteralDeclaration_13()); 
                          
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
    // InternalKExt.g:7229:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKExt.g:7231:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalKExt.g:7232:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalKExt.g:7232:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==78) ) {
                alt150=1;
            }
            else if ( (LA150_0==79) ) {
                alt150=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // InternalKExt.g:7232:2: (enumLiteral_0= '++' )
                    {
                    // InternalKExt.g:7232:2: (enumLiteral_0= '++' )
                    // InternalKExt.g:7232:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7238:6: (enumLiteral_1= '--' )
                    {
                    // InternalKExt.g:7238:6: (enumLiteral_1= '--' )
                    // InternalKExt.g:7238:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7248:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKExt.g:7250:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKExt.g:7251:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKExt.g:7251:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt151=6;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt151=1;
                }
                break;
            case 81:
                {
                alt151=2;
                }
                break;
            case 82:
                {
                alt151=3;
                }
                break;
            case 83:
                {
                alt151=4;
                }
                break;
            case 84:
                {
                alt151=5;
                }
                break;
            case 85:
                {
                alt151=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalKExt.g:7251:2: (enumLiteral_0= '==' )
                    {
                    // InternalKExt.g:7251:2: (enumLiteral_0= '==' )
                    // InternalKExt.g:7251:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7257:6: (enumLiteral_1= '<' )
                    {
                    // InternalKExt.g:7257:6: (enumLiteral_1= '<' )
                    // InternalKExt.g:7257:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExt.g:7263:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKExt.g:7263:6: (enumLiteral_2= '<=' )
                    // InternalKExt.g:7263:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExt.g:7269:6: (enumLiteral_3= '>' )
                    {
                    // InternalKExt.g:7269:6: (enumLiteral_3= '>' )
                    // InternalKExt.g:7269:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExt.g:7275:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKExt.g:7275:6: (enumLiteral_4= '>=' )
                    // InternalKExt.g:7275:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExt.g:7281:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKExt.g:7281:6: (enumLiteral_5= '!=' )
                    // InternalKExt.g:7281:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7291:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7293:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKExt.g:7294:1: (enumLiteral_0= 'pre' )
            {
            // InternalKExt.g:7294:1: (enumLiteral_0= 'pre' )
            // InternalKExt.g:7294:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleBitwiseNotOperator"
    // InternalKExt.g:7304:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7306:28: ( (enumLiteral_0= '~' ) )
            // InternalKExt.g:7307:1: (enumLiteral_0= '~' )
            {
            // InternalKExt.g:7307:1: (enumLiteral_0= '~' )
            // InternalKExt.g:7307:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseNotOperator"


    // $ANTLR start "ruleBitwiseXOrOperator"
    // InternalKExt.g:7317:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7319:28: ( (enumLiteral_0= '^' ) )
            // InternalKExt.g:7320:1: (enumLiteral_0= '^' )
            {
            // InternalKExt.g:7320:1: (enumLiteral_0= '^' )
            // InternalKExt.g:7320:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleBitwiseXOrOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKExt.g:7330:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7332:28: ( (enumLiteral_0= '|' ) )
            // InternalKExt.g:7333:1: (enumLiteral_0= '|' )
            {
            // InternalKExt.g:7333:1: (enumLiteral_0= '|' )
            // InternalKExt.g:7333:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7343:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7345:28: ( (enumLiteral_0= '&' ) )
            // InternalKExt.g:7346:1: (enumLiteral_0= '&' )
            {
            // InternalKExt.g:7346:1: (enumLiteral_0= '&' )
            // InternalKExt.g:7346:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7356:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7358:28: ( (enumLiteral_0= '!' ) )
            // InternalKExt.g:7359:1: (enumLiteral_0= '!' )
            {
            // InternalKExt.g:7359:1: (enumLiteral_0= '!' )
            // InternalKExt.g:7359:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7369:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7371:28: ( (enumLiteral_0= '+' ) )
            // InternalKExt.g:7372:1: (enumLiteral_0= '+' )
            {
            // InternalKExt.g:7372:1: (enumLiteral_0= '+' )
            // InternalKExt.g:7372:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7382:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7384:28: ( (enumLiteral_0= '-' ) )
            // InternalKExt.g:7385:1: (enumLiteral_0= '-' )
            {
            // InternalKExt.g:7385:1: (enumLiteral_0= '-' )
            // InternalKExt.g:7385:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7395:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7397:28: ( (enumLiteral_0= '*' ) )
            // InternalKExt.g:7398:1: (enumLiteral_0= '*' )
            {
            // InternalKExt.g:7398:1: (enumLiteral_0= '*' )
            // InternalKExt.g:7398:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7408:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7410:28: ( (enumLiteral_0= '%' ) )
            // InternalKExt.g:7411:1: (enumLiteral_0= '%' )
            {
            // InternalKExt.g:7411:1: (enumLiteral_0= '%' )
            // InternalKExt.g:7411:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7421:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7423:28: ( (enumLiteral_0= '/' ) )
            // InternalKExt.g:7424:1: (enumLiteral_0= '/' )
            {
            // InternalKExt.g:7424:1: (enumLiteral_0= '/' )
            // InternalKExt.g:7424:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7434:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7436:28: ( (enumLiteral_0= 'val' ) )
            // InternalKExt.g:7437:1: (enumLiteral_0= 'val' )
            {
            // InternalKExt.g:7437:1: (enumLiteral_0= 'val' )
            // InternalKExt.g:7437:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7447:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7449:28: ( (enumLiteral_0= '||' ) )
            // InternalKExt.g:7450:1: (enumLiteral_0= '||' )
            {
            // InternalKExt.g:7450:1: (enumLiteral_0= '||' )
            // InternalKExt.g:7450:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7460:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7462:28: ( (enumLiteral_0= '&&' ) )
            // InternalKExt.g:7463:1: (enumLiteral_0= '&&' )
            {
            // InternalKExt.g:7463:1: (enumLiteral_0= '&&' )
            // InternalKExt.g:7463:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleShiftLeftOperator"
    // InternalKExt.g:7473:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7475:28: ( (enumLiteral_0= '<<' ) )
            // InternalKExt.g:7476:1: (enumLiteral_0= '<<' )
            {
            // InternalKExt.g:7476:1: (enumLiteral_0= '<<' )
            // InternalKExt.g:7476:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftLeftOperator"


    // $ANTLR start "ruleShiftRightOperator"
    // InternalKExt.g:7486:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7488:28: ( (enumLiteral_0= '>>' ) )
            // InternalKExt.g:7489:1: (enumLiteral_0= '>>' )
            {
            // InternalKExt.g:7489:1: (enumLiteral_0= '>>' )
            // InternalKExt.g:7489:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftRightOperator"


    // $ANTLR start "ruleShiftRightUnsignedOperator"
    // InternalKExt.g:7499:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7501:28: ( (enumLiteral_0= '>>>' ) )
            // InternalKExt.g:7502:1: (enumLiteral_0= '>>>' )
            {
            // InternalKExt.g:7502:1: (enumLiteral_0= '>>>' )
            // InternalKExt.g:7502:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleShiftRightUnsignedOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKExt.g:7516:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKExt.g:7518:28: ( (enumLiteral_0= '?' ) )
            // InternalKExt.g:7519:1: (enumLiteral_0= '?' )
            {
            // InternalKExt.g:7519:1: (enumLiteral_0= '?' )
            // InternalKExt.g:7519:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "ruleValueType"
    // InternalKExt.g:7529:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // InternalKExt.g:7531:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalKExt.g:7532:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalKExt.g:7532:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt152=7;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt152=1;
                }
                break;
            case 91:
                {
                alt152=2;
                }
                break;
            case 92:
                {
                alt152=3;
                }
                break;
            case 93:
                {
                alt152=4;
                }
                break;
            case 94:
                {
                alt152=5;
                }
                break;
            case 95:
                {
                alt152=6;
                }
                break;
            case 96:
                {
                alt152=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalKExt.g:7532:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalKExt.g:7532:2: (enumLiteral_0= 'pure' )
                    // InternalKExt.g:7532:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7538:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalKExt.g:7538:6: (enumLiteral_1= 'bool' )
                    // InternalKExt.g:7538:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExt.g:7544:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalKExt.g:7544:6: (enumLiteral_2= 'unsigned' )
                    // InternalKExt.g:7544:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExt.g:7550:6: (enumLiteral_3= 'int' )
                    {
                    // InternalKExt.g:7550:6: (enumLiteral_3= 'int' )
                    // InternalKExt.g:7550:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExt.g:7556:6: (enumLiteral_4= 'float' )
                    {
                    // InternalKExt.g:7556:6: (enumLiteral_4= 'float' )
                    // InternalKExt.g:7556:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExt.g:7562:6: (enumLiteral_5= 'string' )
                    {
                    // InternalKExt.g:7562:6: (enumLiteral_5= 'string' )
                    // InternalKExt.g:7562:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExt.g:7568:6: (enumLiteral_6= 'host' )
                    {
                    // InternalKExt.g:7568:6: (enumLiteral_6= 'host' )
                    // InternalKExt.g:7568:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExt.g:7580:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalKExt.g:7582:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalKExt.g:7583:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalKExt.g:7583:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt153=8;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt153=1;
                }
                break;
            case 51:
                {
                alt153=2;
                }
                break;
            case 53:
                {
                alt153=3;
                }
                break;
            case 98:
                {
                alt153=4;
                }
                break;
            case 99:
                {
                alt153=5;
                }
                break;
            case 45:
                {
                alt153=6;
                }
                break;
            case 47:
                {
                alt153=7;
                }
                break;
            case 96:
                {
                alt153=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalKExt.g:7583:2: (enumLiteral_0= 'none' )
                    {
                    // InternalKExt.g:7583:2: (enumLiteral_0= 'none' )
                    // InternalKExt.g:7583:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExt.g:7589:6: (enumLiteral_1= '+' )
                    {
                    // InternalKExt.g:7589:6: (enumLiteral_1= '+' )
                    // InternalKExt.g:7589:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExt.g:7595:6: (enumLiteral_2= '*' )
                    {
                    // InternalKExt.g:7595:6: (enumLiteral_2= '*' )
                    // InternalKExt.g:7595:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExt.g:7601:6: (enumLiteral_3= 'max' )
                    {
                    // InternalKExt.g:7601:6: (enumLiteral_3= 'max' )
                    // InternalKExt.g:7601:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExt.g:7607:6: (enumLiteral_4= 'min' )
                    {
                    // InternalKExt.g:7607:6: (enumLiteral_4= 'min' )
                    // InternalKExt.g:7607:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExt.g:7613:6: (enumLiteral_5= '|' )
                    {
                    // InternalKExt.g:7613:6: (enumLiteral_5= '|' )
                    // InternalKExt.g:7613:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKExt.g:7619:6: (enumLiteral_6= '&' )
                    {
                    // InternalKExt.g:7619:6: (enumLiteral_6= '&' )
                    // InternalKExt.g:7619:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKExt.g:7625:6: (enumLiteral_7= 'host' )
                    {
                    // InternalKExt.g:7625:6: (enumLiteral_7= 'host' )
                    // InternalKExt.g:7625:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalKExt
    public final void synpred1_InternalKExt_fragment() throws RecognitionException {   
        EObject lv_declarations_1_0 = null;


        // InternalKExt.g:136:1: ( (lv_declarations_1_0= ruleDeclaration ) )
        // InternalKExt.g:136:1: (lv_declarations_1_0= ruleDeclaration )
        {
        // InternalKExt.g:136:1: (lv_declarations_1_0= ruleDeclaration )
        // InternalKExt.g:137:3: lv_declarations_1_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_declarations_1_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKExt

    // $ANTLR start synpred5_InternalKExt
    public final void synpred5_InternalKExt_fragment() throws RecognitionException {   
        EObject lv_declarations_3_0 = null;


        // InternalKExt.g:246:1: ( (lv_declarations_3_0= ruleDeclaration ) )
        // InternalKExt.g:246:1: (lv_declarations_3_0= ruleDeclaration )
        {
        // InternalKExt.g:246:1: (lv_declarations_3_0= ruleDeclaration )
        // InternalKExt.g:247:3: lv_declarations_3_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_declarations_3_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalKExt

    // $ANTLR start synpred8_InternalKExt
    public final void synpred8_InternalKExt_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalKExt.g:328:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalKExt.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalKExt.g:328:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalKExt.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalKExt.g:329:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalKExt.g:330:3: lv_expression_0_0= ruleAnnotatedExpression
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
    // $ANTLR end synpred8_InternalKExt

    // $ANTLR start synpred60_InternalKExt
    public final void synpred60_InternalKExt_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalKExt.g:1872:2: (this_Assignment_0= ruleAssignment )
        // InternalKExt.g:1872:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred60_InternalKExt

    // $ANTLR start synpred61_InternalKExt
    public final void synpred61_InternalKExt_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalKExt.g:1885:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalKExt.g:1885:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred61_InternalKExt

    // $ANTLR start synpred62_InternalKExt
    public final void synpred62_InternalKExt_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalKExt.g:1898:2: (this_Emission_2= ruleEmission )
        // InternalKExt.g:1898:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred62_InternalKExt

    // $ANTLR start synpred63_InternalKExt
    public final void synpred63_InternalKExt_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalKExt.g:1911:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalKExt.g:1911:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred63_InternalKExt

    // $ANTLR start synpred64_InternalKExt
    public final void synpred64_InternalKExt_fragment() throws RecognitionException {   
        EObject this_ReferenceCallEffect_4 = null;


        // InternalKExt.g:1924:2: (this_ReferenceCallEffect_4= ruleReferenceCallEffect )
        // InternalKExt.g:1924:2: this_ReferenceCallEffect_4= ruleReferenceCallEffect
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
    // $ANTLR end synpred64_InternalKExt

    // $ANTLR start synpred65_InternalKExt
    public final void synpred65_InternalKExt_fragment() throws RecognitionException {   
        EObject this_FunctionCallEffect_5 = null;


        // InternalKExt.g:1937:2: (this_FunctionCallEffect_5= ruleFunctionCallEffect )
        // InternalKExt.g:1937:2: this_FunctionCallEffect_5= ruleFunctionCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_FunctionCallEffect_5=ruleFunctionCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalKExt

    // $ANTLR start synpred66_InternalKExt
    public final void synpred66_InternalKExt_fragment() throws RecognitionException {   
        EObject this_PrintCallEffect_6 = null;


        // InternalKExt.g:1950:2: (this_PrintCallEffect_6= rulePrintCallEffect )
        // InternalKExt.g:1950:2: this_PrintCallEffect_6= rulePrintCallEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PrintCallEffect_6=rulePrintCallEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalKExt

    // $ANTLR start synpred89_InternalKExt
    public final void synpred89_InternalKExt_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKExt.g:2796:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKExt.g:2796:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred89_InternalKExt

    // $ANTLR start synpred101_InternalKExt
    public final void synpred101_InternalKExt_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKExt.g:3453:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKExt.g:3453:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred101_InternalKExt

    // $ANTLR start synpred121_InternalKExt
    public final void synpred121_InternalKExt_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExt.g:4568:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKExt.g:4568:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKExt.g:4568:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        // InternalKExt.g:4568:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        {
        // InternalKExt.g:4568:3: ()
        // InternalKExt.g:4569:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKExt.g:4577:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKExt.g:4578:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKExt.g:4578:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKExt.g:4579:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_68);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExt.g:4595:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKExt.g:4596:1: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKExt.g:4596:1: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKExt.g:4597:3: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_67);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExt.g:4613:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKExt.g:4614:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKExt.g:4614:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKExt.g:4615:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_69);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_67); if (state.failed) return ;
        // InternalKExt.g:4635:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        // InternalKExt.g:4636:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        {
        // InternalKExt.g:4636:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        // InternalKExt.g:4637:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred121_InternalKExt

    // $ANTLR start synpred133_InternalKExt
    public final void synpred133_InternalKExt_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKExt.g:4871:6: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKExt.g:4871:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKExt.g:4871:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKExt.g:4871:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_59); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_38);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred133_InternalKExt

    // $ANTLR start synpred148_InternalKExt
    public final void synpred148_InternalKExt_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKExt.g:5806:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKExt.g:5806:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred148_InternalKExt

    // $ANTLR start synpred149_InternalKExt
    public final void synpred149_InternalKExt_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKExt.g:5819:2: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKExt.g:5819:2: this_ValuedExpression_1= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_1=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred149_InternalKExt

    // $ANTLR start synpred151_InternalKExt
    public final void synpred151_InternalKExt_fragment() throws RecognitionException {   
        EObject this_KeyStringValueAnnotation_1 = null;


        // InternalKExt.g:5916:2: (this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation )
        // InternalKExt.g:5916:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred151_InternalKExt

    // Delegated rules

    public final boolean synpred121_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalKExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalKExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalKExt_fragment(); // can never throw exception
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA131 dfa131 = new DFA131(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String dfa_1s = "\156\uffff";
    static final String dfa_2s = "\1\3\13\uffff\1\3\31\uffff\1\3\40\uffff\1\3\26\uffff\1\3\10\uffff\1\3\6\uffff";
    static final String dfa_3s = "\3\4\1\uffff\1\4\1\uffff\3\4\1\7\10\4\1\42\3\4\1\7\4\4\1\7\2\4\1\7\4\4\1\7\6\4\1\7\1\4\2\42\3\4\1\7\4\4\1\7\2\4\1\7\2\4\1\7\6\4\1\7\6\4\1\42\4\4\1\7\10\4\1\7\4\4\1\7\1\4\2\42\10\4\1\0\3\4\1\0";
    static final String dfa_4s = "\2\140\1\4\1\uffff\1\75\1\uffff\1\140\1\4\1\10\1\7\1\4\7\140\1\76\1\64\2\4\1\7\1\64\1\75\1\140\1\4\1\10\2\4\1\7\1\64\3\140\1\10\6\140\1\70\1\140\1\76\1\42\3\140\1\10\2\140\2\4\1\7\2\4\1\70\1\4\1\10\1\7\1\4\2\140\1\64\2\4\1\7\1\64\5\140\1\76\1\4\3\140\1\10\5\140\3\4\1\7\1\64\1\140\2\4\1\7\1\140\1\76\1\42\1\140\1\4\2\140\1\4\2\140\1\4\1\0\1\140\1\4\1\140\1\0";
    static final String dfa_5s = "\3\uffff\1\2\1\uffff\1\1\150\uffff";
    static final String dfa_6s = "\151\uffff\1\1\3\uffff\1\0}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5\67\uffff\1\5",
            "",
            "\1\14\1\13\1\3\1\16\1\17\1\15\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\12\5\uffff\1\3\1\uffff\2\3\11\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\5",
            "\1\20",
            "\1\20\2\uffff\1\16\1\17",
            "\1\21",
            "\1\22",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\30\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\24\3\uffff\1\2\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\14\1\13\1\3\1\16\1\17\1\15\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\12\5\uffff\1\3\1\uffff\2\3\11\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\5",
            "\1\14\1\13\1\3\1\16\1\17\1\15\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\12\5\uffff\1\3\1\uffff\2\3\11\uffff\1\33\10\uffff\1\2\34\uffff\7\5",
            "\1\37\21\uffff\1\35\4\uffff\1\34\4\uffff\1\36",
            "\1\41\1\40\1\uffff\1\44\1\45\1\42\52\uffff\1\43",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\41\1\51\1\uffff\1\44\1\45\1\42\52\uffff\1\43",
            "\1\52\1\5\4\uffff\1\5\7\uffff\1\5\15\uffff\1\5\34\uffff\1\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\53",
            "\1\16\1\17",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\57\1\56\1\uffff\1\62\1\63\1\60\52\uffff\1\61",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\23\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\65\4\uffff\1\64\3\uffff\1\32\1\66\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\44\1\45",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\30\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\67\3\uffff\1\2\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\25\4\uffff\1\70\3\uffff\1\32\1\26\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\22\uffff\2\5\5\uffff\1\5\1\uffff\2\5\23\uffff\1\71",
            "\1\77\1\76\1\3\1\16\1\17\1\15\1\31\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\75\5\uffff\1\3\1\uffff\2\3\11\uffff\1\73\4\uffff\1\72\3\uffff\1\32\1\74\33\uffff\7\5",
            "\1\37\21\uffff\1\35\4\uffff\1\34\4\uffff\1\36",
            "\1\37",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\100\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\102\4\uffff\1\101\3\uffff\1\32\1\103\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\62\1\63",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\105",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\47",
            "\1\3\22\uffff\2\5\5\uffff\1\5\1\uffff\2\5\23\uffff\1\71",
            "\1\110",
            "\1\110\2\uffff\1\16\1\17",
            "\1\111",
            "\1\112",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\113\3\uffff\1\32\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\115\1\114\1\uffff\1\120\1\121\1\116\52\uffff\1\117",
            "\1\122",
            "\1\122",
            "\1\123",
            "\1\115\1\124\1\uffff\1\120\1\121\1\116\52\uffff\1\117",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\65\4\uffff\1\64\3\uffff\1\32\1\66\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\30\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\125\3\uffff\1\2\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\77\1\76\1\3\1\16\1\17\1\15\1\31\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\75\5\uffff\1\3\1\uffff\2\3\11\uffff\1\73\4\uffff\1\72\3\uffff\1\32\1\74\33\uffff\7\5",
            "\1\77\1\76\1\3\1\16\1\17\1\15\1\31\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\75\5\uffff\1\3\1\uffff\2\3\11\uffff\1\33\10\uffff\1\32\34\uffff\7\5",
            "\1\131\21\uffff\1\127\4\uffff\1\126\4\uffff\1\130",
            "\1\132",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\100\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\134\4\uffff\1\133\3\uffff\1\32\1\135\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\120\1\121",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\102\4\uffff\1\101\3\uffff\1\32\1\103\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\136",
            "\1\137",
            "\1\137",
            "\1\140",
            "\1\57\1\141\1\uffff\1\62\1\63\1\60\52\uffff\1\61",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\142\3\uffff\1\32\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\143",
            "\1\143",
            "\1\144",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\30\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\145\3\uffff\1\2\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\131\21\uffff\1\127\4\uffff\1\126\4\uffff\1\130",
            "\1\131",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\146",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\134\4\uffff\1\133\3\uffff\1\32\1\135\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\104\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\32\34\uffff\7\5",
            "\1\147",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\150\3\uffff\1\32\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\2\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\30\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\151\3\uffff\1\2\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\152",
            "\1\uffff",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\153\3\uffff\1\32\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\154",
            "\1\3\1\uffff\1\3\3\uffff\1\31\11\uffff\1\3\5\5\1\27\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\25\3\uffff\1\3\1\155\3\uffff\1\32\1\26\2\uffff\17\3\12\uffff\7\5",
            "\1\uffff"
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
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_109 = input.LA(1);

                         
                        int index1_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExt()) ) {s = 5;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index1_109);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_105 = input.LA(1);

                         
                        int index1_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExt()) ) {s = 5;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index1_105);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\3\4\1\uffff\1\4\1\uffff\3\4\1\7\13\4\1\7\4\4\1\42\1\7\3\4\1\7\6\4\1\7\3\4\1\7\3\4\1\7\2\4\1\7\2\4\1\7\3\4\2\42\3\4\1\7\10\4\1\42\3\4\1\7\5\4\1\7\4\4\1\7\7\4\2\42\3\4\1\7\6\4\1\0\3\4\1\0";
    static final String dfa_9s = "\2\140\1\4\1\uffff\1\75\1\uffff\1\140\1\4\1\10\1\7\5\140\1\4\2\140\1\64\2\4\1\7\1\64\1\75\1\140\1\4\1\76\1\10\3\140\1\10\6\140\1\70\1\140\2\4\1\7\1\64\2\4\1\7\2\4\1\70\1\4\1\10\1\7\2\140\1\4\1\76\1\42\3\140\1\10\7\140\1\4\1\76\1\64\2\4\1\7\1\64\1\4\1\140\2\4\1\7\1\64\3\140\1\10\6\140\1\4\1\76\1\42\1\140\2\4\1\7\1\4\4\140\1\4\1\0\1\140\1\4\1\140\1\0";
    static final String[] dfa_10s = {
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\6",
            "",
            "\1\3\1\5\67\uffff\1\5",
            "",
            "\1\13\1\12\1\3\1\15\1\16\1\14\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\17\5\uffff\1\3\1\uffff\2\3\11\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\5",
            "\1\20",
            "\1\20\2\uffff\1\15\1\16",
            "\1\21",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\22\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\27\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\23\3\uffff\1\2\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\32",
            "\1\13\1\12\1\3\1\15\1\16\1\14\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\17\5\uffff\1\3\1\uffff\2\3\11\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\5",
            "\1\13\1\12\1\3\1\15\1\16\1\14\1\1\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\17\5\uffff\1\3\1\uffff\2\3\11\uffff\1\33\10\uffff\1\2\34\uffff\7\5",
            "\1\35\1\34\1\uffff\1\40\1\41\1\36\52\uffff\1\37",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\35\1\45\1\uffff\1\40\1\41\1\36\52\uffff\1\37",
            "\1\46\1\5\4\uffff\1\5\7\uffff\1\5\15\uffff\1\5\34\uffff\1\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\47",
            "\1\53\21\uffff\1\51\4\uffff\1\50\4\uffff\1\52",
            "\1\15\1\16",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\22\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\55\4\uffff\1\54\3\uffff\1\31\1\56\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\40\1\41",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\27\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\57\3\uffff\1\2\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\24\4\uffff\1\60\3\uffff\1\31\1\25\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\22\uffff\2\5\5\uffff\1\5\1\uffff\2\5\23\uffff\1\61",
            "\1\66\1\65\1\3\1\15\1\16\1\14\1\30\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\67\5\uffff\1\3\1\uffff\2\3\11\uffff\1\63\4\uffff\1\62\3\uffff\1\31\1\64\33\uffff\7\5",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\73\1\72\1\uffff\1\76\1\77\1\74\52\uffff\1\75",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\43",
            "\1\3\22\uffff\2\5\5\uffff\1\5\1\uffff\2\5\23\uffff\1\61",
            "\1\103",
            "\1\103\2\uffff\1\15\1\16",
            "\1\104",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\105\3\uffff\1\31\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\106",
            "\1\53\21\uffff\1\51\4\uffff\1\50\4\uffff\1\52",
            "\1\53",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\107\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\111\4\uffff\1\110\3\uffff\1\31\1\112\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\76\1\77",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\55\4\uffff\1\54\3\uffff\1\31\1\56\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\27\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\114\3\uffff\1\2\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\66\1\65\1\3\1\15\1\16\1\14\1\30\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\67\5\uffff\1\3\1\uffff\2\3\11\uffff\1\63\4\uffff\1\62\3\uffff\1\31\1\64\33\uffff\7\5",
            "\1\66\1\65\1\3\1\15\1\16\1\14\1\30\11\uffff\1\3\5\5\3\uffff\1\5\1\4\1\5\1\uffff\1\67\5\uffff\1\3\1\uffff\2\3\11\uffff\1\33\10\uffff\1\31\34\uffff\7\5",
            "\1\115",
            "\1\121\21\uffff\1\117\4\uffff\1\116\4\uffff\1\120",
            "\1\123\1\122\1\uffff\1\126\1\127\1\124\52\uffff\1\125",
            "\1\130",
            "\1\130",
            "\1\131",
            "\1\123\1\132\1\uffff\1\126\1\127\1\124\52\uffff\1\125",
            "\1\133",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\134\3\uffff\1\31\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\135",
            "\1\135",
            "\1\136",
            "\1\73\1\137\1\uffff\1\76\1\77\1\74\52\uffff\1\75",
            "\1\3\1\uffff\1\3\3\uffff\1\1\11\uffff\1\3\5\5\1\107\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\2\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\141\4\uffff\1\140\3\uffff\1\31\1\142\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\126\1\127",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\111\4\uffff\1\110\3\uffff\1\31\1\112\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\27\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\143\3\uffff\1\2\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\144",
            "\1\121\21\uffff\1\117\4\uffff\1\116\4\uffff\1\120",
            "\1\121",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\145",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\150\3\uffff\1\31\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\11\uffff\1\141\4\uffff\1\140\3\uffff\1\31\1\142\33\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\113\2\uffff\1\5\1\4\1\5\7\uffff\1\3\1\uffff\2\3\22\uffff\1\31\34\uffff\7\5",
            "\1\3\1\uffff\1\3\3\uffff\1\1\6\uffff\1\3\1\uffff\2\3\5\5\1\26\2\uffff\1\5\1\4\1\27\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\151\3\uffff\1\2\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\152",
            "\1\uffff",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\153\3\uffff\1\31\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\154",
            "\1\3\1\uffff\1\3\3\uffff\1\30\11\uffff\1\3\5\5\1\26\2\uffff\1\5\1\4\1\5\1\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\2\3\11\uffff\1\24\3\uffff\1\3\1\155\3\uffff\1\31\1\25\2\uffff\17\3\12\uffff\7\5",
            "\1\uffff"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 245:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_109 = input.LA(1);

                         
                        int index5_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalKExt()) ) {s = 5;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index5_109);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_105 = input.LA(1);

                         
                        int index5_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalKExt()) ) {s = 5;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index5_105);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_11s = "\141\uffff";
    static final String dfa_12s = "\3\4\2\uffff\3\4\1\7\1\0\13\4\1\42\1\7\3\4\1\7\6\4\1\7\3\4\1\7\2\4\1\7\3\4\2\42\3\4\1\7\6\4\1\42\2\4\1\7\3\4\1\7\3\4\1\7\7\4\1\7\5\4\2\42\5\4\1\7\7\4\1\0";
    static final String dfa_13s = "\2\75\1\4\2\uffff\1\76\1\4\1\10\1\7\1\0\4\75\1\4\1\76\1\75\2\64\1\75\1\4\1\76\1\10\1\75\1\76\1\75\1\10\3\75\1\76\2\4\1\7\1\64\2\4\1\7\1\4\1\10\1\7\1\4\1\75\1\117\1\76\1\42\1\75\1\76\1\75\1\10\2\75\1\76\1\75\1\76\1\75\1\76\2\4\1\7\1\64\2\4\1\7\1\64\2\4\1\7\1\64\1\117\1\76\2\75\1\76\1\75\1\10\2\75\1\76\2\75\1\76\1\42\1\75\4\4\1\7\1\117\1\76\1\75\1\4\1\117\1\4\1\117\1\0";
    static final String dfa_14s = "\3\uffff\1\1\1\2\134\uffff";
    static final String dfa_15s = "\11\uffff\1\1\126\uffff\1\0}>";
    static final String[] dfa_16s = {
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\11\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\11\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\11\1\12\1\4\1\14\1\15\1\13\1\1\11\uffff\1\3\11\uffff\1\4\2\uffff\1\16\5\uffff\1\4\1\uffff\2\4\11\uffff\1\7\4\uffff\1\6\3\uffff\1\2\1\10",
            "\1\17",
            "\1\17\2\uffff\1\14\1\15",
            "\1\20",
            "\1\uffff",
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\5\uffff\1\21\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\25",
            "\1\11\1\12\1\4\1\14\1\15\1\13\1\1\11\uffff\1\3\11\uffff\1\4\2\uffff\1\16\5\uffff\1\4\1\uffff\2\4\11\uffff\1\7\4\uffff\1\6\3\uffff\1\2\1\10",
            "\1\11\1\12\1\4\1\14\1\15\1\13\1\1\11\uffff\1\3\11\uffff\1\4\2\uffff\1\16\5\uffff\1\4\1\uffff\2\4\11\uffff\1\26\10\uffff\1\2",
            "\1\30\1\27\1\uffff\1\33\1\34\1\31\52\uffff\1\32",
            "\1\30\1\35\1\uffff\1\33\1\34\1\31\52\uffff\1\32",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\11\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\36",
            "\1\42\21\uffff\1\40\4\uffff\1\37\4\uffff\1\41",
            "\1\14\1\15",
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\5\uffff\1\21\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\44\4\uffff\1\43\3\uffff\1\24\1\45",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\33\1\34",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\53\1\52\1\4\1\14\1\15\1\13\1\23\11\uffff\1\3\11\uffff\1\4\2\uffff\1\51\5\uffff\1\4\1\uffff\2\4\11\uffff\1\47\4\uffff\1\46\3\uffff\1\24\1\50",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\57\1\56\1\uffff\1\62\1\63\1\60\52\uffff\1\61",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\66\2\uffff\1\14\1\15",
            "\1\67",
            "\1\70",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\11\uffff\1\72\3\uffff\1\4\1\71\3\uffff\1\24\1\73\2\uffff\17\4",
            "\1\42\21\uffff\1\40\4\uffff\1\37\4\uffff\1\41",
            "\1\42",
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\5\uffff\1\74\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\76\4\uffff\1\75\3\uffff\1\24\1\77",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\62\1\63",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\44\4\uffff\1\43\3\uffff\1\24\1\45",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\53\1\52\1\4\1\14\1\15\1\13\1\23\11\uffff\1\3\11\uffff\1\4\2\uffff\1\51\5\uffff\1\4\1\uffff\2\4\11\uffff\1\47\4\uffff\1\46\3\uffff\1\24\1\50",
            "\1\53\1\52\1\4\1\14\1\15\1\13\1\23\11\uffff\1\3\11\uffff\1\4\2\uffff\1\51\5\uffff\1\4\1\uffff\2\4\11\uffff\1\26\10\uffff\1\24",
            "\1\104\21\uffff\1\102\4\uffff\1\101\4\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\111\1\110\1\uffff\1\114\1\115\1\112\52\uffff\1\113",
            "\1\116",
            "\1\116",
            "\1\117",
            "\1\111\1\120\1\uffff\1\114\1\115\1\112\52\uffff\1\113",
            "\1\121",
            "\1\121",
            "\1\122",
            "\1\57\1\123\1\uffff\1\62\1\63\1\60\52\uffff\1\61",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\11\uffff\1\72\3\uffff\1\4\1\124\3\uffff\1\24\1\73\2\uffff\17\4",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\72\4\uffff\1\125\3\uffff\1\24\1\73",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\1\11\uffff\1\3\5\uffff\1\74\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\2",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\127\4\uffff\1\126\3\uffff\1\24\1\130",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\114\1\115",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\76\4\uffff\1\75\3\uffff\1\24\1\77",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\104\21\uffff\1\102\4\uffff\1\101\4\uffff\1\103",
            "\1\104",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\131",
            "\1\106",
            "\1\132",
            "\1\132",
            "\1\133",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\11\uffff\1\72\3\uffff\1\4\1\134\3\uffff\1\24\1\73\2\uffff\17\4",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\11\uffff\1\127\4\uffff\1\126\3\uffff\1\24\1\130",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\100\3\uffff\1\4\10\uffff\1\4\1\uffff\2\4\22\uffff\1\24",
            "\1\135",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\11\uffff\1\72\3\uffff\1\4\1\136\3\uffff\1\24\1\73\2\uffff\17\4",
            "\1\137",
            "\1\4\1\uffff\1\4\3\uffff\1\23\11\uffff\1\3\5\uffff\1\22\3\uffff\1\4\2\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\11\uffff\1\72\3\uffff\1\4\1\140\3\uffff\1\24\1\73\2\uffff\17\4",
            "\1\uffff"
    };

    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_11;
            this.eof = dfa_11;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "328:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_96 = input.LA(1);

                         
                        int index8_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExt()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index8_96);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExt()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index8_9);
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
    static final String dfa_17s = "\102\uffff";
    static final String dfa_18s = "\2\12\1\4\3\uffff\3\4\1\7\5\12\6\4\1\7\1\42\1\7\3\12\1\7\4\12\2\4\1\7\3\4\1\7\2\42\3\12\1\7\4\12\3\4\1\7\3\12\1\7\4\12\2\4\1\7\2\12";
    static final String dfa_19s = "\2\140\1\4\3\uffff\1\140\1\4\1\10\1\7\5\140\1\4\2\140\1\64\2\4\1\7\1\76\1\10\3\140\1\10\4\140\2\4\1\7\1\64\2\4\1\7\1\76\1\42\3\140\1\10\4\140\1\64\2\4\1\7\3\140\1\10\4\140\2\4\1\7\2\140";
    static final String dfa_20s = "\3\uffff\1\1\1\2\1\3\74\uffff";
    static final String dfa_21s = "\102\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\12\uffff\5\3\3\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\3\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\6",
            "",
            "",
            "",
            "\1\13\1\12\1\uffff\1\15\1\16\1\14\1\1\12\uffff\5\3\3\uffff\2\4\1\5\1\uffff\1\17\22\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\3",
            "\1\20",
            "\1\20\2\uffff\1\15\1\16",
            "\1\21",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\24\uffff\1\24\4\uffff\1\23\3\uffff\1\2\1\25\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\26",
            "\1\13\1\12\1\uffff\1\15\1\16\1\14\1\1\12\uffff\5\3\3\uffff\2\4\1\5\1\uffff\1\17\22\uffff\1\10\4\uffff\1\7\3\uffff\1\2\1\11\33\uffff\7\3",
            "\1\13\1\12\1\uffff\1\15\1\16\1\14\1\1\12\uffff\5\3\3\uffff\2\4\1\5\1\uffff\1\17\22\uffff\1\27\10\uffff\1\2\34\uffff\7\3",
            "\1\31\1\30\1\uffff\1\34\1\35\1\32\52\uffff\1\33",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\43\21\uffff\1\41\4\uffff\1\40\4\uffff\1\42",
            "\1\15\1\16",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\24\uffff\1\45\4\uffff\1\44\3\uffff\1\2\1\46\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\34\1\35",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\24\uffff\1\24\4\uffff\1\23\3\uffff\1\2\1\25\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\52\1\51\1\uffff\1\55\1\56\1\53\52\uffff\1\54",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\43\21\uffff\1\41\4\uffff\1\40\4\uffff\1\42",
            "\1\43",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\24\uffff\1\63\4\uffff\1\62\3\uffff\1\2\1\64\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\55\1\56",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\24\uffff\1\45\4\uffff\1\44\3\uffff\1\2\1\46\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\22\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\66\1\65\1\uffff\1\71\1\72\1\67\52\uffff\1\70",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\24\uffff\1\76\4\uffff\1\75\3\uffff\1\2\1\77\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\71\1\72",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\24\uffff\1\63\4\uffff\1\62\3\uffff\1\2\1\64\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\24\uffff\1\76\4\uffff\1\75\3\uffff\1\2\1\77\33\uffff\7\3",
            "\1\1\12\uffff\5\3\1\61\2\uffff\2\4\1\5\35\uffff\1\2\34\uffff\7\3"
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "447:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration | this_ScheduleDeclaration_2= ruleScheduleDeclaration )";
        }
    }
    static final String dfa_23s = "\14\uffff";
    static final String dfa_24s = "\1\4\3\0\10\uffff";
    static final String dfa_25s = "\1\75\3\0\10\uffff";
    static final String dfa_26s = "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\1\1\2\1\3";
    static final String dfa_27s = "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] dfa_28s = {
            "\1\3\1\uffff\1\4\3\uffff\1\1\23\uffff\1\6\10\uffff\1\5\1\uffff\1\7\1\10\22\uffff\1\2",
            "\1\uffff",
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

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1871:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_ReferenceCallEffect_4= ruleReferenceCallEffect | this_FunctionCallEffect_5= ruleFunctionCallEffect | this_PrintCallEffect_6= rulePrintCallEffect | this_RandomizeCallEffect_7= ruleRandomizeCallEffect )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalKExt()) ) {s = 9;}

                        else if ( (synpred61_InternalKExt()) ) {s = 10;}

                        else if ( (synpred62_InternalKExt()) ) {s = 11;}

                        else if ( (synpred63_InternalKExt()) ) {s = 4;}

                        else if ( (synpred64_InternalKExt()) ) {s = 5;}

                        else if ( (synpred65_InternalKExt()) ) {s = 6;}

                        else if ( (synpred66_InternalKExt()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalKExt()) ) {s = 9;}

                        else if ( (synpred61_InternalKExt()) ) {s = 10;}

                        else if ( (synpred62_InternalKExt()) ) {s = 11;}

                        else if ( (synpred63_InternalKExt()) ) {s = 4;}

                        else if ( (synpred64_InternalKExt()) ) {s = 5;}

                        else if ( (synpred65_InternalKExt()) ) {s = 6;}

                        else if ( (synpred66_InternalKExt()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalKExt()) ) {s = 9;}

                        else if ( (synpred61_InternalKExt()) ) {s = 10;}

                        else if ( (synpred62_InternalKExt()) ) {s = 11;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\5\uffff";
    static final String dfa_30s = "\1\1\1\uffff\2\1\1\uffff";
    static final String dfa_31s = "\1\4\1\uffff\2\4\1\uffff";
    static final String dfa_32s = "\1\75\1\uffff\2\117\1\uffff";
    static final String dfa_33s = "\1\uffff\1\2\2\uffff\1\1";
    static final String dfa_34s = "\5\uffff}>";
    static final String[] dfa_35s = {
            "\1\2\1\uffff\1\1\3\uffff\1\1\6\uffff\1\1\1\uffff\2\1\11\uffff\1\1\10\uffff\1\1\1\uffff\2\1\22\uffff\1\1",
            "",
            "\1\1\1\uffff\1\1\1\4\2\uffff\1\1\6\uffff\1\1\1\uffff\2\1\11\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\15\uffff\1\3\1\1\3\uffff\1\1\3\uffff\17\1",
            "\1\1\1\uffff\1\1\1\4\2\uffff\1\1\6\uffff\1\1\1\uffff\2\1\11\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\2\1\15\uffff\1\3\1\1\3\uffff\1\1\3\uffff\17\1",
            ""
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()+ loopback of 2061:1: ( (lv_schedule_6_0= ruleScheduleObjectReference ) )+";
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()+ loopback of 2176:1: ( (lv_schedule_5_0= ruleScheduleObjectReference ) )+";
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()+ loopback of 2273:1: ( (lv_schedule_4_0= ruleScheduleObjectReference ) )+";
        }
    }
    static final String dfa_36s = "\22\uffff";
    static final String dfa_37s = "\1\4\16\0\3\uffff";
    static final String dfa_38s = "\1\130\16\0\3\uffff";
    static final String dfa_39s = "\17\uffff\1\1\1\uffff\1\2";
    static final String dfa_40s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\uffff}>";
    static final String[] dfa_41s = {
            "\1\12\1\4\1\16\1\2\1\3\1\7\10\uffff\1\5\13\uffff\1\13\6\uffff\1\6\4\uffff\1\15\11\uffff\1\1\5\uffff\1\14\1\17\32\uffff\1\10\1\17\1\11",
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

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_36;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "2795:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_2 = input.LA(1);

                         
                        int index82_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_3 = input.LA(1);

                         
                        int index82_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_4 = input.LA(1);

                         
                        int index82_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_5 = input.LA(1);

                         
                        int index82_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_8 = input.LA(1);

                         
                        int index82_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_9 = input.LA(1);

                         
                        int index82_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_10 = input.LA(1);

                         
                        int index82_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_11 = input.LA(1);

                         
                        int index82_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_12 = input.LA(1);

                         
                        int index82_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA82_13 = input.LA(1);

                         
                        int index82_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA82_14 = input.LA(1);

                         
                        int index82_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalKExt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index82_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_42s = "\21\uffff";
    static final String dfa_43s = "\1\4\5\uffff\11\0\2\uffff";
    static final String dfa_44s = "\1\130\5\uffff\11\0\2\uffff";
    static final String dfa_45s = "\1\uffff\1\1\15\uffff\1\2\1\uffff";
    static final String dfa_46s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_47s = {
            "\1\12\1\1\1\16\2\1\1\7\10\uffff\1\1\13\uffff\1\13\6\uffff\1\6\4\uffff\1\15\11\uffff\1\1\5\uffff\1\14\1\17\32\uffff\1\10\1\17\1\11",
            "",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "3452:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_6 = input.LA(1);

                         
                        int index94_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA94_7 = input.LA(1);

                         
                        int index94_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA94_8 = input.LA(1);

                         
                        int index94_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA94_9 = input.LA(1);

                         
                        int index94_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA94_10 = input.LA(1);

                         
                        int index94_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA94_11 = input.LA(1);

                         
                        int index94_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA94_12 = input.LA(1);

                         
                        int index94_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA94_13 = input.LA(1);

                         
                        int index94_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA94_14 = input.LA(1);

                         
                        int index94_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKExt()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index94_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_48s = "\20\uffff";
    static final String dfa_49s = "\1\4\15\0\2\uffff";
    static final String dfa_50s = "\1\130\15\0\2\uffff";
    static final String dfa_51s = "\16\uffff\1\1\1\2";
    static final String dfa_52s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff}>";
    static final String[] dfa_53s = {
            "\1\11\1\3\1\15\1\1\1\2\1\6\10\uffff\1\4\13\uffff\1\12\6\uffff\1\5\4\uffff\1\14\17\uffff\1\13\33\uffff\1\7\1\uffff\1\10",
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
            ""
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "4568:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_1 = input.LA(1);

                         
                        int index114_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_2 = input.LA(1);

                         
                        int index114_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_3 = input.LA(1);

                         
                        int index114_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA114_4 = input.LA(1);

                         
                        int index114_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA114_5 = input.LA(1);

                         
                        int index114_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA114_6 = input.LA(1);

                         
                        int index114_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA114_7 = input.LA(1);

                         
                        int index114_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA114_8 = input.LA(1);

                         
                        int index114_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA114_9 = input.LA(1);

                         
                        int index114_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA114_10 = input.LA(1);

                         
                        int index114_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA114_11 = input.LA(1);

                         
                        int index114_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA114_12 = input.LA(1);

                         
                        int index114_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA114_13 = input.LA(1);

                         
                        int index114_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index114_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 114, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_54s = "\13\uffff";
    static final String dfa_55s = "\3\uffff\1\2\5\uffff\1\2\1\uffff";
    static final String dfa_56s = "\1\4\2\uffff\1\4\5\uffff\1\4\1\uffff";
    static final String dfa_57s = "\1\130\2\uffff\1\131\5\uffff\1\131\1\uffff";
    static final String dfa_58s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\uffff\1\4";
    static final String dfa_59s = "\13\uffff}>";
    static final String[] dfa_60s = {
            "\1\3\1\uffff\1\10\2\uffff\1\1\24\uffff\1\5\6\uffff\1\4\4\uffff\1\7\17\uffff\1\6\33\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\1\2\1\uffff\1\2\3\uffff\2\2\5\uffff\1\2\1\uffff\2\2\5\uffff\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\1\12\2\2\1\12\17\2\1\11\1\2\3\uffff\1\2\22\uffff\6\2\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\2\3\uffff\2\2\5\uffff\1\2\1\uffff\2\2\5\uffff\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\1\12\2\2\1\12\17\2\1\11\1\2\3\uffff\1\2\22\uffff\6\2\3\uffff\1\2",
            ""
    };

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "4687:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )";
        }
    }
    static final String dfa_61s = "\17\uffff";
    static final String dfa_62s = "\1\4\4\uffff\1\0\11\uffff";
    static final String dfa_63s = "\1\130\4\uffff\1\0\11\uffff";
    static final String dfa_64s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\7\uffff\1\5";
    static final String dfa_65s = "\5\uffff\1\0\11\uffff}>";
    static final String[] dfa_66s = {
            "\1\6\1\3\1\6\1\1\1\2\1\6\10\uffff\1\4\13\uffff\1\6\6\uffff\1\5\4\uffff\1\6\17\uffff\1\6\33\uffff\1\6\1\uffff\1\6",
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
            ""
    };

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[][] dfa_66 = unpackEncodedStringArray(dfa_66s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_61;
            this.eof = dfa_61;
            this.min = dfa_62;
            this.max = dfa_63;
            this.accept = dfa_64;
            this.special = dfa_65;
            this.transition = dfa_66;
        }
        public String getDescription() {
            return "4819:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalKExt()) ) {s = 14;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_67s = "\23\uffff";
    static final String dfa_68s = "\1\4\16\0\4\uffff";
    static final String dfa_69s = "\1\130\16\0\4\uffff";
    static final String dfa_70s = "\17\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_71s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\uffff}>";
    static final String[] dfa_72s = {
            "\1\12\1\4\1\16\1\2\1\3\1\7\10\uffff\1\5\13\uffff\1\13\6\uffff\1\6\4\uffff\1\15\11\uffff\1\1\5\uffff\1\14\1\17\1\21\31\uffff\1\10\1\17\1\11",
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

    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA131 extends DFA {

        public DFA131(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 131;
            this.eot = dfa_67;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "5805:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA131_1 = input.LA(1);

                         
                        int index131_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA131_2 = input.LA(1);

                         
                        int index131_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA131_3 = input.LA(1);

                         
                        int index131_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA131_4 = input.LA(1);

                         
                        int index131_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA131_5 = input.LA(1);

                         
                        int index131_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA131_6 = input.LA(1);

                         
                        int index131_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA131_7 = input.LA(1);

                         
                        int index131_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA131_8 = input.LA(1);

                         
                        int index131_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA131_9 = input.LA(1);

                         
                        int index131_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA131_10 = input.LA(1);

                         
                        int index131_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA131_11 = input.LA(1);

                         
                        int index131_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA131_12 = input.LA(1);

                         
                        int index131_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA131_13 = input.LA(1);

                         
                        int index131_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA131_14 = input.LA(1);

                         
                        int index131_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalKExt()) ) {s = 15;}

                        else if ( (synpred149_InternalKExt()) ) {s = 18;}

                         
                        input.seek(index131_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 131, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_73s = "\26\uffff";
    static final String dfa_74s = "\3\uffff\1\12\5\uffff\1\10\1\uffff\2\12\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff";
    static final String dfa_75s = "\1\12\1\uffff\4\4\1\7\2\uffff\1\4\1\uffff\12\4\1\0";
    static final String dfa_76s = "\1\75\1\uffff\1\4\1\140\1\4\1\10\1\7\2\uffff\1\140\1\uffff\2\140\1\4\1\140\1\4\1\140\1\4\1\140\1\4\1\140\1\0";
    static final String dfa_77s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\uffff\1\4\13\uffff";
    static final String dfa_78s = "\25\uffff\1\0}>";
    static final String[] dfa_79s = {
            "\1\1\62\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\10\1\12\3\10\1\12\11\uffff\6\12\3\uffff\3\12\1\uffff\1\7\5\uffff\1\12\1\uffff\2\12\11\uffff\1\5\4\uffff\1\4\3\uffff\1\12\1\6\33\uffff\7\12",
            "\1\13",
            "\1\13\2\uffff\2\10",
            "\1\14",
            "",
            "",
            "\1\10\1\uffff\1\10\3\uffff\1\10\11\uffff\7\10\2\uffff\3\10\1\uffff\1\12\1\uffff\1\12\3\uffff\1\10\1\uffff\2\10\11\uffff\1\10\3\uffff\1\12\1\15\3\uffff\2\10\2\uffff\17\12\12\uffff\7\10",
            "",
            "\1\11\1\10\1\12\3\10\1\12\11\uffff\6\12\3\uffff\3\12\1\uffff\1\7\5\uffff\1\12\1\uffff\2\12\11\uffff\1\5\4\uffff\1\4\3\uffff\1\12\1\6\33\uffff\7\12",
            "\1\11\1\10\1\12\3\10\1\12\11\uffff\6\12\3\uffff\3\12\1\uffff\1\7\5\uffff\1\12\1\uffff\2\12\11\uffff\1\10\10\uffff\1\12\34\uffff\7\12",
            "\1\16",
            "\1\10\1\uffff\1\10\3\uffff\1\10\11\uffff\7\10\2\uffff\3\10\1\uffff\1\12\1\uffff\1\12\3\uffff\1\10\1\uffff\2\10\11\uffff\1\10\3\uffff\1\12\1\17\3\uffff\2\10\2\uffff\17\12\12\uffff\7\10",
            "\1\20",
            "\1\10\1\uffff\1\10\3\uffff\1\10\11\uffff\7\10\2\uffff\3\10\1\uffff\1\12\1\uffff\1\12\3\uffff\1\10\1\uffff\2\10\11\uffff\1\10\3\uffff\1\12\1\21\3\uffff\2\10\2\uffff\17\12\12\uffff\7\10",
            "\1\22",
            "\1\10\1\uffff\1\10\3\uffff\1\10\11\uffff\7\10\2\uffff\3\10\1\uffff\1\12\1\uffff\1\12\3\uffff\1\10\1\uffff\2\10\11\uffff\1\10\3\uffff\1\12\1\23\3\uffff\2\10\2\uffff\17\12\12\uffff\7\10",
            "\1\24",
            "\1\10\1\uffff\1\10\3\uffff\1\10\11\uffff\7\10\2\uffff\3\10\1\uffff\1\12\1\uffff\1\12\3\uffff\1\10\1\uffff\2\10\11\uffff\1\10\3\uffff\1\12\1\25\3\uffff\2\10\2\uffff\17\12\12\uffff\7\10",
            "\1\uffff"
    };

    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_73;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "5902:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_21 = input.LA(1);

                         
                        int index132_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred151_InternalKExt()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index132_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 132, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_80s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_81s = "\1\12\1\uffff\4\4\1\7\3\uffff\2\4";
    static final String dfa_82s = "\1\75\1\uffff\1\4\1\76\2\4\1\7\3\uffff\1\76\1\75";
    static final String dfa_83s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_84s = "\14\uffff}>";
    static final String[] dfa_85s = {
            "\1\1\62\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\11\4\uffff\1\7\26\uffff\1\10\22\uffff\1\5\4\uffff\1\4\3\uffff\1\7\1\6",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\7\1\11\4\uffff\1\7\26\uffff\1\10\22\uffff\1\5\4\uffff\1\4\3\uffff\1\7\1\6",
            "\1\7\1\11\4\uffff\1\7\26\uffff\1\10\33\uffff\1\7"
    };
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final char[] dfa_82 = DFA.unpackEncodedStringToUnsignedChars(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[][] dfa_85 = unpackEncodedStringArray(dfa_85s);

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = dfa_23;
            this.eof = dfa_80;
            this.min = dfa_81;
            this.max = dfa_82;
            this.accept = dfa_83;
            this.special = dfa_84;
            this.transition = dfa_85;
        }
        public String getDescription() {
            return "5980:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x20000680E3F20452L,0x00000001FC000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000068040120452L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x20000680E3FA0450L,0x00000001FC000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x20000680401A0450L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000100400L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2C100420400407F0L,0x0000000001C00000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2000000003E00400L,0x00000001FC000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003C00000L,0x00000001FC000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003800000L,0x00000001FC000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L,0x00000001FC000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L,0x00000001FC000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2000000000000410L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000802L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000060000400L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000420L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2000000004000410L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000080000400L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000100040430L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000100040410L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000040410L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004080000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001A00000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0028A00000000000L,0x0000000F00000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002080000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000412L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L,0x0000000000003FFEL});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000440L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000008000000400L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000012000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2C108420400407F0L,0x0000000001C00000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000040000400L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000020000000400L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000040000000400L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x00000000003F0000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x24100420400407F0L,0x0000000001400000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x24000420400407F0L,0x0000000001400000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000410L,0x0000000001400000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0200000200000002L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x3C100420400407F0L,0x0000000001C00000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x00100000000003B0L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x4210000000000002L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000100L});
    }


}