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

import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.sccharts.DefineNode;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl#getValuedObjects <em>Valued Objects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.DefineNodeImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefineNodeImpl extends NodeImpl implements DefineNode {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
    protected EList<Declaration> inputs;

    /**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
    protected EList<Declaration> outputs;

    /**
	 * The cached value of the '{@link #getValuedObjects() <em>Valued Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValuedObjects()
	 * @generated
	 * @ordered
	 */
    protected EList<ValuedObject> valuedObjects;

    /**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
    protected EList<Expression> expressions;

    /**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
    protected EList<State> states;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DefineNodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SCChartsPackage.Literals.DEFINE_NODE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Declaration> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.DEFINE_NODE__INPUTS);
		}
		return inputs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Declaration> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.DEFINE_NODE__OUTPUTS);
		}
		return outputs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ValuedObject> getValuedObjects() {
		if (valuedObjects == null) {
			valuedObjects = new EObjectResolvingEList<ValuedObject>(ValuedObject.class, this, SCChartsPackage.DEFINE_NODE__VALUED_OBJECTS);
		}
		return valuedObjects;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, SCChartsPackage.DEFINE_NODE__EXPRESSIONS);
		}
		return expressions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, SCChartsPackage.DEFINE_NODE__STATES);
		}
		return states;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCChartsPackage.DEFINE_NODE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.DEFINE_NODE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.DEFINE_NODE__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.DEFINE_NODE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case SCChartsPackage.DEFINE_NODE__INPUTS:
				return getInputs();
			case SCChartsPackage.DEFINE_NODE__OUTPUTS:
				return getOutputs();
			case SCChartsPackage.DEFINE_NODE__VALUED_OBJECTS:
				return getValuedObjects();
			case SCChartsPackage.DEFINE_NODE__EXPRESSIONS:
				return getExpressions();
			case SCChartsPackage.DEFINE_NODE__STATES:
				return getStates();
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
			case SCChartsPackage.DEFINE_NODE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Declaration>)newValue);
				return;
			case SCChartsPackage.DEFINE_NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Declaration>)newValue);
				return;
			case SCChartsPackage.DEFINE_NODE__VALUED_OBJECTS:
				getValuedObjects().clear();
				getValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
				return;
			case SCChartsPackage.DEFINE_NODE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
				return;
			case SCChartsPackage.DEFINE_NODE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case SCChartsPackage.DEFINE_NODE__INPUTS:
				getInputs().clear();
				return;
			case SCChartsPackage.DEFINE_NODE__OUTPUTS:
				getOutputs().clear();
				return;
			case SCChartsPackage.DEFINE_NODE__VALUED_OBJECTS:
				getValuedObjects().clear();
				return;
			case SCChartsPackage.DEFINE_NODE__EXPRESSIONS:
				getExpressions().clear();
				return;
			case SCChartsPackage.DEFINE_NODE__STATES:
				getStates().clear();
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
			case SCChartsPackage.DEFINE_NODE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case SCChartsPackage.DEFINE_NODE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case SCChartsPackage.DEFINE_NODE__VALUED_OBJECTS:
				return valuedObjects != null && !valuedObjects.isEmpty();
			case SCChartsPackage.DEFINE_NODE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case SCChartsPackage.DEFINE_NODE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefineNodeImpl
