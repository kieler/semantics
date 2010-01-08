/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.util;

import de.cau.cs.kieler.quartz.editor.quartz.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage
 * @generated
 */
public class QuartzSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuartzPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuartzSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = QuartzPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QuartzPackage.QRZ_FILE:
      {
        QrzFile qrzFile = (QrzFile)theEObject;
        T result = caseQrzFile(qrzFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.PACKAGE_PATH:
      {
        PackagePath packagePath = (PackagePath)theEObject;
        T result = casePackagePath(packagePath);
        if (result == null) result = caseQrzFile(packagePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.IMPORT_LIST:
      {
        ImportList importList = (ImportList)theEObject;
        T result = caseImportList(importList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.POINTED_NAME:
      {
        PointedName pointedName = (PointedName)theEObject;
        T result = casePointedName(pointedName);
        if (result == null) result = casePackagePath(pointedName);
        if (result == null) result = caseQrzFile(pointedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.MACRO_DEF:
      {
        MacroDef macroDef = (MacroDef)theEObject;
        T result = caseMacroDef(macroDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.QMODULE:
      {
        QModule qModule = (QModule)theEObject;
        T result = caseQModule(qModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.OBSERVED_SPEC_LIST:
      {
        ObservedSpecList observedSpecList = (ObservedSpecList)theEObject;
        T result = caseObservedSpecList(observedSpecList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseQName(name);
        if (result == null) result = caseInOutName(name);
        if (result == null) result = caseGeneric(name);
        if (result == null) result = caseInOutNameList(name);
        if (result == null) result = caseUtyExpr(name);
        if (result == null) result = caseUtyAction(name);
        if (result == null) result = casedUtyExpr(name);
        if (result == null) result = caseAtomicStmt(name);
        if (result == null) result = casedUtyExprs(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.QNAME:
      {
        QName qName = (QName)theEObject;
        T result = caseQName(qName);
        if (result == null) result = caseInOutName(qName);
        if (result == null) result = caseGeneric(qName);
        if (result == null) result = caseInOutNameList(qName);
        if (result == null) result = caseUtyExpr(qName);
        if (result == null) result = caseUtyAction(qName);
        if (result == null) result = casedUtyExpr(qName);
        if (result == null) result = caseAtomicStmt(qName);
        if (result == null) result = casedUtyExprs(qName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.QNAME_LIST:
      {
        QNameList qNameList = (QNameList)theEObject;
        T result = caseQNameList(qNameList);
        if (result == null) result = caseControlList(qNameList);
        if (result == null) result = caseAssumeList(qNameList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.QTYPE:
      {
        QType qType = (QType)theEObject;
        T result = caseQType(qType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.QTYPE_LIST:
      {
        QTypeList qTypeList = (QTypeList)theEObject;
        T result = caseQTypeList(qTypeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.DIM_LIST:
      {
        DimList dimList = (DimList)theEObject;
        T result = caseDimList(dimList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.IN_OUT_NAME:
      {
        InOutName inOutName = (InOutName)theEObject;
        T result = caseInOutName(inOutName);
        if (result == null) result = caseInOutNameList(inOutName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.IN_OUT_NAME_LIST:
      {
        InOutNameList inOutNameList = (InOutNameList)theEObject;
        T result = caseInOutNameList(inOutNameList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.IN_OUT_NAME_LIST_COMMA:
      {
        InOutNameListComma inOutNameListComma = (InOutNameListComma)theEObject;
        T result = caseInOutNameListComma(inOutNameListComma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.INTERFACE_COMMA:
      {
        InterfaceComma interfaceComma = (InterfaceComma)theEObject;
        T result = caseInterfaceComma(interfaceComma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.INTERFACE_LIST:
      {
        InterfaceList interfaceList = (InterfaceList)theEObject;
        T result = caseInterfaceList(interfaceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.CONTROL_LIST:
      {
        ControlList controlList = (ControlList)theEObject;
        T result = caseControlList(controlList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.ASSUME_LIST:
      {
        AssumeList assumeList = (AssumeList)theEObject;
        T result = caseAssumeList(assumeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.PROOF_GOAL_LIST:
      {
        ProofGoalList proofGoalList = (ProofGoalList)theEObject;
        T result = caseProofGoalList(proofGoalList);
        if (result == null) result = caseObservedSpecList(proofGoalList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.FIXPOINT_EQ_LIST:
      {
        FixpointEqList fixpointEqList = (FixpointEqList)theEObject;
        T result = caseFixpointEqList(fixpointEqList);
        if (result == null) result = caseUtyExpr(fixpointEqList);
        if (result == null) result = caseUtyAction(fixpointEqList);
        if (result == null) result = casedUtyExpr(fixpointEqList);
        if (result == null) result = caseAtomicStmt(fixpointEqList);
        if (result == null) result = casedUtyExprs(fixpointEqList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.OPT_UTY_EXPR:
      {
        OptUtyExpr optUtyExpr = (OptUtyExpr)theEObject;
        T result = caseOptUtyExpr(optUtyExpr);
        if (result == null) result = caseOptUtyExprList(optUtyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.OPT_UTY_EXPR_LIST:
      {
        OptUtyExprList optUtyExprList = (OptUtyExprList)theEObject;
        T result = caseOptUtyExprList(optUtyExprList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.UTY_EXPR_SELECT_LIST:
      {
        UtyExprSelectList utyExprSelectList = (UtyExprSelectList)theEObject;
        T result = caseUtyExprSelectList(utyExprSelectList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.UTY_EXPR:
      {
        UtyExpr utyExpr = (UtyExpr)theEObject;
        T result = caseUtyExpr(utyExpr);
        if (result == null) result = caseUtyAction(utyExpr);
        if (result == null) result = casedUtyExpr(utyExpr);
        if (result == null) result = caseAtomicStmt(utyExpr);
        if (result == null) result = casedUtyExprs(utyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.UTY_ACTION:
      {
        UtyAction utyAction = (UtyAction)theEObject;
        T result = caseUtyAction(utyAction);
        if (result == null) result = caseAtomicStmt(utyAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.CASE_LIST:
      {
        case_list case_list = (case_list)theEObject;
        T result = casecase_list(case_list);
        if (result == null) result = caseAtomicStmt(case_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.DUTY_EXPR:
      {
        dUtyExpr dUtyExpr = (dUtyExpr)theEObject;
        T result = casedUtyExpr(dUtyExpr);
        if (result == null) result = casedUtyExprs(dUtyExpr);
        if (result == null) result = caseAtomicStmt(dUtyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.DUTY_EXPRS:
      {
        dUtyExprs dUtyExprs = (dUtyExprs)theEObject;
        T result = casedUtyExprs(dUtyExprs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.GENERIC:
      {
        Generic generic = (Generic)theEObject;
        T result = caseGeneric(generic);
        if (result == null) result = caseUtyExpr(generic);
        if (result == null) result = caseUtyAction(generic);
        if (result == null) result = casedUtyExpr(generic);
        if (result == null) result = caseAtomicStmt(generic);
        if (result == null) result = casedUtyExprs(generic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.LOC_STMT:
      {
        LocStmt locStmt = (LocStmt)theEObject;
        T result = caseLocStmt(locStmt);
        if (result == null) result = caseAtomicStmt(locStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.SEQ_STMT:
      {
        SeqStmt seqStmt = (SeqStmt)theEObject;
        T result = caseSeqStmt(seqStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = caseAtomicStmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuartzPackage.ATOMIC_STMT:
      {
        AtomicStmt atomicStmt = (AtomicStmt)theEObject;
        T result = caseAtomicStmt(atomicStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qrz File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qrz File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQrzFile(QrzFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackagePath(PackagePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportList(ImportList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pointed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pointed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointedName(PointedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Macro Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Macro Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMacroDef(MacroDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QModule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QModule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQModule(QModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observed Spec List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observed Spec List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservedSpecList(ObservedSpecList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQName(QName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QName List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QName List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQNameList(QNameList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQType(QType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QType List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QType List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQTypeList(QTypeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dim List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dim List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimList(DimList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOutName(InOutName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Name List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Name List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOutNameList(InOutNameList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Name List Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Name List Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOutNameListComma(InOutNameListComma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Comma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Comma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceComma(InterfaceComma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceList(InterfaceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlList(ControlList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assume List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assume List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssumeList(AssumeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proof Goal List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proof Goal List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProofGoalList(ProofGoalList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixpoint Eq List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixpoint Eq List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixpointEqList(FixpointEqList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opt Uty Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opt Uty Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptUtyExpr(OptUtyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Opt Uty Expr List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Opt Uty Expr List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptUtyExprList(OptUtyExprList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uty Expr Select List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uty Expr Select List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUtyExprSelectList(UtyExprSelectList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uty Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uty Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUtyExpr(UtyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uty Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uty Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUtyAction(UtyAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>case list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>case list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecase_list(case_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>dUty Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>dUty Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedUtyExpr(dUtyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>dUty Exprs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>dUty Exprs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedUtyExprs(dUtyExprs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneric(Generic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocStmt(LocStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqStmt(SeqStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicStmt(AtomicStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QuartzSwitch
