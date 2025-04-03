/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.kexpressions.Declaration;

import de.cau.cs.kieler.kexpressions.impl.MethodDeclarationImpl;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.scl.MethodImplementationDeclaration;
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
 * An implementation of the model object '<em><b>Method Implementation Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.MethodImplementationDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.MethodImplementationDeclarationImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.MethodImplementationDeclarationImpl#isImplemented <em>Implemented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImplementationDeclarationImpl extends MethodDeclarationImpl implements MethodImplementationDeclaration {
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
     * The default value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImplemented()
     * @generated
     * @ordered
     */
    protected static final boolean IMPLEMENTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImplemented()
     * @generated
     * @ordered
     */
    protected boolean implemented = IMPLEMENTED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodImplementationDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCLPackage.Literals.METHOD_IMPLEMENTATION_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS);
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
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isImplemented() {
        return implemented;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImplemented(boolean newImplemented) {
        boolean oldImplemented = implemented;
        implemented = newImplemented;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED, oldImplemented, implemented));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS:
                return getDeclarations();
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS:
                return getStatements();
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED:
                return isImplemented();
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
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED:
                setImplemented((Boolean)newValue);
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
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS:
                getStatements().clear();
                return;
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED:
                setImplemented(IMPLEMENTED_EDEFAULT);
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
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__IMPLEMENTED:
                return implemented != IMPLEMENTED_EDEFAULT;
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
                case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS: return KExtPackage.DECLARATION_SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
                case SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
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
        if (baseClass == DeclarationScope.class) {
            switch (baseFeatureID) {
                case KExtPackage.DECLARATION_SCOPE__DECLARATIONS: return SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return SCLPackage.METHOD_IMPLEMENTATION_DECLARATION__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
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
        result.append(" (implemented: ");
        result.append(implemented);
        result.append(')');
        return result.toString();
    }

} //MethodImplementationDeclarationImpl
