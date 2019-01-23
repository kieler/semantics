/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.esterel.Abort;
import de.cau.cs.kieler.esterel.Await;
import de.cau.cs.kieler.esterel.Block;
import de.cau.cs.kieler.esterel.Case;
import de.cau.cs.kieler.esterel.Constant;
import de.cau.cs.kieler.esterel.ConstantDeclaration;
import de.cau.cs.kieler.esterel.ConstantExpression;
import de.cau.cs.kieler.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.DelayExpression;
import de.cau.cs.kieler.esterel.Do;
import de.cau.cs.kieler.esterel.ElsIf;
import de.cau.cs.kieler.esterel.Emit;
import de.cau.cs.kieler.esterel.EsterelDeclaration;
import de.cau.cs.kieler.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.EsterelFunctionCall;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.EsterelParallel;
import de.cau.cs.kieler.esterel.EsterelProgram;
import de.cau.cs.kieler.esterel.EsterelStatement;
import de.cau.cs.kieler.esterel.EsterelThread;
import de.cau.cs.kieler.esterel.EsterelVariableDeclaration;
import de.cau.cs.kieler.esterel.EveryDo;
import de.cau.cs.kieler.esterel.Exec;
import de.cau.cs.kieler.esterel.ExecCase;
import de.cau.cs.kieler.esterel.Exit;
import de.cau.cs.kieler.esterel.Function;
import de.cau.cs.kieler.esterel.FunctionDeclaration;
import de.cau.cs.kieler.esterel.FunctionRenaming;
import de.cau.cs.kieler.esterel.Halt;
import de.cau.cs.kieler.esterel.IfTest;
import de.cau.cs.kieler.esterel.InputDeclaration;
import de.cau.cs.kieler.esterel.InputOutputDeclaration;
import de.cau.cs.kieler.esterel.LocalSignalDeclaration;
import de.cau.cs.kieler.esterel.LocalVariableDeclaration;
import de.cau.cs.kieler.esterel.Loop;
import de.cau.cs.kieler.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.Nothing;
import de.cau.cs.kieler.esterel.OutputDeclaration;
import de.cau.cs.kieler.esterel.Present;
import de.cau.cs.kieler.esterel.PresentCase;
import de.cau.cs.kieler.esterel.Procedure;
import de.cau.cs.kieler.esterel.ProcedureCall;
import de.cau.cs.kieler.esterel.ProcedureDeclaration;
import de.cau.cs.kieler.esterel.ProcedureRenaming;
import de.cau.cs.kieler.esterel.Relation;
import de.cau.cs.kieler.esterel.RelationDeclaration;
import de.cau.cs.kieler.esterel.RelationImplication;
import de.cau.cs.kieler.esterel.RelationIncompatibility;
import de.cau.cs.kieler.esterel.Renaming;
import de.cau.cs.kieler.esterel.Renamings;
import de.cau.cs.kieler.esterel.Repeat;
import de.cau.cs.kieler.esterel.ReturnDeclaration;
import de.cau.cs.kieler.esterel.Run;
import de.cau.cs.kieler.esterel.SCEstStatement;
import de.cau.cs.kieler.esterel.Sensor;
import de.cau.cs.kieler.esterel.SensorDeclaration;
import de.cau.cs.kieler.esterel.Set;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.SignalDeclaration;
import de.cau.cs.kieler.esterel.SignalReference;
import de.cau.cs.kieler.esterel.SignalRenaming;
import de.cau.cs.kieler.esterel.Suspend;
import de.cau.cs.kieler.esterel.Sustain;
import de.cau.cs.kieler.esterel.Task;
import de.cau.cs.kieler.esterel.TaskDeclaration;
import de.cau.cs.kieler.esterel.TaskRenaming;
import de.cau.cs.kieler.esterel.TickReference;
import de.cau.cs.kieler.esterel.Trap;
import de.cau.cs.kieler.esterel.TrapExpression;
import de.cau.cs.kieler.esterel.TrapHandler;
import de.cau.cs.kieler.esterel.TrapReference;
import de.cau.cs.kieler.esterel.TrapSignal;
import de.cau.cs.kieler.esterel.TypeDeclaration;
import de.cau.cs.kieler.esterel.TypeDefinition;
import de.cau.cs.kieler.esterel.TypeIdentifier;
import de.cau.cs.kieler.esterel.TypeRenaming;
import de.cau.cs.kieler.esterel.UnEmit;
import de.cau.cs.kieler.esterel.Variable;

