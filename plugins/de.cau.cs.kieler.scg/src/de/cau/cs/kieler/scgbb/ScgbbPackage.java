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

import de.cau.cs.kieler.scgdep.ScgdepPackage;

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
 * @see de.cau.cs.kieler.scgbb.ScgbbFactory
 * @model kind="package"
 * @generated
 */
public interface ScgbbPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "scgbb";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://kieler.cs.cau.de/scgbb/0.1.0";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "scgbb";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ScgbbPackage eINSTANCE = de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl.init();

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl <em>SC Graph BB</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getSCGraphBB()
	 * @generated
	 */
    int SC_GRAPH_BB = 0;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_BB__NODES = ScgdepPackage.SC_GRAPH_DEP__NODES;

    /**
	 * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_BB__VALUED_OBJECTS = ScgdepPackage.SC_GRAPH_DEP__VALUED_OBJECTS;

    /**
	 * The feature id for the '<em><b>Basic Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_BB__BASIC_BLOCKS = ScgdepPackage.SC_GRAPH_DEP_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>SC Graph BB</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_BB_FEATURE_COUNT = ScgdepPackage.SC_GRAPH_DEP_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>SC Graph BB</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SC_GRAPH_BB_OPERATION_COUNT = ScgdepPackage.SC_GRAPH_DEP_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.impl.BasicBlockImpl
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getBasicBlock()
	 * @generated
	 */
    int BASIC_BLOCK = 1;

    /**
	 * The feature id for the '<em><b>Scheduling Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__SCHEDULING_BLOCKS = 0;

    /**
	 * The feature id for the '<em><b>Activation Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__ACTIVATION_EXPRESSIONS = 1;

    /**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__GUARDS = 2;

				/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getSchedulingBlock()
	 * @generated
	 */
    int SCHEDULING_BLOCK = 2;

    /**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK__NODES = 0;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK__DEPENDENCIES = 1;

    /**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_BLOCK__GUARD = 2;

				/**
	 * The number of structural features of the '<em>Scheduling Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Scheduling Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getActivationExpression()
	 * @generated
	 */
    int ACTIVATION_EXPRESSION = 3;

    /**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVATION_EXPRESSION__EXPRESSIONS = 0;

    /**
	 * The feature id for the '<em><b>Basic Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVATION_EXPRESSION__BASIC_BLOCKS = 1;

    /**
	 * The number of structural features of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVATION_EXPRESSION_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVATION_EXPRESSION_OPERATION_COUNT = 0;


    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgbb.SCGraphBB <em>SC Graph BB</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SC Graph BB</em>'.
	 * @see de.cau.cs.kieler.scgbb.SCGraphBB
	 * @generated
	 */
    EClass getSCGraphBB();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.SCGraphBB#getBasicBlocks <em>Basic Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Blocks</em>'.
	 * @see de.cau.cs.kieler.scgbb.SCGraphBB#getBasicBlocks()
	 * @see #getSCGraphBB()
	 * @generated
	 */
    EReference getSCGraphBB_BasicBlocks();

    /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgbb.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock
	 * @generated
	 */
    EClass getBasicBlock();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.BasicBlock#getSchedulingBlocks <em>Scheduling Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Blocks</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getSchedulingBlocks()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EReference getBasicBlock_SchedulingBlocks();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.BasicBlock#getActivationExpressions <em>Activation Expressions</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Expressions</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getActivationExpressions()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EReference getBasicBlock_ActivationExpressions();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.BasicBlock#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getGuards()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Guards();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgbb.SchedulingBlock <em>Scheduling Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock
	 * @generated
	 */
    EClass getSchedulingBlock();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#getNodes()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
    EReference getSchedulingBlock_Nodes();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#getDependencies()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
    EReference getSchedulingBlock_Dependencies();

    /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#getGuard()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	EReference getSchedulingBlock_Guard();

				/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgbb.ActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Expression</em>'.
	 * @see de.cau.cs.kieler.scgbb.ActivationExpression
	 * @generated
	 */
    EClass getActivationExpression();

    /**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.ActivationExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see de.cau.cs.kieler.scgbb.ActivationExpression#getExpressions()
	 * @see #getActivationExpression()
	 * @generated
	 */
    EReference getActivationExpression_Expressions();

    /**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgbb.ActivationExpression#getBasicBlocks <em>Basic Blocks</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basic Blocks</em>'.
	 * @see de.cau.cs.kieler.scgbb.ActivationExpression#getBasicBlocks()
	 * @see #getActivationExpression()
	 * @generated
	 */
    EReference getActivationExpression_BasicBlocks();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ScgbbFactory getScgbbFactory();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl <em>SC Graph BB</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.impl.SCGraphBBImpl
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getSCGraphBB()
		 * @generated
		 */
        EClass SC_GRAPH_BB = eINSTANCE.getSCGraphBB();

        /**
		 * The meta object literal for the '<em><b>Basic Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SC_GRAPH_BB__BASIC_BLOCKS = eINSTANCE.getSCGraphBB_BasicBlocks();

        /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.impl.BasicBlockImpl <em>Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.impl.BasicBlockImpl
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getBasicBlock()
		 * @generated
		 */
        EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

        /**
		 * The meta object literal for the '<em><b>Scheduling Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BASIC_BLOCK__SCHEDULING_BLOCKS = eINSTANCE.getBasicBlock_SchedulingBlocks();

        /**
		 * The meta object literal for the '<em><b>Activation Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BASIC_BLOCK__ACTIVATION_EXPRESSIONS = eINSTANCE.getBasicBlock_ActivationExpressions();

        /**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__GUARDS = eINSTANCE.getBasicBlock_Guards();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl <em>Scheduling Block</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.impl.SchedulingBlockImpl
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getSchedulingBlock()
		 * @generated
		 */
        EClass SCHEDULING_BLOCK = eINSTANCE.getSchedulingBlock();

        /**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULING_BLOCK__NODES = eINSTANCE.getSchedulingBlock_Nodes();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SCHEDULING_BLOCK__DEPENDENCIES = eINSTANCE.getSchedulingBlock_Dependencies();

        /**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_BLOCK__GUARD = eINSTANCE.getSchedulingBlock_Guard();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.impl.ActivationExpressionImpl
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getActivationExpression()
		 * @generated
		 */
        EClass ACTIVATION_EXPRESSION = eINSTANCE.getActivationExpression();

        /**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTIVATION_EXPRESSION__EXPRESSIONS = eINSTANCE.getActivationExpression_Expressions();

        /**
		 * The meta object literal for the '<em><b>Basic Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTIVATION_EXPRESSION__BASIC_BLOCKS = eINSTANCE.getActivationExpression_BasicBlocks();

    }

} //ScgbbPackage
