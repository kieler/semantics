/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import de.cau.cs.kieler.kev.mapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MappingFactory init() {
        try {
            MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.cau.cs.kieler.kev.mapping/1.0"); 
            if (theMappingFactory != null) {
                return theMappingFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MappingFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MappingPackage.SVG_FILE: return createSVGFile();
            case MappingPackage.SVG_ELEMENT: return createSVGElement();
            case MappingPackage.OPACITY: return createOpacity();
            case MappingPackage.MOVE_PATH: return createMovePath();
            case MappingPackage.ROTATE: return createRotate();
            case MappingPackage.MOVE: return createMove();
            case MappingPackage.COLORIZE: return createColorize();
            case MappingPackage.TEXT: return createText();
            case MappingPackage.MOVE_TO: return createMoveTo();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVGFile createSVGFile() {
        SVGFileImpl svgFile = new SVGFileImpl();
        return svgFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVGElement createSVGElement() {
        SVGElementImpl svgElement = new SVGElementImpl();
        return svgElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Opacity createOpacity() {
        OpacityImpl opacity = new OpacityImpl();
        return opacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovePath createMovePath() {
        MovePathImpl movePath = new MovePathImpl();
        return movePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rotate createRotate() {
        RotateImpl rotate = new RotateImpl();
        return rotate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Move createMove() {
        MoveImpl move = new MoveImpl();
        return move;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Colorize createColorize() {
        ColorizeImpl colorize = new ColorizeImpl();
        return colorize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MoveTo createMoveTo() {
        MoveToImpl moveTo = new MoveToImpl();
        return moveTo;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingPackage getMappingPackage() {
        return (MappingPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MappingPackage getPackage() {
        return MappingPackage.eINSTANCE;
    }

} //MappingFactoryImpl
