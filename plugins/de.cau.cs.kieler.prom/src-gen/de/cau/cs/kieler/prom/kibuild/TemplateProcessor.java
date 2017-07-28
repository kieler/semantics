/**
 */
package de.cau.cs.kieler.prom.kibuild;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.TemplateProcessor#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getTemplateProcessor()
 * @model
 * @generated
 */
public interface TemplateProcessor extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.prom.kibuild.AttributeMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.cau.cs.kieler.prom.kibuild.KibuildPackage#getTemplateProcessor_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMapping> getAttributes();

} // TemplateProcessor
