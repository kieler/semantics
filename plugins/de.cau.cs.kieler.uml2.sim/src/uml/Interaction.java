/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction is a unit of behavior that focuses on the observable exchange of information between connectable elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link uml.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link uml.Interaction#getAction <em>Action</em>}</li>
 *   <li>{@link uml.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link uml.Interaction#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Lifeline}.
	 * It is bidirectional and its opposite is '{@link uml.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the participants in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see uml.UmlPackage#getInteraction_Lifeline()
	 * @see uml.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link uml.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of fragments in the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see uml.UmlPackage#getInteraction_Fragment()
	 * @see uml.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions owned by the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see uml.UmlPackage#getInteraction_Action()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see uml.UmlPackage#getInteraction_FormalGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getFormalGate();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Message}.
	 * It is bidirectional and its opposite is '{@link uml.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Messages contained in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see uml.UmlPackage#getInteraction_Message()
	 * @see uml.Message#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessage();

} // Interaction
