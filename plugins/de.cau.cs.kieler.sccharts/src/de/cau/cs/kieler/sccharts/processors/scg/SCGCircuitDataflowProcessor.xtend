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
package de.cau.cs.kieler.sccharts.processors.scg

import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsDataflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions
import java.util.HashMap
import com.google.inject.Inject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author kolja
 * 
 */
class SCGCircuitDataflowProcessor extends Processor<SCGraphs, SCCharts> implements Traceable {

    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsDataflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SSACoreExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension PragmaExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension KExtDeclarationExtensions

    public static val SCCHARTS_GENERATED = "sccharts-generated"

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.scg.SCGCircuitDataflow"
    }

    override getName() {
        "CircuitDataflow"
    }

    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }

    override process() {
        val sccharts = createSCChart() => [
            it.pragmas.add(createStringPragma("skinpath", "circuit"))
            for (scg : model.scgs) {
                it.rootStates.add(createState(scg.name) => [
                    val map = <ValuedObject, ValuedObject>newHashMap
                    val nr = it.createDataflowRegion(scg.name)
                    for (v : scg.variableDeclarations.filter[isSSA]) {
                        if (v.valuedObjects.length > 0) {
                            val nv = v.copy
                            var ValuedObject goValue = null
                            for (var i = 0; i < nv.valuedObjects.length; i++) {
                                map.put(v.valuedObjects.get(i), nv.valuedObjects.get(i))
                                if (nv.valuedObjects.get(i).name == "_GO0") {
                                    goValue = nv.valuedObjects.get(i)
                                }
                            }
                            nv.valuedObjects.last.name = nv.ssaOrigVO.name
                            for (vo : nv.valuedObjects) {
                                VariableStore.getVariableStore(environment).update(vo, SCCHARTS_GENERATED)
                            }
                            if (nv.input || nv.output) {
                                it.declarations.add(nv)
                            } else {
                                nr.declarations.add(nv)
                                nv.annotations += createTagAnnotation("hide")
                            }
                            if (nv.valuedObjects.length > 1) {
                                val na = nv.valuedObjects.get(0).createAssignment
                                na.expression = OperatorType.PRE.createOperatorExpression => [
                                    it.subExpressions.add(nv.valuedObjects.last.reference)
                                ]
                                nr.equations.add(na)
                            }
                            if (goValue !== null) {
                                val dec = createBoolDeclaration
                                dec.annotations += createTagAnnotation("hide")
                                val go2 = nr.createValuedObject("preFirstTick", dec)
                                go2.initialValue = TRUE
                                val na = goValue.createAssignment
                                na.expression = OperatorType.NOT.createOperatorExpression => [
                                    it.subExpressions.add(OperatorType.PRE.createOperatorExpression => [
                                        it.subExpressions.add(go2.reference)
                                    ])
                                ]
                                nr.equations.add(na)
                            }
                        }
                    }
                    for (n : scg.nodes) {
                        if (n instanceof Assignment) {
                            nr.equations.add(
                                n.reference.valuedObject.createAssignment(n.expression.copy).transformAssignment(map))
                        }
                    }
                ])
            }
        ]
        for (rs : sccharts.rootStates) {
            val dataflowRegion = rs.regions.get(0) as DataflowRegion
            for (dec : rs.declarations) {
                if (dec.valuedObjects.length > 1) {
                    // split this declaration
                    val localDec = dec.copy()
                    if (localDec instanceof VariableDeclaration) {
                        (localDec as VariableDeclaration).output = false
                        (localDec as VariableDeclaration).input = false
                    }
                    localDec.valuedObjects.clear
                    while (dec.valuedObjects.length > 1)
                        localDec.valuedObjects.add(dec.valuedObjects.get(0))

                    val globalDec = dec.copy();
                    globalDec.valuedObjects.clear
                    globalDec.valuedObjects.add(dec.valuedObjects.get(0))
                    dec.replace(globalDec)
                    for (vo : globalDec.valuedObjects) {
                        VariableStore.getVariableStore(environment).update(vo, SCCHARTS_GENERATED)
                    }
                    dataflowRegion.declarations.add(localDec)
                    localDec.annotations += createTagAnnotation("hide")
                    for (vo : localDec.valuedObjects) {
                        VariableStore.getVariableStore(environment).update(vo, SCCHARTS_GENERATED)
                    }
                }
            }
        }
        setModel(sccharts)
    }

    def transformExpression(Expression e, HashMap<ValuedObject, ValuedObject> variableReplacement) {
        for (ref : e.allReferences) {
            if (variableReplacement.containsKey(ref.valuedObject)) {
                ref.replace(ref.replacedReference(variableReplacement))
            } else {
                ref.valuedObject.addStringAnnotation("error", "The referenced Valued Object does not exists.")
            }
        }
    }

    def transformAssignment(Assignment a, HashMap<ValuedObject, ValuedObject> variableReplacement) {
        if (variableReplacement.containsKey(a.reference.valuedObject)) {
            a.reference.replace(a.reference.replacedReference(variableReplacement))
        } else {
            a.addStringAnnotation("error", "The referenced Valued Object does not exists.")
        }
        a.expression.transformExpression(variableReplacement)
        for (pre : a.eAllContents.toIterable.filter(OperatorExpression).filter[operator == OperatorType.PRE].toList) {
            pre.subExpressions.head.replace(
                (pre.subExpressions.head as ValuedObjectReference).valuedObject.declaration.valuedObjects.last.
                    reference)
        }
        return a
    }

    def ValuedObjectReference replacedReference(ValuedObjectReference old,
        HashMap<ValuedObject, ValuedObject> variableReplacement) {
        if (variableReplacement.containsKey(old.valuedObject)) {
            val ref = variableReplacement.get(old.valuedObject).reference
            for (i : old.indices) {
                ref.indices.add(i.copy)
            }
            if (old.subReference !== null) {
                ref.subReference = replacedReference(old.subReference, variableReplacement)
            }
            return ref
        } else {
            old.valuedObject.addStringAnnotation("warning", "The referenced Valued Object does not exists.")
            return old.copy
        }
    }
}
