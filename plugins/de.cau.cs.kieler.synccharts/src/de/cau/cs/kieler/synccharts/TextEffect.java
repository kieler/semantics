/**
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
package de.cau.cs.kieler.synccharts;

import de.cau.cs.kieler.core.kexpressions.TextualCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An TextEffect is a {@link TextualCode} that allows to
 * escape to some textual host code in an effect. This
 * can be any arbitrary String.
 * <!-- end-model-doc -->
 *
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTextEffect()
 * @model
 * @generated
 */
public interface TextEffect extends TextualCode, Effect {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

} // TextEffect
