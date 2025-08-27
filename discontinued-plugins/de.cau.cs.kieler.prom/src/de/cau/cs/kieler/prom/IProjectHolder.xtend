/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom

import org.eclipse.core.resources.IProject

/**
 * Interface to dynamically get a project from an object.
 * 
 * @author aas
 */
interface IProjectHolder {
    /**
     * Returns the project associated with this object.
     * 
     * @return the project
     */
    def IProject getProject()
}