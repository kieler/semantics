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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'version'", "'label'", "'input'", "'intermediate'", "'alias'", "'['", "']'", "'pre'", "'set'", "'post'", "'|'", "'key'", "'@'", "'#'", "','", "'.'", "'-'"
    };
    public static final int RULE_COMMENT_ANNOTATION=6;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
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
    // InternalKiCool.g:82:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_id_1_0= ruleQualifiedID ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_INT ) ) otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )? ( (lv_intermediates_8_0= ruleIntermediateReference ) )* ( (lv_processors_9_0= ruleProcessorGroup ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_inputClass_7_0=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;

        EObject lv_intermediates_8_0 = null;

        EObject lv_processors_9_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:85:28: ( (otherlv_0= 'system' ( (lv_id_1_0= ruleQualifiedID ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_INT ) ) otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )? ( (lv_intermediates_8_0= ruleIntermediateReference ) )* ( (lv_processors_9_0= ruleProcessorGroup ) ) ) )
            // InternalKiCool.g:86:1: (otherlv_0= 'system' ( (lv_id_1_0= ruleQualifiedID ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_INT ) ) otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )? ( (lv_intermediates_8_0= ruleIntermediateReference ) )* ( (lv_processors_9_0= ruleProcessorGroup ) ) )
            {
            // InternalKiCool.g:86:1: (otherlv_0= 'system' ( (lv_id_1_0= ruleQualifiedID ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_INT ) ) otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )? ( (lv_intermediates_8_0= ruleIntermediateReference ) )* ( (lv_processors_9_0= ruleProcessorGroup ) ) )
            // InternalKiCool.g:86:3: otherlv_0= 'system' ( (lv_id_1_0= ruleQualifiedID ) ) otherlv_2= 'version' ( (lv_version_3_0= RULE_INT ) ) otherlv_4= 'label' ( (lv_label_5_0= ruleEString ) ) (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )? ( (lv_intermediates_8_0= ruleIntermediateReference ) )* ( (lv_processors_9_0= ruleProcessorGroup ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                  
            }
            // InternalKiCool.g:90:1: ( (lv_id_1_0= ruleQualifiedID ) )
            // InternalKiCool.g:91:1: (lv_id_1_0= ruleQualifiedID )
            {
            // InternalKiCool.g:91:1: (lv_id_1_0= ruleQualifiedID )
            // InternalKiCool.g:92:3: lv_id_1_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_id_1_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getVersionKeyword_2());
                  
            }
            // InternalKiCool.g:112:1: ( (lv_version_3_0= RULE_INT ) )
            // InternalKiCool.g:113:1: (lv_version_3_0= RULE_INT )
            {
            // InternalKiCool.g:113:1: (lv_version_3_0= RULE_INT )
            // InternalKiCool.g:114:3: lv_version_3_0= RULE_INT
            {
            lv_version_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_3_0, grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLabelKeyword_4());
                  
            }
            // InternalKiCool.g:134:1: ( (lv_label_5_0= ruleEString ) )
            // InternalKiCool.g:135:1: (lv_label_5_0= ruleEString )
            {
            // InternalKiCool.g:135:1: (lv_label_5_0= ruleEString )
            // InternalKiCool.g:136:3: lv_label_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_label_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:152:2: (otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKiCool.g:152:4: otherlv_6= 'input' ( (lv_inputClass_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getInputKeyword_6_0());
                          
                    }
                    // InternalKiCool.g:156:1: ( (lv_inputClass_7_0= RULE_ID ) )
                    // InternalKiCool.g:157:1: (lv_inputClass_7_0= RULE_ID )
                    {
                    // InternalKiCool.g:157:1: (lv_inputClass_7_0= RULE_ID )
                    // InternalKiCool.g:158:3: lv_inputClass_7_0= RULE_ID
                    {
                    lv_inputClass_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_inputClass_7_0, grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSystemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"inputClass",
                              		lv_inputClass_7_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiCool.g:174:4: ( (lv_intermediates_8_0= ruleIntermediateReference ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKiCool.g:175:1: (lv_intermediates_8_0= ruleIntermediateReference )
            	    {
            	    // InternalKiCool.g:175:1: (lv_intermediates_8_0= ruleIntermediateReference )
            	    // InternalKiCool.g:176:3: lv_intermediates_8_0= ruleIntermediateReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_intermediates_8_0=ruleIntermediateReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"intermediates",
            	              		lv_intermediates_8_0, 
            	              		"de.cau.cs.kieler.kicool.KiCool.IntermediateReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalKiCool.g:192:3: ( (lv_processors_9_0= ruleProcessorGroup ) )
            // InternalKiCool.g:193:1: (lv_processors_9_0= ruleProcessorGroup )
            {
            // InternalKiCool.g:193:1: (lv_processors_9_0= ruleProcessorGroup )
            // InternalKiCool.g:194:3: lv_processors_9_0= ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_processors_9_0=ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemRule());
              	        }
                     		set(
                     			current, 
                     			"processors",
                      		lv_processors_9_0, 
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
    // InternalKiCool.g:218:1: entryRuleIntermediateReference returns [EObject current=null] : iv_ruleIntermediateReference= ruleIntermediateReference EOF ;
    public final EObject entryRuleIntermediateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediateReference = null;


        try {
            // InternalKiCool.g:219:2: (iv_ruleIntermediateReference= ruleIntermediateReference EOF )
            // InternalKiCool.g:220:2: iv_ruleIntermediateReference= ruleIntermediateReference EOF
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
    // InternalKiCool.g:227:1: ruleIntermediateReference returns [EObject current=null] : (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleIntermediateReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:230:28: ( (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ) )
            // InternalKiCool.g:231:1: (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? )
            {
            // InternalKiCool.g:231:1: (otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? )
            // InternalKiCool.g:231:3: otherlv_0= 'intermediate' ( (lv_id_1_0= ruleQualifiedID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntermediateReferenceAccess().getIntermediateKeyword_0());
                  
            }
            // InternalKiCool.g:235:1: ( (lv_id_1_0= ruleQualifiedID ) )
            // InternalKiCool.g:236:1: (lv_id_1_0= ruleQualifiedID )
            {
            // InternalKiCool.g:236:1: (lv_id_1_0= ruleQualifiedID )
            // InternalKiCool.g:237:3: lv_id_1_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntermediateReferenceAccess().getIdQualifiedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_9);
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

            // InternalKiCool.g:253:2: (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKiCool.g:253:4: otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntermediateReferenceAccess().getAliasKeyword_2_0());
                          
                    }
                    // InternalKiCool.g:257:1: ( (lv_alias_3_0= ruleEString ) )
                    // InternalKiCool.g:258:1: (lv_alias_3_0= ruleEString )
                    {
                    // InternalKiCool.g:258:1: (lv_alias_3_0= ruleEString )
                    // InternalKiCool.g:259:3: lv_alias_3_0= ruleEString
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
    // InternalKiCool.g:283:1: entryRuleProcessorGroup returns [EObject current=null] : iv_ruleProcessorGroup= ruleProcessorGroup EOF ;
    public final EObject entryRuleProcessorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorGroup = null;


        try {
            // InternalKiCool.g:284:2: (iv_ruleProcessorGroup= ruleProcessorGroup EOF )
            // InternalKiCool.g:285:2: iv_ruleProcessorGroup= ruleProcessorGroup EOF
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
    // InternalKiCool.g:292:1: ruleProcessorGroup returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ ) ;
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
            // InternalKiCool.g:295:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ ) )
            // InternalKiCool.g:296:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ )
            {
            // InternalKiCool.g:296:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+ )
            // InternalKiCool.g:296:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+
            {
            // InternalKiCool.g:296:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKiCool.g:296:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProcessorGroupAccess().getLabelKeyword_0_0());
                          
                    }
                    // InternalKiCool.g:300:1: ( (lv_label_1_0= ruleEString ) )
                    // InternalKiCool.g:301:1: (lv_label_1_0= ruleEString )
                    {
                    // InternalKiCool.g:301:1: (lv_label_1_0= ruleEString )
                    // InternalKiCool.g:302:3: lv_label_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
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

            // InternalKiCool.g:318:4: ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalKiCool.g:318:5: ( (lv_processors_2_0= ruleProcessor ) )
            	    {
            	    // InternalKiCool.g:318:5: ( (lv_processors_2_0= ruleProcessor ) )
            	    // InternalKiCool.g:319:1: (lv_processors_2_0= ruleProcessor )
            	    {
            	    // InternalKiCool.g:319:1: (lv_processors_2_0= ruleProcessor )
            	    // InternalKiCool.g:320:3: lv_processors_2_0= ruleProcessor
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
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
            	    // InternalKiCool.g:337:6: (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) )
            	    {
            	    // InternalKiCool.g:337:6: (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) )
            	    // InternalKiCool.g:337:8: otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProcessorGroupAccess().getSystemKeyword_1_1_0());
            	          
            	    }
            	    // InternalKiCool.g:341:1: ( (lv_processors_4_0= ruleProcessorSystem ) )
            	    // InternalKiCool.g:342:1: (lv_processors_4_0= ruleProcessorSystem )
            	    {
            	    // InternalKiCool.g:342:1: (lv_processors_4_0= ruleProcessorSystem )
            	    // InternalKiCool.g:343:3: lv_processors_4_0= ruleProcessorSystem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorSystemParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
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
            	    // InternalKiCool.g:360:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
            	    {
            	    // InternalKiCool.g:360:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
            	    // InternalKiCool.g:360:8: otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']'
            	    {
            	    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_2_0());
            	          
            	    }
            	    // InternalKiCool.g:364:1: ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) )
            	    // InternalKiCool.g:365:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
            	    {
            	    // InternalKiCool.g:365:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
            	    // InternalKiCool.g:366:3: lv_processors_6_0= ruleProcessorAlternativeGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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

            	    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_2_2());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalKiCool.g:387:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
            	    {
            	    // InternalKiCool.g:387:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
            	    // InternalKiCool.g:387:8: otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']'
            	    {
            	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_3_0());
            	          
            	    }
            	    // InternalKiCool.g:391:1: ( (lv_processors_9_0= ruleProcessorGroup ) )
            	    // InternalKiCool.g:392:1: (lv_processors_9_0= ruleProcessorGroup )
            	    {
            	    // InternalKiCool.g:392:1: (lv_processors_9_0= ruleProcessorGroup )
            	    // InternalKiCool.g:393:3: lv_processors_9_0= ruleProcessorGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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

            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_3_2());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalKiCool.g:421:1: entryRuleProcessor returns [EObject current=null] : iv_ruleProcessor= ruleProcessor EOF ;
    public final EObject entryRuleProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessor = null;


        try {
            // InternalKiCool.g:422:2: (iv_ruleProcessor= ruleProcessor EOF )
            // InternalKiCool.g:423:2: iv_ruleProcessor= ruleProcessor EOF
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
    // InternalKiCool.g:430:1: ruleProcessor returns [EObject current=null] : ( (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )? ( (lv_id_3_0= ruleQualifiedID ) ) (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )? ) ;
    public final EObject ruleProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_presets_2_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_postsets_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:433:28: ( ( (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )? ( (lv_id_3_0= ruleQualifiedID ) ) (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )? ) )
            // InternalKiCool.g:434:1: ( (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )? ( (lv_id_3_0= ruleQualifiedID ) ) (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )? )
            {
            // InternalKiCool.g:434:1: ( (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )? ( (lv_id_3_0= ruleQualifiedID ) ) (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )? )
            // InternalKiCool.g:434:2: (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )? ( (lv_id_3_0= ruleQualifiedID ) ) (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )?
            {
            // InternalKiCool.g:434:2: (otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiCool.g:434:4: otherlv_0= 'pre' (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProcessorAccess().getPreKeyword_0_0());
                          
                    }
                    // InternalKiCool.g:438:1: (otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKiCool.g:438:3: otherlv_1= 'set' ( (lv_presets_2_0= ruleKVPair ) )
                    	    {
                    	    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getProcessorAccess().getSetKeyword_0_1_0());
                    	          
                    	    }
                    	    // InternalKiCool.g:442:1: ( (lv_presets_2_0= ruleKVPair ) )
                    	    // InternalKiCool.g:443:1: (lv_presets_2_0= ruleKVPair )
                    	    {
                    	    // InternalKiCool.g:443:1: (lv_presets_2_0= ruleKVPair )
                    	    // InternalKiCool.g:444:3: lv_presets_2_0= ruleKVPair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // InternalKiCool.g:460:6: ( (lv_id_3_0= ruleQualifiedID ) )
            // InternalKiCool.g:461:1: (lv_id_3_0= ruleQualifiedID )
            {
            // InternalKiCool.g:461:1: (lv_id_3_0= ruleQualifiedID )
            // InternalKiCool.g:462:3: lv_id_3_0= ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_id_3_0=ruleQualifiedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessorRule());
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

            // InternalKiCool.g:478:2: (otherlv_4= 'intermediate' ( ( ruleQualifiedID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiCool.g:478:4: otherlv_4= 'intermediate' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getProcessorAccess().getIntermediateKeyword_2_0());
                          
                    }
                    // InternalKiCool.g:482:1: ( ( ruleQualifiedID ) )
                    // InternalKiCool.g:483:1: ( ruleQualifiedID )
                    {
                    // InternalKiCool.g:483:1: ( ruleQualifiedID )
                    // InternalKiCool.g:484:3: ruleQualifiedID
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
                       
                      	        newCompositeNode(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
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

            // InternalKiCool.g:500:4: (otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiCool.g:500:6: otherlv_6= 'post' (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getProcessorAccess().getPostKeyword_3_0());
                          
                    }
                    // InternalKiCool.g:504:1: (otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKiCool.g:504:3: otherlv_7= 'set' ( (lv_postsets_8_0= ruleKVPair ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getProcessorAccess().getSetKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalKiCool.g:508:1: ( (lv_postsets_8_0= ruleKVPair ) )
                    	    // InternalKiCool.g:509:1: (lv_postsets_8_0= ruleKVPair )
                    	    {
                    	    // InternalKiCool.g:509:1: (lv_postsets_8_0= ruleKVPair )
                    	    // InternalKiCool.g:510:3: lv_postsets_8_0= ruleKVPair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_17);
                    	    lv_postsets_8_0=ruleKVPair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getProcessorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"postsets",
                    	              		lv_postsets_8_0, 
                    	              		"de.cau.cs.kieler.kicool.KiCool.KVPair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleProcessorSystem"
    // InternalKiCool.g:534:1: entryRuleProcessorSystem returns [EObject current=null] : iv_ruleProcessorSystem= ruleProcessorSystem EOF ;
    public final EObject entryRuleProcessorSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorSystem = null;


        try {
            // InternalKiCool.g:535:2: (iv_ruleProcessorSystem= ruleProcessorSystem EOF )
            // InternalKiCool.g:536:2: iv_ruleProcessorSystem= ruleProcessorSystem EOF
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
    // InternalKiCool.g:543:1: ruleProcessorSystem returns [EObject current=null] : ( (lv_id_0_0= ruleQualifiedID ) ) ;
    public final EObject ruleProcessorSystem() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:546:28: ( ( (lv_id_0_0= ruleQualifiedID ) ) )
            // InternalKiCool.g:547:1: ( (lv_id_0_0= ruleQualifiedID ) )
            {
            // InternalKiCool.g:547:1: ( (lv_id_0_0= ruleQualifiedID ) )
            // InternalKiCool.g:548:1: (lv_id_0_0= ruleQualifiedID )
            {
            // InternalKiCool.g:548:1: (lv_id_0_0= ruleQualifiedID )
            // InternalKiCool.g:549:3: lv_id_0_0= ruleQualifiedID
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
    // InternalKiCool.g:573:1: entryRuleProcessorAlternativeGroup returns [EObject current=null] : iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF ;
    public final EObject entryRuleProcessorAlternativeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorAlternativeGroup = null;


        try {
            // InternalKiCool.g:574:2: (iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF )
            // InternalKiCool.g:575:2: iv_ruleProcessorAlternativeGroup= ruleProcessorAlternativeGroup EOF
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
    // InternalKiCool.g:582:1: ruleProcessorAlternativeGroup returns [EObject current=null] : ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) ) ;
    public final EObject ruleProcessorAlternativeGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_processors_2_0 = null;

        EObject lv_processors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:585:28: ( ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) ) )
            // InternalKiCool.g:586:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) )
            {
            // InternalKiCool.g:586:1: ( (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ ) )
            // InternalKiCool.g:586:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )? ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ )
            {
            // InternalKiCool.g:586:2: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    int LA11_3 = input.LA(3);

                    if ( (synpred14_InternalKiCool()) ) {
                        alt11=1;
                    }
                }
                else if ( (LA11_1==RULE_ID) ) {
                    int LA11_4 = input.LA(3);

                    if ( (synpred14_InternalKiCool()) ) {
                        alt11=1;
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalKiCool.g:586:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getProcessorAlternativeGroupAccess().getLabelKeyword_0_0());
                          
                    }
                    // InternalKiCool.g:590:1: ( (lv_label_1_0= ruleEString ) )
                    // InternalKiCool.g:591:1: (lv_label_1_0= ruleEString )
                    {
                    // InternalKiCool.g:591:1: (lv_label_1_0= ruleEString )
                    // InternalKiCool.g:592:3: lv_label_1_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
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

            // InternalKiCool.g:608:4: ( ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+ )
            // InternalKiCool.g:608:5: ( (lv_processors_2_0= ruleProcessorGroup ) ) (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+
            {
            // InternalKiCool.g:608:5: ( (lv_processors_2_0= ruleProcessorGroup ) )
            // InternalKiCool.g:609:1: (lv_processors_2_0= ruleProcessorGroup )
            {
            // InternalKiCool.g:609:1: (lv_processors_2_0= ruleProcessorGroup )
            // InternalKiCool.g:610:3: lv_processors_2_0= ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_18);
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

            // InternalKiCool.g:626:2: (otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiCool.g:626:4: otherlv_3= '|' ( (lv_processors_4_0= ruleProcessorGroup ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    // InternalKiCool.g:630:1: ( (lv_processors_4_0= ruleProcessorGroup ) )
            	    // InternalKiCool.g:631:1: (lv_processors_4_0= ruleProcessorGroup )
            	    {
            	    // InternalKiCool.g:631:1: (lv_processors_4_0= ruleProcessorGroup )
            	    // InternalKiCool.g:632:3: lv_processors_4_0= ruleProcessorGroup
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalKiCool.g:656:1: entryRuleKVPair returns [EObject current=null] : iv_ruleKVPair= ruleKVPair EOF ;
    public final EObject entryRuleKVPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKVPair = null;


        try {
            // InternalKiCool.g:657:2: (iv_ruleKVPair= ruleKVPair EOF )
            // InternalKiCool.g:658:2: iv_ruleKVPair= ruleKVPair EOF
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
    // InternalKiCool.g:665:1: ruleKVPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) ) ;
    public final EObject ruleKVPair() throws RecognitionException {
        EObject current = null;

        Token lv_isKeyValue_1_0=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:668:28: ( ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) ) )
            // InternalKiCool.g:669:1: ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) )
            {
            // InternalKiCool.g:669:1: ( ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) ) )
            // InternalKiCool.g:669:2: ( (lv_key_0_0= ruleEString ) ) ( (lv_isKeyValue_1_0= 'key' ) )? ( (lv_value_2_0= ruleEStringAllTypes ) )
            {
            // InternalKiCool.g:669:2: ( (lv_key_0_0= ruleEString ) )
            // InternalKiCool.g:670:1: (lv_key_0_0= ruleEString )
            {
            // InternalKiCool.g:670:1: (lv_key_0_0= ruleEString )
            // InternalKiCool.g:671:3: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKVPairAccess().getKeyEStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
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

            // InternalKiCool.g:687:2: ( (lv_isKeyValue_1_0= 'key' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKiCool.g:688:1: (lv_isKeyValue_1_0= 'key' )
                    {
                    // InternalKiCool.g:688:1: (lv_isKeyValue_1_0= 'key' )
                    // InternalKiCool.g:689:3: lv_isKeyValue_1_0= 'key'
                    {
                    lv_isKeyValue_1_0=(Token)match(input,28,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            // InternalKiCool.g:702:3: ( (lv_value_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:703:1: (lv_value_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:703:1: (lv_value_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:704:3: lv_value_2_0= ruleEStringAllTypes
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
    // InternalKiCool.g:738:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiCool.g:739:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiCool.g:740:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKiCool.g:747:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:750:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiCool.g:751:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiCool.g:751:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:752:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:752:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:753:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:779:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiCool.g:780:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiCool.g:781:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKiCool.g:788:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:791:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiCool.g:792:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiCool.g:792:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiCool.g:792:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:796:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:797:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:797:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:798:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiCool.g:822:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKiCool.g:823:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKiCool.g:824:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKiCool.g:831:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:834:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiCool.g:835:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiCool.g:835:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiCool.g:835:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiCool.g:839:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:840:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:840:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:841:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiCool.g:865:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:866:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:867:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:874:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:877:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:878:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:878:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:878:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:882:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:883:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:883:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:884:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
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

            // InternalKiCool.g:900:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:901:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:901:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:902:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiCool.g:918:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKiCool.g:918:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:922:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:923:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:923:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:924:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop14;
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
    // InternalKiCool.g:948:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:949:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:950:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:957:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:960:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiCool.g:961:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiCool.g:961:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKiCool.g:961:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:965:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:966:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:966:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:967:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            // InternalKiCool.g:983:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKiCool.g:984:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKiCool.g:984:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKiCool.g:985:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiCool.g:1001:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiCool.g:1001:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1005:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKiCool.g:1006:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKiCool.g:1006:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKiCool.g:1007:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop15;
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
    // InternalKiCool.g:1031:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKiCool.g:1032:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKiCool.g:1033:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKiCool.g:1040:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1043:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:1044:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:1044:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:1044:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiCool.g:1048:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1049:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1049:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1050:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_20);
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

            // InternalKiCool.g:1066:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:1067:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:1067:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiCool.g:1068:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiCool.g:1084:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiCool.g:1084:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1088:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:1089:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:1089:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:1090:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop16;
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
    // InternalKiCool.g:1114:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1115:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1116:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1123:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKiCool.g:1126:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiCool.g:1127:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiCool.g:1127:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKiCool.g:1127:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1131:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1132:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1132:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1133:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1153:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1154:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1154:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1155:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1175:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKiCool.g:1176:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKiCool.g:1176:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKiCool.g:1177:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiCool.g:1193:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKiCool.g:1193:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1197:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKiCool.g:1198:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiCool.g:1198:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKiCool.g:1199:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	    break loop17;
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
    // InternalKiCool.g:1223:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1224:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1225:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1232:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiCool.g:1235:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiCool.g:1236:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiCool.g:1236:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiCool.g:1236:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1240:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1241:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1241:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1242:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1262:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1263:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1263:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1264:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1284:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiCool.g:1285:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiCool.g:1285:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiCool.g:1286:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            // InternalKiCool.g:1302:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:1302:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1306:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiCool.g:1307:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiCool.g:1307:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiCool.g:1308:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKiCool.g:1332:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1333:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1334:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1341:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1344:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiCool.g:1345:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiCool.g:1345:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiCool.g:1345:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1349:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1350:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1350:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1351:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiCool.g:1367:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiCool.g:1368:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiCool.g:1368:1: (lv_values_2_0= RULE_STRING )
            // InternalKiCool.g:1369:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
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

            // InternalKiCool.g:1385:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiCool.g:1385:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiCool.g:1389:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiCool.g:1390:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiCool.g:1390:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKiCool.g:1391:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKiCool.g:1415:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiCool.g:1416:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:1417:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:1424:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiCool.g:1427:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiCool.g:1428:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiCool.g:1428:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiCool.g:1428:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiCool.g:1432:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiCool.g:1433:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiCool.g:1433:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiCool.g:1434:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiCool.g:1454:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiCool.g:1455:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiCool.g:1455:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiCool.g:1456:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiCool.g:1476:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiCool.g:1477:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiCool.g:1477:1: (lv_values_5_0= RULE_STRING )
            // InternalKiCool.g:1478:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
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

            // InternalKiCool.g:1494:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKiCool.g:1494:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiCool.g:1498:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiCool.g:1499:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiCool.g:1499:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKiCool.g:1500:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // InternalKiCool.g:1524:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKiCool.g:1525:2: (iv_ruleEString= ruleEString EOF )
            // InternalKiCool.g:1526:2: iv_ruleEString= ruleEString EOF
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
    // InternalKiCool.g:1533:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1536:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalKiCool.g:1537:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalKiCool.g:1537:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiCool.g:1537:6: this_STRING_0= RULE_STRING
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
                    // InternalKiCool.g:1546:5: this_ExtendedID_1= ruleExtendedID
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
    // InternalKiCool.g:1564:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiCool.g:1565:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiCool.g:1566:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKiCool.g:1573:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1576:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiCool.g:1577:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiCool.g:1577:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalKiCool.g:1577:6: this_STRING_0= RULE_STRING
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
                    // InternalKiCool.g:1586:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiCool.g:1597:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKiCool.g:1612:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKiCool.g:1613:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKiCool.g:1614:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKiCool.g:1621:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKiCool.g:1624:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKiCool.g:1625:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKiCool.g:1625:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                alt23=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                int LA23_4 = input.LA(2);

                if ( (LA23_4==RULE_FLOAT) ) {
                    alt23=5;
                }
                else if ( (LA23_4==RULE_INT) ) {
                    alt23=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt23=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalKiCool.g:1625:6: this_STRING_0= RULE_STRING
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
                    // InternalKiCool.g:1634:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiCool.g:1645:10: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKiCool.g:1654:5: this_Integer_3= ruleInteger
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
                    // InternalKiCool.g:1666:5: this_Floateger_4= ruleFloateger
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
    // InternalKiCool.g:1684:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiCool.g:1685:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiCool.g:1686:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKiCool.g:1693:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1696:28: ( (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKiCool.g:1697:1: (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKiCool.g:1697:1: (this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKiCool.g:1697:6: this_ID_0= RULE_ID (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiCool.g:1704:1: (kw= '.' | (kw= '-' this_ID_3= RULE_ID ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=2;
                    }


                }
                else if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:1705:2: kw= '.'
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalKiCool.g:1711:6: (kw= '-' this_ID_3= RULE_ID )
            	    {
            	    // InternalKiCool.g:1711:6: (kw= '-' this_ID_3= RULE_ID )
            	    // InternalKiCool.g:1712:2: kw= '-' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 
            	          
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalKiCool.g:1724:4: (kw= '#' this_INT_5= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiCool.g:1725:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_5); if (state.failed) return current;
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
    // InternalKiCool.g:1745:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalKiCool.g:1746:2: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalKiCool.g:1747:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalKiCool.g:1754:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1757:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalKiCool.g:1758:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalKiCool.g:1758:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalKiCool.g:1758:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiCool.g:1765:1: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:1766:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKiCool.g:1786:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiCool.g:1787:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiCool.g:1788:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKiCool.g:1795:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1798:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiCool.g:1799:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiCool.g:1799:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiCool.g:1799:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiCool.g:1799:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKiCool.g:1800:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_5); if (state.failed) return current;
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
    // InternalKiCool.g:1820:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiCool.g:1821:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiCool.g:1822:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKiCool.g:1829:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKiCool.g:1832:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiCool.g:1833:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiCool.g:1833:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiCool.g:1833:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiCool.g:1833:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiCool.g:1834:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_27); if (state.failed) return current;
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

    // $ANTLR start synpred7_InternalKiCool
    public final void synpred7_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_processors_6_0 = null;


        // InternalKiCool.g:360:6: ( (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) )
        // InternalKiCool.g:360:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
        {
        // InternalKiCool.g:360:6: (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' )
        // InternalKiCool.g:360:8: otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']'
        {
        otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalKiCool.g:364:1: ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) )
        // InternalKiCool.g:365:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
        {
        // InternalKiCool.g:365:1: (lv_processors_6_0= ruleProcessorAlternativeGroup )
        // InternalKiCool.g:366:3: lv_processors_6_0= ruleProcessorAlternativeGroup
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_12);
        lv_processors_6_0=ruleProcessorAlternativeGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalKiCool

    // $ANTLR start synpred8_InternalKiCool
    public final void synpred8_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_processors_9_0 = null;


        // InternalKiCool.g:387:6: ( (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )
        // InternalKiCool.g:387:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
        {
        // InternalKiCool.g:387:6: (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' )
        // InternalKiCool.g:387:8: otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']'
        {
        otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return ;
        // InternalKiCool.g:391:1: ( (lv_processors_9_0= ruleProcessorGroup ) )
        // InternalKiCool.g:392:1: (lv_processors_9_0= ruleProcessorGroup )
        {
        // InternalKiCool.g:392:1: (lv_processors_9_0= ruleProcessorGroup )
        // InternalKiCool.g:393:3: lv_processors_9_0= ruleProcessorGroup
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_12);
        lv_processors_9_0=ruleProcessorGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalKiCool

    // $ANTLR start synpred14_InternalKiCool
    public final void synpred14_InternalKiCool_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


        // InternalKiCool.g:586:4: (otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) ) )
        // InternalKiCool.g:586:4: otherlv_0= 'label' ( (lv_label_1_0= ruleEString ) )
        {
        otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalKiCool.g:590:1: ( (lv_label_1_0= ruleEString ) )
        // InternalKiCool.g:591:1: (lv_label_1_0= ruleEString )
        {
        // InternalKiCool.g:591:1: (lv_label_1_0= ruleEString )
        // InternalKiCool.g:592:3: lv_label_1_0= ruleEString
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
    // $ANTLR end synpred14_InternalKiCool

    // Delegated rules

    public final boolean synpred7_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\5\6\uffff\1\0\2\uffff";
    static final String dfa_4s = "\1\33\6\uffff\1\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\5\2\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4";
    static final String dfa_6s = "\7\uffff\1\0\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\12\uffff\1\6\5\uffff\1\7\1\1\1\4\2\uffff\1\1",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 318:4: ( ( (lv_processors_2_0= ruleProcessor ) ) | (otherlv_3= 'system' ( (lv_processors_4_0= ruleProcessorSystem ) ) ) | (otherlv_5= '[' ( (lv_processors_6_0= ruleProcessorAlternativeGroup ) ) otherlv_7= ']' ) | (otherlv_8= '[' ( (lv_processors_9_0= ruleProcessorGroup ) ) otherlv_10= ']' ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKiCool()) ) {s = 8;}

                        else if ( (synpred8_InternalKiCool()) ) {s = 9;}

                         
                        input.seek(index5_7);
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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000015D0020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001410020L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001410022L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004100002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000002100003B0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000001A0L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000340000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000200L});
    }


}