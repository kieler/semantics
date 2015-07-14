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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformation relation between two elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getModelTransformation <em>Model Transformation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectTransformation()
 * @model
 * @generated
 */
public interface EObjectTransformation extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Model Transformation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getObjectTransformations <em>Object Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Model-transformation were this element-tranformation is part of.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model Transformation</em>' container reference.
     * @see #setModelTransformation(ModelTransformation)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectTransformation_ModelTransformation()
     * @see de.cau.cs.kieler.kitt.tracingtree.ModelTransformation#getObjectTransformations
     * @model opposite="objectTransformations" required="true" transient="false"
     * @generated
     */
    ModelTransformation getModelTransformation();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getModelTransformation <em>Model Transformation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Transformation</em>' container reference.
     * @see #getModelTransformation()
     * @generated
     */
    void setModelTransformation(ModelTransformation value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getTargetTransformations <em>Target Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Source object of this transfromation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(EObjectWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectTransformation_Source()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getTargetTransformations
     * @model opposite="targetTransformations" required="true"
     * @generated
     */
    EObjectWrapper getSource();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(EObjectWrapper value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getSourceTransformations <em>Source Transformations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Target object of this transfromation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(EObjectWrapper)
     * @see de.cau.cs.kieler.kitt.tracingtree.TracingTreePackage#getEObjectTransformation_Target()
     * @see de.cau.cs.kieler.kitt.tracingtree.EObjectWrapper#getSourceTransformations
     * @model opposite="sourceTransformations" required="true"
     * @generated
     */
    EObjectWrapper getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kitt.tracingtree.EObjectTransformation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(EObjectWrapper value);

} // EObjectTransformation
