/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A multiplicity element embeds this information to specify the allowable cardinalities for an instantiation of this element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.MultiplicityElement#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.MultiplicityElement#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface MultiplicityElement extends Element {
    /**
     * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are sequentially ordered.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Ordered</em>' attribute.
     * @see #setIsOrdered(boolean)
     * @see uml.UmlPackage#getMultiplicityElement_IsOrdered()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsOrdered();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Ordered</em>' attribute.
     * @see #isIsOrdered()
     * @generated
     */
    void setIsOrdered(boolean value);

    /**
     * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this element are unique.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Unique</em>' attribute.
     * @see #setIsUnique(boolean)
     * @see uml.UmlPackage#getMultiplicityElement_IsUnique()
     * @model default="true" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsUnique();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#isIsUnique <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Unique</em>' attribute.
     * @see #isIsUnique()
     * @generated
     */
    void setIsUnique(boolean value);

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the upper bound of the multiplicity interval.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(int)
     * @see uml.UmlPackage#getMultiplicityElement_Upper()
     * @model default="1" dataType="uml.UnlimitedNatural" transient="true" volatile="true" derived="true" ordered="false"
     * @generated
     */
    int getUpper();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(int value);

    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the lower bound of the multiplicity interval.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #setLower(int)
     * @see uml.UmlPackage#getMultiplicityElement_Lower()
     * @model default="1" dataType="uml.Integer" transient="true" volatile="true" derived="true" ordered="false"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

    /**
     * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The specification of the upper bound for this multiplicity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upper Value</em>' containment reference.
     * @see #setUpperValue(ValueSpecification)
     * @see uml.UmlPackage#getMultiplicityElement_UpperValue()
     * @model containment="true" ordered="false"
     * @generated
     */
    ValueSpecification getUpperValue();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#getUpperValue <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Value</em>' containment reference.
     * @see #getUpperValue()
     * @generated
     */
    void setUpperValue(ValueSpecification value);

    /**
     * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The specification of the lower bound for this multiplicity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lower Value</em>' containment reference.
     * @see #setLowerValue(ValueSpecification)
     * @see uml.UmlPackage#getMultiplicityElement_LowerValue()
     * @model containment="true" ordered="false"
     * @generated
     */
    ValueSpecification getLowerValue();

    /**
     * Sets the value of the '{@link uml.MultiplicityElement#getLowerValue <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Value</em>' containment reference.
     * @see #getLowerValue()
     * @generated
     */
    void setLowerValue(ValueSpecification value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A multiplicity must define at least one valid cardinality that is greater than zero.
     * upperBound()->notEmpty() implies upperBound() > 0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean upper_gt_0(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The lower bound must be a non-negative integer literal.
     * lowerBound()->notEmpty() implies lowerBound() >= 0
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean lower_ge_0(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The upper bound must be greater than or equal to the lower bound.
     * (upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean upper_ge_lower(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating that specification must not have side effects.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean value_specification_no_side_effects(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a non-literal ValueSpecification is used for the lower or upper bound, then that specification must be a constant expression.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean value_specification_constant(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query isMultivalued() checks whether this multiplicity has an upper bound greater than one.
     * upperBound()->notEmpty()
     * result = upperBound() > 1
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isMultivalued();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query includesCardinality() checks whether the specified cardinality is valid for this multiplicity.
     * upperBound()->notEmpty() and lowerBound()->notEmpty()
     * result = (lowerBound() <= C) and (upperBound() >= C)
     * <!-- end-model-doc -->
     * @model dataType="uml.Boolean" required="true" ordered="false" CDataType="uml.Integer" CRequired="true" COrdered="false"
     * @generated
     */
    boolean includesCardinality(int C);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query includesMultiplicity() checks whether this multiplicity includes all the cardinalities allowed by the specified multiplicity.
     * self.upperBound()->notEmpty() and self.lowerBound()->notEmpty() and M.upperBound()->notEmpty() and M.lowerBound()->notEmpty()
     * result = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())
     * <!-- end-model-doc -->
     * @model dataType="uml.Boolean" required="true" ordered="false" MRequired="true" MOrdered="false"
     * @generated
     */
    boolean includesMultiplicity(MultiplicityElement M);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query lowerBound() returns the lower bound of the multiplicity as an integer.
     * result = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif
     * <!-- end-model-doc -->
     * @model dataType="uml.Integer" required="true" ordered="false"
     * @generated
     */
    int lowerBound();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query upperBound() returns the upper bound of the multiplicity for a bounded multiplicity as an unlimited natural.
     * result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif
     * <!-- end-model-doc -->
     * @model dataType="uml.UnlimitedNatural" required="true" ordered="false"
     * @generated
     */
    int upperBound();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operation compatibleWith takes another multiplicity as input. It checks if one multiplicity is compatible with another.
     * result = Integer.allInstances()->forAll(i : Integer | self.includesCardinality(i) implies other.includesCardinality(i))
     * <!-- end-model-doc -->
     * @model dataType="uml.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
     * @generated
     */
    boolean compatibleWith(MultiplicityElement other);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operation is determines if the upper and lower bound of the ranges are the ones given.
     * result = (lowerbound = self.lowerbound and upperbound = self.upperbound)
     * <!-- end-model-doc -->
     * @model dataType="uml.Boolean" required="true" ordered="false" lowerboundDataType="uml.Integer" lowerboundRequired="true" lowerboundOrdered="false" upperboundDataType="uml.Integer" upperboundRequired="true" upperboundOrdered="false"
     * @generated
     */
    boolean is(int lowerbound, int upperbound);

} // MultiplicityElement
