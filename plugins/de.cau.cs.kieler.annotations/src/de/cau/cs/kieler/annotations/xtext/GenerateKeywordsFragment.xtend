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

import com.google.inject.Inject
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Set
import java.util.function.Consumer
import java.util.regex.Pattern
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtext.xtext.generator.AbstractInheritingFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.AbstractStubGeneratingFragment
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption
import org.eclipse.xtext.xtext.generator.util.GeneratorOption

/** 
 * @author sdo
 * TODO add name and id
 */
class GenerateKeywordsFragment extends AbstractStubGeneratingFragment {

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
        new GuiceModuleAccess.BindingFactory()
            .addTypeToType(new TypeReference('de.cau.cs.kieler.annotations.xtext.IHighlighting'),
                    getHighlightingClass(grammar))
            .contributeTo(language.ideGenModule)        
        
        if (projectConfig.genericIde.manifest !== null) {
            projectConfig.genericIde.manifest.exportedPackages += grammar.genericIdeBasePackage + '.highlighting'
        }
        var xtendFile = doGetXtendStubFile(GrammarUtil.getSimpleName(grammar) + "Highlighting")
        xtendFile?.writeTo(this.getProjectConfig().genericIde.srcGen);
    }

    protected def TypeReference getHighlightingClass(Grammar grammar) {
        return new TypeReference(
            grammar.genericIdeBasePackage + ".highlighting." + GrammarUtil.getSimpleName(grammar) + "Highlighting"
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
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getHighlightingClass(this.grammar));
        xtendFile.resourceSet = language.resourceSet
        val List<String> keywords = getKeywords()
        xtendFile.content = '''
    import java.util.List
    import de.cau.cs.kieler.annotations.xtext.IHighlighting
    
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
