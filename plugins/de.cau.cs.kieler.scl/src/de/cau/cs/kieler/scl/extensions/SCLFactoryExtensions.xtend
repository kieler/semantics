package de.cau.cs.kieler.scl.extensions

import org.yakindu.sct.model.sgraph.SGraphFactory
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import org.yakindu.sct.model.stext.stext.StextFactory
import de.cau.cs.kieler.scl.scl.SclFactory

class SCLFactoryExtensions {

    def void Debug(String debugString) { System::out.println(debugString) }
 
    def SGraph() { SGraphFactory::eINSTANCE }
    
    def SText() { StextFactory::eINSTANCE }
    
    def SyncGraph() { SyncgraphFactory::eINSTANCE }
    
    def SyncText() { SynctextFactory::eINSTANCE }
    
    def SCCExp() { SCChartsExpFactory::eINSTANCE }
 
    def SCL() { SclFactory::eINSTANCE }
    
}