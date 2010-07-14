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
 * A representation of the model object '<em><b>Textual Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TextualCode carries an arbitrary String. It is used as an escape to external host languages
 * such as C or Java. A type String can be used to specify what kind of language is represented
 * by the code String.
 * Subclasses such as TextExpression or TextEffect (synccharts metamodel) can be used to employ it in the
 * corresponding context. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.TextualCode#getCode <em>Code</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.expressions.TextualCode#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTextualCode()
 * @model
 * @generated
 */
public interface TextualCode extends EObject {
    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #setCode(String)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTextualCode_Code()
     * @model required="true"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.TextualCode#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #getCode()
     * @generated
     */
    void setCode(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTextualCode_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.TextualCode#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // TextualCode
