/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpFactory
 * 
 * @generated
 */
public interface KlpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "klp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cau.de/cs/kieler/krep/editors/klp/Klp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "klp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KlpPackage eINSTANCE = de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.KLPImpl <em>KLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KLPImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getKLP()
	 * @generated
	 */
	int KLP = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLP__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>KLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.LineImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 3;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.DeclImpl <em>Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.DeclImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getDecl()
	 * @generated
	 */
	int DECL = 4;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl <em>Set Clk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getSetClk()
	 * @generated
	 */
	int SET_CLK = 5;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetPCImpl <em>Set PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.SetPCImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getSetPC()
	 * @generated
	 */
	int SET_PC = 6;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl <em>Prio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getPrio()
	 * @generated
	 */
	int PRIO = 7;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.DoneImpl <em>Done</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.DoneImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getDone()
	 * @generated
	 */
	int DONE = 8;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl <em>Binop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getBinop()
	 * @generated
	 */
	int BINOP = 9;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.JmpImpl <em>Jmp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.JmpImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getJmp()
	 * @generated
	 */
	int JMP = 10;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl <em>CJmp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getCJmp()
	 * @generated
	 */
	int CJMP = 11;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.MoveImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 12;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.LabelImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ADDR = 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPCODE0 = 0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPCODE1 = 1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPCODE2 = 2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPCODE3 = 3;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__SCOPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL__REG = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Clk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__CLK = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK__REG = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Clk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__LABEL = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC__REG = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__PRIO = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO__REG = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Pc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE__PC = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Done</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__OP = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__ARG1 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__ARG2 = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__VAL = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP__TO = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP__LABEL = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__COND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__REG = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP__LABEL = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CJmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CJMP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opcode0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OPCODE0 = INSTRUCTION__OPCODE0;

	/**
	 * The feature id for the '<em><b>Opcode1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OPCODE1 = INSTRUCTION__OPCODE1;

	/**
	 * The feature id for the '<em><b>Opcode2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OPCODE2 = INSTRUCTION__OPCODE2;

	/**
	 * The feature id for the '<em><b>Opcode3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OPCODE3 = INSTRUCTION__OPCODE3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__FROM = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__VAL = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__TO = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.RegImpl <em>Reg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.RegImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getReg()
	 * @generated
	 */
	int REG = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG__ID = 1;

	/**
	 * The number of structural features of the '<em>Reg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.ReadImpl
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getRead()
	 * @generated
	 */
	int READ = 14;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__PRE = 0;

	/**
	 * The feature id for the '<em><b>Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__REG = 1;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Scope
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 15;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Operator
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 16;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.JumpKind <em>Jump Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.JumpKind
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getJumpKind()
	 * @generated
	 */
	int JUMP_KIND = 17;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.MoveKind <em>Move Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.MoveKind
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getMoveKind()
	 * @generated
	 */
	int MOVE_KIND = 18;


	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.KLP <em>KLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KLP</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KLP
	 * @generated
	 */
	EClass getKLP();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.krep.editors.klp.klp.KLP#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KLP#getInstructions()
	 * @see #getKLP()
	 * @generated
	 */
	EReference getKLP_Instructions();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.krep.editors.klp.klp.Line#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Line#getLabels()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Line#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Line#getInstruction()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Instruction();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode0 <em>Opcode0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcode0</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode0()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Opcode0();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode1 <em>Opcode1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcode1</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode1()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Opcode1();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode2 <em>Opcode2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcode2</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode2()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Opcode2();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode3 <em>Opcode3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcode3</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction#getOpcode3()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Opcode3();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decl</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Decl
	 * @generated
	 */
	EClass getDecl();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Decl#getScope()
	 * @see #getDecl()
	 * @generated
	 */
	EAttribute getDecl_Scope();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Decl#getReg()
	 * @see #getDecl()
	 * @generated
	 */
	EReference getDecl_Reg();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk <em>Set Clk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Clk</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetClk
	 * @generated
	 */
	EClass getSetClk();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getReg()
	 * @see #getSetClk()
	 * @generated
	 */
	EReference getSetClk_Reg();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getClk <em>Clk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clk</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetClk#getClk()
	 * @see #getSetClk()
	 * @generated
	 */
	EReference getSetClk_Clk();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC <em>Set PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set PC</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetPC
	 * @generated
	 */
	EClass getSetPC();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getReg()
	 * @see #getSetPC()
	 * @generated
	 */
	EReference getSetPC_Reg();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetPC#getLabel()
	 * @see #getSetPC()
	 * @generated
	 */
	EReference getSetPC_Label();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prio</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Prio
	 * @generated
	 */
	EClass getPrio();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Prio#getReg()
	 * @see #getPrio()
	 * @generated
	 */
	EReference getPrio_Reg();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio#getPrio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prio</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Prio#getPrio()
	 * @see #getPrio()
	 * @generated
	 */
	EAttribute getPrio_Prio();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Done <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Done</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Done
	 * @generated
	 */
	EClass getDone();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Done#getPc <em>Pc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pc</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Done#getPc()
	 * @see #getDone()
	 * @generated
	 */
	EReference getDone_Pc();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop <em>Binop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binop</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop
	 * @generated
	 */
	EClass getBinop();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop#getOp()
	 * @see #getBinop()
	 * @generated
	 */
	EAttribute getBinop_Op();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop#getTo()
	 * @see #getBinop()
	 * @generated
	 */
	EReference getBinop_To();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg1 <em>Arg1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg1</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg1()
	 * @see #getBinop()
	 * @generated
	 */
	EReference getBinop_Arg1();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg2 <em>Arg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg2</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop#getArg2()
	 * @see #getBinop()
	 * @generated
	 */
	EReference getBinop_Arg2();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop#getVal()
	 * @see #getBinop()
	 * @generated
	 */
	EAttribute getBinop_Val();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Jmp <em>Jmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jmp</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Jmp
	 * @generated
	 */
	EClass getJmp();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Jmp#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Jmp#getLabel()
	 * @see #getJmp()
	 * @generated
	 */
	EReference getJmp_Label();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp <em>CJmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CJmp</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.CJmp
	 * @generated
	 */
	EClass getCJmp();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getCond()
	 * @see #getCJmp()
	 * @generated
	 */
	EAttribute getCJmp_Cond();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getReg()
	 * @see #getCJmp()
	 * @generated
	 */
	EReference getCJmp_Reg();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.CJmp#getLabel()
	 * @see #getCJmp()
	 * @generated
	 */
	EReference getCJmp_Label();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move#getType()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Type();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move#getTo()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_To();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move#getFrom()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_From();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move#getVal()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Val();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Label#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Label#getAddr()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Addr();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Reg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Reg
	 * @generated
	 */
	EClass getReg();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Reg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Reg#getName()
	 * @see #getReg()
	 * @generated
	 */
	EAttribute getReg_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Reg#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Reg#getId()
	 * @see #getReg()
	 * @generated
	 */
	EAttribute getReg_Id();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#isPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Read#isPre()
	 * @see #getRead()
	 * @generated
	 */
	EAttribute getRead_Pre();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read#getReg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reg</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Read#getReg()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_Reg();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.krep.editors.klp.klp.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.krep.editors.klp.klp.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.krep.editors.klp.klp.JumpKind <em>Jump Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jump Kind</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.JumpKind
	 * @generated
	 */
	EEnum getJumpKind();

	/**
	 * Returns the meta object for enum '{@link de.cau.cs.kieler.krep.editors.klp.klp.MoveKind <em>Move Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move Kind</em>'.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.MoveKind
	 * @generated
	 */
	EEnum getMoveKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KlpFactory getKlpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.KLPImpl <em>KLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KLPImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getKLP()
		 * @generated
		 */
		EClass KLP = eINSTANCE.getKLP();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KLP__INSTRUCTIONS = eINSTANCE.getKLP_Instructions();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.LineImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LABELS = eINSTANCE.getLine_Labels();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__INSTRUCTION = eINSTANCE.getLine_Instruction();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.InstructionImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Opcode0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPCODE0 = eINSTANCE.getInstruction_Opcode0();

		/**
		 * The meta object literal for the '<em><b>Opcode1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPCODE1 = eINSTANCE.getInstruction_Opcode1();

		/**
		 * The meta object literal for the '<em><b>Opcode2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPCODE2 = eINSTANCE.getInstruction_Opcode2();

		/**
		 * The meta object literal for the '<em><b>Opcode3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPCODE3 = eINSTANCE.getInstruction_Opcode3();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.DeclImpl <em>Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.DeclImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getDecl()
		 * @generated
		 */
		EClass DECL = eINSTANCE.getDecl();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECL__SCOPE = eINSTANCE.getDecl_Scope();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECL__REG = eINSTANCE.getDecl_Reg();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl <em>Set Clk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.SetClkImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getSetClk()
		 * @generated
		 */
		EClass SET_CLK = eINSTANCE.getSetClk();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CLK__REG = eINSTANCE.getSetClk_Reg();

		/**
		 * The meta object literal for the '<em><b>Clk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CLK__CLK = eINSTANCE.getSetClk_Clk();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.SetPCImpl <em>Set PC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.SetPCImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getSetPC()
		 * @generated
		 */
		EClass SET_PC = eINSTANCE.getSetPC();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PC__REG = eINSTANCE.getSetPC_Reg();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PC__LABEL = eINSTANCE.getSetPC_Label();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl <em>Prio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.PrioImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getPrio()
		 * @generated
		 */
		EClass PRIO = eINSTANCE.getPrio();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIO__REG = eINSTANCE.getPrio_Reg();

		/**
		 * The meta object literal for the '<em><b>Prio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIO__PRIO = eINSTANCE.getPrio_Prio();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.DoneImpl <em>Done</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.DoneImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getDone()
		 * @generated
		 */
		EClass DONE = eINSTANCE.getDone();

		/**
		 * The meta object literal for the '<em><b>Pc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONE__PC = eINSTANCE.getDone_Pc();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl <em>Binop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.BinopImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getBinop()
		 * @generated
		 */
		EClass BINOP = eINSTANCE.getBinop();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOP__OP = eINSTANCE.getBinop_Op();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINOP__TO = eINSTANCE.getBinop_To();

		/**
		 * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINOP__ARG1 = eINSTANCE.getBinop_Arg1();

		/**
		 * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINOP__ARG2 = eINSTANCE.getBinop_Arg2();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOP__VAL = eINSTANCE.getBinop_Val();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.JmpImpl <em>Jmp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.JmpImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getJmp()
		 * @generated
		 */
		EClass JMP = eINSTANCE.getJmp();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMP__LABEL = eINSTANCE.getJmp_Label();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl <em>CJmp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.CJmpImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getCJmp()
		 * @generated
		 */
		EClass CJMP = eINSTANCE.getCJmp();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CJMP__COND = eINSTANCE.getCJmp_Cond();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CJMP__REG = eINSTANCE.getCJmp_Reg();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CJMP__LABEL = eINSTANCE.getCJmp_Label();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.MoveImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__TYPE = eINSTANCE.getMove_Type();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__TO = eINSTANCE.getMove_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__FROM = eINSTANCE.getMove_From();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__VAL = eINSTANCE.getMove_Val();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.LabelImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ADDR = eINSTANCE.getLabel_Addr();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.RegImpl <em>Reg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.RegImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getReg()
		 * @generated
		 */
		EClass REG = eINSTANCE.getReg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REG__NAME = eINSTANCE.getReg_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REG__ID = eINSTANCE.getReg_Id();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.ReadImpl
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ__PRE = eINSTANCE.getRead_Pre();

		/**
		 * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__REG = eINSTANCE.getRead_Reg();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.Scope
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.Operator
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.JumpKind <em>Jump Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.JumpKind
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getJumpKind()
		 * @generated
		 */
		EEnum JUMP_KIND = eINSTANCE.getJumpKind();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.krep.editors.klp.klp.MoveKind <em>Move Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.MoveKind
		 * @see de.cau.cs.kieler.krep.editors.klp.klp.impl.KlpPackageImpl#getMoveKind()
		 * @generated
		 */
		EEnum MOVE_KIND = eINSTANCE.getMoveKind();

	}

} //KlpPackage
