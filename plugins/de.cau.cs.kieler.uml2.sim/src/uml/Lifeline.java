/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A lifeline represents an individual participant in the interaction. While parts and structural features may have multiplicity greater than 1, lifelines represent only one interacting entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uml.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link uml.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link uml.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends NamedElement {
    /**
     * Returns the value of the '<em><b>Represents</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the ConnectableElement within the classifier that contains the enclosing interaction.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Represents</em>' reference.
     * @see #setRepresents(ConnectableElement)
     * @see uml.UmlPackage#getLifeline_Represents()
     * @model ordered="false"
     * @generated
     */
    ConnectableElement getRepresents();

    /**
     * Sets the value of the '{@link uml.Lifeline#getRepresents <em>Represents</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Represents</em>' reference.
     * @see #getRepresents()
     * @generated
     */
    void setRepresents(ConnectableElement value);

    /**
     * Returns the value of the '<em><b>Interaction</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Interaction#getLifeline <em>Lifeline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the Interaction enclosing this Lifeline.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interaction</em>' container reference.
     * @see #setInteraction(Interaction)
     * @see uml.UmlPackage#getLifeline_Interaction()
     * @see uml.Interaction#getLifeline
     * @model opposite="lifeline" required="true" transient="false" ordered="false"
     * @generated
     */
    Interaction getInteraction();

    /**
     * Sets the value of the '{@link uml.Lifeline#getInteraction <em>Interaction</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction</em>' container reference.
     * @see #getInteraction()
     * @generated
     */
    void setInteraction(Interaction value);

    /**
     * Returns the value of the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' containment reference.
     * @see #setSelector(ValueSpecification)
     * @see uml.UmlPackage#getLifeline_Selector()
     * @model containment="true" ordered="false"
     * @generated
     */
    ValueSpecification getSelector();

    /**
     * Sets the value of the '{@link uml.Lifeline#getSelector <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' containment reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(ValueSpecification value);

    /**
     * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the Interaction that represents the decomposition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Decomposed As</em>' reference.
     * @see #setDecomposedAs(PartDecomposition)
     * @see uml.UmlPackage#getLifeline_DecomposedAs()
     * @model ordered="false"
     * @generated
     */
    PartDecomposition getDecomposedAs();

    /**
     * Sets the value of the '{@link uml.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decomposed As</em>' reference.
     * @see #getDecomposedAs()
     * @generated
     */
    void setDecomposedAs(PartDecomposition value);

    /**
     * Returns the value of the '<em><b>Covered By</b></em>' reference list.
     * The list contents are of type {@link uml.InteractionFragment}.
     * It is bidirectional and its opposite is '{@link uml.InteractionFragment#getCovered <em>Covered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the InteractionFragments in which this Lifeline takes part.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Covered By</em>' reference list.
     * @see uml.UmlPackage#getLifeline_CoveredBy()
     * @see uml.InteractionFragment#getCovered
     * @model opposite="covered" ordered="false"
     * @generated
     */
    EList<InteractionFragment> getCoveredBy();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If two (or more) InteractionUses within one Interaction, refer to Interactions with 'common Lifelines,' those Lifelines must also appear in the Interaction with the InteractionUses. By common Lifelines we mean Lifelines with the same selector and represents associations.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean interaction_uses_share_lifeline(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The selector for a Lifeline must only be specified if the referenced Part is multivalued.
     * (self.selector->isEmpty() implies not self.represents.isMultivalued()) or
     * (not self.selector->isEmpty() implies self.represents.isMultivalued())
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean selector_specified(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The classifier containing the referenced ConnectableElement must be the same classifier, or an ancestor, of the classifier that contains the interaction enclosing this lifeline.
     * if (represents->notEmpty()) then
     * (if selector->notEmpty() then represents.isMultivalued() else not represents.isMultivalued())
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean same_classifier(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Lifeline
