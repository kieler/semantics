/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link ecore.EReference#isContainer <em>Container</em>}</li>
 *   <li>{@link ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link ecore.EReference#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link ecore.EReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link ecore.EReference#getEKeys <em>EKeys</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentOpposite SingleContainer ConsistentKeys ConsistentUnique ConsistentContainer'"
 * @generated
 */
public interface EReference extends EStructuralFeature {
    /**
     * Returns the value of the '<em><b>Containment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' attribute.
     * @see #setContainment(boolean)
     * @see ecore.EcorePackage#getEReference_Containment()
     * @model
     * @generated
     */
    boolean isContainment();

    /**
     * Sets the value of the '{@link ecore.EReference#isContainment <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' attribute.
     * @see #isContainment()
     * @generated
     */
    void setContainment(boolean value);

    /**
     * Returns the value of the '<em><b>Container</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' attribute.
     * @see ecore.EcorePackage#getEReference_Container()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    boolean isContainer();

    /**
     * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolve Proxies</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolve Proxies</em>' attribute.
     * @see #setResolveProxies(boolean)
     * @see ecore.EcorePackage#getEReference_ResolveProxies()
     * @model default="true"
     * @generated
     */
    boolean isResolveProxies();

    /**
     * Sets the value of the '{@link ecore.EReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
     * @see #isResolveProxies()
     * @generated
     */
    void setResolveProxies(boolean value);

    /**
     * Returns the value of the '<em><b>EOpposite</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EOpposite</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EOpposite</em>' reference.
     * @see #setEOpposite(EReference)
     * @see ecore.EcorePackage#getEReference_EOpposite()
     * @model
     * @generated
     */
    EReference getEOpposite();

    /**
     * Sets the value of the '{@link ecore.EReference#getEOpposite <em>EOpposite</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EOpposite</em>' reference.
     * @see #getEOpposite()
     * @generated
     */
    void setEOpposite(EReference value);

    /**
     * Returns the value of the '<em><b>EReference Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EReference Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EReference Type</em>' reference.
     * @see ecore.EcorePackage#getEReference_EReferenceType()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    EClass getEReferenceType();

    /**
     * Returns the value of the '<em><b>EKeys</b></em>' reference list.
     * The list contents are of type {@link ecore.EAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EKeys</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EKeys</em>' reference list.
     * @see ecore.EcorePackage#getEReference_EKeys()
     * @model
     * @generated
     */
    EList<EAttribute> getEKeys();

} // EReference
