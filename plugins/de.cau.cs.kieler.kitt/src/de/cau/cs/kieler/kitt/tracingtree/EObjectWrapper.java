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
package de.cau.cs.kieler.kitt.tracingtree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract representation of a object in a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getModel <em>Model</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getTargetTransformations <em>Target Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getSourceTransformations <em>Source Transformations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getEObject <em>EObject</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper()
 * @model
 * @generated
 */
public interface EObjectWrapper extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getModelObjects <em>Model Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * ModelWrapper for model containing this EObject.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(ModelWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper_Model()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getModelObjects
     * @model opposite="modelObjects" required="true" transient="false"
     * @generated
     */
    ModelWrapper getModel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ModelWrapper value);

    /**
     * Returns the value of the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Display name of the referenced object.
     * <p>
     * This string should enable a identification of the object even if no intance is referenced.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Display Name</em>' attribute.
     * @see #setDisplayName(String)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper_DisplayName()
     * @model required="true"
     * @generated
     */
    String getDisplayName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getDisplayName <em>Display Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Display Name</em>' attribute.
     * @see #getDisplayName()
     * @generated
     */
    void setDisplayName(String value);

    /**
     * Returns the value of the '<em><b>Target Transformations</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of object-transformations were this object is source element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Transformations</em>' reference list.
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper_TargetTransformations()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getSource
     * @model opposite="source"
     * @generated
     */
    EList<EObjectTransformation> getTargetTransformations();

    /**
     * Returns the value of the '<em><b>Source Transformations</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * List of object-transformations were this object is target element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Transformations</em>' reference list.
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper_SourceTransformations()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<EObjectTransformation> getSourceTransformations();

    /**
     * Returns the value of the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a instance of wrapped EObject
     * <p>
     * This reference is mandatory iff transient flag of model owning this element is NOT set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>EObject</em>' reference.
     * @see #setEObject(EObject)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectWrapper_EObject()
     * @model
     * @generated
     */
    EObject getEObject();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getEObject <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EObject</em>' reference.
     * @see #getEObject()
     * @generated
     */
    void setEObject(EObject value);

} // EObjectWrapper
