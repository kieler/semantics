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
package de.cau.cs.kieler.scg.klighd.actions

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import org.eclipse.elk.core.klayoutdata.KShapeLayout
import org.eclipse.elk.graph.KPort

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * Action class to display the prio statements in the SCG.
 * @author lpe
 *
 */
class PrioStatementsActions implements IAction {
        
    private static final String PRIO_STATEMENTS_ID    = "de.cau.cs.kieler.scg.klighd.actions.priorityStatements"
    
    @Inject
    extension KRenderingExtensions
//    @Inject
//    extension KPortExtensions
    
    public static final SynthesisOption SHOW_PRIO_STATEMENTS = SynthesisOption::createCheckOption("Priority Statements", 
        true).setUpdateAction(PRIO_STATEMENTS_ID);
    
    
        
    override execute(ActionContext context) {
        val viewContext = context.contextViewer.viewContext
        val rootNode = context.KNode
        for(port : rootNode.eAllContentsOfType(KPort).toIterable) {
            if(port.KContainerRendering != null 
                && port.KContainerRendering.getProperty(SCGraphDiagramSynthesis.PRIO_STATEMENTS_PROPERTY)) {
              if(SHOW_PRIO_STATEMENTS.booleanValue(viewContext)) {
                  port.getData(typeof(KShapeLayout)).setSize(50,20)
                  for(child : port.KContainerRendering.children) {
                      if(child instanceof KRoundedRectangle) {
                          var a = child as KRoundedRectangle
                          for(x : a.children) {
                              x.invisible = false
                          }                          
                      }
                  }
              } else {
                  port.getData(typeof(KShapeLayout)).setSize(0,0)
                  for(child : port.KContainerRendering.children) {
                      if(child instanceof KRoundedRectangle) {
                          var a = child as KRoundedRectangle
                          for(x : a.children) {
                              x.invisible = true
                          }
                      }
                  }
              }
            } 
        }
        
        ActionResult.createResult(true)
        
    }
    
    def booleanValue(SynthesisOption option, ViewContext viewContext) {
        val value = viewContext.getOptionValue(option)
        
        if(value == null) {
            return false
        } else if (value instanceof Boolean) {
            return value as Boolean;

        } else {
            throw new IllegalArgumentException("KLighD transformation option handling: "
                    + "The transformation " + this
                    + " attempted to evaluate the non-Boolean valued transformation option "
                    + option.getName() + " expecting a Boolean value.");
        }
    }
    
    new(){
        Guice.createInjector.injectMembers(this)
    }
    
    
}