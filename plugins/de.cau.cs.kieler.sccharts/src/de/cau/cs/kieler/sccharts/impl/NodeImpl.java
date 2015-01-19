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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.sccharts.Node;
import de.cau.cs.kieler.sccharts.Receiver;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Sender;

import de.cau.cs.kieler.sccharts.TestReceiver;
import de.cau.cs.kieler.sccharts.TestSender;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getTestSenders <em>Test Senders</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.NodeImpl#getTestReceivers <em>Test Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AnnotatableImpl implements Node {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getSenders() <em>Senders</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSenders()
     * @generated
     * @ordered
     */
    protected EList<Sender> senders;

    /**
     * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReceivers()
     * @generated
     * @ordered
     */
	protected Receiver receivers;

				/**
     * The cached value of the '{@link #getTestSenders() <em>Test Senders</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestSenders()
     * @generated
     * @ordered
     */
    protected EList<TestSender> testSenders;

    /**
     * The cached value of the '{@link #getTestReceivers() <em>Test Receivers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestReceivers()
     * @generated
     * @ordered
     */
    protected EList<TestReceiver> testReceivers;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.NODE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.NODE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.NODE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Sender> getSenders() {
        if (senders == null) {
            senders = new EObjectContainmentEList<Sender>(Sender.class, this, SCChartsPackage.NODE__SENDERS);
        }
        return senders;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Receiver getReceivers() {
        if (receivers != null && receivers.eIsProxy()) {
            InternalEObject oldReceivers = (InternalEObject)receivers;
            receivers = (Receiver)eResolveProxy(oldReceivers);
            if (receivers != oldReceivers) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.NODE__RECEIVERS, oldReceivers, receivers));
            }
        }
        return receivers;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Receiver basicGetReceivers() {
        return receivers;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReceivers(Receiver newReceivers) {
        Receiver oldReceivers = receivers;
        receivers = newReceivers;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.NODE__RECEIVERS, oldReceivers, receivers));
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestSender> getTestSenders() {
        if (testSenders == null) {
            testSenders = new EObjectContainmentEList<TestSender>(TestSender.class, this, SCChartsPackage.NODE__TEST_SENDERS);
        }
        return testSenders;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TestReceiver> getTestReceivers() {
        if (testReceivers == null) {
            testReceivers = new EObjectContainmentEList<TestReceiver>(TestReceiver.class, this, SCChartsPackage.NODE__TEST_RECEIVERS);
        }
        return testReceivers;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.NODE__SENDERS:
                return ((InternalEList<?>)getSenders()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.NODE__TEST_SENDERS:
                return ((InternalEList<?>)getTestSenders()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.NODE__TEST_RECEIVERS:
                return ((InternalEList<?>)getTestReceivers()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.NODE__ID:
                return getId();
            case SCChartsPackage.NODE__LABEL:
                return getLabel();
            case SCChartsPackage.NODE__SENDERS:
                return getSenders();
            case SCChartsPackage.NODE__RECEIVERS:
                if (resolve) return getReceivers();
                return basicGetReceivers();
            case SCChartsPackage.NODE__TEST_SENDERS:
                return getTestSenders();
            case SCChartsPackage.NODE__TEST_RECEIVERS:
                return getTestReceivers();
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
            case SCChartsPackage.NODE__ID:
                setId((String)newValue);
                return;
            case SCChartsPackage.NODE__LABEL:
                setLabel((String)newValue);
                return;
            case SCChartsPackage.NODE__SENDERS:
                getSenders().clear();
                getSenders().addAll((Collection<? extends Sender>)newValue);
                return;
            case SCChartsPackage.NODE__RECEIVERS:
                setReceivers((Receiver)newValue);
                return;
            case SCChartsPackage.NODE__TEST_SENDERS:
                getTestSenders().clear();
                getTestSenders().addAll((Collection<? extends TestSender>)newValue);
                return;
            case SCChartsPackage.NODE__TEST_RECEIVERS:
                getTestReceivers().clear();
                getTestReceivers().addAll((Collection<? extends TestReceiver>)newValue);
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
            case SCChartsPackage.NODE__ID:
                setId(ID_EDEFAULT);
                return;
            case SCChartsPackage.NODE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case SCChartsPackage.NODE__SENDERS:
                getSenders().clear();
                return;
            case SCChartsPackage.NODE__RECEIVERS:
                setReceivers((Receiver)null);
                return;
            case SCChartsPackage.NODE__TEST_SENDERS:
                getTestSenders().clear();
                return;
            case SCChartsPackage.NODE__TEST_RECEIVERS:
                getTestReceivers().clear();
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
            case SCChartsPackage.NODE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case SCChartsPackage.NODE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case SCChartsPackage.NODE__SENDERS:
                return senders != null && !senders.isEmpty();
            case SCChartsPackage.NODE__RECEIVERS:
                return receivers != null;
            case SCChartsPackage.NODE__TEST_SENDERS:
                return testSenders != null && !testSenders.isEmpty();
            case SCChartsPackage.NODE__TEST_RECEIVERS:
                return testReceivers != null && !testReceivers.isEmpty();
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
        result.append(", label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //NodeImpl
