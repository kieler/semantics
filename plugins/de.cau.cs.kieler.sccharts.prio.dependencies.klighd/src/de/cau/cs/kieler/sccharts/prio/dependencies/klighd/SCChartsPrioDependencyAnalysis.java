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
package de.cau.cs.kieler.sccharts.prio.dependencies.klighd;

import com.google.inject.Guice;

import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependencies;
import de.cau.cs.kieler.sccharts.prio.dependencies.xtend.SCCharts2Dependencies;

/**
 * @author cmot
 *
 */
public class SCChartsPrioDependencyAnalysis {

    // the dependencies analysis xtend class
    SCCharts2Dependencies dependencies = 
                        Guice.createInjector().getInstance(SCCharts2Dependencies.class);
    
    
    // ------------------------------------------------------------------------------
    
    Dependencies getDependencies(de.cau.cs.kieler.sccharts.State state) {
        return dependencies.transform(state);
    }
    
    
    // ------------------------------------------------------------------------------
    
//      // ------------------------------------------------------------------------------
//      
//      // If the selection is a state take its parent region, if it is a region take it directly
//      // to trigger a new KlightEffect. Filter the dependency graph according to the selected
//      // objects. If the selection is a file load it and consider the full dependency graph.
//      def public void execute(SelectionTrigger$SelectionState triggerState) {
//              val selection = triggerState.selectedObjects;
//
//              // If this is a file selection then visualize the complete dependency graph
//              if (!selection.nullOrEmpty &&
//                          selection.size() == 1 && (selection.filter(typeof(File)).size > 0) && (selection.get(0) as File).fileExtension.equals("dependency")) {
//                      val modelOSString = (selection.get(0) as File).fullPath.toOSString;
//                      val uri = URI::createPlatformResourceURI(modelOSString, true);
//                      val resource = new ResourceSetImpl().createResource(uri);
//                      resource.load(Collections::EMPTY_MAP);
//                      if (resource != null && !resource.contents.nullOrEmpty) {
//                              val dependencies = resource.contents.get(0) as Dependencies;
//                                      
//                  this.schedule(new KlighdUpdateDiagramEffect(dependencies));
//                              
//                      }
//                              
//              }
//              else {
//                      // build dependency graph according to selection
//                      var allSelectedStates = new ArrayList<State>();
//                      
//                      // if just one element is selected, then interpret this as a recursive selection
//                      var recursive = (selection.size == 1);
//                      
//                      for (selectionItem : selection) {
//                              if (selection != null) {
//                                      if (selection instanceof ArrayList || selection instanceof State || selection instanceof Region) {
//                                              allSelectedStates.addStatesToList(selection, recursive);
//                                      }
//                              }
//                      }
//                      
//                      if (allSelectedStates.size > 0) {
//                      allSelectedStates.tranfromSCChartsRegionAndScheduleKlightEffect
//                      }
//              }
//      }
        
//        // ------------------------------------------------------------------------------
//        
//        // Adds states of state to the stateList
//        def dispatch addStatesToList(List<State> stateList, State state, boolean recursive) {
//                val statesToAdd = state.eAllContents.toIterable().filter(typeof(State)).toList;
//                stateList.add(state);
//                if (statesToAdd.size > 0 && recursive) {
//                        addStatesToList(stateList, statesToAdd, recursive);
//                }
//                stateList;
//        }
//
//        // Adds states of region to the stateList
//        def dispatch addStatesToList(List<State> stateList, Region region, boolean recursive) {
//                val statesToAdd = region.eAllContents.toIterable().filter(typeof(State)).toList;
//                if (statesToAdd.size > 0) {
//                        addStatesToList(stateList, statesToAdd, recursive);
//                }
//                stateList;
//        }
//        
//        // Adds statesToAdd to the stateList
//        def dispatch addStatesToList(List<State> stateList, List statesOrRegionsToAdd, boolean recursive) {
//                for (stateOrRegion : statesOrRegionsToAdd) {
//                        stateList.addStatesToList(stateOrRegion, recursive);
//                }
//                stateList;
//        }
//
//        // Ignores objects when adding something to the stateList
//        def dispatch addStatesToList(List<State> stateList, Object object, boolean recursive) {
//                stateList;
//        }       
//        
//        
//        // Return the root state of a state.
//        def State findRootState(State state) {
//                if (state.parentRegion == null) {
//                        return state;
//                }
//                return findRootState(state.parentRegion.parentState);
//        }
//        
//        // ------------------------------------------------------------------------------
//        
//        // Generate whole dependency graph and shrink it to the selected region
//        // states (and all their children) for visualization.
//        def tranfromSCChartsRegionAndScheduleKlightEffect(List<State> stateList) {
//                        // find root region to make dependency analysis on root region
//                        val rootState = stateList.get(0).findRootState;   
//                
//                        // Generate dependencies
//                        var dependencies = DependencyFactory::eINSTANCE.createDependencies();
//                        dependencies = SCCharts2Dependenies.transform(dependencies, rootState);
//                        var nodesToDelete = new ArrayList<Node>();
//                        var dependenciesToDelete = new ArrayList<Dependency>();
//                        
//                        // now filter dependency nodes to only those selected 
//                        for (node : dependencies.nodes) {
//                                val equalStateList = stateList.filter(typeof(State)).filter(e | e.equals(node.state));
//                                if (equalStateList.nullOrEmpty) {
//                                        nodesToDelete.add(node);
//                                        // delete also all incoming and outgoing dependencies
//                                        for (dependency : node.outgoingDependencies) {
//                                                dependenciesToDelete.add(dependency);
//                                        }
//                                        for (dependency : node.incomingDependencies) {
//                                                dependenciesToDelete.add(dependency);
//                                        }
//                                }
//                        }
//                        // actual deletion of nodes and dependencies from dependencies
//                        for (nodeToDelete : nodesToDelete) {
//                                dependencies.nodes.remove(nodeToDelete);
//                        }
//                        for (dependencyToDelete : dependenciesToDelete) {
//                                dependencies.dependencies.remove(dependencyToDelete);
//                        }
//                        
//                        
////            this.schedule(new KlighdUpdateDiagramEffect(dependencies));
//        }
        
    
}
