package de.cau.cs.kieler.scg.transformations

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.analyzer.AbstractAnalyzerResult
import java.util.Set

class ShizoTransformation extends AbstractProductionTransformation implements Traceable{
	
	@Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions
	
	override getProducedFeatureId() {
		return SCGFeatures::SHIZO_ID
	}
	
	override getId() {
		return SCGFeatures::SHIZO_ID
	}
	
	override getName() {
        return SCGFeatures::SHIZO_NAME
    }
	
	override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASIC_ID)
    }
	
	public def SCGraph transform(SCGraph scg, KielerCompilerContext context){
		System.out.println("Beginning with shizo curing")
    	val PotentialInstantaneousLoopAnalyzer potentialInstantaneousLoopAnalyzer = Guice.createInjector().
            getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
        val pilData = potentialInstantaneousLoopAnalyzer.analyze(scg)
        context.compilationResult.addAuxiliaryData(pilData)
        
        val nodes = context.compilationResult.getAuxiliaryData(PotentialInstantaneousLoopResult).head.criticalNodes
        
        val entries = nodes.filter(typeof(Entry))//.map[it.getThreadControlFlowTypes].map[it.entrySet]
        
//        for (e : entries){
//        	val filteredEntries = e.threadControlFlowTypes.filter[p1, p2| p2 == ThreadPathType::POTENTIALLY_INSTANTANEOUS].keySet
//        	val traces = filteredEntries.map[it.getInstantaneousControlFlows(it.exit)]
//        	//        	if(e.containsValue(ThreadPathType::POTENTIALLY_INSTANTANEOUS)){
////        	}
//        }
        
        
        
//        val condNodes = nodes.filter(typeof(Conditional)).toList
//        val exitAsChild = condNodes.filter(n | n.then.target instanceof Exit).toList
//		for (n: exitAsChild){
//			val surf = scg.addSurface
//			val depth = scg.addDepth
//			surf.depth = depth
////        			surf.incoming.add()
//			depth.next = n.then
//			n.then = createControlFlow(surf)
//		}
		scg
	}
	
	def insertPause(SCGraph scg, Conditional n){
		
			val surf = scg.addSurface
			val depth = scg.addDepth
			surf.depth = depth
//        			surf.incoming.add()
			depth.next = n.then
			n.then = createControlFlow(surf)
	}
	
	def cureShizoTrace(Entry entry, ControlFlow cFlow){
		
	}
	
	def ControlFlow createControlFlow(Node secondNode) {
        val controlFlow = ScgFactory::eINSTANCE.createControlFlow
        controlFlow.setTarget(secondNode)
        controlFlow
    }
	
	def Surface addSurface(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createSurface
        sCGraph.nodes.add(node)
        node
    }

    def Depth addDepth(SCGraph sCGraph) {
        val node = ScgFactory::eINSTANCE.createDepth
        sCGraph.nodes.add(node)
        node
    }
    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[ eContainer ].filter(typeof(Exit)).map[ entry ]
    }   
	
}
