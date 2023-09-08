package org.xtext.example.balloontrees.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.balloontrees.services.BalloonTreesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBalloonTreesParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BalloonTreesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBalloonTree"
    // InternalBalloonTrees.g:53:1: entryRuleBalloonTree : ruleBalloonTree EOF ;
    public final void entryRuleBalloonTree() throws RecognitionException {
        try {
            // InternalBalloonTrees.g:54:1: ( ruleBalloonTree EOF )
            // InternalBalloonTrees.g:55:1: ruleBalloonTree EOF
            {
             before(grammarAccess.getBalloonTreeRule()); 
            pushFollow(FOLLOW_1);
            ruleBalloonTree();

            state._fsp--;

             after(grammarAccess.getBalloonTreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBalloonTree"


    // $ANTLR start "ruleBalloonTree"
    // InternalBalloonTrees.g:62:1: ruleBalloonTree : ( ( rule__BalloonTree__Group__0 ) ) ;
    public final void ruleBalloonTree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:66:2: ( ( ( rule__BalloonTree__Group__0 ) ) )
            // InternalBalloonTrees.g:67:2: ( ( rule__BalloonTree__Group__0 ) )
            {
            // InternalBalloonTrees.g:67:2: ( ( rule__BalloonTree__Group__0 ) )
            // InternalBalloonTrees.g:68:3: ( rule__BalloonTree__Group__0 )
            {
             before(grammarAccess.getBalloonTreeAccess().getGroup()); 
            // InternalBalloonTrees.g:69:3: ( rule__BalloonTree__Group__0 )
            // InternalBalloonTrees.g:69:4: rule__BalloonTree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBalloonTreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalloonTree"


    // $ANTLR start "entryRuleBalloonTreeNode"
    // InternalBalloonTrees.g:78:1: entryRuleBalloonTreeNode : ruleBalloonTreeNode EOF ;
    public final void entryRuleBalloonTreeNode() throws RecognitionException {
        try {
            // InternalBalloonTrees.g:79:1: ( ruleBalloonTreeNode EOF )
            // InternalBalloonTrees.g:80:1: ruleBalloonTreeNode EOF
            {
             before(grammarAccess.getBalloonTreeNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleBalloonTreeNode();

            state._fsp--;

             after(grammarAccess.getBalloonTreeNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBalloonTreeNode"


    // $ANTLR start "ruleBalloonTreeNode"
    // InternalBalloonTrees.g:87:1: ruleBalloonTreeNode : ( ( rule__BalloonTreeNode__Group__0 ) ) ;
    public final void ruleBalloonTreeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:91:2: ( ( ( rule__BalloonTreeNode__Group__0 ) ) )
            // InternalBalloonTrees.g:92:2: ( ( rule__BalloonTreeNode__Group__0 ) )
            {
            // InternalBalloonTrees.g:92:2: ( ( rule__BalloonTreeNode__Group__0 ) )
            // InternalBalloonTrees.g:93:3: ( rule__BalloonTreeNode__Group__0 )
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getGroup()); 
            // InternalBalloonTrees.g:94:3: ( rule__BalloonTreeNode__Group__0 )
            // InternalBalloonTrees.g:94:4: rule__BalloonTreeNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBalloonTreeNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalloonTreeNode"


    // $ANTLR start "rule__BalloonTree__Group__0"
    // InternalBalloonTrees.g:102:1: rule__BalloonTree__Group__0 : rule__BalloonTree__Group__0__Impl rule__BalloonTree__Group__1 ;
    public final void rule__BalloonTree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:106:1: ( rule__BalloonTree__Group__0__Impl rule__BalloonTree__Group__1 )
            // InternalBalloonTrees.g:107:2: rule__BalloonTree__Group__0__Impl rule__BalloonTree__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BalloonTree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__0"


    // $ANTLR start "rule__BalloonTree__Group__0__Impl"
    // InternalBalloonTrees.g:114:1: rule__BalloonTree__Group__0__Impl : ( () ) ;
    public final void rule__BalloonTree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:118:1: ( ( () ) )
            // InternalBalloonTrees.g:119:1: ( () )
            {
            // InternalBalloonTrees.g:119:1: ( () )
            // InternalBalloonTrees.g:120:2: ()
            {
             before(grammarAccess.getBalloonTreeAccess().getBalloonTreeAction_0()); 
            // InternalBalloonTrees.g:121:2: ()
            // InternalBalloonTrees.g:121:3: 
            {
            }

             after(grammarAccess.getBalloonTreeAccess().getBalloonTreeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__0__Impl"


    // $ANTLR start "rule__BalloonTree__Group__1"
    // InternalBalloonTrees.g:129:1: rule__BalloonTree__Group__1 : rule__BalloonTree__Group__1__Impl rule__BalloonTree__Group__2 ;
    public final void rule__BalloonTree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:133:1: ( rule__BalloonTree__Group__1__Impl rule__BalloonTree__Group__2 )
            // InternalBalloonTrees.g:134:2: rule__BalloonTree__Group__1__Impl rule__BalloonTree__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BalloonTree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__1"


    // $ANTLR start "rule__BalloonTree__Group__1__Impl"
    // InternalBalloonTrees.g:141:1: rule__BalloonTree__Group__1__Impl : ( 'BalloonTree' ) ;
    public final void rule__BalloonTree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:145:1: ( ( 'BalloonTree' ) )
            // InternalBalloonTrees.g:146:1: ( 'BalloonTree' )
            {
            // InternalBalloonTrees.g:146:1: ( 'BalloonTree' )
            // InternalBalloonTrees.g:147:2: 'BalloonTree'
            {
             before(grammarAccess.getBalloonTreeAccess().getBalloonTreeKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeAccess().getBalloonTreeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__1__Impl"


    // $ANTLR start "rule__BalloonTree__Group__2"
    // InternalBalloonTrees.g:156:1: rule__BalloonTree__Group__2 : rule__BalloonTree__Group__2__Impl rule__BalloonTree__Group__3 ;
    public final void rule__BalloonTree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:160:1: ( rule__BalloonTree__Group__2__Impl rule__BalloonTree__Group__3 )
            // InternalBalloonTrees.g:161:2: rule__BalloonTree__Group__2__Impl rule__BalloonTree__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BalloonTree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__2"


    // $ANTLR start "rule__BalloonTree__Group__2__Impl"
    // InternalBalloonTrees.g:168:1: rule__BalloonTree__Group__2__Impl : ( ( rule__BalloonTree__IdentifierAssignment_2 ) ) ;
    public final void rule__BalloonTree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:172:1: ( ( ( rule__BalloonTree__IdentifierAssignment_2 ) ) )
            // InternalBalloonTrees.g:173:1: ( ( rule__BalloonTree__IdentifierAssignment_2 ) )
            {
            // InternalBalloonTrees.g:173:1: ( ( rule__BalloonTree__IdentifierAssignment_2 ) )
            // InternalBalloonTrees.g:174:2: ( rule__BalloonTree__IdentifierAssignment_2 )
            {
             before(grammarAccess.getBalloonTreeAccess().getIdentifierAssignment_2()); 
            // InternalBalloonTrees.g:175:2: ( rule__BalloonTree__IdentifierAssignment_2 )
            // InternalBalloonTrees.g:175:3: rule__BalloonTree__IdentifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTree__IdentifierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBalloonTreeAccess().getIdentifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__2__Impl"


    // $ANTLR start "rule__BalloonTree__Group__3"
    // InternalBalloonTrees.g:183:1: rule__BalloonTree__Group__3 : rule__BalloonTree__Group__3__Impl ;
    public final void rule__BalloonTree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:187:1: ( rule__BalloonTree__Group__3__Impl )
            // InternalBalloonTrees.g:188:2: rule__BalloonTree__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__3"


    // $ANTLR start "rule__BalloonTree__Group__3__Impl"
    // InternalBalloonTrees.g:194:1: rule__BalloonTree__Group__3__Impl : ( ( rule__BalloonTree__Group_3__0 )? ) ;
    public final void rule__BalloonTree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:198:1: ( ( ( rule__BalloonTree__Group_3__0 )? ) )
            // InternalBalloonTrees.g:199:1: ( ( rule__BalloonTree__Group_3__0 )? )
            {
            // InternalBalloonTrees.g:199:1: ( ( rule__BalloonTree__Group_3__0 )? )
            // InternalBalloonTrees.g:200:2: ( rule__BalloonTree__Group_3__0 )?
            {
             before(grammarAccess.getBalloonTreeAccess().getGroup_3()); 
            // InternalBalloonTrees.g:201:2: ( rule__BalloonTree__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBalloonTrees.g:201:3: rule__BalloonTree__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BalloonTree__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBalloonTreeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group__3__Impl"


    // $ANTLR start "rule__BalloonTree__Group_3__0"
    // InternalBalloonTrees.g:210:1: rule__BalloonTree__Group_3__0 : rule__BalloonTree__Group_3__0__Impl rule__BalloonTree__Group_3__1 ;
    public final void rule__BalloonTree__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:214:1: ( rule__BalloonTree__Group_3__0__Impl rule__BalloonTree__Group_3__1 )
            // InternalBalloonTrees.g:215:2: rule__BalloonTree__Group_3__0__Impl rule__BalloonTree__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BalloonTree__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__0"


    // $ANTLR start "rule__BalloonTree__Group_3__0__Impl"
    // InternalBalloonTrees.g:222:1: rule__BalloonTree__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BalloonTree__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:226:1: ( ( '{' ) )
            // InternalBalloonTrees.g:227:1: ( '{' )
            {
            // InternalBalloonTrees.g:227:1: ( '{' )
            // InternalBalloonTrees.g:228:2: '{'
            {
             before(grammarAccess.getBalloonTreeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__0__Impl"


    // $ANTLR start "rule__BalloonTree__Group_3__1"
    // InternalBalloonTrees.g:237:1: rule__BalloonTree__Group_3__1 : rule__BalloonTree__Group_3__1__Impl rule__BalloonTree__Group_3__2 ;
    public final void rule__BalloonTree__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:241:1: ( rule__BalloonTree__Group_3__1__Impl rule__BalloonTree__Group_3__2 )
            // InternalBalloonTrees.g:242:2: rule__BalloonTree__Group_3__1__Impl rule__BalloonTree__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__BalloonTree__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__1"


    // $ANTLR start "rule__BalloonTree__Group_3__1__Impl"
    // InternalBalloonTrees.g:249:1: rule__BalloonTree__Group_3__1__Impl : ( ( rule__BalloonTree__ChildrenAssignment_3_1 )* ) ;
    public final void rule__BalloonTree__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:253:1: ( ( ( rule__BalloonTree__ChildrenAssignment_3_1 )* ) )
            // InternalBalloonTrees.g:254:1: ( ( rule__BalloonTree__ChildrenAssignment_3_1 )* )
            {
            // InternalBalloonTrees.g:254:1: ( ( rule__BalloonTree__ChildrenAssignment_3_1 )* )
            // InternalBalloonTrees.g:255:2: ( rule__BalloonTree__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getBalloonTreeAccess().getChildrenAssignment_3_1()); 
            // InternalBalloonTrees.g:256:2: ( rule__BalloonTree__ChildrenAssignment_3_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBalloonTrees.g:256:3: rule__BalloonTree__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BalloonTree__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBalloonTreeAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__1__Impl"


    // $ANTLR start "rule__BalloonTree__Group_3__2"
    // InternalBalloonTrees.g:264:1: rule__BalloonTree__Group_3__2 : rule__BalloonTree__Group_3__2__Impl ;
    public final void rule__BalloonTree__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:268:1: ( rule__BalloonTree__Group_3__2__Impl )
            // InternalBalloonTrees.g:269:2: rule__BalloonTree__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTree__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__2"


    // $ANTLR start "rule__BalloonTree__Group_3__2__Impl"
    // InternalBalloonTrees.g:275:1: rule__BalloonTree__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BalloonTree__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:279:1: ( ( '}' ) )
            // InternalBalloonTrees.g:280:1: ( '}' )
            {
            // InternalBalloonTrees.g:280:1: ( '}' )
            // InternalBalloonTrees.g:281:2: '}'
            {
             before(grammarAccess.getBalloonTreeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__Group_3__2__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group__0"
    // InternalBalloonTrees.g:291:1: rule__BalloonTreeNode__Group__0 : rule__BalloonTreeNode__Group__0__Impl rule__BalloonTreeNode__Group__1 ;
    public final void rule__BalloonTreeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:295:1: ( rule__BalloonTreeNode__Group__0__Impl rule__BalloonTreeNode__Group__1 )
            // InternalBalloonTrees.g:296:2: rule__BalloonTreeNode__Group__0__Impl rule__BalloonTreeNode__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BalloonTreeNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__0"


    // $ANTLR start "rule__BalloonTreeNode__Group__0__Impl"
    // InternalBalloonTrees.g:303:1: rule__BalloonTreeNode__Group__0__Impl : ( () ) ;
    public final void rule__BalloonTreeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:307:1: ( ( () ) )
            // InternalBalloonTrees.g:308:1: ( () )
            {
            // InternalBalloonTrees.g:308:1: ( () )
            // InternalBalloonTrees.g:309:2: ()
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getBalloonTreeNodeAction_0()); 
            // InternalBalloonTrees.g:310:2: ()
            // InternalBalloonTrees.g:310:3: 
            {
            }

             after(grammarAccess.getBalloonTreeNodeAccess().getBalloonTreeNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__0__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group__1"
    // InternalBalloonTrees.g:318:1: rule__BalloonTreeNode__Group__1 : rule__BalloonTreeNode__Group__1__Impl rule__BalloonTreeNode__Group__2 ;
    public final void rule__BalloonTreeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:322:1: ( rule__BalloonTreeNode__Group__1__Impl rule__BalloonTreeNode__Group__2 )
            // InternalBalloonTrees.g:323:2: rule__BalloonTreeNode__Group__1__Impl rule__BalloonTreeNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BalloonTreeNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__1"


    // $ANTLR start "rule__BalloonTreeNode__Group__1__Impl"
    // InternalBalloonTrees.g:330:1: rule__BalloonTreeNode__Group__1__Impl : ( 'node' ) ;
    public final void rule__BalloonTreeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:334:1: ( ( 'node' ) )
            // InternalBalloonTrees.g:335:1: ( 'node' )
            {
            // InternalBalloonTrees.g:335:1: ( 'node' )
            // InternalBalloonTrees.g:336:2: 'node'
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getNodeKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeNodeAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__1__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group__2"
    // InternalBalloonTrees.g:345:1: rule__BalloonTreeNode__Group__2 : rule__BalloonTreeNode__Group__2__Impl rule__BalloonTreeNode__Group__3 ;
    public final void rule__BalloonTreeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:349:1: ( rule__BalloonTreeNode__Group__2__Impl rule__BalloonTreeNode__Group__3 )
            // InternalBalloonTrees.g:350:2: rule__BalloonTreeNode__Group__2__Impl rule__BalloonTreeNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BalloonTreeNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__2"


    // $ANTLR start "rule__BalloonTreeNode__Group__2__Impl"
    // InternalBalloonTrees.g:357:1: rule__BalloonTreeNode__Group__2__Impl : ( ( rule__BalloonTreeNode__IdentifierAssignment_2 ) ) ;
    public final void rule__BalloonTreeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:361:1: ( ( ( rule__BalloonTreeNode__IdentifierAssignment_2 ) ) )
            // InternalBalloonTrees.g:362:1: ( ( rule__BalloonTreeNode__IdentifierAssignment_2 ) )
            {
            // InternalBalloonTrees.g:362:1: ( ( rule__BalloonTreeNode__IdentifierAssignment_2 ) )
            // InternalBalloonTrees.g:363:2: ( rule__BalloonTreeNode__IdentifierAssignment_2 )
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getIdentifierAssignment_2()); 
            // InternalBalloonTrees.g:364:2: ( rule__BalloonTreeNode__IdentifierAssignment_2 )
            // InternalBalloonTrees.g:364:3: rule__BalloonTreeNode__IdentifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__IdentifierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBalloonTreeNodeAccess().getIdentifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__2__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group__3"
    // InternalBalloonTrees.g:372:1: rule__BalloonTreeNode__Group__3 : rule__BalloonTreeNode__Group__3__Impl ;
    public final void rule__BalloonTreeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:376:1: ( rule__BalloonTreeNode__Group__3__Impl )
            // InternalBalloonTrees.g:377:2: rule__BalloonTreeNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__3"


    // $ANTLR start "rule__BalloonTreeNode__Group__3__Impl"
    // InternalBalloonTrees.g:383:1: rule__BalloonTreeNode__Group__3__Impl : ( ( rule__BalloonTreeNode__Group_3__0 )? ) ;
    public final void rule__BalloonTreeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:387:1: ( ( ( rule__BalloonTreeNode__Group_3__0 )? ) )
            // InternalBalloonTrees.g:388:1: ( ( rule__BalloonTreeNode__Group_3__0 )? )
            {
            // InternalBalloonTrees.g:388:1: ( ( rule__BalloonTreeNode__Group_3__0 )? )
            // InternalBalloonTrees.g:389:2: ( rule__BalloonTreeNode__Group_3__0 )?
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getGroup_3()); 
            // InternalBalloonTrees.g:390:2: ( rule__BalloonTreeNode__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBalloonTrees.g:390:3: rule__BalloonTreeNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BalloonTreeNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBalloonTreeNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group__3__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__0"
    // InternalBalloonTrees.g:399:1: rule__BalloonTreeNode__Group_3__0 : rule__BalloonTreeNode__Group_3__0__Impl rule__BalloonTreeNode__Group_3__1 ;
    public final void rule__BalloonTreeNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:403:1: ( rule__BalloonTreeNode__Group_3__0__Impl rule__BalloonTreeNode__Group_3__1 )
            // InternalBalloonTrees.g:404:2: rule__BalloonTreeNode__Group_3__0__Impl rule__BalloonTreeNode__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BalloonTreeNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__0"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__0__Impl"
    // InternalBalloonTrees.g:411:1: rule__BalloonTreeNode__Group_3__0__Impl : ( '{' ) ;
    public final void rule__BalloonTreeNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:415:1: ( ( '{' ) )
            // InternalBalloonTrees.g:416:1: ( '{' )
            {
            // InternalBalloonTrees.g:416:1: ( '{' )
            // InternalBalloonTrees.g:417:2: '{'
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__0__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__1"
    // InternalBalloonTrees.g:426:1: rule__BalloonTreeNode__Group_3__1 : rule__BalloonTreeNode__Group_3__1__Impl rule__BalloonTreeNode__Group_3__2 ;
    public final void rule__BalloonTreeNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:430:1: ( rule__BalloonTreeNode__Group_3__1__Impl rule__BalloonTreeNode__Group_3__2 )
            // InternalBalloonTrees.g:431:2: rule__BalloonTreeNode__Group_3__1__Impl rule__BalloonTreeNode__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__BalloonTreeNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__1"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__1__Impl"
    // InternalBalloonTrees.g:438:1: rule__BalloonTreeNode__Group_3__1__Impl : ( ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )* ) ;
    public final void rule__BalloonTreeNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:442:1: ( ( ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )* ) )
            // InternalBalloonTrees.g:443:1: ( ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )* )
            {
            // InternalBalloonTrees.g:443:1: ( ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )* )
            // InternalBalloonTrees.g:444:2: ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getChildrenAssignment_3_1()); 
            // InternalBalloonTrees.g:445:2: ( rule__BalloonTreeNode__ChildrenAssignment_3_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBalloonTrees.g:445:3: rule__BalloonTreeNode__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__BalloonTreeNode__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBalloonTreeNodeAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__1__Impl"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__2"
    // InternalBalloonTrees.g:453:1: rule__BalloonTreeNode__Group_3__2 : rule__BalloonTreeNode__Group_3__2__Impl ;
    public final void rule__BalloonTreeNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:457:1: ( rule__BalloonTreeNode__Group_3__2__Impl )
            // InternalBalloonTrees.g:458:2: rule__BalloonTreeNode__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BalloonTreeNode__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__2"


    // $ANTLR start "rule__BalloonTreeNode__Group_3__2__Impl"
    // InternalBalloonTrees.g:464:1: rule__BalloonTreeNode__Group_3__2__Impl : ( '}' ) ;
    public final void rule__BalloonTreeNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:468:1: ( ( '}' ) )
            // InternalBalloonTrees.g:469:1: ( '}' )
            {
            // InternalBalloonTrees.g:469:1: ( '}' )
            // InternalBalloonTrees.g:470:2: '}'
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeNodeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__Group_3__2__Impl"


    // $ANTLR start "rule__BalloonTree__IdentifierAssignment_2"
    // InternalBalloonTrees.g:480:1: rule__BalloonTree__IdentifierAssignment_2 : ( RULE_ID ) ;
    public final void rule__BalloonTree__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:484:1: ( ( RULE_ID ) )
            // InternalBalloonTrees.g:485:2: ( RULE_ID )
            {
            // InternalBalloonTrees.g:485:2: ( RULE_ID )
            // InternalBalloonTrees.g:486:3: RULE_ID
            {
             before(grammarAccess.getBalloonTreeAccess().getIdentifierIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeAccess().getIdentifierIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__IdentifierAssignment_2"


    // $ANTLR start "rule__BalloonTree__ChildrenAssignment_3_1"
    // InternalBalloonTrees.g:495:1: rule__BalloonTree__ChildrenAssignment_3_1 : ( ruleBalloonTreeNode ) ;
    public final void rule__BalloonTree__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:499:1: ( ( ruleBalloonTreeNode ) )
            // InternalBalloonTrees.g:500:2: ( ruleBalloonTreeNode )
            {
            // InternalBalloonTrees.g:500:2: ( ruleBalloonTreeNode )
            // InternalBalloonTrees.g:501:3: ruleBalloonTreeNode
            {
             before(grammarAccess.getBalloonTreeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBalloonTreeNode();

            state._fsp--;

             after(grammarAccess.getBalloonTreeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTree__ChildrenAssignment_3_1"


    // $ANTLR start "rule__BalloonTreeNode__IdentifierAssignment_2"
    // InternalBalloonTrees.g:510:1: rule__BalloonTreeNode__IdentifierAssignment_2 : ( RULE_ID ) ;
    public final void rule__BalloonTreeNode__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:514:1: ( ( RULE_ID ) )
            // InternalBalloonTrees.g:515:2: ( RULE_ID )
            {
            // InternalBalloonTrees.g:515:2: ( RULE_ID )
            // InternalBalloonTrees.g:516:3: RULE_ID
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getIdentifierIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBalloonTreeNodeAccess().getIdentifierIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__IdentifierAssignment_2"


    // $ANTLR start "rule__BalloonTreeNode__ChildrenAssignment_3_1"
    // InternalBalloonTrees.g:525:1: rule__BalloonTreeNode__ChildrenAssignment_3_1 : ( ruleBalloonTreeNode ) ;
    public final void rule__BalloonTreeNode__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBalloonTrees.g:529:1: ( ( ruleBalloonTreeNode ) )
            // InternalBalloonTrees.g:530:2: ( ruleBalloonTreeNode )
            {
            // InternalBalloonTrees.g:530:2: ( ruleBalloonTreeNode )
            // InternalBalloonTrees.g:531:3: ruleBalloonTreeNode
            {
             before(grammarAccess.getBalloonTreeNodeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBalloonTreeNode();

            state._fsp--;

             after(grammarAccess.getBalloonTreeNodeAccess().getChildrenBalloonTreeNodeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BalloonTreeNode__ChildrenAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});

}