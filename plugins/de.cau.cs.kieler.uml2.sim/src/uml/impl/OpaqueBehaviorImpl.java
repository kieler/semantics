/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.OpaqueBehavior;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OpaqueBehaviorImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.impl.OpaqueBehaviorImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpaqueBehaviorImpl extends BehaviorImpl implements OpaqueBehavior {
    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected EList<String> body;

    /**
     * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLanguage()
     * @generated
     * @ordered
     */
    protected EList<String> language;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpaqueBehaviorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getOpaqueBehavior();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getBody() {
        if (body == null) {
            body = new EDataTypeEList.Unsettable<String>(String.class, this, UmlPackage.OPAQUE_BEHAVIOR__BODY);
        }
        return body;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBody() {
        if (body != null) ((InternalEList.Unsettable<?>)body).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBody() {
        return body != null && ((InternalEList.Unsettable<?>)body).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getLanguage() {
        if (language == null) {
            language = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, UmlPackage.OPAQUE_BEHAVIOR__LANGUAGE);
        }
        return language;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLanguage() {
        if (language != null) ((InternalEList.Unsettable<?>)language).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLanguage() {
        return language != null && ((InternalEList.Unsettable<?>)language).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.OPAQUE_BEHAVIOR__BODY:
                return getBody();
            case UmlPackage.OPAQUE_BEHAVIOR__LANGUAGE:
                return getLanguage();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.OPAQUE_BEHAVIOR__BODY:
                getBody().clear();
                getBody().addAll((Collection<? extends String>)newValue);
                return;
            case UmlPackage.OPAQUE_BEHAVIOR__LANGUAGE:
                getLanguage().clear();
                getLanguage().addAll((Collection<? extends String>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlPackage.OPAQUE_BEHAVIOR__BODY:
                unsetBody();
                return;
            case UmlPackage.OPAQUE_BEHAVIOR__LANGUAGE:
                unsetLanguage();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlPackage.OPAQUE_BEHAVIOR__BODY:
                return isSetBody();
            case UmlPackage.OPAQUE_BEHAVIOR__LANGUAGE:
                return isSetLanguage();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (body: ");
        result.append(body);
        result.append(", language: ");
        result.append(language);
        result.append(')');
        return result.toString();
    }

} //OpaqueBehaviorImpl
