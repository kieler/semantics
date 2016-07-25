/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import de.cau.cs.kieler.core.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base Class for Variables and Signals. A ValuedObject has a name and may carry a value. 
 * Therefore the class has a type attribute which specifies the type of the value. 
 * The type might either be given from a predefined list of internal (primitive) types or by the hostType String that 
 * references some type in the target language, e.g. a Type in C or Java. An initial value can be given in String format.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getValuedObject()
 * @model
 * @generated
 */
public interface ValuedObject extends Annotatable {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getValuedObject_Name()
	 * @model required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.esterel.kexpressions.ValueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.ValueType
	 * @see #setType(ValueType)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getValuedObject_Type()
	 * @model required="true"
	 * @generated
	 */
    ValueType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.ValueType
	 * @see #getType()
	 * @generated
	 */
    void setType(ValueType value);

    /**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getValuedObject_InitialValue()
	 * @model
	 * @generated
	 */
    String getInitialValue();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
    void setInitialValue(String value);

    /**
	 * Returns the value of the '<em><b>Host Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Host Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Type</em>' attribute.
	 * @see #setHostType(String)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getValuedObject_HostType()
	 * @model
	 * @generated
	 */
    String getHostType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.ValuedObject#getHostType <em>Host Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Type</em>' attribute.
	 * @see #getHostType()
	 * @generated
	 */
    void setHostType(String value);

} // ValuedObject
