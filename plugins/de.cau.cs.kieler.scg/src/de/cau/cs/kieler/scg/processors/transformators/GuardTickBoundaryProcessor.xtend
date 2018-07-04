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
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.List

/**
 * @author ssm
 * @kieler.design 2018-07-04 proposed 
 * @kieler.rating 2018-07-04 proposed yellow
 *
 */
class GuardTickBoundaryProcessor extends InplaceProcessor<SCGraphs> implements Traceable {
        
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGCacheExtensions
    @Inject extension SCGDependencyExtensions    
    @Inject extension KExpressionsDeclarationExtensions       
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions 
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.guards.tickBoundaries"
    }
    
    override getName() {
        "Tick Boundaries"
    }
    
    override process() {
        val scgs = getModel
        for (scg : scgs.scgs) {
            scg.addTickBoundaryDependencies
        }
    }
    
    def addTickBoundaryDependencies(SCGraph scg) {
        val assignments = scg.nodes.filter(Assignment).toList
        val voAssMapping = <ValuedObject, Assignment> newHashMap => [ map |
            assignments.filter[ reference !== null ].forEach[ map.put(it.reference.valuedObject, it) ]
        ]
        
        val preAssignments = assignments.filter[ expression.isPreOpExp ].toList
        
        for (preAss : preAssignments) {
            val pgs = preAss.expression.getAllPreOperatorExpressions
            
            for (pg : pgs) {
                
            }
        }
    }
    
    private def isPreOpExp(Expression expression) {
        return expression.getAllPreOperatorExpressions.size > 0
    }
    
    private def List<OperatorExpression> getAllPreOperatorExpressions(Expression expression) {
        val result = <OperatorExpression> newLinkedList
        if ((expression instanceof OperatorExpression) && ((expression as OperatorExpression).operator == OperatorType.PRE)) {
            result += expression as OperatorExpression
        } else {
            if (expression instanceof OperatorExpression) {
                for (se : expression.subExpressions) {
                    result.addAll(se.getAllPreOperatorExpressions)
                }
            }
        }
        return result
    }
    
}