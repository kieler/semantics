/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa.domtree

import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.xtend.lib.annotations.Data

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@Data
class DominatorTreeModel extends EObjectImpl {
    val DominatorTree dominatorTree
}