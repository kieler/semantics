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
package de.cau.cs.kieler.kicool.external

import org.eclipse.emf.common.util.URI

/**
 * @author als
 */
interface IExternalCompilerProvider {
    
    abstract def String getId()
    
    abstract def URI getRootDir()
    
}
