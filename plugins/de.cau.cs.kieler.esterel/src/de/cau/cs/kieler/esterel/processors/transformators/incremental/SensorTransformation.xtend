/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.SignalReference
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Module
import java.util.HashMap
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class SensorTransformation extends AbstractSCEstDynamicProcessor<Module>  {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.sensor"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Sensor"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Module module) {
        // this map combines an Esterel sensor with the new SCL variable
        val HashMap<Sensor, ValuedObject> newVariables = new HashMap<Sensor, ValuedObject>()
        val sensorDeclarations = module.declarations.filter(SensorDeclaration).toList
        for (decl: sensorDeclarations) {
            for (s : decl.valuedObjects.filter(Sensor)) {
                if (s.type.type !== null) {
                    val variable = createNewUniqueVariable(null)
                    var ValueType newType
                    if (s.type.type != ValueType.PURE) {
                        newType = if (s.type.type == ValueType.DOUBLE) ValueType.FLOAT else s.type.type
                        newVariables.put(s, variable)
                    }
                    else {
                        throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.name)
                    }
                    module.declarations.add(createDeclaration(newType, variable))
                }
                else { 
                    throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.name)
                }
            }
        }
        transformReferences(module, newVariables)
        module.declarations.removeIf[it instanceof SensorDeclaration]
    }
    
    def transformReferences(EObject obj, HashMap<Sensor, ValuedObject> newVariables) {
        val references = obj.eAllContents.filter(SignalReference).toList
        // iterate over all signal references contained in the scope
        // if a reference references a transformed sensor then set the reference to the new variable
        for (ref : references) {
            if (ref.valuedObject instanceof Sensor) {
                val sensor = ref.valuedObject as Sensor
                if (newVariables.containsKey(sensor)) {
                    val newRef = newVariables.get(sensor).createValuedObjectReference
                    val expr = ref.eContainer
                    if ( (expr instanceof OperatorExpression) && 
                         ((expr as OperatorExpression).operator == OperatorType.VAL)
                    ) {
                        expr.replace(newRef)
                    }
                    else {
                        ref.replace(newRef)
                    }
                }
            }
        }
    }
    
}