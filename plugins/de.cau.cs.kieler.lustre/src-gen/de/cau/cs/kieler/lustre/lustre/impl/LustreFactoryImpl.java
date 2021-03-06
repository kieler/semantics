/**
 * generated by Xtext
 */
package de.cau.cs.kieler.lustre.lustre.impl;

import de.cau.cs.kieler.lustre.lustre.*;

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
public class LustreFactoryImpl extends EFactoryImpl implements LustreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LustreFactory init()
  {
    try
    {
      LustreFactory theLustreFactory = (LustreFactory)EPackage.Registry.INSTANCE.getEFactory(LustrePackage.eNS_URI);
      if (theLustreFactory != null)
      {
        return theLustreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LustreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LustreFactoryImpl()
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
      case LustrePackage.LUSTRE_PROGRAM: return createLustreProgram();
      case LustrePackage.TYPE_DECLARATION: return createTypeDeclaration();
      case LustrePackage.AUTOMATON: return createAutomaton();
      case LustrePackage.ASTATE: return createAState();
      case LustrePackage.ATRANSITION: return createATransition();
      case LustrePackage.AN_ACTION: return createAnAction();
      case LustrePackage.EXTERNAL_NODE_DECLARATION: return createExternalNodeDeclaration();
      case LustrePackage.LUSTRE_VARIABLE_DECLARATION: return createLustreVariableDeclaration();
      case LustrePackage.LUSTRE_VALUED_OBJECT: return createLustreValuedObject();
      case LustrePackage.NODE_DECLARATION: return createNodeDeclaration();
      case LustrePackage.NODE_VALUED_OBJECT: return createNodeValuedObject();
      case LustrePackage.EQUATION: return createEquation();
      case LustrePackage.ASSERTION: return createAssertion();
      case LustrePackage.STATE_VALUED_OBJECT: return createStateValuedObject();
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
  public LustreProgram createLustreProgram()
  {
    LustreProgramImpl lustreProgram = new LustreProgramImpl();
    return lustreProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Automaton createAutomaton()
  {
    AutomatonImpl automaton = new AutomatonImpl();
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AState createAState()
  {
    AStateImpl aState = new AStateImpl();
    return aState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ATransition createATransition()
  {
    ATransitionImpl aTransition = new ATransitionImpl();
    return aTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnAction createAnAction()
  {
    AnActionImpl anAction = new AnActionImpl();
    return anAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalNodeDeclaration createExternalNodeDeclaration()
  {
    ExternalNodeDeclarationImpl externalNodeDeclaration = new ExternalNodeDeclarationImpl();
    return externalNodeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LustreVariableDeclaration createLustreVariableDeclaration()
  {
    LustreVariableDeclarationImpl lustreVariableDeclaration = new LustreVariableDeclarationImpl();
    return lustreVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LustreValuedObject createLustreValuedObject()
  {
    LustreValuedObjectImpl lustreValuedObject = new LustreValuedObjectImpl();
    return lustreValuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeDeclaration createNodeDeclaration()
  {
    NodeDeclarationImpl nodeDeclaration = new NodeDeclarationImpl();
    return nodeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeValuedObject createNodeValuedObject()
  {
    NodeValuedObjectImpl nodeValuedObject = new NodeValuedObjectImpl();
    return nodeValuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equation createEquation()
  {
    EquationImpl equation = new EquationImpl();
    return equation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateValuedObject createStateValuedObject()
  {
    StateValuedObjectImpl stateValuedObject = new StateValuedObjectImpl();
    return stateValuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LustrePackage getLustrePackage()
  {
    return (LustrePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LustrePackage getPackage()
  {
    return LustrePackage.eINSTANCE;
  }

} //LustreFactoryImpl
