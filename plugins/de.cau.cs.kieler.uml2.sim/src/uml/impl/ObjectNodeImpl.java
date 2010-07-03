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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Behavior;
import uml.ObjectNode;
import uml.ObjectNodeOrderingKind;
import uml.State;
import uml.Type;
import uml.TypedElement;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uml.impl.ObjectNodeImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link uml.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link uml.impl.ObjectNodeImpl#getInState <em>In State</em>}</li>
 *   <li>{@link uml.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Type type;

    /**
     * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdering()
     * @generated
     * @ordered
     */
    protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO;

    /**
     * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrdering()
     * @generated
     * @ordered
     */
    protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

    /**
     * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsControlType()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsControlType()
     * @generated
     * @ordered
     */
    protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperBound()
     * @generated
     * @ordered
     */
    protected ValueSpecification upperBound;

    /**
     * The cached value of the '{@link #getInState() <em>In State</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInState()
     * @generated
     * @ordered
     */
    protected EList<State> inState;

    /**
     * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelection()
     * @generated
     * @ordered
     */
    protected Behavior selection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getObjectNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (Type)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.OBJECT_NODE__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Type newType) {
        Type oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNodeOrderingKind getOrdering() {
        return ordering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrdering(ObjectNodeOrderingKind newOrdering) {
        ObjectNodeOrderingKind oldOrdering = ordering;
        ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__ORDERING, oldOrdering, ordering));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsControlType() {
        return isControlType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsControlType(boolean newIsControlType) {
        boolean oldIsControlType = isControlType;
        isControlType = newIsControlType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType, isControlType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getUpperBound() {
        return upperBound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
        ValueSpecification oldUpperBound = upperBound;
        upperBound = newUpperBound;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound, newUpperBound);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperBound(ValueSpecification newUpperBound) {
        if (newUpperBound != upperBound) {
            NotificationChain msgs = null;
            if (upperBound != null)
                msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
            if (newUpperBound != null)
                msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
            msgs = basicSetUpperBound(newUpperBound, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound, newUpperBound));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<State> getInState() {
        if (inState == null) {
            inState = new EObjectResolvingEList<State>(State.class, this, UmlPackage.OBJECT_NODE__IN_STATE);
        }
        return inState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getSelection() {
        if (selection != null && selection.eIsProxy()) {
            InternalEObject oldSelection = (InternalEObject)selection;
            selection = (Behavior)eResolveProxy(oldSelection);
            if (selection != oldSelection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
            }
        }
        return selection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior basicGetSelection() {
        return selection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelection(Behavior newSelection) {
        Behavior oldSelection = selection;
        selection = newSelection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean object_flow_edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.OBJECT_NODE__OBJECT_FLOW_EDGES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "object_flow_edges", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean not_unique(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.OBJECT_NODE__NOT_UNIQUE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "not_unique", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean selection_behavior(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.OBJECT_NODE__SELECTION_BEHAVIOR,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "selection_behavior", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean input_output_parameter(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.OBJECT_NODE__INPUT_OUTPUT_PARAMETER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "input_output_parameter", EObjectValidator.getObjectLabel(this, context) }),
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.OBJECT_NODE__UPPER_BOUND:
                return basicSetUpperBound(null, msgs);
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
            case UmlPackage.OBJECT_NODE__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case UmlPackage.OBJECT_NODE__ORDERING:
                return getOrdering();
            case UmlPackage.OBJECT_NODE__IS_CONTROL_TYPE:
                return isIsControlType();
            case UmlPackage.OBJECT_NODE__UPPER_BOUND:
                return getUpperBound();
            case UmlPackage.OBJECT_NODE__IN_STATE:
                return getInState();
            case UmlPackage.OBJECT_NODE__SELECTION:
                if (resolve) return getSelection();
                return basicGetSelection();
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
            case UmlPackage.OBJECT_NODE__TYPE:
                setType((Type)newValue);
                return;
            case UmlPackage.OBJECT_NODE__ORDERING:
                setOrdering((ObjectNodeOrderingKind)newValue);
                return;
            case UmlPackage.OBJECT_NODE__IS_CONTROL_TYPE:
                setIsControlType((Boolean)newValue);
                return;
            case UmlPackage.OBJECT_NODE__UPPER_BOUND:
                setUpperBound((ValueSpecification)newValue);
                return;
            case UmlPackage.OBJECT_NODE__IN_STATE:
                getInState().clear();
                getInState().addAll((Collection<? extends State>)newValue);
                return;
            case UmlPackage.OBJECT_NODE__SELECTION:
                setSelection((Behavior)newValue);
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
            case UmlPackage.OBJECT_NODE__TYPE:
                setType((Type)null);
                return;
            case UmlPackage.OBJECT_NODE__ORDERING:
                setOrdering(ORDERING_EDEFAULT);
                return;
            case UmlPackage.OBJECT_NODE__IS_CONTROL_TYPE:
                setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
                return;
            case UmlPackage.OBJECT_NODE__UPPER_BOUND:
                setUpperBound((ValueSpecification)null);
                return;
            case UmlPackage.OBJECT_NODE__IN_STATE:
                getInState().clear();
                return;
            case UmlPackage.OBJECT_NODE__SELECTION:
                setSelection((Behavior)null);
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
            case UmlPackage.OBJECT_NODE__TYPE:
                return type != null;
            case UmlPackage.OBJECT_NODE__ORDERING:
                return ordering != ORDERING_EDEFAULT;
            case UmlPackage.OBJECT_NODE__IS_CONTROL_TYPE:
                return isControlType != IS_CONTROL_TYPE_EDEFAULT;
            case UmlPackage.OBJECT_NODE__UPPER_BOUND:
                return upperBound != null;
            case UmlPackage.OBJECT_NODE__IN_STATE:
                return inState != null && !inState.isEmpty();
            case UmlPackage.OBJECT_NODE__SELECTION:
                return selection != null;
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
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.OBJECT_NODE__TYPE: return UmlPackage.TYPED_ELEMENT__TYPE;
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
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TYPED_ELEMENT__TYPE: return UmlPackage.OBJECT_NODE__TYPE;
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
        result.append(" (ordering: ");
        result.append(ordering);
        result.append(", isControlType: ");
        result.append(isControlType);
        result.append(')');
        return result.toString();
    }

} //ObjectNodeImpl
