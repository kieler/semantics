/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.*;

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
public class QuartzFactoryImpl extends EFactoryImpl implements QuartzFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuartzFactory init()
  {
    try
    {
      QuartzFactory theQuartzFactory = (QuartzFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/editor/quartz/Quartz"); 
      if (theQuartzFactory != null)
      {
        return theQuartzFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QuartzFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuartzFactoryImpl()
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
      case QuartzPackage.QRZ_FILE: return createQrzFile();
      case QuartzPackage.PACKAGE_PATH: return createPackagePath();
      case QuartzPackage.IMPORT_LIST: return createImportList();
      case QuartzPackage.POINTED_NAME: return createPointedName();
      case QuartzPackage.MACRO_DEF: return createMacroDef();
      case QuartzPackage.QMODULE: return createQModule();
      case QuartzPackage.OBSERVED_SPEC_LIST: return createObservedSpecList();
      case QuartzPackage.NAME: return createName();
      case QuartzPackage.QNAME: return createQName();
      case QuartzPackage.QNAME_LIST: return createQNameList();
      case QuartzPackage.QTYPE: return createQType();
      case QuartzPackage.QTYPE_LIST: return createQTypeList();
      case QuartzPackage.DIM_LIST: return createDimList();
      case QuartzPackage.IN_OUT_NAME: return createInOutName();
      case QuartzPackage.IN_OUT_NAME_LIST: return createInOutNameList();
      case QuartzPackage.IN_OUT_NAME_LIST_COMMA: return createInOutNameListComma();
      case QuartzPackage.INTERFACE: return createInterface();
      case QuartzPackage.INTERFACE_COMMA: return createInterfaceComma();
      case QuartzPackage.INTERFACE_LIST: return createInterfaceList();
      case QuartzPackage.CONTROL_LIST: return createControlList();
      case QuartzPackage.ASSUME_LIST: return createAssumeList();
      case QuartzPackage.PROOF_GOAL_LIST: return createProofGoalList();
      case QuartzPackage.FIXPOINT_EQ_LIST: return createFixpointEqList();
      case QuartzPackage.OPT_UTY_EXPR: return createOptUtyExpr();
      case QuartzPackage.OPT_UTY_EXPR_LIST: return createOptUtyExprList();
      case QuartzPackage.UTY_EXPR_SELECT_LIST: return createUtyExprSelectList();
      case QuartzPackage.UTY_EXPR: return createUtyExpr();
      case QuartzPackage.UTY_ACTION: return createUtyAction();
      case QuartzPackage.CASE_LIST: return createcase_list();
      case QuartzPackage.DUTY_EXPR: return createdUtyExpr();
      case QuartzPackage.DUTY_EXPRS: return createdUtyExprs();
      case QuartzPackage.GENERIC: return createGeneric();
      case QuartzPackage.LOC_STMT: return createLocStmt();
      case QuartzPackage.SEQ_STMT: return createSeqStmt();
      case QuartzPackage.STMT: return createStmt();
      case QuartzPackage.ATOMIC_STMT: return createAtomicStmt();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QrzFile createQrzFile()
  {
    QrzFileImpl qrzFile = new QrzFileImpl();
    return qrzFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackagePath createPackagePath()
  {
    PackagePathImpl packagePath = new PackagePathImpl();
    return packagePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportList createImportList()
  {
    ImportListImpl importList = new ImportListImpl();
    return importList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointedName createPointedName()
  {
    PointedNameImpl pointedName = new PointedNameImpl();
    return pointedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroDef createMacroDef()
  {
    MacroDefImpl macroDef = new MacroDefImpl();
    return macroDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QModule createQModule()
  {
    QModuleImpl qModule = new QModuleImpl();
    return qModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObservedSpecList createObservedSpecList()
  {
    ObservedSpecListImpl observedSpecList = new ObservedSpecListImpl();
    return observedSpecList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName createQName()
  {
    QNameImpl qName = new QNameImpl();
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNameList createQNameList()
  {
    QNameListImpl qNameList = new QNameListImpl();
    return qNameList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QType createQType()
  {
    QTypeImpl qType = new QTypeImpl();
    return qType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QTypeList createQTypeList()
  {
    QTypeListImpl qTypeList = new QTypeListImpl();
    return qTypeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimList createDimList()
  {
    DimListImpl dimList = new DimListImpl();
    return dimList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutName createInOutName()
  {
    InOutNameImpl inOutName = new InOutNameImpl();
    return inOutName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutNameList createInOutNameList()
  {
    InOutNameListImpl inOutNameList = new InOutNameListImpl();
    return inOutNameList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutNameListComma createInOutNameListComma()
  {
    InOutNameListCommaImpl inOutNameListComma = new InOutNameListCommaImpl();
    return inOutNameListComma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceComma createInterfaceComma()
  {
    InterfaceCommaImpl interfaceComma = new InterfaceCommaImpl();
    return interfaceComma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceList createInterfaceList()
  {
    InterfaceListImpl interfaceList = new InterfaceListImpl();
    return interfaceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlList createControlList()
  {
    ControlListImpl controlList = new ControlListImpl();
    return controlList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssumeList createAssumeList()
  {
    AssumeListImpl assumeList = new AssumeListImpl();
    return assumeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProofGoalList createProofGoalList()
  {
    ProofGoalListImpl proofGoalList = new ProofGoalListImpl();
    return proofGoalList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixpointEqList createFixpointEqList()
  {
    FixpointEqListImpl fixpointEqList = new FixpointEqListImpl();
    return fixpointEqList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptUtyExpr createOptUtyExpr()
  {
    OptUtyExprImpl optUtyExpr = new OptUtyExprImpl();
    return optUtyExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptUtyExprList createOptUtyExprList()
  {
    OptUtyExprListImpl optUtyExprList = new OptUtyExprListImpl();
    return optUtyExprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExprSelectList createUtyExprSelectList()
  {
    UtyExprSelectListImpl utyExprSelectList = new UtyExprSelectListImpl();
    return utyExprSelectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr createUtyExpr()
  {
    UtyExprImpl utyExpr = new UtyExprImpl();
    return utyExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyAction createUtyAction()
  {
    UtyActionImpl utyAction = new UtyActionImpl();
    return utyAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_list createcase_list()
  {
    case_listImpl case_list = new case_listImpl();
    return case_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dUtyExpr createdUtyExpr()
  {
    dUtyExprImpl dUtyExpr = new dUtyExprImpl();
    return dUtyExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dUtyExprs createdUtyExprs()
  {
    dUtyExprsImpl dUtyExprs = new dUtyExprsImpl();
    return dUtyExprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generic createGeneric()
  {
    GenericImpl generic = new GenericImpl();
    return generic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocStmt createLocStmt()
  {
    LocStmtImpl locStmt = new LocStmtImpl();
    return locStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStmt createSeqStmt()
  {
    SeqStmtImpl seqStmt = new SeqStmtImpl();
    return seqStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt createStmt()
  {
    StmtImpl stmt = new StmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt createAtomicStmt()
  {
    AtomicStmtImpl atomicStmt = new AtomicStmtImpl();
    return atomicStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuartzPackage getQuartzPackage()
  {
    return (QuartzPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QuartzPackage getPackage()
  {
    return QuartzPackage.eINSTANCE;
  }

} //QuartzFactoryImpl
