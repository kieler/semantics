/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import textualsynccharts.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualsyncchartsFactoryImpl extends EFactoryImpl implements TextualsyncchartsFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static TextualsyncchartsFactory init() {
		try {
			TextualsyncchartsFactory theTextualsyncchartsFactory = (TextualsyncchartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/textualsynccharts"); 
			if (theTextualsyncchartsFactory != null) {
				return theTextualsyncchartsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TextualsyncchartsFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TextualsyncchartsFactoryImpl() {
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
			case TextualsyncchartsPackage.TEXTUAL_STATE: return createTextualState();
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION: return createTextualTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TextualState createTextualState() {
		TextualStateImpl textualState = new TextualStateImpl();
		return textualState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TextualTransition createTextualTransition() {
		TextualTransitionImpl textualTransition = new TextualTransitionImpl();
		return textualTransition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TextualsyncchartsPackage getTextualsyncchartsPackage() {
		return (TextualsyncchartsPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static TextualsyncchartsPackage getPackage() {
		return TextualsyncchartsPackage.eINSTANCE;
	}

} //TextualsyncchartsFactoryImpl
