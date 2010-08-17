/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.datadistributor;

import de.cau.cs.kieler.core.alg.IKielerProgressMonitor;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kiml.ILayoutListener;

/**
 * @author jjc
 *
 */
public class LayoutListenerImpl implements ILayoutListener {

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kiml.ILayoutListener#layoutRequested(de.cau.cs.kieler.core.kgraph.KNode)
     */
    public void layoutRequested(KNode layoutGraph) {
        //not used by kvid, ignored
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kiml.ILayoutListener#layoutPerformed(de.cau.cs.kieler.core.kgraph.KNode, de.cau.cs.kieler.core.alg.IKielerProgressMonitor)
     */
    public void layoutPerformed(KNode layoutGraph,
            IKielerProgressMonitor monitor) {
        DataDistributor.getInstance().layoutChanged(layoutGraph);
    }

}
