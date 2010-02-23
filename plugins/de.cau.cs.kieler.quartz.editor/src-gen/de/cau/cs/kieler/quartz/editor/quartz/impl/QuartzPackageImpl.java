/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.AssumeList;
import de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt;
import de.cau.cs.kieler.quartz.editor.quartz.ControlList;
import de.cau.cs.kieler.quartz.editor.quartz.DimList;
import de.cau.cs.kieler.quartz.editor.quartz.FixpointEqList;
import de.cau.cs.kieler.quartz.editor.quartz.Generic;
import de.cau.cs.kieler.quartz.editor.quartz.ImportList;
import de.cau.cs.kieler.quartz.editor.quartz.InOutName;
import de.cau.cs.kieler.quartz.editor.quartz.InOutNameList;
import de.cau.cs.kieler.quartz.editor.quartz.InOutNameListComma;
import de.cau.cs.kieler.quartz.editor.quartz.Interface;
import de.cau.cs.kieler.quartz.editor.quartz.InterfaceComma;
import de.cau.cs.kieler.quartz.editor.quartz.InterfaceList;
import de.cau.cs.kieler.quartz.editor.quartz.LocStmt;
import de.cau.cs.kieler.quartz.editor.quartz.MacroDef;
import de.cau.cs.kieler.quartz.editor.quartz.Name;
import de.cau.cs.kieler.quartz.editor.quartz.NamedStmt;
import de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.OptUtyExprList;
import de.cau.cs.kieler.quartz.editor.quartz.PackagePath;
import de.cau.cs.kieler.quartz.editor.quartz.PointedName;
import de.cau.cs.kieler.quartz.editor.quartz.QModule;
import de.cau.cs.kieler.quartz.editor.quartz.QName;
import de.cau.cs.kieler.quartz.editor.quartz.QNameList;
import de.cau.cs.kieler.quartz.editor.quartz.QType;
import de.cau.cs.kieler.quartz.editor.quartz.QTypeList;
import de.cau.cs.kieler.quartz.editor.quartz.QrzFile;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzFactory;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.SeqStmt;
import de.cau.cs.kieler.quartz.editor.quartz.Stmt;
import de.cau.cs.kieler.quartz.editor.quartz.UtyAction;
import de.cau.cs.kieler.quartz.editor.quartz.UtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.UtyExprSelectList;
import de.cau.cs.kieler.quartz.editor.quartz.case_list;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExprs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuartzPackageImpl extends EPackageImpl implements QuartzPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qrzFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packagePathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macroDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNameListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qTypeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOutNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOutNameListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOutNameListCommaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceCommaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assumeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixpointEqListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optUtyExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optUtyExprListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass utyExprSelectListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass utyExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass utyActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dUtyExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dUtyExprsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedStmtEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QuartzPackageImpl()
  {
    super(eNS_URI, QuartzFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QuartzPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QuartzPackage init()
  {
    if (isInited) return (QuartzPackage)EPackage.Registry.INSTANCE.getEPackage(QuartzPackage.eNS_URI);

    // Obtain or create and register package
    QuartzPackageImpl theQuartzPackage = (QuartzPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuartzPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuartzPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQuartzPackage.createPackageContents();

    // Initialize created meta-data
    theQuartzPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQuartzPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QuartzPackage.eNS_URI, theQuartzPackage);
    return theQuartzPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQrzFile()
  {
    return qrzFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQrzFile_Imports()
  {
    return (EReference)qrzFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQrzFile_Macros()
  {
    return (EReference)qrzFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQrzFile_Module()
  {
    return (EReference)qrzFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackagePath()
  {
    return packagePathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportList()
  {
    return importListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportList_Imp()
  {
    return (EReference)importListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointedName()
  {
    return pointedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointedName_Id()
  {
    return (EAttribute)pointedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointedName_Name()
  {
    return (EReference)pointedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointedName_All()
  {
    return (EAttribute)pointedNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMacroDef()
  {
    return macroDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMacroDef_Name()
  {
    return (EReference)macroDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMacroDef_Args()
  {
    return (EReference)macroDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMacroDef_Expr()
  {
    return (EReference)macroDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQModule()
  {
    return qModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQModule_Name()
  {
    return (EReference)qModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQModule_Intf()
  {
    return (EReference)qModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQModule_Stmt()
  {
    return (EReference)qModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Id()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQName()
  {
    return qNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_T6()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_T5()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_T24()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_Exprs()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQName_T10()
  {
    return (EReference)qNameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQNameList()
  {
    return qNameListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQNameList_Name()
  {
    return (EReference)qNameListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQNameList_Names()
  {
    return (EReference)qNameListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQType()
  {
    return qTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQType_Ta()
  {
    return (EReference)qTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQType_Tb()
  {
    return (EReference)qTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQType_Tc()
  {
    return (EReference)qTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQType_Dims()
  {
    return (EReference)qTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQTypeList()
  {
    return qTypeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQTypeList_Type()
  {
    return (EReference)qTypeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQTypeList_T()
  {
    return (EReference)qTypeListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimList()
  {
    return dimListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimList_Expr()
  {
    return (EReference)dimListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOutName()
  {
    return inOutNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInOutName_Names()
  {
    return (EReference)inOutNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOutNameList()
  {
    return inOutNameListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOutNameListComma()
  {
    return inOutNameListCommaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInOutNameListComma_Names()
  {
    return (EReference)inOutNameListCommaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Type()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_Names()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceComma()
  {
    return interfaceCommaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceComma_Type()
  {
    return (EReference)interfaceCommaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceComma_Names()
  {
    return (EReference)interfaceCommaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceList()
  {
    return interfaceListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceList_Intf()
  {
    return (EReference)interfaceListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceList_Interfaces()
  {
    return (EReference)interfaceListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlList()
  {
    return controlListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssumeList()
  {
    return assumeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixpointEqList()
  {
    return fixpointEqListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixpointEqList_Expr2()
  {
    return (EReference)fixpointEqListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptUtyExpr()
  {
    return optUtyExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptUtyExpr_Tk()
  {
    return (EReference)optUtyExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptUtyExpr_Exprs()
  {
    return (EReference)optUtyExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptUtyExprList()
  {
    return optUtyExprListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUtyExprSelectList()
  {
    return utyExprSelectListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExprSelectList_Tk()
  {
    return (EReference)utyExprSelectListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUtyExpr()
  {
    return utyExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUtyExpr_Op()
  {
    return (EAttribute)utyExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExpr_T7()
  {
    return (EReference)utyExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExpr_Name()
  {
    return (EReference)utyExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExpr_Type()
  {
    return (EReference)utyExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExpr_T2()
  {
    return (EReference)utyExprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUtyExpr_T4()
  {
    return (EReference)utyExprEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUtyAction()
  {
    return utyActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcase_list()
  {
    return case_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_list_Exp()
  {
    return (EReference)case_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_list_Stmt()
  {
    return (EReference)case_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcase_list_T15()
  {
    return (EReference)case_listEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdUtyExpr()
  {
    return dUtyExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdUtyExpr_T13()
  {
    return (EReference)dUtyExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdUtyExpr_T14()
  {
    return (EReference)dUtyExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdUtyExpr_T07()
  {
    return (EReference)dUtyExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdUtyExprs()
  {
    return dUtyExprsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneric()
  {
    return genericEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneric_T23()
  {
    return (EReference)genericEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneric_T()
  {
    return (EReference)genericEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocStmt()
  {
    return locStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocStmt_Locals()
  {
    return (EReference)locStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocStmt_Stmt()
  {
    return (EReference)locStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqStmt()
  {
    return seqStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqStmt_S()
  {
    return (EReference)seqStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStmt()
  {
    return stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Left()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Right()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicStmt()
  {
    return atomicStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicStmt_Expr()
  {
    return (EReference)atomicStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicStmt_T03()
  {
    return (EReference)atomicStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicStmt_T06()
  {
    return (EReference)atomicStmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedStmt()
  {
    return namedStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuartzFactory getQuartzFactory()
  {
    return (QuartzFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    qrzFileEClass = createEClass(QRZ_FILE);
    createEReference(qrzFileEClass, QRZ_FILE__IMPORTS);
    createEReference(qrzFileEClass, QRZ_FILE__MACROS);
    createEReference(qrzFileEClass, QRZ_FILE__MODULE);

    packagePathEClass = createEClass(PACKAGE_PATH);

    importListEClass = createEClass(IMPORT_LIST);
    createEReference(importListEClass, IMPORT_LIST__IMP);

    pointedNameEClass = createEClass(POINTED_NAME);
    createEAttribute(pointedNameEClass, POINTED_NAME__ID);
    createEReference(pointedNameEClass, POINTED_NAME__NAME);
    createEAttribute(pointedNameEClass, POINTED_NAME__ALL);

    macroDefEClass = createEClass(MACRO_DEF);
    createEReference(macroDefEClass, MACRO_DEF__NAME);
    createEReference(macroDefEClass, MACRO_DEF__ARGS);
    createEReference(macroDefEClass, MACRO_DEF__EXPR);

    qModuleEClass = createEClass(QMODULE);
    createEReference(qModuleEClass, QMODULE__NAME);
    createEReference(qModuleEClass, QMODULE__INTF);
    createEReference(qModuleEClass, QMODULE__STMT);

    nameEClass = createEClass(NAME);
    createEAttribute(nameEClass, NAME__ID);

    qNameEClass = createEClass(QNAME);
    createEReference(qNameEClass, QNAME__T6);
    createEReference(qNameEClass, QNAME__T5);
    createEReference(qNameEClass, QNAME__T24);
    createEReference(qNameEClass, QNAME__EXPRS);
    createEReference(qNameEClass, QNAME__T10);

    qNameListEClass = createEClass(QNAME_LIST);
    createEReference(qNameListEClass, QNAME_LIST__NAME);
    createEReference(qNameListEClass, QNAME_LIST__NAMES);

    qTypeEClass = createEClass(QTYPE);
    createEReference(qTypeEClass, QTYPE__TA);
    createEReference(qTypeEClass, QTYPE__TB);
    createEReference(qTypeEClass, QTYPE__TC);
    createEReference(qTypeEClass, QTYPE__DIMS);

    qTypeListEClass = createEClass(QTYPE_LIST);
    createEReference(qTypeListEClass, QTYPE_LIST__TYPE);
    createEReference(qTypeListEClass, QTYPE_LIST__T);

    dimListEClass = createEClass(DIM_LIST);
    createEReference(dimListEClass, DIM_LIST__EXPR);

    inOutNameEClass = createEClass(IN_OUT_NAME);
    createEReference(inOutNameEClass, IN_OUT_NAME__NAMES);

    inOutNameListEClass = createEClass(IN_OUT_NAME_LIST);

    inOutNameListCommaEClass = createEClass(IN_OUT_NAME_LIST_COMMA);
    createEReference(inOutNameListCommaEClass, IN_OUT_NAME_LIST_COMMA__NAMES);

    interfaceEClass = createEClass(INTERFACE);
    createEReference(interfaceEClass, INTERFACE__TYPE);
    createEReference(interfaceEClass, INTERFACE__NAMES);

    interfaceCommaEClass = createEClass(INTERFACE_COMMA);
    createEReference(interfaceCommaEClass, INTERFACE_COMMA__TYPE);
    createEReference(interfaceCommaEClass, INTERFACE_COMMA__NAMES);

    interfaceListEClass = createEClass(INTERFACE_LIST);
    createEReference(interfaceListEClass, INTERFACE_LIST__INTF);
    createEReference(interfaceListEClass, INTERFACE_LIST__INTERFACES);

    controlListEClass = createEClass(CONTROL_LIST);

    assumeListEClass = createEClass(ASSUME_LIST);

    fixpointEqListEClass = createEClass(FIXPOINT_EQ_LIST);
    createEReference(fixpointEqListEClass, FIXPOINT_EQ_LIST__EXPR2);

    optUtyExprEClass = createEClass(OPT_UTY_EXPR);
    createEReference(optUtyExprEClass, OPT_UTY_EXPR__TK);
    createEReference(optUtyExprEClass, OPT_UTY_EXPR__EXPRS);

    optUtyExprListEClass = createEClass(OPT_UTY_EXPR_LIST);

    utyExprSelectListEClass = createEClass(UTY_EXPR_SELECT_LIST);
    createEReference(utyExprSelectListEClass, UTY_EXPR_SELECT_LIST__TK);

    utyExprEClass = createEClass(UTY_EXPR);
    createEAttribute(utyExprEClass, UTY_EXPR__OP);
    createEReference(utyExprEClass, UTY_EXPR__T7);
    createEReference(utyExprEClass, UTY_EXPR__NAME);
    createEReference(utyExprEClass, UTY_EXPR__TYPE);
    createEReference(utyExprEClass, UTY_EXPR__T2);
    createEReference(utyExprEClass, UTY_EXPR__T4);

    utyActionEClass = createEClass(UTY_ACTION);

    case_listEClass = createEClass(CASE_LIST);
    createEReference(case_listEClass, CASE_LIST__EXP);
    createEReference(case_listEClass, CASE_LIST__STMT);
    createEReference(case_listEClass, CASE_LIST__T15);

    dUtyExprEClass = createEClass(DUTY_EXPR);
    createEReference(dUtyExprEClass, DUTY_EXPR__T13);
    createEReference(dUtyExprEClass, DUTY_EXPR__T14);
    createEReference(dUtyExprEClass, DUTY_EXPR__T07);

    dUtyExprsEClass = createEClass(DUTY_EXPRS);

    genericEClass = createEClass(GENERIC);
    createEReference(genericEClass, GENERIC__T23);
    createEReference(genericEClass, GENERIC__T);

    locStmtEClass = createEClass(LOC_STMT);
    createEReference(locStmtEClass, LOC_STMT__LOCALS);
    createEReference(locStmtEClass, LOC_STMT__STMT);

    seqStmtEClass = createEClass(SEQ_STMT);
    createEReference(seqStmtEClass, SEQ_STMT__S);

    stmtEClass = createEClass(STMT);
    createEReference(stmtEClass, STMT__LEFT);
    createEReference(stmtEClass, STMT__RIGHT);

    atomicStmtEClass = createEClass(ATOMIC_STMT);
    createEReference(atomicStmtEClass, ATOMIC_STMT__EXPR);
    createEReference(atomicStmtEClass, ATOMIC_STMT__T03);
    createEReference(atomicStmtEClass, ATOMIC_STMT__T06);

    namedStmtEClass = createEClass(NAMED_STMT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packagePathEClass.getESuperTypes().add(this.getQrzFile());
    pointedNameEClass.getESuperTypes().add(this.getPackagePath());
    nameEClass.getESuperTypes().add(this.getQName());
    qNameEClass.getESuperTypes().add(this.getInOutName());
    qNameEClass.getESuperTypes().add(this.getUtyExpr());
    qNameEClass.getESuperTypes().add(this.getGeneric());
    qNameEClass.getESuperTypes().add(this.getNamedStmt());
    qNameListEClass.getESuperTypes().add(this.getControlList());
    qNameListEClass.getESuperTypes().add(this.getAssumeList());
    inOutNameEClass.getESuperTypes().add(this.getInOutNameList());
    fixpointEqListEClass.getESuperTypes().add(this.getUtyExpr());
    optUtyExprEClass.getESuperTypes().add(this.getOptUtyExprList());
    utyExprEClass.getESuperTypes().add(this.getUtyAction());
    utyExprEClass.getESuperTypes().add(this.getdUtyExpr());
    utyActionEClass.getESuperTypes().add(this.getAtomicStmt());
    case_listEClass.getESuperTypes().add(this.getAtomicStmt());
    dUtyExprEClass.getESuperTypes().add(this.getdUtyExprs());
    dUtyExprEClass.getESuperTypes().add(this.getAtomicStmt());
    genericEClass.getESuperTypes().add(this.getUtyExpr());
    locStmtEClass.getESuperTypes().add(this.getAtomicStmt());
    namedStmtEClass.getESuperTypes().add(this.getAtomicStmt());

    // Initialize classes and features; add operations and parameters
    initEClass(qrzFileEClass, QrzFile.class, "QrzFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQrzFile_Imports(), this.getImportList(), null, "imports", null, 0, 1, QrzFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQrzFile_Macros(), this.getMacroDef(), null, "macros", null, 0, -1, QrzFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQrzFile_Module(), this.getQModule(), null, "module", null, 0, 1, QrzFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packagePathEClass, PackagePath.class, "PackagePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importListEClass, ImportList.class, "ImportList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportList_Imp(), this.getPointedName(), null, "imp", null, 0, -1, ImportList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointedNameEClass, PointedName.class, "PointedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPointedName_Id(), ecorePackage.getEString(), "id", null, 0, 1, PointedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPointedName_Name(), this.getPointedName(), null, "name", null, 0, -1, PointedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPointedName_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, PointedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macroDefEClass, MacroDef.class, "MacroDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMacroDef_Name(), this.getQName(), null, "name", null, 0, 1, MacroDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMacroDef_Args(), this.getQNameList(), null, "args", null, 0, 1, MacroDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMacroDef_Expr(), this.getUtyExpr(), null, "expr", null, 0, 1, MacroDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qModuleEClass, QModule.class, "QModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQModule_Name(), this.getName_(), null, "name", null, 0, 1, QModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQModule_Intf(), this.getInterfaceList(), null, "intf", null, 0, 1, QModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQModule_Stmt(), this.getLocStmt(), null, "stmt", null, 0, 1, QModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getName_Id(), ecorePackage.getEString(), "id", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNameEClass, QName.class, "QName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQName_T6(), this.getUtyExpr(), null, "t6", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQName_T5(), this.getUtyExpr(), null, "t5", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQName_T24(), this.getAtomicStmt(), null, "t24", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQName_Exprs(), this.getOptUtyExprList(), null, "exprs", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQName_T10(), this.getAtomicStmt(), null, "t10", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNameListEClass, QNameList.class, "QNameList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQNameList_Name(), this.getQName(), null, "name", null, 0, 1, QNameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQNameList_Names(), this.getQName(), null, "names", null, 0, -1, QNameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qTypeEClass, QType.class, "QType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQType_Ta(), this.getUtyExpr(), null, "ta", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQType_Tb(), this.getUtyExpr(), null, "tb", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQType_Tc(), this.getUtyExpr(), null, "tc", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQType_Dims(), this.getDimList(), null, "dims", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qTypeListEClass, QTypeList.class, "QTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQTypeList_Type(), this.getQType(), null, "type", null, 0, 1, QTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQTypeList_T(), this.getQType(), null, "t", null, 0, -1, QTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimListEClass, DimList.class, "DimList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimList_Expr(), this.getUtyExpr(), null, "expr", null, 0, -1, DimList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inOutNameEClass, InOutName.class, "InOutName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInOutName_Names(), this.getInOutName(), null, "names", null, 0, -1, InOutName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inOutNameListEClass, InOutNameList.class, "InOutNameList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inOutNameListCommaEClass, InOutNameListComma.class, "InOutNameListComma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInOutNameListComma_Names(), this.getInOutName(), null, "names", null, 0, -1, InOutNameListComma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_Type(), this.getQType(), null, "type", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_Names(), this.getInOutNameList(), null, "names", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceCommaEClass, InterfaceComma.class, "InterfaceComma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceComma_Type(), this.getQType(), null, "type", null, 0, 1, InterfaceComma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceComma_Names(), this.getInOutNameListComma(), null, "names", null, 0, 1, InterfaceComma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceListEClass, InterfaceList.class, "InterfaceList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceList_Intf(), this.getInterface(), null, "intf", null, 0, 1, InterfaceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceList_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, InterfaceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlListEClass, ControlList.class, "ControlList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assumeListEClass, AssumeList.class, "AssumeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fixpointEqListEClass, FixpointEqList.class, "FixpointEqList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFixpointEqList_Expr2(), this.getUtyExpr(), null, "expr2", null, 0, 1, FixpointEqList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optUtyExprEClass, OptUtyExpr.class, "OptUtyExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptUtyExpr_Tk(), this.getUtyExpr(), null, "tk", null, 0, 1, OptUtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptUtyExpr_Exprs(), this.getOptUtyExpr(), null, "exprs", null, 0, -1, OptUtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optUtyExprListEClass, OptUtyExprList.class, "OptUtyExprList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(utyExprSelectListEClass, UtyExprSelectList.class, "UtyExprSelectList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUtyExprSelectList_Tk(), this.getUtyExpr(), null, "tk", null, 0, 1, UtyExprSelectList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(utyExprEClass, UtyExpr.class, "UtyExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUtyExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtyExpr_T7(), this.getUtyExpr(), null, "t7", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtyExpr_Name(), this.getQName(), null, "name", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtyExpr_Type(), this.getQType(), null, "type", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtyExpr_T2(), this.getUtyExpr(), null, "t2", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUtyExpr_T4(), this.getUtyExpr(), null, "t4", null, 0, 1, UtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(utyActionEClass, UtyAction.class, "UtyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(case_listEClass, case_list.class, "case_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcase_list_Exp(), this.getdUtyExpr(), null, "exp", null, 0, -1, case_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_list_Stmt(), this.getStmt(), null, "stmt", null, 0, -1, case_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcase_list_T15(), this.getAtomicStmt(), null, "t15", null, 0, 1, case_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dUtyExprEClass, dUtyExpr.class, "dUtyExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdUtyExpr_T13(), this.getAtomicStmt(), null, "t13", null, 0, 1, dUtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdUtyExpr_T14(), this.getAtomicStmt(), null, "t14", null, 0, 1, dUtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getdUtyExpr_T07(), this.getAtomicStmt(), null, "t07", null, 0, 1, dUtyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dUtyExprsEClass, dUtyExprs.class, "dUtyExprs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericEClass, Generic.class, "Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneric_T23(), this.getAtomicStmt(), null, "t23", null, 0, 1, Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneric_T(), this.getAtomicStmt(), null, "t", null, 0, 1, Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locStmtEClass, LocStmt.class, "LocStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocStmt_Locals(), this.getInterfaceList(), null, "locals", null, 0, -1, LocStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocStmt_Stmt(), this.getStmt(), null, "stmt", null, 0, 1, LocStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seqStmtEClass, SeqStmt.class, "SeqStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSeqStmt_S(), this.getAtomicStmt(), null, "s", null, 0, -1, SeqStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStmt_Left(), this.getSeqStmt(), null, "left", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Right(), this.getSeqStmt(), null, "right", null, 0, -1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicStmtEClass, AtomicStmt.class, "AtomicStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicStmt_Expr(), this.getdUtyExprs(), null, "expr", null, 0, 1, AtomicStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicStmt_T03(), this.getAtomicStmt(), null, "t03", null, 0, 1, AtomicStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicStmt_T06(), this.getdUtyExprs(), null, "t06", null, 0, 1, AtomicStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedStmtEClass, NamedStmt.class, "NamedStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //QuartzPackageImpl
