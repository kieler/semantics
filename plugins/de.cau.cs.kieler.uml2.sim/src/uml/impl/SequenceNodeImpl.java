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

import uml.ExecutableNode;
import uml.SequenceNode;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.SequenceNodeImpl#getExecutableNode <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceNodeImpl extends StructuredActivityNodeImpl implements SequenceNode {
    /**
     * The cached value of the '{@link #getExecutableNode() <em>Executable Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutableNode()
     * @generated
     * @ordered
     */
    protected EList<ExecutableNode> executableNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SequenceNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getSequenceNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExecutableNode> getExecutableNode() {
        if (executableNode == null) {
            executableNode = new EObjectContainmentEList<ExecutableNode>(ExecutableNode.class, this, UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE);
        }
        return executableNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE:
                return ((InternalEList<?>)getExecutableNode()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE:
                return getExecutableNode();
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
            case UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE:
                getExecutableNode().clear();
                getExecutableNode().addAll((Collection<? extends ExecutableNode>)newValue);
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
            case UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE:
                getExecutableNode().clear();
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
            case UmlPackage.SEQUENCE_NODE__EXECUTABLE_NODE:
                return executableNode != null && !executableNode.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SequenceNodeImpl
