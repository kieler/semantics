/**
 */
package de.cau.cs.kieler.core.kexpressions.keffects.impl;

import de.cau.cs.kieler.core.kexpressions.keffects.*;

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
public class KEffectsFactoryImpl extends EFactoryImpl implements KEffectsFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static KEffectsFactory init() {
        try {
            KEffectsFactory theKEffectsFactory = (KEffectsFactory)EPackage.Registry.INSTANCE.getEFactory(KEffectsPackage.eNS_URI);
            if (theKEffectsFactory != null) {
                return theKEffectsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KEffectsFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KEffectsFactoryImpl() {
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
            case KEffectsPackage.EFFECT: return createEffect();
            case KEffectsPackage.ASSIGNMENT: return createAssignment();
            case KEffectsPackage.EMISSION: return createEmission();
            case KEffectsPackage.HOSTCODE_EFFECT: return createHostcodeEffect();
            case KEffectsPackage.FUNCTION_CALL_EFFECT: return createFunctionCallEffect();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Effect createEffect() {
        EffectImpl effect = new EffectImpl();
        return effect;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Emission createEmission() {
        EmissionImpl emission = new EmissionImpl();
        return emission;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HostcodeEffect createHostcodeEffect() {
        HostcodeEffectImpl hostcodeEffect = new HostcodeEffectImpl();
        return hostcodeEffect;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FunctionCallEffect createFunctionCallEffect() {
        FunctionCallEffectImpl functionCallEffect = new FunctionCallEffectImpl();
        return functionCallEffect;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KEffectsPackage getKEffectsPackage() {
        return (KEffectsPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static KEffectsPackage getPackage() {
        return KEffectsPackage.eINSTANCE;
    }

} //KEffectsFactoryImpl
