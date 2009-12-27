/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MappingFactory eINSTANCE = de.cau.cs.kieler.xkev.mapping.impl.MappingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SVG File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SVG File</em>'.
     * @generated
     */
    SVGFile createSVGFile();

    /**
     * Returns a new object of class '<em>SVG Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SVG Element</em>'.
     * @generated
     */
    SVGElement createSVGElement();

    /**
     * Returns a new object of class '<em>Move Path</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Move Path</em>'.
     * @generated
     */
    MovePath createMovePath();

    /**
     * Returns a new object of class '<em>Rotate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rotate</em>'.
     * @generated
     */
    Rotate createRotate();

    /**
     * Returns a new object of class '<em>Move</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Move</em>'.
     * @generated
     */
    Move createMove();

    /**
     * Returns a new object of class '<em>Colorize</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Colorize</em>'.
     * @generated
     */
    Colorize createColorize();

    /**
     * Returns a new object of class '<em>Text</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text</em>'.
     * @generated
     */
    Text createText();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MappingPackage getMappingPackage();

} //MappingFactory
