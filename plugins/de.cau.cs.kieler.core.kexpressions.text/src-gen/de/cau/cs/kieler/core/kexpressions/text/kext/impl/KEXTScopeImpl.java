/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext.impl;

import de.cau.cs.kieler.core.kexpressions.text.kext.KEXTScope;
import de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage;
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KEXT Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.KEXTScopeImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KEXTScopeImpl extends DeclarationScopeImpl implements KEXTScope {
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
	protected KEXTScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KextPackage.Literals.KEXT_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<TestEntity>(TestEntity.class, this, KextPackage.KEXT_SCOPE__ENTITIES);
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
			case KextPackage.KEXT_SCOPE__ENTITIES:
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
			case KextPackage.KEXT_SCOPE__ENTITIES:
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
			case KextPackage.KEXT_SCOPE__ENTITIES:
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
			case KextPackage.KEXT_SCOPE__ENTITIES:
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
			case KextPackage.KEXT_SCOPE__ENTITIES:
				return entities != null && !entities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KEXTScopeImpl
