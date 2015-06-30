package de.cau.cs.kieler.sccharts.esterel.transformation

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.ModuleInterface
import de.cau.cs.kieler.sccharts.esterel.transformation.HelpFunctions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.Value
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.esterel.esterel.ModuleBody
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.sccharts.Transition
import java.util.Comparator
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import java.util.LinkedList
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.Effect
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier
import de.cau.cs.kieler.esterel.esterel.TrapDecl
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference

class SCChartsToEsterelTransformation extends AbstractModelTransformation {

	val esterel = EsterelFactory::eINSTANCE
	val kExpression = KExpressionsFactory::eINSTANCE

	var LinkedList<ISignal> allSignals
	var LinkedList<TrapDecl> allTraps

	override EObject transform(EObject model) {
		return (transformModel(model as State))
	}

	public def Program transformModel(State model) {
		allSignals = new LinkedList<ISignal>
		allTraps = new LinkedList<TrapDecl>
		val program = esterel.createProgram
		val module = esterel.createModule
		module.name = model.id
		program.modules.add(module)

		//creates the module interface, signal declarations etc., of the Esterel program
		module.interface = createModuleInterface(model.declarations)

		//creates the module body of the Esterel program
		val body = esterel.createModuleBody
		body.statements.add(createStatementForState(model))
		module.body = body
		module.end = "end module"

		program
	}

	// creates the Module Interface, signal declarations etc., of the Esterel program
	public def ModuleInterface createModuleInterface(EList<Declaration> declarations) {
		val ModuleInterface mi = esterel.createModuleInterface
		for (decl : declarations) {
			for (valObj : decl.valuedObjects) {
				val signal = kExpression.createISignal => [
					name = valObj.name
					channelDescr = esterel.createChannelDescription => [
						type = kExpression.createTypeIdentifier => [
							type = ValueType::getByName(decl.type.getName)
						]
					]
				]
				if (decl.isOutput && decl.isInput) {
					mi.intSignalDecls += kExpression.createInputOutput => [
						signals += signal
					]
				} else if (decl.isInput) {
					mi.intSignalDecls += kExpression.createInput => [
						signals += signal
					]
				} else if (decl.isOutput) {
					mi.intSignalDecls += kExpression.createOutput => [
						signals += signal
					]
				}
				allSignals += signal
			}
		}
		mi
	}

	public def Statement createStatementForState(State rootState) {
		val block = esterel.createBlock
		val seq = esterel.createSequence
		block.statement = seq

		val regions = rootState.regions
		rootState.outgoingTransitions

		if (regions.size == 0) {
			if (rootState.outgoingTransitions.size > 0) {
				seq.list.add(createStatementForTransitions(rootState.outgoingTransitions))
			}
		} else if (regions.size == 1) {
			var states = rootState.eAllContents.filter(State).toList

			var State initState
			for (state : states) {
				if (state.initial) {
					initState = state
				}
			}
			seq.list.add(createStatementForTransitions(initState.outgoingTransitions))

		} else {
			for (reg : regions) {
				var states = rootState.eAllContents.filter(State).toList

				var State initState
				for (state : states) {
					if (state.initial && state.parentRegion == reg) {
						initState = state
					}
				}

				// TODO: Parallel operator must be implemented here
				seq.list.add(createStatementForTransitions(initState.outgoingTransitions))

			}
		}

		while (seq.list.length < 2) {
			val state = esterel.createNothing
			seq.list.add(state)
		}
		block
	}

	//creates Esterel Statement for the Transition
	def Statement createStatementForTransitions(EList<Transition> transitions) {
		val block = esterel.createBlock
		val seq = esterel.createSequence
		block.statement = seq
		val awaitBlock = esterel.createAwait
		seq.list.add(awaitBlock)
		val awaitBody = esterel.createAwaitCase
		awaitBlock.body = awaitBody
		var awaitCases = awaitBody.cases
		awaitBody.end = "end"

		for (trans : transitions) {

			if (trans.trigger != null) {
				val oneCase = esterel.createAbortCaseSingle
				awaitCases.add(oneCase)
				oneCase.delay = esterel.createDelayExpr => [
					event = esterel.createDelayEvent => [
						FB = "["
						EB = "]"
						expr = transformExp(trans.trigger)					
					]
					isImmediate = trans.immediate
				]
			} else {
			}
		}
		while (seq.list.length < 2) {
			val state = esterel.createNothing
			seq.list.add(state)
		}
		block
	}

	//	def dispatch Statement transformEffect(Assignment assign){
	//		val state = esterel.createAssignment => [
	//			^var = allSignals.findFirst[name == assign.valuedObject.name]
	//		]
	//		
	//		state
	//	}
	def Statement transformEffect(Assignment assign) {

		val state = esterel.createEmit => [
			signal = allSignals.findFirst[name == assign.valuedObject.name]
			expr = transformExp(assign.expression)
		]

		state
	}

	

	def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.BoolValue exp) {
		esterel.createConstantExpression => [
			value = Boolean.toString(exp.value)
		]
	}

	def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.IntValue exp) {
		esterel.createConstantExpression => [
			value = Integer.toString(exp.value)
		]
	}

	def dispatch ConstantExpression transformExp(de.cau.cs.kieler.core.kexpressions.FloatValue exp) {
		esterel.createConstantExpression => [
			value = Float.toString(exp.value)
		]
	}

	def dispatch Expression transformExp(de.cau.cs.kieler.core.kexpressions.ValuedObjectReference exp) {
		return kExpression.createOperatorExpression => [
			operator = OperatorType::VAL
			subExpressions += kExpression.createValuedObjectReference => [
				valuedObject = allSignals.findFirst[name == exp.valuedObject.name]
			]
		]
	}

	def dispatch OperatorExpression transformExp(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
		kExpression.createOperatorExpression => [
			operator = OperatorType::getByName(exp.operator.getName)
			for (subExp : exp.subExpressions) {
				subExpressions += transformExp(subExp)
			}
		]
	}
	

}
