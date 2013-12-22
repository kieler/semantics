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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY__CONCURRENT = ScgPackage.LINK_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY__CONFLUENT = ScgPackage.LINK_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCY_FEATURE_COUNT = ScgPackage.LINK_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_READ__CONFLUENT = DEPENDENCY__CONFLUENT;

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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIVE_WRITE_READ__CONFLUENT = DEPENDENCY__CONFLUENT;

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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSOLUTE_WRITE_RELATIVE_WRITE__CONFLUENT = DEPENDENCY__CONFLUENT;

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
	 * The feature id for the '<em><b>Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__CONCURRENT = DEPENDENCY__CONCURRENT;

    /**
	 * The feature id for the '<em><b>Confluent</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WRITE_WRITE__CONFLUENT = DEPENDENCY__CONFLUENT;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.AssignmentDepImpl <em>Assignment Dep</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgdep.impl.AssignmentDepImpl
	 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAssignmentDep()
	 * @generated
	 */
    int ASSIGNMENT_DEP = 5;

    /**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__ANNOTATIONS = ScgPackage.ASSIGNMENT__ANNOTATIONS;

    /**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__INCOMING = ScgPackage.ASSIGNMENT__INCOMING;

    /**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__IS_INITIAL = ScgPackage.ASSIGNMENT__IS_INITIAL;

    /**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__NEXT = ScgPackage.ASSIGNMENT__NEXT;

    /**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__ASSIGNMENT = ScgPackage.ASSIGNMENT__ASSIGNMENT;

    /**
	 * The feature id for the '<em><b>Valued Object</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__VALUED_OBJECT = ScgPackage.ASSIGNMENT__VALUED_OBJECT;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP__DEPENDENCIES = ScgPackage.ASSIGNMENT_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Assignment Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP_FEATURE_COUNT = ScgPackage.ASSIGNMENT_FEATURE_COUNT + 1;

    /**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP___GET_ANNOTATION__STRING = ScgPackage.ASSIGNMENT___GET_ANNOTATION__STRING;

    /**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP___GET_ALL_ANNOTATIONS__STRING = ScgPackage.ASSIGNMENT___GET_ALL_ANNOTATIONS__STRING;

    /**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP___REMOVE_ALL_ANNOTATIONS__STRING = ScgPackage.ASSIGNMENT___REMOVE_ALL_ANNOTATIONS__STRING;

    /**
	 * The number of operations of the '<em>Assignment Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSIGNMENT_DEP_OPERATION_COUNT = ScgPackage.ASSIGNMENT_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.NodeDepImpl <em>Node Dep</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgdep.impl.NodeDepImpl
	 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getNodeDep()
	 * @generated
	 */
    int NODE_DEP = 6;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_DEP__DEPENDENCIES = 0;

    /**
	 * The number of structural features of the '<em>Node Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_DEP_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Node Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_DEP_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgdep.impl.SCGraphDepImpl <em>SC Graph Dep</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgdep.impl.SCGraphDepImpl
	 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getSCGraphDep()
	 * @generated
	 */
    int SC_GRAPH_DEP = 7;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_DEP__NODES = ScgPackage.SC_GRAPH__NODES;

    /**
	 * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_DEP__VALUED_OBJECTS = ScgPackage.SC_GRAPH__VALUED_OBJECTS;

    /**
	 * The number of structural features of the '<em>SC Graph Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_DEP_FEATURE_COUNT = ScgPackage.SC_GRAPH_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>SC Graph Dep</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_DEP_OPERATION_COUNT = ScgPackage.SC_GRAPH_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgdep.Dependency#isConcurrent <em>Concurrent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrent</em>'.
	 * @see de.cau.cs.kieler.scgdep.Dependency#isConcurrent()
	 * @see #getDependency()
	 * @generated
	 */
    EAttribute getDependency_Concurrent();

    /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgdep.Dependency#isConfluent <em>Confluent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confluent</em>'.
	 * @see de.cau.cs.kieler.scgdep.Dependency#isConfluent()
	 * @see #getDependency()
	 * @generated
	 */
    EAttribute getDependency_Confluent();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.AssignmentDep <em>Assignment Dep</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Dep</em>'.
	 * @see de.cau.cs.kieler.scgdep.AssignmentDep
	 * @generated
	 */
    EClass getAssignmentDep();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.NodeDep <em>Node Dep</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Dep</em>'.
	 * @see de.cau.cs.kieler.scgdep.NodeDep
	 * @generated
	 */
    EClass getNodeDep();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgdep.NodeDep#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.scgdep.NodeDep#getDependencies()
	 * @see #getNodeDep()
	 * @generated
	 */
    EReference getNodeDep_Dependencies();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgdep.SCGraphDep <em>SC Graph Dep</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Graph Dep</em>'.
	 * @see de.cau.cs.kieler.scgdep.SCGraphDep
	 * @generated
	 */
    EClass getSCGraphDep();

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
		 * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DEPENDENCY__CONCURRENT = eINSTANCE.getDependency_Concurrent();

        /**
		 * The meta object literal for the '<em><b>Confluent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DEPENDENCY__CONFLUENT = eINSTANCE.getDependency_Confluent();

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

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.AssignmentDepImpl <em>Assignment Dep</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgdep.impl.AssignmentDepImpl
		 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getAssignmentDep()
		 * @generated
		 */
        EClass ASSIGNMENT_DEP = eINSTANCE.getAssignmentDep();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.NodeDepImpl <em>Node Dep</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgdep.impl.NodeDepImpl
		 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getNodeDep()
		 * @generated
		 */
        EClass NODE_DEP = eINSTANCE.getNodeDep();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_DEP__DEPENDENCIES = eINSTANCE.getNodeDep_Dependencies();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgdep.impl.SCGraphDepImpl <em>SC Graph Dep</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgdep.impl.SCGraphDepImpl
		 * @see de.cau.cs.kieler.scgdep.impl.ScgdepPackageImpl#getSCGraphDep()
		 * @generated
		 */
        EClass SC_GRAPH_DEP = eINSTANCE.getSCGraphDep();

    }

} //ScgdepPackage
