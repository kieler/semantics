/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KVPair;
import de.cau.cs.kieler.kicool.KiCoolFactory;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup;
import de.cau.cs.kieler.kicool.ProcessorContext;
import de.cau.cs.kieler.kicool.ProcessorGroup;

import de.cau.cs.kieler.kicool.ProcessorReference;
import de.cau.cs.kieler.kicool.ProcessorSystem;
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
public class KiCoolFactoryImpl extends EFactoryImpl implements KiCoolFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KiCoolFactory init() {
        try {
            KiCoolFactory theKiCoolFactory = (KiCoolFactory)EPackage.Registry.INSTANCE.getEFactory(KiCoolPackage.eNS_URI);
            if (theKiCoolFactory != null) {
                return theKiCoolFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KiCoolFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KiCoolFactoryImpl() {
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
            case KiCoolPackage.SYSTEM: return createSystem();
            case KiCoolPackage.PROCESSOR_REFERENCE: return createProcessorReference();
            case KiCoolPackage.PROCESSOR_SYSTEM: return createProcessorSystem();
            case KiCoolPackage.PROCESSOR_GROUP: return createProcessorGroup();
            case KiCoolPackage.PROCESSOR_ALTERNATIVE_GROUP: return createProcessorAlternativeGroup();
            case KiCoolPackage.INTERMEDIATE_REFERENCE: return createIntermediateReference();
            case KiCoolPackage.PROCESSOR_CONTEXT: return createProcessorContext();
            case KiCoolPackage.KV_PAIR: return createKVPair();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.kicool.System createSystem() {
        SystemImpl system = new SystemImpl();
        return system;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorReference createProcessorReference() {
        ProcessorReferenceImpl processorReference = new ProcessorReferenceImpl();
        return processorReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorSystem createProcessorSystem() {
        ProcessorSystemImpl processorSystem = new ProcessorSystemImpl();
        return processorSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorGroup createProcessorGroup() {
        ProcessorGroupImpl processorGroup = new ProcessorGroupImpl();
        return processorGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorAlternativeGroup createProcessorAlternativeGroup() {
        ProcessorAlternativeGroupImpl processorAlternativeGroup = new ProcessorAlternativeGroupImpl();
        return processorAlternativeGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateReference createIntermediateReference() {
        IntermediateReferenceImpl intermediateReference = new IntermediateReferenceImpl();
        return intermediateReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorContext createProcessorContext() {
        ProcessorContextImpl processorContext = new ProcessorContextImpl();
        return processorContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KVPair createKVPair() {
        KVPairImpl kvPair = new KVPairImpl();
        return kvPair;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KiCoolPackage getKiCoolPackage() {
        return (KiCoolPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static KiCoolPackage getPackage() {
        return KiCoolPackage.eINSTANCE;
    }

} //KiCoolFactoryImpl
