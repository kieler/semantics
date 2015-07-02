/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import org.yakindu.sct.model.sgraph.SGraphFactory
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextFactory
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.base.base.BaseFactory
import org.yakindu.base.types.TypesFactory
import de.cau.cs.kieler.scl.scl.SclFactory

/**
 * All factories needed for SCL are contained in this extensions.
 * 
 * @author: ssm
 */

class SCLFactoryExtensions {

    def void Debug(String debugString) { System::out.println(debugString) }
 
    def SGraph() { SGraphFactory::eINSTANCE }
    
    def SText() { StextFactory::eINSTANCE }
    
    def SyncGraph() { SyncgraphFactory::eINSTANCE }
    
    def SyncText() { SynctextFactory::eINSTANCE }
    
    def YakinduBase() { BaseFactory::eINSTANCE }
    
    def YakinduTypes() { TypesFactory::eINSTANCE }
 
    def SCL() { SclFactory::eINSTANCE }
    
}