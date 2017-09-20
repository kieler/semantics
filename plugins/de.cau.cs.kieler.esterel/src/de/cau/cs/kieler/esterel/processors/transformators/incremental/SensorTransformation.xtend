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
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Sensor
import de.cau.cs.kieler.esterel.SensorDeclaration
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.processors.EsterelProcessor
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.Statement
import java.util.HashMap
import java.util.Map

/**
 * @author mrb
 *
 */
class SensorTransformation extends EsterelProcessor {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SENSOR_ID
    }

    override getName() {
        return SCEstTransformation::SENSOR_NAME
    }

//    override getExpandsFeatureId() {
//        return SCEstFeature::SENSOR_ID
//    }
//        
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet( SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::RUN_ID)
//    }

    @Inject
    extension EsterelTransformationExtensions
    @Inject
    extension EsterelExtensions
    
    override EsterelProgram transform(EsterelProgram prog) {
        prog.modules.forEach [ m | m.transformSensors]
        return prog
    }
    
    def transformSensors(Module module) {
        // this map combines an Esterel sensor with the new SCL variable
        var HashMap<Sensor, ValuedObject> newVariables = new HashMap<Sensor, ValuedObject>()
        var ScopeStatement scope = module.getIScope
        for (decl: module.sensorDeclarations) {
            for (s : decl.sensors) {
                if (s.type != null) {
                    var variable = createNewUniqueVariable(null)
                    var ValueType newType
                    if (s.type != ValueType.PURE) {
                        newType = if (s.type == ValueType.DOUBLE) ValueType.FLOAT else s.type.type
                        newVariables.put(s, variable)
                    }
                    else {
                        throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.name)
                    }
                    var newDecl = createDeclaration(newType, variable)
                    newDecl.valuedObjects.add(variable)
                    scope.declarations.add(newDecl)
                }
                else { 
                    throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.name)
                }
            }
        }
        transformReferences(scope, newVariables)
        module.declarations.removeIf[it instanceof SensorDeclaration]
    }
    
    def transformReferences(Statement statement, Map<Sensor, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference).toList
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed sensor then set the reference to the new variable
        for (ref : references) {
            if (ref.valuedObject instanceof Sensor) {
                var vObject = ref.valuedObject as Sensor
                if (newVariables.containsKey(vObject)) {
                    ref.valuedObject = newVariables.get(vObject)
                    removeValueTestOperator(ref.eContainer)
                }
            }
        }
    }
    
}