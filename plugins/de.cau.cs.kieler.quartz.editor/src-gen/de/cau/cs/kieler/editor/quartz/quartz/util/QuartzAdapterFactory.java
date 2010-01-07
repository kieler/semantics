/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.util;

import de.cau.cs.kieler.editor.quartz.quartz.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage
 * @generated
 */
public class QuartzAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuartzPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuartzAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QuartzPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuartzSwitch<Adapter> modelSwitch =
    new QuartzSwitch<Adapter>()
    {
      @Override
      public Adapter caseQrzFile(QrzFile object)
      {
        return createQrzFileAdapter();
      }
      @Override
      public Adapter casePackagePath(PackagePath object)
      {
        return createPackagePathAdapter();
      }
      @Override
      public Adapter caseImportList(ImportList object)
      {
        return createImportListAdapter();
      }
      @Override
      public Adapter casePointedName(PointedName object)
      {
        return createPointedNameAdapter();
      }
      @Override
      public Adapter caseMacroDef(MacroDef object)
      {
        return createMacroDefAdapter();
      }
      @Override
      public Adapter caseQModule(QModule object)
      {
        return createQModuleAdapter();
      }
      @Override
      public Adapter caseObservedSpecList(ObservedSpecList object)
      {
        return createObservedSpecListAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseQName(QName object)
      {
        return createQNameAdapter();
      }
      @Override
      public Adapter caseQNameList(QNameList object)
      {
        return createQNameListAdapter();
      }
      @Override
      public Adapter caseQType(QType object)
      {
        return createQTypeAdapter();
      }
      @Override
      public Adapter caseQTypeList(QTypeList object)
      {
        return createQTypeListAdapter();
      }
      @Override
      public Adapter caseDimList(DimList object)
      {
        return createDimListAdapter();
      }
      @Override
      public Adapter caseInOutName(InOutName object)
      {
        return createInOutNameAdapter();
      }
      @Override
      public Adapter caseInOutNameList(InOutNameList object)
      {
        return createInOutNameListAdapter();
      }
      @Override
      public Adapter caseInOutNameListComma(InOutNameListComma object)
      {
        return createInOutNameListCommaAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseInterfaceComma(InterfaceComma object)
      {
        return createInterfaceCommaAdapter();
      }
      @Override
      public Adapter caseInterfaceList(InterfaceList object)
      {
        return createInterfaceListAdapter();
      }
      @Override
      public Adapter caseControlList(ControlList object)
      {
        return createControlListAdapter();
      }
      @Override
      public Adapter caseAssumeList(AssumeList object)
      {
        return createAssumeListAdapter();
      }
      @Override
      public Adapter caseProofGoalList(ProofGoalList object)
      {
        return createProofGoalListAdapter();
      }
      @Override
      public Adapter caseFixpointEqList(FixpointEqList object)
      {
        return createFixpointEqListAdapter();
      }
      @Override
      public Adapter caseOptUtyExpr(OptUtyExpr object)
      {
        return createOptUtyExprAdapter();
      }
      @Override
      public Adapter caseOptUtyExprList(OptUtyExprList object)
      {
        return createOptUtyExprListAdapter();
      }
      @Override
      public Adapter caseUtyExprSelectList(UtyExprSelectList object)
      {
        return createUtyExprSelectListAdapter();
      }
      @Override
      public Adapter caseUtyExpr(UtyExpr object)
      {
        return createUtyExprAdapter();
      }
      @Override
      public Adapter caseUtyAction(UtyAction object)
      {
        return createUtyActionAdapter();
      }
      @Override
      public Adapter casecase_list(case_list object)
      {
        return createcase_listAdapter();
      }
      @Override
      public Adapter casedUtyExpr(dUtyExpr object)
      {
        return createdUtyExprAdapter();
      }
      @Override
      public Adapter casedUtyExprs(dUtyExprs object)
      {
        return createdUtyExprsAdapter();
      }
      @Override
      public Adapter caseGeneric(Generic object)
      {
        return createGenericAdapter();
      }
      @Override
      public Adapter caseLocStmt(LocStmt object)
      {
        return createLocStmtAdapter();
      }
      @Override
      public Adapter caseSeqStmt(SeqStmt object)
      {
        return createSeqStmtAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseAtomicStmt(AtomicStmt object)
      {
        return createAtomicStmtAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QrzFile <em>Qrz File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QrzFile
   * @generated
   */
  public Adapter createQrzFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.PackagePath <em>Package Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PackagePath
   * @generated
   */
  public Adapter createPackagePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.ImportList <em>Import List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ImportList
   * @generated
   */
  public Adapter createImportListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.PointedName <em>Pointed Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.PointedName
   * @generated
   */
  public Adapter createPointedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef <em>Macro Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.MacroDef
   * @generated
   */
  public Adapter createMacroDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QModule <em>QModule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QModule
   * @generated
   */
  public Adapter createQModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.ObservedSpecList <em>Observed Spec List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ObservedSpecList
   * @generated
   */
  public Adapter createObservedSpecListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QName
   * @generated
   */
  public Adapter createQNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QNameList <em>QName List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QNameList
   * @generated
   */
  public Adapter createQNameListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QType <em>QType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QType
   * @generated
   */
  public Adapter createQTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.QTypeList <em>QType List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QTypeList
   * @generated
   */
  public Adapter createQTypeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.DimList <em>Dim List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.DimList
   * @generated
   */
  public Adapter createDimListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutName <em>In Out Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutName
   * @generated
   */
  public Adapter createInOutNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutNameList <em>In Out Name List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutNameList
   * @generated
   */
  public Adapter createInOutNameListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma <em>In Out Name List Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InOutNameListComma
   * @generated
   */
  public Adapter createInOutNameListCommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma <em>Interface Comma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceComma
   * @generated
   */
  public Adapter createInterfaceCommaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList <em>Interface List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.InterfaceList
   * @generated
   */
  public Adapter createInterfaceListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.ControlList <em>Control List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ControlList
   * @generated
   */
  public Adapter createControlListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.AssumeList <em>Assume List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.AssumeList
   * @generated
   */
  public Adapter createAssumeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList <em>Proof Goal List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.ProofGoalList
   * @generated
   */
  public Adapter createProofGoalListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList <em>Fixpoint Eq List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.FixpointEqList
   * @generated
   */
  public Adapter createFixpointEqListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr <em>Opt Uty Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExpr
   * @generated
   */
  public Adapter createOptUtyExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.OptUtyExprList <em>Opt Uty Expr List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.OptUtyExprList
   * @generated
   */
  public Adapter createOptUtyExprListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList <em>Uty Expr Select List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExprSelectList
   * @generated
   */
  public Adapter createUtyExprSelectListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyExpr <em>Uty Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyExpr
   * @generated
   */
  public Adapter createUtyExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.UtyAction <em>Uty Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.UtyAction
   * @generated
   */
  public Adapter createUtyActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.case_list <em>case list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.case_list
   * @generated
   */
  public Adapter createcase_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr <em>dUty Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr
   * @generated
   */
  public Adapter createdUtyExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs <em>dUty Exprs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs
   * @generated
   */
  public Adapter createdUtyExprsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.Generic <em>Generic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Generic
   * @generated
   */
  public Adapter createGenericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt <em>Loc Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.LocStmt
   * @generated
   */
  public Adapter createLocStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.SeqStmt <em>Seq Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.SeqStmt
   * @generated
   */
  public Adapter createSeqStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt <em>Atomic Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt
   * @generated
   */
  public Adapter createAtomicStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QuartzAdapterFactory
