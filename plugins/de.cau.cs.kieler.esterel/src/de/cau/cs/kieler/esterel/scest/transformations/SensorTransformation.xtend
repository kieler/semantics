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
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scl.scl.Statement
import com.google.common.collect.Sets
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.Map
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.scl.ScopeStatement
import de.cau.cs.kieler.esterel.esterel.ISignal
import de.cau.cs.kieler.esterel.esterel.Module

/**
 * @author mrb
 *
 */
class SensorTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::SENSOR_ID
    }

    override getName() {
        return SCEstTransformation::SENSOR_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::SENSOR_ID
    }
        
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet( SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::RUN_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
        prog.modules.forEach [ m | m.transformSensors]
        return prog
    }
    
    def transformSensors(Module module) {
        // this map combines an Esterel sensor with the new SCL variable
        var HashMap<ISignal, ValuedObject> newVariables = new HashMap<ISignal, ValuedObject>()
        var ScopeStatement scope = module.getIScope
        for (decl: module.intSensorDecls) {
            for (s : decl.sensors) {
                if (s.type.type != null) {
                    var variable = createNewUniqueVariable(null)
                    var ValueType newType
                    if (s.type.type != ValueType.PURE) {
                        newType = if (s.type.type == ValueType.DOUBLE) ValueType.FLOAT else s.type.type
                        newVariables.put(s.sensor, variable)
                    }
                    else {
                        throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.sensor.name)
                    }
                    var newDecl = createDeclaration(newType, variable)
                    newDecl.valuedObjects.add(variable)
                    scope.declarations.add(newDecl)
                }
                else { 
                    throw new UnsupportedOperationException(
                        "The following sensor doesn't have a valid type for SCL! " + s.sensor.name)
                }
            }
        }
        transformReferences(scope, newVariables)
        module.intSensorDecls.clear
    }
    
    def transformReferences(Statement statement, Map<ISignal, ValuedObject> newVariables) {
        var references = statement.eAllContents.filter(ValuedObjectReference)
        // iterate over all valued object references contained in the scope
        // if a reference references a transformed sensor then set the reference to the new variable
        while (references.hasNext) {
            var ref = references.next
            if (ref.valuedObject instanceof ISignal) {
                var vObject = ref.valuedObject as ISignal
                if (newVariables.containsKey(vObject)) {
                    ref.valuedObject = newVariables.get(vObject)
                    removeValueTestOperator(ref.eContainer)
                }
            }
        }
    }
    
}