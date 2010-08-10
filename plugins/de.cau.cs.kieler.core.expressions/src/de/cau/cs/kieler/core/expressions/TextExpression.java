/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TextExpression is an Expression containing arbitrary text. It is used to
 * escape to a host language such as C or Java. This way arbitrary host code
 * can be used as parameters for operators, other functions or values.
 * <!-- end-model-doc -->
 *
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTextExpression()
 * @model
 * @generated
 */
public interface TextExpression extends ComplexExpression, TextualCode {
} // TextExpression
