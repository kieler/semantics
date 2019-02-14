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
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xtext.generator.AbstractStubGeneratingFragment
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption

/** 
 * Generates a class to initialize a language to be used in a language server.
 * TODO add interface for generated files
 * @author sdo
 * 
 */
class LSSetupFragment extends AbstractStubGeneratingFragment {

    @Accessors(PUBLIC_GETTER)
    val generateServiceLoader = new BooleanGeneratorOption(true)

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
        if (generateServiceLoader.get) {
            // register service
            this.projectConfig.genericIde.metaInf.generateFile(
                "services/de.cau.cs.kieler.language.server.ILSSetupContribution",
                grammar.genericIdeBasePackage + "." + className + "Contribution"
            )
        }
        // add destination package to exported packages, add langauge.server to dependencies
        if (projectConfig.genericIde.manifest !== null) {
            projectConfig.genericIde.manifest.exportedPackages += grammar.genericIdeBasePackage
            if (generateServiceLoader.get) {
                projectConfig.genericIde.manifest.requiredBundles += "de.cau.cs.kieler.language.server"
            }
        }
        // generate and write LSSetup file
        var xtendFile = doGetXtendStubFile(className)
        xtendFile?.writeTo(this.getProjectConfig().genericIde.srcGen);
        if (generateServiceLoader.get) {
            // generate and write LSSetupContribution file
            var contribution = doGetXtendStubFileContribution(className)
            contribution?.writeTo(this.getProjectConfig().genericIde.srcGen);
        }
    }

    protected def TypeReference getLSSetupClass(String className) {
        return new TypeReference(
            this.grammar.genericIdeBasePackage + "." + className
        )
    }

    protected def TypeReference getLSSetupContributionClass(String className) {
        return new TypeReference(
            this.grammar.genericIdeBasePackage + "." + className + "Contribution"
        )
    }

    protected def doGetXtendStubFile(String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getLSSetupClass(className));
        xtendFile.resourceSet = language.resourceSet
        xtendFile.content = '''
            import de.cau.cs.kieler.annotations.xtext.ILSSetup
            
            class «className» implements ILSSetup {
                override doLSSetup() {
                    return «GrammarUtil.getSimpleName(this.grammar)»IdeSetup.doSetup()
                }
            }
        '''
        return xtendFile
    }

    def doGetXtendStubFileContribution(String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getLSSetupContributionClass(className));
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
