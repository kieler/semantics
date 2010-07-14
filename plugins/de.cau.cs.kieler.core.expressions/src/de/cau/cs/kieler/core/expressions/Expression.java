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

import org.eclipse.emf.ecore.EObject;

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
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
} // Expression
