/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp.util;

import de.cau.cs.kieler.krep.editors.klp.klp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage
 * @generated
 */
public class KlpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KlpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KlpPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected KlpSwitch<Adapter> modelSwitch =
		new KlpSwitch<Adapter>() {
			@Override
			public Adapter caseKLP(KLP object) {
				return createKLPAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseDecl(Decl object) {
				return createDeclAdapter();
			}
			@Override
			public Adapter caseSetClk(SetClk object) {
				return createSetClkAdapter();
			}
			@Override
			public Adapter caseSetPC(SetPC object) {
				return createSetPCAdapter();
			}
			@Override
			public Adapter casePrio(Prio object) {
				return createPrioAdapter();
			}
			@Override
			public Adapter caseDone(Done object) {
				return createDoneAdapter();
			}
			@Override
			public Adapter caseBinop(Binop object) {
				return createBinopAdapter();
			}
			@Override
			public Adapter caseJmp(Jmp object) {
				return createJmpAdapter();
			}
			@Override
			public Adapter caseCJmp(CJmp object) {
				return createCJmpAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseReg(Reg object) {
				return createRegAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.KLP <em>KLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.KLP
	 * @generated
	 */
	public Adapter createKLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Decl
	 * @generated
	 */
	public Adapter createDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetClk <em>Set Clk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetClk
	 * @generated
	 */
	public Adapter createSetClkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.SetPC <em>Set PC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.SetPC
	 * @generated
	 */
	public Adapter createSetPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Prio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Prio
	 * @generated
	 */
	public Adapter createPrioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Done <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Done
	 * @generated
	 */
	public Adapter createDoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Binop <em>Binop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Binop
	 * @generated
	 */
	public Adapter createBinopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Jmp <em>Jmp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Jmp
	 * @generated
	 */
	public Adapter createJmpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.CJmp <em>CJmp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.CJmp
	 * @generated
	 */
	public Adapter createCJmpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Reg <em>Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Reg
	 * @generated
	 */
	public Adapter createRegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.krep.editors.klp.klp.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.krep.editors.klp.klp.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KlpAdapterFactory
