package de.cau.cs.kieler.yakindu.synccharts.exporter.xtend

import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.sgraph.Choice
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Transition
import de.cau.cs.kieler.synccharts.StateType

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
    	targetRootState.setId("_main_state")
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
			targetRegion.setId("_" + region.name)
			targetRegion.setLabel(region.name)
			transform(targetRegion,region)
			targetState.regions.add(targetRegion)
		}
	}

	/**
 	*	Transform States inside a Region 
 	*/
	def transform(Region targetRegion, org.yakindu.sct.model.sgraph.Region region){
		targetRegion.setId("_" + region.name)
		targetRegion.setLabel(region.name)
		val vertices = region.vertices
		for(vertex:vertices){
			if(vertex instanceof SyncState){
				val SyncState state = vertex as SyncState
				val targetState = SyncchartsFactory::eINSTANCE.createState;
				transform(targetState,state)
				transformTransition(targetState,state.outgoingTransitions)
				targetRegion.states.add(targetState)
			}else if(vertex instanceof Choice){
				val Choice choice = vertex as Choice
				val targetChoice = SyncchartsFactory::eINSTANCE.createState
				targetChoice.setType(StateType::CONDITIONAL)
				targetChoice.id = "_" + choice.name
			}
		}
	}
    
       /**
    * Transform regions inside a State
    */
	def transform(State targetState, SyncState state) {
		targetState.id = "_" + state.name
		targetState.label = state.name
		targetState.isInitial = state.isInitial
		targetState.isFinal = state.isFinal
		for (r:state.regions){
			val org.yakindu.sct.model.sgraph.Region region = r as org.yakindu.sct.model.sgraph.Region
			val targetRegion = SyncchartsFactory::eINSTANCE.createRegion();
			transform(targetRegion,region)
			targetState.regions.add(targetRegion)
		}
	}
    
    /**
     v*  Transform transitions inside a state
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