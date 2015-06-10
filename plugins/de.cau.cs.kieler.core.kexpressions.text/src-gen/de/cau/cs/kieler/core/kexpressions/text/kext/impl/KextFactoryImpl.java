/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext.impl;

import de.cau.cs.kieler.core.kexpressions.text.kext.*;

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
public class KextFactoryImpl extends EFactoryImpl implements KextFactory
{
  /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public static KextFactory init()
  {
        try {
            KextFactory theKextFactory = (KextFactory)EPackage.Registry.INSTANCE.getEFactory(KextPackage.eNS_URI);
            if (theKextFactory != null) {
                return theKextFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new KextFactoryImpl();
    }

  /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public KextFactoryImpl()
  {
        super();
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public EObject create(EClass eClass)
  {
        switch (eClass.getClassifierID()) {
            case KextPackage.KEXT: return createKext();
            case KextPackage.TEST_ENTITY: return createTestEntity();
            case KextPackage.ANNOTATED_EXPRESSION: return createAnnotatedExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public Kext createKext()
  {
        KextImpl kext = new KextImpl();
        return kext;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public TestEntity createTestEntity()
  {
        TestEntityImpl testEntity = new TestEntityImpl();
        return testEntity;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public AnnotatedExpression createAnnotatedExpression()
  {
        AnnotatedExpressionImpl annotatedExpression = new AnnotatedExpressionImpl();
        return annotatedExpression;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public KextPackage getKextPackage()
  {
        return (KextPackage)getEPackage();
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
  @Deprecated
  public static KextPackage getPackage()
  {
        return KextPackage.eINSTANCE;
    }

} //KextFactoryImpl
