/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.util;

import de.cau.cs.kieler.xkev.mapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage
 * @generated
 */
public class MappingAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static MappingPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MappingSwitch<Adapter> modelSwitch =
        new MappingSwitch<Adapter>() {
			@Override
			public Adapter caseSVGFile(SVGFile object) {
				return createSVGFileAdapter();
			}
			@Override
			public Adapter caseSVGElement(SVGElement object) {
				return createSVGElementAdapter();
			}
			@Override
			public Adapter caseAnimation(Animation object) {
				return createAnimationAdapter();
			}
			@Override
			public Adapter caseOpacity(Opacity object) {
				return createOpacityAdapter();
			}
			@Override
			public Adapter caseMovePath(MovePath object) {
				return createMovePathAdapter();
			}
			@Override
			public Adapter caseRotate(Rotate object) {
				return createRotateAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseColorize(Colorize object) {
				return createColorizeAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseMoveTo(MoveTo object) {
				return createMoveToAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.SVGFile <em>SVG File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.SVGFile
	 * @generated
	 */
    public Adapter createSVGFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.SVGElement <em>SVG Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.SVGElement
	 * @generated
	 */
    public Adapter createSVGElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Animation
	 * @generated
	 */
    public Adapter createAnimationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Opacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Opacity
	 * @generated
	 */
    public Adapter createOpacityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.MovePath <em>Move Path</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.MovePath
	 * @generated
	 */
    public Adapter createMovePathAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Rotate
	 * @generated
	 */
    public Adapter createRotateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Move
	 * @generated
	 */
    public Adapter createMoveAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Colorize <em>Colorize</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Colorize
	 * @generated
	 */
    public Adapter createColorizeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.Text
	 * @generated
	 */
    public Adapter createTextAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.xkev.mapping.MoveTo <em>Move To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.xkev.mapping.MoveTo
	 * @generated
	 */
	public Adapter createMoveToAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //MappingAdapterFactory
