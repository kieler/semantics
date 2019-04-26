/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.processors.dependencies

import de.cau.cs.kieler.kexpressions.keffects.Linkable
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 *
 */
interface ITarjanFilter {
    
    def List<Linkable> getLinkableNodes(EObject rootObject)
    
    def void filterNeighbors(Linkable node, List<Linkable> neighborList)
    
}