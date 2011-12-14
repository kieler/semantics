/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.AbortBody;
import de.cau.cs.kieler.esterel.esterel.AbortCase;
import de.cau.cs.kieler.esterel.esterel.AbortCaseSingle;
import de.cau.cs.kieler.esterel.esterel.AbortInstance;
import de.cau.cs.kieler.esterel.esterel.Assignment;
import de.cau.cs.kieler.esterel.esterel.Await;
import de.cau.cs.kieler.esterel.esterel.AwaitBody;
import de.cau.cs.kieler.esterel.esterel.AwaitCase;
import de.cau.cs.kieler.esterel.esterel.AwaitInstance;
import de.cau.cs.kieler.esterel.esterel.Block;
import de.cau.cs.kieler.esterel.esterel.ChannelDescription;
import de.cau.cs.kieler.esterel.esterel.Constant;
import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.ConstantExpression;
import de.cau.cs.kieler.esterel.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.esterel.ConstantWithValue;
import de.cau.cs.kieler.esterel.esterel.DelayEvent;
import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.DoUpto;
import de.cau.cs.kieler.esterel.esterel.DoWatching;
import de.cau.cs.kieler.esterel.esterel.DoWatchingEnd;
import de.cau.cs.kieler.esterel.esterel.ElsIf;
import de.cau.cs.kieler.esterel.esterel.ElsePart;
import de.cau.cs.kieler.esterel.esterel.Emit;
import de.cau.cs.kieler.esterel.esterel.EndLoop;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.EsterelType;
import de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier;
import de.cau.cs.kieler.esterel.esterel.EveryDo;
import de.cau.cs.kieler.esterel.esterel.Exec;
import de.cau.cs.kieler.esterel.esterel.ExecBody;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Exit;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.FunctionExpression;
import de.cau.cs.kieler.esterel.esterel.FunctionRenaming;
import de.cau.cs.kieler.esterel.esterel.Halt;
import de.cau.cs.kieler.esterel.esterel.IfTest;
import de.cau.cs.kieler.esterel.esterel.LocalSignal;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignalList;
import de.cau.cs.kieler.esterel.esterel.LocalVariable;
import de.cau.cs.kieler.esterel.esterel.Loop;
import de.cau.cs.kieler.esterel.esterel.LoopBody;
import de.cau.cs.kieler.esterel.esterel.LoopDelay;
import de.cau.cs.kieler.esterel.esterel.LoopEach;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.esterel.Nothing;
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls;
import de.cau.cs.kieler.esterel.esterel.Parallel;
import de.cau.cs.kieler.esterel.esterel.Pause;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.PresentBody;
import de.cau.cs.kieler.esterel.esterel.PresentCase;
import de.cau.cs.kieler.esterel.esterel.PresentCaseList;
import de.cau.cs.kieler.esterel.esterel.PresentEvent;
import de.cau.cs.kieler.esterel.esterel.PresentEventBody;
import de.cau.cs.kieler.esterel.esterel.ProcCall;
import de.cau.cs.kieler.esterel.esterel.Procedure;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.ProcedureRenaming;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.Relation;
import de.cau.cs.kieler.esterel.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.esterel.RelationImplication;
import de.cau.cs.kieler.esterel.esterel.RelationIncompatibility;
import de.cau.cs.kieler.esterel.esterel.RelationType;
import de.cau.cs.kieler.esterel.esterel.Renaming;
import de.cau.cs.kieler.esterel.esterel.RenamingList;
import de.cau.cs.kieler.esterel.esterel.Repeat;
import de.cau.cs.kieler.esterel.esterel.Run;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.SensorWithType;
import de.cau.cs.kieler.esterel.esterel.Sequence;
import de.cau.cs.kieler.esterel.esterel.SignalRenaming;
import de.cau.cs.kieler.esterel.esterel.Statement;
import de.cau.cs.kieler.esterel.esterel.StatementContainer;
import de.cau.cs.kieler.esterel.esterel.Suspend;
import de.cau.cs.kieler.esterel.esterel.Sustain;
import de.cau.cs.kieler.esterel.esterel.Task;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TaskRenaming;
import de.cau.cs.kieler.esterel.esterel.ThenPart;
import de.cau.cs.kieler.esterel.esterel.Trap;
import de.cau.cs.kieler.esterel.esterel.TrapDecl;
import de.cau.cs.kieler.esterel.esterel.TrapDeclList;
import de.cau.cs.kieler.esterel.esterel.TrapExpression;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;
import de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr;
import de.cau.cs.kieler.esterel.esterel.Type;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;
import de.cau.cs.kieler.esterel.esterel.TypeIdentifier;
import de.cau.cs.kieler.esterel.esterel.TypeRenaming;
import de.cau.cs.kieler.esterel.esterel.WeakAbort;
import de.cau.cs.kieler.esterel.esterel.WeakAbortBody;
import de.cau.cs.kieler.esterel.esterel.WeakAbortCase;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEnd;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt;
import de.cau.cs.kieler.esterel.esterel.WeakAbortInstance;

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
  private EClass programEClass = null;

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
  private EClass channelDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeIdentifierEClass = null;

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
  private EClass sensorDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensorWithTypeEClass = null;

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
  private EClass relationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationIncompatibilityEClass = null;

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
  private EClass constantDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneTypeConstantDeclsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantWithValueEClass = null;

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
  private EClass procedureDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementContainerEClass = null;

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
  private EClass weakAbortBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weakAbortEndAltEClass = null;

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
  private EClass procCallEClass = null;

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
  private EClass endLoopEClass = null;

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
  private EClass procedureRenamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskRenamingEClass = null;

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
  private EClass trapHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableEClass = null;

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
  private EClass execEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelTypeIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass esterelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localSignalEClass = null;

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
  private EClass constantEClass = null;

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
  private EClass weakAbortEClass = null;

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
  private EClass trapDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trapReferenceExprEClass = null;

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#eNS_URI
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

    // Initialize simple dependencies
    KExpressionsPackage.eINSTANCE.eClass();

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
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Modules()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
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
  public EReference getModule_Interface()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Body()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_End()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
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
  public EReference getModuleBody_Statements()
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
  public EReference getModuleInterface_IntSignalDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntTypeDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntSensorDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntConstantDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntRelationDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntTaskDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntFunctionDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleInterface_IntProcedureDecls()
  {
    return (EReference)moduleInterfaceEClass.getEStructuralFeatures().get(7);
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
  public EClass getTypeIdentifier()
  {
    return typeIdentifierEClass;
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
  public EAttribute getLocalSignalDecl_OptEnd()
  {
    return (EAttribute)localSignalDeclEClass.getEStructuralFeatures().get(1);
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
  public EClass getSensorDecl()
  {
    return sensorDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorDecl_Sensors()
  {
    return (EReference)sensorDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensorWithType()
  {
    return sensorWithTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorWithType_Sensor()
  {
    return (EReference)sensorWithTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensorWithType_Type()
  {
    return (EReference)sensorWithTypeEClass.getEStructuralFeatures().get(1);
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
  public EClass getRelationType()
  {
    return relationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationType_Type()
  {
    return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationImplication()
  {
    return relationImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationImplication_First()
  {
    return (EReference)relationImplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationImplication_Second()
  {
    return (EReference)relationImplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationIncompatibility()
  {
    return relationIncompatibilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationIncompatibility_Incomp()
  {
    return (EReference)relationIncompatibilityEClass.getEStructuralFeatures().get(0);
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
  public EReference getTypeDecl_Types()
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
  public EClass getConstantDecls()
  {
    return constantDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDecls_Constants()
  {
    return (EReference)constantDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneTypeConstantDecls()
  {
    return oneTypeConstantDeclsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneTypeConstantDecls_Constants()
  {
    return (EReference)oneTypeConstantDeclsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneTypeConstantDecls_Type()
  {
    return (EReference)oneTypeConstantDeclsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantWithValue()
  {
    return constantWithValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantWithValue_Constant()
  {
    return (EReference)constantWithValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantWithValue_Value()
  {
    return (EAttribute)constantWithValueEClass.getEStructuralFeatures().get(1);
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
  public EReference getFunctionDecl_Functions()
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
  public EReference getFunction_IdList()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Type()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureDecl()
  {
    return procedureDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureDecl_Procedures()
  {
    return (EReference)procedureDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedure()
  {
    return procedureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcedure_Name()
  {
    return (EAttribute)procedureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_IdList1()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedure_IdList2()
  {
    return (EReference)procedureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDecl()
  {
    return taskDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDecl_Tasks()
  {
    return (EReference)taskDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_IdList1()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_IdList2()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementContainer()
  {
    return statementContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementContainer_Statement()
  {
    return (EReference)statementContainerEClass.getEStructuralFeatures().get(0);
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
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Var()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
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
  public EReference getAbort_Body()
  {
    return (EReference)abortEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getAbortInstance_OptEnd()
  {
    return (EAttribute)abortInstanceEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getAbortCase_OptEnd()
  {
    return (EAttribute)abortCaseEClass.getEStructuralFeatures().get(1);
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
  public EClass getWeakAbortBody()
  {
    return weakAbortBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbortEnd()
  {
    return weakAbortEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbortEnd_OptEnd()
  {
    return (EReference)weakAbortEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeakAbortEndAlt()
  {
    return weakAbortEndAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeakAbortEndAlt_End()
  {
    return (EAttribute)weakAbortEndAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeakAbortEndAlt_EndA()
  {
    return (EAttribute)weakAbortEndAltEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getAwaitBody_End()
  {
    return (EAttribute)awaitBodyEClass.getEStructuralFeatures().get(0);
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
  public EReference getAwaitInstance_Delay()
  {
    return (EReference)awaitInstanceEClass.getEStructuralFeatures().get(0);
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
  public EClass getProcCall()
  {
    return procCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_Proc()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_VarList()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCall_Kexpressions()
  {
    return (EReference)procCallEClass.getEStructuralFeatures().get(2);
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
  public EReference getDo_End()
  {
    return (EReference)doEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getDoWatchingEnd_OptEnd()
  {
    return (EAttribute)doWatchingEndEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getEmit_Tick()
  {
    return (EAttribute)emitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmit_Expr()
  {
    return (EReference)emitEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getEveryDo_OptEnd()
  {
    return (EAttribute)everyDoEClass.getEStructuralFeatures().get(1);
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
  public EReference getExit_Expression()
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
  public EReference getIfTest_ThenPart()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_Elsif()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfTest_ElsePart()
  {
    return (EReference)ifTestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfTest_OptEnd()
  {
    return (EAttribute)ifTestEClass.getEStructuralFeatures().get(4);
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
  public EReference getElsIf_ThenPart()
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
  public EClass getElsePart()
  {
    return elsePartEClass;
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
  public EReference getLoop_End1()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_End()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndLoop()
  {
    return endLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndLoop_EndOpt()
  {
    return (EAttribute)endLoopEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getPresent_OptEnd()
  {
    return (EAttribute)presentEClass.getEStructuralFeatures().get(2);
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
  public EReference getPresentCaseList_Cases()
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
  public EAttribute getPresentEvent_FB()
  {
    return (EAttribute)presentEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPresentEvent_EB()
  {
    return (EAttribute)presentEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPresentEvent_Tick()
  {
    return (EAttribute)presentEventEClass.getEStructuralFeatures().get(3);
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
  public EReference getRepeat_Expression()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeat_OptEnd()
  {
    return (EAttribute)repeatEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getModuleRenaming_NewName()
  {
    return (EAttribute)moduleRenamingEClass.getEStructuralFeatures().get(1);
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
  public EReference getRenaming_Renamings()
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
  public EReference getTypeRenaming_NewName()
  {
    return (EReference)typeRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRenaming_NewType()
  {
    return (EAttribute)typeRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRenaming_OldName()
  {
    return (EReference)typeRenamingEClass.getEStructuralFeatures().get(2);
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
  public EReference getConstantRenaming_NewName()
  {
    return (EReference)constantRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantRenaming_NewValue()
  {
    return (EAttribute)constantRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantRenaming_OldName()
  {
    return (EReference)constantRenamingEClass.getEStructuralFeatures().get(2);
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
  public EReference getFunctionRenaming_NewName()
  {
    return (EReference)functionRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionRenaming_NewFunc()
  {
    return (EAttribute)functionRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionRenaming_OldName()
  {
    return (EReference)functionRenamingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureRenaming()
  {
    return procedureRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureRenaming_NewName()
  {
    return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureRenaming_OldName()
  {
    return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskRenaming()
  {
    return taskRenamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRenaming_NewName()
  {
    return (EReference)taskRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRenaming_OldName()
  {
    return (EReference)taskRenamingEClass.getEStructuralFeatures().get(1);
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
  public EReference getSignalRenaming_NewName()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalRenaming_OldName()
  {
    return (EReference)signalRenamingEClass.getEStructuralFeatures().get(1);
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
  public EReference getSuspend_Delay()
  {
    return (EReference)suspendEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getSustain_Tick()
  {
    return (EAttribute)sustainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSustain_Expression()
  {
    return (EReference)sustainEClass.getEStructuralFeatures().get(2);
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
  public EReference getTrap_TrapHandler()
  {
    return (EReference)trapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrap_OptEnd()
  {
    return (EAttribute)trapEClass.getEStructuralFeatures().get(2);
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
  public EReference getTrapDeclList_TrapDecls()
  {
    return (EReference)trapDeclListEClass.getEStructuralFeatures().get(0);
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
  public EClass getLocalVariable()
  {
    return localVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariable_Var()
  {
    return (EReference)localVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalVariable_OptEnd()
  {
    return (EAttribute)localVariableEClass.getEStructuralFeatures().get(1);
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
  public EReference getDelayExpr_Expr()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayExpr_Event()
  {
    return (EReference)delayExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayExpr_IsImmediate()
  {
    return (EAttribute)delayExprEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getDelayEvent_Tick()
  {
    return (EAttribute)delayEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelayEvent_Expr()
  {
    return (EReference)delayEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayEvent_FB()
  {
    return (EAttribute)delayEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelayEvent_EB()
  {
    return (EAttribute)delayEventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExec()
  {
    return execEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_Task()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_Body()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_RetSignal()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExec_ExecCaseList()
  {
    return (EReference)execEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExec_OptEnd()
  {
    return (EAttribute)execEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecBody()
  {
    return execBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecBody_Vars()
  {
    return (EReference)execBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecBody_Kexpressions()
  {
    return (EReference)execBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecCase()
  {
    return execCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_Task()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_Body()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecCase_RetSignal()
  {
    return (EReference)execCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelTypeIdentifier()
  {
    return esterelTypeIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelTypeIdentifier_Func()
  {
    return (EReference)esterelTypeIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEsterelType()
  {
    return esterelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEsterelType_EstType()
  {
    return (EReference)esterelTypeEClass.getEStructuralFeatures().get(0);
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
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Relations()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(0);
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
  public EClass getParallel()
  {
    return parallelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParallel_List()
  {
    return (EReference)parallelEClass.getEStructuralFeatures().get(0);
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
  public EReference getSequence_List()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
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
  public EClass getWeakAbortInstance()
  {
    return weakAbortInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeakAbortInstance_End()
  {
    return (EReference)weakAbortInstanceEClass.getEStructuralFeatures().get(0);
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
  public EReference getWeakAbortCase_End()
  {
    return (EReference)weakAbortCaseEClass.getEStructuralFeatures().get(0);
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
  public EClass getTrapExpression()
  {
    return trapExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrapExpression_Trap()
  {
    return (EReference)trapExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionExpression()
  {
    return functionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionExpression_Function()
  {
    return (EReference)functionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionExpression_Kexpressions()
  {
    return (EReference)functionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression()
  {
    return constantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantExpression_Constant()
  {
    return (EReference)constantExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantExpression_Value()
  {
    return (EAttribute)constantExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrapReferenceExpr()
  {
    return trapReferenceExprEClass;
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
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__MODULES);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__INTERFACE);
    createEReference(moduleEClass, MODULE__BODY);
    createEAttribute(moduleEClass, MODULE__END);

    moduleBodyEClass = createEClass(MODULE_BODY);
    createEReference(moduleBodyEClass, MODULE_BODY__STATEMENTS);

    moduleInterfaceEClass = createEClass(MODULE_INTERFACE);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_SIGNAL_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_TYPE_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_SENSOR_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_CONSTANT_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_RELATION_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_TASK_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_FUNCTION_DECLS);
    createEReference(moduleInterfaceEClass, MODULE_INTERFACE__INT_PROCEDURE_DECLS);

    channelDescriptionEClass = createEClass(CHANNEL_DESCRIPTION);

    typeIdentifierEClass = createEClass(TYPE_IDENTIFIER);

    localSignalDeclEClass = createEClass(LOCAL_SIGNAL_DECL);
    createEReference(localSignalDeclEClass, LOCAL_SIGNAL_DECL__SIGNAL_LIST);
    createEAttribute(localSignalDeclEClass, LOCAL_SIGNAL_DECL__OPT_END);

    localSignalListEClass = createEClass(LOCAL_SIGNAL_LIST);

    sensorDeclEClass = createEClass(SENSOR_DECL);
    createEReference(sensorDeclEClass, SENSOR_DECL__SENSORS);

    sensorWithTypeEClass = createEClass(SENSOR_WITH_TYPE);
    createEReference(sensorWithTypeEClass, SENSOR_WITH_TYPE__SENSOR);
    createEReference(sensorWithTypeEClass, SENSOR_WITH_TYPE__TYPE);

    relationDeclEClass = createEClass(RELATION_DECL);

    relationTypeEClass = createEClass(RELATION_TYPE);
    createEAttribute(relationTypeEClass, RELATION_TYPE__TYPE);

    relationImplicationEClass = createEClass(RELATION_IMPLICATION);
    createEReference(relationImplicationEClass, RELATION_IMPLICATION__FIRST);
    createEReference(relationImplicationEClass, RELATION_IMPLICATION__SECOND);

    relationIncompatibilityEClass = createEClass(RELATION_INCOMPATIBILITY);
    createEReference(relationIncompatibilityEClass, RELATION_INCOMPATIBILITY__INCOMP);

    typeDeclEClass = createEClass(TYPE_DECL);
    createEReference(typeDeclEClass, TYPE_DECL__TYPES);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    constantDeclsEClass = createEClass(CONSTANT_DECLS);
    createEReference(constantDeclsEClass, CONSTANT_DECLS__CONSTANTS);

    oneTypeConstantDeclsEClass = createEClass(ONE_TYPE_CONSTANT_DECLS);
    createEReference(oneTypeConstantDeclsEClass, ONE_TYPE_CONSTANT_DECLS__CONSTANTS);
    createEReference(oneTypeConstantDeclsEClass, ONE_TYPE_CONSTANT_DECLS__TYPE);

    constantWithValueEClass = createEClass(CONSTANT_WITH_VALUE);
    createEReference(constantWithValueEClass, CONSTANT_WITH_VALUE__CONSTANT);
    createEAttribute(constantWithValueEClass, CONSTANT_WITH_VALUE__VALUE);

    functionDeclEClass = createEClass(FUNCTION_DECL);
    createEReference(functionDeclEClass, FUNCTION_DECL__FUNCTIONS);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__ID_LIST);
    createEReference(functionEClass, FUNCTION__TYPE);

    procedureDeclEClass = createEClass(PROCEDURE_DECL);
    createEReference(procedureDeclEClass, PROCEDURE_DECL__PROCEDURES);

    procedureEClass = createEClass(PROCEDURE);
    createEAttribute(procedureEClass, PROCEDURE__NAME);
    createEReference(procedureEClass, PROCEDURE__ID_LIST1);
    createEReference(procedureEClass, PROCEDURE__ID_LIST2);

    taskDeclEClass = createEClass(TASK_DECL);
    createEReference(taskDeclEClass, TASK_DECL__TASKS);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__NAME);
    createEReference(taskEClass, TASK__ID_LIST1);
    createEReference(taskEClass, TASK__ID_LIST2);

    statementContainerEClass = createEClass(STATEMENT_CONTAINER);
    createEReference(statementContainerEClass, STATEMENT_CONTAINER__STATEMENT);

    statementEClass = createEClass(STATEMENT);

    blockEClass = createEClass(BLOCK);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__VAR);
    createEReference(assignmentEClass, ASSIGNMENT__EXPR);

    abortEClass = createEClass(ABORT);
    createEReference(abortEClass, ABORT__BODY);

    abortBodyEClass = createEClass(ABORT_BODY);

    abortInstanceEClass = createEClass(ABORT_INSTANCE);
    createEReference(abortInstanceEClass, ABORT_INSTANCE__DELAY);
    createEAttribute(abortInstanceEClass, ABORT_INSTANCE__OPT_END);

    abortCaseEClass = createEClass(ABORT_CASE);
    createEReference(abortCaseEClass, ABORT_CASE__CASES);
    createEAttribute(abortCaseEClass, ABORT_CASE__OPT_END);

    abortCaseSingleEClass = createEClass(ABORT_CASE_SINGLE);
    createEReference(abortCaseSingleEClass, ABORT_CASE_SINGLE__DELAY);

    weakAbortBodyEClass = createEClass(WEAK_ABORT_BODY);

    weakAbortEndEClass = createEClass(WEAK_ABORT_END);
    createEReference(weakAbortEndEClass, WEAK_ABORT_END__OPT_END);

    weakAbortEndAltEClass = createEClass(WEAK_ABORT_END_ALT);
    createEAttribute(weakAbortEndAltEClass, WEAK_ABORT_END_ALT__END);
    createEAttribute(weakAbortEndAltEClass, WEAK_ABORT_END_ALT__END_A);

    awaitEClass = createEClass(AWAIT);
    createEReference(awaitEClass, AWAIT__BODY);

    awaitBodyEClass = createEClass(AWAIT_BODY);
    createEAttribute(awaitBodyEClass, AWAIT_BODY__END);

    awaitInstanceEClass = createEClass(AWAIT_INSTANCE);
    createEReference(awaitInstanceEClass, AWAIT_INSTANCE__DELAY);

    awaitCaseEClass = createEClass(AWAIT_CASE);
    createEReference(awaitCaseEClass, AWAIT_CASE__CASES);

    procCallEClass = createEClass(PROC_CALL);
    createEReference(procCallEClass, PROC_CALL__PROC);
    createEReference(procCallEClass, PROC_CALL__VAR_LIST);
    createEReference(procCallEClass, PROC_CALL__KEXPRESSIONS);

    doEClass = createEClass(DO);
    createEReference(doEClass, DO__END);

    doUptoEClass = createEClass(DO_UPTO);
    createEReference(doUptoEClass, DO_UPTO__EXPR);

    doWatchingEClass = createEClass(DO_WATCHING);
    createEReference(doWatchingEClass, DO_WATCHING__DELAY);
    createEReference(doWatchingEClass, DO_WATCHING__END);

    doWatchingEndEClass = createEClass(DO_WATCHING_END);
    createEAttribute(doWatchingEndEClass, DO_WATCHING_END__OPT_END);

    emitEClass = createEClass(EMIT);
    createEReference(emitEClass, EMIT__SIGNAL);
    createEAttribute(emitEClass, EMIT__TICK);
    createEReference(emitEClass, EMIT__EXPR);

    everyDoEClass = createEClass(EVERY_DO);
    createEReference(everyDoEClass, EVERY_DO__DELAY);
    createEAttribute(everyDoEClass, EVERY_DO__OPT_END);

    exitEClass = createEClass(EXIT);
    createEReference(exitEClass, EXIT__TRAP);
    createEReference(exitEClass, EXIT__EXPRESSION);

    haltEClass = createEClass(HALT);

    ifTestEClass = createEClass(IF_TEST);
    createEReference(ifTestEClass, IF_TEST__EXPR);
    createEReference(ifTestEClass, IF_TEST__THEN_PART);
    createEReference(ifTestEClass, IF_TEST__ELSIF);
    createEReference(ifTestEClass, IF_TEST__ELSE_PART);
    createEAttribute(ifTestEClass, IF_TEST__OPT_END);

    elsIfEClass = createEClass(ELS_IF);
    createEReference(elsIfEClass, ELS_IF__EXPR);
    createEReference(elsIfEClass, ELS_IF__THEN_PART);

    thenPartEClass = createEClass(THEN_PART);

    elsePartEClass = createEClass(ELSE_PART);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__BODY);
    createEReference(loopEClass, LOOP__END1);
    createEReference(loopEClass, LOOP__END);

    endLoopEClass = createEClass(END_LOOP);
    createEAttribute(endLoopEClass, END_LOOP__END_OPT);

    loopEachEClass = createEClass(LOOP_EACH);

    loopDelayEClass = createEClass(LOOP_DELAY);
    createEReference(loopDelayEClass, LOOP_DELAY__DELAY);

    loopBodyEClass = createEClass(LOOP_BODY);

    nothingEClass = createEClass(NOTHING);

    pauseEClass = createEClass(PAUSE);

    presentEClass = createEClass(PRESENT);
    createEReference(presentEClass, PRESENT__BODY);
    createEReference(presentEClass, PRESENT__ELSE_PART);
    createEAttribute(presentEClass, PRESENT__OPT_END);

    presentBodyEClass = createEClass(PRESENT_BODY);

    presentEventBodyEClass = createEClass(PRESENT_EVENT_BODY);
    createEReference(presentEventBodyEClass, PRESENT_EVENT_BODY__EVENT);
    createEReference(presentEventBodyEClass, PRESENT_EVENT_BODY__THEN_PART);

    presentCaseListEClass = createEClass(PRESENT_CASE_LIST);
    createEReference(presentCaseListEClass, PRESENT_CASE_LIST__CASES);

    presentCaseEClass = createEClass(PRESENT_CASE);
    createEReference(presentCaseEClass, PRESENT_CASE__EVENT);

    presentEventEClass = createEClass(PRESENT_EVENT);
    createEReference(presentEventEClass, PRESENT_EVENT__EXPRESSION);
    createEAttribute(presentEventEClass, PRESENT_EVENT__FB);
    createEAttribute(presentEventEClass, PRESENT_EVENT__EB);
    createEAttribute(presentEventEClass, PRESENT_EVENT__TICK);

    repeatEClass = createEClass(REPEAT);
    createEAttribute(repeatEClass, REPEAT__POSITIVE);
    createEReference(repeatEClass, REPEAT__EXPRESSION);
    createEAttribute(repeatEClass, REPEAT__OPT_END);

    runEClass = createEClass(RUN);
    createEReference(runEClass, RUN__MODULE);
    createEReference(runEClass, RUN__LIST);

    moduleRenamingEClass = createEClass(MODULE_RENAMING);
    createEReference(moduleRenamingEClass, MODULE_RENAMING__MODULE);
    createEAttribute(moduleRenamingEClass, MODULE_RENAMING__NEW_NAME);

    renamingListEClass = createEClass(RENAMING_LIST);
    createEReference(renamingListEClass, RENAMING_LIST__LIST);

    renamingEClass = createEClass(RENAMING);
    createEReference(renamingEClass, RENAMING__RENAMINGS);

    typeRenamingEClass = createEClass(TYPE_RENAMING);
    createEReference(typeRenamingEClass, TYPE_RENAMING__NEW_NAME);
    createEAttribute(typeRenamingEClass, TYPE_RENAMING__NEW_TYPE);
    createEReference(typeRenamingEClass, TYPE_RENAMING__OLD_NAME);

    constantRenamingEClass = createEClass(CONSTANT_RENAMING);
    createEReference(constantRenamingEClass, CONSTANT_RENAMING__NEW_NAME);
    createEAttribute(constantRenamingEClass, CONSTANT_RENAMING__NEW_VALUE);
    createEReference(constantRenamingEClass, CONSTANT_RENAMING__OLD_NAME);

    functionRenamingEClass = createEClass(FUNCTION_RENAMING);
    createEReference(functionRenamingEClass, FUNCTION_RENAMING__NEW_NAME);
    createEAttribute(functionRenamingEClass, FUNCTION_RENAMING__NEW_FUNC);
    createEReference(functionRenamingEClass, FUNCTION_RENAMING__OLD_NAME);

    procedureRenamingEClass = createEClass(PROCEDURE_RENAMING);
    createEReference(procedureRenamingEClass, PROCEDURE_RENAMING__NEW_NAME);
    createEReference(procedureRenamingEClass, PROCEDURE_RENAMING__OLD_NAME);

    taskRenamingEClass = createEClass(TASK_RENAMING);
    createEReference(taskRenamingEClass, TASK_RENAMING__NEW_NAME);
    createEReference(taskRenamingEClass, TASK_RENAMING__OLD_NAME);

    signalRenamingEClass = createEClass(SIGNAL_RENAMING);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__NEW_NAME);
    createEReference(signalRenamingEClass, SIGNAL_RENAMING__OLD_NAME);

    suspendEClass = createEClass(SUSPEND);
    createEReference(suspendEClass, SUSPEND__DELAY);

    sustainEClass = createEClass(SUSTAIN);
    createEReference(sustainEClass, SUSTAIN__SIGNAL);
    createEAttribute(sustainEClass, SUSTAIN__TICK);
    createEReference(sustainEClass, SUSTAIN__EXPRESSION);

    trapEClass = createEClass(TRAP);
    createEReference(trapEClass, TRAP__TRAP_DECL_LIST);
    createEReference(trapEClass, TRAP__TRAP_HANDLER);
    createEAttribute(trapEClass, TRAP__OPT_END);

    trapDeclListEClass = createEClass(TRAP_DECL_LIST);
    createEReference(trapDeclListEClass, TRAP_DECL_LIST__TRAP_DECLS);

    trapHandlerEClass = createEClass(TRAP_HANDLER);
    createEReference(trapHandlerEClass, TRAP_HANDLER__TRAP_EXPR);

    localVariableEClass = createEClass(LOCAL_VARIABLE);
    createEReference(localVariableEClass, LOCAL_VARIABLE__VAR);
    createEAttribute(localVariableEClass, LOCAL_VARIABLE__OPT_END);

    delayExprEClass = createEClass(DELAY_EXPR);
    createEReference(delayExprEClass, DELAY_EXPR__EXPR);
    createEReference(delayExprEClass, DELAY_EXPR__EVENT);
    createEAttribute(delayExprEClass, DELAY_EXPR__IS_IMMEDIATE);

    delayEventEClass = createEClass(DELAY_EVENT);
    createEAttribute(delayEventEClass, DELAY_EVENT__TICK);
    createEReference(delayEventEClass, DELAY_EVENT__EXPR);
    createEAttribute(delayEventEClass, DELAY_EVENT__FB);
    createEAttribute(delayEventEClass, DELAY_EVENT__EB);

    execEClass = createEClass(EXEC);
    createEReference(execEClass, EXEC__TASK);
    createEReference(execEClass, EXEC__BODY);
    createEReference(execEClass, EXEC__RET_SIGNAL);
    createEReference(execEClass, EXEC__EXEC_CASE_LIST);
    createEAttribute(execEClass, EXEC__OPT_END);

    execBodyEClass = createEClass(EXEC_BODY);
    createEReference(execBodyEClass, EXEC_BODY__VARS);
    createEReference(execBodyEClass, EXEC_BODY__KEXPRESSIONS);

    execCaseEClass = createEClass(EXEC_CASE);
    createEReference(execCaseEClass, EXEC_CASE__TASK);
    createEReference(execCaseEClass, EXEC_CASE__BODY);
    createEReference(execCaseEClass, EXEC_CASE__RET_SIGNAL);

    esterelTypeIdentifierEClass = createEClass(ESTEREL_TYPE_IDENTIFIER);
    createEReference(esterelTypeIdentifierEClass, ESTEREL_TYPE_IDENTIFIER__FUNC);

    esterelTypeEClass = createEClass(ESTEREL_TYPE);
    createEReference(esterelTypeEClass, ESTEREL_TYPE__EST_TYPE);

    localSignalEClass = createEClass(LOCAL_SIGNAL);
    createEReference(localSignalEClass, LOCAL_SIGNAL__SIGNAL);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__RELATIONS);

    constantEClass = createEClass(CONSTANT);

    parallelEClass = createEClass(PARALLEL);
    createEReference(parallelEClass, PARALLEL__LIST);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__LIST);

    weakAbortEClass = createEClass(WEAK_ABORT);

    weakAbortInstanceEClass = createEClass(WEAK_ABORT_INSTANCE);
    createEReference(weakAbortInstanceEClass, WEAK_ABORT_INSTANCE__END);

    weakAbortCaseEClass = createEClass(WEAK_ABORT_CASE);
    createEReference(weakAbortCaseEClass, WEAK_ABORT_CASE__END);

    trapDeclEClass = createEClass(TRAP_DECL);

    trapExpressionEClass = createEClass(TRAP_EXPRESSION);
    createEReference(trapExpressionEClass, TRAP_EXPRESSION__TRAP);

    functionExpressionEClass = createEClass(FUNCTION_EXPRESSION);
    createEReference(functionExpressionEClass, FUNCTION_EXPRESSION__FUNCTION);
    createEReference(functionExpressionEClass, FUNCTION_EXPRESSION__KEXPRESSIONS);

    constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);
    createEReference(constantExpressionEClass, CONSTANT_EXPRESSION__CONSTANT);
    createEAttribute(constantExpressionEClass, CONSTANT_EXPRESSION__VALUE);

    trapReferenceExprEClass = createEClass(TRAP_REFERENCE_EXPR);
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

    // Obtain other dependent packages
    KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    channelDescriptionEClass.getESuperTypes().add(theKExpressionsPackage.getChannelDescription());
    typeIdentifierEClass.getESuperTypes().add(theKExpressionsPackage.getTypeIdentifier());
    localSignalDeclEClass.getESuperTypes().add(this.getStatementContainer());
    localSignalDeclEClass.getESuperTypes().add(this.getStatement());
    relationImplicationEClass.getESuperTypes().add(this.getRelationType());
    relationIncompatibilityEClass.getESuperTypes().add(this.getRelationType());
    blockEClass.getESuperTypes().add(this.getStatementContainer());
    blockEClass.getESuperTypes().add(this.getStatement());
    assignmentEClass.getESuperTypes().add(this.getStatement());
    abortEClass.getESuperTypes().add(this.getStatementContainer());
    abortEClass.getESuperTypes().add(this.getStatement());
    abortInstanceEClass.getESuperTypes().add(this.getStatementContainer());
    abortInstanceEClass.getESuperTypes().add(this.getAbortBody());
    abortInstanceEClass.getESuperTypes().add(this.getWeakAbortBody());
    abortCaseEClass.getESuperTypes().add(this.getAbortBody());
    abortCaseEClass.getESuperTypes().add(this.getWeakAbortBody());
    abortCaseSingleEClass.getESuperTypes().add(this.getStatementContainer());
    awaitEClass.getESuperTypes().add(this.getStatement());
    awaitInstanceEClass.getESuperTypes().add(this.getStatementContainer());
    awaitInstanceEClass.getESuperTypes().add(this.getAwaitBody());
    awaitCaseEClass.getESuperTypes().add(this.getAwaitBody());
    procCallEClass.getESuperTypes().add(this.getStatement());
    doEClass.getESuperTypes().add(this.getStatementContainer());
    doEClass.getESuperTypes().add(this.getStatement());
    doWatchingEndEClass.getESuperTypes().add(this.getStatementContainer());
    emitEClass.getESuperTypes().add(this.getStatement());
    everyDoEClass.getESuperTypes().add(this.getStatementContainer());
    everyDoEClass.getESuperTypes().add(this.getStatement());
    exitEClass.getESuperTypes().add(this.getStatement());
    haltEClass.getESuperTypes().add(this.getStatement());
    ifTestEClass.getESuperTypes().add(this.getStatement());
    thenPartEClass.getESuperTypes().add(this.getStatementContainer());
    elsePartEClass.getESuperTypes().add(this.getStatementContainer());
    loopEClass.getESuperTypes().add(this.getStatement());
    loopDelayEClass.getESuperTypes().add(this.getLoopEach());
    loopBodyEClass.getESuperTypes().add(this.getStatementContainer());
    nothingEClass.getESuperTypes().add(this.getStatement());
    pauseEClass.getESuperTypes().add(this.getStatement());
    presentEClass.getESuperTypes().add(this.getStatement());
    presentEventBodyEClass.getESuperTypes().add(this.getPresentBody());
    presentCaseListEClass.getESuperTypes().add(this.getPresentBody());
    presentCaseEClass.getESuperTypes().add(this.getStatementContainer());
    repeatEClass.getESuperTypes().add(this.getStatementContainer());
    repeatEClass.getESuperTypes().add(this.getStatement());
    runEClass.getESuperTypes().add(this.getStatement());
    suspendEClass.getESuperTypes().add(this.getStatementContainer());
    suspendEClass.getESuperTypes().add(this.getStatement());
    sustainEClass.getESuperTypes().add(this.getStatement());
    trapEClass.getESuperTypes().add(this.getStatementContainer());
    trapEClass.getESuperTypes().add(this.getStatement());
    trapHandlerEClass.getESuperTypes().add(this.getStatementContainer());
    localVariableEClass.getESuperTypes().add(this.getStatementContainer());
    localVariableEClass.getESuperTypes().add(this.getStatement());
    execEClass.getESuperTypes().add(this.getStatementContainer());
    execEClass.getESuperTypes().add(this.getStatement());
    execCaseEClass.getESuperTypes().add(this.getStatementContainer());
    esterelTypeIdentifierEClass.getESuperTypes().add(theKExpressionsPackage.getTypeIdentifier());
    esterelTypeEClass.getESuperTypes().add(this.getTypeIdentifier());
    localSignalEClass.getESuperTypes().add(this.getLocalSignalList());
    relationEClass.getESuperTypes().add(this.getRelationDecl());
    constantEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
    parallelEClass.getESuperTypes().add(this.getStatement());
    sequenceEClass.getESuperTypes().add(this.getStatement());
    weakAbortEClass.getESuperTypes().add(this.getAbort());
    weakAbortInstanceEClass.getESuperTypes().add(this.getAbortInstance());
    weakAbortCaseEClass.getESuperTypes().add(this.getAbortCase());
    trapDeclEClass.getESuperTypes().add(theKExpressionsPackage.getISignal());
    trapExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    functionExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    constantExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
    trapReferenceExprEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Modules(), this.getModule(), null, "modules", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Interface(), this.getModuleInterface(), null, "interface", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Body(), this.getModuleBody(), null, "body", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_End(), ecorePackage.getEString(), "end", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleBodyEClass, ModuleBody.class, "ModuleBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleBody_Statements(), this.getStatement(), null, "statements", null, 0, -1, ModuleBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleInterfaceEClass, ModuleInterface.class, "ModuleInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleInterface_IntSignalDecls(), theKExpressionsPackage.getInterfaceSignalDecl(), null, "intSignalDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntTypeDecls(), this.getTypeDecl(), null, "intTypeDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntSensorDecls(), this.getSensorDecl(), null, "intSensorDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntConstantDecls(), this.getConstantDecls(), null, "intConstantDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntRelationDecls(), this.getRelationDecl(), null, "intRelationDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntTaskDecls(), this.getTaskDecl(), null, "intTaskDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntFunctionDecls(), this.getFunctionDecl(), null, "intFunctionDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleInterface_IntProcedureDecls(), this.getProcedureDecl(), null, "intProcedureDecls", null, 0, -1, ModuleInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(channelDescriptionEClass, ChannelDescription.class, "ChannelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeIdentifierEClass, TypeIdentifier.class, "TypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localSignalDeclEClass, LocalSignalDecl.class, "LocalSignalDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSignalDecl_SignalList(), this.getLocalSignalList(), null, "signalList", null, 0, 1, LocalSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalSignalDecl_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, LocalSignalDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalListEClass, LocalSignalList.class, "LocalSignalList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sensorDeclEClass, SensorDecl.class, "SensorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorDecl_Sensors(), this.getSensorWithType(), null, "sensors", null, 0, -1, SensorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sensorWithTypeEClass, SensorWithType.class, "SensorWithType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensorWithType_Sensor(), theKExpressionsPackage.getISignal(), null, "sensor", null, 0, 1, SensorWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSensorWithType_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, SensorWithType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationDeclEClass, RelationDecl.class, "RelationDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationTypeEClass, RelationType.class, "RelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationType_Type(), ecorePackage.getEString(), "type", null, 0, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationImplicationEClass, RelationImplication.class, "RelationImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationImplication_First(), theKExpressionsPackage.getISignal(), null, "first", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationImplication_Second(), theKExpressionsPackage.getISignal(), null, "second", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationIncompatibilityEClass, RelationIncompatibility.class, "RelationIncompatibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationIncompatibility_Incomp(), theKExpressionsPackage.getISignal(), null, "incomp", null, 0, -1, RelationIncompatibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclEClass, TypeDecl.class, "TypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDecl_Types(), this.getType(), null, "types", null, 0, -1, TypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDeclsEClass, ConstantDecls.class, "ConstantDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantDecls_Constants(), this.getOneTypeConstantDecls(), null, "constants", null, 0, -1, ConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneTypeConstantDeclsEClass, OneTypeConstantDecls.class, "OneTypeConstantDecls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOneTypeConstantDecls_Constants(), this.getConstantWithValue(), null, "constants", null, 0, -1, OneTypeConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneTypeConstantDecls_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, OneTypeConstantDecls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantWithValueEClass, ConstantWithValue.class, "ConstantWithValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantWithValue_Constant(), theKExpressionsPackage.getValuedObject(), null, "constant", null, 0, 1, ConstantWithValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantWithValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantWithValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDecl_Functions(), this.getFunction(), null, "functions", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_IdList(), this.getTypeIdentifier(), null, "idList", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureDeclEClass, ProcedureDecl.class, "ProcedureDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureDecl_Procedures(), this.getProcedure(), null, "procedures", null, 0, -1, ProcedureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcedure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_IdList1(), this.getTypeIdentifier(), null, "idList1", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedure_IdList2(), this.getTypeIdentifier(), null, "idList2", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskDeclEClass, TaskDecl.class, "TaskDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskDecl_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TaskDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_IdList1(), this.getTypeIdentifier(), null, "idList1", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_IdList2(), this.getTypeIdentifier(), null, "idList2", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementContainerEClass, StatementContainer.class, "StatementContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementContainer_Statement(), this.getStatement(), null, "statement", null, 0, 1, StatementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Var(), theKExpressionsPackage.getIVariable(), null, "var", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortEClass, Abort.class, "Abort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbort_Body(), ecorePackage.getEObject(), null, "body", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortBodyEClass, AbortBody.class, "AbortBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abortInstanceEClass, AbortInstance.class, "AbortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortInstance_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, AbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbortInstance_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, AbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortCaseEClass, AbortCase.class, "AbortCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortCase_Cases(), this.getAbortCaseSingle(), null, "cases", null, 0, -1, AbortCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbortCase_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, AbortCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abortCaseSingleEClass, AbortCaseSingle.class, "AbortCaseSingle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbortCaseSingle_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, AbortCaseSingle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortBodyEClass, WeakAbortBody.class, "WeakAbortBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(weakAbortEndEClass, WeakAbortEnd.class, "WeakAbortEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbortEnd_OptEnd(), this.getWeakAbortEndAlt(), null, "optEnd", null, 0, 1, WeakAbortEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortEndAltEClass, WeakAbortEndAlt.class, "WeakAbortEndAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeakAbortEndAlt_End(), ecorePackage.getEString(), "end", null, 0, 1, WeakAbortEndAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeakAbortEndAlt_EndA(), ecorePackage.getEString(), "endA", null, 0, 1, WeakAbortEndAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitEClass, Await.class, "Await", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwait_Body(), this.getAwaitBody(), null, "body", null, 0, 1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitBodyEClass, AwaitBody.class, "AwaitBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAwaitBody_End(), ecorePackage.getEString(), "end", null, 0, 1, AwaitBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitInstanceEClass, AwaitInstance.class, "AwaitInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwaitInstance_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, AwaitInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(awaitCaseEClass, AwaitCase.class, "AwaitCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAwaitCase_Cases(), this.getAbortCaseSingle(), null, "cases", null, 0, -1, AwaitCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procCallEClass, ProcCall.class, "ProcCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcCall_Proc(), this.getProcedure(), null, "proc", null, 0, 1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCall_VarList(), theKExpressionsPackage.getIVariable(), null, "varList", null, 0, -1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCall_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doEClass, Do.class, "Do", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDo_End(), ecorePackage.getEObject(), null, "end", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doUptoEClass, DoUpto.class, "DoUpto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoUpto_Expr(), this.getDelayExpr(), null, "expr", null, 0, 1, DoUpto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWatchingEClass, DoWatching.class, "DoWatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoWatching_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, DoWatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoWatching_End(), this.getDoWatchingEnd(), null, "end", null, 0, 1, DoWatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doWatchingEndEClass, DoWatchingEnd.class, "DoWatchingEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoWatchingEnd_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, DoWatchingEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emitEClass, Emit.class, "Emit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmit_Signal(), theKExpressionsPackage.getISignal(), null, "signal", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmit_Tick(), ecorePackage.getEString(), "tick", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmit_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(everyDoEClass, EveryDo.class, "EveryDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEveryDo_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEveryDo_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExit_Trap(), this.getTrapDecl(), null, "trap", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExit_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(haltEClass, Halt.class, "Halt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ifTestEClass, IfTest.class, "IfTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfTest_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ThenPart(), this.getThenPart(), null, "thenPart", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_Elsif(), this.getElsIf(), null, "elsif", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfTest_ElsePart(), this.getElsePart(), null, "elsePart", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfTest_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elsIfEClass, ElsIf.class, "ElsIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElsIf_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElsIf_ThenPart(), this.getThenPart(), null, "thenPart", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thenPartEClass, ThenPart.class, "ThenPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elsePartEClass, ElsePart.class, "ElsePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoop_Body(), this.getLoopBody(), null, "body", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoop_End1(), this.getEndLoop(), null, "end1", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoop_End(), this.getLoopEach(), null, "end", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endLoopEClass, EndLoop.class, "EndLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndLoop_EndOpt(), ecorePackage.getEString(), "endOpt", null, 0, 1, EndLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEachEClass, LoopEach.class, "LoopEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loopDelayEClass, LoopDelay.class, "LoopDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoopDelay_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, LoopDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopBodyEClass, LoopBody.class, "LoopBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pauseEClass, Pause.class, "Pause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(presentEClass, Present.class, "Present", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresent_Body(), this.getPresentBody(), null, "body", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresent_ElsePart(), this.getElsePart(), null, "elsePart", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPresent_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentBodyEClass, PresentBody.class, "PresentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(presentEventBodyEClass, PresentEventBody.class, "PresentEventBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentEventBody_Event(), this.getPresentEvent(), null, "event", null, 0, 1, PresentEventBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPresentEventBody_ThenPart(), this.getThenPart(), null, "thenPart", null, 0, 1, PresentEventBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentCaseListEClass, PresentCaseList.class, "PresentCaseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentCaseList_Cases(), this.getPresentCase(), null, "cases", null, 0, -1, PresentCaseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentCaseEClass, PresentCase.class, "PresentCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentCase_Event(), this.getPresentEvent(), null, "event", null, 0, 1, PresentCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(presentEventEClass, PresentEvent.class, "PresentEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPresentEvent_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, PresentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPresentEvent_FB(), ecorePackage.getEString(), "fB", null, 0, 1, PresentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPresentEvent_EB(), ecorePackage.getEString(), "eB", null, 0, 1, PresentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPresentEvent_Tick(), ecorePackage.getEString(), "tick", null, 0, 1, PresentEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeat_Positive(), ecorePackage.getEBoolean(), "positive", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeat_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeat_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRun_Module(), this.getModuleRenaming(), null, "module", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRun_List(), this.getRenamingList(), null, "list", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleRenamingEClass, ModuleRenaming.class, "ModuleRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleRenaming_Module(), this.getModule(), null, "module", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModuleRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renamingListEClass, RenamingList.class, "RenamingList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenamingList_List(), this.getRenaming(), null, "list", null, 0, -1, RenamingList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renamingEClass, Renaming.class, "Renaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenaming_Renamings(), ecorePackage.getEObject(), null, "renamings", null, 0, -1, Renaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRenamingEClass, TypeRenaming.class, "TypeRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRenaming_NewName(), this.getType(), null, "newName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRenaming_NewType(), theKExpressionsPackage.getValueType(), "newType", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeRenaming_OldName(), this.getType(), null, "oldName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantRenamingEClass, ConstantRenaming.class, "ConstantRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantRenaming_NewName(), theKExpressionsPackage.getValuedObject(), null, "newName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantRenaming_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantRenaming_OldName(), theKExpressionsPackage.getValuedObject(), null, "oldName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionRenamingEClass, FunctionRenaming.class, "FunctionRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionRenaming_NewName(), this.getFunction(), null, "newName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionRenaming_NewFunc(), ecorePackage.getEString(), "newFunc", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionRenaming_OldName(), this.getFunction(), null, "oldName", null, 0, 1, FunctionRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureRenamingEClass, ProcedureRenaming.class, "ProcedureRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureRenaming_NewName(), this.getProcedure(), null, "newName", null, 0, 1, ProcedureRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcedureRenaming_OldName(), this.getProcedure(), null, "oldName", null, 0, 1, ProcedureRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskRenamingEClass, TaskRenaming.class, "TaskRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskRenaming_NewName(), this.getTask(), null, "newName", null, 0, 1, TaskRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskRenaming_OldName(), this.getTask(), null, "oldName", null, 0, 1, TaskRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalRenamingEClass, SignalRenaming.class, "SignalRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalRenaming_NewName(), theKExpressionsPackage.getISignal(), null, "newName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalRenaming_OldName(), theKExpressionsPackage.getISignal(), null, "oldName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendEClass, Suspend.class, "Suspend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuspend_Delay(), this.getDelayExpr(), null, "delay", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sustainEClass, Sustain.class, "Sustain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSustain_Signal(), theKExpressionsPackage.getISignal(), null, "signal", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSustain_Tick(), ecorePackage.getEString(), "tick", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSustain_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapEClass, Trap.class, "Trap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrap_TrapDeclList(), this.getTrapDeclList(), null, "trapDeclList", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrap_TrapHandler(), this.getTrapHandler(), null, "trapHandler", null, 0, -1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrap_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapDeclListEClass, TrapDeclList.class, "TrapDeclList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapDeclList_TrapDecls(), theKExpressionsPackage.getISignal(), null, "trapDecls", null, 0, -1, TrapDeclList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapHandlerEClass, TrapHandler.class, "TrapHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapHandler_TrapExpr(), theKExpressionsPackage.getExpression(), null, "trapExpr", null, 0, 1, TrapHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalVariable_Var(), theKExpressionsPackage.getInterfaceVariableDecl(), null, "var", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalVariable_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayExprEClass, DelayExpr.class, "DelayExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelayExpr_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelayExpr_Event(), this.getDelayEvent(), null, "event", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelayExpr_IsImmediate(), ecorePackage.getEBoolean(), "isImmediate", null, 0, 1, DelayExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delayEventEClass, DelayEvent.class, "DelayEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelayEvent_Tick(), ecorePackage.getEString(), "tick", null, 0, 1, DelayEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelayEvent_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, DelayEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelayEvent_FB(), ecorePackage.getEString(), "fB", null, 0, 1, DelayEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelayEvent_EB(), ecorePackage.getEString(), "eB", null, 0, 1, DelayEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execEClass, Exec.class, "Exec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExec_Task(), this.getTask(), null, "task", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_Body(), this.getExecBody(), null, "body", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_RetSignal(), theKExpressionsPackage.getISignal(), null, "retSignal", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExec_ExecCaseList(), this.getExecCase(), null, "execCaseList", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExec_OptEnd(), ecorePackage.getEString(), "optEnd", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execBodyEClass, ExecBody.class, "ExecBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecBody_Vars(), theKExpressionsPackage.getIVariable(), null, "vars", null, 0, -1, ExecBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecBody_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, ExecBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execCaseEClass, ExecCase.class, "ExecCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecCase_Task(), this.getTask(), null, "task", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecCase_Body(), this.getExecBody(), null, "body", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecCase_RetSignal(), theKExpressionsPackage.getISignal(), null, "retSignal", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelTypeIdentifierEClass, EsterelTypeIdentifier.class, "EsterelTypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEsterelTypeIdentifier_Func(), this.getFunction(), null, "func", null, 0, 1, EsterelTypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(esterelTypeEClass, EsterelType.class, "EsterelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEsterelType_EstType(), this.getType(), null, "estType", null, 0, 1, EsterelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localSignalEClass, LocalSignal.class, "LocalSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalSignal_Signal(), theKExpressionsPackage.getISignal(), null, "signal", null, 0, -1, LocalSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_Relations(), this.getRelationType(), null, "relations", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParallel_List(), this.getStatement(), null, "list", null, 0, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_List(), this.getStatement(), null, "list", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortEClass, WeakAbort.class, "WeakAbort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(weakAbortInstanceEClass, WeakAbortInstance.class, "WeakAbortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbortInstance_End(), this.getWeakAbortEnd(), null, "end", null, 0, 1, WeakAbortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weakAbortCaseEClass, WeakAbortCase.class, "WeakAbortCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWeakAbortCase_End(), this.getWeakAbortEnd(), null, "end", null, 0, 1, WeakAbortCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapDeclEClass, TrapDecl.class, "TrapDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trapExpressionEClass, TrapExpression.class, "TrapExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrapExpression_Trap(), theKExpressionsPackage.getISignal(), null, "trap", null, 0, 1, TrapExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionExpressionEClass, FunctionExpression.class, "FunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionExpression_Function(), this.getFunction(), null, "function", null, 0, 1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionExpression_Kexpressions(), theKExpressionsPackage.getExpression(), null, "kexpressions", null, 0, -1, FunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantExpression_Constant(), this.getConstant(), null, "constant", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstantExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trapReferenceExprEClass, TrapReferenceExpr.class, "TrapReferenceExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EsterelPackageImpl
