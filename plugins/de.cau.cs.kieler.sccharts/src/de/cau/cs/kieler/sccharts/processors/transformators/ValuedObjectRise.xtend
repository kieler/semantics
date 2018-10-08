/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * SCCharts ValuedObject Transformation transforming local variables into global ones.
 * 
 * @author cmot, als
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ValuedObjectRise extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.voRise"
    }
    
    override getName() {
        "Valued Object Rise"
    }
 
    override process() {
        setModel(model.transform)
    }

    // -------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsCoreExtensions
    
    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
   
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [rootStates.forEach[transform]]
    }
    
    
    def void transform(State rootState) {
        val voStore = VariableStore.getVariableStore(environment)
        
        // Traverse all states
        for (scope : rootState.allScopes.toIterable) {
            scope.transformExposeLocalValuedObjectCached(rootState, voStore);
        }
    }

    // Traverse all states and transform possible local valuedObjects.
    def void transformExposeLocalValuedObjectCached(Scope scope, Scope targetScope, VariableStore voStore) {
        // Exclude the top level state
        if (scope == targetScope) {
            return;
        }

        var hierarchicalScopeName = targetScope.getHierarchicalName("local")
        for(declaration : scope.declarations.immutableCopy) {
            targetScope.declarations.add(declaration)
            for(valuedObject : declaration.valuedObjects) {
                val oldName = valuedObject.name
                valuedObject.name = "_" + hierarchicalScopeName + "_" + valuedObject.name
                valuedObject.uniqueName
                if (declaration instanceof VariableDeclaration) {
                    if (voStore.variables.containsKey(oldName)) {
                        voStore.update(valuedObject)
                    } else {
                        voStore.add(valuedObject)
                    }
                }
            }
        }
    }

}
