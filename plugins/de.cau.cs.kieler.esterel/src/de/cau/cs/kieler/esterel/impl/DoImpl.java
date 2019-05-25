/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.DelayExpression;
import de.cau.cs.kieler.esterel.Do;
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
 * An implementation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DoImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DoImpl#getWatchingAnnotations <em>Watching Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DoImpl#getWatching <em>Watching</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DoImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DoImpl#getWatchingStatements <em>Watching Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoImpl extends StatementImpl implements Do {
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
     * The cached value of the '{@link #getWatchingAnnotations() <em>Watching Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWatchingAnnotations()
     * @generated
     * @ordered
     */
    protected EList<Annotation> watchingAnnotations;

    /**
     * The cached value of the '{@link #getWatching() <em>Watching</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWatching()
     * @generated
     * @ordered
     */
    protected DelayExpression watching;

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
     * The cached value of the '{@link #getWatchingStatements() <em>Watching Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWatchingStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> watchingStatements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.DO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.DO__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Annotation> getWatchingAnnotations() {
        if (watchingAnnotations == null) {
            watchingAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.DO__WATCHING_ANNOTATIONS);
        }
        return watchingAnnotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DelayExpression getWatching() {
        return watching;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWatching(DelayExpression newWatching, NotificationChain msgs) {
        DelayExpression oldWatching = watching;
        watching = newWatching;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__WATCHING, oldWatching, newWatching);
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
    public void setWatching(DelayExpression newWatching) {
        if (newWatching != watching) {
            NotificationChain msgs = null;
            if (watching != null)
                msgs = ((InternalEObject)watching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__WATCHING, null, msgs);
            if (newWatching != null)
                msgs = ((InternalEObject)newWatching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__WATCHING, null, msgs);
            msgs = basicSetWatching(newWatching, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__WATCHING, newWatching, newWatching));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__DELAY, oldDelay, newDelay);
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
    public void setDelay(DelayExpression newDelay) {
        if (newDelay != delay) {
            NotificationChain msgs = null;
            if (delay != null)
                msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__DELAY, null, msgs);
            if (newDelay != null)
                msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__DELAY, null, msgs);
            msgs = basicSetDelay(newDelay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__DELAY, newDelay, newDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getWatchingStatements() {
        if (watchingStatements == null) {
            watchingStatements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.DO__WATCHING_STATEMENTS);
        }
        return watchingStatements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.DO__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case EsterelPackage.DO__WATCHING_ANNOTATIONS:
                return ((InternalEList<?>)getWatchingAnnotations()).basicRemove(otherEnd, msgs);
            case EsterelPackage.DO__WATCHING:
                return basicSetWatching(null, msgs);
            case EsterelPackage.DO__DELAY:
                return basicSetDelay(null, msgs);
            case EsterelPackage.DO__WATCHING_STATEMENTS:
                return ((InternalEList<?>)getWatchingStatements()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.DO__STATEMENTS:
                return getStatements();
            case EsterelPackage.DO__WATCHING_ANNOTATIONS:
                return getWatchingAnnotations();
            case EsterelPackage.DO__WATCHING:
                return getWatching();
            case EsterelPackage.DO__DELAY:
                return getDelay();
            case EsterelPackage.DO__WATCHING_STATEMENTS:
                return getWatchingStatements();
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
            case EsterelPackage.DO__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case EsterelPackage.DO__WATCHING_ANNOTATIONS:
                getWatchingAnnotations().clear();
                getWatchingAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case EsterelPackage.DO__WATCHING:
                setWatching((DelayExpression)newValue);
                return;
            case EsterelPackage.DO__DELAY:
                setDelay((DelayExpression)newValue);
                return;
            case EsterelPackage.DO__WATCHING_STATEMENTS:
                getWatchingStatements().clear();
                getWatchingStatements().addAll((Collection<? extends Statement>)newValue);
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
            case EsterelPackage.DO__STATEMENTS:
                getStatements().clear();
                return;
            case EsterelPackage.DO__WATCHING_ANNOTATIONS:
                getWatchingAnnotations().clear();
                return;
            case EsterelPackage.DO__WATCHING:
                setWatching((DelayExpression)null);
                return;
            case EsterelPackage.DO__DELAY:
                setDelay((DelayExpression)null);
                return;
            case EsterelPackage.DO__WATCHING_STATEMENTS:
                getWatchingStatements().clear();
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
            case EsterelPackage.DO__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case EsterelPackage.DO__WATCHING_ANNOTATIONS:
                return watchingAnnotations != null && !watchingAnnotations.isEmpty();
            case EsterelPackage.DO__WATCHING:
                return watching != null;
            case EsterelPackage.DO__DELAY:
                return delay != null;
            case EsterelPackage.DO__WATCHING_STATEMENTS:
                return watchingStatements != null && !watchingStatements.isEmpty();
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
                case EsterelPackage.DO__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
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
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return EsterelPackage.DO__STATEMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //DoImpl
