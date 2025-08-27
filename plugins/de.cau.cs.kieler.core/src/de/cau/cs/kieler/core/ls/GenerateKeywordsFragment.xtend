/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.ls

import com.google.inject.Inject
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import java.util.function.Consumer
import java.util.regex.Pattern
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtext.xtext.generator.AbstractStubGeneratingFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption

/** 
 * Generates a class implementing {@link IHighlighting IHighlighting} with getters for 
 * id, name, and keywords of this language.
 * 
 * @author sdo
 * 
 */
class GenerateKeywordsFragment extends AbstractStubGeneratingFragment {

    @Accessors(PUBLIC_GETTER)
    val generateServiceLoader = new BooleanGeneratorOption(true)

    @Inject
    extension XtextGeneratorNaming
    @Inject extension GrammarAccessExtensions

    @Inject
    FileAccessFactory fileAccessFactory

    package String keywordsFilter = "\\w+"

    /** 
     * {@inheritDoc}
     */
    override void generate() {
        var className = GrammarUtil.getSimpleName(grammar) + "Highlighting"
        if (generateServiceLoader.get) {
            // register service
            this.projectConfig.genericIde.metaInf.generateFile(
                "services/de.cau.cs.kieler.core.ls.IHighlighting",
                grammar.genericIdeBasePackage + ".highlighting." + className
            )
        }
        // add destination package to exported packages
        if (projectConfig.genericIde.manifest !== null) {
            projectConfig.genericIde.manifest.exportedPackages += grammar.genericIdeBasePackage + '.highlighting'
        }
        // generate and write highlighting file
        var xtendFile = doGetXtendStubFile(className)
        xtendFile?.writeTo(this.getProjectConfig().genericIde.srcGen);
    }

    protected def TypeReference getHighlightingClass(String className) {
        return new TypeReference(
            grammar.genericIdeBasePackage + ".highlighting." + className
        )
    }

    private def getKeywords() {
        val Set<String> allKeywords = GrammarUtil.getAllKeywords(this.getGrammar())
        val ArrayList<String> wordKeywords = CollectionLiterals.<String>newArrayList()
        val Pattern keywordsFilterPattern = Pattern.compile(this.keywordsFilter)
        val Pattern wordKeywordPattern = Pattern.compile("\\w(.*\\w)?")
        val Function1<String, Boolean> filterKeywords = [ String it |
            {
                return Boolean.valueOf(keywordsFilterPattern.matcher(it).matches())
            }
        ]
        val Consumer<String> sortKeywords = [ String it |
            {
                var boolean _matches = wordKeywordPattern.matcher(it).matches()
                if (_matches) {
                    wordKeywords.add(it)
                }
            }
        ]
        IterableExtensions.<String>filter(allKeywords, filterKeywords).forEach(sortKeywords)
        Collections.<String>sort(wordKeywords)
        return wordKeywords
    }

    protected def doGetXtendStubFile(String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getHighlightingClass(className));
        xtendFile.resourceSet = language.resourceSet
        val List<String> keywords = getKeywords()
        xtendFile.content = '''
            import de.cau.cs.kieler.core.ls.IHighlighting
            import java.util.List
            
            class «className» implements IHighlighting {
                override String getId() {
                    return "«language.fileExtensions.head»" // assume that only one extension is present
                }
                override String getName() {
                    return "«GrammarUtil.getSimpleName(grammar)»"
                }
                override List<String> getKeywords() {
                    return «prettyPrintKeywords(keywords)»
                }
            }
        '''
        return xtendFile
    }

    /**
     * Gets list of keywords and returns them in form of a xtend list e.g. #["foo","bar"]
     */
    private def prettyPrintKeywords(List<String> keywords) {
        val StringBuilder string = new StringBuilder()
        string.append("#[")
        keywords.forEach [ keyword, index |
            string.append("\"")
            string.append(keyword)
            if (index == keywords.length - 1) {
                string.append("\"\n")
            } else {
                string.append("\",\n")
            }
        ]
        string.append("]")
        return string
    }
}
