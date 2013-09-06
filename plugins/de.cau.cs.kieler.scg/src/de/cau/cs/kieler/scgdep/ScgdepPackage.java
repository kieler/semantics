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
package de.cau.cs.kieler.scgdep;

import de.cau.cs.kieler.scg.ScgPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.cau.cs.kieler.scgdep.ScgdepFactory
 * @model kind="package"
 * @generated
 */
public interface ScgdepPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scgdep";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/scgdep/0.1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scgdep";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScgdepPackage eINSTANCE = de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgdep.impl.DependencyImpl
     * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getDependency()
     * @generated
     */
    int DEPENDENCY = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__ANNOTATIONS = ScgPackage.LINK__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY__TARGET = ScgPackage.LINK__TARGET;

    /**
     * The number of structural features of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_FEATURE_COUNT = ScgPackage.LINK_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY___GET_ANNOTATION__STRING = ScgPackage.LINK___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY___GET_ALL_ANNOTATIONS__STRING = ScgPackage.LINK___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY___REMOVE_ALL_ANNOTATIONS__STRING = ScgPackage.LINK___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Dependency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPENDENCY_OPERATION_COUNT = ScgPackage.LINK_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_ReadImpl <em>Absolute Write Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_ReadImpl
     * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAbsoluteWrite_Read()
     * @generated
     */
    int ABSOLUTE_WRITE_READ = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ__TARGET = DEPENDENCY__TARGET;

    /**
     * The number of structural features of the '<em>Absolute Write Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ___GET_ANNOTATION__STRING = DEPENDENCY___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Absolute Write Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_READ_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.RelativeWrite_ReadImpl <em>Relative Write Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgdep.impl.RelativeWrite_ReadImpl
     * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getRelativeWrite_Read()
     * @generated
     */
    int RELATIVE_WRITE_READ = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ__TARGET = DEPENDENCY__TARGET;

    /**
     * The number of structural features of the '<em>Relative Write Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ___GET_ANNOTATION__STRING = DEPENDENCY___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Relative Write Read</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_WRITE_READ_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_RelativeWriteImpl <em>Absolute Write Relative Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_RelativeWriteImpl
     * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAbsoluteWrite_RelativeWrite()
     * @generated
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__TARGET = DEPENDENCY__TARGET;

    /**
     * The number of structural features of the '<em>Absolute Write Relative Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE___GET_ANNOTATION__STRING = DEPENDENCY___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Absolute Write Relative Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSOLUTE_WRITE_RELATIVE_WRITE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.Write_WriteImpl <em>Write Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scgdep.impl.Write_WriteImpl
     * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getWrite_Write()
     * @generated
     */
    int WRITE_WRITE = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE__ANNOTATIONS = DEPENDENCY__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE__TARGET = DEPENDENCY__TARGET;

    /**
     * The number of structural features of the '<em>Write Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Annotation</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE___GET_ANNOTATION__STRING = DEPENDENCY___GET_ANNOTATION__STRING;

    /**
     * The operation id for the '<em>Get All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE___GET_ALL_ANNOTATIONS__STRING = DEPENDENCY___GET_ALL_ANNOTATIONS__STRING;

    /**
     * The operation id for the '<em>Remove All Annotations</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE___REMOVE_ALL_ANNOTATIONS__STRING = DEPENDENCY___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
     * The number of operations of the '<em>Write Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_WRITE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dependency</em>'.
     * @see de.cau.cs.kieler.scgdep.Dependency
     * @generated
     */
    EClass getDependency();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.AbsoluteWrite_Read <em>Absolute Write Read</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Absolute Write Read</em>'.
     * @see de.cau.cs.kieler.scgdep.AbsoluteWrite_Read
     * @generated
     */
    EClass getAbsoluteWrite_Read();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.RelativeWrite_Read <em>Relative Write Read</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relative Write Read</em>'.
     * @see de.cau.cs.kieler.scgdep.RelativeWrite_Read
     * @generated
     */
    EClass getRelativeWrite_Read();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.AbsoluteWrite_RelativeWrite <em>Absolute Write Relative Write</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Absolute Write Relative Write</em>'.
     * @see de.cau.cs.kieler.scgdep.AbsoluteWrite_RelativeWrite
     * @generated
     */
    EClass getAbsoluteWrite_RelativeWrite();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.Write_Write <em>Write Write</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Write Write</em>'.
     * @see de.cau.cs.kieler.scgdep.Write_Write
     * @generated
     */
    EClass getWrite_Write();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ScgdepFactory getScgdepFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.DependencyImpl <em>Dependency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgdep.impl.DependencyImpl
         * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getDependency()
         * @generated
         */
        EClass DEPENDENCY = eINSTANCE.getDependency();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_ReadImpl <em>Absolute Write Read</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_ReadImpl
         * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAbsoluteWrite_Read()
         * @generated
         */
        EClass ABSOLUTE_WRITE_READ = eINSTANCE.getAbsoluteWrite_Read();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.RelativeWrite_ReadImpl <em>Relative Write Read</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgdep.impl.RelativeWrite_ReadImpl
         * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getRelativeWrite_Read()
         * @generated
         */
        EClass RELATIVE_WRITE_READ = eINSTANCE.getRelativeWrite_Read();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_RelativeWriteImpl <em>Absolute Write Relative Write</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgdep.impl.AbsoluteWrite_RelativeWriteImpl
         * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAbsoluteWrite_RelativeWrite()
         * @generated
         */
        EClass ABSOLUTE_WRITE_RELATIVE_WRITE = eINSTANCE.getAbsoluteWrite_RelativeWrite();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.Write_WriteImpl <em>Write Write</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scgdep.impl.Write_WriteImpl
         * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getWrite_Write()
         * @generated
         */
        EClass WRITE_WRITE = eINSTANCE.getWrite_Write();

    }

} //ScgdepPackage
