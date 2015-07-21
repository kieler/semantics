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
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.IterateAction
import java.util.HashMap
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.kexpressions.Signal
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Block

class SCChartsToEsterelTransformation extends AbstractModelTransformation {

	val esterel = EsterelFactory::eINSTANCE
	val kExpression = KExpressionsFactory::eINSTANCE

	var LinkedList<ISignal> allSignals
	var HashMap<State, ISignal> stateSignalMap
	var HashMap<State, Boolean> stateDoneMap
	var HashMap<Region, ISignal> regionSignalMap

	//	var LinkedList<ISignal> stateSignals
	//	var LinkedList<State> statesDone
	var LinkedList<TrapDecl> allTraps
	val localSignal = esterel.createLocalSignal

	override EObject transform(EObject model) {
		return (transformModel(model as State))
	}

	public def Program transformModel(State model) {
		allSignals = new LinkedList<ISignal>
		allTraps = new LinkedList<TrapDecl>
		stateSignalMap = new HashMap<State, ISignal>
		stateDoneMap = new HashMap<State, Boolean>
		regionSignalMap = new HashMap<Region, ISignal>

		//		stateSignals = new LinkedList<ISignal>
		//		statesDone = new LinkedList<State>
		val program = esterel.createProgram
		val module = esterel.createModule
		module.name = model.id
		program.modules.add(module)

		//creates the module interface, signal declarations etc., of the Esterel program
		module.interface = createModuleInterface(model.declarations)

		//creates the module body of the Esterel program
		module.body = esterel.createModuleBody

		val localSignals = esterel.createLocalSignalDecl
		for (state : model.eAllContents.filter(State).toList) {
			val stateSignal = kExpression.createISignal => [
				name = "s" + state.hashCode.toString
				channelDescr = esterel.createChannelDescription => [
					type = kExpression.createTypeIdentifier => [
						type = ValueType::BOOL
					]
				]
			]
			localSignal.signal.add(stateSignal)
			stateSignalMap.put(state, stateSignal)
		}
		localSignals.signalList = localSignal
		module.body.statements.add(localSignals)
		localSignals.statement = transformState(model, true)

		module.end = "end module"

		program
	}

	// creates the module interface, signal declarations etc., of the Esterel program
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

