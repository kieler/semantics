/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.annotations.xtext

import java.util.ArrayList
import java.util.Collections
import java.util.Set
import java.util.function.Consumer
import java.util.regex.Pattern
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xbase.lib.CollectionLiterals
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtext.xbase.lib.IterableExtensions
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TextFileAccess
import com.google.inject.Inject
import org.eclipse.xtext.generator.FileSystemAccessRequest

/**
 * @author sdo
 *
 */
class MonacoHighlightingFragment extends AbstractXtextGeneratorFragment {
    
    String highlightingModuleName
    
    String highlightingPath
    
    override void generate() {
        val String langId=IterableExtensions.<String>head(this.getLanguage().getFileExtensions()) 
        this.generateHighlighting(langId) 
    }
    package String keywordsFilter="\\w+"
    @Inject FileAccessFactory fileAccessFactory
    def void generateHighlighting(String langId) {
        val Set<String> allKeywords=GrammarUtil.getAllKeywords(this.getGrammar()) 
        val ArrayList<String> wordKeywords=CollectionLiterals.<String>newArrayList() 
        val ArrayList<String> nonWordKeywords=CollectionLiterals.<String>newArrayList() 
        val Pattern keywordsFilterPattern=Pattern.compile(this.keywordsFilter) 
        val Pattern wordKeywordPattern=Pattern.compile("\\w(.*\\w)?") 
        val Function1<String, Boolean> filterKeywords=[String it | {
            return Boolean.valueOf(keywordsFilterPattern.matcher(it).matches()) 
        }] 
        val Consumer<String> sortKeywords=[String it | {
            var boolean _matches=wordKeywordPattern.matcher(it).matches() 
            if (_matches) {
                wordKeywords.add(it) 
            } else {
                nonWordKeywords.add(it) 
            }
        }] 
        IterableExtensions.<String>filter(allKeywords, filterKeywords).forEach(sortKeywords) 
        Collections.<String>sort(wordKeywords) 
        Collections.<String>sort(nonWordKeywords) 
        val jsFile = fileAccessFactory.createTextFile()
        jsFile.path = highlightingPath
        var StringConcatenationClient content=new StringConcatenationClient(){
            override protected void appendTo(TargetStringConcatenation target) {
                target.append("export const configuration: monaco.languages.LanguageConfiguration = {\n" + 
                        "    // the default separators except `@$`\n" + 
                        "    wordPattern: /(-?\\d*\\.\\d\\w*)|([^\\`\\~\\!\\#\\%\\^\\&\\*\\(\\)\\-\\=\\+\\[\\{\\]\\}\\\\\\|\\;\\:\\'\\\"\\,\\.\\<\\>\\/\\?\\s]+)/g,\n" + 
                        "    comments: {\n" + 
                        "        lineComment: '//',\n" + 
                        "        blockComment: ['/*', '*/'],\n" + 
                        "    },\n" + 
                        "    brackets: [['{', '}'], ['[', ']'], ['(', ')']],\n" + 
                        "    autoClosingPairs: [\n" + 
                        "        { open: '\"', close: '\"', notIn: ['string', 'comment'] },\n" + 
                        "        { open: '\\'', close: '\\'', notIn: ['string', 'comment'] },\n" + 
                        "        { open: '{', close: '}', notIn: ['string', 'comment'] },\n" + 
                        "        { open: '[', close: ']', notIn: ['string', 'comment'] },\n" + 
                        "        { open: '(', close: ')', notIn: ['string', 'comment'] }\n" + 
                        "    ]\n" + 
                        "};");
                target.append("export const monarchLanguage = <monaco.languages.IMonarchLanguage>{\n" + 
                        "\n" + 
                        "    tokenPostfix: '." + langId + "',\n" + 
                        "\n" + 
                        "    keywords: [\n");
                for (String string : wordKeywords) {
                    target.append("        '");
                    target.append(string);
                    target.append("',\n");
                    
                }
                target.append("\n" + 
                        "    ],\n");
                
//              target.append(
//                      "    operators: [\n" + 
//                      "        '=', '>', '<', '!', ':',\n" + 
//                      "        '==', '<=', '>=', '!=', 'and', 'or',\n" + 
//                      "        '+', '-', '*', '/'\n" + 
//                      "    ],\n"
//                      );
                target.append("    symbols: /[=><!~?:&|+\\-*\\/\\^%]+/,\n" + 
                        "    escapes: /\\\\(?:[abfnrtv\\\\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,\n" + 
                        "    digits: /\\d+(_+\\d+)*/,\n" + 
                        "    octaldigits: /[0-7]+(_+[0-7]+)*/,\n" + 
                        "    binarydigits: /[0-1]+(_+[0-1]+)*/,\n" + 
                        "    hexdigits: /[[0-9a-fA-F]+(_+[0-9a-fA-F]+)*/,");
                target.append("// The main tokenizer for our languages\n" + 
                        "    tokenizer: {\n" + 
                        "        root: [\n" + 
                        "            // identifiers and keywords\n" + 
                        "            [/[a-zA-Z_][a-zA-Z_0-9\\-\\.]*/, {\n" + 
                        "                cases: {\n" + 
                        "                    '@keywords': { token: 'keyword.$0' },\n" + 
                        "                    '@default': 'identifier'\n" + 
                        "                }\n" + 
                        "            }],\n" + 
                        "\n" + 
                        "            // whitespace\n" + 
                        "            { include: '@whitespace' },\n" + 
                        "\n" + 
                        "            // delimiters and operators\n" + 
                        "            [/[{}()\\[\\]]/, '@brackets'],\n" + 
                        "            [/[<>](?!@symbols)/, '@brackets'],\n" + 
                        "            [/@symbols/, {\n" + 
                        "                cases: {\n" + /*
                        "                    '@operators': 'delimiter',\n" + */
                        "                    '@default': ''\n" + 
                        "                }\n" + 
                        "            }],\n" + 
                        "\n")
                target.append("\n" + 
                "                    [/@\\s*[a-zA-Z_\\$][\\w\\$]*/, { token: 'annotation', log: 'annotation token: $0' }],\n" + 
                        "\n" + 
                        "      // numbers" + 
                        "            // numbers\n" + 
                        "            [/(@digits)[eE]([\\-+]?(@digits))?[fFdD]?/, 'number.float'],\n" + 
                        "            [/(@digits)\\.(@digits)([eE][\\-+]?(@digits))?[fFdD]?/, 'number.float'],\n" + 
                        "            [/0[xX](@hexdigits)[Ll]?/, 'number.hex'],\n" + 
                        "            [/0(@octaldigits)[Ll]?/, 'number.octal'],\n" + 
                        "            [/0[bB](@binarydigits)[Ll]?/, 'number.binary'],\n" + 
                        "            [/(@digits)[fFdD]/, 'number.float'],\n" + 
                        "            [/(@digits)[lL]?/, 'number'],\n" + 
                        "\n" + 
                        "            // delimiter: after number because of .\\d floats\n" + 
                        "            [/[;,.]/, 'delimiter'],\n" + 
                        "\n" + 
                        "            // strings\n" + 
                        "            [/\"/, 'string', '@string'],\n" + 
                        "            [/'/, 'string', '@singleQuotedString'],\n" + 
                        "        ],\n" + 
                        "\n" + 
                        "        whitespace: [\n" + 
                        "            [/[ \\t\\r\\n]+/, ''],\n" + 
                        "            [/\\/\\*/, 'comment', '@comment'],\n" + 
                        "            [/\\/\\/.*$/, 'comment'],\n" + 
                        "        ],\n" + 
                        "\n" + 
                        "        comment: [\n" + 
                        "            [/[^\\/*]+/, 'comment'],\n" + 
                        "            // [/\\/\\*/, 'comment', '@push' ],    // nested comment not allowed :-(\n" + 
                        "            // [/\\/\\*/,    'comment.invalid' ],    // this breaks block comments in the shape of /* //*/\n" + 
                        "            [/\\*\\//, 'comment', '@pop'],\n" + 
                        "            [/[\\/*]/, 'comment']\n" + 
                        "        ],\n" + 
                        "\n" + 
                        "        string: [\n" + 
                        "            [/[^\\\\\"]+/, 'string'],\n" + 
                        "            [/@escapes/, 'string.escape'],\n" + 
                        "            [/\\\\./, 'string.escape.invalid'],\n" + 
                        "            [/\"/, 'string', '@pop']\n" + 
                        "        ],\n" + 
                        "\n" + 
                        "        singleQuotedString: [\n" + 
                        "            [/[^\\\\']+/, 'string'],\n" + 
                        "            [/'/, 'string', '@pop']\n" + 
                        "        ],\n" + 
                        "    },\n" + 
                        "};");

            }
        }
        jsFile.setContent(content) 
        // TODO change path
        jsFile.writeTo(this.getProjectConfig().getGenericIde().metaInf) 
    }
}