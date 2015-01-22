/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.scgprios.AbsoluteWrite_Read_P;
import de.cau.cs.kieler.scgprios.AbsoluteWrite_RelativeWrite_P;
import de.cau.cs.kieler.scgprios.Assignment_P;
import de.cau.cs.kieler.scgprios.BasicBlock_P;
import de.cau.cs.kieler.scgprios.BranchType_P;
import de.cau.cs.kieler.scgprios.Conditional_P;
import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.Dependency_P;
import de.cau.cs.kieler.scgprios.Depth_P;
import de.cau.cs.kieler.scgprios.Entry_P;
import de.cau.cs.kieler.scgprios.Exit_P;
import de.cau.cs.kieler.scgprios.Fork_P;
import de.cau.cs.kieler.scgprios.Guard_P;
import de.cau.cs.kieler.scgprios.Join_P;
import de.cau.cs.kieler.scgprios.Link_P;
import de.cau.cs.kieler.scgprios.Node_P;
import de.cau.cs.kieler.scgprios.Predecessor_P;
import de.cau.cs.kieler.scgprios.RelativeWrite_Read_P;
import de.cau.cs.kieler.scgprios.SCGraph_P;
import de.cau.cs.kieler.scgprios.ScgpriosFactory;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.Schedule_P;
import de.cau.cs.kieler.scgprios.ScheduledBlock_P;
import de.cau.cs.kieler.scgprios.SchedulingBlock_P;
import de.cau.cs.kieler.scgprios.Surface_P;
import de.cau.cs.kieler.scgprios.Write_Write_P;

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
public class ScgpriosPackageImpl extends EPackageImpl implements ScgpriosPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scGraph_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass node_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditional_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass surface_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass depth_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignment_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fork_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass join_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass link_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entry_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exit_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlFlow_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dependency_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass absoluteWrite_Read_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relativeWrite_Read_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass absoluteWrite_RelativeWrite_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass write_Write_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass basicBlock_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedulingBlock_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass predecessor_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedule_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduledBlock_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass guard_PEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum branchType_PEEnum = null;

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScgpriosPackageImpl() {
        super(eNS_URI, ScgpriosFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ScgpriosPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScgpriosPackage init() {
        if (isInited) return (ScgpriosPackage)EPackage.Registry.INSTANCE.getEPackage(ScgpriosPackage.eNS_URI);

        // Obtain or create and register package
        ScgpriosPackageImpl theScgpriosPackage = (ScgpriosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScgpriosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScgpriosPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        KExpressionsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScgpriosPackage.createPackageContents();

        // Initialize created meta-data
        theScgpriosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScgpriosPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScgpriosPackage.eNS_URI, theScgpriosPackage);
        return theScgpriosPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCGraph_P() {
        return scGraph_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraph_P_Nodes() {
        return (EReference)scGraph_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraph_P_Declarations() {
        return (EReference)scGraph_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraph_P_BasicBlocks() {
        return (EReference)scGraph_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraph_P_Schedules() {
        return (EReference)scGraph_PEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCGraph_P_Guards() {
        return (EReference)scGraph_PEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCGraph_P_Label() {
        return (EAttribute)scGraph_PEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNode_P() {
        return node_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_P_Incoming() {
        return (EReference)node_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_P_IsInitial() {
        return (EAttribute)node_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_P_Dependencies() {
        return (EReference)node_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNode_P_NodePriority() {
        return (EAttribute)node_PEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConditional_P() {
        return conditional_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConditional_P_Then() {
        return (EReference)conditional_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConditional_P_Else() {
        return (EReference)conditional_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConditional_P_Condition() {
        return (EReference)conditional_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSurface_P() {
        return surface_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSurface_P_Depth() {
        return (EReference)surface_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDepth_P() {
        return depth_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDepth_P_Surface() {
        return (EReference)depth_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDepth_P_Next() {
        return (EReference)depth_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignment_P() {
        return assignment_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_P_Next() {
        return (EReference)assignment_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_P_Assignment() {
        return (EReference)assignment_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_P_ValuedObject() {
        return (EReference)assignment_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_P_Indices() {
        return (EReference)assignment_PEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFork_P() {
        return fork_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFork_P_Join() {
        return (EReference)fork_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFork_P_Next() {
        return (EReference)fork_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getJoin_P() {
        return join_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJoin_P_Fork() {
        return (EReference)join_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getJoin_P_Next() {
        return (EReference)join_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLink_P() {
        return link_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLink_P_Target() {
        return (EReference)link_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntry_P() {
        return entry_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntry_P_Exit() {
        return (EReference)entry_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntry_P_Next() {
        return (EReference)entry_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExit_P() {
        return exit_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_P_Entry() {
        return (EReference)exit_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_P_Next() {
        return (EReference)exit_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getControlFlow_P() {
        return controlFlow_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDependency_P() {
        return dependency_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDependency_P_Concurrent() {
        return (EAttribute)dependency_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDependency_P_Confluent() {
        return (EAttribute)dependency_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbsoluteWrite_Read_P() {
        return absoluteWrite_Read_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelativeWrite_Read_P() {
        return relativeWrite_Read_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbsoluteWrite_RelativeWrite_P() {
        return absoluteWrite_RelativeWrite_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWrite_Write_P() {
        return write_Write_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBasicBlock_P() {
        return basicBlock_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBasicBlock_P_SchedulingBlocks() {
        return (EReference)basicBlock_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBasicBlock_P_Predecessors() {
        return (EReference)basicBlock_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_P_GoBlock() {
        return (EAttribute)basicBlock_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_P_DepthBlock() {
        return (EAttribute)basicBlock_PEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_P_SynchronizerBlock() {
        return (EAttribute)basicBlock_PEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_P_EntryBlock() {
        return (EAttribute)basicBlock_PEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBasicBlock_P_DeadBlock() {
        return (EAttribute)basicBlock_PEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBasicBlock_P_PreGuard() {
        return (EReference)basicBlock_PEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchedulingBlock_P() {
        return schedulingBlock_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchedulingBlock_P_Nodes() {
        return (EReference)schedulingBlock_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchedulingBlock_P_Dependencies() {
        return (EReference)schedulingBlock_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchedulingBlock_P_Guard() {
        return (EReference)schedulingBlock_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPredecessor_P() {
        return predecessor_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPredecessor_P_BasicBlock() {
        return (EReference)predecessor_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPredecessor_P_Conditional() {
        return (EReference)predecessor_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPredecessor_P_BranchType() {
        return (EAttribute)predecessor_PEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchedule_P() {
        return schedule_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchedule_P_ScheduledBlocks() {
        return (EReference)schedule_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScheduledBlock_P() {
        return scheduledBlock_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScheduledBlock_P_SchedulingBlock() {
        return (EReference)scheduledBlock_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScheduledBlock_P_Schizophrenic() {
        return (EAttribute)scheduledBlock_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGuard_P() {
        return guard_PEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGuard_P_ValuedObject() {
        return (EReference)guard_PEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGuard_P_Expression() {
        return (EReference)guard_PEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBranchType_P() {
        return branchType_PEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgpriosFactory getScgpriosFactory() {
        return (ScgpriosFactory)getEFactoryInstance();
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
        scGraph_PEClass = createEClass(SC_GRAPH_P);
        createEReference(scGraph_PEClass, SC_GRAPH_P__NODES);
        createEReference(scGraph_PEClass, SC_GRAPH_P__DECLARATIONS);
        createEReference(scGraph_PEClass, SC_GRAPH_P__BASIC_BLOCKS);
        createEReference(scGraph_PEClass, SC_GRAPH_P__SCHEDULES);
        createEReference(scGraph_PEClass, SC_GRAPH_P__GUARDS);
        createEAttribute(scGraph_PEClass, SC_GRAPH_P__LABEL);

        node_PEClass = createEClass(NODE_P);
        createEReference(node_PEClass, NODE_P__INCOMING);
        createEAttribute(node_PEClass, NODE_P__IS_INITIAL);
        createEReference(node_PEClass, NODE_P__DEPENDENCIES);
        createEAttribute(node_PEClass, NODE_P__NODE_PRIORITY);

        conditional_PEClass = createEClass(CONDITIONAL_P);
        createEReference(conditional_PEClass, CONDITIONAL_P__THEN);
        createEReference(conditional_PEClass, CONDITIONAL_P__ELSE);
        createEReference(conditional_PEClass, CONDITIONAL_P__CONDITION);

        surface_PEClass = createEClass(SURFACE_P);
        createEReference(surface_PEClass, SURFACE_P__DEPTH);

        depth_PEClass = createEClass(DEPTH_P);
        createEReference(depth_PEClass, DEPTH_P__SURFACE);
        createEReference(depth_PEClass, DEPTH_P__NEXT);

        assignment_PEClass = createEClass(ASSIGNMENT_P);
        createEReference(assignment_PEClass, ASSIGNMENT_P__NEXT);
        createEReference(assignment_PEClass, ASSIGNMENT_P__ASSIGNMENT);
        createEReference(assignment_PEClass, ASSIGNMENT_P__VALUED_OBJECT);
        createEReference(assignment_PEClass, ASSIGNMENT_P__INDICES);

        fork_PEClass = createEClass(FORK_P);
        createEReference(fork_PEClass, FORK_P__JOIN);
        createEReference(fork_PEClass, FORK_P__NEXT);

        join_PEClass = createEClass(JOIN_P);
        createEReference(join_PEClass, JOIN_P__FORK);
        createEReference(join_PEClass, JOIN_P__NEXT);

        link_PEClass = createEClass(LINK_P);
        createEReference(link_PEClass, LINK_P__TARGET);

        entry_PEClass = createEClass(ENTRY_P);
        createEReference(entry_PEClass, ENTRY_P__EXIT);
        createEReference(entry_PEClass, ENTRY_P__NEXT);

        exit_PEClass = createEClass(EXIT_P);
        createEReference(exit_PEClass, EXIT_P__ENTRY);
        createEReference(exit_PEClass, EXIT_P__NEXT);

        controlFlow_PEClass = createEClass(CONTROL_FLOW_P);

        dependency_PEClass = createEClass(DEPENDENCY_P);
        createEAttribute(dependency_PEClass, DEPENDENCY_P__CONCURRENT);
        createEAttribute(dependency_PEClass, DEPENDENCY_P__CONFLUENT);

        absoluteWrite_Read_PEClass = createEClass(ABSOLUTE_WRITE_READ_P);

        relativeWrite_Read_PEClass = createEClass(RELATIVE_WRITE_READ_P);

        absoluteWrite_RelativeWrite_PEClass = createEClass(ABSOLUTE_WRITE_RELATIVE_WRITE_P);

        write_Write_PEClass = createEClass(WRITE_WRITE_P);

        basicBlock_PEClass = createEClass(BASIC_BLOCK_P);
        createEReference(basicBlock_PEClass, BASIC_BLOCK_P__SCHEDULING_BLOCKS);
        createEReference(basicBlock_PEClass, BASIC_BLOCK_P__PREDECESSORS);
        createEAttribute(basicBlock_PEClass, BASIC_BLOCK_P__GO_BLOCK);
        createEAttribute(basicBlock_PEClass, BASIC_BLOCK_P__DEPTH_BLOCK);
        createEAttribute(basicBlock_PEClass, BASIC_BLOCK_P__SYNCHRONIZER_BLOCK);
        createEAttribute(basicBlock_PEClass, BASIC_BLOCK_P__ENTRY_BLOCK);
        createEAttribute(basicBlock_PEClass, BASIC_BLOCK_P__DEAD_BLOCK);
        createEReference(basicBlock_PEClass, BASIC_BLOCK_P__PRE_GUARD);

        schedulingBlock_PEClass = createEClass(SCHEDULING_BLOCK_P);
        createEReference(schedulingBlock_PEClass, SCHEDULING_BLOCK_P__NODES);
        createEReference(schedulingBlock_PEClass, SCHEDULING_BLOCK_P__DEPENDENCIES);
        createEReference(schedulingBlock_PEClass, SCHEDULING_BLOCK_P__GUARD);

        predecessor_PEClass = createEClass(PREDECESSOR_P);
        createEReference(predecessor_PEClass, PREDECESSOR_P__BASIC_BLOCK);
        createEReference(predecessor_PEClass, PREDECESSOR_P__CONDITIONAL);
        createEAttribute(predecessor_PEClass, PREDECESSOR_P__BRANCH_TYPE);

        schedule_PEClass = createEClass(SCHEDULE_P);
        createEReference(schedule_PEClass, SCHEDULE_P__SCHEDULED_BLOCKS);

        scheduledBlock_PEClass = createEClass(SCHEDULED_BLOCK_P);
        createEReference(scheduledBlock_PEClass, SCHEDULED_BLOCK_P__SCHEDULING_BLOCK);
        createEAttribute(scheduledBlock_PEClass, SCHEDULED_BLOCK_P__SCHIZOPHRENIC);

        guard_PEClass = createEClass(GUARD_P);
        createEReference(guard_PEClass, GUARD_P__VALUED_OBJECT);
        createEReference(guard_PEClass, GUARD_P__EXPRESSION);

        // Create enums
        branchType_PEEnum = createEEnum(BRANCH_TYPE_P);
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
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scGraph_PEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        node_PEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        conditional_PEClass.getESuperTypes().add(this.getNode_P());
        surface_PEClass.getESuperTypes().add(this.getNode_P());
        depth_PEClass.getESuperTypes().add(this.getNode_P());
        assignment_PEClass.getESuperTypes().add(this.getNode_P());
        fork_PEClass.getESuperTypes().add(this.getNode_P());
        join_PEClass.getESuperTypes().add(this.getNode_P());
        link_PEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        entry_PEClass.getESuperTypes().add(this.getNode_P());
        exit_PEClass.getESuperTypes().add(this.getNode_P());
        controlFlow_PEClass.getESuperTypes().add(this.getLink_P());
        dependency_PEClass.getESuperTypes().add(this.getLink_P());
        absoluteWrite_Read_PEClass.getESuperTypes().add(this.getDependency_P());
        relativeWrite_Read_PEClass.getESuperTypes().add(this.getDependency_P());
        absoluteWrite_RelativeWrite_PEClass.getESuperTypes().add(this.getDependency_P());
        write_Write_PEClass.getESuperTypes().add(this.getDependency_P());

        // Initialize classes, features, and operations; add parameters
        initEClass(scGraph_PEClass, SCGraph_P.class, "SCGraph_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSCGraph_P_Nodes(), this.getNode_P(), null, "nodes", null, 0, -1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_P_Declarations(), theKExpressionsPackage.getDeclaration(), null, "declarations", null, 0, -1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_P_BasicBlocks(), this.getBasicBlock_P(), null, "basicBlocks", null, 0, -1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_P_Schedules(), this.getSchedule_P(), null, "schedules", null, 0, -1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSCGraph_P_Guards(), this.getGuard_P(), null, "guards", null, 0, -1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSCGraph_P_Label(), ecorePackage.getEString(), "label", null, 0, 1, SCGraph_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(node_PEClass, Node_P.class, "Node_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNode_P_Incoming(), this.getLink_P(), this.getLink_P_Target(), "incoming", null, 0, -1, Node_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_P_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, Node_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNode_P_Dependencies(), this.getDependency_P(), null, "dependencies", null, 0, -1, Node_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNode_P_NodePriority(), ecorePackage.getELong(), "nodePriority", null, 0, 1, Node_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditional_PEClass, Conditional_P.class, "Conditional_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditional_P_Then(), this.getControlFlow_P(), null, "then", null, 0, 1, Conditional_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_P_Else(), this.getControlFlow_P(), null, "else", null, 0, 1, Conditional_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_P_Condition(), theKExpressionsPackage.getExpression(), null, "condition", null, 0, 1, Conditional_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(surface_PEClass, Surface_P.class, "Surface_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSurface_P_Depth(), this.getDepth_P(), this.getDepth_P_Surface(), "depth", null, 1, 1, Surface_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(depth_PEClass, Depth_P.class, "Depth_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDepth_P_Surface(), this.getSurface_P(), this.getSurface_P_Depth(), "surface", null, 1, 1, Depth_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDepth_P_Next(), this.getControlFlow_P(), null, "next", null, 0, 1, Depth_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignment_PEClass, Assignment_P.class, "Assignment_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignment_P_Next(), this.getControlFlow_P(), null, "next", null, 0, 1, Assignment_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_P_Assignment(), theKExpressionsPackage.getExpression(), null, "assignment", null, 0, 1, Assignment_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_P_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 0, 1, Assignment_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAssignment_P_Indices(), theKExpressionsPackage.getExpression(), null, "indices", null, 0, -1, Assignment_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fork_PEClass, Fork_P.class, "Fork_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFork_P_Join(), this.getJoin_P(), this.getJoin_P_Fork(), "join", null, 1, 1, Fork_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFork_P_Next(), this.getControlFlow_P(), null, "next", null, 1, -1, Fork_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(join_PEClass, Join_P.class, "Join_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJoin_P_Fork(), this.getFork_P(), this.getFork_P_Join(), "fork", null, 1, 1, Join_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJoin_P_Next(), this.getControlFlow_P(), null, "next", null, 0, 1, Join_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(link_PEClass, Link_P.class, "Link_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLink_P_Target(), this.getNode_P(), this.getNode_P_Incoming(), "target", null, 1, 1, Link_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entry_PEClass, Entry_P.class, "Entry_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntry_P_Exit(), this.getExit_P(), this.getExit_P_Entry(), "exit", null, 1, 1, Entry_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntry_P_Next(), this.getControlFlow_P(), null, "next", null, 0, 1, Entry_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exit_PEClass, Exit_P.class, "Exit_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExit_P_Entry(), this.getEntry_P(), this.getEntry_P_Exit(), "entry", null, 1, 1, Exit_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExit_P_Next(), this.getControlFlow_P(), null, "next", null, 0, 1, Exit_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(controlFlow_PEClass, ControlFlow_P.class, "ControlFlow_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dependency_PEClass, Dependency_P.class, "Dependency_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDependency_P_Concurrent(), ecorePackage.getEBoolean(), "concurrent", "false", 0, 1, Dependency_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDependency_P_Confluent(), ecorePackage.getEBoolean(), "confluent", "false", 0, 1, Dependency_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(absoluteWrite_Read_PEClass, AbsoluteWrite_Read_P.class, "AbsoluteWrite_Read_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(relativeWrite_Read_PEClass, RelativeWrite_Read_P.class, "RelativeWrite_Read_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(absoluteWrite_RelativeWrite_PEClass, AbsoluteWrite_RelativeWrite_P.class, "AbsoluteWrite_RelativeWrite_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(write_Write_PEClass, Write_Write_P.class, "Write_Write_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(basicBlock_PEClass, BasicBlock_P.class, "BasicBlock_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBasicBlock_P_SchedulingBlocks(), this.getSchedulingBlock_P(), null, "schedulingBlocks", null, 0, -1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBasicBlock_P_Predecessors(), this.getPredecessor_P(), null, "predecessors", null, 0, -1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_P_GoBlock(), ecorePackage.getEBoolean(), "goBlock", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_P_DepthBlock(), ecorePackage.getEBoolean(), "depthBlock", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_P_SynchronizerBlock(), ecorePackage.getEBoolean(), "synchronizerBlock", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_P_EntryBlock(), ecorePackage.getEBoolean(), "entryBlock", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBasicBlock_P_DeadBlock(), ecorePackage.getEBoolean(), "deadBlock", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBasicBlock_P_PreGuard(), theKExpressionsPackage.getValuedObject(), null, "preGuard", null, 0, 1, BasicBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schedulingBlock_PEClass, SchedulingBlock_P.class, "SchedulingBlock_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchedulingBlock_P_Nodes(), this.getNode_P(), null, "nodes", null, 0, -1, SchedulingBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchedulingBlock_P_Dependencies(), this.getDependency_P(), null, "dependencies", null, 0, -1, SchedulingBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchedulingBlock_P_Guard(), this.getGuard_P(), null, "guard", null, 1, 1, SchedulingBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(predecessor_PEClass, Predecessor_P.class, "Predecessor_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPredecessor_P_BasicBlock(), this.getBasicBlock_P(), null, "basicBlock", null, 1, 1, Predecessor_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPredecessor_P_Conditional(), this.getConditional_P(), null, "conditional", null, 0, 1, Predecessor_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPredecessor_P_BranchType(), this.getBranchType_P(), "branchType", null, 0, 1, Predecessor_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schedule_PEClass, Schedule_P.class, "Schedule_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchedule_P_ScheduledBlocks(), this.getScheduledBlock_P(), null, "scheduledBlocks", null, 0, -1, Schedule_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scheduledBlock_PEClass, ScheduledBlock_P.class, "ScheduledBlock_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScheduledBlock_P_SchedulingBlock(), this.getSchedulingBlock_P(), null, "schedulingBlock", null, 0, 1, ScheduledBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScheduledBlock_P_Schizophrenic(), ecorePackage.getEBoolean(), "schizophrenic", null, 0, 1, ScheduledBlock_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(guard_PEClass, Guard_P.class, "Guard_P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGuard_P_ValuedObject(), theKExpressionsPackage.getValuedObject(), null, "valuedObject", null, 1, 1, Guard_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGuard_P_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Guard_P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(branchType_PEEnum, BranchType_P.class, "BranchType_P");
        addEEnumLiteral(branchType_PEEnum, BranchType_P.NORMAL);
        addEEnumLiteral(branchType_PEEnum, BranchType_P.TRUEBRANCH);
        addEEnumLiteral(branchType_PEEnum, BranchType_P.ELSEBRANCH);

        // Create resource
        createResource(eNS_URI);
    }

} //ScgpriosPackageImpl
