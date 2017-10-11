/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.Await;
import de.cau.cs.kieler.esterel.Case;
import de.cau.cs.kieler.esterel.DelayExpression;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

import de.cau.cs.kieler.scl.impl.StatementImpl;

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
 * An implementation of the model object '<em><b>Await</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.AwaitImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.AwaitImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.AwaitImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwaitImpl extends StatementImpl implements Await {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected DelayExpression delay;

    /**
     * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCases()
     * @generated
     * @ordered
     */
    protected EList<Case> cases;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AwaitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.AWAIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.AWAIT__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayExpression getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelay(DelayExpression newDelay, NotificationChain msgs) {
        DelayExpression oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.AWAIT__DELAY, oldDelay, newDelay);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(DelayExpression newDelay) {
        if (newDelay != delay) {
            NotificationChain msgs = null;
            if (delay != null)
                msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.AWAIT__DELAY, null, msgs);
            if (newDelay != null)
                msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.AWAIT__DELAY, null, msgs);
            msgs = basicSetDelay(newDelay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.AWAIT__DELAY, newDelay, newDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Case> getCases() {
        if (cases == null) {
            cases = new EObjectContainmentEList<Case>(Case.class, this, EsterelPackage.AWAIT__CASES);
        }
        return cases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.AWAIT__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case EsterelPackage.AWAIT__DELAY:
                return basicSetDelay(null, msgs);
            case EsterelPackage.AWAIT__CASES:
                return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.AWAIT__STATEMENTS:
                return getStatements();
            case EsterelPackage.AWAIT__DELAY:
                return getDelay();
            case EsterelPackage.AWAIT__CASES:
                return getCases();
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
            case EsterelPackage.AWAIT__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case EsterelPackage.AWAIT__DELAY:
                setDelay((DelayExpression)newValue);
                return;
            case EsterelPackage.AWAIT__CASES:
                getCases().clear();
                getCases().addAll((Collection<? extends Case>)newValue);
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
            case EsterelPackage.AWAIT__STATEMENTS:
                getStatements().clear();
                return;
            case EsterelPackage.AWAIT__DELAY:
                setDelay((DelayExpression)null);
                return;
            case EsterelPackage.AWAIT__CASES:
                getCases().clear();
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
            case EsterelPackage.AWAIT__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case EsterelPackage.AWAIT__DELAY:
                return delay != null;
            case EsterelPackage.AWAIT__CASES:
                return cases != null && !cases.isEmpty();
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
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
                case EsterelPackage.AWAIT__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
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
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return EsterelPackage.AWAIT__STATEMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AwaitImpl
