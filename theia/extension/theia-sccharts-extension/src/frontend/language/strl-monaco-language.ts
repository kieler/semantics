export const configuration: monaco.languages.LanguageConfiguration = {
    // the default separators except `@$`
    wordPattern: /(-?\d*\.\d\w*)|([^\`\~\!\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g,
    comments: {
        lineComment: '//',
        blockComment: ['/*', '*/'],
    },
    brackets: [['{', '}'], ['[', ']'], ['(', ')']],
    autoClosingPairs: [
        { open: '"', close: '"', notIn: ['string', 'comment'] },
        { open: '\'', close: '\'', notIn: ['string', 'comment'] },
        { open: '{', close: '}', notIn: ['string', 'comment'] },
        { open: '[', close: ']', notIn: ['string', 'comment'] },
        { open: '(', close: ')', notIn: ['string', 'comment'] }
    ]
};export const monarchLanguage = <monaco.languages.IMonarchLanguage>{

    tokenPostfix: '.strl',

    keywords: [
        '_',
        'abort',
        'and',
        'await',
        'bool',
        'boolean',
        'call',
        'case',
        'combine',
        'conflict',
        'confluent',
        'const',
        'constant',
        'copymodule',
        'do',
        'double',
        'each',
        'else',
        'elsif',
        'emit',
        'end',
        'every',
        'exec',
        'exit',
        'expression',
        'extern',
        'float',
        'fork',
        'function',
        'global',
        'goto',
        'halt',
        'handle',
        'host',
        'if',
        'immediate',
        'in',
        'input',
        'inputoutput',
        'int',
        'integer',
        'join',
        'loop',
        'max',
        'min',
        'mod',
        'module',
        'none',
        'not',
        'nothing',
        'or',
        'output',
        'par',
        'pause',
        'positive',
        'pre',
        'present',
        'print',
        'procedure',
        'pure',
        'random',
        'randomize',
        'ref',
        'relation',
        'repeat',
        'return',
        'run',
        'schedule',
        'scope',
        'sensor',
        'signal',
        'static',
        'string',
        'suspend',
        'sustain',
        'task',
        'then',
        'tick',
        'timeout',
        'times',
        'to',
        'trap',
        'type',
        'unsigned',
        'upto',
        'val',
        'var',
        'watching',
        'weak',
        'when',
        'with',

    ],
    symbols: /[=><!~?:&|+\-*\/\^%]+/,
    escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,
    digits: /\d+(_+\d+)*/,
    octaldigits: /[0-7]+(_+[0-7]+)*/,
    binarydigits: /[0-1]+(_+[0-1]+)*/,
    hexdigits: /[[0-9a-fA-F]+(_+[0-9a-fA-F]+)*/,// The main tokenizer for our languages
    tokenizer: {
        root: [
            // identifiers and keywords
            [/[a-zA-Z_][a-zA-Z_0-9\-\.]*/, {
                cases: {
                    '@keywords': { token: 'keyword.$0' },
                    '@default': 'identifier'
                }
            }],

            // whitespace
            { include: '@whitespace' },

            // delimiters and operators
            [/[{}()\[\]]/, '@brackets'],
            [/[<>](?!@symbols)/, '@brackets'],
            [/@symbols/, {
                cases: {
                    '@default': ''
                }
            }],

            [/@\s*[a-zA-Z_\$][\w\$]*/, { token: 'annotation', log: 'annotation token: $0' }],

            // numbers
            [/(@digits)[eE]([\-+]?(@digits))?[fFdD]?/, 'number.float'],
            [/(@digits)\.(@digits)([eE][\-+]?(@digits))?[fFdD]?/, 'number.float'],
            [/0[xX](@hexdigits)[Ll]?/, 'number.hex'],
            [/0(@octaldigits)[Ll]?/, 'number.octal'],
            [/0[bB](@binarydigits)[Ll]?/, 'number.binary'],
            [/(@digits)[fFdD]/, 'number.float'],
            [/(@digits)[lL]?/, 'number'],

            // delimiter: after number because of .\d floats
            [/[;,.]/, 'delimiter'],

            // strings
            [/"/, 'string', '@string'],
            [/'/, 'string', '@singleQuotedString'],
        ],

        whitespace: [
            [/[ \t\r\n]+/, ''],
            [/\/\*/, 'comment', '@comment'],
            [/\/\/.*$/, 'comment'],
        ],

        comment: [
            [/[^\/*]+/, 'comment'],
            // [/\/\*/, 'comment', '@push' ],    // nested comment not allowed :-(
            // [/\/\*/,    'comment.invalid' ],    // this breaks block comments in the shape of /* //*/
            [/\*\//, 'comment', '@pop'],
            [/[\/*]/, 'comment']
        ],

        string: [
            [/[^\\"]+/, 'string'],
            [/@escapes/, 'string.escape'],
            [/\\./, 'string.escape.invalid'],
            [/"/, 'string', '@pop']
        ],

        singleQuotedString: [
            [/[^\\']+/, 'string'],
            [/'/, 'string', '@pop']
        ],
    },
};