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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Substitution#getParentScope <em>Parent Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Substitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Substitution#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSubstitution()
 * @model
 * @generated
 */
public interface Substitution extends EObject {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Parent Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Scope#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Scope</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Scope</em>' container reference.
	 * @see #setParentScope(Scope)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSubstitution_ParentScope()
	 * @see de.cau.cs.kieler.synccharts.Scope#getRenamings
	 * @model opposite="renamings" required="true" transient="false"
	 * @generated
	 */
    Scope getParentScope();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Substitution#getParentScope <em>Parent Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Scope</em>' container reference.
	 * @see #getParentScope()
	 * @generated
	 */
    void setParentScope(Scope value);

    /**
	 * Returns the value of the '<em><b>Formal</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' attribute.
	 * @see #setFormal(String)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSubstitution_Formal()
	 * @model required="true"
	 * @generated
	 */
    String getFormal();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Substitution#getFormal <em>Formal</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' attribute.
	 * @see #getFormal()
	 * @generated
	 */
    void setFormal(String value);

    /**
	 * Returns the value of the '<em><b>Actual</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' attribute.
	 * @see #setActual(String)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getSubstitution_Actual()
	 * @model required="true"
	 * @generated
	 */
    String getActual();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Substitution#getActual <em>Actual</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' attribute.
	 * @see #getActual()
	 * @generated
	 */
    void setActual(String value);

} // Substitution
