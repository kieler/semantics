/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctFactory
 * @model kind="package"
 * @generated
 */
public interface SctPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "sct";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://kieler.cs.cau.de/sccharts/textual/0.1.0";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "sct";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SctPackage eINSTANCE = de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl.init();

  /**
	 * The meta object id for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl <em>Import Decl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl
	 * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getImportDecl()
	 * @generated
	 */
  int IMPORT_DECL = 0;

  /**
	 * The feature id for the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMPORT_DECL__IMPORTED_TYPE = 0;

  /**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMPORT_DECL__IMPORTED_NAMESPACE = 1;

  /**
	 * The number of structural features of the '<em>Import Decl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMPORT_DECL_FEATURE_COUNT = 2;


  /**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl <em>Import Decl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Decl</em>'.
	 * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl
	 * @generated
	 */
  EClass getImportDecl();

  /**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Type</em>'.
	 * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType()
	 * @see #getImportDecl()
	 * @generated
	 */
  EReference getImportDecl_ImportedType();

  /**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace()
	 * @see #getImportDecl()
	 * @generated
	 */
  EAttribute getImportDecl_ImportedNamespace();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SctFactory getSctFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl <em>Import Decl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.ImportDeclImpl
		 * @see de.cau.cs.kieler.sccharts.text.sct.sct.impl.SctPackageImpl#getImportDecl()
		 * @generated
		 */
    EClass IMPORT_DECL = eINSTANCE.getImportDecl();

    /**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IMPORT_DECL__IMPORTED_TYPE = eINSTANCE.getImportDecl_ImportedType();

    /**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMPORT_DECL__IMPORTED_NAMESPACE = eINSTANCE.getImportDecl_ImportedNamespace();

  }

} //SctPackage
