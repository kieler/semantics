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
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SC_GRAPH_BB__DECLARATIONS = ScgdepPackage.SC_GRAPH_DEP__DECLARATIONS;

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
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__GUARDS = 1;

				/**
	 * The feature id for the '<em><b>Predecessors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__PREDECESSORS = 2;

				/**
	 * The feature id for the '<em><b>Go Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__GO_BLOCK = 3;

				/**
	 * The feature id for the '<em><b>Dead Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK__DEAD_BLOCK = 4;

                /**
	 * The feature id for the '<em><b>Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__BLOCK_TYPE = 5;

				/**
	 * The feature id for the '<em><b>Pre Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__PRE_GUARD = 6;

				/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASIC_BLOCK_FEATURE_COUNT = 7;

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
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.impl.PredecessorImpl <em>Predecessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.impl.PredecessorImpl
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getPredecessor()
	 * @generated
	 */
	int PREDECESSOR = 3;

				/**
	 * The feature id for the '<em><b>Basic Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__BASIC_BLOCK = 0;

				/**
	 * The feature id for the '<em><b>Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__BLOCK_TYPE = 1;

				/**
	 * The feature id for the '<em><b>Conditional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__CONDITIONAL = 2;

				/**
	 * The number of structural features of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_FEATURE_COUNT = 3;

				/**
	 * The number of operations of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link de.cau.cs.kieler.scgbb.BlockType <em>Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.scgbb.BlockType
	 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 4;

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
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scgbb.BasicBlock#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predecessors</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getPredecessors()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Predecessors();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.BasicBlock#getBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Type</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getBlockType()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EAttribute getBasicBlock_BlockType();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgbb.BasicBlock#getPreGuard <em>Pre Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Guard</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getPreGuard()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_PreGuard();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.BasicBlock#isGoBlock <em>Go Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Go Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#isGoBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EAttribute getBasicBlock_GoBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.BasicBlock#isDeadBlock <em>Dead Block</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#isDeadBlock()
	 * @see #getBasicBlock()
	 * @generated
	 */
    EAttribute getBasicBlock_DeadBlock();

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
	 * Returns the meta object for class '{@link de.cau.cs.kieler.scgbb.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor</em>'.
	 * @see de.cau.cs.kieler.scgbb.Predecessor
	 * @generated
	 */
	EClass getPredecessor();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgbb.Predecessor#getBasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basic Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.Predecessor#getBasicBlock()
	 * @see #getPredecessor()
	 * @generated
	 */
	EReference getPredecessor_BasicBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.Predecessor#getBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Type</em>'.
	 * @see de.cau.cs.kieler.scgbb.Predecessor#getBlockType()
	 * @see #getPredecessor()
	 * @generated
	 */
	EAttribute getPredecessor_BlockType();

				/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.scgbb.Predecessor#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conditional</em>'.
	 * @see de.cau.cs.kieler.scgbb.Predecessor#getConditional()
	 * @see #getPredecessor()
	 * @generated
	 */
	EReference getPredecessor_Conditional();

				/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.scgbb.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Type</em>'.
	 * @see de.cau.cs.kieler.scgbb.BlockType
	 * @generated
	 */
	EEnum getBlockType();

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
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__GUARDS = eINSTANCE.getBasicBlock_Guards();

								/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__PREDECESSORS = eINSTANCE.getBasicBlock_Predecessors();

								/**
		 * The meta object literal for the '<em><b>Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BLOCK__BLOCK_TYPE = eINSTANCE.getBasicBlock_BlockType();

								/**
		 * The meta object literal for the '<em><b>Pre Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__PRE_GUARD = eINSTANCE.getBasicBlock_PreGuard();

								/**
		 * The meta object literal for the '<em><b>Go Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BLOCK__GO_BLOCK = eINSTANCE.getBasicBlock_GoBlock();

								/**
		 * The meta object literal for the '<em><b>Dead Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASIC_BLOCK__DEAD_BLOCK = eINSTANCE.getBasicBlock_DeadBlock();

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
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.impl.PredecessorImpl <em>Predecessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.impl.PredecessorImpl
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getPredecessor()
		 * @generated
		 */
		EClass PREDECESSOR = eINSTANCE.getPredecessor();

								/**
		 * The meta object literal for the '<em><b>Basic Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDECESSOR__BASIC_BLOCK = eINSTANCE.getPredecessor_BasicBlock();

								/**
		 * The meta object literal for the '<em><b>Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDECESSOR__BLOCK_TYPE = eINSTANCE.getPredecessor_BlockType();

								/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDECESSOR__CONDITIONAL = eINSTANCE.getPredecessor_Conditional();

								/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.scgbb.BlockType <em>Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.scgbb.BlockType
		 * @see de.cau.cs.kieler.scgbb.impl.ScgbbPackageImpl#getBlockType()
		 * @generated
		 */
		EEnum BLOCK_TYPE = eINSTANCE.getBlockType();

    }

} //ScgbbPackage