	public def Statement transformState(State rootState, boolean root) {

		if (stateDoneMap.containsKey(rootState)) {
			return esterel.createNothing
		} else {

			stateDoneMap.put(rootState, true)

			val regSignalList = new LinkedList<ISignal>()

			val programCodeBlock = esterel.createBlock
			val progSeq = esterel.createSequence
			val seq = esterel.createSequence

			if (!root) {

				// create IfTest for handling the structure of the SCChart
				val stateTest = esterel.createIfTest
				stateTest.expr = createExp(stateSignalMap.get(rootState))
				val thenTest = esterel.createThenPart
				thenTest.statement = seq
				stateTest.thenPart = thenTest
				progSeq.list.add(stateTest)

			//progSeq.list.add(esterel.createPause)
			} else {
				progSeq.list.add(
					esterel.createBlock => [
						statement = seq
					])

			}
			progSeq.list.add(esterel.createNothing)

			val regions = rootState.regions
			val transitions = rootState.outgoingTransitions

			if (regions.empty) {

				// -------------------------------------------- Transition für Superstates anfertigen-----------------------------
				if (transitions.size > 0) {

					val awaitBlock = esterel.createAwait
					seq.list.add(awaitBlock)
					val awaitBody = esterel.createAwaitCase
					awaitBlock.body = awaitBody
					var awaitCases = awaitBody.cases
					awaitBody.end = "end"
					for (transition : transitions) {
						var awaitCase = esterel.createAbortCaseSingle
						awaitCases.add(awaitCase)
						awaitCase.delay = esterel.createDelayExpr => [
							event = esterel.createDelayEvent => [
								if (transition.trigger != null) {
									tick = "tick"
								} else {
									expr
								}
							]
							isImmediate = transition.immediate
						]
						awaitCase.statement = esterel.createSequence => [
							for (effect : transition.effects) {
								list.add(transformEffect(effect as Assignment))
							}
							list.add(createControllEmit(stateSignalMap.get(transition.sourceState), "false"))
							list.add(createControllEmit(stateSignalMap.get(transition.targetState), "true"))
							if (!transition.sourceState.final && transition.targetState.final) {
								list.add(createControllEmit(regionSignalMap.get(rootState.parentRegion), "true"))
							} else if (transition.sourceState.final && !transition.targetState.final) {
								list.add(createControllEmit(regionSignalMap.get(rootState.parentRegion), "false"))
							}
						]
					}
				} else if (transitions.size == 0 && !rootState.final) {
					seq.list.add(esterel.createHalt)
				} else {
					seq.list.add(esterel.createNothing)
				}
			} else {

				// Liste der Signale die zum handeln der Regionen und der aborts benötigt werden
				val regSignalDecl = esterel.createLocalSignalDecl
				val regSignals = esterel.createLocalSignal
				regSignalDecl.signalList = regSignals
				seq.list.add(regSignalDecl)

				// Trap zum handeln der Normaltermination			
				val trap = esterel.createTrap
				val trapDecls = esterel.createTrapDeclList
				trap.trapDeclList = trapDecls
				val trapDecl = esterel.createTrapDecl
				trapDecls.trapDecls.add(trapDecl)
				trapDecl.name = "trap" + rootState.hashCode.toString

				regSignalDecl.statement = trap

				val outTransitions = rootState.outgoingTransitions

				// Statement zum Verschachteln von Aborts
				var Block out = esterel.createBlock
				var Block in

				val parblock = esterel.createParallel
				val controllParBlock = esterel.createParallel
				controllParBlock.list.add(out)

				
				for (trans : outTransitions) {

					// signals zum Handeln von verschachtelten Aborts
					val abortSignal = kExpression.createISignal => [
						name = "abort" + trans.hashCode.toString
						channelDescr = esterel.createChannelDescription => [
							type = kExpression.createTypeIdentifier => [
								type = ValueType::BOOL
							]
						]
					]
					regSignals.signal.add(abortSignal)

					in = esterel.createBlock

					// Abort-Statements geschachtelt nach der Reihenfolge der Transitionen im State
					if (trans.type.equals(TransitionType::STRONGABORT)) {
						val abort = esterel.createAbort
						abort.body = esterel.createAbortInstance => [
							delay = esterel.createDelayExpr => [
								isImmediate = trans.immediate
								event = esterel.createDelayEvent
								// tick = "tick"
								event.expr = createExp(abortSignal)
							]
						]
						abort.statement = in
						in = out

					} else if (trans.type.equals(TransitionType::WEAKABORT)) {
						val abort = esterel.createWeakAbort
						abort.body = esterel.createAbortInstance => [
							delay = esterel.createDelayExpr => [
								isImmediate = trans.immediate
								event = esterel.createDelayEvent
								// tick = "tick"
								event.expr = createExp(abortSignal)
							]
						]
						abort.statement = in
						in = out
					}

				}
				
				out.statement = parblock
				

				// Erzeugen paralleler Statements für jede Region
				trap.statement = controllParBlock //------------------------aborts nicht vergessen-----------------------------

				for (reg : regions) {

					// signals zum prüfen, ob die jeweilige Region im final state ist
					val regSignal = kExpression.createISignal => [
						name = "r" + reg.hashCode.toString
						channelDescr = esterel.createChannelDescription => [
							type = kExpression.createTypeIdentifier => [
								type = ValueType::BOOL
							]
						]
					]
					regionSignalMap.put(reg, regSignal)
					regSignals.signal.add(regSignal)
					regSignalList.add(regSignal)

					var State initState
					val stateSeq = esterel.createSequence
					for (state : rootState.eAllContents.filter(State).toList) {
						if (state.initial && state.parentRegion.equals(reg)) {
							initState = state
						}
						if (state.parentRegion.equals(reg)) {
							stateSeq.list.add(transformState(state, false))
						}
					}
					stateSeq.list.add(esterel.createPause)

					// Loop für das Handling möglicher Zyklen in der Region und für die Terminierung
					val loop = esterel.createLoop
					loop.end1 = esterel.createEndLoop
					loop.body = esterel.createLoopBody
					val regSeq = esterel.createSequence

					loop.body.statement = regSeq
					val regBlock = stateSeq
					val initEmit = createControllEmit(stateSignalMap.get(initState), "true")
					regSeq.list.add(initEmit)
					regSeq.list.add(loop)
					loop.body.statement = regBlock
					parblock.list.add(regSeq)

				}

				// Erzeugen eines weiteren parallelen Statements für Termination handling
				val controllLoop = esterel.createLoop
				controllLoop.end1 = esterel.createEndLoop
				val loopSeq = esterel.createSequence
				controllLoop.body = esterel.createLoopBody => [
					statement = loopSeq
				]
				val controllIf = esterel.createIfTest
				controllIf.expr = createExp(regSignalList)
				controllIf.thenPart = esterel.createThenPart => [
					statement = esterel.createExit => [
						trap = trapDecl
					]
				]
				loopSeq.list.add(controllIf)
				loopSeq.list.add(esterel.createPause)
				parblock.list.add(controllLoop)

				if (transitions.size > 0) {

					val awaitBlock = esterel.createAwait
					controllParBlock.list.add(awaitBlock)
					val awaitBody = esterel.createAwaitCase
					awaitBlock.body = awaitBody
					var awaitCases = awaitBody.cases
					awaitBody.end = "end"
					for (transition : transitions) {
						var awaitCase = esterel.createAbortCaseSingle
						awaitCases.add(awaitCase)
						awaitCase.delay = esterel.createDelayExpr => [
							event = esterel.createDelayEvent => [
								if (transition.trigger != null) {
									tick = "tick"
								} else {
									expr
								}
							]
							isImmediate = transition.immediate
						]
						awaitCase.statement = esterel.createSequence => [
							for (effect : transition.effects) {
								list.add(transformEffect(effect as Assignment))
							}
							list.add(createControllEmit(stateSignalMap.get(transition.sourceState), "false"))
							list.add(createControllEmit(stateSignalMap.get(transition.targetState), "true"))
							if (!transition.sourceState.final && transition.targetState.final) {
								list.add(createControllEmit(regionSignalMap.get(rootState.parentRegion), "true"))
							} else if (transition.sourceState.final && !transition.targetState.final) {
								list.add(createControllEmit(regionSignalMap.get(rootState.parentRegion), "false"))
							}
						]
					}
				} else if (transitions.size == 0 && !rootState.final) {
					seq.list.add(esterel.createHalt)
					controllParBlock.list.add(esterel.createNothing)
					
				} else {
					seq.list.add(esterel.createNothing)
					controllParBlock.list.add(esterel.createNothing)
				}

			}

			// Help function
			while (seq.list.length < 2) {
				val state = esterel.createNothing
				seq.list.add(state)
			}

			// create local declarations --------------------------------- nach oben verschieben ----------------------
			var decls = rootState.eAllContents.filter(Declaration).toList
			if (!root && !decls.empty) {
				val localSignals = esterel.createLocalSignalDecl
				val localSignal = esterel.createLocalSignal
				localSignals.signalList = localSignal

				for (decl : rootState.declarations) {
					for (valObj : decl.valuedObjects) {
						val declSignal = kExpression.createISignal => [
							name = valObj.name
							channelDescr = esterel.createChannelDescription => [
								type = kExpression.createTypeIdentifier => [
									type = ValueType::getByName(decl.type.getName)
								]
							]
						]
						localSignal.signal.add(declSignal)
					}
				}
				localSignals.statement = progSeq // mit den IfTests verbinden ---------------------------------
				programCodeBlock.statement = localSignals
			} else {
				programCodeBlock.statement = progSeq
			}

			programCodeBlock
		}
	}

