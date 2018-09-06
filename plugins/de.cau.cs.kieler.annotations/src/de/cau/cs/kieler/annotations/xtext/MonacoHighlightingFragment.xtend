/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.xtext

import com.google.inject.Inject
import java.util.ArrayList
import java.util.Collections
import java.util.Set
import java.util.function.Consumer
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption

/**
 * Generates syntax highlighting for Monaco editor.
 * 
 * @author sdo
 * 
 */
class MonacoHighlightingFragment extends AbstractXtextGeneratorFragment {
    
    @Inject FileAccessFactory fileAccessFactory

    String highlightingModuleName

    String highlightingPath

    @Accessors(PUBLIC_GETTER)
    val generateAnnotation = new BooleanGeneratorOption(true)
    
    package String keywordsFilter = "\\w+"

    override void generate() {
        if (highlightingModuleName !== null && highlightingModuleName.endsWith('.ts')) {
            highlightingModuleName = highlightingModuleName.substring(0, highlightingModuleName.length - 3)
        }
        val langId = language.fileExtensions.head
        val hlModName = this.projectConfig.genericIde.name + ".highlighting/" + langId + '-monaco-language'
        
        highlightingPath = hlModName + '.ts'
        this.generateHighlighting(langId)
    }


    def void generateHighlighting(String langId) {
        val Set<String> allKeywords = GrammarUtil.getAllKeywords(this.getGrammar())
        val ArrayList<String> wordKeywords = CollectionLiterals.<String>newArrayList()
        val ArrayList<String> nonWordKeywords = CollectionLiterals.<String>newArrayList()
        val Pattern keywordsFilterPattern = Pattern.compile(this.keywordsFilter)
        val Pattern wordKeywordPattern = Pattern.compile("\\w(.*\\w)?")
        val Function1<String, Boolean> filterKeywords = [String it |
            {
                return Boolean.valueOf(keywordsFilterPattern.matcher(it).matches())
            }
        ]
        val Consumer<String> sortKeywords = [String it |
            {
                var boolean _matches = wordKeywordPattern.matcher(it).matches()
                if (_matches) {
                    wordKeywords.add(it)
                } else {
                    nonWordKeywords.add(it)
                }
            }
        ]
        IterableExtensions.<String>filter(allKeywords, filterKeywords).forEach(sortKeywords)
        Collections.<String>sort(wordKeywords)
        Collections.<String>sort(nonWordKeywords)
        val highlightingFile = fileAccessFactory.createTextFile()
        highlightingFile.path = highlightingPath
        var StringConcatenationClient content = new StringConcatenationClient() {
            override protected void appendTo(TargetStringConcatenation target) {
                target.append(generateLanguageConfiguration);
                target.append(generateMonarchLanguagePrefix(langId))
                target.append(generateKeywordHighlighting(wordKeywords))
                target.append(generateSymbolHighlighting);
                target.append(generateEscapeHighlighting);
                target.append(generateDigitHighlighting);
                target.append(generateBinaryDigitHighlighting);
                target.append(generateHexDigitHighlighting);
                target.append(
                    "// The main tokenizer for our languages\n" + 
                    "    tokenizer: {\n" + "        root: [\n" +
                    "            // identifiers and keywords\n" +
                    "            [/[a-zA-Z_][a-zA-Z_0-9\\-\\.]*/, {\n" + "                cases: {\n" +
                    "                    '@keywords': { token: 'keyword.$0' },\n" +
                    "                    '@default': 'identifier'\n" + "                }\n" +
                    "            }],\n" + "\n" + "            // whitespace\n" +
                    "            { include: '@whitespace' },\n" + "\n" +
                    "            // delimiters and operators\n" +
                    "            [/[{}()\\[\\]]/, '@brackets'],\n" +
                    "            [/[<>](?!@symbols)/, '@brackets'],\n" +
                    "            [/@symbols/, {\n" +
                    "                cases: {\n" +
                    "                    '@default': ''\n" + "                }\n" + "            }],\n" +
                    "\n")
                if (generateAnnotation.get) {
                    target.append(generateAnnotationHighlighting)
                }
                target.append(generateNumberHighlighting);
                target.append(generateWhitespaceHighlighting);
                target.append(generateCommentHighlighting);
                target.append(generateStringHighlighting)
                target.append(generateSingleQuotedStringHighlighting);
                target.append("};");
            }
        }
        highlightingFile.setContent(content)
        // TODO change path
        highlightingFile.writeTo(this.projectConfig.genericIde.srcGen)
    }

    /**
     * Whether syntax highlighting for annotations should be generated. The default is {@code true}.
     */
    def void setGenerateAnnotation(boolean generateAnnotation) {
        this.generateAnnotation.set(generateAnnotation)
    }
    
