/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see textualsynccharts.TextualsyncchartsPackage
 * @generated
 */
public interface TextualsyncchartsFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    TextualsyncchartsFactory eINSTANCE = textualsynccharts.impl.TextualsyncchartsFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Textual State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual State</em>'.
	 * @generated
	 */
    TextualState createTextualState();

    /**
	 * Returns a new object of class '<em>Textual Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Transition</em>'.
	 * @generated
	 */
    TextualTransition createTextualTransition();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    TextualsyncchartsPackage getTextualsyncchartsPackage();

} //TextualsyncchartsFactory
