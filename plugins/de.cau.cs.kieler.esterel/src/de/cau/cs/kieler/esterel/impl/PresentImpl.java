/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Present;
import de.cau.cs.kieler.esterel.PresentCase;

import de.cau.cs.kieler.kexpressions.Expression;

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
 * An implementation of the model object '<em><b>Present</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.PresentImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.PresentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.PresentImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.PresentImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentImpl extends StatementImpl implements Present {
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
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

    /**
     * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCases()
     * @generated
     * @ordered
     */
    protected EList<PresentCase> cases;

    /**
     * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElseStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> elseStatements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PresentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.PRESENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.PRESENT__STATEMENTS);
        }
        return statements;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__EXPRESSION, oldExpression, newExpression);
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
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<PresentCase> getCases() {
        if (cases == null) {
            cases = new EObjectContainmentEList<PresentCase>(PresentCase.class, this, EsterelPackage.PRESENT__CASES);
        }
        return cases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getElseStatements() {
        if (elseStatements == null) {
            elseStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.PRESENT__ELSE_STATEMENTS);
        }
        return elseStatements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.PRESENT__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case EsterelPackage.PRESENT__EXPRESSION:
                return basicSetExpression(null, msgs);
            case EsterelPackage.PRESENT__CASES:
                return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
            case EsterelPackage.PRESENT__ELSE_STATEMENTS:
                return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.PRESENT__STATEMENTS:
                return getStatements();
            case EsterelPackage.PRESENT__EXPRESSION:
                return getExpression();
            case EsterelPackage.PRESENT__CASES:
                return getCases();
            case EsterelPackage.PRESENT__ELSE_STATEMENTS:
                return getElseStatements();
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
            case EsterelPackage.PRESENT__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case EsterelPackage.PRESENT__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case EsterelPackage.PRESENT__CASES:
                getCases().clear();
                getCases().addAll((Collection<? extends PresentCase>)newValue);
                return;
            case EsterelPackage.PRESENT__ELSE_STATEMENTS:
                getElseStatements().clear();
                getElseStatements().addAll((Collection<? extends Statement>)newValue);
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
            case EsterelPackage.PRESENT__STATEMENTS:
                getStatements().clear();
                return;
            case EsterelPackage.PRESENT__EXPRESSION:
                setExpression((Expression)null);
                return;
            case EsterelPackage.PRESENT__CASES:
                getCases().clear();
                return;
            case EsterelPackage.PRESENT__ELSE_STATEMENTS:
                getElseStatements().clear();
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
            case EsterelPackage.PRESENT__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case EsterelPackage.PRESENT__EXPRESSION:
                return expression != null;
            case EsterelPackage.PRESENT__CASES:
                return cases != null && !cases.isEmpty();
            case EsterelPackage.PRESENT__ELSE_STATEMENTS:
                return elseStatements != null && !elseStatements.isEmpty();
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
                case EsterelPackage.PRESENT__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
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
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return EsterelPackage.PRESENT__STATEMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PresentImpl
