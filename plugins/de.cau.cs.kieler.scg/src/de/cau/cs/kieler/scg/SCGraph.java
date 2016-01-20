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

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.kexpressions.Declaration;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.SCGraph#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph()
 * @model
 * @generated
 */
public interface SCGraph extends Annotatable {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.Node}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_Nodes()
     * @model containment="true"
     * @generated
     */
    EList<Node> getNodes();

    /**
     * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Declaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Declarations</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_Declarations()
     * @model containment="true"
     * @generated
     */
    EList<Declaration> getDeclarations();

    /**
     * Returns the value of the '<em><b>Basic Blocks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.BasicBlock}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Basic Blocks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Basic Blocks</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_BasicBlocks()
     * @model containment="true"
     * @generated
     */
    EList<BasicBlock> getBasicBlocks();

    /**
     * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.Schedule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schedules</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_Schedules()
     * @model containment="true"
     * @generated
     */
    EList<Schedule> getSchedules();

    /**
     * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scg.Guard}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guards</em>' containment reference list.
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_Guards()
     * @model containment="true"
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
     * @see de.cau.cs.kieler.scg.ScgPackage#getSCGraph_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scg.SCGraph#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // SCGraph
