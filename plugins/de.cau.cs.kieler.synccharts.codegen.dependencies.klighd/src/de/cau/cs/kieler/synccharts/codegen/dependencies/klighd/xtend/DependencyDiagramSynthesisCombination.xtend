/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend

import com.google.inject.Guice
import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger$SelectionState
import de.cau.cs.kieler.klighd.effects.KlighdUpdateDiagramEffect
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
import de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies
import java.util.ArrayList
import java.util.Collections
import org.eclipse.core.internal.resources.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.List



/**
 * KiVi Combination triggering a KlightEffect for a selected SyncChart 
 * 
 * @author cmot
 */
class DependencyDiagramSynthesisCombination extends AbstractCombination {
	
	extension de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies Synccharts2Dependenies = 
			Guice::createInjector().getInstance(typeof(Synccharts2Dependenies));

	// ------------------------------------------------------------------------------
	
	// If the selection is a state take its parent region, if it is a region take it directly
	// to trigger a new KlightEffect. Filter the dependency graph according to the selected
	// objects. If the selection is a file load it and consider the full dependency graph.
	def public void execute(SelectionTrigger$SelectionState triggerState) {
		val selection = triggerState.selectedObjects;

		// If this is a file selection then visualize the complete dependency graph
		if (!selection.nullOrEmpty &&
			    selection.size() == 1 && (selection.filter(typeof(File)).size > 0) && (selection.get(0) as File).fileExtension.equals("dependency")) {
			    	
			val uri = URI::createPlatformResourceURI((selection.get(0) as File).fullPath.toOSString, true);
			val resource = new ResourceSetImpl().createResource(uri);
			resource.load(Collections::EMPTY_MAP);
			if (resource != null && !resource.contents.nullOrEmpty) {
				val dependencies = resource.contents.get(0) as Dependencies;
					
	            this.schedule(new KlighdUpdateDiagramEffect(dependencies));
				
			}
			    	
		}
		else {
			// build dependency graph according to selection
			var allSelectedStates = new ArrayList<State>();
			
			for (selectionItem : selection) {
				allSelectedStates.addStatesToList(selection);
			}
			
			allSelectedStates.tranfromSycChartRegionAndScheduleKlightEffect
		}
	}
	
	// ------------------------------------------------------------------------------
	
	
	// Adds states of state to the stateList
	def dispatch addStatesToList(List<State> stateList, State state) {
		val statesToAdd = state.eAllContents.toIterable().filter(typeof(State)).toList;
		stateList.add(state);
		if (statesToAdd.size > 0) {
			addStatesToList(stateList, statesToAdd);
		}
		stateList;
	}

	// Adds states of region to the stateList
	def dispatch addStatesToList(List<State> stateList, Region region) {
		val statesToAdd = region.eAllContents.toIterable().filter(typeof(State)).toList;
		if (statesToAdd.size > 0) {
			addStatesToList(stateList, statesToAdd);
		}
		stateList;
	}
	
	// Adds statesToAdd to the stateList
	def dispatch addStatesToList(List<State> stateList, List statesOrRegionsToAdd) {
		for (stateOrRegion : statesOrRegionsToAdd) {
			stateList.addStatesToList(stateOrRegion);
		}
		stateList;
	}
	
	// Return the root region of a region.
	def Region findRootRegion(Region region) {
		if (region.parentState == null) {
			return region;
		}
		return findRootRegion(region.parentState.parentRegion);
	}
	
	// ------------------------------------------------------------------------------
	
	// Generate whole dependency graph and shrink it to the selected region
	// states (and all their children) for visualization.
	def tranfromSycChartRegionAndScheduleKlightEffect(List<State> stateList) {
			// find root region to make dependency analysis on root region
			val rootRegion = stateList.get(0).parentRegion.findRootRegion;   
		
			// Generate dependencies
			var dependencies = DependencyFactory::eINSTANCE.createDependencies();
			dependencies = Synccharts2Dependenies.transform(dependencies, rootRegion);
			var nodesToDelete = new ArrayList<Node>();
			var dependenciesToDelete = new ArrayList<Dependency>();
			
			// now filter dependency nodes to only those selected 
			for (node : dependencies.nodes) {
				val equalStateList = stateList.filter(typeof(State)).filter(e | e.equals(node.state));
				if (equalStateList.nullOrEmpty) {
					nodesToDelete.add(node);
					// delete also all incoming and outgoing dependencies
					for (dependency : node.outgoingDependencies) {
						dependenciesToDelete.add(dependency);
					}
					for (dependency : node.incomingDependencies) {
						dependenciesToDelete.add(dependency);
					}
				}
			}
			// actual deletion of nodes and dependencies from dependencies
			for (nodeToDelete : nodesToDelete) {
				dependencies.nodes.remove(nodeToDelete);
			}
			for (dependencyToDelete : dependenciesToDelete) {
				dependencies.dependencies.remove(dependencyToDelete);
			}
			
			
            this.schedule(new KlighdUpdateDiagramEffect(dependencies));
	}
	
}