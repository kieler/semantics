/**
 */
package scg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scg.Assignment;
import scg.Node;
import scg.ScgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scg.impl.AssignmentImpl#getNext <em>Next</em>}</li>
 *   <li>{@link scg.impl.AssignmentImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends NodeImpl implements Assignment {
    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected Node next;

    /**
     * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignment()
     * @generated
     * @ordered
     */
    protected static final String ASSIGNMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssignment()
     * @generated
     * @ordered
     */
    protected String assignment = ASSIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getNext() {
        if (next != null && next.eIsProxy()) {
            InternalEObject oldNext = (InternalEObject)next;
            next = (Node)eResolveProxy(oldNext);
            if (next != oldNext) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.ASSIGNMENT__NEXT, oldNext, next));
            }
        }
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node basicGetNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNext(Node newNext) {
        Node oldNext = next;
        next = newNext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__NEXT, oldNext, next));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAssignment() {
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssignment(String newAssignment) {
        String oldAssignment = assignment;
        assignment = newAssignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.ASSIGNMENT__ASSIGNMENT, oldAssignment, assignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgPackage.ASSIGNMENT__NEXT:
                if (resolve) return getNext();
                return basicGetNext();
            case ScgPackage.ASSIGNMENT__ASSIGNMENT:
                return getAssignment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ScgPackage.ASSIGNMENT__NEXT:
                setNext((Node)newValue);
                return;
            case ScgPackage.ASSIGNMENT__ASSIGNMENT:
                setAssignment((String)newValue);
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
            case ScgPackage.ASSIGNMENT__NEXT:
                setNext((Node)null);
                return;
            case ScgPackage.ASSIGNMENT__ASSIGNMENT:
                setAssignment(ASSIGNMENT_EDEFAULT);
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
            case ScgPackage.ASSIGNMENT__NEXT:
                return next != null;
            case ScgPackage.ASSIGNMENT__ASSIGNMENT:
                return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
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
        result.append(" (Assignment: ");
        result.append(assignment);
        result.append(')');
        return result.toString();
    }

} //AssignmentImpl
