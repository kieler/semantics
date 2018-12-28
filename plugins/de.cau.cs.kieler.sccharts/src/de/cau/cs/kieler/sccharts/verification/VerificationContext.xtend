/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.verification

import de.cau.cs.kieler.sccharts.verification.backends.VerificationBackend
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate

/** 
 * @author aas
 */
class VerificationContext implements VerificationControls {
    @Delegate
    @Accessors
    private val VerificationController controller
    
    @Accessors private EObject model = null
    @Accessors private List<VerificationProperty> verificationProperties = newArrayList
    @Accessors private VerificationBackend backend    
    
    new() {
       controller = new VerificationController(this)
    }
}
