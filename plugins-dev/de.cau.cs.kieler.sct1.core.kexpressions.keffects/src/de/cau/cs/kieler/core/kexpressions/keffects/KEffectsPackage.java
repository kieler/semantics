/**
 */
package de.cau.cs.kieler.core.kexpressions.keffects;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory
 * @model kind="package"
 * @generated
 */
public interface KEffectsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "keffects";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/keffects/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "keffects";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    KEffectsPackage eINSTANCE = de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.EffectImpl
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getEffect()
     * @generated
     */
    int EFFECT = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The number of structural features of the '<em>Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFFECT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.AssignmentImpl
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__VALUED_OBJECT = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__EXPRESSION = EFFECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__INDICES = EFFECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OPERATOR = EFFECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.EmissionImpl <em>Emission</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.EmissionImpl
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getEmission()
     * @generated
     */
    int EMISSION = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__VALUED_OBJECT = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION__NEW_VALUE = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Emission</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMISSION_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.HostcodeEffectImpl <em>Hostcode Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.HostcodeEffectImpl
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getHostcodeEffect()
     * @generated
     */
    int HOSTCODE_EFFECT = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT__TEXT = EFFECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Hostcode Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HOSTCODE_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.FunctionCallEffectImpl
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getFunctionCallEffect()
     * @generated
     */
    int FUNCTION_CALL_EFFECT = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__ANNOTATIONS = EFFECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Function Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__FUNCTION_NAME = EFFECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT__PARAMETERS = EFFECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function Call Effect</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CALL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator
     * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignOperator()
     * @generated
     */
    int ASSIGN_OPERATOR = 5;

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.keffects.Effect <em>Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Effect</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Effect
     * @generated
     */
    EClass getEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getValuedObject()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_ValuedObject();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getExpression()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Expression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getIndices <em>Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indices</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getIndices()
     * @see #getAssignment()
     * @generated
     */
    EReference getAssignment_Indices();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Assignment#getOperator()
     * @see #getAssignment()
     * @generated
     */
    EAttribute getAssignment_Operator();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.keffects.Emission <em>Emission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emission</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Emission
     * @generated
     */
    EClass getEmission();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.core.kexpressions.keffects.Emission#getValuedObject <em>Valued Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Valued Object</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Emission#getValuedObject()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_ValuedObject();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.core.kexpressions.keffects.Emission#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>New Value</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.Emission#getNewValue()
     * @see #getEmission()
     * @generated
     */
    EReference getEmission_NewValue();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.keffects.HostcodeEffect <em>Hostcode Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hostcode Effect</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.HostcodeEffect
     * @generated
     */
    EClass getHostcodeEffect();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.core.kexpressions.keffects.FunctionCallEffect <em>Function Call Effect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Call Effect</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.FunctionCallEffect
     * @generated
     */
    EClass getFunctionCallEffect();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Assign Operator</em>'.
     * @see de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator
     * @generated
     */
    EEnum getAssignOperator();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    KEffectsFactory getKEffectsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.EffectImpl <em>Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.EffectImpl
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getEffect()
         * @generated
         */
        EClass EFFECT = eINSTANCE.getEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.AssignmentImpl
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__VALUED_OBJECT = eINSTANCE.getAssignment_ValuedObject();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

        /**
         * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSIGNMENT__INDICES = eINSTANCE.getAssignment_Indices();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.EmissionImpl <em>Emission</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.EmissionImpl
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getEmission()
         * @generated
         */
        EClass EMISSION = eINSTANCE.getEmission();

        /**
         * The meta object literal for the '<em><b>Valued Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__VALUED_OBJECT = eINSTANCE.getEmission_ValuedObject();

        /**
         * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMISSION__NEW_VALUE = eINSTANCE.getEmission_NewValue();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.HostcodeEffectImpl <em>Hostcode Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.HostcodeEffectImpl
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getHostcodeEffect()
         * @generated
         */
        EClass HOSTCODE_EFFECT = eINSTANCE.getHostcodeEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.impl.FunctionCallEffectImpl <em>Function Call Effect</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.FunctionCallEffectImpl
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getFunctionCallEffect()
         * @generated
         */
        EClass FUNCTION_CALL_EFFECT = eINSTANCE.getFunctionCallEffect();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator <em>Assign Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.core.kexpressions.keffects.AssignOperator
         * @see de.cau.cs.kieler.core.kexpressions.keffects.impl.KEffectsPackageImpl#getAssignOperator()
         * @generated
         */
        EEnum ASSIGN_OPERATOR = eINSTANCE.getAssignOperator();

    }

} //KEffectsPackage
