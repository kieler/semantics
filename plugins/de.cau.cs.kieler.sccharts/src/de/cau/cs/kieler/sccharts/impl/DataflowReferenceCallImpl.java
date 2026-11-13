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

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.impl.ReferenceCallImpl;
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator;
import de.cau.cs.kieler.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;
import de.cau.cs.kieler.sccharts.DataflowReferenceCall;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataflow Reference Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DataflowReferenceCallImpl#isSequential <em>Sequential</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataflowReferenceCallImpl extends ReferenceCallImpl implements DataflowReferenceCall {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList<Annotation> annotations;

    /**
     * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> outgoingLinks;

    /**
     * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> incomingLinks;

    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference reference;

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
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final AssignOperator OPERATOR_EDEFAULT = AssignOperator.ASSIGN;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected AssignOperator operator = OPERATOR_EDEFAULT;

    /**
     * The default value of the '{@link #isSequential() <em>Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSequential()
     * @generated
     * @ordered
     */
    protected static final boolean SEQUENTIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSequential() <em>Sequential</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSequential()
     * @generated
     * @ordered
     */
    protected boolean sequential = SEQUENTIAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataflowReferenceCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.DATAFLOW_REFERENCE_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getOutgoingLinks() {
        if (outgoingLinks == null) {
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS);
        }
        return outgoingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getIncomingLinks() {
        if (incomingLinks == null) {
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public ValuedObjectReference getReference() {
        // Beware! Hidden magic.
        return reference != null ? reference : this;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReference(ValuedObjectReference newReference, NotificationChain msgs) {
        ValuedObjectReference oldReference = reference;
        reference = newReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE, oldReference, newReference);
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
    public void setReference(ValuedObjectReference newReference) {
        if (newReference != reference) {
            NotificationChain msgs = null;
            if (reference != null)
                msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE, null, msgs);
            if (newReference != null)
                msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE, null, msgs);
            msgs = basicSetReference(newReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE, newReference, newReference));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION, oldExpression, newExpression);
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
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssignOperator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperator(AssignOperator newOperator) {
        AssignOperator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR, oldOperator, operator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSequential() {
        return sequential;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequential(boolean newSequential) {
        boolean oldSequential = sequential;
        sequential = newSequential;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.DATAFLOW_REFERENCE_CALL__SEQUENTIAL, oldSequential, sequential));
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE:
                return basicSetReference(null, msgs);
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS:
                return getAnnotations();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS:
                return getOutgoingLinks();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                return getIncomingLinks();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE:
                return getReference();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION:
                return getExpression();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR:
                return getOperator();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__SEQUENTIAL:
                return isSequential();
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE:
                setReference((ValuedObjectReference)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR:
                setOperator((AssignOperator)newValue);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__SEQUENTIAL:
                setSequential((Boolean)newValue);
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE:
                setReference((ValuedObjectReference)null);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION:
                setExpression((Expression)null);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
                return;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__SEQUENTIAL:
                setSequential(SEQUENTIAL_EDEFAULT);
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
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE:
                return reference != null;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION:
                return expression != null;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
            case SCChartsPackage.DATAFLOW_REFERENCE_CALL__SEQUENTIAL:
                return sequential != SEQUENTIAL_EDEFAULT;
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
        if (baseClass == Annotatable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == Effect.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Assignment.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE: return KEffectsPackage.ASSIGNMENT__REFERENCE;
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION: return KEffectsPackage.ASSIGNMENT__EXPRESSION;
                case SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR: return KEffectsPackage.ASSIGNMENT__OPERATOR;
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
        if (baseClass == Annotatable.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == Effect.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Assignment.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.ASSIGNMENT__REFERENCE: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__REFERENCE;
                case KEffectsPackage.ASSIGNMENT__EXPRESSION: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__EXPRESSION;
                case KEffectsPackage.ASSIGNMENT__OPERATOR: return SCChartsPackage.DATAFLOW_REFERENCE_CALL__OPERATOR;
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
        result.append(" (operator: ");
        result.append(operator);
        result.append(", sequential: ");
        result.append(sequential);
        result.append(')');
        return result.toString();
    }

} //DataflowReferenceCallImpl
