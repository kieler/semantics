/**
 */
package de.cau.cs.kieler.kexpressions.keffects.impl;

import de.cau.cs.kieler.kexpressions.keffects.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
            case KEffectsPackage.ASSIGNMENT: return createAssignment();
            case KEffectsPackage.EMISSION: return createEmission();
            case KEffectsPackage.HOSTCODE_EFFECT: return createHostcodeEffect();
            case KEffectsPackage.REFERENCE_CALL_EFFECT: return createReferenceCallEffect();
            case KEffectsPackage.FUNCTION_CALL_EFFECT: return createFunctionCallEffect();
            case KEffectsPackage.PRINT_CALL_EFFECT: return createPrintCallEffect();
            case KEffectsPackage.RANDOMIZE_CALL_EFFECT: return createRandomizeCallEffect();
            case KEffectsPackage.DATA_DEPENDENCY: return createDataDependency();
            case KEffectsPackage.CONTROL_DEPENDENCY: return createControlDependency();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case KEffectsPackage.ASSIGN_OPERATOR:
                return createAssignOperatorFromString(eDataType, initialValue);
            case KEffectsPackage.DATA_DEPENDENCY_TYPE:
                return createDataDependencyTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case KEffectsPackage.ASSIGN_OPERATOR:
                return convertAssignOperatorToString(eDataType, instanceValue);
            case KEffectsPackage.DATA_DEPENDENCY_TYPE:
                return convertDataDependencyTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Emission createEmission() {
        EmissionImpl emission = new EmissionImpl();
        return emission;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HostcodeEffect createHostcodeEffect() {
        HostcodeEffectImpl hostcodeEffect = new HostcodeEffectImpl();
        return hostcodeEffect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReferenceCallEffect createReferenceCallEffect() {
        ReferenceCallEffectImpl referenceCallEffect = new ReferenceCallEffectImpl();
        return referenceCallEffect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCallEffect createFunctionCallEffect() {
        FunctionCallEffectImpl functionCallEffect = new FunctionCallEffectImpl();
        return functionCallEffect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrintCallEffect createPrintCallEffect() {
        PrintCallEffectImpl printCallEffect = new PrintCallEffectImpl();
        return printCallEffect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RandomizeCallEffect createRandomizeCallEffect() {
        RandomizeCallEffectImpl randomizeCallEffect = new RandomizeCallEffectImpl();
        return randomizeCallEffect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataDependency createDataDependency() {
        DataDependencyImpl dataDependency = new DataDependencyImpl();
        return dataDependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlDependency createControlDependency() {
        ControlDependencyImpl controlDependency = new ControlDependencyImpl();
        return controlDependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssignOperator createAssignOperatorFromString(EDataType eDataType, String initialValue) {
        AssignOperator result = AssignOperator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssignOperatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataDependencyType createDataDependencyTypeFromString(EDataType eDataType, String initialValue) {
        DataDependencyType result = DataDependencyType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDataDependencyTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