    def generateLanguageConfiguration() {
        return "export const configuration: monaco.languages.LanguageConfiguration = {\n" +
            "    // the default separators except `@$`\n" +
            "    wordPattern: /(-?\\d*\\.\\d\\w*)|([^\\`\\~\\!\\#\\%\\^\\&\\*\\(\\)\\-\\=\\+\\[\\{\\]\\}\\\\\\|\\;\\:\\'\\\"\\,\\.\\<\\>\\/\\?\\s]+)/g,\n" +
            "    comments: {\n" + "        lineComment: '//',\n" + "        blockComment: ['/*', '*/'],\n" +
            "    },\n" + "    brackets: [['{', '}'], ['[', ']'], ['(', ')']],\n" + "    autoClosingPairs: [\n" +
            "        { open: '\"', close: '\"', notIn: ['string', 'comment'] },\n" +
            "        { open: '\\'', close: '\\'', notIn: ['string', 'comment'] },\n" +
            "        { open: '{', close: '}', notIn: ['string', 'comment'] },\n" +
            "        { open: '[', close: ']', notIn: ['string', 'comment'] },\n" +
            "        { open: '(', close: ')', notIn: ['string', 'comment'] }\n" + "    ]\n" + "};\n"
    }
    
    def generateMonarchLanguagePrefix(String langId) {
        "export const monarchLanguage = <monaco.languages.IMonarchLanguage>{\n" + "\n" +
                        "    tokenPostfix: '." + langId + "',\n" + "\n"
    }
    
    def generateKeywordHighlighting(ArrayList<String> wordKeywords) {
        var keywords = "    keywords: [\n"
        for (String keyword : wordKeywords) {
            keywords += "        '" + keyword + "',\n";
        }
        keywords +="\n" + "    ],\n";
        return keywords
    }
    
    def generateSymbolHighlighting() {
        return "    symbols: /[=><!~?:&|+\\-*\\/\\^%]+/,\n"
    }
    
    def generateEscapeHighlighting() {
        return "    escapes: /\\\\(?:[abfnrtv\\\\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,\n"
    }
    
    def generateDigitHighlighting() {
        return "    digits: /\\d+(_+\\d+)*/,\n" + "    octaldigits: /[0-7]+(_+[0-7]+)*/,\n"
    }
    
    def generateBinaryDigitHighlighting() {
        return "    binarydigits: /[0-1]+(_+[0-1]+)*/,\n"
    }
    
    def generateHexDigitHighlighting() {
        return "    hexdigits: /[[0-9a-fA-F]+(_+[0-9a-fA-F]+)*/,\n"
    }
    
    def generateAnnotationHighlighting() {
        return "            [/@\\s*[a-zA-Z_\\$][\\w\\$]*/, { token: 'annotation', log: 'annotation token: $0' }],\n"
    }
    
    def generateCommentHighlighting() {
        return "        comment: [\n" + "            [/[^\\/*]+/, 'comment'],\n" +
            "            // [/\\/\\*/, 'comment', '@push' ],    // nested comment not allowed :-(\n" +
            "            // [/\\/\\*/,    'comment.invalid' ],    // this breaks block comments in the shape of /* //*/\n" +
            "            [/\\*\\//, 'comment', '@pop'],\n" + "            [/[\\/*]/, 'comment']\n" + "        ],\n" +
            "\n"
    }
    
    def generateStringHighlighting() {
        return "        string: [\n" + "            [/[^\\\\\"]+/, 'string'],\n" +
            "            [/@escapes/, 'string.escape'],\n" + "            [/\\\\./, 'string.escape.invalid'],\n" +
            "            [/\"/, 'string', '@pop']\n" + "        ],\n" + "\n"
    }
    
    def generateNumberHighlighting() {
        return "\n" +
            "            // numbers\n" +
            "            [/(@digits)[eE]([\\-+]?(@digits))?[fFdD]?/, 'number.float'],\n" +
            "            [/(@digits)\\.(@digits)([eE][\\-+]?(@digits))?[fFdD]?/, 'number.float'],\n" +
            "            [/0[xX](@hexdigits)[Ll]?/, 'number.hex'],\n" +
            "            [/0(@octaldigits)[Ll]?/, 'number.octal'],\n" +
            "            [/0[bB](@binarydigits)[Ll]?/, 'number.binary'],\n" +
            "            [/(@digits)[fFdD]/, 'number.float'],\n" +
            "            [/(@digits)[lL]?/, 'number'],\n" + "\n" +
            "            // delimiter: after number because of .\\d floats\n" +
            "            [/[;,.]/, 'delimiter'],\n" + "\n" + "            // strings\n" +
            "            [/\"/, 'string', '@string'],\n" +
            "            [/'/, 'string', '@singleQuotedString'],\n" + "        ],\n" + "\n"
    }
    
    def generateWhitespaceHighlighting() {
        return "        whitespace: [\n" + "            [/[ \\t\\r\\n]+/, ''],\n" +
            "            [/\\/\\*/, 'comment', '@comment'],\n" + "            [/\\/\\/.*$/, 'comment'],\n" +
            "        ],\n" + "\n"
    }
    
    def generateSingleQuotedStringHighlighting() {
        return "        singleQuotedString: [\n" + "            [/[^\\\\']+/, 'string'],\n" +
            "            [/'/, 'string', '@pop']\n" + "        ],\n" + "    },\n"
    }
}
                