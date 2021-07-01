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
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import java.util.List

/**
 * @author glu
 *
 */
class ReferenceCallProcessor extends InplaceProcessor<SCGraphs> implements Traceable {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension AnnotationsExtensions
    override getId() {
        "de.cau.cs.kieler.scg.processors.referenceCall"
    }
    
    override getName() {
        "Reference Call"
    }
    
    override process() {
        setModel(model.transformAll)
    }
    
    
    def SCGraphs transformAll(SCGraphs scgs) {
        scgs => [
            it.scgs.forEach[transform]
        ]
    }
    
    def transform(SCGraph scg) {
        val moduleClasses = scg.getModuleClasses
        moduleClasses.forEach[name = "TickData" + name]
    }
    
    protected def List<ClassDeclaration> getModuleClasses(SCGraph scg) {
        return scg.declarations.filter[
            ClassDeclaration.isInstance(it) && hasAnnotation("Module")
        ].map[it as ClassDeclaration].toList
    }
    
}