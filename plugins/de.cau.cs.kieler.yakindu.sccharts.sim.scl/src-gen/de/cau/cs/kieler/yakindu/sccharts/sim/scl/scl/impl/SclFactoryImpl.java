/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.*;

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
public class SclFactoryImpl extends EFactoryImpl implements SclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SclFactory init()
  {
    try
    {
      SclFactory theSclFactory = (SclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/yakindu/sccharts/sim/scl/scl"); 
      if (theSclFactory != null)
      {
        return theSclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SclFactoryImpl()
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
    switch (eClass.getClassifierID())
    {
      case SclPackage.PROGRAM: return createProgram();
      case SclPackage.INSTRUCTION: return createInstruction();
      case SclPackage.SCL_EXPRESSION: return createSCLExpression();
      case SclPackage.CONDITIONAL: return createConditional();
      case SclPackage.LABEL: return createLabel();
      case SclPackage.GOTO: return createGoto();
      case SclPackage.PARALLEL: return createParallel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCLExpression createSCLExpression()
  {
    SCLExpressionImpl sclExpression = new SCLExpressionImpl();
    return sclExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goto createGoto()
  {
    GotoImpl goto_ = new GotoImpl();
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallel createParallel()
  {
    ParallelImpl parallel = new ParallelImpl();
    return parallel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SclPackage getSclPackage()
  {
    return (SclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SclPackage getPackage()
  {
    return SclPackage.eINSTANCE;
  }

} //SclFactoryImpl
