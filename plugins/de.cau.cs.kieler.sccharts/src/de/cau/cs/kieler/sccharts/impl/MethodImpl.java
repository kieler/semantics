/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.kexpressions.AccessModifier;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.ValueType;

import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;
import de.cau.cs.kieler.sccharts.Method;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;
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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.MethodImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends ValuedObjectImpl implements Method {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

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
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected EList<ScheduleObjectReference> schedule;

    /**
     * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected static final ValueType RETURN_TYPE_EDEFAULT = ValueType.PURE;

    /**
     * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected ValueType returnType = RETURN_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> parameterDeclarations;

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
    protected MethodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.METHOD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.METHOD__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, SCChartsPackage.METHOD__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, SCChartsPackage.METHOD__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueType getReturnType() {
        return returnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReturnType(ValueType newReturnType) {
        ValueType oldReturnType = returnType;
        returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getParameterDeclarations() {
        if (parameterDeclarations == null) {
            parameterDeclarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.METHOD__PARAMETER_DECLARATIONS);
        }
        return parameterDeclarations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.METHOD__ACCESS, oldAccess, access));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.METHOD__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.METHOD__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.METHOD__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.METHOD__PARAMETER_DECLARATIONS:
                return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.METHOD__DECLARATIONS:
                return getDeclarations();
            case SCChartsPackage.METHOD__STATEMENTS:
                return getStatements();
            case SCChartsPackage.METHOD__SCHEDULE:
                return getSchedule();
            case SCChartsPackage.METHOD__RETURN_TYPE:
                return getReturnType();
            case SCChartsPackage.METHOD__PARAMETER_DECLARATIONS:
                return getParameterDeclarations();
            case SCChartsPackage.METHOD__ACCESS:
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
            case SCChartsPackage.METHOD__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCChartsPackage.METHOD__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case SCChartsPackage.METHOD__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case SCChartsPackage.METHOD__RETURN_TYPE:
                setReturnType((ValueType)newValue);
                return;
            case SCChartsPackage.METHOD__PARAMETER_DECLARATIONS:
                getParameterDeclarations().clear();
                getParameterDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCChartsPackage.METHOD__ACCESS:
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
            case SCChartsPackage.METHOD__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SCChartsPackage.METHOD__STATEMENTS:
                getStatements().clear();
                return;
            case SCChartsPackage.METHOD__SCHEDULE:
                getSchedule().clear();
                return;
            case SCChartsPackage.METHOD__RETURN_TYPE:
                setReturnType(RETURN_TYPE_EDEFAULT);
                return;
            case SCChartsPackage.METHOD__PARAMETER_DECLARATIONS:
                getParameterDeclarations().clear();
                return;
            case SCChartsPackage.METHOD__ACCESS:
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
            case SCChartsPackage.METHOD__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SCChartsPackage.METHOD__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case SCChartsPackage.METHOD__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case SCChartsPackage.METHOD__RETURN_TYPE:
                return returnType != RETURN_TYPE_EDEFAULT;
            case SCChartsPackage.METHOD__PARAMETER_DECLARATIONS:
                return parameterDeclarations != null && !parameterDeclarations.isEmpty();
            case SCChartsPackage.METHOD__ACCESS:
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
        if (baseClass == DeclarationScope.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.METHOD__DECLARATIONS: return KExtPackage.DECLARATION_SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.METHOD__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Schedulable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.METHOD__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
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
        if (baseClass == DeclarationScope.class) {
            switch (baseFeatureID) {
                case KExtPackage.DECLARATION_SCOPE__DECLARATIONS: return SCChartsPackage.METHOD__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return SCChartsPackage.METHOD__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Schedulable.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return SCChartsPackage.METHOD__SCHEDULE;
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
        result.append(" (returnType: ");
        result.append(returnType);
        result.append(", access: ");
        result.append(access);
        result.append(')');
        return result.toString();
    }

} //MethodImpl
