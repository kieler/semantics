/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScgpriosFactoryImpl extends EFactoryImpl implements ScgpriosFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScgpriosFactory init() {
        try {
            ScgpriosFactory theScgpriosFactory = (ScgpriosFactory)EPackage.Registry.INSTANCE.getEFactory(ScgpriosPackage.eNS_URI);
            if (theScgpriosFactory != null) {
                return theScgpriosFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScgpriosFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgpriosFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ScgpriosPackage.SC_GRAPH_P: return createSCGraph_P();
            case ScgpriosPackage.NODE_P: return createNode_P();
            case ScgpriosPackage.CONDITIONAL_P: return createConditional_P();
            case ScgpriosPackage.SURFACE_P: return createSurface_P();
            case ScgpriosPackage.DEPTH_P: return createDepth_P();
            case ScgpriosPackage.ASSIGNMENT_P: return createAssignment_P();
            case ScgpriosPackage.FORK_P: return createFork_P();
            case ScgpriosPackage.JOIN_P: return createJoin_P();
            case ScgpriosPackage.LINK_P: return createLink_P();
            case ScgpriosPackage.ENTRY_P: return createEntry_P();
            case ScgpriosPackage.EXIT_P: return createExit_P();
            case ScgpriosPackage.CONTROL_FLOW_P: return createControlFlow_P();
            case ScgpriosPackage.DEPENDENCY_P: return createDependency_P();
            case ScgpriosPackage.ABSOLUTE_WRITE_READ_P: return createAbsoluteWrite_Read_P();
            case ScgpriosPackage.RELATIVE_WRITE_READ_P: return createRelativeWrite_Read_P();
            case ScgpriosPackage.ABSOLUTE_WRITE_RELATIVE_WRITE_P: return createAbsoluteWrite_RelativeWrite_P();
            case ScgpriosPackage.WRITE_WRITE_P: return createWrite_Write_P();
            case ScgpriosPackage.BASIC_BLOCK_P: return createBasicBlock_P();
            case ScgpriosPackage.SCHEDULING_BLOCK_P: return createSchedulingBlock_P();
            case ScgpriosPackage.PREDECESSOR_P: return createPredecessor_P();
            case ScgpriosPackage.SCHEDULE_P: return createSchedule_P();
            case ScgpriosPackage.SCHEDULED_BLOCK_P: return createScheduledBlock_P();
            case ScgpriosPackage.GUARD_P: return createGuard_P();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ScgpriosPackage.BRANCH_TYPE_P:
                return createBranchType_PFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ScgpriosPackage.BRANCH_TYPE_P:
                return convertBranchType_PToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCGraph_P createSCGraph_P() {
        SCGraph_PImpl scGraph_P = new SCGraph_PImpl();
        return scGraph_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node_P createNode_P() {
        Node_PImpl node_P = new Node_PImpl();
        return node_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conditional_P createConditional_P() {
        Conditional_PImpl conditional_P = new Conditional_PImpl();
        return conditional_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface_P createSurface_P() {
        Surface_PImpl surface_P = new Surface_PImpl();
        return surface_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Depth_P createDepth_P() {
        Depth_PImpl depth_P = new Depth_PImpl();
        return depth_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment_P createAssignment_P() {
        Assignment_PImpl assignment_P = new Assignment_PImpl();
        return assignment_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork_P createFork_P() {
        Fork_PImpl fork_P = new Fork_PImpl();
        return fork_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Join_P createJoin_P() {
        Join_PImpl join_P = new Join_PImpl();
        return join_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link_P createLink_P() {
        Link_PImpl link_P = new Link_PImpl();
        return link_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry_P createEntry_P() {
        Entry_PImpl entry_P = new Entry_PImpl();
        return entry_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exit_P createExit_P() {
        Exit_PImpl exit_P = new Exit_PImpl();
        return exit_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow_P createControlFlow_P() {
        ControlFlow_PImpl controlFlow_P = new ControlFlow_PImpl();
        return controlFlow_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency_P createDependency_P() {
        Dependency_PImpl dependency_P = new Dependency_PImpl();
        return dependency_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_Read_P createAbsoluteWrite_Read_P() {
        AbsoluteWrite_Read_PImpl absoluteWrite_Read_P = new AbsoluteWrite_Read_PImpl();
        return absoluteWrite_Read_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelativeWrite_Read_P createRelativeWrite_Read_P() {
        RelativeWrite_Read_PImpl relativeWrite_Read_P = new RelativeWrite_Read_PImpl();
        return relativeWrite_Read_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_RelativeWrite_P createAbsoluteWrite_RelativeWrite_P() {
        AbsoluteWrite_RelativeWrite_PImpl absoluteWrite_RelativeWrite_P = new AbsoluteWrite_RelativeWrite_PImpl();
        return absoluteWrite_RelativeWrite_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Write_Write_P createWrite_Write_P() {
        Write_Write_PImpl write_Write_P = new Write_Write_PImpl();
        return write_Write_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicBlock_P createBasicBlock_P() {
        BasicBlock_PImpl basicBlock_P = new BasicBlock_PImpl();
        return basicBlock_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingBlock_P createSchedulingBlock_P() {
        SchedulingBlock_PImpl schedulingBlock_P = new SchedulingBlock_PImpl();
        return schedulingBlock_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Predecessor_P createPredecessor_P() {
        Predecessor_PImpl predecessor_P = new Predecessor_PImpl();
        return predecessor_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Schedule_P createSchedule_P() {
        Schedule_PImpl schedule_P = new Schedule_PImpl();
        return schedule_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScheduledBlock_P createScheduledBlock_P() {
        ScheduledBlock_PImpl scheduledBlock_P = new ScheduledBlock_PImpl();
        return scheduledBlock_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Guard_P createGuard_P() {
        Guard_PImpl guard_P = new Guard_PImpl();
        return guard_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BranchType_P createBranchType_PFromString(EDataType eDataType, String initialValue) {
        BranchType_P result = BranchType_P.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBranchType_PToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgpriosPackage getScgpriosPackage() {
        return (ScgpriosPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScgpriosPackage getPackage() {
        return ScgpriosPackage.eINSTANCE;
    }

} //ScgpriosFactoryImpl
