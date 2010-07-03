/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expansion node is an object node used to indicate a flow across the boundary of an expansion region. A flow into a region contains a collection that is broken into its individual elements inside the region, which is executed once per element. A flow out of a region combines individual elements into a collection for use outside the region.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getExpansionNode()
 * @model
 * @generated
 */
public interface ExpansionNode extends ObjectNode {
    /**
     * Returns the value of the '<em><b>Region As Output</b></em>' reference.
     * It is bidirectional and its opposite is '{@link uml.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The expansion region for which the node is an output.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Region As Output</em>' reference.
     * @see #setRegionAsOutput(ExpansionRegion)
     * @see uml.UmlPackage#getExpansionNode_RegionAsOutput()
     * @see uml.ExpansionRegion#getOutputElement
     * @model opposite="outputElement" ordered="false"
     * @generated
     */
    ExpansionRegion getRegionAsOutput();

    /**
     * Sets the value of the '{@link uml.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region As Output</em>' reference.
     * @see #getRegionAsOutput()
     * @generated
     */
    void setRegionAsOutput(ExpansionRegion value);

    /**
     * Returns the value of the '<em><b>Region As Input</b></em>' reference.
     * It is bidirectional and its opposite is '{@link uml.ExpansionRegion#getInputElement <em>Input Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The expansion region for which the node is an input.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Region As Input</em>' reference.
     * @see #setRegionAsInput(ExpansionRegion)
     * @see uml.UmlPackage#getExpansionNode_RegionAsInput()
     * @see uml.ExpansionRegion#getInputElement
     * @model opposite="inputElement" ordered="false"
     * @generated
     */
    ExpansionRegion getRegionAsInput();

    /**
     * Sets the value of the '{@link uml.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region As Input</em>' reference.
     * @see #getRegionAsInput()
     * @generated
     */
    void setRegionAsInput(ExpansionRegion value);

} // ExpansionNode
