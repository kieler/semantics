/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping;

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
 * @see de.cau.cs.kieler.kev.mapping.MappingFactory
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
    String eNS_URI = "http://de.cau.cs.kieler.kev.mapping/1.0";

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
    MappingPackage eINSTANCE = de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl <em>SVG File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getSVGFile()
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
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.SVGElementImpl <em>SVG Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.SVGElementImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getSVGElement()
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
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.AnimationImpl <em>Animation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.AnimationImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getAnimation()
     * @generated
     */
    int ANIMATION = 2;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION__INPUT = 0;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION__ACCESS_ID = 1;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION__KEY = 2;

    /**
     * The number of structural features of the '<em>Animation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANIMATION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.OpacityImpl <em>Opacity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.OpacityImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getOpacity()
     * @generated
     */
    int OPACITY = 3;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPACITY__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPACITY__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPACITY__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>Opacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPACITY__OPACITY = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Opacity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPACITY_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl <em>Move Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.MovePathImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMovePath()
     * @generated
     */
    int MOVE_PATH = 4;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__PATH = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Anchor Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__ANCHOR_POINT = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Auto Orientation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH__AUTO_ORIENTATION = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Move Path</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_PATH_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl <em>Rotate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.RotateImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getRotate()
     * @generated
     */
    int ROTATE = 5;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>Angle Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__ANGLE_RANGE = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Anchor Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE__ANCHOR_POINT = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Rotate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROTATE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl <em>Move</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.MoveImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMove()
     * @generated
     */
    int MOVE = 6;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>XRange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__XRANGE = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>YRange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE__YRANGE = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Move</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MOVE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl <em>Colorize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getColorize()
     * @generated
     */
    int COLORIZE = 7;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>Fill Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__FILL_COLOR = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Stroke Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__STROKE_COLOR = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE__STROKE_WIDTH = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Colorize</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLORIZE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.TextImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getText()
     * @generated
     */
    int TEXT = 8;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__INPUT = ANIMATION__INPUT;

    /**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__ACCESS_ID = ANIMATION__ACCESS_ID;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__KEY = ANIMATION__KEY;

    /**
     * The feature id for the '<em><b>Text Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__TEXT_VALUE = ANIMATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__FONT_SIZE = ANIMATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Font Family</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__FONT_FAMILY = ANIMATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 3;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.kev.mapping.impl.MoveToImpl <em>Move To</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kev.mapping.impl.MoveToImpl
     * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMoveTo()
     * @generated
     */
	int MOVE_TO = 9;

				/**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MOVE_TO__INPUT = ANIMATION__INPUT;

				/**
     * The feature id for the '<em><b>Access ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MOVE_TO__ACCESS_ID = ANIMATION__ACCESS_ID;

				/**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MOVE_TO__KEY = ANIMATION__KEY;

				/**
     * The number of structural features of the '<em>Move To</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MOVE_TO_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 0;


				/**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.SVGFile <em>SVG File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SVG File</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGFile
     * @generated
     */
    EClass getSVGFile();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.SVGFile#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGFile#getFilename()
     * @see #getSVGFile()
     * @generated
     */
    EAttribute getSVGFile_Filename();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kev.mapping.SVGFile#getSvgElement <em>Svg Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Svg Element</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGFile#getSvgElement()
     * @see #getSVGFile()
     * @generated
     */
    EReference getSVGFile_SvgElement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.SVGElement <em>SVG Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SVG Element</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGElement
     * @generated
     */
    EClass getSVGElement();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kev.mapping.SVGElement#getAnimation <em>Animation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Animation</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGElement#getAnimation()
     * @see #getSVGElement()
     * @generated
     */
    EReference getSVGElement_Animation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.SVGElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.cau.cs.kieler.kev.mapping.SVGElement#getId()
     * @see #getSVGElement()
     * @generated
     */
    EAttribute getSVGElement_Id();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Animation <em>Animation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Animation</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Animation
     * @generated
     */
    EClass getAnimation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Animation#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Animation#getInput()
     * @see #getAnimation()
     * @generated
     */
    EAttribute getAnimation_Input();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Animation#getAccessID <em>Access ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Access ID</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Animation#getAccessID()
     * @see #getAnimation()
     * @generated
     */
    EAttribute getAnimation_AccessID();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Animation#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Animation#getKey()
     * @see #getAnimation()
     * @generated
     */
    EAttribute getAnimation_Key();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Opacity <em>Opacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Opacity</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Opacity
     * @generated
     */
    EClass getOpacity();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Opacity#getOpacity <em>Opacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Opacity</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Opacity#getOpacity()
     * @see #getOpacity()
     * @generated
     */
    EAttribute getOpacity_Opacity();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.MovePath <em>Move Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Move Path</em>'.
     * @see de.cau.cs.kieler.kev.mapping.MovePath
     * @generated
     */
    EClass getMovePath();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.MovePath#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see de.cau.cs.kieler.kev.mapping.MovePath#getPath()
     * @see #getMovePath()
     * @generated
     */
    EAttribute getMovePath_Path();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAnchorPoint <em>Anchor Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anchor Point</em>'.
     * @see de.cau.cs.kieler.kev.mapping.MovePath#getAnchorPoint()
     * @see #getMovePath()
     * @generated
     */
    EAttribute getMovePath_AnchorPoint();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.MovePath#getAutoOrientation <em>Auto Orientation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Auto Orientation</em>'.
     * @see de.cau.cs.kieler.kev.mapping.MovePath#getAutoOrientation()
     * @see #getMovePath()
     * @generated
     */
    EAttribute getMovePath_AutoOrientation();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Rotate <em>Rotate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rotate</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Rotate
     * @generated
     */
    EClass getRotate();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Rotate#getAngleRange <em>Angle Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Angle Range</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Rotate#getAngleRange()
     * @see #getRotate()
     * @generated
     */
    EAttribute getRotate_AngleRange();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Rotate#getAnchorPoint <em>Anchor Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anchor Point</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Rotate#getAnchorPoint()
     * @see #getRotate()
     * @generated
     */
    EAttribute getRotate_AnchorPoint();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Move <em>Move</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Move</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Move
     * @generated
     */
    EClass getMove();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Move#getXRange <em>XRange</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>XRange</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Move#getXRange()
     * @see #getMove()
     * @generated
     */
    EAttribute getMove_XRange();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Move#getYRange <em>YRange</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>YRange</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Move#getYRange()
     * @see #getMove()
     * @generated
     */
    EAttribute getMove_YRange();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Colorize <em>Colorize</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Colorize</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Colorize
     * @generated
     */
    EClass getColorize();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Colorize#getFillColor <em>Fill Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fill Color</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Colorize#getFillColor()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_FillColor();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeColor <em>Stroke Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stroke Color</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Colorize#getStrokeColor()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_StrokeColor();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Colorize#getStrokeWidth <em>Stroke Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stroke Width</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Colorize#getStrokeWidth()
     * @see #getColorize()
     * @generated
     */
    EAttribute getColorize_StrokeWidth();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Text
     * @generated
     */
    EClass getText();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Text#getTextValue <em>Text Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Value</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Text#getTextValue()
     * @see #getText()
     * @generated
     */
    EAttribute getText_TextValue();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Text#getFontSize <em>Font Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Size</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Text#getFontSize()
     * @see #getText()
     * @generated
     */
    EAttribute getText_FontSize();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kev.mapping.Text#getFontFamily <em>Font Family</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Family</em>'.
     * @see de.cau.cs.kieler.kev.mapping.Text#getFontFamily()
     * @see #getText()
     * @generated
     */
    EAttribute getText_FontFamily();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.kev.mapping.MoveTo <em>Move To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Move To</em>'.
     * @see de.cau.cs.kieler.kev.mapping.MoveTo
     * @generated
     */
	EClass getMoveTo();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl <em>SVG File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getSVGFile()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.SVGElementImpl <em>SVG Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.SVGElementImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getSVGElement()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.AnimationImpl <em>Animation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.AnimationImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getAnimation()
         * @generated
         */
        EClass ANIMATION = eINSTANCE.getAnimation();

        /**
         * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANIMATION__INPUT = eINSTANCE.getAnimation_Input();

        /**
         * The meta object literal for the '<em><b>Access ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANIMATION__ACCESS_ID = eINSTANCE.getAnimation_AccessID();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANIMATION__KEY = eINSTANCE.getAnimation_Key();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.OpacityImpl <em>Opacity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.OpacityImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getOpacity()
         * @generated
         */
        EClass OPACITY = eINSTANCE.getOpacity();

        /**
         * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPACITY__OPACITY = eINSTANCE.getOpacity_Opacity();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.MovePathImpl <em>Move Path</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.MovePathImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMovePath()
         * @generated
         */
        EClass MOVE_PATH = eINSTANCE.getMovePath();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE_PATH__PATH = eINSTANCE.getMovePath_Path();

        /**
         * The meta object literal for the '<em><b>Anchor Point</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE_PATH__ANCHOR_POINT = eINSTANCE.getMovePath_AnchorPoint();

        /**
         * The meta object literal for the '<em><b>Auto Orientation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE_PATH__AUTO_ORIENTATION = eINSTANCE.getMovePath_AutoOrientation();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl <em>Rotate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.RotateImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getRotate()
         * @generated
         */
        EClass ROTATE = eINSTANCE.getRotate();

        /**
         * The meta object literal for the '<em><b>Angle Range</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROTATE__ANGLE_RANGE = eINSTANCE.getRotate_AngleRange();

        /**
         * The meta object literal for the '<em><b>Anchor Point</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROTATE__ANCHOR_POINT = eINSTANCE.getRotate_AnchorPoint();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl <em>Move</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.MoveImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMove()
         * @generated
         */
        EClass MOVE = eINSTANCE.getMove();

        /**
         * The meta object literal for the '<em><b>XRange</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE__XRANGE = eINSTANCE.getMove_XRange();

        /**
         * The meta object literal for the '<em><b>YRange</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MOVE__YRANGE = eINSTANCE.getMove_YRange();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl <em>Colorize</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getColorize()
         * @generated
         */
        EClass COLORIZE = eINSTANCE.getColorize();

        /**
         * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__FILL_COLOR = eINSTANCE.getColorize_FillColor();

        /**
         * The meta object literal for the '<em><b>Stroke Color</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__STROKE_COLOR = eINSTANCE.getColorize_StrokeColor();

        /**
         * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLORIZE__STROKE_WIDTH = eINSTANCE.getColorize_StrokeWidth();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.TextImpl <em>Text</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.TextImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getText()
         * @generated
         */
        EClass TEXT = eINSTANCE.getText();

        /**
         * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT__TEXT_VALUE = eINSTANCE.getText_TextValue();

        /**
         * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT__FONT_SIZE = eINSTANCE.getText_FontSize();

        /**
         * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT__FONT_FAMILY = eINSTANCE.getText_FontFamily();

								/**
         * The meta object literal for the '{@link de.cau.cs.kieler.kev.mapping.impl.MoveToImpl <em>Move To</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.kev.mapping.impl.MoveToImpl
         * @see de.cau.cs.kieler.kev.mapping.impl.MappingPackageImpl#getMoveTo()
         * @generated
         */
		EClass MOVE_TO = eINSTANCE.getMoveTo();

    }

} //MappingPackage
