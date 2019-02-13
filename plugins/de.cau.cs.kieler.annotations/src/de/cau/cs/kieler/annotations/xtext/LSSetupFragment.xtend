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
//        new GuiceModuleAccess.BindingFactory()
//            .addTypeToType(new TypeReference('de.cau.cs.kieler.annotations.xtext.<TODO use interface>'),
//                    getHighlightingClass(grammar))
//            .contributeTo(language.ideGenModule)        
        
        if (projectConfig.genericIde.manifest !== null) {
            projectConfig.genericIde.manifest.exportedPackages += grammar.genericIdeBasePackage
        }
        var xtendFile = doGetXtendStubFile(GrammarUtil.getSimpleName(grammar) + "LSSetup")
        xtendFile?.writeTo(this.getProjectConfig().genericIde.srcGen);
    }

    protected def TypeReference getHighlightingClass(Grammar grammar) {
        return new TypeReference(
            grammar.genericIdeBasePackage + "." + GrammarUtil.getSimpleName(grammar) + "LSSetup"
        )
    }

    protected def doGetXtendStubFile(String className) {
        var xtendFile = this.fileAccessFactory.createXtendFile(this.getHighlightingClass(this.grammar));
        xtendFile.resourceSet = language.resourceSet
        xtendFile.content = '''
    import com.google.inject.Injector
    
    class «className» /* implements <TODO interface> */ {
        def static Injector doLSSetup() {
            return «GrammarUtil.getSimpleName(grammar)»IdeSetup.doSetup()
        }
    }
        '''
        return xtendFile
    }
}
