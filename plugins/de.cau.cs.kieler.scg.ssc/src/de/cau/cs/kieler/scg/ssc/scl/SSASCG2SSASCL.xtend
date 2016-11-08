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
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.StringValue
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
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.features.SSASCLFeature
import de.cau.cs.kieler.scg.ssc.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssc.ssa.MergeExpressionExtension
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import java.util.Map

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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

    @Inject extension RestrictedSCG2SCL transformation
    @Inject extension SSACoreExtensions
    @Inject extension IOPreserverExtensions
    @Inject extension MergeExpressionExtension
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions  
    @Inject extension KExpressionsValuedObjectExtensions  
    
    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    
    def transform(SCGraph scg, KielerCompilerContext context) {
        transformation.context = context
               
        // Remove incompatible ssa annotation in declarations
        scg.declarations.forEach[annotations.clear]
        
        // Convert to booleans
        val def = scg.defs
        val use = scg.uses
        if (scg.declarations.exists[(input || output) && type != ValueType.BOOL && type != ValueType.PURE]) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains non-boolean interface variables!"));
        }
        for (decl : scg.declarations.filter[type == ValueType.INT]) {
            if (decl.valuedObjects.forall[it.isBoolDef(def) && it.isBoolUse(use)]) {
                decl.type = ValueType.BOOL
            }
        }
        for (iv : scg.eAllContents.filter(IntValue).toList) {
            iv.replace(createBoolValue(iv.value != 0))
        }
        if (scg.declarations.exists[type != ValueType.BOOL && type != ValueType.PURE]) {
            context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains boolean incompatible types!"));
        }
        
        // Normalize
        for (e : scg.mergeExpressions.values) {
            if (e.eAllContents.filter(StringValue).exists[!(value.equals("AND") || value.equals("OR") || value.equals("NOT"))]) {
                context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Program contains boolean incompatible combine functions!"))
            }
            e.replace(e.normalize)
        }
        
        // Split IO
        for (iodecl : scg.declarations.filter[input && output].toList) {
            scg.declarations.add(scg.declarations.indexOf(iodecl), createDeclaration => [
                type = iodecl.type
                output = true
                iodecl.output = false
                for (vo : iodecl.valuedObjects) {
                    context.compilationResult.addPostponedWarning(new KielerCompilerException(id, id, "Split up input output variable: " + vo.name));
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
        if (vo.isRegister) {
            return true
        }
        if (defs.containsKey(vo)) {
            return defs.get(vo).assignment.isBoolExp
        }
        return true
    }
    
    private def boolean isBoolUse(ValuedObject vo, Multimap<ValuedObject, Node> uses) {
        if (vo.isRegister) {
            return true
        }
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
                  exp.operator == OperatorType.LOGICAL_OR ||
                  exp.operator == OperatorType.NOT
    }
}
