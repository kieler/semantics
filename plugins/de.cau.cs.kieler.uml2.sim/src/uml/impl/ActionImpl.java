/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Action;
import uml.Classifier;
import uml.Constraint;
import uml.InputPin;
import uml.OutputPin;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ActionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link uml.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link uml.impl.ActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uml.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link uml.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends ExecutableNodeImpl implements Action {
    /**
     * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalPrecondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> localPrecondition;

    /**
     * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalPostcondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> localPostcondition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputPin> getOutput() {
        // TODO: implement this method to return the 'Output' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InputPin> getInput() {
        // TODO: implement this method to return the 'Input' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getContext() {
        Classifier context = basicGetContext();
        return context != null && context.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)context) : context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetContext() {
        // TODO: implement this method to return the 'Context' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getLocalPrecondition() {
        if (localPrecondition == null) {
            localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UmlPackage.ACTION__LOCAL_PRECONDITION);
        }
        return localPrecondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getLocalPostcondition() {
        if (localPostcondition == null) {
            localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UmlPackage.ACTION__LOCAL_POSTCONDITION);
        }
        return localPostcondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.ACTION__LOCAL_PRECONDITION:
                return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTION__LOCAL_POSTCONDITION:
                return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.ACTION__OUTPUT:
                return getOutput();
            case UmlPackage.ACTION__INPUT:
                return getInput();
            case UmlPackage.ACTION__CONTEXT:
                if (resolve) return getContext();
                return basicGetContext();
            case UmlPackage.ACTION__LOCAL_PRECONDITION:
                return getLocalPrecondition();
            case UmlPackage.ACTION__LOCAL_POSTCONDITION:
                return getLocalPostcondition();
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
            case UmlPackage.ACTION__LOCAL_PRECONDITION:
                getLocalPrecondition().clear();
                getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.ACTION__LOCAL_POSTCONDITION:
                getLocalPostcondition().clear();
                getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
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
            case UmlPackage.ACTION__LOCAL_PRECONDITION:
                getLocalPrecondition().clear();
                return;
            case UmlPackage.ACTION__LOCAL_POSTCONDITION:
                getLocalPostcondition().clear();
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
            case UmlPackage.ACTION__OUTPUT:
                return !getOutput().isEmpty();
            case UmlPackage.ACTION__INPUT:
                return !getInput().isEmpty();
            case UmlPackage.ACTION__CONTEXT:
                return basicGetContext() != null;
            case UmlPackage.ACTION__LOCAL_PRECONDITION:
                return localPrecondition != null && !localPrecondition.isEmpty();
            case UmlPackage.ACTION__LOCAL_POSTCONDITION:
                return localPostcondition != null && !localPostcondition.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActionImpl
