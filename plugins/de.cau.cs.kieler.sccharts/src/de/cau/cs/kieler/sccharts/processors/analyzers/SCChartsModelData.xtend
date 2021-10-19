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
package de.cau.cs.kieler.sccharts.processors.analyzers

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.Errors
import de.cau.cs.kieler.kicool.environments.Warnings
import de.cau.cs.kieler.kicool.processors.analyzers.AbstractModelDataCollector
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencies
import de.cau.cs.kieler.sccharts.processors.dataflow.RegionDependencySort
import de.cau.cs.kieler.sccharts.text.SCTXResource
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static extension java.lang.String.*

/**
 * @author als
 */
class SCChartsModelData extends AbstractModelDataCollector<SCCharts> {
    
    public static val NAMESPACE = "sccharts."
    public static val SCCHARTS_COUNT = NAMESPACE + "sccharts.count"
    
    public static val STATE_COUNT = NAMESPACE + "state.count"
    public static val STATE_REGIONS = NAMESPACE + "state.maxRegions"
    
    public static val TRANSITION_COUNT = NAMESPACE + "transition.count"
    
    public static val CF_REGION_COUNT = NAMESPACE + "region.controlflow.count"
    public static val DF_REGION_COUNT = NAMESPACE + "region.dataflow.count"
    public static val REGION_DEPTH = NAMESPACE + "region.maxDepth"
    public static val SEQ_REGION_ODER = NAMESPACE + "region.sequentializable"
    
    public static val VAR_COUNT = NAMESPACE + "variables.count"
    public static val IO_VAR_COUNT = NAMESPACE + "variables.io.count"
    
    public static val ENTRY_COUNT = NAMESPACE + "action.entry.count"
    public static val EXIT_COUNT = NAMESPACE + "action.exit.count"
    public static val DURING_COUNT = NAMESPACE + "action.during.count"
    
    public static val DEP_COUNT = NAMESPACE + "dependency.count"
    public static val DEP_CONC_COUNT = NAMESPACE + "dependency.concurrent.count"
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.analyzers.model.data.sccharts"
    }
    
    override getName() {
        "SCCharts Model Data"
    }
    
    override collect(SCCharts model, Map<String, Object> data, String processorID) {
        val sccs = newArrayList
        sccs += model.rootStates
        
        if (!model.imports.empty) {
            val eR = model.eResource
            val eRS = eR?.resourceSet
            if (eR !== null && eRS !== null && eRS.resources.size > 1) {
                for (r : eRS.resources.filter(SCTXResource).filter[it !== eR]) {
                    for (s : r.contents.filter(SCCharts)) {
                        sccs += s.rootStates
                    }
                }
            }
        }
        
        data.put(SCCHARTS_COUNT, sccs.size)
        for (scc : sccs) {
            scc.collect(data)
        }
        
        model.rootStates.head.collectCommunication(sccs, data, processorID)
    }
    
    def collect(State rootState, Map<String, Object> data) {
        val regionDepth = newHashMap
        
        for (scope : rootState.allScopes.toIterable) {
            if (scope instanceof State) {
                data.increment(STATE_COUNT)
                data.max(STATE_REGIONS, scope.regions.size)
                
                data.increase(TRANSITION_COUNT, scope.outgoingTransitions.size)
                
            } else if (scope instanceof Region) {
                if (scope instanceof ControlflowRegion) {
                    data.increment(CF_REGION_COUNT)
                } else if (scope instanceof DataflowRegion) {
                    data.increment(DF_REGION_COUNT)
                }
                
                // Depth
                val parent = scope.parentState?.parentRegion
                regionDepth.put(scope, regionDepth.getOrDefault(parent, 0) + 1)
                
            }
            
            data.increase(VAR_COUNT, scope.declarations.map[valuedObjects].flatten.size)
            data.increase(IO_VAR_COUNT, scope.declarations.filter[input || output].map[valuedObjects].flatten.size)
            
            data.increase(ENTRY_COUNT, scope.actions.filter(EntryAction).size)
            data.increase(EXIT_COUNT, scope.actions.filter(ExitAction).size)
            data.increase(DURING_COUNT, scope.actions.filter(DuringAction).size)
        }
        
        if (!regionDepth.empty) {
            data.put(REGION_DEPTH, regionDepth.values.max)
        }
    }
    
    def collectCommunication(State rootState, List<State> allRootStates, Map<String, Object> data, String processorID) {
        // Create copy
        val container = SCChartsFactory.eINSTANCE.createSCCharts
        val copier = new Copier();
        val main = copier.copy(rootState) as State
        container.rootStates += main
        container.rootStates += allRootStates.filter[rootState !== it].map[copier.copy(it) as State]
        copier.copyReferences()
        
        // Perfom Dependency Analysis
        val depProcessor = KiCoolRegistration.getProcessorInstance(RegionDependencies.ID) as RegionDependencies
        
        val env = new Environment()
        EnvironmentPropertyHolder.copyEnvironment(environment, env)
        env.setProperty(Environment.MODEL, model)
        env.setProperty(Environment.ERRORS, new Errors())
        env.setProperty(Environment.WARNINGS, new Warnings())
        depProcessor.setEnvironment(sourceEnvironment, env)
        
        try {
            depProcessor.process
        } catch (Exception e) {
            environment.warnings.add("SCChartsModelData for %s: Exception in region dependency analysis".format(processorID), e)
            e.printStackTrace
            return
        }
        
        env.warnings.values.flatten.forEach[it.message = "SCChartsModelData for %s (Region Dependencies): %s".format(processorID, it.message)]
        environment.warnings.putAll(env.warnings)
        env.errors.values.flatten.forEach[it.message = "SCChartsModelData for %s (Region Dependencies): %s".format(processorID, it.message)]
        environment.warnings.putAll(env.errors)
        
        val orderProcessor = KiCoolRegistration.getProcessorInstance(RegionDependencySort.ID) as RegionDependencySort
        orderProcessor.setEnvironment(sourceEnvironment, env)
        
        try {
            orderProcessor.process
            data.put(SEQ_REGION_ODER, !env.errors.values.flatten.exists[RegionDependencySort.ERROR_MSG.equals(it.message)])
        } catch (Exception e) {
            environment.warnings.add("SCChartsModelData for %s: Exception in sequential region sorter".format(processorID), e)
            e.printStackTrace
            return
        }
        
        main.collectCommunication(container.rootStates, depProcessor.dependencies, data)
    }
    
    def void collectCommunication(State rootState, List<State> allRootStates, List<Dependency> dependencies, Map<String, Object> data) {
        data.put(DEP_COUNT, dependencies.size)
        data.put(DEP_CONC_COUNT, dependencies.filter(DataDependency).filter[concurrent].size)
    }
    
}
