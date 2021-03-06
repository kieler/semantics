/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.Conditional;
import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.SequencePart;
import de.cau.cs.kieler.scl.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ConditionalImpl#isSemicolon <em>Semicolon</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ConditionalImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.ConditionalImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalImpl extends ScopeImpl implements Conditional {
    /**
     * The default value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected static final boolean SEMICOLON_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSemicolon() <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSemicolon()
     * @generated
     * @ordered
     */
    protected boolean semicolon = SEMICOLON_EDEFAULT;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

    /**
     * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElse()
     * @generated
     * @ordered
     */
    protected Scope else_;

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
        return SCLPackage.Literals.CONDITIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSemicolon() {
        return semicolon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSemicolon(boolean newSemicolon) {
        boolean oldSemicolon = semicolon;
        semicolon = newSemicolon;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.CONDITIONAL__SEMICOLON, oldSemicolon, semicolon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        Expression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.CONDITIONAL__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExpression(Expression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.CONDITIONAL__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.CONDITIONAL__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.CONDITIONAL__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Scope getElse() {
        return else_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElse(Scope newElse, NotificationChain msgs) {
        Scope oldElse = else_;
        else_ = newElse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.CONDITIONAL__ELSE, oldElse, newElse);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElse(Scope newElse) {
        if (newElse != else_) {
            NotificationChain msgs = null;
            if (else_ != null)
                msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.CONDITIONAL__ELSE, null, msgs);
            if (newElse != null)
                msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.CONDITIONAL__ELSE, null, msgs);
            msgs = basicSetElse(newElse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.CONDITIONAL__ELSE, newElse, newElse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCLPackage.CONDITIONAL__EXPRESSION:
                return basicSetExpression(null, msgs);
            case SCLPackage.CONDITIONAL__ELSE:
                return basicSetElse(null, msgs);
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
            case SCLPackage.CONDITIONAL__SEMICOLON:
                return isSemicolon();
            case SCLPackage.CONDITIONAL__EXPRESSION:
                return getExpression();
            case SCLPackage.CONDITIONAL__ELSE:
                return getElse();
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
            case SCLPackage.CONDITIONAL__SEMICOLON:
                setSemicolon((Boolean)newValue);
                return;
            case SCLPackage.CONDITIONAL__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case SCLPackage.CONDITIONAL__ELSE:
                setElse((Scope)newValue);
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
            case SCLPackage.CONDITIONAL__SEMICOLON:
                setSemicolon(SEMICOLON_EDEFAULT);
                return;
            case SCLPackage.CONDITIONAL__EXPRESSION:
                setExpression((Expression)null);
                return;
            case SCLPackage.CONDITIONAL__ELSE:
                setElse((Scope)null);
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
            case SCLPackage.CONDITIONAL__SEMICOLON:
                return semicolon != SEMICOLON_EDEFAULT;
            case SCLPackage.CONDITIONAL__EXPRESSION:
                return expression != null;
            case SCLPackage.CONDITIONAL__ELSE:
                return else_ != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == SequencePart.class) {
            switch (derivedFeatureID) {
                case SCLPackage.CONDITIONAL__SEMICOLON: return SCLPackage.SEQUENCE_PART__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == SequencePart.class) {
            switch (baseFeatureID) {
                case SCLPackage.SEQUENCE_PART__SEMICOLON: return SCLPackage.CONDITIONAL__SEMICOLON;
                default: return -1;
            }
        }
        if (baseClass == Statement.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (semicolon: ");
        result.append(semicolon);
        result.append(')');
        return result.toString();
    }

} //ConditionalImpl
