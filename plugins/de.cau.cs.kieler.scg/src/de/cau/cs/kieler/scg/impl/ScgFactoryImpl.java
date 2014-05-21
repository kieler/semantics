/**
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.scg.*;

import org.eclipse.emf.ecore.EClass;
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
			case ScgPackage.NODE: return createNode();
			case ScgPackage.CONDITIONAL: return createConditional();
			case ScgPackage.SURFACE: return createSurface();
			case ScgPackage.DEPTH: return createDepth();
			case ScgPackage.ASSIGNMENT: return createAssignment();
			case ScgPackage.FORK: return createFork();
			case ScgPackage.JOIN: return createJoin();
			case ScgPackage.LINK: return createLink();
			case ScgPackage.SC_GRAPH: return createSCGraph();
			case ScgPackage.ENTRY: return createEntry();
			case ScgPackage.EXIT: return createExit();
			case ScgPackage.CONTROL_FLOW: return createControlFlow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
