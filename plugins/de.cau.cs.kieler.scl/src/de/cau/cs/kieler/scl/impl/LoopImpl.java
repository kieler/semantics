/**
 */
package de.cau.cs.kieler.scl.impl;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.VariableDeclaration;

import de.cau.cs.kieler.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.kexpressions.keffects.Effect;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.scl.Loop;
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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getInitializationDeclaration <em>Initialization Declaration</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.impl.LoopImpl#getAfterthought <em>Afterthought</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends StatementImpl implements Loop {
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
     * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialization()
     * @generated
     * @ordered
     */
    protected Assignment initialization;

    /**
     * The cached value of the '{@link #getInitializationDeclaration() <em>Initialization Declaration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitializationDeclaration()
     * @generated
     * @ordered
     */
    protected VariableDeclaration initializationDeclaration;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Expression condition;

    /**
     * The cached value of the '{@link #getAfterthought() <em>Afterthought</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAfterthought()
     * @generated
     * @ordered
     */
    protected Assignment afterthought;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCLPackage.Literals.LOOP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCLPackage.LOOP__DECLARATIONS);
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
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, SCLPackage.LOOP__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment getInitialization() {
        return initialization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialization(Assignment newInitialization, NotificationChain msgs) {
        Assignment oldInitialization = initialization;
        initialization = newInitialization;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__INITIALIZATION, oldInitialization, newInitialization);
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
    public void setInitialization(Assignment newInitialization) {
        if (newInitialization != initialization) {
            NotificationChain msgs = null;
            if (initialization != null)
                msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__INITIALIZATION, null, msgs);
            if (newInitialization != null)
                msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__INITIALIZATION, null, msgs);
            msgs = basicSetInitialization(newInitialization, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__INITIALIZATION, newInitialization, newInitialization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VariableDeclaration getInitializationDeclaration() {
        return initializationDeclaration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitializationDeclaration(VariableDeclaration newInitializationDeclaration, NotificationChain msgs) {
        VariableDeclaration oldInitializationDeclaration = initializationDeclaration;
        initializationDeclaration = newInitializationDeclaration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__INITIALIZATION_DECLARATION, oldInitializationDeclaration, newInitializationDeclaration);
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
    public void setInitializationDeclaration(VariableDeclaration newInitializationDeclaration) {
        if (newInitializationDeclaration != initializationDeclaration) {
            NotificationChain msgs = null;
            if (initializationDeclaration != null)
                msgs = ((InternalEObject)initializationDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__INITIALIZATION_DECLARATION, null, msgs);
            if (newInitializationDeclaration != null)
                msgs = ((InternalEObject)newInitializationDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__INITIALIZATION_DECLARATION, null, msgs);
            msgs = basicSetInitializationDeclaration(newInitializationDeclaration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__INITIALIZATION_DECLARATION, newInitializationDeclaration, newInitializationDeclaration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Expression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
        Expression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__CONDITION, oldCondition, newCondition);
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
    public void setCondition(Expression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment getAfterthought() {
        return afterthought;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAfterthought(Assignment newAfterthought, NotificationChain msgs) {
        Assignment oldAfterthought = afterthought;
        afterthought = newAfterthought;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__AFTERTHOUGHT, oldAfterthought, newAfterthought);
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
    public void setAfterthought(Assignment newAfterthought) {
        if (newAfterthought != afterthought) {
            NotificationChain msgs = null;
            if (afterthought != null)
                msgs = ((InternalEObject)afterthought).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__AFTERTHOUGHT, null, msgs);
            if (newAfterthought != null)
                msgs = ((InternalEObject)newAfterthought).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCLPackage.LOOP__AFTERTHOUGHT, null, msgs);
            msgs = basicSetAfterthought(newAfterthought, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCLPackage.LOOP__AFTERTHOUGHT, newAfterthought, newAfterthought));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCLPackage.LOOP__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SCLPackage.LOOP__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
            case SCLPackage.LOOP__INITIALIZATION:
                return basicSetInitialization(null, msgs);
            case SCLPackage.LOOP__INITIALIZATION_DECLARATION:
                return basicSetInitializationDeclaration(null, msgs);
            case SCLPackage.LOOP__CONDITION:
                return basicSetCondition(null, msgs);
            case SCLPackage.LOOP__AFTERTHOUGHT:
                return basicSetAfterthought(null, msgs);
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
            case SCLPackage.LOOP__DECLARATIONS:
                return getDeclarations();
            case SCLPackage.LOOP__STATEMENTS:
                return getStatements();
            case SCLPackage.LOOP__INITIALIZATION:
                return getInitialization();
            case SCLPackage.LOOP__INITIALIZATION_DECLARATION:
                return getInitializationDeclaration();
            case SCLPackage.LOOP__CONDITION:
                return getCondition();
            case SCLPackage.LOOP__AFTERTHOUGHT:
                return getAfterthought();
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
            case SCLPackage.LOOP__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCLPackage.LOOP__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
                return;
            case SCLPackage.LOOP__INITIALIZATION:
                setInitialization((Assignment)newValue);
                return;
            case SCLPackage.LOOP__INITIALIZATION_DECLARATION:
                setInitializationDeclaration((VariableDeclaration)newValue);
                return;
            case SCLPackage.LOOP__CONDITION:
                setCondition((Expression)newValue);
                return;
            case SCLPackage.LOOP__AFTERTHOUGHT:
                setAfterthought((Assignment)newValue);
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
            case SCLPackage.LOOP__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SCLPackage.LOOP__STATEMENTS:
                getStatements().clear();
                return;
            case SCLPackage.LOOP__INITIALIZATION:
                setInitialization((Assignment)null);
                return;
            case SCLPackage.LOOP__INITIALIZATION_DECLARATION:
                setInitializationDeclaration((VariableDeclaration)null);
                return;
            case SCLPackage.LOOP__CONDITION:
                setCondition((Expression)null);
                return;
            case SCLPackage.LOOP__AFTERTHOUGHT:
                setAfterthought((Assignment)null);
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
            case SCLPackage.LOOP__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SCLPackage.LOOP__STATEMENTS:
                return statements != null && !statements.isEmpty();
            case SCLPackage.LOOP__INITIALIZATION:
                return initialization != null;
            case SCLPackage.LOOP__INITIALIZATION_DECLARATION:
                return initializationDeclaration != null;
            case SCLPackage.LOOP__CONDITION:
                return condition != null;
            case SCLPackage.LOOP__AFTERTHOUGHT:
                return afterthought != null;
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
                case SCLPackage.LOOP__DECLARATIONS: return KExtPackage.DECLARATION_SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
                case SCLPackage.LOOP__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
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
                case KExtPackage.DECLARATION_SCOPE__DECLARATIONS: return SCLPackage.LOOP__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return SCLPackage.LOOP__STATEMENTS;
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

} //LoopImpl
