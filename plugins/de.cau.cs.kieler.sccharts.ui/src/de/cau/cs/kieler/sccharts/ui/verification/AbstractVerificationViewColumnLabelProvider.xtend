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
package de.cau.cs.kieler.sccharts.ui.verification

import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import org.eclipse.jface.viewers.ColumnLabelProvider

/** 
 * @author aas
 */
class AbstractVerificationViewColumnLabelProvider extends ColumnLabelProvider {
    private val VerificationView view
    
    new(VerificationView view) {
        this.view = view
    }
    
    protected def VerificationProperty asVerificationProperty(Object element) {
        return element as VerificationProperty
    }
}
