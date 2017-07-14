/**
 */
package de.cau.cs.kieler.kexpressions.kext.impl;

import de.cau.cs.kieler.kexpressions.kext.*;

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
public class KExtFactoryImpl extends EFactoryImpl implements KExtFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KExtFactory init() {
        try {
            KExtFactory theKExtFactory = (KExtFactory)EPackage.Registry.INSTANCE.getEFactory(KExtPackage.eNS_URI);
            if (theKExtFactory != null) {
                return theKExtFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KExtFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExtFactoryImpl() {
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
            case KExtPackage.KEXT: return createKext();
            case KExtPackage.KEXT_SCOPE: return createKExtScope();
            case KExtPackage.TEST_ENTITY: return createTestEntity();
            case KExtPackage.ANNOTATED_EXPRESSION: return createAnnotatedExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Kext createKext() {
        KextImpl kext = new KextImpl();
        return kext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExtScope createKExtScope() {
        KExtScopeImpl kExtScope = new KExtScopeImpl();
        return kExtScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestEntity createTestEntity() {
        TestEntityImpl testEntity = new TestEntityImpl();
        return testEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotatedExpression createAnnotatedExpression() {
        AnnotatedExpressionImpl annotatedExpression = new AnnotatedExpressionImpl();
        return annotatedExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KExtPackage getKExtPackage() {
        return (KExtPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static KExtPackage getPackage() {
        return KExtPackage.eINSTANCE;
    }

} //KExtFactoryImpl
