/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Constraint;
import uml.DataType;
import uml.Interface;
import uml.Operation;
import uml.Parameter;
import uml.ParameterableElement;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OperationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
    /**
     * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateParameter()
     * @generated
     * @ordered
     */
    protected TemplateParameter templateParameter;

    /**
     * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateBinding()
     * @generated
     * @ordered
     */
    protected EList<TemplateBinding> templateBinding;

    /**
     * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedTemplateSignature()
     * @generated
     * @ordered
     */
    protected TemplateSignature ownedTemplateSignature;

    /**
     * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsQuery()
     * @generated
     * @ordered
     */
    protected static final boolean IS_QUERY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsQuery()
     * @generated
     * @ordered
     */
    protected boolean isQuery = IS_QUERY_EDEFAULT;

    /**
     * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ORDERED_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNIQUE_EDEFAULT = true;

    /**
     * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected static final int LOWER_EDEFAULT = 1;

    /**
     * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected static final int UPPER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> precondition;

    /**
     * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostcondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> postcondition;

    /**
     * The cached value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedOperation()
     * @generated
     * @ordered
     */
    protected EList<Operation> redefinedOperation;

    /**
     * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyCondition()
     * @generated
     * @ordered
     */
    protected Constraint bodyCondition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getOperation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getOwningTemplateParameter() {
        if (eContainerFeatureID() != UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER) return null;
        return (TemplateParameter)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
        if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
            if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwningTemplateParameter != null)
                msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter getTemplateParameter() {
        if (templateParameter != null && templateParameter.eIsProxy()) {
            InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
            templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
            if (templateParameter != oldTemplateParameter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
            }
        }
        return templateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter basicGetTemplateParameter() {
        return templateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
        TemplateParameter oldTemplateParameter = templateParameter;
        templateParameter = newTemplateParameter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplateParameter(TemplateParameter newTemplateParameter) {
        if (newTemplateParameter != templateParameter) {
            NotificationChain msgs = null;
            if (templateParameter != null)
                msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            if (newTemplateParameter != null)
                msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TemplateBinding> getTemplateBinding() {
        if (templateBinding == null) {
            templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, UmlPackage.OPERATION__TEMPLATE_BINDING, UmlPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
        }
        return templateBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature getOwnedTemplateSignature() {
        return ownedTemplateSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
        TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
        ownedTemplateSignature = newOwnedTemplateSignature;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
        if (newOwnedTemplateSignature != ownedTemplateSignature) {
            NotificationChain msgs = null;
            if (ownedTemplateSignature != null)
                msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
            if (newOwnedTemplateSignature != null)
                msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, UmlPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
            msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface getInterface() {
        if (eContainerFeatureID() != UmlPackage.OPERATION__INTERFACE) return null;
        return (Interface)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInterface, UmlPackage.OPERATION__INTERFACE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface(Interface newInterface) {
        if (newInterface != eInternalContainer() || (eContainerFeatureID() != UmlPackage.OPERATION__INTERFACE && newInterface != null)) {
            if (EcoreUtil.isAncestor(this, newInterface))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInterface != null)
                msgs = ((InternalEObject)newInterface).eInverseAdd(this, UmlPackage.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
            msgs = basicSetInterface(newInterface, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__INTERFACE, newInterface, newInterface));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Class getClass_() {
        if (eContainerFeatureID() != UmlPackage.OPERATION__CLASS) return null;
        return (uml.Class)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClass(uml.Class newClass, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newClass, UmlPackage.OPERATION__CLASS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClass(uml.Class newClass) {
        if (newClass != eInternalContainer() || (eContainerFeatureID() != UmlPackage.OPERATION__CLASS && newClass != null)) {
            if (EcoreUtil.isAncestor(this, newClass))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newClass != null)
                msgs = ((InternalEObject)newClass).eInverseAdd(this, UmlPackage.CLASS__OWNED_OPERATION, uml.Class.class, msgs);
            msgs = basicSetClass(newClass, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__CLASS, newClass, newClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsQuery() {
        return isQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsQuery(boolean newIsQuery) {
        boolean oldIsQuery = isQuery;
        isQuery = newIsQuery;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__IS_QUERY, oldIsQuery, isQuery));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOrdered() {
        // TODO: implement this method to return the 'Is Ordered' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOrdered(boolean newIsOrdered) {
        // TODO: implement this method to set the 'Is Ordered' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnique() {
        // TODO: implement this method to return the 'Is Unique' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnique(boolean newIsUnique) {
        // TODO: implement this method to set the 'Is Unique' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLower() {
        // TODO: implement this method to return the 'Lower' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLower(int newLower) {
        // TODO: implement this method to set the 'Lower' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUpper() {
        // TODO: implement this method to return the 'Upper' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpper(int newUpper) {
        // TODO: implement this method to set the 'Upper' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getPrecondition() {
        if (precondition == null) {
            precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UmlPackage.OPERATION__PRECONDITION);
        }
        return precondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getPostcondition() {
        if (postcondition == null) {
            postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UmlPackage.OPERATION__POSTCONDITION);
        }
        return postcondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getRedefinedOperation() {
        if (redefinedOperation == null) {
            redefinedOperation = new EObjectResolvingEList<Operation>(Operation.class, this, UmlPackage.OPERATION__REDEFINED_OPERATION);
        }
        return redefinedOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDatatype() {
        if (eContainerFeatureID() != UmlPackage.OPERATION__DATATYPE) return null;
        return (DataType)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDatatype, UmlPackage.OPERATION__DATATYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDatatype(DataType newDatatype) {
        if (newDatatype != eInternalContainer() || (eContainerFeatureID() != UmlPackage.OPERATION__DATATYPE && newDatatype != null)) {
            if (EcoreUtil.isAncestor(this, newDatatype))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatatype != null)
                msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UmlPackage.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
            msgs = basicSetDatatype(newDatatype, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__DATATYPE, newDatatype, newDatatype));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getBodyCondition() {
        if (bodyCondition != null && bodyCondition.eIsProxy()) {
            InternalEObject oldBodyCondition = (InternalEObject)bodyCondition;
            bodyCondition = (Constraint)eResolveProxy(oldBodyCondition);
            if (bodyCondition != oldBodyCondition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
            }
        }
        return bodyCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint basicGetBodyCondition() {
        return bodyCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBodyCondition(Constraint newBodyCondition) {
        Constraint oldBodyCondition = bodyCondition;
        bodyCondition = newBodyCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type getType() {
        Type type = basicGetType();
        return type != null && type.eIsProxy() ? (Type)eResolveProxy((InternalEObject)type) : type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type basicGetType() {
        // TODO: implement this method to return the 'Type' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Type newType) {
        // TODO: implement this method to set the 'Type' reference
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean at_most_one_return(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.OPERATION__AT_MOST_ONE_RETURN,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "at_most_one_return", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean only_body_for_query(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.OPERATION__ONLY_BODY_FOR_QUERY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "only_body_for_query", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter getReturnResult() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOrdered() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isUnique() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int lowerBound() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int upperBound() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> returnResult() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterableElement> parameterableElements() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTemplate() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCompatibleWith(ParameterableElement p) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTemplateParameter() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                if (templateParameter != null)
                    msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
                return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                if (ownedTemplateSignature != null)
                    msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
                return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
            case UmlPackage.OPERATION__INTERFACE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInterface((Interface)otherEnd, msgs);
            case UmlPackage.OPERATION__CLASS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetClass((uml.Class)otherEnd, msgs);
            case UmlPackage.OPERATION__DATATYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDatatype((DataType)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                return basicSetOwningTemplateParameter(null, msgs);
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                return basicSetTemplateParameter(null, msgs);
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                return basicSetOwnedTemplateSignature(null, msgs);
            case UmlPackage.OPERATION__INTERFACE:
                return basicSetInterface(null, msgs);
            case UmlPackage.OPERATION__CLASS:
                return basicSetClass(null, msgs);
            case UmlPackage.OPERATION__DATATYPE:
                return basicSetDatatype(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
            case UmlPackage.OPERATION__INTERFACE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
            case UmlPackage.OPERATION__CLASS:
                return eInternalContainer().eInverseRemove(this, UmlPackage.CLASS__OWNED_OPERATION, uml.Class.class, msgs);
            case UmlPackage.OPERATION__DATATYPE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter();
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                if (resolve) return getTemplateParameter();
                return basicGetTemplateParameter();
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                return getTemplateBinding();
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                return getOwnedTemplateSignature();
            case UmlPackage.OPERATION__INTERFACE:
                return getInterface();
            case UmlPackage.OPERATION__CLASS:
                return getClass_();
            case UmlPackage.OPERATION__IS_QUERY:
                return isIsQuery();
            case UmlPackage.OPERATION__IS_ORDERED:
                return isIsOrdered();
            case UmlPackage.OPERATION__IS_UNIQUE:
                return isIsUnique();
            case UmlPackage.OPERATION__LOWER:
                return getLower();
            case UmlPackage.OPERATION__UPPER:
                return getUpper();
            case UmlPackage.OPERATION__PRECONDITION:
                return getPrecondition();
            case UmlPackage.OPERATION__POSTCONDITION:
                return getPostcondition();
            case UmlPackage.OPERATION__REDEFINED_OPERATION:
                return getRedefinedOperation();
            case UmlPackage.OPERATION__DATATYPE:
                return getDatatype();
            case UmlPackage.OPERATION__BODY_CONDITION:
                if (resolve) return getBodyCondition();
                return basicGetBodyCondition();
            case UmlPackage.OPERATION__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)newValue);
                return;
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
                return;
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)newValue);
                return;
            case UmlPackage.OPERATION__INTERFACE:
                setInterface((Interface)newValue);
                return;
            case UmlPackage.OPERATION__CLASS:
                setClass((uml.Class)newValue);
                return;
            case UmlPackage.OPERATION__IS_QUERY:
                setIsQuery((Boolean)newValue);
                return;
            case UmlPackage.OPERATION__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
                return;
            case UmlPackage.OPERATION__IS_UNIQUE:
                setIsUnique((Boolean)newValue);
                return;
            case UmlPackage.OPERATION__LOWER:
                setLower((Integer)newValue);
                return;
            case UmlPackage.OPERATION__UPPER:
                setUpper((Integer)newValue);
                return;
            case UmlPackage.OPERATION__PRECONDITION:
                getPrecondition().clear();
                getPrecondition().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.OPERATION__POSTCONDITION:
                getPostcondition().clear();
                getPostcondition().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.OPERATION__REDEFINED_OPERATION:
                getRedefinedOperation().clear();
                getRedefinedOperation().addAll((Collection<? extends Operation>)newValue);
                return;
            case UmlPackage.OPERATION__DATATYPE:
                setDatatype((DataType)newValue);
                return;
            case UmlPackage.OPERATION__BODY_CONDITION:
                setBodyCondition((Constraint)newValue);
                return;
            case UmlPackage.OPERATION__TYPE:
                setType((Type)newValue);
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
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                setOwningTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                setTemplateParameter((TemplateParameter)null);
                return;
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                getTemplateBinding().clear();
                return;
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                setOwnedTemplateSignature((TemplateSignature)null);
                return;
            case UmlPackage.OPERATION__INTERFACE:
                setInterface((Interface)null);
                return;
            case UmlPackage.OPERATION__CLASS:
                setClass((uml.Class)null);
                return;
            case UmlPackage.OPERATION__IS_QUERY:
                setIsQuery(IS_QUERY_EDEFAULT);
                return;
            case UmlPackage.OPERATION__IS_ORDERED:
                setIsOrdered(IS_ORDERED_EDEFAULT);
                return;
            case UmlPackage.OPERATION__IS_UNIQUE:
                setIsUnique(IS_UNIQUE_EDEFAULT);
                return;
            case UmlPackage.OPERATION__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case UmlPackage.OPERATION__UPPER:
                setUpper(UPPER_EDEFAULT);
                return;
            case UmlPackage.OPERATION__PRECONDITION:
                getPrecondition().clear();
                return;
            case UmlPackage.OPERATION__POSTCONDITION:
                getPostcondition().clear();
                return;
            case UmlPackage.OPERATION__REDEFINED_OPERATION:
                getRedefinedOperation().clear();
                return;
            case UmlPackage.OPERATION__DATATYPE:
                setDatatype((DataType)null);
                return;
            case UmlPackage.OPERATION__BODY_CONDITION:
                setBodyCondition((Constraint)null);
                return;
            case UmlPackage.OPERATION__TYPE:
                setType((Type)null);
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
            case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
                return getOwningTemplateParameter() != null;
            case UmlPackage.OPERATION__TEMPLATE_PARAMETER:
                return templateParameter != null;
            case UmlPackage.OPERATION__TEMPLATE_BINDING:
                return templateBinding != null && !templateBinding.isEmpty();
            case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
                return ownedTemplateSignature != null;
            case UmlPackage.OPERATION__INTERFACE:
                return getInterface() != null;
            case UmlPackage.OPERATION__CLASS:
                return getClass_() != null;
            case UmlPackage.OPERATION__IS_QUERY:
                return isQuery != IS_QUERY_EDEFAULT;
            case UmlPackage.OPERATION__IS_ORDERED:
                return isIsOrdered() != IS_ORDERED_EDEFAULT;
            case UmlPackage.OPERATION__IS_UNIQUE:
                return isIsUnique() != IS_UNIQUE_EDEFAULT;
            case UmlPackage.OPERATION__LOWER:
                return getLower() != LOWER_EDEFAULT;
            case UmlPackage.OPERATION__UPPER:
                return getUpper() != UPPER_EDEFAULT;
            case UmlPackage.OPERATION__PRECONDITION:
                return precondition != null && !precondition.isEmpty();
            case UmlPackage.OPERATION__POSTCONDITION:
                return postcondition != null && !postcondition.isEmpty();
            case UmlPackage.OPERATION__REDEFINED_OPERATION:
                return redefinedOperation != null && !redefinedOperation.isEmpty();
            case UmlPackage.OPERATION__DATATYPE:
                return getDatatype() != null;
            case UmlPackage.OPERATION__BODY_CONDITION:
                return bodyCondition != null;
            case UmlPackage.OPERATION__TYPE:
                return basicGetType() != null;
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
        if (baseClass == ParameterableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.OPERATION__TEMPLATE_PARAMETER: return UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.OPERATION__TEMPLATE_BINDING: return UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
                case UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
        if (baseClass == ParameterableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UmlPackage.OPERATION__OWNING_TEMPLATE_PARAMETER;
                case UmlPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UmlPackage.OPERATION__TEMPLATE_PARAMETER;
                default: return -1;
            }
        }
        if (baseClass == TemplateableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UmlPackage.OPERATION__TEMPLATE_BINDING;
                case UmlPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UmlPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isQuery: ");
        result.append(isQuery);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
