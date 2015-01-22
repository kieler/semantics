/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.scgprios.Dependency_P;
import de.cau.cs.kieler.scgprios.Link_P;
import de.cau.cs.kieler.scgprios.Node_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Node_PImpl#getNodePriority <em>Node Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Node_PImpl extends AnnotatableImpl implements Node_P {
    /**
     * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncoming()
     * @generated
     * @ordered
     */
    protected EList<Link_P> incoming;

    /**
     * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INITIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
    protected boolean isInitial = IS_INITIAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencies()
     * @generated
     * @ordered
     */
    protected EList<Dependency_P> dependencies;

    /**
     * The default value of the '{@link #getNodePriority() <em>Node Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodePriority()
     * @generated
     * @ordered
     */
    protected static final long NODE_PRIORITY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNodePriority() <em>Node Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodePriority()
     * @generated
     * @ordered
     */
    protected long nodePriority = NODE_PRIORITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Node_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.NODE_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link_P> getIncoming() {
        if (incoming == null) {
            incoming = new EObjectWithInverseResolvingEList<Link_P>(Link_P.class, this, ScgpriosPackage.NODE_P__INCOMING, ScgpriosPackage.LINK_P__TARGET);
        }
        return incoming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsInitial() {
        return isInitial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsInitial(boolean newIsInitial) {
        boolean oldIsInitial = isInitial;
        isInitial = newIsInitial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.NODE_P__IS_INITIAL, oldIsInitial, isInitial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Dependency_P> getDependencies() {
        if (dependencies == null) {
            dependencies = new EObjectContainmentEList<Dependency_P>(Dependency_P.class, this, ScgpriosPackage.NODE_P__DEPENDENCIES);
        }
        return dependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getNodePriority() {
        return nodePriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNodePriority(long newNodePriority) {
        long oldNodePriority = nodePriority;
        nodePriority = newNodePriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.NODE_P__NODE_PRIORITY, oldNodePriority, nodePriority));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.NODE_P__INCOMING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.NODE_P__INCOMING:
                return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.NODE_P__DEPENDENCIES:
                return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
            case ScgpriosPackage.NODE_P__INCOMING:
                return getIncoming();
            case ScgpriosPackage.NODE_P__IS_INITIAL:
                return isIsInitial();
            case ScgpriosPackage.NODE_P__DEPENDENCIES:
                return getDependencies();
            case ScgpriosPackage.NODE_P__NODE_PRIORITY:
                return getNodePriority();
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
            case ScgpriosPackage.NODE_P__INCOMING:
                getIncoming().clear();
                getIncoming().addAll((Collection<? extends Link_P>)newValue);
                return;
            case ScgpriosPackage.NODE_P__IS_INITIAL:
                setIsInitial((Boolean)newValue);
                return;
            case ScgpriosPackage.NODE_P__DEPENDENCIES:
                getDependencies().clear();
                getDependencies().addAll((Collection<? extends Dependency_P>)newValue);
                return;
            case ScgpriosPackage.NODE_P__NODE_PRIORITY:
                setNodePriority((Long)newValue);
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
            case ScgpriosPackage.NODE_P__INCOMING:
                getIncoming().clear();
                return;
            case ScgpriosPackage.NODE_P__IS_INITIAL:
                setIsInitial(IS_INITIAL_EDEFAULT);
                return;
            case ScgpriosPackage.NODE_P__DEPENDENCIES:
                getDependencies().clear();
                return;
            case ScgpriosPackage.NODE_P__NODE_PRIORITY:
                setNodePriority(NODE_PRIORITY_EDEFAULT);
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
            case ScgpriosPackage.NODE_P__INCOMING:
                return incoming != null && !incoming.isEmpty();
            case ScgpriosPackage.NODE_P__IS_INITIAL:
                return isInitial != IS_INITIAL_EDEFAULT;
            case ScgpriosPackage.NODE_P__DEPENDENCIES:
                return dependencies != null && !dependencies.isEmpty();
            case ScgpriosPackage.NODE_P__NODE_PRIORITY:
                return nodePriority != NODE_PRIORITY_EDEFAULT;
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
        result.append(" (isInitial: ");
        result.append(isInitial);
        result.append(", nodePriority: ");
        result.append(nodePriority);
        result.append(')');
        return result.toString();
    }

} //Node_PImpl
