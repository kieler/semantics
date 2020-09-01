/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.cau.cs.kieler.kexpressions.ExternString;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl#getExtern <em>Extern</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ReferenceDeclarationImpl#getGenericParameters <em>Generic Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceDeclarationImpl extends DeclarationImpl implements ReferenceDeclaration {
    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected EObject reference;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameters;

    /**
     * The cached value of the '{@link #getExtern() <em>Extern</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtern()
     * @generated
     * @ordered
     */
    protected EList<ExternString> extern;

    /**
     * The cached value of the '{@link #getGenericParameters() <em>Generic Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> genericParameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.REFERENCE_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject getReference() {
        if (reference != null && reference.eIsProxy()) {
            InternalEObject oldReference = (InternalEObject)reference;
            reference = eResolveProxy(oldReference);
            if (reference != oldReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE, oldReference, reference));
            }
        }
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReference(EObject newReference) {
        EObject oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ExternString> getExtern() {
        if (extern == null) {
            extern = new EObjectContainmentEList<ExternString>(ExternString.class, this, KExpressionsPackage.REFERENCE_DECLARATION__EXTERN);
        }
        return extern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getGenericParameters() {
        if (genericParameters == null) {
            genericParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS);
        }
        return genericParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                return ((InternalEList<?>)getExtern()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS:
                return ((InternalEList<?>)getGenericParameters()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                if (resolve) return getReference();
                return basicGetReference();
            case KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS:
                return getParameters();
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                return getExtern();
            case KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS:
                return getGenericParameters();
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                setReference((EObject)newValue);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Parameter>)newValue);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                getExtern().clear();
                getExtern().addAll((Collection<? extends ExternString>)newValue);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS:
                getGenericParameters().clear();
                getGenericParameters().addAll((Collection<? extends Parameter>)newValue);
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                setReference((EObject)null);
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS:
                getParameters().clear();
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                getExtern().clear();
                return;
            case KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS:
                getGenericParameters().clear();
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
            case KExpressionsPackage.REFERENCE_DECLARATION__REFERENCE:
                return reference != null;
            case KExpressionsPackage.REFERENCE_DECLARATION__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case KExpressionsPackage.REFERENCE_DECLARATION__EXTERN:
                return extern != null && !extern.isEmpty();
            case KExpressionsPackage.REFERENCE_DECLARATION__GENERIC_PARAMETERS:
                return genericParameters != null && !genericParameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ReferenceDeclarationImpl
