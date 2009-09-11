/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.Abort;
import de.cau.cs.kieler.esterel.AbortBody;
import de.cau.cs.kieler.esterel.AbortCase;
import de.cau.cs.kieler.esterel.AbortCaseSingle;
import de.cau.cs.kieler.esterel.AbortInstance;
import de.cau.cs.kieler.esterel.Assignment;
import de.cau.cs.kieler.esterel.Await;
import de.cau.cs.kieler.esterel.AwaitBody;
import de.cau.cs.kieler.esterel.AwaitCase;
import de.cau.cs.kieler.esterel.AwaitInstance;
import de.cau.cs.kieler.esterel.Block;
import de.cau.cs.kieler.esterel.ChannelDescription;
import de.cau.cs.kieler.esterel.Constant;
import de.cau.cs.kieler.esterel.ConstantDecl;
import de.cau.cs.kieler.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.DataUnaryExpr;
import de.cau.cs.kieler.esterel.DelayEvent;
import de.cau.cs.kieler.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.Do;
import de.cau.cs.kieler.esterel.DoUpto;
import de.cau.cs.kieler.esterel.DoWatching;
import de.cau.cs.kieler.esterel.DoWatchingEnd;
import de.cau.cs.kieler.esterel.ElsIf;
import de.cau.cs.kieler.esterel.ElsIfPart;
import de.cau.cs.kieler.esterel.ElsePart;
import de.cau.cs.kieler.esterel.Emit;
import de.cau.cs.kieler.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.EveryDo;
import de.cau.cs.kieler.esterel.Exit;
import de.cau.cs.kieler.esterel.Function;
import de.cau.cs.kieler.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.FunctionRenaming;
import de.cau.cs.kieler.esterel.Halt;
import de.cau.cs.kieler.esterel.IfTest;
import de.cau.cs.kieler.esterel.Input;
import de.cau.cs.kieler.esterel.InputOutput;
import de.cau.cs.kieler.esterel.LocalSignal;
import de.cau.cs.kieler.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.LocalSignalList;
import de.cau.cs.kieler.esterel.Loop;
import de.cau.cs.kieler.esterel.LoopBody;
import de.cau.cs.kieler.esterel.LoopDelay;
import de.cau.cs.kieler.esterel.LoopEach;
import de.cau.cs.kieler.esterel.MainModule;
import de.cau.cs.kieler.esterel.Module;
import de.cau.cs.kieler.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.Nothing;
import de.cau.cs.kieler.esterel.OneTypeConstantDecl;
import de.cau.cs.kieler.esterel.Output;
import de.cau.cs.kieler.esterel.Parallel;
import de.cau.cs.kieler.esterel.Pause;
import de.cau.cs.kieler.esterel.Present;
import de.cau.cs.kieler.esterel.PresentBody;
import de.cau.cs.kieler.esterel.PresentCase;
import de.cau.cs.kieler.esterel.PresentCaseList;
import de.cau.cs.kieler.esterel.PresentEvent;
import de.cau.cs.kieler.esterel.PresentEventBody;
import de.cau.cs.kieler.esterel.Programm;
import de.cau.cs.kieler.esterel.Relation;
import de.cau.cs.kieler.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.Renaming;
import de.cau.cs.kieler.esterel.RenamingList;
import de.cau.cs.kieler.esterel.Repeat;
import de.cau.cs.kieler.esterel.Return;
import de.cau.cs.kieler.esterel.Run;
import de.cau.cs.kieler.esterel.Sensor;
import de.cau.cs.kieler.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.Sequence;
import de.cau.cs.kieler.esterel.SigExpr;
import de.cau.cs.kieler.esterel.SigExprAND;
import de.cau.cs.kieler.esterel.SigExprUnary;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.SignalDecl;
import de.cau.cs.kieler.esterel.SignalRenaming;
import de.cau.cs.kieler.esterel.Statement;
import de.cau.cs.kieler.esterel.Suspend;
import de.cau.cs.kieler.esterel.Sustain;
import de.cau.cs.kieler.esterel.ThenPart;
import de.cau.cs.kieler.esterel.Tick;
import de.cau.cs.kieler.esterel.Trap;
import de.cau.cs.kieler.esterel.TrapDecl;
import de.cau.cs.kieler.esterel.TrapDeclList;
import de.cau.cs.kieler.esterel.TrapExpr;
import de.cau.cs.kieler.esterel.TrapHandler;
import de.cau.cs.kieler.esterel.TrapHandlerList;
import de.cau.cs.kieler.esterel.Type;
import de.cau.cs.kieler.esterel.TypeDecl;
import de.cau.cs.kieler.esterel.TypeRenaming;
import de.cau.cs.kieler.esterel.Variable;
import de.cau.cs.kieler.esterel.VariableDecl;
import de.cau.cs.kieler.esterel.VariableList;
import de.cau.cs.kieler.esterel.WeakAbort;
import de.cau.cs.kieler.esterel.WeakAbortBody;
import de.cau.cs.kieler.esterel.WeakAbortCase;
import de.cau.cs.kieler.esterel.WeakAbortInstance;

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
public class EsterelPackageImpl extends EPackageImpl implements EsterelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleInterfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneTypeConstantDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abortCaseSingleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awaitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awaitBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awaitInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass awaitCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doUptoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doWatchingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doWatchingEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass everyDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass haltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsIfPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thenPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elsePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopDelayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nothingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentEventBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentCaseListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presentEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renamingListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSignalDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSignalListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suspendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sustainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapDeclListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapHandlerListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataUnaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigExprANDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sigExprUnaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delayEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass channelDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tickEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parallelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSignalEClass = null;

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EsterelPackageImpl()
  {
    super(eNS_URI, EsterelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EsterelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EsterelPackage init()
  {
    if (isInited) return (EsterelPackage)EPackage.Registry.INSTANCE.getEPackage(EsterelPackage.eNS_URI);

    // Obtain or create and register package
    EsterelPackageImpl theEsterelPackage = (EsterelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EsterelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EsterelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEsterelPackage.createPackageContents();

    // Initialize created meta-data
    theEsterelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEsterelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EsterelPackage.eNS_URI, theEsterelPackage);
    return theEsterelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgramm()
  {
    return programmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgramm_Module()
  {
    return (EReference)programmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainModule()
  {
    return mainModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMainModule_Name()
  {
    return (EAttribute)mainModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainModule_ModInt()
  {
    return (EReference)mainModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainModule_ModBody()
  {
    return (EReference)mainModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ModInt()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ModBody()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleBody()
  {
    return moduleBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleBody_Statement()
  {
    return (EReference)moduleBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleInterface()
  {
    return moduleInterfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntSignalDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntTypeDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntSensorDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntConstantDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntRelationDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntFunctionDecl()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalDecl()
  {
    return signalDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalDecl_Signal()
  {
    return (EReference)signalDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorDecl()
  {
    return sensorDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorDecl_Sensor()
  {
    return (EReference)sensorDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationDecl()
  {
    return relationDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationDecl_Relation()
  {
    return (EReference)relationDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_First()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Type()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Second()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Incomp()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDecl()
  {
    return typeDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDecl_Type()
  {
    return (EReference)typeDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDecl()
  {
    return constantDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDecl_Constant()
  {
    return (EReference)constantDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneTypeConstantDecl()
  {
    return oneTypeConstantDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneTypeConstantDecl_Constant()
  {
    return (EReference)oneTypeConstantDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneTypeConstantDecl_Type()
  {
    return (EAttribute)oneTypeConstantDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Value()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDecl()
  {
    return functionDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDecl_Function()
  {
    return (EReference)functionDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_IdList()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Type()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Statement()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Variable()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Expr()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbort()
  {
    return abortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbort_Statement()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbort_Body()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortBody()
  {
    return abortBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbortBody_End()
  {
    return (EAttribute)abortBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortInstance()
  {
    return abortInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbortInstance_Delay()
  {
    return (EReference)abortInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbortInstance_Statement()
  {
    return (EReference)abortInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortCase()
  {
    return abortCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbortCase_Cases()
  {
    return (EReference)abortCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbortCaseSingle()
  {
    return abortCaseSingleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbortCaseSingle_Delay()
  {
    return (EReference)abortCaseSingleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbortCaseSingle_Statement()
  {
    return (EReference)abortCaseSingleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwait()
  {
    return awaitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwait_Body()
  {
    return (EReference)awaitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwaitBody()
  {
    return awaitBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwaitInstance()
  {
    return awaitInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAwaitCase()
  {
    return awaitCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAwaitCase_Cases()
  {
    return (EReference)awaitCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAwaitCase_End()
  {
    return (EAttribute)awaitCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDo()
  {
    return doEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_Statement()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_End()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoUpto()
  {
    return doUptoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoUpto_Expr()
  {
    return (EReference)doUptoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoWatching()
  {
    return doWatchingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoWatching_Delay()
  {
    return (EReference)doWatchingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoWatching_End()
  {
    return (EReference)doWatchingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoWatchingEnd()
  {
    return doWatchingEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoWatchingEnd_Statement()
  {
    return (EReference)doWatchingEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmit()
  {
    return emitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmit_Signal()
  {
    return (EReference)emitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmit_Expr()
  {
    return (EReference)emitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEveryDo()
  {
    return everyDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEveryDo_Delay()
  {
    return (EReference)everyDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEveryDo_Statement()
  {
    return (EReference)everyDoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExit()
  {
    return exitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExit_Trap()
  {
    return (EReference)exitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExit_DataExpr()
  {
    return (EReference)exitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHalt()
  {
    return haltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfTest()
  {
    return ifTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Expr()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Then()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ElseIf()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Else()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElsIfPart()
  {
    return elsIfPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIfPart_Elsif()
  {
    return (EReference)elsIfPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElsIf()
  {
    return elsIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIf_Expr()
  {
    return (EReference)elsIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsIf_Then()
  {
    return (EReference)elsIfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThenPart()
  {
    return thenPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenPart_Statement()
  {
    return (EReference)thenPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElsePart()
  {
    return elsePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElsePart_Statement()
  {
    return (EReference)elsePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoop()
  {
    return loopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_Body()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_End()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopEach()
  {
    return loopEachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopDelay()
  {
    return loopDelayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopDelay_Delay()
  {
    return (EReference)loopDelayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopBody()
  {
    return loopBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopBody_Statement()
  {
    return (EReference)loopBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNothing()
  {
    return nothingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPause()
  {
    return pauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresent()
  {
    return presentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_Body()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresent_ElsePart()
  {
    return (EReference)presentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentBody()
  {
    return presentBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentEventBody()
  {
    return presentEventBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentEventBody_Event()
  {
    return (EReference)presentEventBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentEventBody_ThenPart()
  {
    return (EReference)presentEventBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentCaseList()
  {
    return presentCaseListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentCaseList_Case()
  {
    return (EReference)presentCaseListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentCase()
  {
    return presentCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentCase_Event()
  {
    return (EReference)presentCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentCase_Statement()
  {
    return (EReference)presentCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresentEvent()
  {
    return presentEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresentEvent_Expression()
  {
    return (EReference)presentEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeat()
  {
    return repeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeat_Positive()
  {
    return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_DataExpr()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeat_Statement()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRun()
  {
    return runEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRun_Module()
  {
    return (EReference)runEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRun_List()
  {
    return (EReference)runEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleRenaming()
  {
    return moduleRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleRenaming_Module()
  {
    return (EReference)moduleRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleRenaming_Renamed()
  {
    return (EAttribute)moduleRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleRenaming_NewName()
  {
    return (EAttribute)moduleRenamingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRenamingList()
  {
    return renamingListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenamingList_List()
  {
    return (EReference)renamingListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRenaming()
  {
    return renamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenaming_Renaming()
  {
    return (EReference)renamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRenaming()
  {
    return typeRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRenaming_OldName()
  {
    return (EReference)typeRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRenaming_NewName()
  {
    return (EAttribute)typeRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantRenaming()
  {
    return constantRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantRenaming_Value()
  {
    return (EAttribute)constantRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantRenaming_NewName()
  {
    return (EAttribute)constantRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionRenaming()
  {
    return functionRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionRenaming_OldName()
  {
    return (EReference)functionRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionRenaming_NewName()
  {
    return (EAttribute)functionRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalRenaming()
  {
    return signalRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_OldName()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignalRenaming_NewName()
  {
    return (EAttribute)signalRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalSignalDecl()
  {
    return localSignalDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSignalDecl_SignalList()
  {
    return (EReference)localSignalDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSignalDecl_Statement()
  {
    return (EReference)localSignalDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalSignalList()
  {
    return localSignalListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspend()
  {
    return suspendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuspend_Statement()
  {
    return (EReference)suspendEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuspend_Delay()
  {
    return (EReference)suspendEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSustain()
  {
    return sustainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSustain_Signal()
  {
    return (EReference)sustainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSustain_DataExpr()
  {
    return (EReference)sustainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrap()
  {
    return trapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrap_TrapDeclList()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrap_Statement()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrap_TrapHandlerList()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapDeclList()
  {
    return trapDeclListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapDeclList_TrapDecl()
  {
    return (EReference)trapDeclListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapDecl()
  {
    return trapDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrapDecl_Name()
  {
    return (EAttribute)trapDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapDecl_ChannelDesc()
  {
    return (EReference)trapDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapHandlerList()
  {
    return trapHandlerListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapHandlerList_TrapHandler()
  {
    return (EReference)trapHandlerListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapHandler()
  {
    return trapHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapHandler_TrapExpr()
  {
    return (EReference)trapHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapHandler_Statement()
  {
    return (EReference)trapHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_VarDecl()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Statement()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDecl()
  {
    return variableDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDecl_VarList()
  {
    return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDecl_Type()
  {
    return (EAttribute)variableDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDecl_Left()
  {
    return (EReference)variableDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableList()
  {
    return variableListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableList_Variable()
  {
    return (EAttribute)variableListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableList_Expression()
  {
    return (EReference)variableListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableList_Left()
  {
    return (EReference)variableListEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbort()
  {
    return weakAbortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbort_Statement()
  {
    return (EReference)weakAbortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbort_WeakAbortBody()
  {
    return (EReference)weakAbortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbortBody()
  {
    return weakAbortBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeakAbortBody_End()
  {
    return (EAttribute)weakAbortBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbortInstance()
  {
    return weakAbortInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbortInstance_Delay()
  {
    return (EReference)weakAbortInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbortInstance_Statement()
  {
    return (EReference)weakAbortInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbortCase()
  {
    return weakAbortCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbortCase_Cases()
  {
    return (EReference)weakAbortCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataExpr()
  {
    return dataExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataExpr_Op()
  {
    return (EAttribute)dataExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExpr_Expr()
  {
    return (EReference)dataExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExpr_Left()
  {
    return (EReference)dataExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataUnaryExpr()
  {
    return dataUnaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnaryExpr_Signal()
  {
    return (EReference)dataUnaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnaryExpr_Trap()
  {
    return (EReference)dataUnaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnaryExpr_Function()
  {
    return (EReference)dataUnaryExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnaryExpr_Expression()
  {
    return (EReference)dataUnaryExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapExpr()
  {
    return trapExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigExpr()
  {
    return sigExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigExpr_AndExpr()
  {
    return (EReference)sigExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigExprAND()
  {
    return sigExprANDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigExprAND_UnaExpr()
  {
    return (EReference)sigExprANDEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSigExprUnary()
  {
    return sigExprUnaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSigExprUnary_Expr()
  {
    return (EAttribute)sigExprUnaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSigExprUnary_SigExpr()
  {
    return (EReference)sigExprUnaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayExpr()
  {
    return delayExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_Statement()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayExpr_End()
  {
    return (EAttribute)delayExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_Event()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_Expr()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelayEvent()
  {
    return delayEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayEvent_Signal()
  {
    return (EReference)delayEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChannelDescription()
  {
    return channelDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChannelDescription_Type()
  {
    return (EAttribute)channelDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChannelDescription_DataExpr()
  {
    return (EReference)channelDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_Name()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Channel()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTick()
  {
    return tickEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensor()
  {
    return sensorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_Name()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSensor_Type()
  {
    return (EAttribute)sensorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputOutput()
  {
    return inputOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParallel()
  {
    return parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_Left()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_Right()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_Left()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_Right()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalSignal()
  {
    return localSignalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalSignal_Signal()
  {
    return (EReference)localSignalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsterelFactory getEsterelFactory()
  {
    return (EsterelFactory)getEFactoryInstance();
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
    programmEClass = createEClass(PROGRAMM);
    createEReference(programmEClass, PROGRAMM__MODULE);

    mainModuleEClass = createEClass(MAIN_MODULE);
    createEAttribute(mainModuleEClass, MAIN_MODULE__NAME);
    createEReference(mainModuleEClass, MAIN_MODULE__MOD_INT);
    createEReference(mainModuleEClass, MAIN_MODULE__MOD_BODY);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__MOD_INT);
    createEReference(moduleEClass, MODULE__MOD_BODY);

    moduleBodyEClass = createEClass(MODULE_BODY);
    createEReference(moduleBodyEClass, MODULE_BODY__STATEMENT);

    moduleInterfaceEClass = createEClass(MODULE_INTERFACE);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_SIGNAL_DECL);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_TYPE_DECL);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_SENSOR_DECL);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_CONSTANT_DECL);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_RELATION_DECL);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_FUNCTION_DECL);

    signalDeclEClass = createEClass(SIGNAL_DECL);
    createEReference(signalDeclEClass, SIGNAL_DECL__SIGNAL);

    sensorDeclEClass = createEClass(SENSOR_DECL);
    createEReference(sensorDeclEClass, SENSOR_DECL__SENSOR);

    relationDeclEClass = createEClass(RELATION_DECL);
    createEReference(relationDeclEClass, RELATION_DECL__RELATION);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__FIRST);
    createEAttribute(relationEClass, RELATION__TYPE);
    createEReference(relationEClass, RELATION__SECOND);
    createEReference(relationEClass, RELATION__INCOMP);

    typeDeclEClass = createEClass(TYPE_DECL);
    createEReference(typeDeclEClass, TYPE_DECL__TYPE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    constantDeclEClass = createEClass(CONSTANT_DECL);
    createEReference(constantDeclEClass, CONSTANT_DECL__CONSTANT);

    oneTypeConstantDeclEClass = createEClass(ONE_TYPE_CONSTANT_DECL);
    createEReference(oneTypeConstantDeclEClass, ONE_TYPE_CONSTANT_DECL__CONSTANT);
    createEAttribute(oneTypeConstantDeclEClass, ONE_TYPE_CONSTANT_DECL__TYPE);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEAttribute(constantEClass, CONSTANT__VALUE);

    functionDeclEClass = createEClass(FUNCTION_DECL);
    createEReference(functionDeclEClass, FUNCTION_DECL__FUNCTION);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEAttribute(functionEClass, FUNCTION__ID_LIST);
    createEAttribute(functionEClass, FUNCTION__TYPE);

    statementEClass = createEClass(STATEMENT);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__STATEMENT);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__VARIABLE);
    createEReference(assignmentEClass, ASSIGNMENT__EXPR);

    abortEClass = createEClass(ABORT);
    createEReference(abortEClass, ABORT__STATEMENT);
    createEReference(abortEClass, ABORT__BODY);

    abortBodyEClass = createEClass(ABORT_BODY);
    createEAttribute(abortBodyEClass, ABORT_BODY__END);

    abortInstanceEClass = createEClass(ABORT_INSTANCE);
    createEReference(abortInstanceEClass, ABORT_INSTANCE__DELAY);
    createEReference(abortInstanceEClass, ABORT_INSTANCE__STATEMENT);

    abortCaseEClass = createEClass(ABORT_CASE);
    createEReference(abortCaseEClass, ABORT_CASE__CASES);

    abortCaseSingleEClass = createEClass(ABORT_CASE_SINGLE);
    createEReference(abortCaseSingleEClass, ABORT_CASE_SINGLE__DELAY);
    createEReference(abortCaseSingleEClass, ABORT_CASE_SINGLE__STATEMENT);

    awaitEClass = createEClass(AWAIT);
    createEReference(awaitEClass, AWAIT__BODY);

    awaitBodyEClass = createEClass(AWAIT_BODY);

    awaitInstanceEClass = createEClass(AWAIT_INSTANCE);

    awaitCaseEClass = createEClass(AWAIT_CASE);
    createEReference(awaitCaseEClass, AWAIT_CASE__CASES);
    createEAttribute(awaitCaseEClass, AWAIT_CASE__END);

    doEClass = createEClass(DO);
    createEReference(doEClass, DO__STATEMENT);
    createEReference(doEClass, DO__END);

    doUptoEClass = createEClass(DO_UPTO);
    createEReference(doUptoEClass, DO_UPTO__EXPR);

    doWatchingEClass = createEClass(DO_WATCHING);
    createEReference(doWatchingEClass, DO_WATCHING__DELAY);
    createEReference(doWatchingEClass, DO_WATCHING__END);

    doWatchingEndEClass = createEClass(DO_WATCHING_END);
    createEReference(doWatchingEndEClass, DO_WATCHING_END__STATEMENT);

    emitEClass = createEClass(EMIT);
    createEReference(emitEClass, EMIT__SIGNAL);
    createEReference(emitEClass, EMIT__EXPR);

    everyDoEClass = createEClass(EVERY_DO);
    createEReference(everyDoEClass, EVERY_DO__DELAY);
    createEReference(everyDoEClass, EVERY_DO__STATEMENT);

    exitEClass = createEClass(EXIT);
    createEReference(exitEClass, EXIT__TRAP);
    createEReference(exitEClass, EXIT__DATA_EXPR);

    haltEClass = createEClass(HALT);

    ifTestEClass = createEClass(IF_TEST);
    createEReference(ifTestEClass, IF_TEST__EXPR);
    createEReference(ifTestEClass, IF_TEST__THEN);
    createEReference(ifTestEClass, IF_TEST__ELSE_IF);
    createEReference(ifTestEClass, IF_TEST__ELSE);

    elsIfPartEClass = createEClass(ELS_IF_PART);
    createEReference(elsIfPartEClass, ELS_IF_PART__ELSIF);

    elsIfEClass = createEClass(ELS_IF);
    createEReference(elsIfEClass, ELS_IF__EXPR);
    createEReference(elsIfEClass, ELS_IF__THEN);

    thenPartEClass = createEClass(THEN_PART);
    createEReference(thenPartEClass, THEN_PART__STATEMENT);

    elsePartEClass = createEClass(ELSE_PART);
    createEReference(elsePartEClass, ELSE_PART__STATEMENT);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__BODY);
    createEReference(loopEClass, LOOP__END);

    loopEachEClass = createEClass(LOOP_EACH);

    loopDelayEClass = createEClass(LOOP_DELAY);
    createEReference(loopDelayEClass, LOOP_DELAY__DELAY);

    loopBodyEClass = createEClass(LOOP_BODY);
    createEReference(loopBodyEClass, LOOP_BODY__STATEMENT);

    nothingEClass = createEClass(NOTHING);

    pauseEClass = createEClass(PAUSE);

    presentEClass = createEClass(PRESENT);
    createEReference(presentEClass, PRESENT__BODY);
    createEReference(presentEClass, PRESENT__ELSE_PART);

    presentBodyEClass = createEClass(PRESENT_BODY);

    presentEventBodyEClass = createEClass(PRESENT_EVENT_BODY);
    createEReference(presentEventBodyEClass, PRESENT_EVENT_BODY__EVENT);
    createEReference(presentEventBodyEClass, PRESENT_EVENT_BODY__THEN_PART);

    presentCaseListEClass = createEClass(PRESENT_CASE_LIST);
    createEReference(presentCaseListEClass, PRESENT_CASE_LIST__CASE);

    presentCaseEClass = createEClass(PRESENT_CASE);
    createEReference(presentCaseEClass, PRESENT_CASE__EVENT);
    createEReference(presentCaseEClass, PRESENT_CASE__STATEMENT);

    presentEventEClass = createEClass(PRESENT_EVENT);
    createEReference(presentEventEClass, PRESENT_EVENT__EXPRESSION);

    repeatEClass = createEClass(REPEAT);
    createEAttribute(repeatEClass, REPEAT__POSITIVE);
    createEReference(repeatEClass, REPEAT__DATA_EXPR);
    createEReference(repeatEClass, REPEAT__STATEMENT);

    runEClass = createEClass(RUN);
    createEReference(runEClass, RUN__MODULE);
    createEReference(runEClass, RUN__LIST);

    moduleRenamingEClass = createEClass(MODULE_RENAMING);
    createEReference(moduleRenamingEClass, MODULE_RENAMING__MODULE);
    createEAttribute(moduleRenamingEClass, MODULE_RENAMING__RENAMED);
    createEAttribute(moduleRenamingEClass, MODULE_RENAMING__NEW_NAME);

    renamingListEClass = createEClass(RENAMING_LIST);
    createEReference(renamingListEClass, RENAMING_LIST__LIST);

    renamingEClass = createEClass(RENAMING);
    createEReference(renamingEClass, RENAMING__RENAMING);

    typeRenamingEClass = createEClass(TYPE_RENAMING);
    createEReference(typeRenamingEClass, TYPE_RENAMING__OLD_NAME);
    createEAttribute(typeRenamingEClass, TYPE_RENAMING__NEW_NAME);

    constantRenamingEClass = createEClass(CONSTANT_RENAMING);
    createEAttribute(constantRenamingEClass, CONSTANT_RENAMING__VALUE);
    createEAttribute(constantRenamingEClass, CONSTANT_RENAMING__NEW_NAME);

    functionRenamingEClass = createEClass(FUNCTION_RENAMING);
    createEReference(functionRenamingEClass, FUNCTION_RENAMING__OLD_NAME);
    createEAttribute(functionRenamingEClass, FUNCTION_RENAMING__NEW_NAME);

    signalRenamingEClass = createEClass(SIGNAL_RENAMING);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__OLD_NAME);
    createEAttribute(signalRenamingEClass, SIGNAL_RENAMING__NEW_NAME);

    localSignalDeclEClass = createEClass(LOCAL_SIGNAL_DECL);
    createEReference(localSignalDeclEClass, LOCAL_SIGNAL_DECL__SIGNAL_LIST);
    createEReference(localSignalDeclEClass, LOCAL_SIGNAL_DECL__STATEMENT);

    localSignalListEClass = createEClass(LOCAL_SIGNAL_LIST);

    suspendEClass = createEClass(SUSPEND);
    createEReference(suspendEClass, SUSPEND__STATEMENT);
    createEReference(suspendEClass, SUSPEND__DELAY);

    sustainEClass = createEClass(SUSTAIN);
    createEReference(sustainEClass, SUSTAIN__SIGNAL);
    createEReference(sustainEClass, SUSTAIN__DATA_EXPR);

    trapEClass = createEClass(TRAP);
    createEReference(trapEClass, TRAP__TRAP_DECL_LIST);
    createEReference(trapEClass, TRAP__STATEMENT);
    createEReference(trapEClass, TRAP__TRAP_HANDLER_LIST);

    trapDeclListEClass = createEClass(TRAP_DECL_LIST);
    createEReference(trapDeclListEClass, TRAP_DECL_LIST__TRAP_DECL);

    trapDeclEClass = createEClass(TRAP_DECL);
    createEAttribute(trapDeclEClass, TRAP_DECL__NAME);
    createEReference(trapDeclEClass, TRAP_DECL__CHANNEL_DESC);

    trapHandlerListEClass = createEClass(TRAP_HANDLER_LIST);
    createEReference(trapHandlerListEClass, TRAP_HANDLER_LIST__TRAP_HANDLER);

    trapHandlerEClass = createEClass(TRAP_HANDLER);
    createEReference(trapHandlerEClass, TRAP_HANDLER__TRAP_EXPR);
    createEReference(trapHandlerEClass, TRAP_HANDLER__STATEMENT);

    variableEClass = createEClass(VARIABLE);
    createEReference(variableEClass, VARIABLE__VAR_DECL);
    createEReference(variableEClass, VARIABLE__STATEMENT);

    variableDeclEClass = createEClass(VARIABLE_DECL);
    createEReference(variableDeclEClass, VARIABLE_DECL__VAR_LIST);
    createEAttribute(variableDeclEClass, VARIABLE_DECL__TYPE);
    createEReference(variableDeclEClass, VARIABLE_DECL__LEFT);

    variableListEClass = createEClass(VARIABLE_LIST);
    createEAttribute(variableListEClass, VARIABLE_LIST__VARIABLE);
    createEReference(variableListEClass, VARIABLE_LIST__EXPRESSION);
    createEReference(variableListEClass, VARIABLE_LIST__LEFT);

    weakAbortEClass = createEClass(WEAK_ABORT);
    createEReference(weakAbortEClass, WEAK_ABORT__STATEMENT);
    createEReference(weakAbortEClass, WEAK_ABORT__WEAK_ABORT_BODY);

    weakAbortBodyEClass = createEClass(WEAK_ABORT_BODY);
    createEAttribute(weakAbortBodyEClass, WEAK_ABORT_BODY__END);

    weakAbortInstanceEClass = createEClass(WEAK_ABORT_INSTANCE);
    createEReference(weakAbortInstanceEClass, WEAK_ABORT_INSTANCE__DELAY);
    createEReference(weakAbortInstanceEClass, WEAK_ABORT_INSTANCE__STATEMENT);

    weakAbortCaseEClass = createEClass(WEAK_ABORT_CASE);
    createEReference(weakAbortCaseEClass, WEAK_ABORT_CASE__CASES);

    dataExprEClass = createEClass(DATA_EXPR);
    createEAttribute(dataExprEClass, DATA_EXPR__OP);
    createEReference(dataExprEClass, DATA_EXPR__EXPR);
    createEReference(dataExprEClass, DATA_EXPR__LEFT);

    dataUnaryExprEClass = createEClass(DATA_UNARY_EXPR);
    createEReference(dataUnaryExprEClass, DATA_UNARY_EXPR__SIGNAL);
    createEReference(dataUnaryExprEClass, DATA_UNARY_EXPR__TRAP);
    createEReference(dataUnaryExprEClass, DATA_UNARY_EXPR__FUNCTION);
    createEReference(dataUnaryExprEClass, DATA_UNARY_EXPR__EXPRESSION);

    trapExprEClass = createEClass(TRAP_EXPR);

    sigExprEClass = createEClass(SIG_EXPR);
    createEReference(sigExprEClass, SIG_EXPR__AND_EXPR);

    sigExprANDEClass = createEClass(SIG_EXPR_AND);
    createEReference(sigExprANDEClass, SIG_EXPR_AND__UNA_EXPR);

    sigExprUnaryEClass = createEClass(SIG_EXPR_UNARY);
    createEAttribute(sigExprUnaryEClass, SIG_EXPR_UNARY__EXPR);
    createEReference(sigExprUnaryEClass, SIG_EXPR_UNARY__SIG_EXPR);

    delayExprEClass = createEClass(DELAY_EXPR);
    createEReference(delayExprEClass, DELAY_EXPR__STATEMENT);
    createEAttribute(delayExprEClass, DELAY_EXPR__END);
    createEReference(delayExprEClass, DELAY_EXPR__EVENT);
    createEReference(delayExprEClass, DELAY_EXPR__EXPR);

    delayEventEClass = createEClass(DELAY_EVENT);
    createEReference(delayEventEClass, DELAY_EVENT__SIGNAL);

    channelDescriptionEClass = createEClass(CHANNEL_DESCRIPTION);
    createEAttribute(channelDescriptionEClass, CHANNEL_DESCRIPTION__TYPE);
    createEReference(channelDescriptionEClass, CHANNEL_DESCRIPTION__DATA_EXPR);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__NAME);
    createEReference(signalEClass, SIGNAL__CHANNEL);

    tickEClass = createEClass(TICK);

    sensorEClass = createEClass(SENSOR);
    createEAttribute(sensorEClass, SENSOR__NAME);
    createEAttribute(sensorEClass, SENSOR__TYPE);

    inputEClass = createEClass(INPUT);

    outputEClass = createEClass(OUTPUT);

    inputOutputEClass = createEClass(INPUT_OUTPUT);

    returnEClass = createEClass(RETURN);

    parallelEClass = createEClass(PARALLEL);
    createEReference(parallelEClass, PARALLEL__LEFT);
    createEReference(parallelEClass, PARALLEL__RIGHT);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__LEFT);
    createEReference(sequenceEClass, SEQUENCE__RIGHT);

    localSignalEClass = createEClass(LOCAL_SIGNAL);
    createEReference(localSignalEClass, LOCAL_SIGNAL__SIGNAL);
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
    blockEClass.getESuperTypes().add(this.getStatement());
    assignmentEClass.getESuperTypes().add(this.getStatement());
    abortEClass.getESuperTypes().add(this.getStatement());
    abortInstanceEClass.getESuperTypes().add(this.getAbortBody());
    abortCaseEClass.getESuperTypes().add(this.getAbortBody());
    awaitEClass.getESuperTypes().add(this.getStatement());
    awaitInstanceEClass.getESuperTypes().add(this.getAwaitBody());
    awaitCaseEClass.getESuperTypes().add(this.getAwaitBody());
    doEClass.getESuperTypes().add(this.getStatement());
    emitEClass.getESuperTypes().add(this.getStatement());
    everyDoEClass.getESuperTypes().add(this.getStatement());
    exitEClass.getESuperTypes().add(this.getStatement());
    haltEClass.getESuperTypes().add(this.getStatement());
    ifTestEClass.getESuperTypes().add(this.getStatement());
    loopEClass.getESuperTypes().add(this.getStatement());
    loopDelayEClass.getESuperTypes().add(this.getLoopEach());
    nothingEClass.getESuperTypes().add(this.getStatement());
    pauseEClass.getESuperTypes().add(this.getStatement());
    presentEClass.getESuperTypes().add(this.getStatement());
    presentEventBodyEClass.getESuperTypes().add(this.getPresentBody());
    presentCaseListEClass.getESuperTypes().add(this.getPresentBody());
    repeatEClass.getESuperTypes().add(this.getStatement());
    runEClass.getESuperTypes().add(this.getStatement());
    localSignalDeclEClass.getESuperTypes().add(this.getStatement());
    suspendEClass.getESuperTypes().add(this.getStatement());
    sustainEClass.getESuperTypes().add(this.getStatement());
    trapEClass.getESuperTypes().add(this.getStatement());
    variableEClass.getESuperTypes().add(this.getStatement());
    weakAbortEClass.getESuperTypes().add(this.getStatement());
    weakAbortInstanceEClass.getESuperTypes().add(this.getWeakAbortBody());
    weakAbortCaseEClass.getESuperTypes().add(this.getWeakAbortBody());
    dataExprEClass.getESuperTypes().add(this.getDataUnaryExpr());
    sigExprEClass.getESuperTypes().add(this.getTrapExpr());
    sigExprEClass.getESuperTypes().add(this.getDelayEvent());
    delayExprEClass.getESuperTypes().add(this.getAwaitInstance());
    inputEClass.getESuperTypes().add(this.getSignalDecl());
    outputEClass.getESuperTypes().add(this.getSignalDecl());
    inputOutputEClass.getESuperTypes().add(this.getSignalDecl());
    returnEClass.getESuperTypes().add(this.getSignalDecl());
    parallelEClass.getESuperTypes().add(this.getStatement());
    sequenceEClass.getESuperTypes().add(this.getStatement());
    localSignalEClass.getESuperTypes().add(this.getLocalSignalList());

    // Initialize classes and features; add operations and parameters
    initEClass(programmEClass, Programm.class, "Programm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgramm_Module(), ecorePackage.getEObject(), null, "module", null, 0, -1, Programm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainModuleEClass, MainModule.class, "MainModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMainModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MainModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainModule_ModInt(), this.getModuleInterface(), null, "modInt", null, 0, 1, MainModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainModule_ModBody(), this.getModuleBody(), null, "modBody", null, 0, 1, MainModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_ModInt(), this.getModuleInterface(), null, "modInt", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_ModBody(), this.getModuleBody(), null, "modBody", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleBodyEClass, ModuleBody.class, "ModuleBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleBody_Statement(), this.getStatement(), null, "statement", null, 0, -1, ModuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleInterfaceEClass, ModuleInterface.class, "ModuleInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleInterface_IntSignalDecl(), this.getSignalDecl(), null, "intSignalDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntTypeDecl(), this.getTypeDecl(), null, "intTypeDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntSensorDecl(), this.getSensorDecl(), null, "intSensorDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntConstantDecl(), this.getConstantDecl(), null, "intConstantDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntRelationDecl(), this.getRelationDecl(), null, "intRelationDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntFunctionDecl(), this.getFunctionDecl(), null, "intFunctionDecl", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalDeclEClass, SignalDecl.class, "SignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalDecl_Signal(), this.getSignal(), null, "signal", null, 0, -1, SignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorDeclEClass, SensorDecl.class, "SensorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorDecl_Sensor(), this.getSensor(), null, "sensor", null, 0, -1, SensorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationDeclEClass, RelationDecl.class, "RelationDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationDecl_Relation(), this.getRelation(), null, "relation", null, 0, -1, RelationDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_First(), this.getSignal(), null, "first", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_Type(), ecorePackage.getEString(), "type", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Second(), this.getSignal(), null, "second", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Incomp(), this.getSignal(), null, "incomp", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDecl_Type(), this.getType(), null, "type", null, 0, -1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDeclEClass, ConstantDecl.class, "ConstantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantDecl_Constant(), this.getOneTypeConstantDecl(), null, "constant", null, 0, -1, ConstantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneTypeConstantDeclEClass, OneTypeConstantDecl.class, "OneTypeConstantDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneTypeConstantDecl_Constant(), this.getConstant(), null, "constant", null, 0, -1, OneTypeConstantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneTypeConstantDecl_Type(), ecorePackage.getEString(), "type", null, 0, 1, OneTypeConstantDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDecl_Function(), this.getFunction(), null, "function", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_IdList(), ecorePackage.getEString(), "idList", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Type(), ecorePackage.getEString(), "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Statement(), this.getStatement(), null, "statement", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Expr(), this.getDataExpr(), null, "expr", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortEClass, Abort.class, "Abort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbort_Statement(), this.getStatement(), null, "statement", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbort_Body(), this.getAbortBody(), null, "body", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortBodyEClass, AbortBody.class, "AbortBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbortBody_End(), ecorePackage.getEString(), "end", null, 0, 1, AbortBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortInstanceEClass, AbortInstance.class, "AbortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortInstance_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, AbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbortInstance_Statement(), this.getStatement(), null, "statement", null, 0, 1, AbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortCaseEClass, AbortCase.class, "AbortCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortCase_Cases(), this.getAbortCaseSingle(), null, "cases", null, 0, -1, AbortCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortCaseSingleEClass, AbortCaseSingle.class, "AbortCaseSingle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortCaseSingle_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, AbortCaseSingle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbortCaseSingle_Statement(), this.getStatement(), null, "statement", null, 0, 1, AbortCaseSingle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitEClass, Await.class, "Await", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwait_Body(), this.getAwaitBody(), null, "body", null, 0, 1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitBodyEClass, AwaitBody.class, "AwaitBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(awaitInstanceEClass, AwaitInstance.class, "AwaitInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(awaitCaseEClass, AwaitCase.class, "AwaitCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwaitCase_Cases(), this.getAbortCaseSingle(), null, "cases", null, 0, -1, AwaitCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAwaitCase_End(), ecorePackage.getEString(), "end", null, 0, 1, AwaitCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doEClass, Do.class, "Do", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDo_Statement(), this.getStatement(), null, "statement", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDo_End(), ecorePackage.getEObject(), null, "end", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doUptoEClass, DoUpto.class, "DoUpto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoUpto_Expr(), this.getDelayExpr(), null, "expr", null, 0, 1, DoUpto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWatchingEClass, DoWatching.class, "DoWatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoWatching_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, DoWatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoWatching_End(), this.getDoWatchingEnd(), null, "end", null, 0, 1, DoWatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWatchingEndEClass, DoWatchingEnd.class, "DoWatchingEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoWatchingEnd_Statement(), this.getStatement(), null, "statement", null, 0, 1, DoWatchingEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emitEClass, Emit.class, "Emit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmit_Signal(), this.getSignal(), null, "signal", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmit_Expr(), this.getDataExpr(), null, "expr", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(everyDoEClass, EveryDo.class, "EveryDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEveryDo_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEveryDo_Statement(), this.getStatement(), null, "statement", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExit_Trap(), this.getTrap(), null, "trap", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExit_DataExpr(), this.getDataExpr(), null, "dataExpr", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(haltEClass, Halt.class, "Halt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifTestEClass, IfTest.class, "IfTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfTest_Expr(), this.getDataExpr(), null, "expr", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_Then(), this.getThenPart(), null, "then", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ElseIf(), this.getElsIfPart(), null, "elseIf", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_Else(), this.getElsePart(), null, "else", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsIfPartEClass, ElsIfPart.class, "ElsIfPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsIfPart_Elsif(), this.getElsIf(), null, "elsif", null, 0, -1, ElsIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsIfEClass, ElsIf.class, "ElsIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsIf_Expr(), this.getDataExpr(), null, "expr", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElsIf_Then(), this.getThenPart(), null, "then", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thenPartEClass, ThenPart.class, "ThenPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThenPart_Statement(), this.getStatement(), null, "statement", null, 0, 1, ThenPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsePartEClass, ElsePart.class, "ElsePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsePart_Statement(), this.getStatement(), null, "statement", null, 0, 1, ElsePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoop_Body(), this.getLoopBody(), null, "body", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoop_End(), this.getLoopEach(), null, "end", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEachEClass, LoopEach.class, "LoopEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loopDelayEClass, LoopDelay.class, "LoopDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopDelay_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, LoopDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopBodyEClass, LoopBody.class, "LoopBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopBody_Statement(), this.getStatement(), null, "statement", null, 0, 1, LoopBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(presentEClass, Present.class, "Present", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresent_Body(), this.getPresentBody(), null, "body", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ElsePart(), this.getElsePart(), null, "elsePart", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentBodyEClass, PresentBody.class, "PresentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(presentEventBodyEClass, PresentEventBody.class, "PresentEventBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentEventBody_Event(), this.getPresentEvent(), null, "event", null, 0, 1, PresentEventBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentEventBody_ThenPart(), this.getThenPart(), null, "thenPart", null, 0, 1, PresentEventBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentCaseListEClass, PresentCaseList.class, "PresentCaseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentCaseList_Case(), this.getPresentCase(), null, "case", null, 0, -1, PresentCaseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentCaseEClass, PresentCase.class, "PresentCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentCase_Event(), this.getPresentEvent(), null, "event", null, 0, 1, PresentCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentCase_Statement(), this.getStatement(), null, "statement", null, 0, 1, PresentCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentEventEClass, PresentEvent.class, "PresentEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentEvent_Expression(), this.getSigExpr(), null, "expression", null, 0, 1, PresentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeat_Positive(), ecorePackage.getEBoolean(), "positive", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_DataExpr(), this.getDataExpr(), null, "dataExpr", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_Statement(), this.getStatement(), null, "statement", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRun_Module(), this.getModuleRenaming(), null, "module", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRun_List(), this.getRenamingList(), null, "list", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleRenamingEClass, ModuleRenaming.class, "ModuleRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleRenaming_Module(), this.getModule(), null, "module", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModuleRenaming_Renamed(), ecorePackage.getEBoolean(), "renamed", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModuleRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renamingListEClass, RenamingList.class, "RenamingList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenamingList_List(), this.getRenaming(), null, "list", null, 0, -1, RenamingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renamingEClass, Renaming.class, "Renaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenaming_Renaming(), ecorePackage.getEObject(), null, "renaming", null, 0, -1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRenamingEClass, TypeRenaming.class, "TypeRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRenaming_OldName(), this.getType(), null, "oldName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantRenamingEClass, ConstantRenaming.class, "ConstantRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantRenaming_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionRenamingEClass, FunctionRenaming.class, "FunctionRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionRenaming_OldName(), this.getFunction(), null, "oldName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalRenamingEClass, SignalRenaming.class, "SignalRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalRenaming_OldName(), this.getSignal(), null, "oldName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignalRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalDeclEClass, LocalSignalDecl.class, "LocalSignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSignalDecl_SignalList(), this.getLocalSignalList(), null, "signalList", null, 0, 1, LocalSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalSignalDecl_Statement(), this.getStatement(), null, "statement", null, 0, 1, LocalSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalListEClass, LocalSignalList.class, "LocalSignalList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(suspendEClass, Suspend.class, "Suspend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuspend_Statement(), this.getStatement(), null, "statement", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSuspend_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sustainEClass, Sustain.class, "Sustain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSustain_Signal(), this.getSignal(), null, "signal", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSustain_DataExpr(), this.getDataExpr(), null, "dataExpr", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapEClass, Trap.class, "Trap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrap_TrapDeclList(), this.getTrapDeclList(), null, "trapDeclList", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrap_Statement(), this.getStatement(), null, "statement", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrap_TrapHandlerList(), this.getTrapHandlerList(), null, "trapHandlerList", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapDeclListEClass, TrapDeclList.class, "TrapDeclList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapDeclList_TrapDecl(), this.getTrapDecl(), null, "trapDecl", null, 0, -1, TrapDeclList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapDeclEClass, TrapDecl.class, "TrapDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTrapDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, TrapDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrapDecl_ChannelDesc(), this.getChannelDescription(), null, "channelDesc", null, 0, 1, TrapDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapHandlerListEClass, TrapHandlerList.class, "TrapHandlerList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapHandlerList_TrapHandler(), this.getTrapHandler(), null, "trapHandler", null, 0, -1, TrapHandlerList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapHandlerEClass, TrapHandler.class, "TrapHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapHandler_TrapExpr(), this.getTrapExpr(), null, "trapExpr", null, 0, 1, TrapHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrapHandler_Statement(), this.getStatement(), null, "statement", null, 0, 1, TrapHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_VarDecl(), this.getVariableDecl(), null, "varDecl", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_Statement(), this.getStatement(), null, "statement", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDecl_VarList(), this.getVariableList(), null, "varList", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDecl_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDecl_Left(), this.getVariableDecl(), null, "left", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableListEClass, VariableList.class, "VariableList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableList_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableList_Expression(), this.getDataExpr(), null, "expression", null, 0, 1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableList_Left(), this.getVariableList(), null, "left", null, 0, 1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortEClass, WeakAbort.class, "WeakAbort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbort_Statement(), this.getStatement(), null, "statement", null, 0, 1, WeakAbort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeakAbort_WeakAbortBody(), this.getWeakAbortBody(), null, "weakAbortBody", null, 0, 1, WeakAbort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortBodyEClass, WeakAbortBody.class, "WeakAbortBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeakAbortBody_End(), ecorePackage.getEString(), "end", null, 0, 1, WeakAbortBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortInstanceEClass, WeakAbortInstance.class, "WeakAbortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbortInstance_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, WeakAbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeakAbortInstance_Statement(), this.getStatement(), null, "statement", null, 0, 1, WeakAbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortCaseEClass, WeakAbortCase.class, "WeakAbortCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbortCase_Cases(), this.getAbortCaseSingle(), null, "cases", null, 0, -1, WeakAbortCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataExprEClass, DataExpr.class, "DataExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, DataExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataExpr_Expr(), this.getDataUnaryExpr(), null, "expr", null, 0, 1, DataExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataExpr_Left(), this.getDataExpr(), null, "left", null, 0, 1, DataExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataUnaryExprEClass, DataUnaryExpr.class, "DataUnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataUnaryExpr_Signal(), this.getSignal(), null, "signal", null, 0, 1, DataUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataUnaryExpr_Trap(), this.getTrap(), null, "trap", null, 0, 1, DataUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataUnaryExpr_Function(), this.getFunction(), null, "function", null, 0, 1, DataUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataUnaryExpr_Expression(), this.getDataExpr(), null, "expression", null, 0, -1, DataUnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapExprEClass, TrapExpr.class, "TrapExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sigExprEClass, SigExpr.class, "SigExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSigExpr_AndExpr(), this.getSigExprAND(), null, "andExpr", null, 0, -1, SigExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigExprANDEClass, SigExprAND.class, "SigExprAND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSigExprAND_UnaExpr(), this.getSigExprUnary(), null, "unaExpr", null, 0, -1, SigExprAND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sigExprUnaryEClass, SigExprUnary.class, "SigExprUnary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSigExprUnary_Expr(), ecorePackage.getEString(), "expr", null, 0, 1, SigExprUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSigExprUnary_SigExpr(), ecorePackage.getEObject(), null, "sigExpr", null, 0, 1, SigExprUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayExprEClass, DelayExpr.class, "DelayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelayExpr_Statement(), this.getStatement(), null, "statement", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelayExpr_End(), ecorePackage.getEString(), "end", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelayExpr_Event(), this.getDelayEvent(), null, "event", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelayExpr_Expr(), this.getDataExpr(), null, "expr", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayEventEClass, DelayEvent.class, "DelayEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelayEvent_Signal(), this.getSignal(), null, "signal", null, 0, 1, DelayEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(channelDescriptionEClass, ChannelDescription.class, "ChannelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChannelDescription_Type(), ecorePackage.getEString(), "type", null, 0, 1, ChannelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChannelDescription_DataExpr(), this.getDataExpr(), null, "dataExpr", null, 0, 1, ChannelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Channel(), this.getChannelDescription(), null, "channel", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tickEClass, Tick.class, "Tick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSensor_Type(), ecorePackage.getEString(), "type", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputOutputEClass, InputOutput.class, "InputOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParallel_Left(), this.getStatement(), null, "left", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParallel_Right(), this.getStatement(), null, "right", null, 0, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_Left(), this.getStatement(), null, "left", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSequence_Right(), this.getStatement(), null, "right", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalEClass, LocalSignal.class, "LocalSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSignal_Signal(), this.getSignal(), null, "signal", null, 0, -1, LocalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EsterelPackageImpl
