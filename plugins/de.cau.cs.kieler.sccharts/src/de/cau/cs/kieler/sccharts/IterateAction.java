/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Action represents some effect that is executed under some
 * certain condition. The condition or sometimes called guard is
 * the trigger which simply is any boolean {@link Expression} over
 * {@link Signal}s or {@link Variable}s. Note that Actions may also be used
 * in contexts, where no trigger or resp. effects are allowed. E.g.
 * a suspensionTrigger has no effect.
 * <p>
 * The effects of an Action are either {@link Assignment}, {@link Emission} or escaping
 * to an {@link TextEffect}.
 * <p>
 * An Action has a String label that represents the trigger and the effects
 * list in a textual representation. The user of the 
 * model is required to synchronize the label with the actual
 * trigger and effects objects. For the sccharts graphical editor
 * this is done by using an Xtext grammar/parser.
 * <!-- end-model-doc -->
 *
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getIterateAction()
 * @model
 * @generated
 */
public interface IterateAction extends Action {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

} // IterateAction
