/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link ecore.EAnnotation#getDetails <em>Details</em>}</li>
 *   <li>{@link ecore.EAnnotation#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link ecore.EAnnotation#getContents <em>Contents</em>}</li>
 *   <li>{@link ecore.EAnnotation#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEAnnotation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedSourceURI'"
 * @generated
 */
public interface EAnnotation extends EModelElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see ecore.EcorePackage#getEAnnotation_Source()
     * @model
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link ecore.EAnnotation#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource(String value);

    /**
     * Returns the value of the '<em><b>Details</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Details</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Details</em>' map.
     * @see ecore.EcorePackage#getEAnnotation_Details()
     * @model mapType="ecore.EStringToStringMapEntry<ecore.EString, ecore.EString>"
     * @generated
     */
    EMap<String, String> getDetails();

    /**
     * Returns the value of the '<em><b>EModel Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EModel Element</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EModel Element</em>' container reference.
     * @see #setEModelElement(EModelElement)
     * @see ecore.EcorePackage#getEAnnotation_EModelElement()
     * @see ecore.EModelElement#getEAnnotations
     * @model opposite="eAnnotations" resolveProxies="false"
     * @generated
     */
    EModelElement getEModelElement();

    /**
     * Sets the value of the '{@link ecore.EAnnotation#getEModelElement <em>EModel Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EModel Element</em>' container reference.
     * @see #getEModelElement()
     * @generated
     */
    void setEModelElement(EModelElement value);

    /**
     * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
     * The list contents are of type {@link ecore.EObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contents</em>' containment reference list.
     * @see ecore.EcorePackage#getEAnnotation_Contents()
     * @model containment="true"
     * @generated
     */
    EList<EObject> getContents();

    /**
     * Returns the value of the '<em><b>References</b></em>' reference list.
     * The list contents are of type {@link ecore.EObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>References</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' reference list.
     * @see ecore.EcorePackage#getEAnnotation_References()
     * @model
     * @generated
     */
    EList<EObject> getReferences();

} // EAnnotation