	def Emit createControllEmit(ISignal sig, String boolValue) {
		val emit = esterel.createEmit
		val emitExpr = esterel.createConstantExpression => [
			value = boolValue
		]
		emit.signal = sig
		emit.expr = emitExpr
		emit
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

	def OperatorExpression createExp(ISignal signal) {
		kExpression.createOperatorExpression => [
			operator = OperatorType::VAL
			subExpressions += kExpression.createValuedObjectReference => [
				valuedObject = signal
			]
		]
	}

	def OperatorExpression createExp(LinkedList<ISignal> list) {
		kExpression.createOperatorExpression => [
			if (list.size > 1) {
				operator = OperatorType::AND
				subExpressions += createExp(list.remove)
				subExpressions += createExp(list)

			} else {
				operator = OperatorType::VAL
				subExpressions += kExpression.createValuedObjectReference => [
					valuedObject = list.head
				]
			}
		]
	}

	def dispatch OperatorExpression transformTrigger(de.cau.cs.kieler.core.kexpressions.OperatorExpression exp) {
		kExpression.createOperatorExpression => [
			operator = OperatorType::getByName(exp.operator.getName)
			for (subExp : exp.subExpressions) {
				subExpressions += transformTrigger(subExp)
			}
		]
	}

	def dispatch Expression transformTrigger(de.cau.cs.kieler.core.kexpressions.ValuedObjectReference exp) {
		return kExpression.createValuedObjectReference => [
			valuedObject = allSignals.findFirst[name == exp.valuedObject.name]]

	}

}
