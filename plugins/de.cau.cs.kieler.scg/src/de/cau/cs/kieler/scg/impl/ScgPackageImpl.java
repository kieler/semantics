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
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;
import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.BasicBlock;
import de.cau.cs.kieler.scg.BranchType;
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scg.ControlDependency;
import de.cau.cs.kieler.scg.ControlFlow;
import de.cau.cs.kieler.scg.Depth;
import de.cau.cs.kieler.scg.Entry;
import de.cau.cs.kieler.scg.Exit;
import de.cau.cs.kieler.scg.ExpressionDependency;
import de.cau.cs.kieler.scg.Fork;
import de.cau.cs.kieler.scg.Guard;
import de.cau.cs.kieler.scg.GuardDependency;
import de.cau.cs.kieler.scg.Join;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.Predecessor;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.SCGraphs;
import de.cau.cs.kieler.scg.ScgFactory;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.ScheduleDependency;
import de.cau.cs.kieler.scg.SchedulingBlock;
import de.cau.cs.kieler.scg.Surface;
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
public class ScgPackageImpl extends EPackageImpl implements ScgPackage {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scGraphsEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scGraphEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nodeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass conditionalEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass surfaceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass depthEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass assignmentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass forkEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass joinEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass entryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass exitEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass controlFlowEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlDependencyEClass = null;

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
	private EClass expressionDependencyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass guardDependencyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass scheduleDependencyEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass guardEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum branchTypeEEnum = null;

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
     * @see de.cau.cs.kieler.scg.ScgPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private ScgPackageImpl() {
        super(eNS_URI, ScgFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ScgPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static ScgPackage init() {
        if (isInited) return (ScgPackage)EPackage.Registry.INSTANCE.getEPackage(ScgPackage.eNS_URI);

        // Obtain or create and register package
        ScgPackageImpl theScgPackage = (ScgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScgPackage.createPackageContents();

        // Initialize created meta-data
        theScgPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScgPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScgPackage.eNS_URI, theScgPackage);
        return theScgPackage;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCGraphs() {
        return scGraphsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraphs_Scgs() {
        return (EReference)scGraphsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSCGraph() {
        return scGraphEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSCGraph_Nodes() {
        return (EReference)scGraphEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSCGraph_BasicBlocks() {
        return (EReference)scGraphEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSCGraph_Guards() {
        return (EReference)scGraphEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSCGraph_Label() {
        return (EAttribute)scGraphEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNode() {
        return nodeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getNode_IsInitial() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getNode_Dependencies() {
        return (EReference)nodeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_Schizophrenic() {
        return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConditional() {
        return conditionalEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConditional_Then() {
        return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConditional_Else() {
        return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConditional_Condition() {
        return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSurface() {
        return surfaceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSurface_Depth() {
        return (EReference)surfaceEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDepth() {
        return depthEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDepth_Surface() {
        return (EReference)depthEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDepth_Next() {
        return (EReference)depthEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAssignment() {
        return assignmentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getAssignment_Next() {
        return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFork() {
        return forkEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFork_Join() {
        return (EReference)forkEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFork_Next() {
        return (EReference)forkEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getJoin() {
        return joinEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJoin_Fork() {
        return (EReference)joinEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getJoin_Next() {
        return (EReference)joinEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getEntry() {
        return entryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEntry_Exit() {
        return (EReference)entryEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getEntry_Next() {
        return (EReference)entryEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExit() {
        return exitEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExit_Entry() {
        return (EReference)exitEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getExit_Next() {
        return (EReference)exitEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExit_Final() {
        return (EAttribute)exitEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getControlFlow() {
        return controlFlowEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getControlDependency() {
        return controlDependencyEClass;
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
	public EReference getBasicBlock_Predecessors() {
        return (EReference)basicBlockEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBasicBlock_ThreadEntry() {
        return (EReference)basicBlockEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getBasicBlock_DepthBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBasicBlock_SynchronizerBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBasicBlock_EntryBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getBasicBlock_DeadBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_TermBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getBasicBlock_PreGuard() {
        return (EReference)basicBlockEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_FinalBlock() {
        return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(10);
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
	public EReference getSchedulingBlock_Guards() {
        return (EReference)schedulingBlockEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchedulingBlock_Label() {
        return (EAttribute)schedulingBlockEClass.getEStructuralFeatures().get(3);
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
	public EReference getPredecessor_Conditional() {
        return (EReference)predecessorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPredecessor_BranchType() {
        return (EAttribute)predecessorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getExpressionDependency() {
        return expressionDependencyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGuardDependency() {
        return guardDependencyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getScheduleDependency() {
        return scheduleDependencyEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGuard() {
        return guardEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getBranchType() {
        return branchTypeEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ScgFactory getScgFactory() {
        return (ScgFactory)getEFactoryInstance();
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
        scGraphsEClass = createEClass(SC_GRAPHS);
        createEReference(scGraphsEClass, SC_GRAPHS__SCGS);

        scGraphEClass = createEClass(SC_GRAPH);
        createEReference(scGraphEClass, SC_GRAPH__NODES);
        createEReference(scGraphEClass, SC_GRAPH__BASIC_BLOCKS);
        createEReference(scGraphEClass, SC_GRAPH__GUARDS);
        createEAttribute(scGraphEClass, SC_GRAPH__LABEL);

        nodeEClass = createEClass(NODE);
        createEAttribute(nodeEClass, NODE__IS_INITIAL);
        createEReference(nodeEClass, NODE__DEPENDENCIES);
        createEAttribute(nodeEClass, NODE__SCHIZOPHRENIC);

        conditionalEClass = createEClass(CONDITIONAL);
        createEReference(conditionalEClass, CONDITIONAL__THEN);
        createEReference(conditionalEClass, CONDITIONAL__ELSE);
        createEReference(conditionalEClass, CONDITIONAL__CONDITION);

        surfaceEClass = createEClass(SURFACE);
        createEReference(surfaceEClass, SURFACE__DEPTH);

        depthEClass = createEClass(DEPTH);
        createEReference(depthEClass, DEPTH__SURFACE);
        createEReference(depthEClass, DEPTH__NEXT);

        assignmentEClass = createEClass(ASSIGNMENT);
        createEReference(assignmentEClass, ASSIGNMENT__NEXT);

        forkEClass = createEClass(FORK);
        createEReference(forkEClass, FORK__JOIN);
        createEReference(forkEClass, FORK__NEXT);

        joinEClass = createEClass(JOIN);
        createEReference(joinEClass, JOIN__FORK);
        createEReference(joinEClass, JOIN__NEXT);

        entryEClass = createEClass(ENTRY);
        createEReference(entryEClass, ENTRY__EXIT);
        createEReference(entryEClass, ENTRY__NEXT);

        exitEClass = createEClass(EXIT);
        createEReference(exitEClass, EXIT__ENTRY);
        createEReference(exitEClass, EXIT__NEXT);
        createEAttribute(exitEClass, EXIT__FINAL);

        basicBlockEClass = createEClass(BASIC_BLOCK);
        createEReference(basicBlockEClass, BASIC_BLOCK__SCHEDULING_BLOCKS);
        createEReference(basicBlockEClass, BASIC_BLOCK__PREDECESSORS);
        createEReference(basicBlockEClass, BASIC_BLOCK__THREAD_ENTRY);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__GO_BLOCK);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__DEPTH_BLOCK);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__SYNCHRONIZER_BLOCK);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__ENTRY_BLOCK);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__DEAD_BLOCK);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__TERM_BLOCK);
        createEReference(basicBlockEClass, BASIC_BLOCK__PRE_GUARD);
        createEAttribute(basicBlockEClass, BASIC_BLOCK__FINAL_BLOCK);

        schedulingBlockEClass = createEClass(SCHEDULING_BLOCK);
        createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__NODES);
        createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__DEPENDENCIES);
        createEReference(schedulingBlockEClass, SCHEDULING_BLOCK__GUARDS);
        createEAttribute(schedulingBlockEClass, SCHEDULING_BLOCK__LABEL);

        predecessorEClass = createEClass(PREDECESSOR);
        createEReference(predecessorEClass, PREDECESSOR__BASIC_BLOCK);
        createEReference(predecessorEClass, PREDECESSOR__CONDITIONAL);
        createEAttribute(predecessorEClass, PREDECESSOR__BRANCH_TYPE);

        guardEClass = createEClass(GUARD);

        controlFlowEClass = createEClass(CONTROL_FLOW);

        controlDependencyEClass = createEClass(CONTROL_DEPENDENCY);

        expressionDependencyEClass = createEClass(EXPRESSION_DEPENDENCY);

        guardDependencyEClass = createEClass(GUARD_DEPENDENCY);

        scheduleDependencyEClass = createEClass(SCHEDULE_DEPENDENCY);

        // Create enums
        branchTypeEEnum = createEEnum(BRANCH_TYPE);
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
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        KExtPackage theKExtPackage = (KExtPackage)EPackage.Registry.INSTANCE.getEPackage(KExtPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
        KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scGraphsEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        scGraphEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        scGraphEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        scGraphEClass.getESuperTypes().add(theKExtPackage.getDeclarationScope());
        nodeEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        nodeEClass.getESuperTypes().add(theAnnotationsPackage.getNamedObject());
        nodeEClass.getESuperTypes().add(theKExtPackage.getLinkable());
        conditionalEClass.getESuperTypes().add(this.getNode());
        surfaceEClass.getESuperTypes().add(this.getNode());
        depthEClass.getESuperTypes().add(this.getNode());
        assignmentEClass.getESuperTypes().add(this.getNode());
        assignmentEClass.getESuperTypes().add(theKEffectsPackage.getAssignment());
        forkEClass.getESuperTypes().add(this.getNode());
        joinEClass.getESuperTypes().add(this.getNode());
        entryEClass.getESuperTypes().add(this.getNode());
        exitEClass.getESuperTypes().add(this.getNode());
        guardEClass.getESuperTypes().add(this.getNode());
        guardEClass.getESuperTypes().add(theKEffectsPackage.getAssignment());
        controlFlowEClass.getESuperTypes().add(theKExtPackage.getLink());
        controlDependencyEClass.getESuperTypes().add(theKExtPackage.getDependency());
        expressionDependencyEClass.getESuperTypes().add(theKExtPackage.getDependency());
        guardDependencyEClass.getESuperTypes().add(theKExtPackage.getDependency());
        scheduleDependencyEClass.getESuperTypes().add(theKExtPackage.getDependency());

        // Initialize classes and features; add operations and parameters
        initEClass(scGraphsEClass, SCGraphs.class, "SCGraphs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSCGraphs_Scgs(), this.getSCGraph(), null, "scgs", null, 0, -1, SCGraphs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scGraphEClass, SCGraph.class, "SCGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSCGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, SCGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_BasicBlocks(), this.getBasicBlock(), null, "basicBlocks", null, 0, -1, SCGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_Guards(), this.getGuard(), null, "guards", null, 0, -1, SCGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSCGraph_Label(), ecorePackage.getEString(), "label", null, 0, 1, SCGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNode_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_Dependencies(), theKExtPackage.getDependency(), null, "dependencies", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_Schizophrenic(), ecorePackage.getEBoolean(), "schizophrenic", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditional_Then(), this.getControlFlow(), null, "then", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_Else(), this.getControlFlow(), null, "else", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_Condition(), theKExpressionsPackage.getExpression(), null, "condition", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(surfaceEClass, Surface.class, "Surface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSurface_Depth(), this.getDepth(), this.getDepth_Surface(), "depth", null, 1, 1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(depthEClass, Depth.class, "Depth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDepth_Surface(), this.getSurface(), this.getSurface_Depth(), "surface", null, 1, 1, Depth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDepth_Next(), this.getControlFlow(), null, "next", null, 0, 1, Depth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignment_Next(), this.getControlFlow(), null, "next", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFork_Join(), this.getJoin(), this.getJoin_Fork(), "join", null, 1, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFork_Next(), this.getControlFlow(), null, "next", null, 1, -1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJoin_Fork(), this.getFork(), this.getFork_Join(), "fork", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJoin_Next(), this.getControlFlow(), null, "next", null, 0, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntry_Exit(), this.getExit(), this.getExit_Entry(), "exit", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntry_Next(), this.getControlFlow(), null, "next", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExit_Entry(), this.getEntry(), this.getEntry_Exit(), "entry", null, 1, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExit_Next(), this.getControlFlow(), null, "next", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExit_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(basicBlockEClass, BasicBlock.class, "BasicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBasicBlock_SchedulingBlocks(), this.getSchedulingBlock(), null, "schedulingBlocks", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBasicBlock_Predecessors(), this.getPredecessor(), null, "predecessors", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBasicBlock_ThreadEntry(), this.getEntry(), null, "threadEntry", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_GoBlock(), ecorePackage.getEBoolean(), "goBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_DepthBlock(), ecorePackage.getEBoolean(), "depthBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_SynchronizerBlock(), ecorePackage.getEBoolean(), "synchronizerBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_EntryBlock(), ecorePackage.getEBoolean(), "entryBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_DeadBlock(), ecorePackage.getEBoolean(), "deadBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_TermBlock(), ecorePackage.getEBoolean(), "termBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBasicBlock_PreGuard(), theKExpressionsPackage.getValuedObject(), null, "preGuard", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_FinalBlock(), ecorePackage.getEBoolean(), "finalBlock", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schedulingBlockEClass, SchedulingBlock.class, "SchedulingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchedulingBlock_Nodes(), this.getNode(), null, "nodes", null, 0, -1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchedulingBlock_Dependencies(), theKExtPackage.getDependency(), null, "dependencies", null, 0, -1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchedulingBlock_Guards(), this.getGuard(), null, "guards", null, 1, -1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchedulingBlock_Label(), ecorePackage.getEString(), "label", null, 0, 1, SchedulingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(predecessorEClass, Predecessor.class, "Predecessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPredecessor_BasicBlock(), this.getBasicBlock(), null, "basicBlock", null, 1, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPredecessor_Conditional(), this.getConditional(), null, "conditional", null, 0, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPredecessor_BranchType(), this.getBranchType(), "branchType", null, 0, 1, Predecessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(controlDependencyEClass, ControlDependency.class, "ControlDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(expressionDependencyEClass, ExpressionDependency.class, "ExpressionDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(guardDependencyEClass, GuardDependency.class, "GuardDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(scheduleDependencyEClass, ScheduleDependency.class, "ScheduleDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(branchTypeEEnum, BranchType.class, "BranchType");
        addEEnumLiteral(branchTypeEEnum, BranchType.NORMAL);
        addEEnumLiteral(branchTypeEEnum, BranchType.TRUEBRANCH);
        addEEnumLiteral(branchTypeEEnum, BranchType.ELSEBRANCH);

        // Create resource
        createResource(eNS_URI);
    }

} //ScgPackageImpl
