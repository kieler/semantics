/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.scl

import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.Value
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSACacheExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import java.util.Map

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.ssc.ssa.MergeExpressionExtension
import de.cau.cs.kieler.scg.ssc.ssa.IOPreserverExtensions

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSASCG2SSASCL extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg2scl"
    }

    override getName() {
        return "SSA-SCL"
    }

    override getProducedFeatureId() {
        return SSASCLFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------

    @Inject
    extension SSAbasedSCG2SCL trans
    
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SSACoreExtensions

    @Inject
    extension IOPreserverExtensions
    @Inject
    extension SSACacheExtensions
    @Inject
    extension MergeExpressionExtension
    @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension KExpressionsCreateExtensions  
        @Inject
    extension KExpressionsValuedObjectExtensions  
    
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    var Declaration intermediateDecl;
    var idx = 0;
    
    def transform(SCGraph scg, KielerCompilerContext context) {
        trans.context = context
               
        // Remove incompatible ssa annotation in declarations
        scg.declarations.forEach[annotations.clear]
        
        // Convert to Bolleans
        val def = context.getDef(scg)
        val use = context.getUse(scg)
        // TODO what to do with IO ?
        for (decl : scg.declarations.filter[type == ValueType.INT]) {
            // TODO distignuish between ssa decl and normal decl with multiple vars
            if(decl.valuedObjects.filter[!isRegister].forall[it.isBoolDef(def) && it.isBoolUse(use)]) {
                decl.type = ValueType.BOOL
            }
        }
        for (iv : scg.eAllContents.filter(IntValue).toList) {
            iv.replace(createBoolValue(iv.value != 0))
        }
        if (scg.declarations.exists[type != ValueType.BOOL && type != ValueType.PURE]) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contain boolean incompatible types."));
            return scg
        }
        
        // Normalize
        for (e : scg.mergeExpressions.values) {
            e.replace(e.normalize)
        }
        
        // Decompose
        idx = 0;
        intermediateDecl = createDeclaration
        intermediateDecl.type = ValueType.BOOL
        for (n: scg.nodes.immutableCopy) {
            if (n instanceof Assignment) {
                if (n.assignment.needsDecomposition){
                    n.decompose
                }
            }else if (n instanceof Conditional) {
                if (n.condition.needsDecomposition){
                    n.decompose
                }
            }
        }
        if (!intermediateDecl.valuedObjects.empty) {
            scg.declarations.add(intermediateDecl)
        }
        
        // Split IO
        for (iodecl : scg.declarations.filter[input && output].toList) {
            scg.declarations.add(scg.declarations.indexOf(iodecl), createDeclaration => [
                type = iodecl.type
                output = true
                iodecl.output = false
                for (vo : iodecl.valuedObjects) {
                    val oldname = vo.name
                    vo.name = oldname + "i"
                    val ovo = createValuedObject => [
                        name = oldname + "o"
                    ]
                    for (defsite : scg.nodes.filter(Assignment).filter[valuedObject == vo]) {
                        defsite.valuedObject = ovo
                    }
                    valuedObjects += ovo
                }
            ])
        }
        
        // Transform to SCL
        val scl = scg.transformSCGToSCL
        return scl
    }
    
    private def boolean isBoolDef(ValuedObject vo, Map<ValuedObject, Assignment> defs) {
        val def = defs.get(vo)
        return def.assignment.isBoolExp
    }
    
    private def boolean isBoolUse(ValuedObject vo, Multimap<ValuedObject, Node> uses) {
        val usingExp = uses.get(vo)
        if (usingExp.empty) {
            return true
        }
        return usingExp.map[
            it.eContents.filter(Expression).head
        ].forall[isBoolExp]
    }
    
    private def dispatch boolean isBoolExp(IntValue exp) {
        return exp.value == 0 || exp.value == 1
    }
    
    private def dispatch boolean isBoolExp(ValuedObjectReference exp) {
        // FIXME some kind of fixpoint iteration if variables depend on each other
        return true
    }
    
    private def dispatch boolean isBoolExp(BoolValue exp) {
        return true
    }
    
    private def dispatch boolean isBoolExp(FunctionCall exp) {
        return true
    }
    
    private def dispatch boolean isBoolExp(OperatorExpression exp) {
           return exp.operator == OperatorType.EQ ||
                  exp.operator == OperatorType.NE ||
                  exp.operator == OperatorType.LOGICAL_AND ||
                  exp.operator == OperatorType.LOGICAL_OR
    }

    private def boolean needsDecomposition(Expression ex){
       if (ex instanceof ValuedObjectReference || ex instanceof Value) {
           return false
       }
       if (ex instanceof OperatorExpression) {
//           if (ex.subExpressions.size == 1 && !(ex.subExpressions.head.needsDecomposition)) {
//               return false
//           }
            if (ex.operator == OperatorType.PRE) {
                return false
            }
            if (ex.eAllContents.filter(ValuedObjectReference).map[valuedObject.declaration].exists[type == ValueType.PURE]) {
                return false
            }
       }
       return true
    }   
    
    private def createNewIntermediateVariable(){
        // TODO check name clash
        val v = createValuedObject("temp" + (idx++))
        intermediateDecl.valuedObjects.add(v)
        return v
    }
    
    private dispatch def void decompose(Assignment asm){
        val ex = asm.assignment
        if (ex instanceof FunctionCall) {
            for (p : ex.parameters) {
                if (p.expression.needsDecomposition) {
                    val v = createNewIntermediateVariable
                    val a = createAssignment
                    a.valuedObject = v
                    a.assignment = p.expression
                    p.expression = v.reference;
                    (asm.eContainer as SCGraph).nodes += a
                    asm.incoming.immutableCopy.forEach[target = a]
                    a.createControlFlow.target = asm;
                    a.decompose
                }
            }
        }else if (ex instanceof OperatorExpression) {
            for(i : 0..ex.subExpressions.size-1) {
                if (ex.subExpressions.get(i).needsDecomposition) {
                    val v = createNewIntermediateVariable
                    val a = createAssignment
                    a.valuedObject = v
                    a.assignment = ex.subExpressions.get(i)
                    ex.subExpressions.add(i, v.reference);
                    (asm.eContainer as SCGraph).nodes += a
                    asm.incoming.immutableCopy.forEach[target = a]
                    a.createControlFlow.target = asm;
                    a.decompose
                }
            }          
        }
    }
    
    private dispatch def void decompose(Conditional cond){
            val v = createNewIntermediateVariable
            val a = createAssignment
            a.valuedObject = v
            a.assignment = cond.condition
            cond.condition = v.reference;
            (cond.eContainer as SCGraph).nodes += a
            cond.incoming.immutableCopy.forEach[target = a]
            a.createControlFlow.target = cond;
            a.decompose
    }
}
