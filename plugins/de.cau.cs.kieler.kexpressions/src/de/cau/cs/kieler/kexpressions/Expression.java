/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expression is the supertype of all kinds of Expressions over Signals, Variables or Values. 
 * It is used as a simple common entry point. In this metamodel there are no more specializations avaliable
 * according to return value of the Expressions (e.g. BooleanExpression or ValuedExpression). These
 * might be provided by more specialized textual grammars for this metamodel.
 * <!-- end-model-doc -->
 *
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Expression extends Schedulable {
} // Expression
