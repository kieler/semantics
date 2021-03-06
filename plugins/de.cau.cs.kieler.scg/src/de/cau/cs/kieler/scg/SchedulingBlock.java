/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg;

import de.cau.cs.kieler.kexpressions.keffects.Dependency;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.SchedulingBlock#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SchedulingBlock#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SchedulingBlock#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SchedulingBlock#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getSchedulingBlock()
 * @model
 * @generated
 */
public interface SchedulingBlock extends EObject {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.Node}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSchedulingBlock_Nodes()
     * @model
     * @generated
     */
    EList<Node> getNodes();

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Dependency}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependencies</em>' reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSchedulingBlock_Dependencies()
     * @model
     * @generated
     */
    EList<Dependency> getDependencies();

    /**
     * Returns the value of the '<em><b>Guards</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.Guard}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Guards</em>' reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSchedulingBlock_Guards()
     * @model required="true"
     * @generated
     */
	EList<Guard> getGuards();

				/**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see de.cau.cs.kieler.scg.ScgPackage#getSchedulingBlock_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.SchedulingBlock#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // SchedulingBlock
