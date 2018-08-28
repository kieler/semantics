/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.xtend.lib.annotations.Data

/**
 * Description of a compilation system for select-box entries. Consist of label an id.
 * 
 * @author sdo
 *
 */
@Data class SystemDescription {
    
    String label
    String id
    
}