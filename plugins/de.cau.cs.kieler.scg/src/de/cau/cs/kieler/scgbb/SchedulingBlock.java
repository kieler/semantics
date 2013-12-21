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
package de.cau.cs.kieler.scgbb;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scg.Node;

import de.cau.cs.kieler.scgdep.Dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSurfaceBlock <em>Surface Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSynchronizerBlock <em>Synchronizer Block</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isGoBlock <em>Go Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock()
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
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_Nodes()
	 * @model
	 * @generated
	 */
    EList<Node> getNodes();

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.scgdep.Dependency}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_Dependencies()
	 * @model
	 * @generated
	 */
    EList<Dependency> getDependencies();

				/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(ValuedObject)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_Guard()
	 * @model required="true"
	 * @generated
	 */
	ValuedObject getGuard();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValuedObject value);

				/**
	 * Returns the value of the '<em><b>Surface Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Block</em>' attribute.
	 * @see #setSurfaceBlock(boolean)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_SurfaceBlock()
	 * @model
	 * @generated
	 */
	boolean isSurfaceBlock();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSurfaceBlock <em>Surface Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Block</em>' attribute.
	 * @see #isSurfaceBlock()
	 * @generated
	 */
	void setSurfaceBlock(boolean value);

				/**
	 * Returns the value of the '<em><b>Synchronizer Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronizer Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizer Block</em>' attribute.
	 * @see #setSynchronizerBlock(boolean)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_SynchronizerBlock()
	 * @model
	 * @generated
	 */
	boolean isSynchronizerBlock();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSynchronizerBlock <em>Synchronizer Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronizer Block</em>' attribute.
	 * @see #isSynchronizerBlock()
	 * @generated
	 */
	void setSynchronizerBlock(boolean value);

				/**
	 * Returns the value of the '<em><b>Go Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go Block</em>' attribute.
	 * @see #setGoBlock(boolean)
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#getSchedulingBlock_GoBlock()
	 * @model
	 * @generated
	 */
	boolean isGoBlock();

				/**
	 * Sets the value of the '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isGoBlock <em>Go Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go Block</em>' attribute.
	 * @see #isGoBlock()
	 * @generated
	 */
	void setGoBlock(boolean value);

} // SchedulingBlock
