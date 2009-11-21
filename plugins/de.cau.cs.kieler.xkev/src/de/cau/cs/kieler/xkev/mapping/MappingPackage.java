/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.xkev.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mapping";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.cau.cs.kieler.xkev.mapping/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mapping";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MappingPackage eINSTANCE = de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.impl.SVGFileImpl <em>SVG File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.impl.SVGFileImpl
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getSVGFile()
     * @generated
     */
    int SVG_FILE = 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_FILE__FILENAME = 0;

    /**
     * The feature id for the '<em><b>Svg Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_FILE__SVG_ELEMENT = 1;

    /**
     * The number of structural features of the '<em>SVG File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_FILE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.impl.SVGElementImpl <em>SVG Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.impl.SVGElementImpl
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getSVGElement()
     * @generated
     */
    int SVG_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Animation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_ELEMENT__ANIMATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_ELEMENT__ID = 1;

    /**
     * The number of structural features of the '<em>SVG Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SVG_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.Animation <em>Animation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.Animation
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getAnimation()
     * @generated
     */
    int ANIMATION = 2;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION__ACCESS_ID = 0;

    /**
     * The number of structural features of the '<em>Animation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl <em>Move</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.impl.MoveImpl
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getMove()
     * @generated
     */
    int MOVE = 3;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__INPUT = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xrange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__XRANGE = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Yrange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__YRANGE = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Move</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl <em>Colorize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getColorize()
     * @generated
     */
    int COLORIZE = 4;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__INPUT = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__COLOR = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__STYLE = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Colorize</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl <em>Textbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl
     * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getTextbox()
     * @generated
     */
    int TEXTBOX = 5;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__INPUT = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__VISIBLE = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__VALUE = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Border</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__BORDER = ANIMATION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Border style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__BORDER_STYLE = ANIMATION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Border color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX__BORDER_COLOR = ANIMATION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Textbox</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTBOX_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 6;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.SVGFile <em>SVG File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SVG File</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGFile
     * @generated
     */
    EClass getSVGFile();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.SVGFile#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGFile#getFilename()
     * @see #getSVGFile()
     * @generated
     */
    EAttribute getSVGFile_Filename();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.xkev.mapping.SVGFile#getSvgElement <em>Svg Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Svg Element</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGFile#getSvgElement()
     * @see #getSVGFile()
     * @generated
     */
    EReference getSVGFile_SvgElement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.SVGElement <em>SVG Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SVG Element</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGElement
     * @generated
     */
    EClass getSVGElement();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.xkev.mapping.SVGElement#getAnimation <em>Animation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Animation</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGElement#getAnimation()
     * @see #getSVGElement()
     * @generated
     */
    EReference getSVGElement_Animation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.SVGElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.SVGElement#getId()
     * @see #getSVGElement()
     * @generated
     */
    EAttribute getSVGElement_Id();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.Animation <em>Animation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Animation</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Animation
     * @generated
     */
    EClass getAnimation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Animation#getAccessID <em>Access ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Access ID</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Animation#getAccessID()
     * @see #getAnimation()
     * @generated
     */
    EAttribute getAnimation_AccessID();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.Move <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Move</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Move
     * @generated
     */
    EClass getMove();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Move#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Move#getInput()
     * @see #getMove()
     * @generated
     */
    EAttribute getMove_Input();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Move#getX_range <em>Xrange</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xrange</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Move#getX_range()
     * @see #getMove()
     * @generated
     */
    EAttribute getMove_X_range();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Move#getY_range <em>Yrange</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Yrange</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Move#getY_range()
     * @see #getMove()
     * @generated
     */
    EAttribute getMove_Y_range();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.Colorize <em>Colorize</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Colorize</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Colorize
     * @generated
     */
    EClass getColorize();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Colorize#getInput()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_Input();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Color</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Colorize#getColor()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_Color();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Colorize#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Style</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Colorize#getStyle()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_Style();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.xkev.mapping.Textbox <em>Textbox</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Textbox</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox
     * @generated
     */
    EClass getTextbox();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#getInput()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Input();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#isVisible <em>Visible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visible</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#isVisible()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Visible();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#getValue()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Value();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder <em>Border</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Border</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#getBorder()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Border();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_style <em>Border style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Border style</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_style()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Border_style();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_color <em>Border color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Border color</em>'.
     * @see de.cau.cs.kieler.xkev.mapping.Textbox#getBorder_color()
     * @see #getTextbox()
     * @generated
     */
    EAttribute getTextbox_Border_color();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MappingFactory getMappingFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.impl.SVGFileImpl <em>SVG File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.impl.SVGFileImpl
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getSVGFile()
         * @generated
         */
        EClass SVG_FILE = eINSTANCE.getSVGFile();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SVG_FILE__FILENAME = eINSTANCE.getSVGFile_Filename();

        /**
         * The meta object literal for the '<em><b>Svg Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SVG_FILE__SVG_ELEMENT = eINSTANCE.getSVGFile_SvgElement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.impl.SVGElementImpl <em>SVG Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.impl.SVGElementImpl
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getSVGElement()
         * @generated
         */
        EClass SVG_ELEMENT = eINSTANCE.getSVGElement();

        /**
         * The meta object literal for the '<em><b>Animation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SVG_ELEMENT__ANIMATION = eINSTANCE.getSVGElement_Animation();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SVG_ELEMENT__ID = eINSTANCE.getSVGElement_Id();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.Animation <em>Animation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.Animation
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getAnimation()
         * @generated
         */
        EClass ANIMATION = eINSTANCE.getAnimation();

        /**
         * The meta object literal for the '<em><b>Access ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANIMATION__ACCESS_ID = eINSTANCE.getAnimation_AccessID();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl <em>Move</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.impl.MoveImpl
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getMove()
         * @generated
         */
        EClass MOVE = eINSTANCE.getMove();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE__INPUT = eINSTANCE.getMove_Input();

        /**
         * The meta object literal for the '<em><b>Xrange</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE__XRANGE = eINSTANCE.getMove_X_range();

        /**
         * The meta object literal for the '<em><b>Yrange</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE__YRANGE = eINSTANCE.getMove_Y_range();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl <em>Colorize</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getColorize()
         * @generated
         */
        EClass COLORIZE = eINSTANCE.getColorize();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__INPUT = eINSTANCE.getColorize_Input();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__COLOR = eINSTANCE.getColorize_Color();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__STYLE = eINSTANCE.getColorize_Style();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl <em>Textbox</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl
         * @see de.cau.cs.kieler.xkev.mapping.impl.MappingPackageImpl#getTextbox()
         * @generated
         */
        EClass TEXTBOX = eINSTANCE.getTextbox();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__INPUT = eINSTANCE.getTextbox_Input();

        /**
         * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__VISIBLE = eINSTANCE.getTextbox_Visible();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__VALUE = eINSTANCE.getTextbox_Value();

        /**
         * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__BORDER = eINSTANCE.getTextbox_Border();

        /**
         * The meta object literal for the '<em><b>Border style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__BORDER_STYLE = eINSTANCE.getTextbox_Border_style();

        /**
         * The meta object literal for the '<em><b>Border color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTBOX__BORDER_COLOR = eINSTANCE.getTextbox_Border_color();

    }

} //MappingPackage
