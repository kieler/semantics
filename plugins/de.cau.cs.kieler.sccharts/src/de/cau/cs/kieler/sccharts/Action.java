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

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Action represents some effect that is executed under some
 * certain condition. The condition or sometimes called guard is
 * the trigger which simply is any boolean {@link Expression} over
 * {@link Signal}s or {@link Variable}s. Note that Actions may also be used
 * in contexts, where no trigger or resp. effects are allowed. E.g.
 * a suspensionTrigger has no effect.
 * <p>
 * The effects of an Action are either {@link Assignment}, {@link Emission} or escaping
 * to an {@link TextEffect}.
 * <p>
 * An Action has a String label that represents the trigger and the effects
 * list in a textual representation. The user of the 
 * model is required to synchronize the label with the actual
 * trigger and effects objects. For the sccharts graphical editor
 * this is done by using an Xtext grammar/parser.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Action#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Action#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Action#getTriggerDelay <em>Trigger Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Action#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Action#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends Annotatable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Effect}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effects</em>' containment reference list.
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction_Effects()
     * @model containment="true"
     * @generated
     */
    EList<Effect> getEffects();

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger</em>' containment reference.
     * @see #setTrigger(Expression)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction_Trigger()
     * @model containment="true"
     * @generated
     */
    Expression getTrigger();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Action#getTrigger <em>Trigger</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' containment reference.
     * @see #getTrigger()
     * @generated
     */
    void setTrigger(Expression value);

    /**
     * Returns the value of the '<em><b>Trigger Delay</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger Delay</em>' attribute.
     * @see #setTriggerDelay(int)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction_TriggerDelay()
     * @model default="1"
     * @generated
     */
    int getTriggerDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Action#getTriggerDelay <em>Trigger Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger Delay</em>' attribute.
     * @see #getTriggerDelay()
     * @generated
     */
    void setTriggerDelay(int value);

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
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction_Label()
     * @model unique="false" ordered="false"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Action#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * The default value is <code>"UNDEFINED"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.sccharts.DelayType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.DelayType
     * @see #setDelay(DelayType)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getAction_Delay()
     * @model default="UNDEFINED" required="true"
     * @generated
     */
    DelayType getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Action#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.DelayType
     * @see #getDelay()
     * @generated
     */
    void setDelay(DelayType value);

} // Action
