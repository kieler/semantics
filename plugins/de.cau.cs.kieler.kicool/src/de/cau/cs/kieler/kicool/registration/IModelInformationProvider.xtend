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
package de.cau.cs.kieler.kicool.registration

/**
 * @author als
 */
interface IModelInformationProvider {
    /**
     * Return the file extension for this model if known, null otherwise.
     * No leading dot!
     */
    def String getResourceExtension(Object model)
}