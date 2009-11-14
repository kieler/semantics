// $ANTLR 3.1.1 lustre.g 2009-02-10 09:23:39

package de.cau.cs.kieler.krep.compiler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lustreLexer extends Lexer {
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
    public static final int T__16 = 16;
    public static final int T__51 = 51;
    public static final int T__15 = 15;
    public static final int T__52 = 52;
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

    public lustreLexer() {
        ;
    }

    public lustreLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public lustreLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);

    }

    public String getGrammarFileName() {
        return "lustre.g";
    }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:7:7: ( ':' )
            // lustre.g:7:9: ':'
            {
                match(':');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:8:7: ( 'const' )
            // lustre.g:8:9: 'const'
            {
                match("const");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:9:7: ( ';' )
            // lustre.g:9:9: ';'
            {
                match(';');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:10:7: ( '.' )
            // lustre.g:10:9: '.'
            {
                match('.');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:11:7: ( 'type' )
            // lustre.g:11:9: 'type'
            {
                match("type");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:12:7: ( ',' )
            // lustre.g:12:9: ','
            {
                match(',');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:13:7: ( 'bool' )
            // lustre.g:13:9: 'bool'
            {
                match("bool");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:14:7: ( 'int' )
            // lustre.g:14:9: 'int'
            {
                match("int");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:15:7: ( 'real' )
            // lustre.g:15:9: 'real'
            {
                match("real");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:16:7: ( 'node' )
            // lustre.g:16:9: 'node'
            {
                match("node");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:17:7: ( '(' )
            // lustre.g:17:9: '('
            {
                match('(');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:18:7: ( ')' )
            // lustre.g:18:9: ')'
            {
                match(')');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:19:7: ( 'returns' )
            // lustre.g:19:9: 'returns'
            {
                match("returns");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:20:7: ( 'when' )
            // lustre.g:20:9: 'when'
            {
                match("when");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:21:7: ( 'var' )
            // lustre.g:21:9: 'var'
            {
                match("var");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:22:7: ( 'let' )
            // lustre.g:22:9: 'let'
            {
                match("let");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:23:7: ( 'tel' )
            // lustre.g:23:9: 'tel'
            {
                match("tel");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:24:7: ( 'assert' )
            // lustre.g:24:9: 'assert'
            {
                match("assert");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:25:7: ( '=' )
            // lustre.g:25:9: '='
            {
                match('=');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:26:7: ( 'not' )
            // lustre.g:26:9: 'not'
            {
                match("not");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:27:7: ( 'pre' )
            // lustre.g:27:9: 'pre'
            {
                match("pre");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:28:7: ( 'current' )
            // lustre.g:28:9: 'current'
            {
                match("current");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:29:7: ( 'if' )
            // lustre.g:29:9: 'if'
            {
                match("if");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:30:7: ( 'then' )
            // lustre.g:30:9: 'then'
            {
                match("then");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:31:7: ( 'else' )
            // lustre.g:31:9: 'else'
            {
                match("else");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:32:7: ( '->' )
            // lustre.g:32:9: '->'
            {
                match("->");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:33:7: ( 'xor' )
            // lustre.g:33:9: 'xor'
            {
                match("xor");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:34:7: ( '=>' )
            // lustre.g:34:9: '=>'
            {
                match("=>");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:35:7: ( 'or' )
            // lustre.g:35:9: 'or'
            {
                match("or");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:36:7: ( 'and' )
            // lustre.g:36:9: 'and'
            {
                match("and");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:37:7: ( '<>' )
            // lustre.g:37:9: '<>'
            {
                match("<>");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:38:7: ( '<' )
            // lustre.g:38:9: '<'
            {
                match('<');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:39:7: ( '<=' )
            // lustre.g:39:9: '<='
            {
                match("<=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:40:7: ( '>=' )
            // lustre.g:40:9: '>='
            {
                match(">=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:41:7: ( '>' )
            // lustre.g:41:9: '>'
            {
                match('>');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:42:7: ( '*' )
            // lustre.g:42:9: '*'
            {
                match('*');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:43:7: ( '/' )
            // lustre.g:43:9: '/'
            {
                match('/');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:44:7: ( 'mod' )
            // lustre.g:44:9: 'mod'
            {
                match("mod");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:45:7: ( 'div' )
            // lustre.g:45:9: 'div'
            {
                match("div");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:46:7: ( '+' )
            // lustre.g:46:9: '+'
            {
                match('+');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:47:7: ( '-' )
            // lustre.g:47:9: '-'
            {
                match('-');

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:48:7: ( 'true' )
            // lustre.g:48:9: 'true'
            {
                match("true");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:49:7: ( 'false' )
            // lustre.g:49:9: 'false'
            {
                match("false");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "T__52"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:178:4: ( ( Letter | '_' ) ( Letter | Digit | '_' )* )
            // lustre.g:178:6: ( Letter | '_' ) ( Letter | Digit | '_' )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
                        || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

                // lustre.g:178:21: ( Letter | Digit | '_' )*
                loop1: do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);

                    if (((LA1_0 >= '0' && LA1_0 <= '9') || (LA1_0 >= 'A' && LA1_0 <= 'Z')
                            || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                    case 1:
                        // lustre.g:
                    {
                        if ((input.LA(1) >= '0' && input.LA(1) <= '9')
                                || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
                                || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                            input.consume();

                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            recover(mse);
                            throw mse;
                        }

                    }
                        break;

                    default:
                        break loop1;
                    }
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:180:8: ( ( '+' | '-' )? ( Digit )+ )
            // lustre.g:180:10: ( '+' | '-' )? ( Digit )+
            {
                // lustre.g:180:10: ( '+' | '-' )?
                int alt2 = 2;
                int LA2_0 = input.LA(1);

                if ((LA2_0 == '+' || LA2_0 == '-')) {
                    alt2 = 1;
                }
                switch (alt2) {
                case 1:
                    // lustre.g:
                {
                    if (input.LA(1) == '+' || input.LA(1) == '-') {
                        input.consume();

                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }

                }
                    break;

                }

                // lustre.g:180:20: ( Digit )+
                int cnt3 = 0;
                loop3: do {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);

                    if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                    case 1:
                        // lustre.g:180:21: Digit
                    {
                        mDigit();

                    }
                        break;

                    default:
                        if (cnt3 >= 1)
                            break loop3;
                        EarlyExitException eee = new EarlyExitException(3, input);
                        throw eee;
                    }
                    cnt3++;
                } while (true);

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "NUMBER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:182:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+ )
            // lustre.g:182:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
            {
                // lustre.g:182:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\ ' )+
                int cnt4 = 0;
                loop4: do {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);

                    if (((LA4_0 >= '\t' && LA4_0 <= '\n') || (LA4_0 >= '\f' && LA4_0 <= '\r') || LA4_0 == ' ')) {
                        alt4 = 1;
                    }

                    switch (alt4) {
                    case 1:
                        // lustre.g:
                    {
                        if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
                                || (input.LA(1) >= '\f' && input.LA(1) <= '\r')
                                || input.LA(1) == ' ') {
                            input.consume();

                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            recover(mse);
                            throw mse;
                        }

                    }
                        break;

                    default:
                        if (cnt4 >= 1)
                            break loop4;
                        EarlyExitException eee = new EarlyExitException(4, input);
                        throw eee;
                    }
                    cnt4++;
                } while (true);

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lustre.g:184:9: ( 'assert' ( options {greedy=false; } : . )* '\\n' )
            // lustre.g:184:11: 'assert' ( options {greedy=false; } : . )* '\\n'
            {
                match("assert");

                // lustre.g:184:20: ( options {greedy=false; } : . )*
                loop5: do {
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);

                    if ((LA5_0 == '\n')) {
                        alt5 = 2;
                    } else if (((LA5_0 >= '\u0000' && LA5_0 <= '\t') || (LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF'))) {
                        alt5 = 1;
                    }

                    switch (alt5) {
                    case 1:
                        // lustre.g:184:46: .
                    {
                        matchAny();

                    }
                        break;

                    default:
                        break loop5;
                    }
                } while (true);

                match('\n');
                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
        }
    }

    // $ANTLR end "COMMENT"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // lustre.g:186:16: ( '0' .. '9' )
            // lustre.g:186:18: '0' .. '9'
            {
                matchRange('0', '9');

            }

        } finally {
        }
    }

    // $ANTLR end "Digit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // lustre.g:189:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // lustre.g:
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
                        || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();

                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }

            }

        } finally {
        }
    }

    // $ANTLR end "Letter"

    public void mTokens() throws RecognitionException {
        // lustre.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 |
        // T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 |
        // T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 |
        // T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 |
        // T__52 | ID | NUMBER | WHITESPACE | COMMENT )
        int alt6 = 47;
        alt6 = dfa6.predict(input);
        switch (alt6) {
        case 1:
            // lustre.g:1:10: T__10
        {
            mT__10();

        }
            break;
        case 2:
            // lustre.g:1:16: T__11
        {
            mT__11();

        }
            break;
        case 3:
            // lustre.g:1:22: T__12
        {
            mT__12();

        }
            break;
        case 4:
            // lustre.g:1:28: T__13
        {
            mT__13();

        }
            break;
        case 5:
            // lustre.g:1:34: T__14
        {
            mT__14();

        }
            break;
        case 6:
            // lustre.g:1:40: T__15
        {
            mT__15();

        }
            break;
        case 7:
            // lustre.g:1:46: T__16
        {
            mT__16();

        }
            break;
        case 8:
            // lustre.g:1:52: T__17
        {
            mT__17();

        }
            break;
        case 9:
            // lustre.g:1:58: T__18
        {
            mT__18();

        }
            break;
        case 10:
            // lustre.g:1:64: T__19
        {
            mT__19();

        }
            break;
        case 11:
            // lustre.g:1:70: T__20
        {
            mT__20();

        }
            break;
        case 12:
            // lustre.g:1:76: T__21
        {
            mT__21();

        }
            break;
        case 13:
            // lustre.g:1:82: T__22
        {
            mT__22();

        }
            break;
        case 14:
            // lustre.g:1:88: T__23
        {
            mT__23();

        }
            break;
        case 15:
            // lustre.g:1:94: T__24
        {
            mT__24();

        }
            break;
        case 16:
            // lustre.g:1:100: T__25
        {
            mT__25();

        }
            break;
        case 17:
            // lustre.g:1:106: T__26
        {
            mT__26();

        }
            break;
        case 18:
            // lustre.g:1:112: T__27
        {
            mT__27();

        }
            break;
        case 19:
            // lustre.g:1:118: T__28
        {
            mT__28();

        }
            break;
        case 20:
            // lustre.g:1:124: T__29
        {
            mT__29();

        }
            break;
        case 21:
            // lustre.g:1:130: T__30
        {
            mT__30();

        }
            break;
        case 22:
            // lustre.g:1:136: T__31
        {
            mT__31();

        }
            break;
        case 23:
            // lustre.g:1:142: T__32
        {
            mT__32();

        }
            break;
        case 24:
            // lustre.g:1:148: T__33
        {
            mT__33();

        }
            break;
        case 25:
            // lustre.g:1:154: T__34
        {
            mT__34();

        }
            break;
        case 26:
            // lustre.g:1:160: T__35
        {
            mT__35();

        }
            break;
        case 27:
            // lustre.g:1:166: T__36
        {
            mT__36();

        }
            break;
        case 28:
            // lustre.g:1:172: T__37
        {
            mT__37();

        }
            break;
        case 29:
            // lustre.g:1:178: T__38
        {
            mT__38();

        }
            break;
        case 30:
            // lustre.g:1:184: T__39
        {
            mT__39();

        }
            break;
        case 31:
            // lustre.g:1:190: T__40
        {
            mT__40();

        }
            break;
        case 32:
            // lustre.g:1:196: T__41
        {
            mT__41();

        }
            break;
        case 33:
            // lustre.g:1:202: T__42
        {
            mT__42();

        }
            break;
        case 34:
            // lustre.g:1:208: T__43
        {
            mT__43();

        }
            break;
        case 35:
            // lustre.g:1:214: T__44
        {
            mT__44();

        }
            break;
        case 36:
            // lustre.g:1:220: T__45
        {
            mT__45();

        }
            break;
        case 37:
            // lustre.g:1:226: T__46
        {
            mT__46();

        }
            break;
        case 38:
            // lustre.g:1:232: T__47
        {
            mT__47();

        }
            break;
        case 39:
            // lustre.g:1:238: T__48
        {
            mT__48();

        }
            break;
        case 40:
            // lustre.g:1:244: T__49
        {
            mT__49();

        }
            break;
        case 41:
            // lustre.g:1:250: T__50
        {
            mT__50();

        }
            break;
        case 42:
            // lustre.g:1:256: T__51
        {
            mT__51();

        }
            break;
        case 43:
            // lustre.g:1:262: T__52
        {
            mT__52();

        }
            break;
        case 44:
            // lustre.g:1:268: ID
        {
            mID();

        }
            break;
        case 45:
            // lustre.g:1:271: NUMBER
        {
            mNUMBER();

        }
            break;
        case 46:
            // lustre.g:1:278: WHITESPACE
        {
            mWHITESPACE();

        }
            break;
        case 47:
            // lustre.g:1:289: COMMENT
        {
            mCOMMENT();

        }
            break;

        }

    }

    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS = "\2\uffff\1\37\2\uffff\1\37\1\uffff\4\37\2\uffff\4\37\1\63\2\37\1"
            + "\67\2\37\1\74\1\76\2\uffff\2\37\1\101\1\37\3\uffff\10\37\1\113\7"
            + "\37\2\uffff\2\37\2\uffff\1\37\1\130\5\uffff\2\37\1\uffff\4\37\1"
            + "\137\3\37\1\143\1\uffff\3\37\1\147\1\37\1\151\1\152\1\37\1\154\1"
            + "\155\1\37\1\157\1\uffff\1\160\1\161\3\37\1\165\1\uffff\1\166\1\167"
            + "\1\170\1\uffff\1\171\1\37\1\173\1\uffff\1\174\2\uffff\1\37\2\uffff"
            + "\1\176\3\uffff\1\37\1\u0080\1\37\5\uffff\1\37\2\uffff\1\37\1\uffff"
            + "\1\u0084\1\uffff\2\37\1\u0089\1\uffff\1\u008a\1\u008b\1\uffff\1" + "\37\3\uffff";
    static final String DFA6_eofS = "\u008c\uffff";
    static final String DFA6_minS = "\1\11\1\uffff\1\157\2\uffff\1\145\1\uffff\1\157\1\146\1\145\1\157"
            + "\2\uffff\1\150\1\141\1\145\1\156\1\76\1\162\1\154\1\60\1\157\1\162"
            + "\2\75\2\uffff\1\157\1\151\1\60\1\141\3\uffff\1\156\1\162\1\160\1"
            + "\154\1\145\1\165\1\157\1\164\1\60\1\141\1\144\1\145\1\162\1\164"
            + "\1\163\1\144\2\uffff\1\145\1\163\2\uffff\1\162\1\60\5\uffff\1\144"
            + "\1\166\1\uffff\1\154\1\163\1\162\1\145\1\60\1\156\1\145\1\154\1"
            + "\60\1\uffff\1\154\1\165\1\145\1\60\1\156\2\60\1\145\2\60\1\145\1"
            + "\60\1\uffff\2\60\1\163\1\164\1\145\1\60\1\uffff\3\60\1\uffff\1\60"
            + "\1\162\1\60\1\uffff\1\60\2\uffff\1\162\2\uffff\1\60\3\uffff\1\145"
            + "\1\60\1\156\5\uffff\1\156\2\uffff\1\164\1\uffff\1\60\1\uffff\1\164"
            + "\1\163\1\0\1\uffff\2\60\1\uffff\1\0\3\uffff";
    static final String DFA6_maxS = "\1\172\1\uffff\1\165\2\uffff\1\171\1\uffff\1\157\1\156\1\145\1\157"
            + "\2\uffff\1\150\1\141\1\145\1\163\1\76\1\162\1\154\1\76\1\157\1\162"
            + "\1\76\1\75\2\uffff\1\157\1\151\1\71\1\141\3\uffff\1\156\1\162\1"
            + "\160\1\154\1\145\1\165\1\157\1\164\1\172\2\164\1\145\1\162\1\164"
            + "\1\163\1\144\2\uffff\1\145\1\163\2\uffff\1\162\1\172\5\uffff\1\144"
            + "\1\166\1\uffff\1\154\1\163\1\162\1\145\1\172\1\156\1\145\1\154\1"
            + "\172\1\uffff\1\154\1\165\1\145\1\172\1\156\2\172\1\145\2\172\1\145"
            + "\1\172\1\uffff\2\172\1\163\1\164\1\145\1\172\1\uffff\3\172\1\uffff"
            + "\1\172\1\162\1\172\1\uffff\1\172\2\uffff\1\162\2\uffff\1\172\3\uffff"
            + "\1\145\1\172\1\156\5\uffff\1\156\2\uffff\1\164\1\uffff\1\172\1\uffff"
            + "\1\164\1\163\1\uffff\1\uffff\2\172\1\uffff\1\uffff\3\uffff";
    static final String DFA6_acceptS = "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\6\4\uffff\1\13\1\14\14\uffff"
            + "\1\44\1\45\4\uffff\1\54\1\55\1\56\20\uffff\1\34\1\23\2\uffff\1\32"
            + "\1\51\2\uffff\1\37\1\41\1\40\1\42\1\43\2\uffff\1\50\11\uffff\1\27"
            + "\14\uffff\1\35\6\uffff\1\21\3\uffff\1\10\3\uffff\1\24\1\uffff\1"
            + "\17\1\20\1\uffff\1\36\1\25\1\uffff\1\33\1\46\1\47\3\uffff\1\5\1"
            + "\30\1\52\1\7\1\11\1\uffff\1\12\1\16\1\uffff\1\31\1\uffff\1\2\3\uffff"
            + "\1\53\2\uffff\1\57\1\uffff\1\22\1\26\1\15";
    static final String DFA6_specialS = "\u0083\uffff\1\1\4\uffff\1\0\3\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\7\uffff\1\13\1\14\1\31\1\35"
                    + "\1\6\1\24\1\4\1\32\12\40\1\1\1\3\1\27\1\21\1\30\2\uffff\32\37"
                    + "\4\uffff\1\37\1\uffff\1\20\1\7\1\2\1\34\1\23\1\36\2\37\1\10"
                    + "\2\37\1\17\1\33\1\12\1\26\1\22\1\37\1\11\1\37\1\5\1\37\1\16"
                    + "\1\15\1\25\2\37",
            "",
            "\1\42\5\uffff\1\43",
            "",
            "",
            "\1\45\2\uffff\1\46\11\uffff\1\47\6\uffff\1\44",
            "",
            "\1\50",
            "\1\52\7\uffff\1\51",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\61\4\uffff\1\60",
            "\1\62",
            "\1\64",
            "\1\65",
            "\12\40\4\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\73\1\72",
            "\1\75",
            "",
            "",
            "\1\77",
            "\1\100",
            "\12\40",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\114\22\uffff\1\115",
            "\1\116\17\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\153",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\156",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\172",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\175",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\177",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0085",
            "\1\u0086",
            "\60\u0087\12\u0088\7\u0087\32\u0088\4\u0087\1\u0088\1\u0087" + "\32\u0088\uff85\u0087",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\60\u0087\12\u0088\7\u0087\32\u0088\4\u0087\1\u0088\1\u0087" + "\32\u0088\uff85\u0087",
            "", "", "" };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }

        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | ID | NUMBER | WHITESPACE | COMMENT );";
        }

        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch (s) {
            case 0:
                int LA6_136 = input.LA(1);

                s = -1;
                if (((LA6_136 >= '\u0000' && LA6_136 <= '/') || (LA6_136 >= ':' && LA6_136 <= '@')
                        || (LA6_136 >= '[' && LA6_136 <= '^') || LA6_136 == '`' || (LA6_136 >= '{' && LA6_136 <= '\uFFFF'))) {
                    s = 135;
                }

                else if (((LA6_136 >= '0' && LA6_136 <= '9') || (LA6_136 >= 'A' && LA6_136 <= 'Z')
                        || LA6_136 == '_' || (LA6_136 >= 'a' && LA6_136 <= 'z'))) {
                    s = 136;
                }

                else
                    s = 31;

                if (s >= 0)
                    return s;
                break;
            case 1:
                int LA6_131 = input.LA(1);

                s = -1;
                if (((LA6_131 >= '\u0000' && LA6_131 <= '/') || (LA6_131 >= ':' && LA6_131 <= '@')
                        || (LA6_131 >= '[' && LA6_131 <= '^') || LA6_131 == '`' || (LA6_131 >= '{' && LA6_131 <= '\uFFFF'))) {
                    s = 135;
                }

                else if (((LA6_131 >= '0' && LA6_131 <= '9') || (LA6_131 >= 'A' && LA6_131 <= 'Z')
                        || LA6_131 == '_' || (LA6_131 >= 'a' && LA6_131 <= 'z'))) {
                    s = 136;
                }

                else
                    s = 137;

                if (s >= 0)
                    return s;
                break;
            }
            NoViableAltException nvae = new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }

}
