/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHooks.Type

/** 
 * @author ssm
 */
interface ISynthesisHooks {
    
    /** 
     * Invokes the sart procedures for all hooks.
     * @param scopethe input model.
     * @param nodethe diagram root node
     */    
    def void invokeStart(Scope scope, KNode node)

    /** 
     * Invokes the finish procedures for all hooks.
     * @param scopethe input model.
     * @param nodethe diagram root node
     */
    def void invokeFinish(Scope scope, KNode node)

    /** 
     * Invokes the hook procedures for the given element.
     * @param typethe element type.
     * @param elementthe element
     * @param resultthe translated element
     */
    def void invokeHooks(Type type, EObject element, KGraphElement result)

}
