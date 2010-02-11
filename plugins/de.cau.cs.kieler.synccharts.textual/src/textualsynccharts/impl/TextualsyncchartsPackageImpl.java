/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts.impl;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import textualsynccharts.TextualState;
import textualsynccharts.TextualTransition;
import textualsynccharts.TextualsyncchartsFactory;
import textualsynccharts.TextualsyncchartsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualsyncchartsPackageImpl extends EPackageImpl implements TextualsyncchartsPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass textualStateEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass textualTransitionEClass = null;

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
	 * @see textualsynccharts.TextualsyncchartsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private TextualsyncchartsPackageImpl() {
		super(eNS_URI, TextualsyncchartsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TextualsyncchartsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static TextualsyncchartsPackage init() {
		if (isInited) return (TextualsyncchartsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualsyncchartsPackage.eNS_URI);

		// Obtain or create and register package
		TextualsyncchartsPackageImpl theTextualsyncchartsPackage = (TextualsyncchartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextualsyncchartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextualsyncchartsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SyncchartsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTextualsyncchartsPackage.createPackageContents();

		// Initialize created meta-data
		theTextualsyncchartsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextualsyncchartsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextualsyncchartsPackage.eNS_URI, theTextualsyncchartsPackage);
		return theTextualsyncchartsPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTextualState() {
		return textualStateEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTextualTransition() {
		return textualTransitionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTextualTransition_TargetStateProxy() {
		return (EAttribute)textualTransitionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualTransition_MakeFinal() {
		return (EAttribute)textualTransitionEClass.getEStructuralFeatures().get(1);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualTransition_MakeConditional() {
		return (EAttribute)textualTransitionEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TextualsyncchartsFactory getTextualsyncchartsFactory() {
		return (TextualsyncchartsFactory)getEFactoryInstance();
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
		textualStateEClass = createEClass(TEXTUAL_STATE);

		textualTransitionEClass = createEClass(TEXTUAL_TRANSITION);
		createEAttribute(textualTransitionEClass, TEXTUAL_TRANSITION__TARGET_STATE_PROXY);
		createEAttribute(textualTransitionEClass, TEXTUAL_TRANSITION__MAKE_FINAL);
		createEAttribute(textualTransitionEClass, TEXTUAL_TRANSITION__MAKE_CONDITIONAL);
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
		SyncchartsPackage theSyncchartsPackage = (SyncchartsPackage)EPackage.Registry.INSTANCE.getEPackage(SyncchartsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textualStateEClass.getESuperTypes().add(theSyncchartsPackage.getState());
		textualTransitionEClass.getESuperTypes().add(theSyncchartsPackage.getTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(textualStateEClass, TextualState.class, "TextualState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualTransitionEClass, TextualTransition.class, "TextualTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualTransition_TargetStateProxy(), ecorePackage.getEString(), "targetStateProxy", null, 0, 1, TextualTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextualTransition_MakeFinal(), ecorePackage.getEBoolean(), "makeFinal", "false", 0, 1, TextualTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextualTransition_MakeConditional(), ecorePackage.getEBoolean(), "makeConditional", "false", 0, 1, TextualTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TextualsyncchartsPackageImpl
