/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.SVGFile#getFilename <em>Filename</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.SVGFile#getSvgElement <em>Svg Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGFile()
 * @model
 * @generated
 */
public interface SVGFile extends EObject {
    /**
     * Returns the value of the '<em><b>Filename</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filename</em>' attribute.
     * @see #setFilename(String)
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGFile_Filename()
     * @model default="" unique="false"
     * @generated
     */
    String getFilename();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kev.mapping.SVGFile#getFilename <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filename</em>' attribute.
     * @see #getFilename()
     * @generated
     */
    void setFilename(String value);

    /**
     * Returns the value of the '<em><b>Svg Element</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kev.mapping.SVGElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Svg Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Svg Element</em>' containment reference list.
     * @see de.cau.cs.kieler.kev.mapping.MappingPackage#getSVGFile_SvgElement()
     * @model containment="true"
     * @generated
     */
    EList<SVGElement> getSvgElement();

} // SVGFile
