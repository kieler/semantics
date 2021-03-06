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
            case ScgPackage.SC_GRAPHS: return createSCGraphs();
            case ScgPackage.SC_GRAPH: return createSCGraph();
            case ScgPackage.NODE: return createNode();
            case ScgPackage.CONDITIONAL: return createConditional();
            case ScgPackage.SURFACE: return createSurface();
            case ScgPackage.DEPTH: return createDepth();
            case ScgPackage.ASSIGNMENT: return createAssignment();
            case ScgPackage.FORK: return createFork();
            case ScgPackage.JOIN: return createJoin();
            case ScgPackage.ENTRY: return createEntry();
            case ScgPackage.EXIT: return createExit();
            case ScgPackage.BASIC_BLOCK: return createBasicBlock();
            case ScgPackage.SCHEDULING_BLOCK: return createSchedulingBlock();
            case ScgPackage.PREDECESSOR: return createPredecessor();
            case ScgPackage.GUARD: return createGuard();
            case ScgPackage.CONTROL_FLOW: return createControlFlow();
            case ScgPackage.EXPRESSION_DEPENDENCY: return createExpressionDependency();
            case ScgPackage.GUARD_DEPENDENCY: return createGuardDependency();
            case ScgPackage.SCHEDULE_DEPENDENCY: return createScheduleDependency();
            case ScgPackage.TICK_BOUNDARY_DEPENDENCY: return createTickBoundaryDependency();
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
            case ScgPackage.FORK_TYPE:
                return createForkTypeFromString(eDataType, initialValue);
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
            case ScgPackage.FORK_TYPE:
                return convertForkTypeToString(eDataType, instanceValue);
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
    @Override
    public SCGraphs createSCGraphs() {
        SCGraphsImpl scGraphs = new SCGraphsImpl();
        return scGraphs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Conditional createConditional() {
        ConditionalImpl conditional = new ConditionalImpl();
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Surface createSurface() {
        SurfaceImpl surface = new SurfaceImpl();
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Depth createDepth() {
        DepthImpl depth = new DepthImpl();
        return depth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fork createFork() {
        ForkImpl fork = new ForkImpl();
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Join createJoin() {
        JoinImpl join = new JoinImpl();
        return join;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCGraph createSCGraph() {
        SCGraphImpl scGraph = new SCGraphImpl();
        return scGraph;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Entry createEntry() {
        EntryImpl entry = new EntryImpl();
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Exit createExit() {
        ExitImpl exit = new ExitImpl();
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlFlow createControlFlow() {
        ControlFlowImpl controlFlow = new ControlFlowImpl();
        return controlFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BasicBlock createBasicBlock() {
        BasicBlockImpl basicBlock = new BasicBlockImpl();
        return basicBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SchedulingBlock createSchedulingBlock() {
        SchedulingBlockImpl schedulingBlock = new SchedulingBlockImpl();
        return schedulingBlock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Predecessor createPredecessor() {
        PredecessorImpl predecessor = new PredecessorImpl();
        return predecessor;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ExpressionDependency createExpressionDependency() {
        ExpressionDependencyImpl expressionDependency = new ExpressionDependencyImpl();
        return expressionDependency;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public GuardDependency createGuardDependency() {
        GuardDependencyImpl guardDependency = new GuardDependencyImpl();
        return guardDependency;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ScheduleDependency createScheduleDependency() {
        ScheduleDependencyImpl scheduleDependency = new ScheduleDependencyImpl();
        return scheduleDependency;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TickBoundaryDependency createTickBoundaryDependency() {
        TickBoundaryDependencyImpl tickBoundaryDependency = new TickBoundaryDependencyImpl();
        return tickBoundaryDependency;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForkType createForkTypeFromString(EDataType eDataType, String initialValue) {
        ForkType result = ForkType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertForkTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    @Override
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
