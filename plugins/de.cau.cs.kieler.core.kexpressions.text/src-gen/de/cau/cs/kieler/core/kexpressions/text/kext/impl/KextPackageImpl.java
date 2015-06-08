/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext.impl;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.core.kexpressions.text.kext.Kext;
import de.cau.cs.kieler.core.kexpressions.text.kext.KextFactory;
import de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage;
import de.cau.cs.kieler.core.kexpressions.text.kext.StringAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KextPackageImpl extends EPackageImpl implements KextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringAnnotationEClass = null;

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
   * @see de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KextPackageImpl()
  {
    super(eNS_URI, KextFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link KextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KextPackage init()
  {
    if (isInited) return (KextPackage)EPackage.Registry.INSTANCE.getEPackage(KextPackage.eNS_URI);

    // Obtain or create and register package
    KextPackageImpl theKextPackage = (KextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KextPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    KEffectsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theKextPackage.createPackageContents();

    // Initialize created meta-data
    theKextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KextPackage.eNS_URI, theKextPackage);
    return theKextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKext()
  {
    return kextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKext_Declarations()
  {
    return (EReference)kextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKext_Effects()
  {
    return (EReference)kextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringAnnotation()
  {
    return stringAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringAnnotation_Value()
  {
    return (EAttribute)stringAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KextFactory getKextFactory()
  {
    return (KextFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    kextEClass = createEClass(KEXT);
    createEReference(kextEClass, KEXT__DECLARATIONS);
    createEReference(kextEClass, KEXT__EFFECTS);

    stringAnnotationEClass = createEClass(STRING_ANNOTATION);
    createEAttribute(stringAnnotationEClass, STRING_ANNOTATION__VALUE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
    KEffectsPackage theKEffectsPackage = (KEffectsPackage)EPackage.Registry.INSTANCE.getEPackage(KEffectsPackage.eNS_URI);
    AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    stringAnnotationEClass.getESuperTypes().add(theAnnotationsPackage.getStringAnnotation());

    // Initialize classes and features; add operations and parameters
    initEClass(kextEClass, Kext.class, "Kext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKext_Declarations(), theKExpressionsPackage.getDeclaration(), null, "declarations", null, 0, -1, Kext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKext_Effects(), theKEffectsPackage.getEffect(), null, "effects", null, 0, -1, Kext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringAnnotationEClass, StringAnnotation.class, "StringAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KextPackageImpl
