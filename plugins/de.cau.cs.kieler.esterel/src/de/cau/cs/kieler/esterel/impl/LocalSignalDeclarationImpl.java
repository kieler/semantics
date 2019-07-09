/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.LocalSignalDeclaration;

import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ValuedObject;

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
 * An implementation of the model object '<em><b>Local Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalSignalDeclarationImpl extends StatementImpl implements LocalSignalDeclaration {
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
     * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObjects()
     * @generated
     * @ordered
     */
    protected EList<ValuedObject> valuedObjects;

    /**
     * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final AccessModifier ACCESS_EDEFAULT = AccessModifier.PUBLIC;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected AccessModifier access = ACCESS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalSignalDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.LOCAL_SIGNAL_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ValuedObject> getValuedObjects() {
        if (valuedObjects == null) {
            valuedObjects = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS);
        }
        return valuedObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessModifier getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccess(AccessModifier newAccess) {
        AccessModifier oldAccess = access;
        access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS, oldAccess, access));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS:
                return ((InternalEList<?>)getValuedObjects()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS:
                return getStatements();
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS:
                return getValuedObjects();
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS:
                return getAccess();
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
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                getValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
                return;
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS:
                setAccess((AccessModifier)newValue);
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
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS:
                getStatements().clear();
                return;
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS:
                getValuedObjects().clear();
                return;
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS:
                setAccess(ACCESS_EDEFAULT);
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
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS:
                return valuedObjects != null && !valuedObjects.isEmpty();
            case EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS:
                return access != ACCESS_EDEFAULT;
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
                case EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Declaration.class) {
            switch (derivedFeatureID) {
                case EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS: return KExpressionsPackage.DECLARATION__VALUED_OBJECTS;
                case EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS: return KExpressionsPackage.DECLARATION__ACCESS;
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
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return EsterelPackage.LOCAL_SIGNAL_DECLARATION__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Declaration.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.DECLARATION__VALUED_OBJECTS: return EsterelPackage.LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS;
                case KExpressionsPackage.DECLARATION__ACCESS: return EsterelPackage.LOCAL_SIGNAL_DECLARATION__ACCESS;
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
        result.append(" (access: ");
        result.append(access);
        result.append(')');
        return result.toString();
    }

} //LocalSignalDeclarationImpl
