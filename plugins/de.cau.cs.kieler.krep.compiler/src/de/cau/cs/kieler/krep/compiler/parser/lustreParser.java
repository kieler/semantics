/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
// $ANTLR 3.1.1 lustre.g 2009-02-10 09:23:38

package de.cau.cs.kieler.krep.compiler.parser;

import java.util.LinkedList;

import java.util.HashMap;

import org.antlr.runtime.*;

import de.cau.cs.kieler.krep.compiler.lustre.*;
import de.cau.cs.kieler.krep.compiler.lustre.Number;
import de.cau.cs.kieler.krep.compiler.prog.Type;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lustreParser extends Parser {
    public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>",
            "<UP>", "ID", "NUMBER", "Letter", "Digit", "WHITESPACE", "COMMENT", "':'", "'const'",
            "';'", "'.'", "'type'", "','", "'bool'", "'int'", "'real'", "'node'", "'('", "')'",
            "'returns'", "'when'", "'var'", "'let'", "'tel'", "'assert'", "'='", "'not'", "'pre'",
            "'current'", "'if'", "'then'", "'else'", "'->'", "'xor'", "'=>'", "'or'", "'and'",
            "'<>'", "'<'", "'<='", "'>='", "'>'", "'*'", "'/'", "'mod'", "'div'", "'+'", "'-'",
            "'true'", "'false'" };
    public static final int T__29 = 29;
    public static final int T__28 = 28;
    public static final int T__27 = 27;
    public static final int T__26 = 26;
    public static final int T__25 = 25;
    public static final int T__24 = 24;
    public static final int T__23 = 23;
    public static final int T__22 = 22;
    public static final int T__21 = 21;
    public static final int T__20 = 20;
    public static final int ID = 4;
    public static final int EOF = -1;
    public static final int T__19 = 19;
    public static final int T__51 = 51;
    public static final int T__16 = 16;
    public static final int T__52 = 52;
    public static final int T__15 = 15;
    public static final int T__18 = 18;
    public static final int T__17 = 17;
    public static final int T__12 = 12;
    public static final int T__11 = 11;
    public static final int T__14 = 14;
    public static final int T__13 = 13;
    public static final int T__10 = 10;
    public static final int COMMENT = 9;
    public static final int T__50 = 50;
    public static final int T__42 = 42;
    public static final int T__43 = 43;
    public static final int T__40 = 40;
    public static final int T__41 = 41;
    public static final int T__46 = 46;
    public static final int T__47 = 47;
    public static final int T__44 = 44;
    public static final int T__45 = 45;
    public static final int T__48 = 48;
    public static final int T__49 = 49;
    public static final int NUMBER = 5;
    public static final int WHITESPACE = 8;
    public static final int Digit = 7;
    public static final int T__30 = 30;
    public static final int T__31 = 31;
    public static final int T__32 = 32;
    public static final int T__33 = 33;
    public static final int T__34 = 34;
    public static final int T__35 = 35;
    public static final int T__36 = 36;
    public static final int T__37 = 37;
    public static final int T__38 = 38;
    public static final int T__39 = 39;
    public static final int Letter = 6;

    // delegates
    // delegators

    public lustreParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public lustreParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);

    }

    public String[] getTokenNames() {
        return lustreParser.tokenNames;
    }

    public String getGrammarFileName() {
        return "lustre.g";
    }

    Lustre l;
    Expression e;

    // HashMap<String, Type> types = new HashMap<String, Type>();
    // HashMap<String, String> clocks = new HashMap<String, String>();

    public void setProg(Lustre l) {
        // types.put("false", Type.BOOL);
        // types.put("true", Type.BOOL);
        this.l = l;
    }

    // private Variable getVar(String name){
    // return new Variable(name, types.get(name), clocks.get(name));
    // }

    // $ANTLR start "prog"
    // lustre.g:39:1: prog : ( decl )+ ;
    public final void prog() throws RecognitionException {
        try {
            // lustre.g:39:6: ( ( decl )+ )
            // lustre.g:39:8: ( decl )+
            {
                // lustre.g:39:8: ( decl )+
                int cnt1 = 0;
                loop1: do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);

                    if ((LA1_0 == 11 || LA1_0 == 14 || LA1_0 == 19)) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                    case 1:
                        // lustre.g:39:8: decl
                    {
                        pushFollow(FOLLOW_decl_in_prog31);
                        decl();

                        state._fsp--;

                    }
                        break;

                    default:
                        if (cnt1 >= 1)
                            break loop1;
                        EarlyExitException eee = new EarlyExitException(1, input);
                        throw eee;
                    }
                    cnt1++;
                } while (true);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "prog"

    // $ANTLR start "decl"
    // lustre.g:41:1: decl : ( constDecl | typeDecl | nodeDecl );
    public final void decl() throws RecognitionException {
        try {
            // lustre.g:42:3: ( constDecl | typeDecl | nodeDecl )
            int alt2 = 3;
            switch (input.LA(1)) {
            case 11: {
                alt2 = 1;
            }
                break;
            case 14: {
                alt2 = 2;
            }
                break;
            case 19: {
                alt2 = 3;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
            case 1:
                // lustre.g:42:5: constDecl
            {
                pushFollow(FOLLOW_constDecl_in_decl44);
                constDecl();

                state._fsp--;

            }
                break;
            case 2:
                // lustre.g:43:5: typeDecl
            {
                pushFollow(FOLLOW_typeDecl_in_decl52);
                typeDecl();

                state._fsp--;

            }
                break;
            case 3:
                // lustre.g:44:5: nodeDecl
            {
                pushFollow(FOLLOW_nodeDecl_in_decl60);
                nodeDecl();

                state._fsp--;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "decl"

    // $ANTLR start "typedID"
    // lustre.g:47:1: typedID returns [Variable var] : n= ID ':' t= type ;
    public final Variable typedID() throws RecognitionException {
        Variable var = null;

        Token n = null;
        Type t = null;

        try {
            // lustre.g:48:3: (n= ID ':' t= type )
            // lustre.g:48:5: n= ID ':' t= type
            {
                n = (Token) match(input, ID, FOLLOW_ID_in_typedID82);
                match(input, 10, FOLLOW_10_in_typedID84);
                pushFollow(FOLLOW_type_in_typedID88);
                t = type();

                state._fsp--;

                return new Variable((n != null ? n.getText() : null), t);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return var;
    }

    // $ANTLR end "typedID"

    // $ANTLR start "constDecl"
    // lustre.g:51:1: constDecl : ( 'const' constDeclList ';' | 'const' constDeclList '.' );
    public final void constDecl() throws RecognitionException {
        try {
            // lustre.g:52:3: ( 'const' constDeclList ';' | 'const' constDeclList '.' )
            int alt3 = 2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
            case 1:
                // lustre.g:52:5: 'const' constDeclList ';'
            {
                match(input, 11, FOLLOW_11_in_constDecl112);
                pushFollow(FOLLOW_constDeclList_in_constDecl114);
                constDeclList();

                state._fsp--;

                match(input, 12, FOLLOW_12_in_constDecl116);

            }
                break;
            case 2:
                // lustre.g:53:5: 'const' constDeclList '.'
            {
                match(input, 11, FOLLOW_11_in_constDecl124);
                pushFollow(FOLLOW_constDeclList_in_constDecl126);
                constDeclList();

                state._fsp--;

                match(input, 13, FOLLOW_13_in_constDecl128);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "constDecl"

    // $ANTLR start "constDeclList"
    // lustre.g:56:1: constDeclList : constOneDecl ( ';' constOneDecl )* ;
    public final void constDeclList() throws RecognitionException {
        try {
            // lustre.g:57:3: ( constOneDecl ( ';' constOneDecl )* )
            // lustre.g:57:5: constOneDecl ( ';' constOneDecl )*
            {
                pushFollow(FOLLOW_constOneDecl_in_constDeclList144);
                constOneDecl();

                state._fsp--;

                // lustre.g:57:18: ( ';' constOneDecl )*
                loop4: do {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);

                    if ((LA4_0 == 12)) {
                        int LA4_1 = input.LA(2);

                        if ((LA4_1 == ID)) {
                            alt4 = 1;
                        }

                    }

                    switch (alt4) {
                    case 1:
                        // lustre.g:57:19: ';' constOneDecl
                    {
                        match(input, 12, FOLLOW_12_in_constDeclList147);
                        pushFollow(FOLLOW_constOneDecl_in_constDeclList149);
                        constOneDecl();

                        state._fsp--;

                    }
                        break;

                    default:
                        break loop4;
                    }
                } while (true);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "constDeclList"

    // $ANTLR start "constOneDecl"
    // lustre.g:59:1: constOneDecl : ID ':' type ;
    public final void constOneDecl() throws RecognitionException {
        try {
            // lustre.g:60:3: ( ID ':' type )
            // lustre.g:60:5: ID ':' type
            {
                match(input, ID, FOLLOW_ID_in_constOneDecl164);
                match(input, 10, FOLLOW_10_in_constOneDecl166);
                pushFollow(FOLLOW_type_in_constOneDecl168);
                type();

                state._fsp--;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "constOneDecl"

    // $ANTLR start "typeDecl"
    // lustre.g:63:1: typeDecl : ( 'type' typeDeclList ';' | 'type' typeDeclList '.' );
    public final void typeDecl() throws RecognitionException {
        try {
            // lustre.g:64:3: ( 'type' typeDeclList ';' | 'type' typeDeclList '.' )
            int alt5 = 2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
            case 1:
                // lustre.g:64:5: 'type' typeDeclList ';'
            {
                match(input, 14, FOLLOW_14_in_typeDecl182);
                pushFollow(FOLLOW_typeDeclList_in_typeDecl184);
                typeDeclList();

                state._fsp--;

                match(input, 12, FOLLOW_12_in_typeDecl186);

            }
                break;
            case 2:
                // lustre.g:65:5: 'type' typeDeclList '.'
            {
                match(input, 14, FOLLOW_14_in_typeDecl194);
                pushFollow(FOLLOW_typeDeclList_in_typeDecl196);
                typeDeclList();

                state._fsp--;

                match(input, 13, FOLLOW_13_in_typeDecl198);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "typeDecl"

    // $ANTLR start "typeDeclList"
    // lustre.g:68:1: typeDeclList : typeOneDecl ( ',' typeOneDecl )* ;
    public final void typeDeclList() throws RecognitionException {
        try {
            // lustre.g:69:3: ( typeOneDecl ( ',' typeOneDecl )* )
            // lustre.g:69:5: typeOneDecl ( ',' typeOneDecl )*
            {
                pushFollow(FOLLOW_typeOneDecl_in_typeDeclList222);
                typeOneDecl();

                state._fsp--;

                // lustre.g:69:17: ( ',' typeOneDecl )*
                loop6: do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);

                    if ((LA6_0 == 15)) {
                        alt6 = 1;
                    }

                    switch (alt6) {
                    case 1:
                        // lustre.g:69:18: ',' typeOneDecl
                    {
                        match(input, 15, FOLLOW_15_in_typeDeclList225);
                        pushFollow(FOLLOW_typeOneDecl_in_typeDeclList227);
                        typeOneDecl();

                        state._fsp--;

                    }
                        break;

                    default:
                        break loop6;
                    }
                } while (true);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "typeDeclList"

    // $ANTLR start "typeOneDecl"
    // lustre.g:71:1: typeOneDecl : ID ;
    public final void typeOneDecl() throws RecognitionException {
        try {
            // lustre.g:72:3: ( ID )
            // lustre.g:72:5: ID
            {
                match(input, ID, FOLLOW_ID_in_typeOneDecl242);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "typeOneDecl"

    // $ANTLR start "type"
    // lustre.g:74:1: type returns [Type type] : (t= predefinedType | ID );
    public final Type type() throws RecognitionException {
        Type type = null;

        Type t = null;

        try {
            // lustre.g:75:3: (t= predefinedType | ID )
            int alt7 = 2;
            int LA7_0 = input.LA(1);

            if (((LA7_0 >= 16 && LA7_0 <= 18))) {
                alt7 = 1;
            } else if ((LA7_0 == ID)) {
                alt7 = 2;
            } else {
                NoViableAltException nvae = new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
            case 1:
                // lustre.g:75:5: t= predefinedType
            {
                pushFollow(FOLLOW_predefinedType_in_type260);
                t = predefinedType();

                state._fsp--;

                type = t;

            }
                break;
            case 2:
                // lustre.g:76:5: ID
            {
                match(input, ID, FOLLOW_ID_in_type269);
                type = Type.INT;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return type;
    }

    // $ANTLR end "type"

    // $ANTLR start "typeList"
    // lustre.g:79:1: typeList : type ( ',' type )* ;
    public final void typeList() throws RecognitionException {
        try {
            // lustre.g:80:3: ( type ( ',' type )* )
            // lustre.g:80:5: type ( ',' type )*
            {
                pushFollow(FOLLOW_type_in_typeList299);
                type();

                state._fsp--;

                // lustre.g:80:10: ( ',' type )*
                loop8: do {
                    int alt8 = 2;
                    int LA8_0 = input.LA(1);

                    if ((LA8_0 == 15)) {
                        alt8 = 1;
                    }

                    switch (alt8) {
                    case 1:
                        // lustre.g:80:11: ',' type
                    {
                        match(input, 15, FOLLOW_15_in_typeList302);
                        pushFollow(FOLLOW_type_in_typeList304);
                        type();

                        state._fsp--;

                    }
                        break;

                    default:
                        break loop8;
                    }
                } while (true);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "typeList"

    // $ANTLR start "predefinedType"
    // lustre.g:82:1: predefinedType returns [Type t] : ( 'bool' | 'int' | 'real' );
    public final Type predefinedType() throws RecognitionException {
        Type t = null;

        try {
            // lustre.g:83:3: ( 'bool' | 'int' | 'real' )
            int alt9 = 3;
            switch (input.LA(1)) {
            case 16: {
                alt9 = 1;
            }
                break;
            case 17: {
                alt9 = 2;
            }
                break;
            case 18: {
                alt9 = 3;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
            case 1:
                // lustre.g:83:5: 'bool'
            {
                match(input, 16, FOLLOW_16_in_predefinedType322);
                t = Type.BOOL;

            }
                break;
            case 2:
                // lustre.g:84:5: 'int'
            {
                match(input, 17, FOLLOW_17_in_predefinedType330);
                t = Type.INT;

            }
                break;
            case 3:
                // lustre.g:85:5: 'real'
            {
                match(input, 18, FOLLOW_18_in_predefinedType339);
                t = Type.REAL;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return t;
    }

    // $ANTLR end "predefinedType"

    // $ANTLR start "nodeDecl"
    // lustre.g:89:1: nodeDecl : 'node' ID '(' in= varDeclList ')' 'returns' '(' out= varDeclList
    // ')' ';' loc= locals nodeBody ;
    public final void nodeDecl() throws RecognitionException {
        LinkedList<Variable> in = null;

        LinkedList<Variable> out = null;

        LinkedList<Variable> loc = null;

        try {
            // lustre.g:90:3: ( 'node' ID '(' in= varDeclList ')' 'returns' '(' out= varDeclList ')'
            // ';' loc= locals nodeBody )
            // lustre.g:90:5: 'node' ID '(' in= varDeclList ')' 'returns' '(' out= varDeclList ')'
            // ';' loc= locals nodeBody
            {
                match(input, 19, FOLLOW_19_in_nodeDecl356);
                match(input, ID, FOLLOW_ID_in_nodeDecl358);
                match(input, 20, FOLLOW_20_in_nodeDecl360);
                pushFollow(FOLLOW_varDeclList_in_nodeDecl371);
                in = varDeclList();

                state._fsp--;

                l.setInputs(in);
                match(input, 21, FOLLOW_21_in_nodeDecl387);
                match(input, 22, FOLLOW_22_in_nodeDecl389);
                match(input, 20, FOLLOW_20_in_nodeDecl391);
                pushFollow(FOLLOW_varDeclList_in_nodeDecl402);
                out = varDeclList();

                state._fsp--;

                l.setOutputs(out);
                match(input, 21, FOLLOW_21_in_nodeDecl416);
                match(input, 12, FOLLOW_12_in_nodeDecl418);
                pushFollow(FOLLOW_locals_in_nodeDecl426);
                loc = locals();

                state._fsp--;

                l.setLocals(loc);
                pushFollow(FOLLOW_nodeBody_in_nodeDecl448);
                nodeBody();

                state._fsp--;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "nodeDecl"

    // $ANTLR start "varDeclList"
    // lustre.g:99:1: varDeclList returns [LinkedList<Variable> vars] : vs= varDecl ( ';' vs=
    // varDecl )* ;
    public final LinkedList<Variable> varDeclList() throws RecognitionException {
        LinkedList<Variable> vars = null;

        Variable vs = null;

        try {
            // lustre.g:100:2: (vs= varDecl ( ';' vs= varDecl )* )
            // lustre.g:100:4: vs= varDecl ( ';' vs= varDecl )*
            {
                LinkedList<Variable> res = new LinkedList<Variable>();
                pushFollow(FOLLOW_varDecl_in_varDeclList481);
                vs = varDecl();

                state._fsp--;

                res.add(vs);
                // lustre.g:102:4: ( ';' vs= varDecl )*
                loop10: do {
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);

                    if ((LA10_0 == 12)) {
                        int LA10_2 = input.LA(2);

                        if ((LA10_2 == ID || LA10_2 == 20)) {
                            alt10 = 1;
                        }

                    }

                    switch (alt10) {
                    case 1:
                        // lustre.g:102:5: ';' vs= varDecl
                    {
                        match(input, 12, FOLLOW_12_in_varDeclList518);
                        pushFollow(FOLLOW_varDecl_in_varDeclList522);
                        vs = varDecl();

                        state._fsp--;

                        res.add(vs);

                    }
                        break;

                    default:
                        break loop10;
                    }
                } while (true);

                vars = res;

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return vars;
    }

    // $ANTLR end "varDeclList"

    // $ANTLR start "varDecl"
    // lustre.g:104:1: varDecl returns [Variable var] : (v= typedID | v= typedID 'when' c= ID | '('
    // vs= typedID ')' 'when' c= ID );
    public final Variable varDecl() throws RecognitionException {
        Variable var = null;

        Token c = null;
        Variable v = null;

        Variable vs = null;

        try {
            // lustre.g:105:3: (v= typedID | v= typedID 'when' c= ID | '(' vs= typedID ')' 'when' c=
            // ID )
            int alt11 = 3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
            case 1:
                // lustre.g:105:5: v= typedID
            {
                pushFollow(FOLLOW_typedID_in_varDecl556);
                v = typedID();

                state._fsp--;

                var = v;

            }
                break;
            case 2:
                // lustre.g:106:5: v= typedID 'when' c= ID
            {
                pushFollow(FOLLOW_typedID_in_varDecl594);
                v = typedID();

                state._fsp--;

                match(input, 23, FOLLOW_23_in_varDecl596);
                c = (Token) match(input, ID, FOLLOW_ID_in_varDecl600);
                v.setClock((c != null ? c.getText() : null));
                var = v;

            }
                break;
            case 3:
                // lustre.g:107:5: '(' vs= typedID ')' 'when' c= ID
            {
                match(input, 20, FOLLOW_20_in_varDecl624);
                pushFollow(FOLLOW_typedID_in_varDecl628);
                vs = typedID();

                state._fsp--;

                match(input, 21, FOLLOW_21_in_varDecl630);
                match(input, 23, FOLLOW_23_in_varDecl632);
                c = (Token) match(input, ID, FOLLOW_ID_in_varDecl636);
                vs.setClock((c != null ? c.getText() : null));
                var = vs;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return var;
    }

    // $ANTLR end "varDecl"

    // $ANTLR start "locals"
    // lustre.g:110:1: locals returns [LinkedList<Variable> vars] : ( | 'var' (res= varDeclList )?
    // ';' );
    public final LinkedList<Variable> locals() throws RecognitionException {
        LinkedList<Variable> vars = null;

        LinkedList<Variable> res = null;

        try {
            // lustre.g:111:3: ( | 'var' (res= varDeclList )? ';' )
            int alt13 = 2;
            int LA13_0 = input.LA(1);

            if ((LA13_0 == 25)) {
                alt13 = 1;
            } else if ((LA13_0 == 24)) {
                alt13 = 2;
            } else {
                NoViableAltException nvae = new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
            case 1:
                // lustre.g:111:37:
            {
                vars = new LinkedList<Variable>();

            }
                break;
            case 2:
                // lustre.g:112:5: 'var' (res= varDeclList )? ';'
            {
                match(input, 24, FOLLOW_24_in_locals699);
                // lustre.g:112:11: (res= varDeclList )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);

                if ((LA12_0 == ID || LA12_0 == 20)) {
                    alt12 = 1;
                }
                switch (alt12) {
                case 1:
                    // lustre.g:112:12: res= varDeclList
                {
                    pushFollow(FOLLOW_varDeclList_in_locals705);
                    res = varDeclList();

                    state._fsp--;

                }
                    break;

                }

                match(input, 12, FOLLOW_12_in_locals709);
                vars = res;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return vars;
    }

    // $ANTLR end "locals"

    // $ANTLR start "nodeBody"
    // lustre.g:115:1: nodeBody : 'let' equationList 'tel' ( ';' | '.' )? ;
    public final void nodeBody() throws RecognitionException {
        try {
            // lustre.g:116:3: ( 'let' equationList 'tel' ( ';' | '.' )? )
            // lustre.g:116:5: 'let' equationList 'tel' ( ';' | '.' )?
            {
                match(input, 25, FOLLOW_25_in_nodeBody735);
                pushFollow(FOLLOW_equationList_in_nodeBody737);
                equationList();

                state._fsp--;

                match(input, 26, FOLLOW_26_in_nodeBody739);
                // lustre.g:116:30: ( ';' | '.' )?
                int alt14 = 2;
                int LA14_0 = input.LA(1);

                if (((LA14_0 >= 12 && LA14_0 <= 13))) {
                    alt14 = 1;
                }
                switch (alt14) {
                case 1:
                    // lustre.g:
                {
                    if ((input.LA(1) >= 12 && input.LA(1) <= 13)) {
                        input.consume();
                        state.errorRecovery = false;
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                    }

                }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "nodeBody"

    // $ANTLR start "equationList"
    // lustre.g:119:1: equationList : ( equation )* ;
    public final void equationList() throws RecognitionException {
        try {
            // lustre.g:120:3: ( ( equation )* )
            // lustre.g:120:5: ( equation )*
            {
                // lustre.g:120:5: ( equation )*
                loop15: do {
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);

                    if ((LA15_0 == ID || LA15_0 == 27)) {
                        alt15 = 1;
                    }

                    switch (alt15) {
                    case 1:
                        // lustre.g:120:5: equation
                    {
                        pushFollow(FOLLOW_equation_in_equationList762);
                        equation();

                        state._fsp--;

                    }
                        break;

                    default:
                        break loop15;
                    }
                } while (true);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "equationList"

    // $ANTLR start "equation"
    // lustre.g:122:1: equation : ( 'assert' expression[\"assert\"] ';' | n= ID '=' e=
    // expression[$n.text] ';' );
    public final void equation() throws RecognitionException {
        Token n = null;
        Expression e = null;

        try {
            // lustre.g:123:3: ( 'assert' expression[\"assert\"] ';' | n= ID '=' e=
            // expression[$n.text] ';' )
            int alt16 = 2;
            int LA16_0 = input.LA(1);

            if ((LA16_0 == 27)) {
                alt16 = 1;
            } else if ((LA16_0 == ID)) {
                alt16 = 2;
            } else {
                NoViableAltException nvae = new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
            case 1:
                // lustre.g:123:5: 'assert' expression[\"assert\"] ';'
            {
                match(input, 27, FOLLOW_27_in_equation776);
                pushFollow(FOLLOW_expression_in_equation778);
                expression("assert");

                state._fsp--;

                match(input, 12, FOLLOW_12_in_equation781);

            }
                break;
            case 2:
                // lustre.g:124:5: n= ID '=' e= expression[$n.text] ';'
            {
                n = (Token) match(input, ID, FOLLOW_ID_in_equation791);
                match(input, 28, FOLLOW_28_in_equation793);
                pushFollow(FOLLOW_expression_in_equation797);
                e = expression((n != null ? n.getText() : null));

                state._fsp--;

                match(input, 12, FOLLOW_12_in_equation800);
                l.addEq((n != null ? n.getText() : null), e);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return;
    }

    // $ANTLR end "equation"

    // $ANTLR start "expression"
    // lustre.g:129:1: expression[String name] returns [Expression expr] : (c= constant[name] | v=
    // ID | 'not' e= expression[name] | 'pre' e= expression[name] | 'current' e= expression[name] |
    // '(' 'if' e1= expression[name] 'then' e2= expression[name] 'else' e3= expression[name] ')' |
    // '(' e1= expression[name] (e= rbinop[name,$expr] )? ')' );
    public final Expression expression(String name) throws RecognitionException {
        Expression expr = null;

        Token v = null;
        Number c = null;

        Expression e = null;

        Expression e1 = null;

        Expression e2 = null;

        Expression e3 = null;

        try {
            // lustre.g:130:3: (c= constant[name] | v= ID | 'not' e= expression[name] | 'pre' e=
            // expression[name] | 'current' e= expression[name] | '(' 'if' e1= expression[name]
            // 'then' e2= expression[name] 'else' e3= expression[name] ')' | '(' e1=
            // expression[name] (e= rbinop[name,$expr] )? ')' )
            int alt18 = 7;
            switch (input.LA(1)) {
            case NUMBER:
            case 51:
            case 52: {
                alt18 = 1;
            }
                break;
            case ID: {
                alt18 = 2;
            }
                break;
            case 29: {
                alt18 = 3;
            }
                break;
            case 30: {
                alt18 = 4;
            }
                break;
            case 31: {
                alt18 = 5;
            }
                break;
            case 20: {
                int LA18_6 = input.LA(2);

                if ((LA18_6 == 32)) {
                    alt18 = 6;
                } else if (((LA18_6 >= ID && LA18_6 <= NUMBER) || LA18_6 == 20
                        || (LA18_6 >= 29 && LA18_6 <= 31) || (LA18_6 >= 51 && LA18_6 <= 52))) {
                    alt18 = 7;
                } else {
                    NoViableAltException nvae = new NoViableAltException("", 18, 6, input);

                    throw nvae;
                }
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
            case 1:
                // lustre.g:130:5: c= constant[name]
            {
                pushFollow(FOLLOW_constant_in_expression826);
                c = constant(name);

                state._fsp--;

                expr = c;

            }
                break;
            case 2:
                // lustre.g:131:5: v= ID
            {
                v = (Token) match(input, ID, FOLLOW_ID_in_expression868);
                expr = new VarAccess((v != null ? v.getText() : null));

            }
                break;
            case 3:
                // lustre.g:132:5: 'not' e= expression[name]
            {
                match(input, 29, FOLLOW_29_in_expression920);
                pushFollow(FOLLOW_expression_in_expression924);
                e = expression(name);

                state._fsp--;

                expr = new Not(name, e);

            }
                break;
            case 4:
                // lustre.g:133:5: 'pre' e= expression[name]
            {
                match(input, 30, FOLLOW_30_in_expression957);
                pushFollow(FOLLOW_expression_in_expression961);
                e = expression(name);

                state._fsp--;

                expr = new Pre(name, e);

            }
                break;
            case 5:
                // lustre.g:134:5: 'current' e= expression[name]
            {
                match(input, 31, FOLLOW_31_in_expression994);
                pushFollow(FOLLOW_expression_in_expression998);
                e = expression(name);

                state._fsp--;

                expr = new Current(name, e);

            }
                break;
            case 6:
                // lustre.g:135:5: '(' 'if' e1= expression[name] 'then' e2= expression[name] 'else'
                // e3= expression[name] ')'
            {
                match(input, 20, FOLLOW_20_in_expression1027);
                match(input, 32, FOLLOW_32_in_expression1029);
                pushFollow(FOLLOW_expression_in_expression1033);
                e1 = expression(name);

                state._fsp--;

                match(input, 33, FOLLOW_33_in_expression1045);
                pushFollow(FOLLOW_expression_in_expression1049);
                e2 = expression(name);

                state._fsp--;

                match(input, 34, FOLLOW_34_in_expression1061);
                pushFollow(FOLLOW_expression_in_expression1065);
                e3 = expression(name);

                state._fsp--;

                match(input, 21, FOLLOW_21_in_expression1068);
                expr = new If(name, e1, e2, e3);

            }
                break;
            case 7:
                // lustre.g:139:5: '(' e1= expression[name] (e= rbinop[name,$expr] )? ')'
            {
                match(input, 20, FOLLOW_20_in_expression1133);
                pushFollow(FOLLOW_expression_in_expression1137);
                e1 = expression(name);

                state._fsp--;

                expr = e1;
                // lustre.g:140:9: (e= rbinop[name,$expr] )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);

                if ((LA17_0 == 23 || LA17_0 == 28 || (LA17_0 >= 35 && LA17_0 <= 50))) {
                    alt17 = 1;
                }
                switch (alt17) {
                case 1:
                    // lustre.g:140:10: e= rbinop[name,$expr]
                {
                    pushFollow(FOLLOW_rbinop_in_expression1181);
                    e = rbinop(name, expr);

                    state._fsp--;

                    expr = e;

                }
                    break;

                }

                match(input, 21, FOLLOW_21_in_expression1188);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return expr;
    }

    // $ANTLR end "expression"

    // $ANTLR start "rbinop"
    // lustre.g:143:1: rbinop[String name, Expression e1] returns [Expression expr] : ( '->' e2=
    // expression[name] | 'when' v= ID | op= binop e2= expression[name] );
    public final Expression rbinop(String name, Expression e1) throws RecognitionException {
        Expression expr = null;

        Token v = null;
        Expression e2 = null;

        Operator op = null;

        try {
            // lustre.g:144:3: ( '->' e2= expression[name] | 'when' v= ID | op= binop e2=
            // expression[name] )
            int alt19 = 3;
            switch (input.LA(1)) {
            case 35: {
                alt19 = 1;
            }
                break;
            case 23: {
                alt19 = 2;
            }
                break;
            case 28:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50: {
                alt19 = 3;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
            case 1:
                // lustre.g:144:5: '->' e2= expression[name]
            {
                match(input, 35, FOLLOW_35_in_rbinop1209);
                pushFollow(FOLLOW_expression_in_rbinop1213);
                e2 = expression(name);

                state._fsp--;

                expr = new Init(name, e1, e2);

            }
                break;
            case 2:
                // lustre.g:145:5: 'when' v= ID
            {
                match(input, 23, FOLLOW_23_in_rbinop1228);
                v = (Token) match(input, ID, FOLLOW_ID_in_rbinop1232);
                expr = new When(name, e1, new VarAccess((v != null ? v.getText() : null)));

            }
                break;
            case 3:
                // lustre.g:146:5: op= binop e2= expression[name]
            {
                pushFollow(FOLLOW_binop_in_rbinop1263);
                op = binop();

                state._fsp--;

                pushFollow(FOLLOW_expression_in_rbinop1267);
                e2 = expression(name);

                state._fsp--;

                expr = new BinOp(name, e1, e2, op);

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return expr;
    }

    // $ANTLR end "rbinop"

    // $ANTLR start "binop"
    // lustre.g:149:1: binop returns [Operator op] : ( 'xor' | '=>' | 'or' | 'and' | '=' | '<>' |
    // '<' | '<=' | '>=' | '>' | '*' | '/' | 'mod' | 'div' | '+' | '-' );
    public final Operator binop() throws RecognitionException {
        Operator op = null;

        try {
            // lustre.g:150:3: ( 'xor' | '=>' | 'or' | 'and' | '=' | '<>' | '<' | '<=' | '>=' | '>'
            // | '*' | '/' | 'mod' | 'div' | '+' | '-' )
            int alt20 = 16;
            switch (input.LA(1)) {
            case 36: {
                alt20 = 1;
            }
                break;
            case 37: {
                alt20 = 2;
            }
                break;
            case 38: {
                alt20 = 3;
            }
                break;
            case 39: {
                alt20 = 4;
            }
                break;
            case 28: {
                alt20 = 5;
            }
                break;
            case 40: {
                alt20 = 6;
            }
                break;
            case 41: {
                alt20 = 7;
            }
                break;
            case 42: {
                alt20 = 8;
            }
                break;
            case 43: {
                alt20 = 9;
            }
                break;
            case 44: {
                alt20 = 10;
            }
                break;
            case 45: {
                alt20 = 11;
            }
                break;
            case 46: {
                alt20 = 12;
            }
                break;
            case 47: {
                alt20 = 13;
            }
                break;
            case 48: {
                alt20 = 14;
            }
                break;
            case 49: {
                alt20 = 15;
            }
                break;
            case 50: {
                alt20 = 16;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
            case 1:
                // lustre.g:150:7: 'xor'
            {
                match(input, 36, FOLLOW_36_in_binop1293);
                op = Operator.XOR;

            }
                break;
            case 2:
                // lustre.g:151:5: '=>'
            {
                match(input, 37, FOLLOW_37_in_binop1302);
                op = Operator.IMPL;

            }
                break;
            case 3:
                // lustre.g:152:5: 'or'
            {
                match(input, 38, FOLLOW_38_in_binop1312);
                op = Operator.OR;

            }
                break;
            case 4:
                // lustre.g:153:6: 'and'
            {
                match(input, 39, FOLLOW_39_in_binop1323);
                op = Operator.AND;

            }
                break;
            case 5:
                // lustre.g:154:5: '='
            {
                match(input, 28, FOLLOW_28_in_binop1332);
                op = Operator.EQ;

            }
                break;
            case 6:
                // lustre.g:155:5: '<>'
            {
                match(input, 40, FOLLOW_40_in_binop1343);
                op = Operator.NEQ;

            }
                break;
            case 7:
                // lustre.g:156:5: '<'
            {
                match(input, 41, FOLLOW_41_in_binop1353);
                op = Operator.LT;

            }
                break;
            case 8:
                // lustre.g:157:5: '<='
            {
                match(input, 42, FOLLOW_42_in_binop1364);
                op = Operator.LE;

            }
                break;
            case 9:
                // lustre.g:158:5: '>='
            {
                match(input, 43, FOLLOW_43_in_binop1374);
                op = Operator.GE;

            }
                break;
            case 10:
                // lustre.g:159:5: '>'
            {
                match(input, 44, FOLLOW_44_in_binop1384);
                op = Operator.GT;

            }
                break;
            case 11:
                // lustre.g:160:5: '*'
            {
                match(input, 45, FOLLOW_45_in_binop1395);
                op = Operator.MUL;

            }
                break;
            case 12:
                // lustre.g:161:5: '/'
            {
                match(input, 46, FOLLOW_46_in_binop1406);
                op = Operator.DIV;

            }
                break;
            case 13:
                // lustre.g:162:5: 'mod'
            {
                match(input, 47, FOLLOW_47_in_binop1417);
                op = Operator.MOD;

            }
                break;
            case 14:
                // lustre.g:163:5: 'div'
            {
                match(input, 48, FOLLOW_48_in_binop1426);
                op = Operator.DIV;

            }
                break;
            case 15:
                // lustre.g:164:5: '+'
            {
                match(input, 49, FOLLOW_49_in_binop1435);
                op = Operator.ADD;

            }
                break;
            case 16:
                // lustre.g:165:5: '-'
            {
                match(input, 50, FOLLOW_50_in_binop1446);
                op = Operator.SUB;

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return op;
    }

    // $ANTLR end "binop"

    // $ANTLR start "constant"
    // lustre.g:168:1: constant[String name] returns [Number val] : ( 'true' | 'false' | n= NUMBER
    // );
    public final Number constant(String name) throws RecognitionException {
        Number val = null;

        Token n = null;

        try {
            // lustre.g:169:3: ( 'true' | 'false' | n= NUMBER )
            int alt21 = 3;
            switch (input.LA(1)) {
            case 51: {
                alt21 = 1;
            }
                break;
            case 52: {
                alt21 = 2;
            }
                break;
            case NUMBER: {
                alt21 = 3;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
            case 1:
                // lustre.g:169:5: 'true'
            {
                match(input, 51, FOLLOW_51_in_constant1480);
                val = new Number(name, true);

            }
                break;
            case 2:
                // lustre.g:170:5: 'false'
            {
                match(input, 52, FOLLOW_52_in_constant1489);
                val = new Number(name, false);

            }
                break;
            case 3:
                // lustre.g:171:5: n= NUMBER
            {
                n = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_constant1499);
                val = new Number(name, Integer.parseInt((n != null ? n.getText() : null)));

            }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
        }
        return val;
    }

    // $ANTLR end "constant"

    // Delegated rules

    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA3_eotS = "\21\uffff";
    static final String DFA3_eofS = "\10\uffff\1\12\10\uffff";
    static final String DFA3_minS = "\1\13\1\4\1\12\1\4\4\14\1\4\2\uffff\1\12\1\4\4\14";
    static final String DFA3_maxS = "\1\13\1\4\1\12\1\22\4\15\1\23\2\uffff\1\12\1\22\4\15";
    static final String DFA3_acceptS = "\11\uffff\1\2\1\1\6\uffff";
    static final String DFA3_specialS = "\21\uffff}>";
    static final String[] DFA3_transitionS = { "\1\1", "\1\2", "\1\3", "\1\7\13\uffff\1\4\1\5\1\6",
            "\1\10\1\11", "\1\10\1\11", "\1\10\1\11", "\1\10\1\11",
            "\1\13\6\uffff\1\12\2\uffff\1\12\4\uffff\1\12", "", "", "\1\14",
            "\1\20\13\uffff\1\15\1\16\1\17", "\1\10\1\11", "\1\10\1\11", "\1\10\1\11", "\1\10\1\11" };

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
        for (int i = 0; i < numStates; i++) {
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
            return "51:1: constDecl : ( 'const' constDeclList ';' | 'const' constDeclList '.' );";
        }
    }

    static final String DFA5_eotS = "\7\uffff";
    static final String DFA5_eofS = "\7\uffff";
    static final String DFA5_minS = "\1\16\1\4\1\14\1\4\2\uffff\1\14";
    static final String DFA5_maxS = "\1\16\1\4\1\17\1\4\2\uffff\1\17";
    static final String DFA5_acceptS = "\4\uffff\1\2\1\1\1\uffff";
    static final String DFA5_specialS = "\7\uffff}>";
    static final String[] DFA5_transitionS = { "\1\1", "\1\2", "\1\5\1\4\1\uffff\1\3", "\1\6", "",
            "", "\1\5\1\4\1\uffff\1\3" };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }

        public String getDescription() {
            return "63:1: typeDecl : ( 'type' typeDeclList ';' | 'type' typeDeclList '.' );";
        }
    }

    static final String DFA11_eotS = "\12\uffff";
    static final String DFA11_eofS = "\12\uffff";
    static final String DFA11_minS = "\1\4\1\12\1\uffff\1\4\4\14\2\uffff";
    static final String DFA11_maxS = "\1\24\1\12\1\uffff\1\22\4\27\2\uffff";
    static final String DFA11_acceptS = "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String DFA11_specialS = "\12\uffff}>";
    static final String[] DFA11_transitionS = { "\1\1\17\uffff\1\2", "\1\3", "",
            "\1\7\13\uffff\1\4\1\5\1\6", "\1\11\10\uffff\1\11\1\uffff\1\10",
            "\1\11\10\uffff\1\11\1\uffff\1\10", "\1\11\10\uffff\1\11\1\uffff\1\10",
            "\1\11\10\uffff\1\11\1\uffff\1\10", "", "" };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }

        public String getDescription() {
            return "104:1: varDecl returns [Variable var] : (v= typedID | v= typedID 'when' c= ID | '(' vs= typedID ')' 'when' c= ID );";
        }
    }

    public static final BitSet FOLLOW_decl_in_prog31 = new BitSet(
            new long[] { 0x0000000000084802L });
    public static final BitSet FOLLOW_constDecl_in_decl44 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_typeDecl_in_decl52 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_nodeDecl_in_decl60 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_typedID82 = new BitSet(
            new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_10_in_typedID84 = new BitSet(
            new long[] { 0x0000000000070010L });
    public static final BitSet FOLLOW_type_in_typedID88 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_11_in_constDecl112 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_constDeclList_in_constDecl114 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_constDecl116 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_11_in_constDecl124 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_constDeclList_in_constDecl126 = new BitSet(
            new long[] { 0x0000000000002000L });
    public static final BitSet FOLLOW_13_in_constDecl128 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_constOneDecl_in_constDeclList144 = new BitSet(
            new long[] { 0x0000000000001002L });
    public static final BitSet FOLLOW_12_in_constDeclList147 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_constOneDecl_in_constDeclList149 = new BitSet(
            new long[] { 0x0000000000001002L });
    public static final BitSet FOLLOW_ID_in_constOneDecl164 = new BitSet(
            new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_10_in_constOneDecl166 = new BitSet(
            new long[] { 0x0000000000070010L });
    public static final BitSet FOLLOW_type_in_constOneDecl168 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_14_in_typeDecl182 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_typeDeclList_in_typeDecl184 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_typeDecl186 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_14_in_typeDecl194 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_typeDeclList_in_typeDecl196 = new BitSet(
            new long[] { 0x0000000000002000L });
    public static final BitSet FOLLOW_13_in_typeDecl198 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_typeOneDecl_in_typeDeclList222 = new BitSet(
            new long[] { 0x0000000000008002L });
    public static final BitSet FOLLOW_15_in_typeDeclList225 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_typeOneDecl_in_typeDeclList227 = new BitSet(
            new long[] { 0x0000000000008002L });
    public static final BitSet FOLLOW_ID_in_typeOneDecl242 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_predefinedType_in_type260 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_type269 = new BitSet(new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_type_in_typeList299 = new BitSet(
            new long[] { 0x0000000000008002L });
    public static final BitSet FOLLOW_15_in_typeList302 = new BitSet(
            new long[] { 0x0000000000070010L });
    public static final BitSet FOLLOW_type_in_typeList304 = new BitSet(
            new long[] { 0x0000000000008002L });
    public static final BitSet FOLLOW_16_in_predefinedType322 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_17_in_predefinedType330 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_18_in_predefinedType339 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_19_in_nodeDecl356 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_ID_in_nodeDecl358 = new BitSet(
            new long[] { 0x0000000000100000L });
    public static final BitSet FOLLOW_20_in_nodeDecl360 = new BitSet(
            new long[] { 0x0000000000100010L });
    public static final BitSet FOLLOW_varDeclList_in_nodeDecl371 = new BitSet(
            new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_21_in_nodeDecl387 = new BitSet(
            new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_22_in_nodeDecl389 = new BitSet(
            new long[] { 0x0000000000100000L });
    public static final BitSet FOLLOW_20_in_nodeDecl391 = new BitSet(
            new long[] { 0x0000000000100010L });
    public static final BitSet FOLLOW_varDeclList_in_nodeDecl402 = new BitSet(
            new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_21_in_nodeDecl416 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_nodeDecl418 = new BitSet(
            new long[] { 0x0000000003000000L });
    public static final BitSet FOLLOW_locals_in_nodeDecl426 = new BitSet(
            new long[] { 0x0000000003000000L });
    public static final BitSet FOLLOW_nodeBody_in_nodeDecl448 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_varDecl_in_varDeclList481 = new BitSet(
            new long[] { 0x0000000000001002L });
    public static final BitSet FOLLOW_12_in_varDeclList518 = new BitSet(
            new long[] { 0x0000000000100010L });
    public static final BitSet FOLLOW_varDecl_in_varDeclList522 = new BitSet(
            new long[] { 0x0000000000001002L });
    public static final BitSet FOLLOW_typedID_in_varDecl556 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_typedID_in_varDecl594 = new BitSet(
            new long[] { 0x0000000000800000L });
    public static final BitSet FOLLOW_23_in_varDecl596 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_ID_in_varDecl600 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_20_in_varDecl624 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_typedID_in_varDecl628 = new BitSet(
            new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_21_in_varDecl630 = new BitSet(
            new long[] { 0x0000000000800000L });
    public static final BitSet FOLLOW_23_in_varDecl632 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_ID_in_varDecl636 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_24_in_locals699 = new BitSet(
            new long[] { 0x0000000000101010L });
    public static final BitSet FOLLOW_varDeclList_in_locals705 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_locals709 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_25_in_nodeBody735 = new BitSet(
            new long[] { 0x000000000C000010L });
    public static final BitSet FOLLOW_equationList_in_nodeBody737 = new BitSet(
            new long[] { 0x0000000004000000L });
    public static final BitSet FOLLOW_26_in_nodeBody739 = new BitSet(
            new long[] { 0x0000000000003002L });
    public static final BitSet FOLLOW_set_in_nodeBody741 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_equation_in_equationList762 = new BitSet(
            new long[] { 0x0000000008000012L });
    public static final BitSet FOLLOW_27_in_equation776 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_equation778 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_equation781 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_equation791 = new BitSet(
            new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_28_in_equation793 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_equation797 = new BitSet(
            new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_12_in_equation800 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_constant_in_expression826 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_expression868 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_29_in_expression920 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression924 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_30_in_expression957 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression961 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_31_in_expression994 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression998 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_20_in_expression1027 = new BitSet(
            new long[] { 0x0000000100000000L });
    public static final BitSet FOLLOW_32_in_expression1029 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression1033 = new BitSet(
            new long[] { 0x0000000200000000L });
    public static final BitSet FOLLOW_33_in_expression1045 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression1049 = new BitSet(
            new long[] { 0x0000000400000000L });
    public static final BitSet FOLLOW_34_in_expression1061 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression1065 = new BitSet(
            new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_21_in_expression1068 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_20_in_expression1133 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_expression1137 = new BitSet(
            new long[] { 0x0007FFF810A00000L });
    public static final BitSet FOLLOW_rbinop_in_expression1181 = new BitSet(
            new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_21_in_expression1188 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_35_in_rbinop1209 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_rbinop1213 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_23_in_rbinop1228 = new BitSet(
            new long[] { 0x0000000000000010L });
    public static final BitSet FOLLOW_ID_in_rbinop1232 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_binop_in_rbinop1263 = new BitSet(
            new long[] { 0x00180000E0100030L });
    public static final BitSet FOLLOW_expression_in_rbinop1267 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_36_in_binop1293 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_37_in_binop1302 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_38_in_binop1312 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_39_in_binop1323 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_28_in_binop1332 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_40_in_binop1343 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_41_in_binop1353 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_42_in_binop1364 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_43_in_binop1374 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_44_in_binop1384 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_45_in_binop1395 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_46_in_binop1406 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_47_in_binop1417 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_48_in_binop1426 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_49_in_binop1435 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_50_in_binop1446 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_51_in_constant1480 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_52_in_constant1489 = new BitSet(
            new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_NUMBER_in_constant1499 = new BitSet(
            new long[] { 0x0000000000000002L });

}
