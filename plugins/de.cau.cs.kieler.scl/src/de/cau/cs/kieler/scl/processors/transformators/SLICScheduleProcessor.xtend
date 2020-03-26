/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scl.processors.transformators

import de.cau.cs.kieler.kicool.compilation.EndogenousProcessor
import de.cau.cs.kieler.scl.SCLProgram
import com.google.inject.Inject
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.kexpressions.ReferenceCall

/**
 * @author ssm
 * @kieler.design 2020-01-25 proposed 
 * @kieler.rating 2020-01-25 proposed yellow
 *
 */
class SLICScheduleProcessor extends EndogenousProcessor<SCLProgram> {
    
    extension SCLFactory = SCLFactory::eINSTANCE
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    
    override getId() {
        "de.cau.cs.kieler.scl.slic.schedule"
    }
    
    override getName() {
        "SLIC Schedule"
    }
    
    override process() {
        val module = model.modules.head

        val statements = <String, Statement> newHashMap
        val parallel = createParallel
        for (s : module.statements.immutableCopy) {
            parallel.threads += createThread => [ it.statements += s ]
            statements.put(s.objectName, s)
        }           
        
        val scheduleDeclaration = createScheduleDeclaration 
        
        for (s : statements.values) {
            val produces = s.getStringAnnotationValues("produces")
            val notHandledBy = s.getStringAnnotationValues("notHandledBy")
            
            for (p : produces + notHandledBy) {
                val target = statements.get(p)
                if (target instanceof Assignment) {
                    scheduleDeclaration.valuedObjects += (s as Assignment).createScheduleTo(target, 0, 1, "p").uniqueName
                }                
            }
        } 
        
        module.statements += parallel
        if (!scheduleDeclaration.valuedObjects.empty) {
            module.declarations += scheduleDeclaration
        }
    }
    
    private def String objectName(Statement s) {
        ((s as Assignment).expression as ReferenceCall).valuedObject.name
    }
    
}