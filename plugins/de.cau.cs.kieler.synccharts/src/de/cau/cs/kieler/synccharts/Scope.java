/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.core.kexpressions.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * translated into proper Interface objects (e.g. Signals and Variables). For example the SyncCharts editor uses
 * an Xtext grammar/parser to do this.
 * <p>
 * A Scope may carry lists of entry-, inner- or exit {@link Action}s that are executed on either Scope entry, staying a tick
 * in the Scope or exiting the Scope. A suspensionTrigger Action guards the suspension of a Scope. When this trigger
 * is evaluated to true, then the contents of the Scope is no longer evaluated until the guard gets false again.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getBodyReference <em>Body Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getBodyContents <em>Body Contents</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getRenamings <em>Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Scope#getInterfaceDeclaration <em>Interface Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope()
 * @model abstract="true"
 * @generated
 */
public interface Scope extends Annotatable {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_Id()
	 * @model
	 * @generated
	 */
    String getId();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
    void setId(String value);

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
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_Label()
	 * @model
	 * @generated
	 */
    String getLabel();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
    void setLabel(String value);

    /**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Signal}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_Signals()
	 * @model containment="true"
	 * @generated
	 */
    EList<Signal> getSignals();

    /**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Variable}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_Variables()
	 * @model containment="true"
	 * @generated
	 */
    EList<Variable> getVariables();

    /**
	 * Returns the value of the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suspension Trigger</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspension Trigger</em>' containment reference.
	 * @see #setSuspensionTrigger(Action)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_SuspensionTrigger()
	 * @model containment="true"
	 * @generated
	 */
    Action getSuspensionTrigger();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getSuspensionTrigger <em>Suspension Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspension Trigger</em>' containment reference.
	 * @see #getSuspensionTrigger()
	 * @generated
	 */
    void setSuspensionTrigger(Action value);

    /**
	 * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_ExitActions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Action> getExitActions();

    /**
	 * Returns the value of the '<em><b>Inner Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_InnerActions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Action> getInnerActions();

    /**
	 * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_EntryActions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Action> getEntryActions();

    /**
	 * Returns the value of the '<em><b>Body Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Reference</em>' reference.
	 * @see #setBodyReference(EObject)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_BodyReference()
	 * @model
	 * @generated
	 */
    EObject getBodyReference();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getBodyReference <em>Body Reference</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Reference</em>' reference.
	 * @see #getBodyReference()
	 * @generated
	 */
    void setBodyReference(EObject value);

    /**
	 * Returns the value of the '<em><b>Body Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body Contents</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Contents</em>' containment reference.
	 * @see #setBodyContents(EObject)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_BodyContents()
	 * @model containment="true"
	 * @generated
	 */
    EObject getBodyContents();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getBodyContents <em>Body Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Contents</em>' containment reference.
	 * @see #getBodyContents()
	 * @generated
	 */
    void setBodyContents(EObject value);

    /**
	 * Returns the value of the '<em><b>Body Text</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.TextualCode}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body Text</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Text</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_BodyText()
	 * @model containment="true"
	 * @generated
	 */
    EList<TextualCode> getBodyText();

    /**
	 * Returns the value of the '<em><b>Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Substitution}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Substitution#getParentScope <em>Parent Scope</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Renamings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamings</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_Renamings()
	 * @see de.cau.cs.kieler.synccharts.Substitution#getParentScope
	 * @model opposite="parentScope" containment="true"
	 * @generated
	 */
    EList<Substitution> getRenamings();

    /**
	 * Returns the value of the '<em><b>Interface Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Declaration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Declaration</em>' attribute.
	 * @see #setInterfaceDeclaration(String)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getScope_InterfaceDeclaration()
	 * @model dataType="de.cau.cs.kieler.synccharts.Parsable"
	 * @generated
	 */
    String getInterfaceDeclaration();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Scope#getInterfaceDeclaration <em>Interface Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Declaration</em>' attribute.
	 * @see #getInterfaceDeclaration()
	 * @generated
	 */
    void setInterfaceDeclaration(String value);

} // Scope
