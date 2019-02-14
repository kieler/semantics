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
package de.cau.cs.kieler.annotations.xtext

import com.google.inject.Inject
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xtext.generator.AbstractStubGeneratingFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference

/** 
 * Generates a class to initialize a language to be used in a language server.
 * TODO add interface for generated files
 * @author sdo
 * 
 */
class LSSetupFragment extends AbstractStubGeneratingFragment {

    @Inject
    extension XtextGeneratorNaming
    
    @Inject
    FileAccessFactory fileAccessFactory
    
    package String keywordsFilter = "\\w+"

    /** 
     * {@inheritDoc}
     */
    override void generate() {
        val className = GrammarUtil.getSimpleName(grammar) + "LSSetup"
        // register service
        this.projectConfig.genericIde.metaInf.generateFile("services/de.cau.cs.kieler.language.server.ILSSetupContribution",
            grammar.genericIdeBasePackage + "." + className + "Contribution"
        )
        // add destination package to exported packages, add langauge.server to dependencies
        if (projectConfig.genericIde.manifest !== null) {
            projectConfig.genericIde.manifest.exportedPackages += grammar.genericIdeBasePackage
            projectConfig.genericIde.manifest.requiredBundles += "de.cau.cs.kieler.language.server"
        }
        // generate and write LSSetup file
        var xtendFile = doGetXtendStubFile(className)
        xtendFile?.writeTo(this.getProjectConfig().genericIde.srcGen);
        
        // generate and write LSSetupContribution file
        var contribution = doGetXtendStubFileContribution(grammar, className)
        contribution?.writeTo(this.getProjectConfig().genericIde.srcGen);
    }

    protected def TypeReference getLSSetupClass(Grammar grammar, String className) {
        return new TypeReference(
            grammar.genericIdeBasePackage + "." + className
        )
    }

    protected def TypeReference getLSSetupContributionClass(Grammar grammar, String className) {
        return new TypeReference(
            grammar.genericIdeBasePackage + "." + className + "Contribution"
        )
    }

    protected def doGetXtendStubFile(String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getLSSetupClass(this.grammar, className));
        xtendFile.resourceSet = language.resourceSet
        xtendFile.content = '''
    import de.cau.cs.kieler.annotations.xtext.ILSSetup
    
    class «className» implements ILSSetup {
        override doLSSetup() {
            return «GrammarUtil.getSimpleName(grammar)»IdeSetup.doSetup()
        }
    }
        '''
        return xtendFile
    }
    
    def doGetXtendStubFileContribution(Grammar gramamr, String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getLSSetupContributionClass(this.grammar, className));
        xtendFile.resourceSet = language.resourceSet
        xtendFile.content = '''
    import de.cau.cs.kieler.language.server.ILSSetupContribution
    
    class «className»Contribution implements ILSSetupContribution {
        override getLSSetup() {
            return new «className»()
        }
    }
        '''
        return xtendFile
    }
}
