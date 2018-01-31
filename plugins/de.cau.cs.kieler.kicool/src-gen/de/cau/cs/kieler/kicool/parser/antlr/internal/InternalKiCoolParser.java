package de.cau.cs.kieler.kicool.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.kicool.services.KiCoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKiCoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'developer'", "'system'", "'version'", "'label'", "'input'", "'set'", "'intermediate'", "'alias'", "'['", "']'", "'pre'", "'process'", "'post'", "'silent'", "'|'", "'key'", "'@'", "'#'", "','", "'.'", "'-'"
    };
    public static final int RULE_COMMENT_ANNOTATION=6;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=9;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKiCoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKiCoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKiCoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiCool.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KiCoolGrammarAccess grammarAccess;
     	
        public InternalKiCoolParser(TokenStream input, KiCoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "System";	
       	}
       	
       	@Override
       	protected KiCoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSystem"
    // InternalKiCool.g:73:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalKiCool.g:74:2: (iv_ruleSystem= ruleSystem EOF )
            // InternalKiCool.g:75:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalKiCool.g:82:1: ruleSystem returns [EObject current=null] : ( ( (lv_public_0_0= 'public' ) )? ( (lv_developer_1_0= 'developer' ) )? otherlv_2= 'system' ( (lv_id_3_0= ruleQualifiedID ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_INT ) ) otherlv_6= 'label' ( (lv_label_7_0= ruleEString ) ) (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )? (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )* ( (lv_intermediates_12_0= ruleIntermediateReference ) )* ( (lv_processors_13_0= ruleProcessorGroup ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token lv_public_0_0=null;
        Token lv_developer_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_version_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_inputClass_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_label_7_0 = null;

        EObject lv_startsets_11_0 = null;

        EObject lv_intermediates_12_0 = null;

        EObject lv_processors_13_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:85:28: ( ( ( (lv_public_0_0= 'public' ) )? ( (lv_developer_1_0= 'developer' ) )? otherlv_2= 'system' ( (lv_id_3_0= ruleQualifiedID ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_INT ) ) otherlv_6= 'label' ( (lv_label_7_0= ruleEString ) ) (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )? (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )* ( (lv_intermediates_12_0= ruleIntermediateReference ) )* ( (lv_processors_13_0= ruleProcessorGroup ) ) ) )
            // InternalKiCool.g:86:1: ( ( (lv_public_0_0= 'public' ) )? ( (lv_developer_1_0= 'developer' ) )? otherlv_2= 'system' ( (lv_id_3_0= ruleQualifiedID ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_INT ) ) otherlv_6= 'label' ( (lv_label_7_0= ruleEString ) ) (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )? (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )* ( (lv_intermediates_12_0= ruleIntermediateReference ) )* ( (lv_processors_13_0= ruleProcessorGroup ) ) )
            {
            // InternalKiCool.g:86:1: ( ( (lv_public_0_0= 'public' ) )? ( (lv_developer_1_0= 'developer' ) )? otherlv_2= 'system' ( (lv_id_3_0= ruleQualifiedID ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_INT ) ) otherlv_6= 'label' ( (lv_label_7_0= ruleEString ) ) (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )? (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )* ( (lv_intermediates_12_0= ruleIntermediateReference ) )* ( (lv_processors_13_0= ruleProcessorGroup ) ) )
            // InternalKiCool.g:86:2: ( (lv_public_0_0= 'public' ) )? ( (lv_developer_1_0= 'developer' ) )? otherlv_2= 'system' ( (lv_id_3_0= ruleQualifiedID ) ) otherlv_4= 'version' ( (lv_version_5_0= RULE_INT ) ) otherlv_6= 'label' ( (lv_label_7_0= ruleEString ) ) (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )? (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )* ( (lv_intermediates_12_0= ruleIntermediateReference ) )* ( (lv_processors_13_0= ruleProcessorGroup ) )
            {
            // InternalKiCool.g:86:2: ( (lv_public_0_0= 'public' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKiCool.g:87:1: (lv_public_0_0= 'public' )
                    {
                    // InternalKiCool.g:87:1: (lv_public_0_0= 'public' )
                    // InternalKiCool.g:88:3: lv_public_0_0= 'public'
                    {
                    lv_public_0_0=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_public_0_0, grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSystemRule());
                      	        }
                             		setWithLastConsumed(current, "public", true, "public");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiCool.g:101:3: ( (lv_developer_1_0= 'developer' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiCool.g:102:1: (lv_developer_1_0= 'developer' )
                    {
                    // InternalKiCool.g:102:1: (lv_developer_1_0= 'developer' )
                    // InternalKiCool.g:103:3: lv_developer_1_0= 'developer'
                    {
                    lv_developer_1_0=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_developer_1_0, grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSystemRule());
                      	        }
                             		setWithLastConsumed(current, "developer", true, "developer");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getSystemKeyword_2());
                  
            }
            // InternalKiCool.g:120:1: ( (lv_id_3_0= ruleQualifiedID ) )
            // InternalKiCool.g:121:1: (lv_id_3_0= ruleQualifiedID )
            {
            // InternalKiCool.g:121:1: (lv_id_3_0= ruleQualifiedID )
            // InternalKiCool.g:122:3: lv_id_3_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_3_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.QualifiedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getVersionKeyword_4());
                  
            }
            // InternalKiCool.g:142:1: ( (lv_version_5_0= RULE_INT ) )
            // InternalKiCool.g:143:1: (lv_version_5_0= RULE_INT )
            {
            // InternalKiCool.g:143:1: (lv_version_5_0= RULE_INT )
            // InternalKiCool.g:144:3: lv_version_5_0= RULE_INT
            {
            lv_version_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_5_0, grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getLabelKeyword_6());
                  
            }
            // InternalKiCool.g:164:1: ( (lv_label_7_0= ruleEString ) )
            // InternalKiCool.g:165:1: (lv_label_7_0= ruleEString )
            {
            // InternalKiCool.g:165:1: (lv_label_7_0= ruleEString )
            // InternalKiCool.g:166:3: lv_label_7_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_label_7_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_7_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:182:2: (otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKiCool.g:182:4: otherlv_8= 'input' ( (lv_inputClass_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getInputKeyword_8_0());
                          
                    }
                    // InternalKiCool.g:186:1: ( (lv_inputClass_9_0= RULE_ID ) )
                    // InternalKiCool.g:187:1: (lv_inputClass_9_0= RULE_ID )
                    {
                    // InternalKiCool.g:187:1: (lv_inputClass_9_0= RULE_ID )
                    // InternalKiCool.g:188:3: lv_inputClass_9_0= RULE_ID
                    {
                    lv_inputClass_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_inputClass_9_0, grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSystemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"inputClass",
                              		lv_inputClass_9_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiCool.g:204:4: (otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiCool.g:204:6: otherlv_10= 'set' ( (lv_startsets_11_0= ruleKVPair ) )
            	    {
            	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getSetKeyword_9_0());
            	          
            	    }
            	    // InternalKiCool.g:208:1: ( (lv_startsets_11_0= ruleKVPair ) )
            	    // InternalKiCool.g:209:1: (lv_startsets_11_0= ruleKVPair )
            	    {
            	    // InternalKiCool.g:209:1: (lv_startsets_11_0= ruleKVPair )
            	    // InternalKiCool.g:210:3: lv_startsets_11_0= ruleKVPair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemAccess().getStartsetsKVPairParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_startsets_11_0=ruleKVPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"startsets",
            	              		lv_startsets_11_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.KVPair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalKiCool.g:226:4: ( (lv_intermediates_12_0= ruleIntermediateReference ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKiCool.g:227:1: (lv_intermediates_12_0= ruleIntermediateReference )
            	    {
            	    // InternalKiCool.g:227:1: (lv_intermediates_12_0= ruleIntermediateReference )
            	    // InternalKiCool.g:228:3: lv_intermediates_12_0= ruleIntermediateReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_intermediates_12_0=ruleIntermediateReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"intermediates",
            	              		lv_intermediates_12_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.IntermediateReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalKiCool.g:244:3: ( (lv_processors_13_0= ruleProcessorGroup ) )
            // InternalKiCool.g:245:1: (lv_processors_13_0= ruleProcessorGroup )
            {
            // InternalKiCool.g:245:1: (lv_processors_13_0= ruleProcessorGroup )
            // InternalKiCool.g:246:3: lv_processors_13_0= ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_processors_13_0=ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
              	        }
                     		set(
                     			current, 
                     			"processors",
                      		lv_processors_13_0, 
                      		"de.cau.cs.kieler.kicool.KiCool.ProcessorGroup");
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleIntermediateReference"
    // InternalKiCool.g:270:1: entryRuleIntermediateReference returns [EObject current=null] : iv_ruleIntermediateReference= ruleIntermediateReference EOF ;
    public final EObject entryRuleIntermediateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediateReference = null;


        try {
            // InternalKiCool.g:271:2: (iv_ruleIntermediateReference= ruleIntermediateReference EOF )
            // InternalKiCool.g:272:2: iv_ruleIntermediateReference= ruleIntermediateReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntermediateReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntermediateReference=ruleIntermediateReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntermediateReference; 
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
    // $ANTLR end "entryRuleIntermediateReference"


    // $ANTLR start "ruleIntermediateReference"
    // InternalKiCool.g:279:1: ruleIntermediateReference returns [EObject current=null] : (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleIntermediateReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:282:28: ( (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ) )
            // InternalKiCool.g:283:1: (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? )
            {
            // InternalKiCool.g:283:1: (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? )
            // InternalKiCool.g:283:3: otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntermediateReferenceAccess().getIntermediateKeyword_0());
                  
            }
            // InternalKiCool.g:287:1: ( (lv_id_1_0= ruleQualifiedID ) )
            // InternalKiCool.g:288:1: (lv_id_1_0= ruleQualifiedID )
            {
            // InternalKiCool.g:288:1: (lv_id_1_0= ruleQualifiedID )
            // InternalKiCool.g:289:3: lv_id_1_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntermediateReferenceAccess().getIdQualifiedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_id_1_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntermediateReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.QualifiedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:305:2: (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:305:4: otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntermediateReferenceAccess().getAliasKeyword_2_0());
                          
                    }
                    // InternalKiCool.g:309:1: ( (lv_alias_3_0= ruleEString ) )
                    // InternalKiCool.g:310:1: (lv_alias_3_0= ruleEString )
                    {
                    // InternalKiCool.g:310:1: (lv_alias_3_0= ruleEString )
                    // InternalKiCool.g:311:3: lv_alias_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntermediateReferenceAccess().getAliasEStringParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_alias_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntermediateReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"alias",
                              		lv_alias_3_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.EString");
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
    // $ANTLR end "ruleIntermediateReference"


    // $ANTLR start "entryRuleProcessorGroup"
    // InternalKiCool.g:335:1: entryRuleProcessorGroup returns [EObject current=null] : iv_ruleProcessorGroup= ruleProcessorGroup EOF ;
    public final EObject entryRuleProcessorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorGroup = null;


        try {
            // InternalKiCool.g:336:2: (iv_ruleProcessorGroup= ruleProcessorGroup EOF )
            // InternalKiCool.g:337:2: iv_ruleProcessorGroup= ruleProcessorGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcessorGroup=ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessorGroup; 
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
    // $ANTLR end "entryRuleProcessorGroup"


    // $ANTLR start "ruleProcessorGroup"
    // InternalKiCool.g:344:1: ruleProcessorGroup returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ ) ;
    public final EObject ruleProcessorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_processors_2_0 = null;

        EObject lv_processors_4_0 = null;

        EObject lv_processors_6_0 = null;

        EObject lv_processors_9_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:347:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ ) )
            // InternalKiCool.g:348:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ )
            {
            // InternalKiCool.g:348:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ )
            // InternalKiCool.g:348:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+
            {
            // InternalKiCool.g:348:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiCool.g:348:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProcessorGroupAccess().getLabelKeyword_0_0());
                          
                    }
                    // InternalKiCool.g:352:1: ( (lv_label_1_0= ruleEString ) )
                    // InternalKiCool.g:353:1: (lv_label_1_0= ruleEString )
                    {
                    // InternalKiCool.g:353:1: (lv_label_1_0= ruleEString )
                    // InternalKiCool.g:354:3: lv_label_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_label_1_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProcessorGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_1_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiCool.g:370:4: ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=5;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalKiCool.g:370:5: ( (lv_processors_2_0= ruleProcessor ) )
            	    {
            	    // InternalKiCool.g:370:5: ( (lv_processors_2_0= ruleProcessor ) )
            	    // InternalKiCool.g:371:1: (lv_processors_2_0= ruleProcessor )
            	    {
            	    // InternalKiCool.g:371:1: (lv_processors_2_0= ruleProcessor )
            	    // InternalKiCool.g:372:3: lv_processors_2_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_processors_2_0=ruleProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_2_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.Processor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKiCool.g:389:6: (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) )
            	    {
            	    // InternalKiCool.g:389:6: (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) )
            	    // InternalKiCool.g:389:8: otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProcessorGroupAccess().getSystemKeyword_1_1_0());
            	          
            	    }
            	    // InternalKiCool.g:393:1: ( (lv_processors_4_0= ruleProcessorSystem ) )
            	    // InternalKiCool.g:394:1: (lv_processors_4_0= ruleProcessorSystem )
            	    {
            	    // InternalKiCool.g:394:1: (lv_processors_4_0= ruleProcessorSystem )
            	    // InternalKiCool.g:395:3: lv_processors_4_0= ruleProcessorSystem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorSystemParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_processors_4_0=ruleProcessorSystem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_4_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.ProcessorSystem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKiCool.g:412:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
            	    {
            	    // InternalKiCool.g:412:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
            	    // InternalKiCool.g:412:8: otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']'
            	    {
            	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_2_0());
            	          
            	    }
            	    // InternalKiCool.g:416:1: ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) )
            	    // InternalKiCool.g:417:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
            	    {
            	    // InternalKiCool.g:417:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
            	    // InternalKiCool.g:418:3: lv_processors_6_0= ruleProcessorAlternativeGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_processors_6_0=ruleProcessorAlternativeGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_6_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.ProcessorAlternativeGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_2_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalKiCool.g:439:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
            	    {
            	    // InternalKiCool.g:439:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
            	    // InternalKiCool.g:439:8: otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']'
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_3_0());
            	          
            	    }
            	    // InternalKiCool.g:443:1: ( (lv_processors_9_0= ruleProcessorGroup ) )
            	    // InternalKiCool.g:444:1: (lv_processors_9_0= ruleProcessorGroup )
            	    {
            	    // InternalKiCool.g:444:1: (lv_processors_9_0= ruleProcessorGroup )
            	    // InternalKiCool.g:445:3: lv_processors_9_0= ruleProcessorGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_processors_9_0=ruleProcessorGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_9_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.ProcessorGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_3_2());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleProcessorGroup"


    // $ANTLR start "entryRuleProcessor"
    // InternalKiCool.g:473:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalKiCool.g:474:2: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalKiCool.g:475:2: iv_ruleProcessor= ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcessor=ruleProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessor; 
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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalKiCool.g:482:1: ruleProcessor returns [EObject current=null] : ( (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )* (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )* ( (lv_id_6_0= ruleQualifiedID ) ) (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )* (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )* ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_presets_2_0 = null;

        EObject lv_preprocesses_5_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        EObject lv_postprocesses_11_0 = null;

        EObject lv_postsets_14_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:485:28: ( ( (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )* (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )* ( (lv_id_6_0= ruleQualifiedID ) ) (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )* (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )* ) )
            // InternalKiCool.g:486:1: ( (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )* (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )* ( (lv_id_6_0= ruleQualifiedID ) ) (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )* (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )* )
            {
            // InternalKiCool.g:486:1: ( (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )* (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )* ( (lv_id_6_0= ruleQualifiedID ) ) (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )* (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )* )
            // InternalKiCool.g:486:2: (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )* (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )* ( (lv_id_6_0= ruleQualifiedID ) ) (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )* (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )*
            {
            // InternalKiCool.g:486:2: (otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==22) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiCool.g:486:4: otherlv_0= 'pre' otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) )
            	    {
            	    otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getPreKeyword_0_0());
            	          
            	    }
            	    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getProcessorAccess().getSetKeyword_0_1());
            	          
            	    }
            	    // InternalKiCool.g:494:1: ( (lv_presets_2_0= ruleKVPair ) )
            	    // InternalKiCool.g:495:1: (lv_presets_2_0= ruleKVPair )
            	    {
            	    // InternalKiCool.g:495:1: (lv_presets_2_0= ruleKVPair )
            	    // InternalKiCool.g:496:3: lv_presets_2_0= ruleKVPair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_presets_2_0=ruleKVPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"presets",
            	              		lv_presets_2_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.KVPair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalKiCool.g:512:4: (otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiCool.g:512:6: otherlv_3= 'pre' otherlv_4= 'process' ( (lv_preprocesses_5_0= ruleCoProcessor ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProcessorAccess().getPreKeyword_1_0());
            	          
            	    }
            	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getProcessorAccess().getProcessKeyword_1_1());
            	          
            	    }
            	    // InternalKiCool.g:520:1: ( (lv_preprocesses_5_0= ruleCoProcessor ) )
            	    // InternalKiCool.g:521:1: (lv_preprocesses_5_0= ruleCoProcessor )
            	    {
            	    // InternalKiCool.g:521:1: (lv_preprocesses_5_0= ruleCoProcessor )
            	    // InternalKiCool.g:522:3: lv_preprocesses_5_0= ruleCoProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPreprocessesCoProcessorParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_preprocesses_5_0=ruleCoProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"preprocesses",
            	              		lv_preprocesses_5_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.CoProcessor");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalKiCool.g:538:4: ( (lv_id_6_0= ruleQualifiedID ) )
            // InternalKiCool.g:539:1: (lv_id_6_0= ruleQualifiedID )
            {
            // InternalKiCool.g:539:1: (lv_id_6_0= ruleQualifiedID )
            // InternalKiCool.g:540:3: lv_id_6_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_id_6_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessorRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_6_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.QualifiedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:556:2: (otherlv_7= 'intermediate' ( ( ruleQualifiedID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiCool.g:556:4: otherlv_7= 'intermediate' ( ( ruleQualifiedID ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProcessorAccess().getIntermediateKeyword_3_0());
                          
                    }
                    // InternalKiCool.g:560:1: ( ( ruleQualifiedID ) )
                    // InternalKiCool.g:561:1: ( ruleQualifiedID )
                    {
                    // InternalKiCool.g:561:1: ( ruleQualifiedID )
                    // InternalKiCool.g:562:3: ruleQualifiedID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getProcessorRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    ruleQualifiedID();

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

            // InternalKiCool.g:578:4: (otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==28) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiCool.g:578:6: otherlv_9= 'post' otherlv_10= 'process' ( (lv_postprocesses_11_0= ruleCoProcessor ) )
            	    {
            	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getProcessorAccess().getPostKeyword_4_0());
            	          
            	    }
            	    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getProcessorAccess().getProcessKeyword_4_1());
            	          
            	    }
            	    // InternalKiCool.g:586:1: ( (lv_postprocesses_11_0= ruleCoProcessor ) )
            	    // InternalKiCool.g:587:1: (lv_postprocesses_11_0= ruleCoProcessor )
            	    {
            	    // InternalKiCool.g:587:1: (lv_postprocesses_11_0= ruleCoProcessor )
            	    // InternalKiCool.g:588:3: lv_postprocesses_11_0= ruleCoProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPostprocessesCoProcessorParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_postprocesses_11_0=ruleCoProcessor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"postprocesses",
            	              		lv_postprocesses_11_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.CoProcessor");
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

            // InternalKiCool.g:604:4: (otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiCool.g:604:6: otherlv_12= 'post' otherlv_13= 'set' ( (lv_postsets_14_0= ruleKVPair ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getProcessorAccess().getPostKeyword_5_0());
            	          
            	    }
            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getProcessorAccess().getSetKeyword_5_1());
            	          
            	    }
            	    // InternalKiCool.g:612:1: ( (lv_postsets_14_0= ruleKVPair ) )
            	    // InternalKiCool.g:613:1: (lv_postsets_14_0= ruleKVPair )
            	    {
            	    // InternalKiCool.g:613:1: (lv_postsets_14_0= ruleKVPair )
            	    // InternalKiCool.g:614:3: lv_postsets_14_0= ruleKVPair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_postsets_14_0=ruleKVPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"postsets",
            	              		lv_postsets_14_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.KVPair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleCoProcessor"
    // InternalKiCool.g:638:1: entryRuleCoProcessor returns [EObject current=null] : iv_ruleCoProcessor= ruleCoProcessor EOF ;
    public final EObject entryRuleCoProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoProcessor = null;


        try {
            // InternalKiCool.g:639:2: (iv_ruleCoProcessor= ruleCoProcessor EOF )
            // InternalKiCool.g:640:2: iv_ruleCoProcessor= ruleCoProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCoProcessor=ruleCoProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoProcessor; 
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
    // $ANTLR end "entryRuleCoProcessor"


    // $ANTLR start "ruleCoProcessor"
    // InternalKiCool.g:647:1: ruleCoProcessor returns [EObject current=null] : ( ( (lv_id_0_0= ruleQualifiedID ) ) ( (lv_silent_1_0= 'silent' ) )? ) ;
    public final EObject ruleCoProcessor() throws RecognitionException {
        EObject current = null;

        Token lv_silent_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:650:28: ( ( ( (lv_id_0_0= ruleQualifiedID ) ) ( (lv_silent_1_0= 'silent' ) )? ) )
            // InternalKiCool.g:651:1: ( ( (lv_id_0_0= ruleQualifiedID ) ) ( (lv_silent_1_0= 'silent' ) )? )
            {
            // InternalKiCool.g:651:1: ( ( (lv_id_0_0= ruleQualifiedID ) ) ( (lv_silent_1_0= 'silent' ) )? )
            // InternalKiCool.g:651:2: ( (lv_id_0_0= ruleQualifiedID ) ) ( (lv_silent_1_0= 'silent' ) )?
            {
            // InternalKiCool.g:651:2: ( (lv_id_0_0= ruleQualifiedID ) )
            // InternalKiCool.g:652:1: (lv_id_0_0= ruleQualifiedID )
            {
            // InternalKiCool.g:652:1: (lv_id_0_0= ruleQualifiedID )
            // InternalKiCool.g:653:3: lv_id_0_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCoProcessorAccess().getIdQualifiedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_id_0_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCoProcessorRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.QualifiedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:669:2: ( (lv_silent_1_0= 'silent' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiCool.g:670:1: (lv_silent_1_0= 'silent' )
                    {
                    // InternalKiCool.g:670:1: (lv_silent_1_0= 'silent' )
                    // InternalKiCool.g:671:3: lv_silent_1_0= 'silent'
                    {
                    lv_silent_1_0=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_silent_1_0, grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCoProcessorRule());
                      	        }
                             		setWithLastConsumed(current, "silent", true, "silent");
                      	    
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
    // $ANTLR end "ruleCoProcessor"


    // $ANTLR start "entryRuleProcessorSystem"
    // InternalKiCool.g:692:1: entryRuleProcessorSystem returns [EObject current=null] : iv_ruleProcessorSystem= ruleProcessorSystem EOF ;
    public final EObject entryRuleProcessorSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorSystem = null;


        try {
            // InternalKiCool.g:693:2: (iv_ruleProcessorSystem= ruleProcessorSystem EOF )
            // InternalKiCool.g:694:2: iv_ruleProcessorSystem= ruleProcessorSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcessorSystem=ruleProcessorSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessorSystem; 
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
    // $ANTLR end "entryRuleProcessorSystem"


    // $ANTLR start "ruleProcessorSystem"
    // InternalKiCool.g:701:1: ruleProcessorSystem returns [EObject current=null] : ( (lv_id_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleProcessorSystem() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:704:28: ( ( (lv_id_0_0= ruleQualifiedID ) ) )
            // InternalKiCool.g:705:1: ( (lv_id_0_0= ruleQualifiedID ) )
            {
            // InternalKiCool.g:705:1: ( (lv_id_0_0= ruleQualifiedID ) )
            // InternalKiCool.g:706:1: (lv_id_0_0= ruleQualifiedID )
            {
            // InternalKiCool.g:706:1: (lv_id_0_0= ruleQualifiedID )
            // InternalKiCool.g:707:3: lv_id_0_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessorSystemAccess().getIdQualifiedIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_id_0_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessorSystemRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.QualifiedID");
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
    // $ANTLR end "ruleProcessorSystem"


    // $ANTLR start "entryRuleProcessorAlternativeGroup"
    // InternalKiCool.g:731:1: entryRuleProcessorAlternativeGroup returns [EObject current=null] : iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF ;
    public final EObject entryRuleProcessorAlternativeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorAlternativeGroup = null;


        try {
            // InternalKiCool.g:732:2: (iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF )
            // InternalKiCool.g:733:2: iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessorAlternativeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcessorAlternativeGroup=ruleProcessorAlternativeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessorAlternativeGroup; 
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
    // $ANTLR end "entryRuleProcessorAlternativeGroup"


    // $ANTLR start "ruleProcessorAlternativeGroup"
    // InternalKiCool.g:740:1: ruleProcessorAlternativeGroup returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) ) ;
    public final EObject ruleProcessorAlternativeGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_processors_2_0 = null;

        EObject lv_processors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:743:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) ) )
            // InternalKiCool.g:744:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) )
            {
            // InternalKiCool.g:744:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) )
            // InternalKiCool.g:744:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ )
            {
            // InternalKiCool.g:744:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_STRING) ) {
                    int LA15_3 = input.LA(3);

                    if ( (synpred18_InternalKiCool()) ) {
                        alt15=1;
                    }
                }
                else if ( (LA15_1==RULE_ID) ) {
                    int LA15_4 = input.LA(3);

                    if ( (synpred18_InternalKiCool()) ) {
                        alt15=1;
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalKiCool.g:744:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProcessorAlternativeGroupAccess().getLabelKeyword_0_0());
                          
                    }
                    // InternalKiCool.g:748:1: ( (lv_label_1_0= ruleEString ) )
                    // InternalKiCool.g:749:1: (lv_label_1_0= ruleEString )
                    {
                    // InternalKiCool.g:749:1: (lv_label_1_0= ruleEString )
                    // InternalKiCool.g:750:3: lv_label_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_label_1_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProcessorAlternativeGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_1_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiCool.g:766:4: ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ )
            // InternalKiCool.g:766:5: ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+
            {
            // InternalKiCool.g:766:5: ( (lv_processors_2_0= ruleProcessorGroup ) )
            // InternalKiCool.g:767:1: (lv_processors_2_0= ruleProcessorGroup )
            {
            // InternalKiCool.g:767:1: (lv_processors_2_0= ruleProcessorGroup )
            // InternalKiCool.g:768:3: lv_processors_2_0= ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_processors_2_0=ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessorAlternativeGroupRule());
              	        }
                     		add(
                     			current, 
                     			"processors",
                      		lv_processors_2_0, 
                      		"de.cau.cs.kieler.kicool.KiCool.ProcessorGroup");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:784:2: (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiCool.g:784:4: otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    // InternalKiCool.g:788:1: ( (lv_processors_4_0= ruleProcessorGroup ) )
            	    // InternalKiCool.g:789:1: (lv_processors_4_0= ruleProcessorGroup )
            	    {
            	    // InternalKiCool.g:789:1: (lv_processors_4_0= ruleProcessorGroup )
            	    // InternalKiCool.g:790:3: lv_processors_4_0= ruleProcessorGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_processors_4_0=ruleProcessorGroup();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProcessorAlternativeGroupRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processors",
            	              		lv_processors_4_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.ProcessorGroup");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "ruleProcessorAlternativeGroup"


    // $ANTLR start "entryRuleKVPair"
    // InternalKiCool.g:814:1: entryRuleKVPair returns [EObject current=null] : iv_ruleKVPair= ruleKVPair EOF ;
    public final EObject entryRuleKVPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKVPair = null;


        try {
            // InternalKiCool.g:815:2: (iv_ruleKVPair= ruleKVPair EOF )
            // InternalKiCool.g:816:2: iv_ruleKVPair= ruleKVPair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKVPairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKVPair=ruleKVPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKVPair; 
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
    // $ANTLR end "entryRuleKVPair"


    // $ANTLR start "ruleKVPair"
    // InternalKiCool.g:823:1: ruleKVPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) ) ;
    public final EObject ruleKVPair() throws RecognitionException {
        EObject current = null;

        Token lv_isKeyValue_1_0=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:826:28: ( ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) ) )
            // InternalKiCool.g:827:1: ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) )
            {
            // InternalKiCool.g:827:1: ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) )
            // InternalKiCool.g:827:2: ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) )
            {
            // InternalKiCool.g:827:2: ( (lv_key_0_0= ruleEString ) )
            // InternalKiCool.g:828:1: (lv_key_0_0= ruleEString )
            {
            // InternalKiCool.g:828:1: (lv_key_0_0= ruleEString )
            // InternalKiCool.g:829:3: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKVPairAccess().getKeyEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKVPairRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:845:2: ( (lv_isKeyValue_1_0= 'key' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiCool.g:846:1: (lv_isKeyValue_1_0= 'key' )
                    {
                    // InternalKiCool.g:846:1: (lv_isKeyValue_1_0= 'key' )
                    // InternalKiCool.g:847:3: lv_isKeyValue_1_0= 'key'
                    {
                    lv_isKeyValue_1_0=(Token)match(input,32,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isKeyValue_1_0, grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getKVPairRule());
                      	        }
                             		setWithLastConsumed(current, "isKeyValue", true, "key");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiCool.g:860:3: ( (lv_value_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:861:1: (lv_value_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:861:1: (lv_value_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:862:3: lv_value_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKVPairAccess().getValueEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKVPairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
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
    // $ANTLR end "ruleKVPair"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKiCool.g:896:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiCool.g:897:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiCool.g:898:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKiCool.g:905:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:908:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiCool.g:909:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiCool.g:909:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:910:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:910:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:911:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKiCool.g:937:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiCool.g:938:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiCool.g:939:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKiCool.g:946:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:949:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiCool.g:950:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiCool.g:950:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiCool.g:950:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:954:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:955:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:955:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:956:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiCool.g:980:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKiCool.g:981:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKiCool.g:982:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKiCool.g:989:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:992:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiCool.g:993:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiCool.g:993:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiCool.g:993:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiCool.g:997:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:998:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:998:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:999:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiCool.g:1023:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1024:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1025:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1032:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1035:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:1036:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:1036:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:1036:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1040:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1041:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1041:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1042:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiCool.g:1058:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:1059:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:1059:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:1060:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalKiCool.g:1076:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:1076:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1080:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:1081:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:1081:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:1082:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop18;
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
    // InternalKiCool.g:1106:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1107:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1108:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1115:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1118:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiCool.g:1119:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiCool.g:1119:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKiCool.g:1119:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1123:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1124:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1124:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1125:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_25);
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

            // InternalKiCool.g:1141:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKiCool.g:1142:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKiCool.g:1142:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKiCool.g:1143:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalKiCool.g:1159:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiCool.g:1159:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1163:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKiCool.g:1164:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKiCool.g:1164:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKiCool.g:1165:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop19;
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
    // InternalKiCool.g:1189:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKiCool.g:1190:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKiCool.g:1191:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKiCool.g:1198:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1201:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:1202:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:1202:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:1202:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiCool.g:1206:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1207:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1207:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1208:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiCool.g:1224:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:1225:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:1225:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:1226:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalKiCool.g:1242:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKiCool.g:1242:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1246:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:1247:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:1247:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:1248:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop20;
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
    // InternalKiCool.g:1272:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1273:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1274:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1281:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKiCool.g:1284:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:1285:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:1285:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:1285:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1289:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1290:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1290:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1291:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1311:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1312:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1312:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1313:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1333:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:1334:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:1334:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKiCool.g:1335:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalKiCool.g:1351:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:1351:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1355:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:1356:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:1356:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:1357:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop21;
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
    // InternalKiCool.g:1381:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1382:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1383:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1390:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiCool.g:1393:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiCool.g:1394:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiCool.g:1394:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiCool.g:1394:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1398:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1399:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1399:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1400:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1420:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1421:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1421:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1422:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1442:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiCool.g:1443:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiCool.g:1443:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiCool.g:1444:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalKiCool.g:1460:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiCool.g:1460:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1464:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiCool.g:1465:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiCool.g:1465:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiCool.g:1466:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    break loop22;
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
    // InternalKiCool.g:1490:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1491:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1492:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1499:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1502:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiCool.g:1503:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiCool.g:1503:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiCool.g:1503:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1507:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1508:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1508:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1509:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalKiCool.g:1525:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiCool.g:1526:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiCool.g:1526:1: (lv_values_2_0= RULE_STRING )
            // InternalKiCool.g:1527:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalKiCool.g:1543:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:1543:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1547:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiCool.g:1548:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiCool.g:1548:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKiCool.g:1549:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
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
            	    break loop23;
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
    // InternalKiCool.g:1573:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1574:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1575:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1582:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiCool.g:1585:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiCool.g:1586:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiCool.g:1586:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiCool.g:1586:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1590:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1591:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1591:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1592:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1612:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1613:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1613:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1614:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1634:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiCool.g:1635:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiCool.g:1635:1: (lv_values_5_0= RULE_STRING )
            // InternalKiCool.g:1636:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalKiCool.g:1652:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:1652:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1656:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiCool.g:1657:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiCool.g:1657:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKiCool.g:1658:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
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
            	    break loop24;
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


    // $ANTLR start "entryRuleEString"
    // InternalKiCool.g:1682:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKiCool.g:1683:2: (iv_ruleEString= ruleEString EOF )
            // InternalKiCool.g:1684:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKiCool.g:1691:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1694:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalKiCool.g:1695:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalKiCool.g:1695:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiCool.g:1695:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiCool.g:1704:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
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

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKiCool.g:1722:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiCool.g:1723:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiCool.g:1724:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKiCool.g:1731:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1734:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiCool.g:1735:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiCool.g:1735:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalKiCool.g:1735:6: this_STRING_0= RULE_STRING
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
                    // InternalKiCool.g:1744:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiCool.g:1755:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKiCool.g:1770:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKiCool.g:1771:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKiCool.g:1772:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKiCool.g:1779:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1782:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKiCool.g:1783:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKiCool.g:1783:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                alt27=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==RULE_INT) ) {
                    alt27=4;
                }
                else if ( (LA27_4==RULE_FLOAT) ) {
                    alt27=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt27=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalKiCool.g:1783:6: this_STRING_0= RULE_STRING
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
                    // InternalKiCool.g:1792:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiCool.g:1803:10: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKiCool.g:1812:5: this_Integer_3= ruleInteger
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
                    // InternalKiCool.g:1824:5: this_Floateger_4= ruleFloateger
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
    // InternalKiCool.g:1842:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiCool.g:1843:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiCool.g:1844:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKiCool.g:1851:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1854:28: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKiCool.g:1855:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKiCool.g:1855:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKiCool.g:1855:6: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiCool.g:1862:1: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_ID) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKiCool.g:1862:2: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKiCool.g:1862:2: (kw= '.' | kw= '-' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==36) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==37) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalKiCool.g:1863:2: kw= '.'
            	            {
            	            kw=(Token)match(input,36,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiCool.g:1870:2: kw= '-'
            	            {
            	            kw=(Token)match(input,37,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalKiCool.g:1882:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKiCool.g:1883:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_7); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedID"
    // InternalKiCool.g:1903:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalKiCool.g:1904:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalKiCool.g:1905:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedID.getText(); 
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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalKiCool.g:1912:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1915:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalKiCool.g:1916:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalKiCool.g:1916:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalKiCool.g:1916:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiCool.g:1923:1: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKiCool.g:1924:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKiCool.g:1944:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiCool.g:1945:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiCool.g:1946:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKiCool.g:1953:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1956:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiCool.g:1957:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiCool.g:1957:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiCool.g:1957:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiCool.g:1957:2: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiCool.g:1958:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_7); if (state.failed) return current;
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
    // InternalKiCool.g:1978:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiCool.g:1979:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiCool.g:1980:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKiCool.g:1987:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1990:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiCool.g:1991:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiCool.g:1991:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiCool.g:1991:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiCool.g:1991:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiCool.g:1992:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_30); if (state.failed) return current;
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

    // $ANTLR start synpred10_InternalKiCool
    public final void synpred10_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_processors_6_0 = null;


        // InternalKiCool.g:412:6: ( (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) )
        // InternalKiCool.g:412:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
        {
        // InternalKiCool.g:412:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
        // InternalKiCool.g:412:8: otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']'
        {
        otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalKiCool.g:416:1: ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) )
        // InternalKiCool.g:417:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
        {
        // InternalKiCool.g:417:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
        // InternalKiCool.g:418:3: lv_processors_6_0= ruleProcessorAlternativeGroup
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_14);
        lv_processors_6_0=ruleProcessorAlternativeGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalKiCool

    // $ANTLR start synpred11_InternalKiCool
    public final void synpred11_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_processors_9_0 = null;


        // InternalKiCool.g:439:6: ( (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )
        // InternalKiCool.g:439:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
        {
        // InternalKiCool.g:439:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
        // InternalKiCool.g:439:8: otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']'
        {
        otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalKiCool.g:443:1: ( (lv_processors_9_0= ruleProcessorGroup ) )
        // InternalKiCool.g:444:1: (lv_processors_9_0= ruleProcessorGroup )
        {
        // InternalKiCool.g:444:1: (lv_processors_9_0= ruleProcessorGroup )
        // InternalKiCool.g:445:3: lv_processors_9_0= ruleProcessorGroup
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_14);
        lv_processors_9_0=ruleProcessorGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalKiCool

    // $ANTLR start synpred18_InternalKiCool
    public final void synpred18_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


        // InternalKiCool.g:744:4: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )
        // InternalKiCool.g:744:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
        {
        otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_9); if (state.failed) return ;
        // InternalKiCool.g:748:1: ( (lv_label_1_0= ruleEString ) )
        // InternalKiCool.g:749:1: (lv_label_1_0= ruleEString )
        {
        // InternalKiCool.g:749:1: (lv_label_1_0= ruleEString )
        // InternalKiCool.g:750:3: lv_label_1_0= ruleEString
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_label_1_0=ruleEString();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalKiCool

    // Delegated rules

    public final boolean synpred11_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\5\6\uffff\1\0\2\uffff";
    static final String dfa_4s = "\1\37\6\uffff\1\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\5\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4";
    static final String dfa_6s = "\7\uffff\1\0\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\14\uffff\1\6\6\uffff\1\7\1\1\1\4\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 370:4: ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalKiCool()) ) {s = 8;}

                        else if ( (synpred11_InternalKiCool()) ) {s = 9;}

                         
                        input.seek(index8_7);
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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000AF40020L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A040020L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A040022L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020800002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000021000003B0L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000001A0L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003400000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000200L});
    }


}