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
package de.cau.cs.kieler.scgbb.impl;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scgbb.BasicBlock;
import de.cau.cs.kieler.scgbb.BlockType;
import de.cau.cs.kieler.scgbb.Predecessor;
import de.cau.cs.kieler.scgbb.SCGraphBB;
import de.cau.cs.kieler.scgbb.ScgbbFactory;
import de.cau.cs.kieler.scgbb.ScgbbPackage;
import de.cau.cs.kieler.scgbb.SchedulingBlock;
import de.cau.cs.kieler.scgdep.ScgdepPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgbbPackageImpl extends EPackageImpl implements ScgbbPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass scGraphBBEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass basicBlockEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass schedulingBlockEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorEClass = null;

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockTypeEEnum = null;

				/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cau.cs.kieler.scgbb.ScgbbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private ScgbbPackageImpl() {
		super(eNS_URI, ScgbbFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScgbbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static ScgbbPackage init() {
		if (isInited) return (ScgbbPackage)EPackage.Registry.INSTANCE.getEPackage(ScgbbPackage.eNS_URI);

		// Obtain or create and register package
		ScgbbPackageImpl theScgbbPackage = (ScgbbPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgbbPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgbbPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ScgdepPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScgbbPackage.createPackageContents();

		// Initialize created meta-data
		theScgbbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScgbbPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScgbbPackage.eNS_URI, theScgbbPackage);
		return theScgbbPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSCGraphBB() {
		return scGraphBBEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSCGraphBB_BasicBlocks() {
		return (EReference)scGraphBBEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBasicBlock() {
		return basicBlockEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getBasicBlock_SchedulingBlocks() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_Guards() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_Predecessors() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicBlock_BlockType() {
		return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(4);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_PreGuard() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(5);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicBlock_GoBlock() {
		return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(3);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSchedulingBlock() {
		return schedulingBlockEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSchedulingBlock_Nodes() {
		return (EReference)schedulingBlockEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSchedulingBlock_Dependencies() {
		return (EReference)schedulingBlockEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingBlock_Guard() {
		return (EReference)schedulingBlockEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredecessor() {
		return predecessorEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredecessor_BasicBlock() {
		return (EReference)predecessorEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredecessor_BlockType() {
		return (EAttribute)predecessorEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredecessor_Conditional() {
		return (EReference)predecessorEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockType() {
		return blockTypeEEnum;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScgbbFactory getScgbbFactory() {
		return (ScgbbFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scGraphBBEClass = createEClass(SC_GRAPH_BB);
		createEReference(scGraphBBEClass, SC_GRAPH_BB__BASIC_BLOCKS);

		basicBlockEClass = createEClass(BASIC_BLOCK);
		createEReference(basicBlockEClass, BASIC_BLOCK__SCHEDULING_BLOCKS);
		createEReference(basicBlockEClass, BASIC_BLOCK__GUARDS);
		createEReference(basicBlockEClass, BASIC_BLOCK__PREDECESSORS);
		createEAttribute(basicBlockEClass, BASIC_BLOCK__GO_BLOCK);
		createEAttribute(basicBlockEClass, BASIC_BLOCK__BLOCK_TYPE);
		createEReference(basicBlockEClass, BASIC_BLOCK__PRE_GUARD);

		schedulingBlockEClass = createEClass(SCHEDULING_BLOCK);
		createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__NODES);
		createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__DEPENDENCIES);
		createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__GUARD);

		predecessorEClass = createEClass(PREDECESSOR);
		createEReference(predecessorEClass, PREDECESSOR__BASIC_BLOCK);
		createEAttribute(predecessorEClass, PREDECESSOR__BLOCK_TYPE);
		createEReference(predecessorEClass, PREDECESSOR__CONDITIONAL);

		// Create enums
		blockTypeEEnum = createEEnum(BLOCK_TYPE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ScgdepPackage theScgdepPackage = (ScgdepPackage)EPackage.Registry.INSTANCE.getEPackage(ScgdepPackage.eNS_URI);
		KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
		ScgPackage theScgPackage = (ScgPackage)EPackage.Registry.INSTANCE.getEPackage(ScgPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scGraphBBEClass.getESuperTypes().add(theScgdepPackage.getSCGraphDep());

		// Initialize classes, features, and operations; add parameters
		initEClass(scGraphBBEClass, SCGraphBB.class, "SCGraphBB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSCGraphBB_BasicBlocks(), this.getBasicBlock(), null, "basicBlocks", null, 0, -1, SCGraphBB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicBlockEClass, BasicBlock.class, "BasicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicBlock_SchedulingBlocks(), this.getSchedulingBlock(), null, "schedulingBlocks", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicBlock_Guards(), theKExpressionsPackage.getValuedObject(), null, "guards", null, 1, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicBlock_Predecessors(), this.getPredecessor(), null, "predecessors", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicBlock_GoBlock(), ecorePackage.getEBoolean(), "goBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicBlock_BlockType(), this.getBlockType(), "blockType", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicBlock_PreGuard(), theKExpressionsPackage.getValuedObject(), null, "preGuard", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulingBlockEClass, SchedulingBlock.class, "SchedulingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingBlock_Nodes(), theScgPackage.getNode(), null, "nodes", null, 0, -1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingBlock_Dependencies(), theScgdepPackage.getDependency(), null, "dependencies", null, 0, -1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedulingBlock_Guard(), theKExpressionsPackage.getValuedObject(), null, "guard", null, 1, 1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predecessorEClass, Predecessor.class, "Predecessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredecessor_BasicBlock(), this.getBasicBlock(), null, "basicBlock", null, 1, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredecessor_BlockType(), this.getBlockType(), "blockType", null, 0, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredecessor_Conditional(), theScgPackage.getConditional(), null, "conditional", null, 0, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(blockTypeEEnum, BlockType.class, "BlockType");
		addEEnumLiteral(blockTypeEEnum, BlockType.NORMAL);
		addEEnumLiteral(blockTypeEEnum, BlockType.DEPTH);
		addEEnumLiteral(blockTypeEEnum, BlockType.TRUEBRANCH);
		addEEnumLiteral(blockTypeEEnum, BlockType.ELSEBRANCH);
		addEEnumLiteral(blockTypeEEnum, BlockType.SYNCHRONIZER);

		// Create resource
		createResource(eNS_URI);
	}

} //ScgbbPackageImpl
