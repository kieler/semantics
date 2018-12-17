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
};
export const monarchLanguage = <monaco.languages.IMonarchLanguage>{

    tokenPostfix: '.kgt',

    keywords: [
        'absolutePos',
        'actions',
        'anchor',
        'areaData',
        'background',
        'bevel',
        'bold',
        'bottom',
        'bottomRightAnchor',
        'center',
        'chord',
        'clipShape',
        'columns',
        'custom',
        'dash',
        'dashOffset',
        'dashPattern',
        'decoratorData',
        'dot',
        'double',
        'doubleClick',
        'error',
        'flat',
        'flexibleHeight',
        'flexibleWidth',
        'fontName',
        'fontSize',
        'foreground',
        'grid',
        'gridData',
        'hAlign',
        'height',
        'horizontalAlignment',
        'horizontalMargin',
        'insets',
        'invisible',
        'italic',
        'junction',
        'karc',
        'kchildArea',
        'kcustomRendering',
        'kedge',
        'kellipse',
        'kgraph',
        'kimage',
        'klabel',
        'knode',
        'kpolygon',
        'kpolyline',
        'kport',
        'krectangle',
        'krendering',
        'krenderingLibrary',
        'kroundedPolyline',
        'kroundedRectangle',
        'kspline',
        'kstylesTemplate',
        'ktext',
        'left',
        'lineCap',
        'lineJoin',
        'lineStyle',
        'lineWidth',
        'link',
        'middleDoubleClick',
        'middleSingleClick',
        'middleSingleOrMultiClick',
        'minCellHeight',
        'minCellWidth',
        'minimalHeight',
        'minimalWidth',
        'miter',
        'modifier',
        'none',
        'null',
        'open',
        'pie',
        'pointData',
        'points',
        'pos',
        'propagate',
        'properties',
        'reference',
        'referencePoint',
        'relativePos',
        'right',
        'rotateWithLine',
        'rotation',
        'round',
        'scale',
        'selection',
        'shadow',
        'single',
        'singleClick',
        'singleOrMultiClick',
        'size',
        'solid',
        'square',
        'squiggle',
        'styles',
        'top',
        'topLeftAnchor',
        'underline',
        'vAlign',
        'verticalAlignment',
        'verticalMargin',
        'width',
        'x',
        'xoffset',
        'y',
        'yoffset',

    ],
    symbols: /[=><!~?:&|+\-*\/\^%]+/,
    escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,
    digits: /\d+(_+\d+)*/,
    octaldigits: /[0-7]+(_+[0-7]+)*/,
    binarydigits: /[0-1]+(_+[0-1]+)*/,
    hexdigits: /[[0-9a-fA-F]+(_+[0-9a-fA-F]+)*/,
// The main tokenizer for our languages
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