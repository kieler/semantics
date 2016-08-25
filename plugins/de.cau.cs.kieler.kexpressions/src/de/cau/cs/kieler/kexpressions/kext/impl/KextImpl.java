/**
 */
package de.cau.cs.kieler.kexpressions.kext.impl;

import de.cau.cs.kieler.kexpressions.Declaration;

import de.cau.cs.kieler.kexpressions.kext.Kext;
import de.cau.cs.kieler.kexpressions.kext.KextPackage;
import de.cau.cs.kieler.kexpressions.kext.TestEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.KextImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.impl.KextImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KextImpl extends MinimalEObjectImpl.Container implements Kext {
    /**
     * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> declarations;

    /**
     * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntities()
     * @generated
     * @ordered
     */
    protected EList<TestEntity> entities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KextPackage.Literals.KEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, KextPackage.KEXT__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestEntity> getEntities() {
        if (entities == null) {
            entities = new EObjectContainmentEList<TestEntity>(TestEntity.class, this, KextPackage.KEXT__ENTITIES);
        }
        return entities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KextPackage.KEXT__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case KextPackage.KEXT__ENTITIES:
                return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
            case KextPackage.KEXT__DECLARATIONS:
                return getDeclarations();
            case KextPackage.KEXT__ENTITIES:
                return getEntities();
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
            case KextPackage.KEXT__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case KextPackage.KEXT__ENTITIES:
                getEntities().clear();
                getEntities().addAll((Collection<? extends TestEntity>)newValue);
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
            case KextPackage.KEXT__DECLARATIONS:
                getDeclarations().clear();
                return;
            case KextPackage.KEXT__ENTITIES:
                getEntities().clear();
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
            case KextPackage.KEXT__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case KextPackage.KEXT__ENTITIES:
                return entities != null && !entities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //KextImpl
