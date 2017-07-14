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
package de.cau.cs.kieler.sccharts;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.kexpressions.Identifiable;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Scope is the abstract superclass for State and Region. 
 * <p>
 * The fields label and id are there to identify such object, where the label
 * may be an arbitrary String and the id may be used as identifier in programming languages. Therefore the
 * id should be unique within its containing scope, should start with a word character (letter, underscore) and should not
 * contain whitespace.
 * <p>
 * The interfaceDeclaration is a String text field containing the interface declaration in a textual representation. 
 * The user of a model instance needs to take care that this textual representation gets parsed correctly and 
 * translated into proper Interface objects (e.g. Signals and Variables). For example the sccharts editor uses
 * an Xtext grammar/parser to do this.
 * <p>
 * A Scope may carry lists of entry-, inner- or exit {@link Action}s that are executed on either Scope entry, staying a tick
 * in the Scope or exiting the Scope. A suspensionTrigger Action guards the suspension of a Scope. When this trigger
 * is evaluated to true, then the contents of the Scope is no longer evaluated until the guard gets false again.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Scope#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Scope#getActions <em>Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Scope#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScope()
 * @model abstract="true"
 * @generated
 */
public interface Scope extends Annotatable, DeclarationScope, Identifiable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScope_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Scope#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.sccharts.LocalAction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actions</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScope_Actions()
     * @model containment="true"
     * @generated
     */
    EList<LocalAction> getActions();

    /**
     * Returns the value of the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' containment reference.
     * @see #setReference(ScopeCall)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getScope_Reference()
     * @model containment="true"
     * @generated
     */
    ScopeCall getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Scope#getReference <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' containment reference.
     * @see #getReference()
     * @generated
     */
    void setReference(ScopeCall value);

} // Scope
