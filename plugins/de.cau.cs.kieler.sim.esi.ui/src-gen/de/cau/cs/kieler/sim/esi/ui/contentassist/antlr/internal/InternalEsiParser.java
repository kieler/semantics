package de.cau.cs.kieler.sim.esi.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.sim.esi.services.EsiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_LETTER", "RULE_DIGIT", "RULE_WS", "RULE_COMMENT", "'!'", "'reset'", "';'", "'%'", "'Output'", "':'", "')'", "'('"
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g"; }


     
     	private EsiGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EsiGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuletracelist
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:60:1: entryRuletracelist : ruletracelist EOF ;
    public final void entryRuletracelist() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:61:1: ( ruletracelist EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:62:1: ruletracelist EOF
            {
             before(grammarAccess.getTracelistRule()); 
            pushFollow(FOLLOW_ruletracelist_in_entryRuletracelist61);
            ruletracelist();
            _fsp--;

             after(grammarAccess.getTracelistRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletracelist68); 

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
    // $ANTLR end entryRuletracelist


    // $ANTLR start ruletracelist
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:69:1: ruletracelist : ( ( rule__Tracelist__Group__0 ) ) ;
    public final void ruletracelist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:73:2: ( ( ( rule__Tracelist__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:74:1: ( ( rule__Tracelist__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:74:1: ( ( rule__Tracelist__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:75:1: ( rule__Tracelist__Group__0 )
            {
             before(grammarAccess.getTracelistAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:76:1: ( rule__Tracelist__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:76:2: rule__Tracelist__Group__0
            {
            pushFollow(FOLLOW_rule__Tracelist__Group__0_in_ruletracelist94);
            rule__Tracelist__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTracelistAccess().getGroup()); 

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
    // $ANTLR end ruletracelist


    // $ANTLR start entryRuletrace
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:88:1: entryRuletrace : ruletrace EOF ;
    public final void entryRuletrace() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:89:1: ( ruletrace EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:90:1: ruletrace EOF
            {
             before(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruletrace_in_entryRuletrace121);
            ruletrace();
            _fsp--;

             after(grammarAccess.getTraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletrace128); 

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
    // $ANTLR end entryRuletrace


    // $ANTLR start ruletrace
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:97:1: ruletrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruletrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:101:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:102:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:102:1: ( ( rule__Trace__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:103:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:104:1: ( rule__Trace__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:104:2: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_rule__Trace__Group__0_in_ruletrace154);
            rule__Trace__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getGroup()); 

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
    // $ANTLR end ruletrace


    // $ANTLR start entryRuletick
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:116:1: entryRuletick : ruletick EOF ;
    public final void entryRuletick() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:117:1: ( ruletick EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:118:1: ruletick EOF
            {
             before(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruletick_in_entryRuletick181);
            ruletick();
            _fsp--;

             after(grammarAccess.getTickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletick188); 

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
    // $ANTLR end entryRuletick


    // $ANTLR start ruletick
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:125:1: ruletick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruletick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:129:2: ( ( ( rule__Tick__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:130:1: ( ( rule__Tick__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:130:1: ( ( rule__Tick__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:131:1: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:132:1: ( rule__Tick__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:132:2: rule__Tick__Group__0
            {
            pushFollow(FOLLOW_rule__Tick__Group__0_in_ruletick214);
            rule__Tick__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getGroup()); 

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
    // $ANTLR end ruletick


    // $ANTLR start entryRulesignal
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:144:1: entryRulesignal : rulesignal EOF ;
    public final void entryRulesignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:145:1: ( rulesignal EOF )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:146:1: rulesignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_rulesignal_in_entryRulesignal241);
            rulesignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignal248); 

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
    // $ANTLR end entryRulesignal


    // $ANTLR start rulesignal
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:153:1: rulesignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void rulesignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:157:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:158:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:158:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:159:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:160:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:160:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_rulesignal274);
            rule__Signal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

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
    // $ANTLR end rulesignal


    // $ANTLR start rule__Tracelist__Group__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:174:1: rule__Tracelist__Group__0 : ( ( rule__Tracelist__TracesAssignment_0 )? ) rule__Tracelist__Group__1 ;
    public final void rule__Tracelist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:178:1: ( ( ( rule__Tracelist__TracesAssignment_0 )? ) rule__Tracelist__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:179:1: ( ( rule__Tracelist__TracesAssignment_0 )? ) rule__Tracelist__Group__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:179:1: ( ( rule__Tracelist__TracesAssignment_0 )? )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:180:1: ( rule__Tracelist__TracesAssignment_0 )?
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:181:1: ( rule__Tracelist__TracesAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:181:2: rule__Tracelist__TracesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Tracelist__TracesAssignment_0_in_rule__Tracelist__Group__0312);
                    rule__Tracelist__TracesAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTracelistAccess().getTracesAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Tracelist__Group__1_in_rule__Tracelist__Group__0322);
            rule__Tracelist__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Tracelist__Group__0


    // $ANTLR start rule__Tracelist__Group__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:192:1: rule__Tracelist__Group__1 : ( ( ( rule__Tracelist__Group_1__0 ) ) ( ( rule__Tracelist__Group_1__0 )* ) ) ;
    public final void rule__Tracelist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:196:1: ( ( ( ( rule__Tracelist__Group_1__0 ) ) ( ( rule__Tracelist__Group_1__0 )* ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:197:1: ( ( ( rule__Tracelist__Group_1__0 ) ) ( ( rule__Tracelist__Group_1__0 )* ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:197:1: ( ( ( rule__Tracelist__Group_1__0 ) ) ( ( rule__Tracelist__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:198:1: ( ( rule__Tracelist__Group_1__0 ) ) ( ( rule__Tracelist__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:198:1: ( ( rule__Tracelist__Group_1__0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:199:1: ( rule__Tracelist__Group_1__0 )
            {
             before(grammarAccess.getTracelistAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:200:1: ( rule__Tracelist__Group_1__0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:200:2: rule__Tracelist__Group_1__0
            {
            pushFollow(FOLLOW_rule__Tracelist__Group_1__0_in_rule__Tracelist__Group__1352);
            rule__Tracelist__Group_1__0();
            _fsp--;


            }

             after(grammarAccess.getTracelistAccess().getGroup_1()); 

            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:203:1: ( ( rule__Tracelist__Group_1__0 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:204:1: ( rule__Tracelist__Group_1__0 )*
            {
             before(grammarAccess.getTracelistAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:205:1: ( rule__Tracelist__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:205:2: rule__Tracelist__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Tracelist__Group_1__0_in_rule__Tracelist__Group__1364);
            	    rule__Tracelist__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTracelistAccess().getGroup_1()); 

            }


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
    // $ANTLR end rule__Tracelist__Group__1


    // $ANTLR start rule__Tracelist__Group_1__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:220:1: rule__Tracelist__Group_1__0 : ( '!' ) rule__Tracelist__Group_1__1 ;
    public final void rule__Tracelist__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:224:1: ( ( '!' ) rule__Tracelist__Group_1__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:225:1: ( '!' ) rule__Tracelist__Group_1__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:225:1: ( '!' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:226:1: '!'
            {
             before(grammarAccess.getTracelistAccess().getExclamationMarkKeyword_1_0()); 
            match(input,10,FOLLOW_10_in_rule__Tracelist__Group_1__0406); 
             after(grammarAccess.getTracelistAccess().getExclamationMarkKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Tracelist__Group_1__1_in_rule__Tracelist__Group_1__0416);
            rule__Tracelist__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Tracelist__Group_1__0


    // $ANTLR start rule__Tracelist__Group_1__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:240:1: rule__Tracelist__Group_1__1 : ( 'reset' ) rule__Tracelist__Group_1__2 ;
    public final void rule__Tracelist__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:244:1: ( ( 'reset' ) rule__Tracelist__Group_1__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:245:1: ( 'reset' ) rule__Tracelist__Group_1__2
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:245:1: ( 'reset' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:246:1: 'reset'
            {
             before(grammarAccess.getTracelistAccess().getResetKeyword_1_1()); 
            match(input,11,FOLLOW_11_in_rule__Tracelist__Group_1__1445); 
             after(grammarAccess.getTracelistAccess().getResetKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__Tracelist__Group_1__2_in_rule__Tracelist__Group_1__1455);
            rule__Tracelist__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Tracelist__Group_1__1


    // $ANTLR start rule__Tracelist__Group_1__2
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:260:1: rule__Tracelist__Group_1__2 : ( ';' ) rule__Tracelist__Group_1__3 ;
    public final void rule__Tracelist__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:264:1: ( ( ';' ) rule__Tracelist__Group_1__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:265:1: ( ';' ) rule__Tracelist__Group_1__3
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:265:1: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:266:1: ';'
            {
             before(grammarAccess.getTracelistAccess().getSemicolonKeyword_1_2()); 
            match(input,12,FOLLOW_12_in_rule__Tracelist__Group_1__2484); 
             after(grammarAccess.getTracelistAccess().getSemicolonKeyword_1_2()); 

            }

            pushFollow(FOLLOW_rule__Tracelist__Group_1__3_in_rule__Tracelist__Group_1__2494);
            rule__Tracelist__Group_1__3();
            _fsp--;


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
    // $ANTLR end rule__Tracelist__Group_1__2


    // $ANTLR start rule__Tracelist__Group_1__3
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:280:1: rule__Tracelist__Group_1__3 : ( ( rule__Tracelist__TracesAssignment_1_3 ) ) ;
    public final void rule__Tracelist__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:284:1: ( ( ( rule__Tracelist__TracesAssignment_1_3 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:285:1: ( ( rule__Tracelist__TracesAssignment_1_3 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:285:1: ( ( rule__Tracelist__TracesAssignment_1_3 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:286:1: ( rule__Tracelist__TracesAssignment_1_3 )
            {
             before(grammarAccess.getTracelistAccess().getTracesAssignment_1_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:287:1: ( rule__Tracelist__TracesAssignment_1_3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:287:2: rule__Tracelist__TracesAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Tracelist__TracesAssignment_1_3_in_rule__Tracelist__Group_1__3522);
            rule__Tracelist__TracesAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getTracelistAccess().getTracesAssignment_1_3()); 

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
    // $ANTLR end rule__Tracelist__Group_1__3


    // $ANTLR start rule__Trace__Group__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:305:1: rule__Trace__Group__0 : ( () ) rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:309:1: ( ( () ) rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:310:1: ( () ) rule__Trace__Group__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:310:1: ( () )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:311:1: ()
            {
             before(grammarAccess.getTraceAccess().getTraceAction_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:312:1: ()
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:314:1: 
            {
            }

             after(grammarAccess.getTraceAccess().getTraceAction_0()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0574);
            rule__Trace__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Trace__Group__0


    // $ANTLR start rule__Trace__Group__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:325:1: rule__Trace__Group__1 : ( ( ( rule__Trace__TicksAssignment_1 ) ) ( ( rule__Trace__TicksAssignment_1 )* ) ) ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:329:1: ( ( ( ( rule__Trace__TicksAssignment_1 ) ) ( ( rule__Trace__TicksAssignment_1 )* ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:330:1: ( ( ( rule__Trace__TicksAssignment_1 ) ) ( ( rule__Trace__TicksAssignment_1 )* ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:330:1: ( ( ( rule__Trace__TicksAssignment_1 ) ) ( ( rule__Trace__TicksAssignment_1 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:331:1: ( ( rule__Trace__TicksAssignment_1 ) ) ( ( rule__Trace__TicksAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:331:1: ( ( rule__Trace__TicksAssignment_1 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:332:1: ( rule__Trace__TicksAssignment_1 )
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:333:1: ( rule__Trace__TicksAssignment_1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:333:2: rule__Trace__TicksAssignment_1
            {
            pushFollow(FOLLOW_rule__Trace__TicksAssignment_1_in_rule__Trace__Group__1604);
            rule__Trace__TicksAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getTicksAssignment_1()); 

            }

            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:336:1: ( ( rule__Trace__TicksAssignment_1 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:337:1: ( rule__Trace__TicksAssignment_1 )*
            {
             before(grammarAccess.getTraceAccess().getTicksAssignment_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:338:1: ( rule__Trace__TicksAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:338:2: rule__Trace__TicksAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TicksAssignment_1_in_rule__Trace__Group__1616);
            	    rule__Trace__TicksAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getTicksAssignment_1()); 

            }


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
    // $ANTLR end rule__Trace__Group__1


    // $ANTLR start rule__Tick__Group__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:353:1: rule__Tick__Group__0 : ( ( rule__Tick__InputAssignment_0 )* ) rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:357:1: ( ( ( rule__Tick__InputAssignment_0 )* ) rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:358:1: ( ( rule__Tick__InputAssignment_0 )* ) rule__Tick__Group__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:358:1: ( ( rule__Tick__InputAssignment_0 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:359:1: ( rule__Tick__InputAssignment_0 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:360:1: ( rule__Tick__InputAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:360:2: rule__Tick__InputAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_0_in_rule__Tick__Group__0657);
            	    rule__Tick__InputAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getInputAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__0667);
            rule__Tick__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Tick__Group__0


    // $ANTLR start rule__Tick__Group__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:371:1: rule__Tick__Group__1 : ( ( rule__Tick__Group_1__0 )? ) rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:375:1: ( ( ( rule__Tick__Group_1__0 )? ) rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:376:1: ( ( rule__Tick__Group_1__0 )? ) rule__Tick__Group__2
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:376:1: ( ( rule__Tick__Group_1__0 )? )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:377:1: ( rule__Tick__Group_1__0 )?
            {
             before(grammarAccess.getTickAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:378:1: ( rule__Tick__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:378:2: rule__Tick__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Tick__Group_1__0_in_rule__Tick__Group__1695);
                    rule__Tick__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTickAccess().getGroup_1()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__1705);
            rule__Tick__Group__2();
            _fsp--;


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
    // $ANTLR end rule__Tick__Group__1


    // $ANTLR start rule__Tick__Group__2
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:389:1: rule__Tick__Group__2 : ( ( rule__Tick__NAssignment_2 ) ) ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:393:1: ( ( ( rule__Tick__NAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:394:1: ( ( rule__Tick__NAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:394:1: ( ( rule__Tick__NAssignment_2 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:395:1: ( rule__Tick__NAssignment_2 )
            {
             before(grammarAccess.getTickAccess().getNAssignment_2()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:396:1: ( rule__Tick__NAssignment_2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:396:2: rule__Tick__NAssignment_2
            {
            pushFollow(FOLLOW_rule__Tick__NAssignment_2_in_rule__Tick__Group__2733);
            rule__Tick__NAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getNAssignment_2()); 

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
    // $ANTLR end rule__Tick__Group__2


    // $ANTLR start rule__Tick__Group_1__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:412:1: rule__Tick__Group_1__0 : ( '%' ) rule__Tick__Group_1__1 ;
    public final void rule__Tick__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:416:1: ( ( '%' ) rule__Tick__Group_1__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:417:1: ( '%' ) rule__Tick__Group_1__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:417:1: ( '%' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:418:1: '%'
            {
             before(grammarAccess.getTickAccess().getPercentSignKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Tick__Group_1__0774); 
             after(grammarAccess.getTickAccess().getPercentSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group_1__1_in_rule__Tick__Group_1__0784);
            rule__Tick__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Tick__Group_1__0


    // $ANTLR start rule__Tick__Group_1__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:432:1: rule__Tick__Group_1__1 : ( 'Output' ) rule__Tick__Group_1__2 ;
    public final void rule__Tick__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:436:1: ( ( 'Output' ) rule__Tick__Group_1__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:437:1: ( 'Output' ) rule__Tick__Group_1__2
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:437:1: ( 'Output' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:438:1: 'Output'
            {
             before(grammarAccess.getTickAccess().getOutputKeyword_1_1()); 
            match(input,14,FOLLOW_14_in_rule__Tick__Group_1__1813); 
             after(grammarAccess.getTickAccess().getOutputKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group_1__2_in_rule__Tick__Group_1__1823);
            rule__Tick__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Tick__Group_1__1


    // $ANTLR start rule__Tick__Group_1__2
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:452:1: rule__Tick__Group_1__2 : ( ':' ) rule__Tick__Group_1__3 ;
    public final void rule__Tick__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:456:1: ( ( ':' ) rule__Tick__Group_1__3 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:457:1: ( ':' ) rule__Tick__Group_1__3
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:457:1: ( ':' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:458:1: ':'
            {
             before(grammarAccess.getTickAccess().getColonKeyword_1_2()); 
            match(input,15,FOLLOW_15_in_rule__Tick__Group_1__2852); 
             after(grammarAccess.getTickAccess().getColonKeyword_1_2()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group_1__3_in_rule__Tick__Group_1__2862);
            rule__Tick__Group_1__3();
            _fsp--;


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
    // $ANTLR end rule__Tick__Group_1__2


    // $ANTLR start rule__Tick__Group_1__3
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:472:1: rule__Tick__Group_1__3 : ( ( rule__Tick__OutputAssignment_1_3 )* ) ;
    public final void rule__Tick__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:476:1: ( ( ( rule__Tick__OutputAssignment_1_3 )* ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:477:1: ( ( rule__Tick__OutputAssignment_1_3 )* )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:477:1: ( ( rule__Tick__OutputAssignment_1_3 )* )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:478:1: ( rule__Tick__OutputAssignment_1_3 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_1_3()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:479:1: ( rule__Tick__OutputAssignment_1_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:479:2: rule__Tick__OutputAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_1_3_in_rule__Tick__Group_1__3890);
            	    rule__Tick__OutputAssignment_1_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getOutputAssignment_1_3()); 

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
    // $ANTLR end rule__Tick__Group_1__3


    // $ANTLR start rule__Signal__Group__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:497:1: rule__Signal__Group__0 : ( ( rule__Signal__NameAssignment_0 ) ) rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:501:1: ( ( ( rule__Signal__NameAssignment_0 ) ) rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:502:1: ( ( rule__Signal__NameAssignment_0 ) ) rule__Signal__Group__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:502:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:503:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:504:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:504:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0933);
            rule__Signal__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__0942);
            rule__Signal__Group__1();
            _fsp--;


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
    // $ANTLR end rule__Signal__Group__0


    // $ANTLR start rule__Signal__Group__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:515:1: rule__Signal__Group__1 : ( ( rule__Signal__Group_1__0 )? ) ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:519:1: ( ( ( rule__Signal__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:520:1: ( ( rule__Signal__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:520:1: ( ( rule__Signal__Group_1__0 )? )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:521:1: ( rule__Signal__Group_1__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:522:1: ( rule__Signal__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:522:2: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Group__1970);
                    rule__Signal__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_1()); 

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
    // $ANTLR end rule__Signal__Group__1


    // $ANTLR start rule__Signal__Group_1__0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:536:1: rule__Signal__Group_1__0 : ( ( rule__Signal__ValuedAssignment_1_0 ) ) rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:540:1: ( ( ( rule__Signal__ValuedAssignment_1_0 ) ) rule__Signal__Group_1__1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:541:1: ( ( rule__Signal__ValuedAssignment_1_0 ) ) rule__Signal__Group_1__1
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:541:1: ( ( rule__Signal__ValuedAssignment_1_0 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:542:1: ( rule__Signal__ValuedAssignment_1_0 )
            {
             before(grammarAccess.getSignalAccess().getValuedAssignment_1_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:543:1: ( rule__Signal__ValuedAssignment_1_0 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:543:2: rule__Signal__ValuedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Signal__ValuedAssignment_1_0_in_rule__Signal__Group_1__01009);
            rule__Signal__ValuedAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getValuedAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__01018);
            rule__Signal__Group_1__1();
            _fsp--;


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
    // $ANTLR end rule__Signal__Group_1__0


    // $ANTLR start rule__Signal__Group_1__1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:554:1: rule__Signal__Group_1__1 : ( ( rule__Signal__ValAssignment_1_1 ) ) rule__Signal__Group_1__2 ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:558:1: ( ( ( rule__Signal__ValAssignment_1_1 ) ) rule__Signal__Group_1__2 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:559:1: ( ( rule__Signal__ValAssignment_1_1 ) ) rule__Signal__Group_1__2
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:559:1: ( ( rule__Signal__ValAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:560:1: ( rule__Signal__ValAssignment_1_1 )
            {
             before(grammarAccess.getSignalAccess().getValAssignment_1_1()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:561:1: ( rule__Signal__ValAssignment_1_1 )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:561:2: rule__Signal__ValAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Signal__ValAssignment_1_1_in_rule__Signal__Group_1__11046);
            rule__Signal__ValAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getValAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__11055);
            rule__Signal__Group_1__2();
            _fsp--;


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
    // $ANTLR end rule__Signal__Group_1__1


    // $ANTLR start rule__Signal__Group_1__2
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:572:1: rule__Signal__Group_1__2 : ( ')' ) ;
    public final void rule__Signal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:576:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:577:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:577:1: ( ')' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:578:1: ')'
            {
             before(grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_16_in_rule__Signal__Group_1__21084); 
             after(grammarAccess.getSignalAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end rule__Signal__Group_1__2


    // $ANTLR start rule__Tracelist__TracesAssignment_0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:598:1: rule__Tracelist__TracesAssignment_0 : ( ruletrace ) ;
    public final void rule__Tracelist__TracesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:602:1: ( ( ruletrace ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:603:1: ( ruletrace )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:603:1: ( ruletrace )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:604:1: ruletrace
            {
             before(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment_01126);
            ruletrace();
            _fsp--;

             after(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Tracelist__TracesAssignment_0


    // $ANTLR start rule__Tracelist__TracesAssignment_1_3
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:613:1: rule__Tracelist__TracesAssignment_1_3 : ( ruletrace ) ;
    public final void rule__Tracelist__TracesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:617:1: ( ( ruletrace ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:618:1: ( ruletrace )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:618:1: ( ruletrace )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:619:1: ruletrace
            {
             before(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment_1_31157);
            ruletrace();
            _fsp--;

             after(grammarAccess.getTracelistAccess().getTracesTraceParserRuleCall_1_3_0()); 

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
    // $ANTLR end rule__Tracelist__TracesAssignment_1_3


    // $ANTLR start rule__Trace__TicksAssignment_1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:628:1: rule__Trace__TicksAssignment_1 : ( ruletick ) ;
    public final void rule__Trace__TicksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:632:1: ( ( ruletick ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:633:1: ( ruletick )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:633:1: ( ruletick )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:634:1: ruletick
            {
             before(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruletick_in_rule__Trace__TicksAssignment_11188);
            ruletick();
            _fsp--;

             after(grammarAccess.getTraceAccess().getTicksTickParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Trace__TicksAssignment_1


    // $ANTLR start rule__Tick__InputAssignment_0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:643:1: rule__Tick__InputAssignment_0 : ( rulesignal ) ;
    public final void rule__Tick__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:647:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:648:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:648:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:649:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getInputSignalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__InputAssignment_01219);
            rulesignal();
            _fsp--;

             after(grammarAccess.getTickAccess().getInputSignalParserRuleCall_0_0()); 

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
    // $ANTLR end rule__Tick__InputAssignment_0


    // $ANTLR start rule__Tick__OutputAssignment_1_3
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:658:1: rule__Tick__OutputAssignment_1_3 : ( rulesignal ) ;
    public final void rule__Tick__OutputAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:662:1: ( ( rulesignal ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:663:1: ( rulesignal )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:663:1: ( rulesignal )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:664:1: rulesignal
            {
             before(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_1_31250);
            rulesignal();
            _fsp--;

             after(grammarAccess.getTickAccess().getOutputSignalParserRuleCall_1_3_0()); 

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
    // $ANTLR end rule__Tick__OutputAssignment_1_3


    // $ANTLR start rule__Tick__NAssignment_2
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:673:1: rule__Tick__NAssignment_2 : ( ( ';' ) ) ;
    public final void rule__Tick__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:677:1: ( ( ( ';' ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:678:1: ( ( ';' ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:678:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:679:1: ( ';' )
            {
             before(grammarAccess.getTickAccess().getNSemicolonKeyword_2_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:680:1: ( ';' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:681:1: ';'
            {
             before(grammarAccess.getTickAccess().getNSemicolonKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Tick__NAssignment_21286); 
             after(grammarAccess.getTickAccess().getNSemicolonKeyword_2_0()); 

            }

             after(grammarAccess.getTickAccess().getNSemicolonKeyword_2_0()); 

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
    // $ANTLR end rule__Tick__NAssignment_2


    // $ANTLR start rule__Signal__NameAssignment_0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:696:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:700:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:701:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:701:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:702:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_01325); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Signal__NameAssignment_0


    // $ANTLR start rule__Signal__ValuedAssignment_1_0
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:711:1: rule__Signal__ValuedAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__Signal__ValuedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:715:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:716:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:716:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:717:1: ( '(' )
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:718:1: ( '(' )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:719:1: '('
            {
             before(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Signal__ValuedAssignment_1_01361); 
             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 

            }

             after(grammarAccess.getSignalAccess().getValuedLeftParenthesisKeyword_1_0_0()); 

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
    // $ANTLR end rule__Signal__ValuedAssignment_1_0


    // $ANTLR start rule__Signal__ValAssignment_1_1
    // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:734:1: rule__Signal__ValAssignment_1_1 : ( RULE_NUM ) ;
    public final void rule__Signal__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:738:1: ( ( RULE_NUM ) )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:739:1: ( RULE_NUM )
            {
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:739:1: ( RULE_NUM )
            // ../de.cau.cs.kieler.sim.esi.ui/src-gen/de/cau/cs/kieler/sim/esi/ui/contentassist/antlr/internal/InternalEsi.g:740:1: RULE_NUM
            {
             before(grammarAccess.getSignalAccess().getValNUMTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rule__Signal__ValAssignment_1_11400); 
             after(grammarAccess.getSignalAccess().getValNUMTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Signal__ValAssignment_1_1


 

    public static final BitSet FOLLOW_ruletracelist_in_entryRuletracelist61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletracelist68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tracelist__Group__0_in_ruletracelist94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_entryRuletrace121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletrace128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0_in_ruletrace154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_entryRuletick181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletick188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__0_in_ruletick214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_entryRulesignal241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignal248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_rulesignal274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_0_in_rule__Tracelist__Group__0312 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Tracelist__Group__1_in_rule__Tracelist__Group__0322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tracelist__Group_1__0_in_rule__Tracelist__Group__1352 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Tracelist__Group_1__0_in_rule__Tracelist__Group__1364 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rule__Tracelist__Group_1__0406 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Tracelist__Group_1__1_in_rule__Tracelist__Group_1__0416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Tracelist__Group_1__1445 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Tracelist__Group_1__2_in_rule__Tracelist__Group_1__1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Tracelist__Group_1__2484 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Tracelist__Group_1__3_in_rule__Tracelist__Group_1__2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tracelist__TracesAssignment_1_3_in_rule__Tracelist__Group_1__3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_1_in_rule__Trace__Group__1604 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_rule__Trace__TicksAssignment_1_in_rule__Trace__Group__1616 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_0_in_rule__Tick__Group__0657 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__0667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group_1__0_in_rule__Tick__Group__1695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__NAssignment_2_in_rule__Tick__Group__2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Tick__Group_1__0774 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Tick__Group_1__1_in_rule__Tick__Group_1__0784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Tick__Group_1__1813 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Tick__Group_1__2_in_rule__Tick__Group_1__1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tick__Group_1__2852 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Tick__Group_1__3_in_rule__Tick__Group_1__2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_1_3_in_rule__Tick__Group_1__3890 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0933 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__0942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Group__1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValuedAssignment_1_0_in_rule__Signal__Group_1__01009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__01018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__ValAssignment_1_1_in_rule__Signal__Group_1__11046 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Signal__Group_1__21084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment_01126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletrace_in_rule__Tracelist__TracesAssignment_1_31157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletick_in_rule__Trace__TicksAssignment_11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__InputAssignment_01219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignal_in_rule__Tick__OutputAssignment_1_31250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Tick__NAssignment_21286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Signal__ValuedAssignment_1_01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_rule__Signal__ValAssignment_1_11400 = new BitSet(new long[]{0x0000000000000002L});

}