/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct;

import de.cau.cs.kieler.sccharts.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType <em>Imported Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getImportDecl()
 * @model
 * @generated
 */
public interface ImportDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Type</em>' reference.
   * @see #setImportedType(State)
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getImportDecl_ImportedType()
   * @model
   * @generated
   */
  State getImportedType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedType <em>Imported Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Type</em>' reference.
   * @see #getImportedType()
   * @generated
   */
  void setImportedType(State value);

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#getImportDecl_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // ImportDecl