import de.cau.cs.kieler.esterel.VariableReference;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.scl.SCLPackage;

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
public class EsterelPackageImpl extends EPackageImpl implements EsterelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass esterelProgramEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass esterelDeclarationEClass = null;

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
    private EClass typeDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constantDeclarationEClass = null;

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
    private EClass functionDeclarationEClass = null;

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
    private EClass procedureDeclarationEClass = null;

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
    private EClass taskDeclarationEClass = null;

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
    private EClass signalDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputOutputDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass returnDeclarationEClass = null;

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
    private EClass sensorDeclarationEClass = null;

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
    private EClass relationDeclarationEClass = null;

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
    private EClass esterelStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass esterelParallelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass esterelThreadEClass = null;

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
    private EClass haltEClass = null;

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
    private EClass emitEClass = null;

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
    private EClass procedureCallEClass = null;

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
    private EClass presentCaseEClass = null;

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
    private EClass loopEClass = null;

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
    private EClass abortEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass caseEClass = null;

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
    private EClass everyDoEClass = null;

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
    private EClass trapEClass = null;

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
    private EClass exitEClass = null;

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
    private EClass execCaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localSignalDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localVariableDeclarationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass esterelVariableDeclarationEClass = null;

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
    private EClass renamingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass renamingsEClass = null;

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
    private EClass doEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delayExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trapSignalEClass = null;

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
    private EClass esterelFunctionCallEClass = null;

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
    private EClass trapReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tickReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass variableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scEstStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unEmitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setEClass = null;

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
    private EsterelPackageImpl() {
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
    public static EsterelPackage init() {
        if (isInited) return (EsterelPackage)EPackage.Registry.INSTANCE.getEPackage(EsterelPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredEsterelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        EsterelPackageImpl theEsterelPackage = registeredEsterelPackage instanceof EsterelPackageImpl ? (EsterelPackageImpl)registeredEsterelPackage : new EsterelPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        AnnotationsPackage.eINSTANCE.eClass();
        KEffectsPackage.eINSTANCE.eClass();
        KExpressionsPackage.eINSTANCE.eClass();
        SCLPackage.eINSTANCE.eClass();
        KExtPackage.eINSTANCE.eClass();

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
    public EClass getEsterelProgram() {
        return esterelProgramEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEsterelProgram_Modules() {
        return (EReference)esterelProgramEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEsterelProgram_Tick() {
        return (EReference)esterelProgramEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelDeclaration() {
        return esterelDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeIdentifier() {
        return typeIdentifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_Type() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_IdType() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeIdentifier_Operator() {
        return (EAttribute)typeIdentifierEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypeIdentifier_EsterelType() {
        return (EReference)typeIdentifierEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeDeclaration() {
        return typeDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeDefinition() {
        return typeDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstantDeclaration() {
        return constantDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstant() {
        return constantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstant_Type() {
        return (EReference)constantEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionDeclaration() {
        return functionDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunction() {
        return functionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunction_ParameterTypes() {
        return (EReference)functionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunction_ReturnType() {
        return (EReference)functionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureDeclaration() {
        return procedureDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedure() {
        return procedureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedure_ReferenceArguments() {
        return (EReference)procedureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedure_ValueArguments() {
        return (EReference)procedureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTaskDeclaration() {
        return taskDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTask() {
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_ReferenceArguments() {
        return (EReference)taskEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTask_ValueArguments() {
        return (EReference)taskEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalDeclaration() {
        return signalDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputDeclaration() {
        return inputDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputDeclaration() {
        return outputDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputOutputDeclaration() {
        return inputOutputDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReturnDeclaration() {
        return returnDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignal() {
        return signalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_Type() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_IdType() {
        return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignal_CombineFunction() {
        return (EReference)signalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSensorDeclaration() {
        return sensorDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSensor() {
        return sensorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSensor_Type() {
        return (EReference)sensorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationDeclaration() {
        return relationDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationDeclaration_Relations() {
        return (EReference)relationDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelation() {
        return relationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelation_Type() {
        return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationImplication() {
        return relationImplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationImplication_First() {
        return (EReference)relationImplicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationImplication_Second() {
        return (EReference)relationImplicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationIncompatibility() {
        return relationIncompatibilityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationIncompatibility_Incomp() {
        return (EReference)relationIncompatibilityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelStatement() {
        return esterelStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelParallel() {
        return esterelParallelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelThread() {
        return esterelThreadEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNothing() {
        return nothingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHalt() {
        return haltEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBlock() {
        return blockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEmit() {
        return emitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmit_Signal() {
        return (EReference)emitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEmit_Expression() {
        return (EReference)emitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSustain() {
        return sustainEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSustain_Signal() {
        return (EReference)sustainEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSustain_Expression() {
        return (EReference)sustainEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureCall() {
        return procedureCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedureCall_Procedure() {
        return (EReference)procedureCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedureCall_ReferenceArguments() {
        return (EReference)procedureCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedureCall_ValueArguments() {
        return (EReference)procedureCallEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPresent() {
        return presentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresent_Expression() {
        return (EReference)presentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresent_Cases() {
        return (EReference)presentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresent_ElseStatements() {
        return (EReference)presentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPresentCase() {
        return presentCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentCase_Expression() {
        return (EReference)presentCaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIfTest() {
        return ifTestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIfTest_Expression() {
        return (EReference)ifTestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIfTest_Elseif() {
        return (EReference)ifTestEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIfTest_ElseStatements() {
        return (EReference)ifTestEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElsIf() {
        return elsIfEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElsIf_Expression() {
        return (EReference)elsIfEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoop() {
        return loopEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLoop_Delay() {
        return (EReference)loopEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRepeat() {
        return repeatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRepeat_Positive() {
        return (EAttribute)repeatEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRepeat_Expression() {
        return (EReference)repeatEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbort() {
        return abortEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbort_Weak() {
        return (EAttribute)abortEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbort_Delay() {
        return (EReference)abortEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbort_DoStatements() {
        return (EReference)abortEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbort_Cases() {
        return (EReference)abortEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCase() {
        return caseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCase_Delay() {
        return (EReference)caseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAwait() {
        return awaitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAwait_Delay() {
        return (EReference)awaitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAwait_Cases() {
        return (EReference)awaitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEveryDo() {
        return everyDoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEveryDo_Delay() {
        return (EReference)everyDoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSuspend() {
        return suspendEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSuspend_Weak() {
        return (EAttribute)suspendEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSuspend_Delay() {
        return (EReference)suspendEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrap() {
        return trapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTrap_TrapSignals() {
        return (EReference)trapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTrap_TrapHandler() {
        return (EReference)trapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrapHandler() {
        return trapHandlerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTrapHandler_Expression() {
        return (EReference)trapHandlerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExit() {
        return exitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_Trap() {
        return (EReference)exitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExit_Expression() {
        return (EReference)exitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExec() {
        return execEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExec_Task() {
        return (EReference)execEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExec_ReferenceParameters() {
        return (EReference)execEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExec_ValueParameters() {
        return (EReference)execEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExec_ReturnSignal() {
        return (EReference)execEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExec_ExecCaseList() {
        return (EReference)execEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecCase() {
        return execCaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecCase_Task() {
        return (EReference)execCaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecCase_ReferenceParameters() {
        return (EReference)execCaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecCase_ValueParameters() {
        return (EReference)execCaseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecCase_ReturnSignal() {
        return (EReference)execCaseEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalSignalDeclaration() {
        return localSignalDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalVariableDeclaration() {
        return localVariableDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLocalVariableDeclaration_Declarations() {
        return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelVariableDeclaration() {
        return esterelVariableDeclarationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEsterelVariableDeclaration_Type() {
        return (EReference)esterelVariableDeclarationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariable() {
        return variableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRun() {
        return runEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRun_Module() {
        return (EReference)runEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRun_Renamings() {
        return (EReference)runEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModuleRenaming() {
        return moduleRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModuleRenaming_Module() {
        return (EReference)moduleRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModuleRenaming_NewName() {
        return (EAttribute)moduleRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRenaming() {
        return renamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRenamings() {
        return renamingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRenamings_Renamings() {
        return (EReference)renamingsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeRenaming() {
        return typeRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypeRenaming_NewName() {
        return (EReference)typeRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeRenaming_NewType() {
        return (EAttribute)typeRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTypeRenaming_OldName() {
        return (EReference)typeRenamingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstantRenaming() {
        return constantRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstantRenaming_NewName() {
        return (EReference)constantRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstantRenaming_NewValue() {
        return (EReference)constantRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstantRenaming_OldName() {
        return (EReference)constantRenamingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunctionRenaming() {
        return functionRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionRenaming_NewName() {
        return (EReference)functionRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunctionRenaming_NewFunc() {
        return (EAttribute)functionRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunctionRenaming_OldName() {
        return (EReference)functionRenamingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcedureRenaming() {
        return procedureRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedureRenaming_NewName() {
        return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcedureRenaming_OldName() {
        return (EReference)procedureRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTaskRenaming() {
        return taskRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTaskRenaming_NewName() {
        return (EReference)taskRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTaskRenaming_OldName() {
        return (EReference)taskRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalRenaming() {
        return signalRenamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignalRenaming_NewName() {
        return (EReference)signalRenamingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSignalRenaming_OldName() {
        return (EReference)signalRenamingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDo() {
        return doEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDo_WatchingAnnotations() {
        return (EReference)doEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDo_Watching() {
        return (EReference)doEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDo_Delay() {
        return (EReference)doEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDo_WatchingStatements() {
        return (EReference)doEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelayExpression() {
        return delayExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDelayExpression_Delay() {
        return (EReference)delayExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDelayExpression_Immediate() {
        return (EAttribute)delayExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDelayExpression_Expression() {
        return (EReference)delayExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrapSignal() {
        return trapSignalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrapExpression() {
        return trapExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTrapExpression_Trap() {
        return (EReference)trapExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEsterelFunctionCall() {
        return esterelFunctionCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEsterelFunctionCall_Function() {
        return (EReference)esterelFunctionCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEsterelFunctionCall_Parameter() {
        return (EReference)esterelFunctionCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConstantExpression() {
        return constantExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstantExpression_Constant() {
        return (EReference)constantExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConstantExpression_Value() {
        return (EReference)constantExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTrapReference() {
        return trapReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalReference() {
        return signalReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTickReference() {
        return tickReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVariableReference() {
        return variableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCEstStatement() {
        return scEstStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnEmit() {
        return unEmitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUnEmit_Signal() {
        return (EReference)unEmitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSet() {
        return setEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSet_Signal() {
        return (EReference)setEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSet_Expression() {
        return (EReference)setEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EsterelFactory getEsterelFactory() {
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
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        esterelProgramEClass = createEClass(ESTEREL_PROGRAM);
        createEReference(esterelProgramEClass, ESTEREL_PROGRAM__MODULES);
        createEReference(esterelProgramEClass, ESTEREL_PROGRAM__TICK);

        esterelDeclarationEClass = createEClass(ESTEREL_DECLARATION);

        typeIdentifierEClass = createEClass(TYPE_IDENTIFIER);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__TYPE);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__ID_TYPE);
        createEAttribute(typeIdentifierEClass, TYPE_IDENTIFIER__OPERATOR);
        createEReference(typeIdentifierEClass, TYPE_IDENTIFIER__ESTEREL_TYPE);

        typeDeclarationEClass = createEClass(TYPE_DECLARATION);

        typeDefinitionEClass = createEClass(TYPE_DEFINITION);

        constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);

        constantEClass = createEClass(CONSTANT);
        createEReference(constantEClass, CONSTANT__TYPE);

        functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);

        functionEClass = createEClass(FUNCTION);
        createEReference(functionEClass, FUNCTION__PARAMETER_TYPES);
        createEReference(functionEClass, FUNCTION__RETURN_TYPE);

        procedureDeclarationEClass = createEClass(PROCEDURE_DECLARATION);

        procedureEClass = createEClass(PROCEDURE);
        createEReference(procedureEClass, PROCEDURE__REFERENCE_ARGUMENTS);
        createEReference(procedureEClass, PROCEDURE__VALUE_ARGUMENTS);

        taskDeclarationEClass = createEClass(TASK_DECLARATION);

        taskEClass = createEClass(TASK);
        createEReference(taskEClass, TASK__REFERENCE_ARGUMENTS);
        createEReference(taskEClass, TASK__VALUE_ARGUMENTS);

        signalDeclarationEClass = createEClass(SIGNAL_DECLARATION);

        inputDeclarationEClass = createEClass(INPUT_DECLARATION);

        outputDeclarationEClass = createEClass(OUTPUT_DECLARATION);

        inputOutputDeclarationEClass = createEClass(INPUT_OUTPUT_DECLARATION);

        returnDeclarationEClass = createEClass(RETURN_DECLARATION);

        signalEClass = createEClass(SIGNAL);
        createEAttribute(signalEClass, SIGNAL__TYPE);
        createEAttribute(signalEClass, SIGNAL__ID_TYPE);
        createEReference(signalEClass, SIGNAL__COMBINE_FUNCTION);

        sensorDeclarationEClass = createEClass(SENSOR_DECLARATION);

        sensorEClass = createEClass(SENSOR);
        createEReference(sensorEClass, SENSOR__TYPE);

        relationDeclarationEClass = createEClass(RELATION_DECLARATION);
        createEReference(relationDeclarationEClass, RELATION_DECLARATION__RELATIONS);

        relationEClass = createEClass(RELATION);
        createEAttribute(relationEClass, RELATION__TYPE);

        relationImplicationEClass = createEClass(RELATION_IMPLICATION);
        createEReference(relationImplicationEClass, RELATION_IMPLICATION__FIRST);
        createEReference(relationImplicationEClass, RELATION_IMPLICATION__SECOND);

        relationIncompatibilityEClass = createEClass(RELATION_INCOMPATIBILITY);
        createEReference(relationIncompatibilityEClass, RELATION_INCOMPATIBILITY__INCOMP);

        esterelStatementEClass = createEClass(ESTEREL_STATEMENT);

        esterelParallelEClass = createEClass(ESTEREL_PARALLEL);

        esterelThreadEClass = createEClass(ESTEREL_THREAD);

        nothingEClass = createEClass(NOTHING);

        haltEClass = createEClass(HALT);

        blockEClass = createEClass(BLOCK);

        emitEClass = createEClass(EMIT);
        createEReference(emitEClass, EMIT__SIGNAL);
        createEReference(emitEClass, EMIT__EXPRESSION);

        sustainEClass = createEClass(SUSTAIN);
        createEReference(sustainEClass, SUSTAIN__SIGNAL);
        createEReference(sustainEClass, SUSTAIN__EXPRESSION);

        procedureCallEClass = createEClass(PROCEDURE_CALL);
        createEReference(procedureCallEClass, PROCEDURE_CALL__PROCEDURE);
        createEReference(procedureCallEClass, PROCEDURE_CALL__REFERENCE_ARGUMENTS);
        createEReference(procedureCallEClass, PROCEDURE_CALL__VALUE_ARGUMENTS);

        presentEClass = createEClass(PRESENT);
        createEReference(presentEClass, PRESENT__EXPRESSION);
        createEReference(presentEClass, PRESENT__CASES);
        createEReference(presentEClass, PRESENT__ELSE_STATEMENTS);

        presentCaseEClass = createEClass(PRESENT_CASE);
        createEReference(presentCaseEClass, PRESENT_CASE__EXPRESSION);

        ifTestEClass = createEClass(IF_TEST);
        createEReference(ifTestEClass, IF_TEST__EXPRESSION);
        createEReference(ifTestEClass, IF_TEST__ELSEIF);
        createEReference(ifTestEClass, IF_TEST__ELSE_STATEMENTS);

        elsIfEClass = createEClass(ELS_IF);
        createEReference(elsIfEClass, ELS_IF__EXPRESSION);

        loopEClass = createEClass(LOOP);
        createEReference(loopEClass, LOOP__DELAY);

        repeatEClass = createEClass(REPEAT);
        createEAttribute(repeatEClass, REPEAT__POSITIVE);
        createEReference(repeatEClass, REPEAT__EXPRESSION);

        abortEClass = createEClass(ABORT);
        createEAttribute(abortEClass, ABORT__WEAK);
        createEReference(abortEClass, ABORT__DELAY);
        createEReference(abortEClass, ABORT__DO_STATEMENTS);
        createEReference(abortEClass, ABORT__CASES);

        caseEClass = createEClass(CASE);
        createEReference(caseEClass, CASE__DELAY);

        awaitEClass = createEClass(AWAIT);
        createEReference(awaitEClass, AWAIT__DELAY);
        createEReference(awaitEClass, AWAIT__CASES);

        everyDoEClass = createEClass(EVERY_DO);
        createEReference(everyDoEClass, EVERY_DO__DELAY);

        suspendEClass = createEClass(SUSPEND);
        createEAttribute(suspendEClass, SUSPEND__WEAK);
        createEReference(suspendEClass, SUSPEND__DELAY);

        trapEClass = createEClass(TRAP);
        createEReference(trapEClass, TRAP__TRAP_SIGNALS);
        createEReference(trapEClass, TRAP__TRAP_HANDLER);

        trapHandlerEClass = createEClass(TRAP_HANDLER);
        createEReference(trapHandlerEClass, TRAP_HANDLER__EXPRESSION);

        exitEClass = createEClass(EXIT);
        createEReference(exitEClass, EXIT__TRAP);
        createEReference(exitEClass, EXIT__EXPRESSION);

        execEClass = createEClass(EXEC);
        createEReference(execEClass, EXEC__TASK);
        createEReference(execEClass, EXEC__REFERENCE_PARAMETERS);
        createEReference(execEClass, EXEC__VALUE_PARAMETERS);
        createEReference(execEClass, EXEC__RETURN_SIGNAL);
        createEReference(execEClass, EXEC__EXEC_CASE_LIST);

        execCaseEClass = createEClass(EXEC_CASE);
        createEReference(execCaseEClass, EXEC_CASE__TASK);
        createEReference(execCaseEClass, EXEC_CASE__REFERENCE_PARAMETERS);
        createEReference(execCaseEClass, EXEC_CASE__VALUE_PARAMETERS);
        createEReference(execCaseEClass, EXEC_CASE__RETURN_SIGNAL);

        localSignalDeclarationEClass = createEClass(LOCAL_SIGNAL_DECLARATION);

        localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);
        createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__DECLARATIONS);

        esterelVariableDeclarationEClass = createEClass(ESTEREL_VARIABLE_DECLARATION);
        createEReference(esterelVariableDeclarationEClass, ESTEREL_VARIABLE_DECLARATION__TYPE);

        variableEClass = createEClass(VARIABLE);

        runEClass = createEClass(RUN);
        createEReference(runEClass, RUN__MODULE);
        createEReference(runEClass, RUN__RENAMINGS);

        moduleRenamingEClass = createEClass(MODULE_RENAMING);
        createEReference(moduleRenamingEClass, MODULE_RENAMING__MODULE);
        createEAttribute(moduleRenamingEClass, MODULE_RENAMING__NEW_NAME);

        renamingEClass = createEClass(RENAMING);

        renamingsEClass = createEClass(RENAMINGS);
        createEReference(renamingsEClass, RENAMINGS__RENAMINGS);

        typeRenamingEClass = createEClass(TYPE_RENAMING);
        createEReference(typeRenamingEClass, TYPE_RENAMING__NEW_NAME);
        createEAttribute(typeRenamingEClass, TYPE_RENAMING__NEW_TYPE);
        createEReference(typeRenamingEClass, TYPE_RENAMING__OLD_NAME);

        constantRenamingEClass = createEClass(CONSTANT_RENAMING);
        createEReference(constantRenamingEClass, CONSTANT_RENAMING__NEW_NAME);
        createEReference(constantRenamingEClass, CONSTANT_RENAMING__NEW_VALUE);
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

        doEClass = createEClass(DO);
        createEReference(doEClass, DO__WATCHING_ANNOTATIONS);
        createEReference(doEClass, DO__WATCHING);
        createEReference(doEClass, DO__DELAY);
        createEReference(doEClass, DO__WATCHING_STATEMENTS);

        delayExpressionEClass = createEClass(DELAY_EXPRESSION);
        createEReference(delayExpressionEClass, DELAY_EXPRESSION__DELAY);
        createEAttribute(delayExpressionEClass, DELAY_EXPRESSION__IMMEDIATE);
        createEReference(delayExpressionEClass, DELAY_EXPRESSION__EXPRESSION);

        trapSignalEClass = createEClass(TRAP_SIGNAL);

        trapExpressionEClass = createEClass(TRAP_EXPRESSION);
        createEReference(trapExpressionEClass, TRAP_EXPRESSION__TRAP);

        esterelFunctionCallEClass = createEClass(ESTEREL_FUNCTION_CALL);
        createEReference(esterelFunctionCallEClass, ESTEREL_FUNCTION_CALL__FUNCTION);
        createEReference(esterelFunctionCallEClass, ESTEREL_FUNCTION_CALL__PARAMETER);

        constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);
        createEReference(constantExpressionEClass, CONSTANT_EXPRESSION__CONSTANT);
        createEReference(constantExpressionEClass, CONSTANT_EXPRESSION__VALUE);

        trapReferenceEClass = createEClass(TRAP_REFERENCE);

        signalReferenceEClass = createEClass(SIGNAL_REFERENCE);

        tickReferenceEClass = createEClass(TICK_REFERENCE);

        variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

        scEstStatementEClass = createEClass(SC_EST_STATEMENT);

        unEmitEClass = createEClass(UN_EMIT);
        createEReference(unEmitEClass, UN_EMIT__SIGNAL);

        setEClass = createEClass(SET);
        createEReference(setEClass, SET__SIGNAL);
        createEReference(setEClass, SET__EXPRESSION);
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
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);
        SCLPackage theSCLPackage = (SCLPackage)EPackage.Registry.INSTANCE.getEPackage(SCLPackage.eNS_URI);
        KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        esterelProgramEClass.getESuperTypes().add(theAnnotationsPackage.getPragmatable());
        esterelProgramEClass.getESuperTypes().add(theAnnotationsPackage.getNameable());
        esterelDeclarationEClass.getESuperTypes().add(theKExpressionsPackage.getDeclaration());
        typeDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        typeDefinitionEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        constantDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        constantEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        functionDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        functionEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        procedureDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        procedureEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        taskDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        taskEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        signalDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        inputDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
        outputDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
        inputOutputDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
        returnDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
        signalEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        sensorDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        sensorEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        relationDeclarationEClass.getESuperTypes().add(this.getEsterelDeclaration());
        relationImplicationEClass.getESuperTypes().add(this.getRelation());
        relationIncompatibilityEClass.getESuperTypes().add(this.getRelation());
        esterelStatementEClass.getESuperTypes().add(theSCLPackage.getStatement());
        esterelParallelEClass.getESuperTypes().add(this.getEsterelStatement());
        esterelParallelEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        esterelThreadEClass.getESuperTypes().add(this.getEsterelStatement());
        esterelThreadEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        esterelThreadEClass.getESuperTypes().add(theSCLPackage.getThread());
        nothingEClass.getESuperTypes().add(this.getEsterelStatement());
        haltEClass.getESuperTypes().add(this.getEsterelStatement());
        blockEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        blockEClass.getESuperTypes().add(this.getEsterelStatement());
        emitEClass.getESuperTypes().add(this.getEsterelStatement());
        sustainEClass.getESuperTypes().add(this.getEsterelStatement());
        procedureCallEClass.getESuperTypes().add(this.getEsterelStatement());
        presentEClass.getESuperTypes().add(this.getEsterelStatement());
        presentEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        presentCaseEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        ifTestEClass.getESuperTypes().add(this.getEsterelStatement());
        ifTestEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        elsIfEClass.getESuperTypes().add(this.getEsterelStatement());
        elsIfEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        loopEClass.getESuperTypes().add(this.getEsterelStatement());
        loopEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        repeatEClass.getESuperTypes().add(this.getEsterelStatement());
        repeatEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        abortEClass.getESuperTypes().add(this.getEsterelStatement());
        abortEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        caseEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        awaitEClass.getESuperTypes().add(this.getEsterelStatement());
        awaitEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        everyDoEClass.getESuperTypes().add(this.getEsterelStatement());
        everyDoEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        suspendEClass.getESuperTypes().add(this.getEsterelStatement());
        suspendEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        trapEClass.getESuperTypes().add(this.getEsterelStatement());
        trapEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        trapHandlerEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        exitEClass.getESuperTypes().add(this.getEsterelStatement());
        execEClass.getESuperTypes().add(this.getEsterelStatement());
        execEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        execCaseEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        localSignalDeclarationEClass.getESuperTypes().add(this.getEsterelStatement());
        localSignalDeclarationEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        localSignalDeclarationEClass.getESuperTypes().add(theKExpressionsPackage.getDeclaration());
        localVariableDeclarationEClass.getESuperTypes().add(this.getEsterelStatement());
        localVariableDeclarationEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        esterelVariableDeclarationEClass.getESuperTypes().add(theKExpressionsPackage.getDeclaration());
        variableEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObject());
        runEClass.getESuperTypes().add(this.getEsterelStatement());
        renamingsEClass.getESuperTypes().add(theAnnotationsPackage.getAnnotatable());
        typeRenamingEClass.getESuperTypes().add(this.getRenaming());
        constantRenamingEClass.getESuperTypes().add(this.getRenaming());
        functionRenamingEClass.getESuperTypes().add(this.getRenaming());
        procedureRenamingEClass.getESuperTypes().add(this.getRenaming());
        taskRenamingEClass.getESuperTypes().add(this.getRenaming());
        signalRenamingEClass.getESuperTypes().add(this.getRenaming());
        doEClass.getESuperTypes().add(this.getEsterelStatement());
        doEClass.getESuperTypes().add(theSCLPackage.getStatementContainer());
        trapSignalEClass.getESuperTypes().add(this.getSignal());
        trapExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
        esterelFunctionCallEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
        constantExpressionEClass.getESuperTypes().add(theKExpressionsPackage.getExpression());
        trapReferenceEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());
        signalReferenceEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());
        tickReferenceEClass.getESuperTypes().add(this.getSignalReference());
        variableReferenceEClass.getESuperTypes().add(theKExpressionsPackage.getValuedObjectReference());
        scEstStatementEClass.getESuperTypes().add(theSCLPackage.getStatement());
        unEmitEClass.getESuperTypes().add(this.getSCEstStatement());
        setEClass.getESuperTypes().add(this.getSCEstStatement());

        // Initialize classes and features; add operations and parameters
        initEClass(esterelProgramEClass, EsterelProgram.class, "EsterelProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEsterelProgram_Modules(), theSCLPackage.getModule(), null, "modules", null, 0, -1, EsterelProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEsterelProgram_Tick(), theKExpressionsPackage.getValuedObject(), null, "tick", null, 0, 1, EsterelProgram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esterelDeclarationEClass, EsterelDeclaration.class, "EsterelDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(typeIdentifierEClass, TypeIdentifier.class, "TypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTypeIdentifier_Type(), theKExpressionsPackage.getValueType(), "type", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeIdentifier_IdType(), ecorePackage.getEString(), "idType", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeIdentifier_Operator(), theKExpressionsPackage.getCombineOperator(), "operator", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTypeIdentifier_EsterelType(), this.getTypeDefinition(), null, "esterelType", null, 0, 1, TypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstant_Type(), this.getTypeIdentifier(), null, "type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFunction_ParameterTypes(), this.getTypeIdentifier(), null, "parameterTypes", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFunction_ReturnType(), this.getTypeIdentifier(), null, "returnType", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(procedureDeclarationEClass, ProcedureDeclaration.class, "ProcedureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcedure_ReferenceArguments(), this.getTypeIdentifier(), null, "referenceArguments", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcedure_ValueArguments(), this.getTypeIdentifier(), null, "valueArguments", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(taskDeclarationEClass, TaskDeclaration.class, "TaskDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTask_ReferenceArguments(), this.getTypeIdentifier(), null, "referenceArguments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTask_ValueArguments(), this.getTypeIdentifier(), null, "valueArguments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(signalDeclarationEClass, SignalDeclaration.class, "SignalDeclaration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inputDeclarationEClass, InputDeclaration.class, "InputDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(outputDeclarationEClass, OutputDeclaration.class, "OutputDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(inputOutputDeclarationEClass, InputOutputDeclaration.class, "InputOutputDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(returnDeclarationEClass, ReturnDeclaration.class, "ReturnDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSignal_Type(), theKExpressionsPackage.getValueType(), "type", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSignal_IdType(), ecorePackage.getEString(), "idType", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSignal_CombineFunction(), this.getFunction(), null, "combineFunction", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sensorDeclarationEClass, SensorDeclaration.class, "SensorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSensor_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationDeclarationEClass, RelationDeclaration.class, "RelationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationDeclaration_Relations(), this.getRelation(), null, "relations", null, 0, -1, RelationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRelation_Type(), ecorePackage.getEString(), "type", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationImplicationEClass, RelationImplication.class, "RelationImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationImplication_First(), this.getSignal(), null, "first", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationImplication_Second(), this.getSignal(), null, "second", null, 0, 1, RelationImplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationIncompatibilityEClass, RelationIncompatibility.class, "RelationIncompatibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationIncompatibility_Incomp(), this.getSignal(), null, "incomp", null, 0, -1, RelationIncompatibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esterelStatementEClass, EsterelStatement.class, "EsterelStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(esterelParallelEClass, EsterelParallel.class, "EsterelParallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(esterelThreadEClass, EsterelThread.class, "EsterelThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nothingEClass, Nothing.class, "Nothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(haltEClass, Halt.class, "Halt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(emitEClass, Emit.class, "Emit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEmit_Signal(), theKExpressionsPackage.getValuedObject(), null, "signal", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEmit_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Emit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sustainEClass, Sustain.class, "Sustain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSustain_Signal(), theKExpressionsPackage.getValuedObject(), null, "signal", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSustain_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Sustain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcedureCall_Procedure(), this.getProcedure(), null, "procedure", null, 0, 1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcedureCall_ReferenceArguments(), this.getVariable(), null, "referenceArguments", null, 0, -1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcedureCall_ValueArguments(), theKExpressionsPackage.getExpression(), null, "valueArguments", null, 0, -1, ProcedureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(presentEClass, Present.class, "Present", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPresent_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresent_Cases(), this.getPresentCase(), null, "cases", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresent_ElseStatements(), theSCLPackage.getStatement(), null, "elseStatements", null, 0, -1, Present.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(presentCaseEClass, PresentCase.class, "PresentCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPresentCase_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, PresentCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ifTestEClass, IfTest.class, "IfTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIfTest_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIfTest_Elseif(), this.getElsIf(), null, "elseif", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIfTest_ElseStatements(), theSCLPackage.getStatement(), null, "elseStatements", null, 0, -1, IfTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(elsIfEClass, ElsIf.class, "ElsIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElsIf_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, ElsIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLoop_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRepeat_Positive(), ecorePackage.getEBoolean(), "positive", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRepeat_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abortEClass, Abort.class, "Abort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbort_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbort_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbort_DoStatements(), theSCLPackage.getStatement(), null, "doStatements", null, 0, -1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbort_Cases(), this.getCase(), null, "cases", null, 0, -1, Abort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCase_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(awaitEClass, Await.class, "Await", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAwait_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAwait_Cases(), this.getCase(), null, "cases", null, 0, -1, Await.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(everyDoEClass, EveryDo.class, "EveryDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEveryDo_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, EveryDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(suspendEClass, Suspend.class, "Suspend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuspend_Weak(), ecorePackage.getEBoolean(), "weak", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSuspend_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Suspend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trapEClass, Trap.class, "Trap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTrap_TrapSignals(), this.getSignal(), null, "trapSignals", null, 0, -1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTrap_TrapHandler(), this.getTrapHandler(), null, "trapHandler", null, 0, -1, Trap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trapHandlerEClass, TrapHandler.class, "TrapHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTrapHandler_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, TrapHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(exitEClass, Exit.class, "Exit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExit_Trap(), this.getTrapSignal(), null, "trap", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExit_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Exit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(execEClass, Exec.class, "Exec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExec_Task(), this.getTask(), null, "task", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExec_ReferenceParameters(), this.getVariable(), null, "referenceParameters", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExec_ValueParameters(), theKExpressionsPackage.getExpression(), null, "valueParameters", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExec_ReturnSignal(), this.getSignal(), null, "returnSignal", null, 0, 1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExec_ExecCaseList(), this.getExecCase(), null, "execCaseList", null, 0, -1, Exec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(execCaseEClass, ExecCase.class, "ExecCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecCase_Task(), this.getTask(), null, "task", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecCase_ReferenceParameters(), this.getVariable(), null, "referenceParameters", null, 0, -1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecCase_ValueParameters(), theKExpressionsPackage.getExpression(), null, "valueParameters", null, 0, -1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecCase_ReturnSignal(), this.getSignal(), null, "returnSignal", null, 0, 1, ExecCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localSignalDeclarationEClass, LocalSignalDeclaration.class, "LocalSignalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalVariableDeclaration_Declarations(), this.getEsterelVariableDeclaration(), null, "declarations", null, 0, -1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esterelVariableDeclarationEClass, EsterelVariableDeclaration.class, "EsterelVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEsterelVariableDeclaration_Type(), this.getTypeIdentifier(), null, "type", null, 0, 1, EsterelVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRun_Module(), this.getModuleRenaming(), null, "module", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRun_Renamings(), this.getRenamings(), null, "renamings", null, 0, -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleRenamingEClass, ModuleRenaming.class, "ModuleRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleRenaming_Module(), theSCLPackage.getModule(), null, "module", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModuleRenaming_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ModuleRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(renamingEClass, Renaming.class, "Renaming", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(renamingsEClass, Renamings.class, "Renamings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRenamings_Renamings(), this.getRenaming(), null, "renamings", null, 0, -1, Renamings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeRenamingEClass, TypeRenaming.class, "TypeRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTypeRenaming_NewName(), this.getTypeDefinition(), null, "newName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeRenaming_NewType(), theKExpressionsPackage.getValueType(), "newType", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTypeRenaming_OldName(), this.getTypeDefinition(), null, "oldName", null, 0, 1, TypeRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constantRenamingEClass, ConstantRenaming.class, "ConstantRenaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstantRenaming_NewName(), this.getConstant(), null, "newName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConstantRenaming_NewValue(), theKExpressionsPackage.getExpression(), null, "newValue", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConstantRenaming_OldName(), this.getConstant(), null, "oldName", null, 0, 1, ConstantRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getSignalRenaming_NewName(), theKExpressionsPackage.getValuedObjectReference(), null, "newName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSignalRenaming_OldName(), theKExpressionsPackage.getValuedObjectReference(), null, "oldName", null, 0, 1, SignalRenaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(doEClass, Do.class, "Do", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDo_WatchingAnnotations(), theAnnotationsPackage.getAnnotation(), null, "watchingAnnotations", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDo_Watching(), this.getDelayExpression(), null, "watching", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDo_Delay(), this.getDelayExpression(), null, "delay", null, 0, 1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDo_WatchingStatements(), theSCLPackage.getStatement(), null, "watchingStatements", null, 0, -1, Do.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(delayExpressionEClass, DelayExpression.class, "DelayExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDelayExpression_Delay(), theKExpressionsPackage.getExpression(), null, "delay", null, 0, 1, DelayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDelayExpression_Immediate(), ecorePackage.getEBoolean(), "immediate", null, 0, 1, DelayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDelayExpression_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, DelayExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trapSignalEClass, TrapSignal.class, "TrapSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(trapExpressionEClass, TrapExpression.class, "TrapExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTrapExpression_Trap(), this.getSignal(), null, "trap", null, 0, 1, TrapExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(esterelFunctionCallEClass, EsterelFunctionCall.class, "EsterelFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEsterelFunctionCall_Function(), this.getFunction(), null, "function", null, 0, 1, EsterelFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEsterelFunctionCall_Parameter(), theKExpressionsPackage.getExpression(), null, "parameter", null, 0, -1, EsterelFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstantExpression_Constant(), this.getConstant(), null, "constant", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConstantExpression_Value(), theKExpressionsPackage.getValue(), null, "value", null, 0, 1, ConstantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trapReferenceEClass, TrapReference.class, "TrapReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(signalReferenceEClass, SignalReference.class, "SignalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(tickReferenceEClass, TickReference.class, "TickReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(scEstStatementEClass, SCEstStatement.class, "SCEstStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unEmitEClass, UnEmit.class, "UnEmit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUnEmit_Signal(), this.getSignal(), null, "signal", null, 0, 1, UnEmit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSet_Signal(), this.getSignal(), null, "signal", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSet_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //EsterelPackageImpl
