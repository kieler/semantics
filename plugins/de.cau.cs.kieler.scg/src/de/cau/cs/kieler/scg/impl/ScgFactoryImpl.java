/**
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.scg.*;

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
public class ScgFactoryImpl extends EFactoryImpl implements ScgFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScgFactory init() {
        try {
            ScgFactory theScgFactory = (ScgFactory)EPackage.Registry.INSTANCE.getEFactory(ScgPackage.eNS_URI);
            if (theScgFactory != null) {
                return theScgFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScgFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgFactoryImpl() {
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
            case ScgPackage.SC_GRAPH: return createSCGraph();
            case ScgPackage.NODE: return createNode();
            case ScgPackage.CONDITIONAL: return createConditional();
            case ScgPackage.SURFACE: return createSurface();
            case ScgPackage.DEPTH: return createDepth();
            case ScgPackage.ASSIGNMENT: return createAssignment();
            case ScgPackage.FORK: return createFork();
            case ScgPackage.JOIN: return createJoin();
            case ScgPackage.LINK: return createLink();
            case ScgPackage.ENTRY: return createEntry();
            case ScgPackage.EXIT: return createExit();
            case ScgPackage.CONTROL_FLOW: return createControlFlow();
            case ScgPackage.DEPENDENCY: return createDependency();
            case ScgPackage.ABSOLUTE_WRITE_READ: return createAbsoluteWrite_Read();
            case ScgPackage.RELATIVE_WRITE_READ: return createRelativeWrite_Read();
            case ScgPackage.ABSOLUTE_WRITE_RELATIVE_WRITE: return createAbsoluteWrite_RelativeWrite();
            case ScgPackage.WRITE_WRITE: return createWrite_Write();
            case ScgPackage.BASIC_BLOCK: return createBasicBlock();
            case ScgPackage.SCHEDULING_BLOCK: return createSchedulingBlock();
            case ScgPackage.PREDECESSOR: return createPredecessor();
            case ScgPackage.SCHEDULE: return createSchedule();
            case ScgPackage.GUARD: return createGuard();
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
            case ScgPackage.BRANCH_TYPE:
                return createBranchTypeFromString(eDataType, initialValue);
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
            case ScgPackage.BRANCH_TYPE:
                return convertBranchTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conditional createConditional() {
        ConditionalImpl conditional = new ConditionalImpl();
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface createSurface() {
        SurfaceImpl surface = new SurfaceImpl();
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Depth createDepth() {
        DepthImpl depth = new DepthImpl();
        return depth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork createFork() {
        ForkImpl fork = new ForkImpl();
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Join createJoin() {
        JoinImpl join = new JoinImpl();
        return join;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link createLink() {
        LinkImpl link = new LinkImpl();
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SCGraph createSCGraph() {
        SCGraphImpl scGraph = new SCGraphImpl();
        return scGraph;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry createEntry() {
        EntryImpl entry = new EntryImpl();
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exit createExit() {
        ExitImpl exit = new ExitImpl();
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow createControlFlow() {
        ControlFlowImpl controlFlow = new ControlFlowImpl();
        return controlFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency createDependency() {
        DependencyImpl dependency = new DependencyImpl();
        return dependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_Read createAbsoluteWrite_Read() {
        AbsoluteWrite_ReadImpl absoluteWrite_Read = new AbsoluteWrite_ReadImpl();
        return absoluteWrite_Read;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelativeWrite_Read createRelativeWrite_Read() {
        RelativeWrite_ReadImpl relativeWrite_Read = new RelativeWrite_ReadImpl();
        return relativeWrite_Read;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbsoluteWrite_RelativeWrite createAbsoluteWrite_RelativeWrite() {
        AbsoluteWrite_RelativeWriteImpl absoluteWrite_RelativeWrite = new AbsoluteWrite_RelativeWriteImpl();
        return absoluteWrite_RelativeWrite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Write_Write createWrite_Write() {
        Write_WriteImpl write_Write = new Write_WriteImpl();
        return write_Write;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicBlock createBasicBlock() {
        BasicBlockImpl basicBlock = new BasicBlockImpl();
        return basicBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchedulingBlock createSchedulingBlock() {
        SchedulingBlockImpl schedulingBlock = new SchedulingBlockImpl();
        return schedulingBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Predecessor createPredecessor() {
        PredecessorImpl predecessor = new PredecessorImpl();
        return predecessor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Schedule createSchedule() {
        ScheduleImpl schedule = new ScheduleImpl();
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Guard createGuard() {
        GuardImpl guard = new GuardImpl();
        return guard;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BranchType createBranchTypeFromString(EDataType eDataType, String initialValue) {
        BranchType result = BranchType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBranchTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgPackage getScgPackage() {
        return (ScgPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScgPackage getPackage() {
        return ScgPackage.eINSTANCE;
    }

} //ScgFactoryImpl
