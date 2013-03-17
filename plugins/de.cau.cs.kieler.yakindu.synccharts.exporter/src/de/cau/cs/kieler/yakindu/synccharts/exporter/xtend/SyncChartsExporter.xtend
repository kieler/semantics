package de.cau.cs.kieler.yakindu.synccharts.exporter.xtend

import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.sgraph.Statechart

class SyncChartsExporter {
	
    
    /**
     *  Transform the scc SyncChart to a kixs SyncCharts
     */
    def Region transformStatechart(Statechart sourceRootStatechart) {
    	// The root Region
    	val targetRootRegion = SyncchartsFactory::eINSTANCE.createRegion()
    	// The root State
    	val targetRootState = SyncchartsFactory::eINSTANCE.createState()
    	targetRootState.setLabel(sourceRootStatechart.name)
    	targetRootState.setId(sourceRootStatechart.name)
    	transform(targetRootState,  sourceRootStatechart.regions.get(0).vertices.get(0).eContents)
    	targetRootRegion.states.add(targetRootState)
        targetRootRegion
    }
   /**
    * Transform regions inside a State
    */
	def transform(State targetState, EList<EObject> regions) {
		for (r:regions){
			val org.yakindu.sct.model.sgraph.Region region = r as org.yakindu.sct.model.sgraph.Region
			val targetRegion = SyncchartsFactory::eINSTANCE.createRegion();
			targetRegion.setId(region.name)
			targetRegion.setLabel(region.name)
			transform(targetRegion,region)
			targetState.regions.add(targetRegion)
		}
	}

	/**
 	*	Transform States inside a Region 
 	*/
	def transform(Region targetRegion, org.yakindu.sct.model.sgraph.Region region){
		val vertices = region.vertices
		for(vertex:vertices){
			if(vertex instanceof SyncState){
				val SyncState state = vertex as SyncState
				val targetState = SyncchartsFactory::eINSTANCE.createState;
				targetState.id = state.name
				targetState.label = state.name
				targetState.isInitial = state.isInitial
				targetState.isFinal = state.isFinal
				transformTransition(targetState,state.outgoingTransitions)
				targetRegion.states.add(targetState)
			}
		}
	}
    
    /**
     *  Transform transitions inside a state
     */
    def transformTransition(State targetState, EList<org.yakindu.sct.model.sgraph.Transition> transitions){
    	for(t:transitions){
    		val SyncTransition transition = t as SyncTransition
    		val targetTransition = SyncchartsFactory::eINSTANCE.createTransition;
    		targetTransition.priority = transition.priority
    		targetTransition.isHistory = transition.isHistory
    		targetState.outgoingTransitions.add(targetTransition)
    	}
    }
}