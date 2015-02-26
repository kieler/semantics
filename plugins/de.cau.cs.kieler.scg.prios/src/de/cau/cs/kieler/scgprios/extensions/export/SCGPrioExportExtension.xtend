/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgprios.extensions.export

import de.cau.cs.kieler.scgprios.extensions.CommonExtension
import java.util.LinkedList
import de.cau.cs.kieler.scg.Node

/**
 * This class provides methods, which are also used by the de.cau.cs.kieler.scg.prios.sclp
 * package
 * 
 * @author cbu
 *
 */
class SCGPrioExportExtension {
    
    private var commonExt = new CommonExtension
    
    /**
     * Returns all children of a node (including depth nodes).
     * This function is used to navigate on an SCG
     * 
     * @param node
     *          node in question
     * @return 
     *          list of child nodes  (including depth nodes)
     */
    def LinkedList<Node> getAllChildrenOfNode(Node node) {
        commonExt.getAllChildrenOfNode(node)

    }
    
}