/**
 */
package scg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scg.Assignment;
import scg.Conditional;
import scg.Depth;
import scg.Fork;
import scg.Join;
import scg.Node;
import scg.ScgFactory;
import scg.ScgPackage;
import scg.Surface;

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
     * @see scg.ScgPackage#eNS_URI
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
    public EClass getNode() {
        return nodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNode_Previous() {
        return (EReference)nodeEClass.getEStructuralFeatures().get(0);
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
    public EAttribute getConditional_Condition() {
        return (EAttribute)conditionalEClass.getEStructuralFeatures().get(2);
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
    public EAttribute getAssignment_Assignment() {
        return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
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
        nodeEClass = createEClass(NODE);
        createEReference(nodeEClass, NODE__PREVIOUS);

        conditionalEClass = createEClass(CONDITIONAL);
        createEReference(conditionalEClass, CONDITIONAL__THEN);
        createEReference(conditionalEClass, CONDITIONAL__ELSE);
        createEAttribute(conditionalEClass, CONDITIONAL__CONDITION);

        surfaceEClass = createEClass(SURFACE);
        createEReference(surfaceEClass, SURFACE__DEPTH);

        depthEClass = createEClass(DEPTH);
        createEReference(depthEClass, DEPTH__SURFACE);
        createEReference(depthEClass, DEPTH__NEXT);

        assignmentEClass = createEClass(ASSIGNMENT);
        createEReference(assignmentEClass, ASSIGNMENT__NEXT);
        createEAttribute(assignmentEClass, ASSIGNMENT__ASSIGNMENT);

        forkEClass = createEClass(FORK);
        createEReference(forkEClass, FORK__JOIN);
        createEReference(forkEClass, FORK__NEXT);

        joinEClass = createEClass(JOIN);
        createEReference(joinEClass, JOIN__FORK);
        createEReference(joinEClass, JOIN__NEXT);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        conditionalEClass.getESuperTypes().add(this.getNode());
        surfaceEClass.getESuperTypes().add(this.getNode());
        depthEClass.getESuperTypes().add(this.getNode());
        assignmentEClass.getESuperTypes().add(this.getNode());
        forkEClass.getESuperTypes().add(this.getNode());
        joinEClass.getESuperTypes().add(this.getNode());

        // Initialize classes, features, and operations; add parameters
        initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNode_Previous(), this.getNode(), null, "previous", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConditional_Then(), this.getNode(), null, "then", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConditional_Else(), this.getNode(), null, "else", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConditional_Condition(), ecorePackage.getEString(), "Condition", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(surfaceEClass, Surface.class, "Surface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSurface_Depth(), this.getDepth(), this.getDepth_Surface(), "depth", null, 1, 1, Surface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(depthEClass, Depth.class, "Depth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDepth_Surface(), this.getSurface(), this.getSurface_Depth(), "surface", null, 1, 1, Depth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDepth_Next(), this.getNode(), null, "next", null, 0, 1, Depth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAssignment_Next(), this.getNode(), null, "next", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssignment_Assignment(), ecorePackage.getEString(), "Assignment", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFork_Join(), this.getJoin(), this.getJoin_Fork(), "join", null, 1, 1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFork_Next(), this.getNode(), null, "next", null, 0, -1, Fork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getJoin_Fork(), this.getFork(), this.getFork_Join(), "fork", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getJoin_Next(), this.getNode(), null, "next", null, 0, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ScgPackageImpl
