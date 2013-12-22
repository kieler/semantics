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
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__GUARDS = 1;

				/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__PREDECESSORS = 2;

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
	 * The feature id for the '<em><b>Surface Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_BLOCK__SURFACE_BLOCK = 3;

				/**
	 * The feature id for the '<em><b>Synchronizer Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK = 4;

				/**
	 * The feature id for the '<em><b>Go Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_BLOCK__GO_BLOCK = 5;

				/**
	 * The number of structural features of the '<em>Scheduling Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK_FEATURE_COUNT = 6;

    /**
	 * The number of operations of the '<em>Scheduling Block</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCHEDULING_BLOCK_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.scgbb.BasicBlock#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see de.cau.cs.kieler.scgbb.BasicBlock#getPredecessors()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Predecessors();

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
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSurfaceBlock <em>Surface Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#isSurfaceBlock()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	EAttribute getSchedulingBlock_SurfaceBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isSynchronizerBlock <em>Synchronizer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronizer Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#isSynchronizerBlock()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	EAttribute getSchedulingBlock_SynchronizerBlock();

				/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scgbb.SchedulingBlock#isGoBlock <em>Go Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Go Block</em>'.
	 * @see de.cau.cs.kieler.scgbb.SchedulingBlock#isGoBlock()
	 * @see #getSchedulingBlock()
	 * @generated
	 */
	EAttribute getSchedulingBlock_GoBlock();

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
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__PREDECESSORS = eINSTANCE.getBasicBlock_Predecessors();

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
		 * The meta object literal for the '<em><b>Surface Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_BLOCK__SURFACE_BLOCK = eINSTANCE.getSchedulingBlock_SurfaceBlock();

								/**
		 * The meta object literal for the '<em><b>Synchronizer Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_BLOCK__SYNCHRONIZER_BLOCK = eINSTANCE.getSchedulingBlock_SynchronizerBlock();

								/**
		 * The meta object literal for the '<em><b>Go Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_BLOCK__GO_BLOCK = eINSTANCE.getSchedulingBlock_GoBlock();

    }

} //ScgbbPackage
