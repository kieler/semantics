/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgsched.impl;

import de.cau.cs.kieler.scgsched.Analysis;
import de.cau.cs.kieler.scgsched.ScgschedPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.AnalysisImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgsched.impl.AnalysisImpl#getObjectReferences <em>Object References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisImpl extends MinimalEObjectImpl.Container implements Analysis {
	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected static final String ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected String id = ID_EDEFAULT;

	/**
     * The cached value of the '{@link #getObjectReferences() <em>Object References</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjectReferences()
     * @generated
     * @ordered
     */
	protected EList<EObject> objectReferences;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AnalysisImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ScgschedPackage.Literals.ANALYSIS;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getId() {
        return id;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgschedPackage.ANALYSIS__ID, oldId, id));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EObject> getObjectReferences() {
        if (objectReferences == null) {
            objectReferences = new EObjectResolvingEList<EObject>(EObject.class, this, ScgschedPackage.ANALYSIS__OBJECT_REFERENCES);
        }
        return objectReferences;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgschedPackage.ANALYSIS__ID:
                return getId();
            case ScgschedPackage.ANALYSIS__OBJECT_REFERENCES:
                return getObjectReferences();
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
            case ScgschedPackage.ANALYSIS__ID:
                setId((String)newValue);
                return;
            case ScgschedPackage.ANALYSIS__OBJECT_REFERENCES:
                getObjectReferences().clear();
                getObjectReferences().addAll((Collection<? extends EObject>)newValue);
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
            case ScgschedPackage.ANALYSIS__ID:
                setId(ID_EDEFAULT);
                return;
            case ScgschedPackage.ANALYSIS__OBJECT_REFERENCES:
                getObjectReferences().clear();
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
            case ScgschedPackage.ANALYSIS__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ScgschedPackage.ANALYSIS__OBJECT_REFERENCES:
                return objectReferences != null && !objectReferences.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //AnalysisImpl
