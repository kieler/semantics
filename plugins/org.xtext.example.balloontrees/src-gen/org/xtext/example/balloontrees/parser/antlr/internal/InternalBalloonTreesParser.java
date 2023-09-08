package org.xtext.example.balloontrees.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.balloontrees.services.BalloonTreesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBalloonTreesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BalloonTree'", "'{'", "'}'", "'node'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBalloonTreesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBalloonTreesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBalloonTreesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBalloonTrees.g"; }



     	private BalloonTreesGrammarAccess grammarAccess;

        public InternalBalloonTreesParser(TokenStream input, BalloonTreesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BalloonTree";
       	}

       	@Override
       	protected BalloonTreesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBalloonTree"
    // InternalBalloonTrees.g:64:1: entryRuleBalloonTree returns [EObject current=null] : iv_ruleBalloonTree= ruleBalloonTree EOF ;
    public final EObject entryRuleBalloonTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBalloonTree = null;


        try {
            // InternalBalloonTrees.g:64:52: (iv_ruleBalloonTree= ruleBalloonTree EOF )
            // InternalBalloonTrees.g:65:2: iv_ruleBalloonTree= ruleBalloonTree EOF
            {
             newCompositeNode(grammarAccess.getBalloonTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBalloonTree=ruleBalloonTree();

            state._fsp--;

             current =iv_ruleBalloonTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBalloonTree"


    // $ANTLR start "ruleBalloonTree"
    // InternalBalloonTrees.g:71:1: ruleBalloonTree returns [EObject current=null] : ( () otherlv_1= 'BalloonTree' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleBalloonTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_children_4_0 = null;



        	enterRule();

        try {
            // InternalBalloonTrees.g:77:2: ( ( () otherlv_1= 'BalloonTree' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? ) )
            // InternalBalloonTrees.g:78:2: ( () otherlv_1= 'BalloonTree' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? )
            {
            // InternalBalloonTrees.g:78:2: ( () otherlv_1= 'BalloonTree' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? )
            // InternalBalloonTrees.g:79:3: () otherlv_1= 'BalloonTree' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )?
            {
            // InternalBalloonTrees.g:79:3: ()
            // InternalBalloonTrees.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBalloonTreeAccess().getBalloonTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBalloonTreeAccess().getBalloonTreeKeyword_1());
            		
            // InternalBalloonTrees.g:90:3: ( (lv_identifier_2_0= RULE_ID ) )
            // InternalBalloonTrees.g:91:4: (lv_identifier_2_0= RULE_ID )
            {
            // InternalBalloonTrees.g:91:4: (lv_identifier_2_0= RULE_ID )
            // InternalBalloonTrees.g:92:5: lv_identifier_2_0= RULE_ID
            {
            lv_identifier_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_identifier_2_0, grammarAccess.getBalloonTreeAccess().getIdentifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBalloonTreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBalloonTrees.g:108:3: (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBalloonTrees.g:109:4: otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBalloonTreeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalBalloonTrees.g:113:4: ( (lv_children_4_0= ruleBalloonTreeNode ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBalloonTrees.g:114:5: (lv_children_4_0= ruleBalloonTreeNode )
                    	    {
                    	    // InternalBalloonTrees.g:114:5: (lv_children_4_0= ruleBalloonTreeNode )
                    	    // InternalBalloonTrees.g:115:6: lv_children_4_0= ruleBalloonTreeNode
                    	    {

                    	    						newCompositeNode(grammarAccess.getBalloonTreeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_children_4_0=ruleBalloonTreeNode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBalloonTreeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_4_0,
                    	    							"org.xtext.example.balloontrees.BalloonTrees.BalloonTreeNode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBalloonTreeAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBalloonTree"


    // $ANTLR start "entryRuleBalloonTreeNode"
    // InternalBalloonTrees.g:141:1: entryRuleBalloonTreeNode returns [EObject current=null] : iv_ruleBalloonTreeNode= ruleBalloonTreeNode EOF ;
    public final EObject entryRuleBalloonTreeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBalloonTreeNode = null;


        try {
            // InternalBalloonTrees.g:141:56: (iv_ruleBalloonTreeNode= ruleBalloonTreeNode EOF )
            // InternalBalloonTrees.g:142:2: iv_ruleBalloonTreeNode= ruleBalloonTreeNode EOF
            {
             newCompositeNode(grammarAccess.getBalloonTreeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBalloonTreeNode=ruleBalloonTreeNode();

            state._fsp--;

             current =iv_ruleBalloonTreeNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBalloonTreeNode"


    // $ANTLR start "ruleBalloonTreeNode"
    // InternalBalloonTrees.g:148:1: ruleBalloonTreeNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleBalloonTreeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_children_4_0 = null;



        	enterRule();

        try {
            // InternalBalloonTrees.g:154:2: ( ( () otherlv_1= 'node' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? ) )
            // InternalBalloonTrees.g:155:2: ( () otherlv_1= 'node' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? )
            {
            // InternalBalloonTrees.g:155:2: ( () otherlv_1= 'node' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )? )
            // InternalBalloonTrees.g:156:3: () otherlv_1= 'node' ( (lv_identifier_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )?
            {
            // InternalBalloonTrees.g:156:3: ()
            // InternalBalloonTrees.g:157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBalloonTreeNodeAccess().getBalloonTreeNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBalloonTreeNodeAccess().getNodeKeyword_1());
            		
            // InternalBalloonTrees.g:167:3: ( (lv_identifier_2_0= RULE_ID ) )
            // InternalBalloonTrees.g:168:4: (lv_identifier_2_0= RULE_ID )
            {
            // InternalBalloonTrees.g:168:4: (lv_identifier_2_0= RULE_ID )
            // InternalBalloonTrees.g:169:5: lv_identifier_2_0= RULE_ID
            {
            lv_identifier_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_identifier_2_0, grammarAccess.getBalloonTreeNodeAccess().getIdentifierIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBalloonTreeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifier",
            						lv_identifier_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBalloonTrees.g:185:3: (otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBalloonTrees.g:186:4: otherlv_3= '{' ( (lv_children_4_0= ruleBalloonTreeNode ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBalloonTreeNodeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalBalloonTrees.g:190:4: ( (lv_children_4_0= ruleBalloonTreeNode ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBalloonTrees.g:191:5: (lv_children_4_0= ruleBalloonTreeNode )
                    	    {
                    	    // InternalBalloonTrees.g:191:5: (lv_children_4_0= ruleBalloonTreeNode )
                    	    // InternalBalloonTrees.g:192:6: lv_children_4_0= ruleBalloonTreeNode
                    	    {

                    	    						newCompositeNode(grammarAccess.getBalloonTreeNodeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_children_4_0=ruleBalloonTreeNode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBalloonTreeNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_4_0,
                    	    							"org.xtext.example.balloontrees.BalloonTrees.BalloonTreeNode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBalloonTreeNodeAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBalloonTreeNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});

}