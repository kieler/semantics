/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage#getAnimation()
 * @model abstract="true"
 * @generated
 */
public interface Animation extends IAnimation {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    String getActualJSONValue();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void applyAnimation();

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     */    
    void applyAnimation(JSONObject jsonObject, String svgElementID);
    
    /**
     * <!-- begin-user-doc -->
     * This method should have this two parameters, which was not possible to delcare in the emf model
     * <!-- end-user-doc -->
     * @model kind="operation"
     */
    String getActualJSONValue(JSONObject jsonObject, String svgElementID);


} // Animation
