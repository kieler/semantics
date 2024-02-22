/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.verification

import de.cau.cs.kieler.verification.SmallVerificationProperty
import org.eclipse.xtend.lib.annotations.Data

/**
 * Message to be send to the client after requesting the verification properties.
 * Includes the collected properties.
 * 
 * @author jep
 *
 */
@Data class VerificationPropertiesMessage {
    
    SmallVerificationProperty[] properties
    
}