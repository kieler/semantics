package de.cau.cs.kieler.synccharts.codegen.dependencies.klighd.xtend

import de.cau.cs.kieler.core.kivi.AbstractCombination
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger
import org.eclipse.emf.ecoretools.diagram.navigator.EcoreDomainNavigatorItem
import de.cau.cs.kieler.klighd.effects.KlighdUpdateDiagramEffect
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies;
import java.util.Collection
import org.eclipse.core.internal.resources.File
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependencies
import de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies
import com.google.inject.Guice
import com.google.inject.Inject
import java.util.ArrayList
import com.google.common.collect.Lists
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Node
import org.eclipse.xtend.util.stdlib.CloningExtensions
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.Dependency
import de.cau.cs.kieler.synccharts.codegen.dependencies.dependency.DependencyFactory



class DependencyDiagramSynthesisCombination extends AbstractCombination {
	
	extension de.cau.cs.kieler.synccharts.codegen.dependencies.xtend.Synccharts2Dependenies Synccharts2Dependenies = Guice::createInjector().getInstance(typeof(Synccharts2Dependenies));

	
	def public void execute(SelectionTrigger$SelectionState triggerState) {
		val selection = triggerState.selectedObjects;


		if (!selection.nullOrEmpty &&
			    selection.size() == 1 && (selection.filter(typeof(State)).size > 0) ) {
			    	// Transform a SyncChart State
			    	var selectionElemenet = selection as Object;
			    	if (selectionElemenet instanceof ArrayList) {
			    		selectionElemenet = (selection as ArrayList).get(0);
			    	}
			    	if (selectionElemenet instanceof State) {
				    	val region = (selectionElemenet as State).parentRegion;
				    	if (region != null) {
					    	region.tranfromSycChartRegionAndScheduleKlightEffect
				    	}
			    	}

			    }


		if (!selection.nullOrEmpty &&
			    selection.size() == 1 && (selection.filter(typeof(Region)).size > 0) ) {
			    	// Transform a SyncChart Region
			    	var selectionElemenet = selection as Object;
			    	if (selectionElemenet instanceof ArrayList) {
			    		selectionElemenet = (selection as ArrayList).get(0);
			    	}
			    	if (selectionElemenet instanceof Region) {
				    	(selectionElemenet as Region).tranfromSycChartRegionAndScheduleKlightEffect
			    	}
			    }

		
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
	}
	
	// ------------------------------------------------------------------------------
	
	def Region findRootRegion(Region region) {
		if (region.parentState == null) {
			return region;
		}
		return findRootRegion(region.parentState.parentRegion);
	}
	
	// ------------------------------------------------------------------------------
	
	
	def tranfromSycChartRegionAndScheduleKlightEffect(Region region) {
			// find root region to make dependency analysis on root region
			val rootRegion = region.findRootRegion;   
		
			// Generate dependencies
			var dependencies = DependencyFactory::eINSTANCE.createDependencies();
			dependencies = Synccharts2Dependenies.transform(dependencies, rootRegion);
			var nodesToDelete = new ArrayList<Node>();
			var dependenciesToDelete = new ArrayList<Dependency>();
			
			var dependenciesClone = CloningExtensions::clone(dependencies) as Dependencies;
			// now filter dependency nodes to only these selected in the region and below
			for (node : dependenciesClone.nodes) {
				val equalStateList = (region.eAllContents.toIterable().filter(typeof(State)).filter(e | e.equals(node.state)));
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
			// actual deletion of nodes and dependencies from dependenciesClone
			for (nodeToDelete : nodesToDelete) {
				dependenciesClone.nodes.remove(nodeToDelete);
			}
			for (dependencyToDelete : dependenciesToDelete) {
				dependenciesClone.dependencies.remove(dependencyToDelete);
			}
			
			
            this.schedule(new KlighdUpdateDiagramEffect(dependenciesClone));
	}
	
}