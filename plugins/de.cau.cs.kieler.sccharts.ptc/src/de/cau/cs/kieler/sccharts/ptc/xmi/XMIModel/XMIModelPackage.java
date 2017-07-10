/**
 */
package de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelFactory
 * @model kind="package"
 * @generated
 */
public interface XMIModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "XMIModel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cau.de/cs/kieler/sccharts/ptc/model/XMIModel";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "XMIModel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XMIModelPackage eINSTANCE = de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.XMIModelPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.XMIModelPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__TYPE = 0;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__CHILDREN = 1;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ATTRIBUTES = 2;

    /**
     * The feature id for the '<em><b>Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__CONTENT = 3;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.AttributeImpl
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.XMIModelPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getType()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Type();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Children</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getChildren()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Children();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Attributes</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getAttributes()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Attributes();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getContent <em>Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Content</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element#getContent()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Content();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute#getName()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute#getValue()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Value();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XMIModelFactory getXMIModelFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl
         * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.XMIModelPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

        /**
         * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__CONTENT = eINSTANCE.getElement_Content();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.AttributeImpl
         * @see de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.XMIModelPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    }

} //XMIModelPackage
