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
package de.cau.cs.kieler.kitt.tracingtree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation relation between two models.
 * <p>
 * Used as edges in tree structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTransformationID <em>Transformation ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getObjectTransformations <em>Object Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelTransformation()
 * @model
 * @generated
 */
public interface ModelTransformation extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Transformation ID</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unique identifier of this transformation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformation ID</em>' attribute.
     * @see #setTransformationID(String)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelTransformation_TransformationID()
     * @model default="" required="true"
     * @generated
     */
    String getTransformationID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTransformationID <em>Transformation ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformation ID</em>' attribute.
     * @see #getTransformationID()
     * @generated
     */
    void setTransformationID(String value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getTargetTransformations <em>Target Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Source model of this transfromation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' container reference.
     * @see #setSource(ModelWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelTransformation_Source()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getTargetTransformations
     * @model opposite="targetTransformations" required="true" transient="false"
     * @generated
     */
    ModelWrapper getSource();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getSource <em>Source</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' container reference.
     * @see #getSource()
     * @generated
     */
    void setSource(ModelWrapper value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getSourceTransformation <em>Source Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Target model of this transfromation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target</em>' containment reference.
     * @see #setTarget(ModelWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelTransformation_Target()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelWrapper#getSourceTransformation
     * @model opposite="sourceTransformation" containment="true" required="true"
     * @generated
     */
    ModelWrapper getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getTarget <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' containment reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(ModelWrapper value);

    /**
     * Returns the value of the '<em><b>Object Transformations</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getModelTransformation <em>Model Transformation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All object-transformations which are part of this model-transformation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Object Transformations</em>' containment reference list.
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getModelTransformation_ObjectTransformations()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getModelTransformation
     * @model opposite="modelTransformation" containment="true" required="true"
     * @generated
     */
    EList<EObjectTransformation> getObjectTransformations();

} // ModelTransformation
