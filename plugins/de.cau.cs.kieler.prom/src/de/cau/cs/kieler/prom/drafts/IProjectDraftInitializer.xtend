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
package de.cau.cs.kieler.prom.drafts

import de.cau.cs.kieler.prom.drafts.ProjectDraftData
import java.util.List

/**
 * Interface which can be implemented by extensions to add new default project drafts.
 * 
 * @author aas
 */
interface IProjectDraftInitializer {
    
    /**
     * Returns a list with default project drafts ready to use.
     */
    public def List<ProjectDraftData> getProjectDrafts()
}