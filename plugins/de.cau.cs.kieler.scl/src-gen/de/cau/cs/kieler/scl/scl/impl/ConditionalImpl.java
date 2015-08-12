/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.Statement;

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
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends StatementSequenceImpl implements Conditional {
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
     * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> declarations;

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
        return SclPackage.Literals.CONDITIONAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONDITIONAL__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONDITIONAL__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONDITIONAL__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONDITIONAL__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SclPackage.CONDITIONAL__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Statement> getElseStatements() {
        if (elseStatements == null) {
            elseStatements = new EObjectContainmentEList<Statement>(Statement.class, this, SclPackage.CONDITIONAL__ELSE_STATEMENTS);
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
            case SclPackage.CONDITIONAL__EXPRESSION:
                return basicSetExpression(null, msgs);
            case SclPackage.CONDITIONAL__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
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
            case SclPackage.CONDITIONAL__EXPRESSION:
                return getExpression();
            case SclPackage.CONDITIONAL__DECLARATIONS:
                return getDeclarations();
            case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
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
            case SclPackage.CONDITIONAL__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case SclPackage.CONDITIONAL__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
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
            case SclPackage.CONDITIONAL__EXPRESSION:
                setExpression((Expression)null);
                return;
            case SclPackage.CONDITIONAL__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
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
            case SclPackage.CONDITIONAL__EXPRESSION:
                return expression != null;
            case SclPackage.CONDITIONAL__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
                return elseStatements != null && !elseStatements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ConditionalImpl
