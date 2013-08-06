/**
 */
package scg.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scg.Conditional;
import scg.Node;
import scg.ScgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scg.impl.ConditionalImpl#getThen <em>Then</em>}</li>
 *   <li>{@link scg.impl.ConditionalImpl#getElse <em>Else</em>}</li>
 *   <li>{@link scg.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends NodeImpl implements Conditional {
    /**
     * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThen()
     * @generated
     * @ordered
     */
    protected Node then;

    /**
     * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElse()
     * @generated
     * @ordered
     */
    protected Node else_;

    /**
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected String condition = CONDITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.CONDITIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getThen() {
        if (then != null && then.eIsProxy()) {
            InternalEObject oldThen = (InternalEObject)then;
            then = (Node)eResolveProxy(oldThen);
            if (then != oldThen) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.CONDITIONAL__THEN, oldThen, then));
            }
        }
        return then;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node basicGetThen() {
        return then;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThen(Node newThen) {
        Node oldThen = then;
        then = newThen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__THEN, oldThen, then));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getElse() {
        if (else_ != null && else_.eIsProxy()) {
            InternalEObject oldElse = (InternalEObject)else_;
            else_ = (Node)eResolveProxy(oldElse);
            if (else_ != oldElse) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.CONDITIONAL__ELSE, oldElse, else_));
            }
        }
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node basicGetElse() {
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElse(Node newElse) {
        Node oldElse = else_;
        else_ = newElse;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__ELSE, oldElse, else_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(String newCondition) {
        String oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.CONDITIONAL__CONDITION, oldCondition, condition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgPackage.CONDITIONAL__THEN:
                if (resolve) return getThen();
                return basicGetThen();
            case ScgPackage.CONDITIONAL__ELSE:
                if (resolve) return getElse();
                return basicGetElse();
            case ScgPackage.CONDITIONAL__CONDITION:
                return getCondition();
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
            case ScgPackage.CONDITIONAL__THEN:
                setThen((Node)newValue);
                return;
            case ScgPackage.CONDITIONAL__ELSE:
                setElse((Node)newValue);
                return;
            case ScgPackage.CONDITIONAL__CONDITION:
                setCondition((String)newValue);
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
            case ScgPackage.CONDITIONAL__THEN:
                setThen((Node)null);
                return;
            case ScgPackage.CONDITIONAL__ELSE:
                setElse((Node)null);
                return;
            case ScgPackage.CONDITIONAL__CONDITION:
                setCondition(CONDITION_EDEFAULT);
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
            case ScgPackage.CONDITIONAL__THEN:
                return then != null;
            case ScgPackage.CONDITIONAL__ELSE:
                return else_ != null;
            case ScgPackage.CONDITIONAL__CONDITION:
                return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
        result.append(" (Condition: ");
        result.append(condition);
        result.append(')');
        return result.toString();
    }

} //ConditionalImpl
