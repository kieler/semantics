package de.cau.cs.kieler.lustre.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.And
import de.cau.cs.kieler.lustre.lustre.Arrow
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.BoolConstant
import de.cau.cs.kieler.lustre.lustre.Comparison
import de.cau.cs.kieler.lustre.lustre.Constant_Declaration
import de.cau.cs.kieler.lustre.lustre.Current
import de.cau.cs.kieler.lustre.lustre.Div
import de.cau.cs.kieler.lustre.lustre.Equality
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.Expression
import de.cau.cs.kieler.lustre.lustre.Fby
import de.cau.cs.kieler.lustre.lustre.FloatConstant
import de.cau.cs.kieler.lustre.lustre.IfThenElse
import de.cau.cs.kieler.lustre.lustre.IntConstant
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.Minus
import de.cau.cs.kieler.lustre.lustre.Mod
import de.cau.cs.kieler.lustre.lustre.Mul
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.Not
import de.cau.cs.kieler.lustre.lustre.Or
import de.cau.cs.kieler.lustre.lustre.PackageDeclaration
import de.cau.cs.kieler.lustre.lustre.Plus
import de.cau.cs.kieler.lustre.lustre.Pre
import de.cau.cs.kieler.lustre.lustre.UMinus
import de.cau.cs.kieler.lustre.lustre.VariableReference
import de.cau.cs.kieler.lustre.lustre.Variable_Declaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import java.util.ArrayList
import java.util.Hashtable
import org.eclipse.emf.common.util.EList

/**
 * @author cpa
 */
class LustreToSccTransformation extends Processor<LustreProgram, SCCharts> {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsControlflowRegionExtensions
//    @Inject extension SCChartsTransitionExtensions
    extension SCChartsFactory = SCChartsFactory.eINSTANCE
//    extension KExpressionsFactory = KExpressionsFactory.eINSTANCE

    override getId() {
        return "de.cau.cs.kieler.lustre.processors.lustre2sccharts"
    }

    override getName() {
        return "Lustre to SCCharts"
    }
    
    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        model = model.transform
    }

    // -----------------------------------------------------------------------------------
    
    private enum IOType {
        INPUT,
        OUTPUT,
        LOCAL
    }

    private Hashtable<String, ValuedObject> VO = new Hashtable
    private var regionNameIdx = 0;
    private var stateNameIdx = 0;

    def SCCharts transform(LustreProgram p) {
        regionNameIdx = 0
        stateNameIdx = 0
        // transformPackage_Declaration(p.packages.get(0))
        return createSCCharts => [
//            rootStates += transformNode(p.nodes.get(0))
        ]
    }

    private def State transformPackage_Declaration(PackageDeclaration p) {
        val rootState = createState => [ root |
            root.label = "test"
            root.name = root.label

            createControlflowRegion => [
                name = "_main"
                label = ""

                root.regions += it
            ]
        ]

//        for (Constant_Declaration c : p.constants)
//            rootState.addDeclaration(c)

//        for (NodeDeclaration node : p.nodes)
//            rootState.regions.filter(ControlflowRegion).head.states += transformNode(node)

        rootState
    }

    private def transformNode(NodeDeclaration node) {

        val state = createState => [ root |
            root.label = node.name
            root.name = root.label
        ]

//        for (Variable_Declaration v : node.parameters)
//            state.addDeclaration(v, IOType.INPUT)
//        for (Variable_Declaration v : node.returned)
//            state.addDeclaration(v, IOType.OUTPUT)
//        for (Variable_Declaration v : node.variables)
//            state.addDeclaration(v, IOType.LOCAL)
//        for (Constant_Declaration c : node.constants)
//            state.addDeclaration(c)

        for (Equation eq : node.equations) {
            if (eq.right.isPureExpression)
                state.createImmediateDuringAction() => [
//                    effects += createAssignment(VO.get(eq.left.name), eq.right.toKexpression)
                ]
            else {
                val region = createControlflowRegion => [
                    name = "_r"+regionNameIdx++
                    label = ""

                    state.regions += it
                ]
                
                val initialState = createState => [
                    name = "_s"+stateNameIdx++
                    label = ""
                    initial = true
                ]

                region.states += initialState
//                val stateList = eq.right.transformEquation(eq.left.name, state, initialState, region)
//                for (State s : stateList) {
//                    createTransition => [
//                        targetState = initialState
//                        s.outgoingTransitions += it
//                    ]
//                }
            }
        }
        for (Automaton a : node.automatons) {
             val region = createControlflowRegion => [
                    name = "_r"+regionNameIdx++
                    label = ""
                    state.regions += it
                ]
                
                a.transformAutomaton(state, region)
            

        }

        state
    }

    def private ArrayList<State> transformEquation(Expression expression, String currentVar, State superState,
        State previousState, ControlflowRegion region) {

        if (expression instanceof IfThenElse)
            expression.transformIfThenElseExpression(currentVar, superState, previousState, region)
        else if (expression instanceof Or || expression instanceof And || expression instanceof Equality ||
            expression instanceof Comparison || expression instanceof Plus || expression instanceof Minus ||
            expression instanceof Mul || expression instanceof Div || expression instanceof Mod)
            expression.transformBinaryExpression(currentVar, superState, previousState, region)
        else if (expression instanceof Fby) // expression.transformFbyExpression(currentVar, superState, previousState, region)
        {
        } else if (expression instanceof Arrow) {
            expression.transformArrowExpression(currentVar, superState, previousState, region)
        }
    }

    def private transformBinaryExpression(Expression expression, String currentVar, State superState,
        State previousState, ControlflowRegion region) {

        var subE = new ArrayList<Expression>
        var op = OperatorType::LOGICAL_OR

        switch(expression) {
            Or: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::LOGICAL_OR
            }
            And: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::LOGICAL_AND
            }
            Equality: {
                subE.add(expression.left)
                subE.add(expression.right)
                if (expression.op == '=')
                    op = OperatorType::EQ
                else if (expression.op == '<>')
                    op = OperatorType::NE
            }
            Comparison: {
                subE.add(expression.left)
                subE.add(expression.right)
                if (expression.op == '<')
                    op = OperatorType::LT
                else if (expression.op == '>')
                    op = OperatorType::GT
                else if (expression.op == '>=')
                    op = OperatorType::GEQ
                else
                    op = OperatorType::LEQ
            }
            Mod: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::MOD
            }
            Plus: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::ADD
            }
            Minus: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::SUB
            }
            Mul: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::MULT
            }
            Div: {
                subE.addAll(expression.subExpressions)
                op = OperatorType::DIV
            }
        }

        val purePart = createOperatorExpression()
        purePart.operator = op
        for (Expression e : subE) {
            if (e.isPureExpression) {
                purePart.subExpressions += e.toKexpression
            } else if (e instanceof Arrow) {
                val newRegion = createControlflowRegion => [
                    name = "_r"+regionNameIdx++
                    label = ""
                    superState.regions += it
                ]
                val newState = createState => [
                    name = "_s"+stateNameIdx++
                    label = ""
                    initial = true
                    newRegion.states += it
                ]
                
                val newVarName = "__" + currentVar + "_" + subE.indexOf(e)
                superState.addDeclaration(newVarName, VO.get(currentVar).variableDeclaration.type.toString, IOType.LOCAL, false)
                
                e.transformArrowExpression(newVarName, superState, newState, newRegion)
                purePart.subExpressions += VO.get(newVarName).reference
            
            } else {
                val newRegion = createControlflowRegion => [
                    name = "_r"+regionNameIdx++
                    label = ""
                    previousState.regions += it
                ]
                val newState = createState => [
                    name = "_s"+stateNameIdx++
                    label = ""
                    initial = true
                    newRegion.states += it
                ]
                val newVarName = "__" + currentVar + "_" + subE.indexOf(e)
                superState.addDeclaration(newVarName, VO.get(currentVar).variableDeclaration.type.toString, IOType.LOCAL, false)
                val endStates = e.transformEquation(newVarName, superState, newState, newRegion)
                for (State s : endStates)
                    s.final = true
                purePart.subExpressions += VO.get(newVarName).reference
            }
        }
        val endState = createState => [ s |
            s.name = "_s"+stateNameIdx++
            s.label = ""
            region.states += s

            createTransition => [
                targetState = s
                previousState.outgoingTransitions += it
                immediate = true
                if (previousState.regions.isEmpty) 
                    immediate = true  
                else
                    preemption = PreemptionType::TERMINATION
                    
                effects += createAssignment(VO.get(currentVar), purePart)
            ]
        ]

        val ret = new ArrayList<State>
        ret.add(endState)
        ret
    }

    def private transformIfThenElseExpression(IfThenElse expression, String currentVar, State superState,
        State previousState, ControlflowRegion region) {

        val ret = new ArrayList<State>

        if (expression.ifexpr.isPureExpression) {
            val endState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
                region.states += it
            ]

            assignExpression(previousState, endState, currentVar, expression.thenexpr, true, expression.ifexpr)
            assignExpression(previousState, endState, currentVar, expression.elseexpr, true, null)

            ret.add(endState)
            return ret

        } else {

            val ifState = previousState

            val ifRegion = createControlflowRegion => [
                name = "_r"+regionNameIdx++
                label = ""
                ifState.regions += it
            ]
            val ifStartingState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
                initial = true
                ifRegion.states += it
            ]

            createValuedObject => [
                name = currentVar + "_if"
                superState.variableDeclarations.filter[type == ValueType::BOOL && !input && !output].head.valuedObjects += it
                VO.put(name, it)
            ]
            expression.ifexpr.transformEquation(currentVar + "_if", superState, ifStartingState, ifRegion)

            val thenState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
            ]

            val thenRegion = createControlflowRegion => [
                name = "_r"+regionNameIdx++
                label = ""
                thenState.regions += it
            ]
            val thenStartingState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
                initial = true
                thenRegion.states += it
            ]

            expression.thenexpr.transformEquation(currentVar, superState, thenStartingState, thenRegion)
            region.states += thenState

            val elseState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
            ]
            val elseRegion = createControlflowRegion => [
                name = "_r"+regionNameIdx++
                label = ""
                elseState.regions += it
            ]
            val elseStartingState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
                initial = true
                elseRegion.states += it
            ]

            expression.elseexpr.transformEquation(currentVar, superState, elseStartingState, elseRegion)
            region.states += elseState

            createTransition => [
                trigger = VO.get(currentVar + "_if").reference
                targetState = thenState
                immediate = true
                ifState.outgoingTransitions += it
            ]

            createTransition => [
                targetState = elseState
                immediate = true
                ifState.outgoingTransitions += it
            ]

            ret.add(thenState)
            ret.add(elseState)
            ret

        }

    }

    def private transformArrowExpression(Arrow expression, String currentVar, State superState, State previousState,
        ControlflowRegion region) {

        var pState = previousState
        for (Expression subE : expression.subExpressions) {
            if (subE != expression.subExpressions.last) {
                val nextState = createState => [
                    name = "_s"+stateNameIdx++
                    label = ""
                    region.states += it
                ]
                assignExpression(pState, nextState, currentVar, subE, (subE == expression.subExpressions.head), null)
                pState = nextState
            } else
                assignExpression(pState, pState, currentVar, subE, false, null)

        }

        val ret = new ArrayList<State>
        ret
    }
    
    def private void transformAutomaton(Automaton automaton, State superState, ControlflowRegion region) {
        val stateList = new Hashtable<AState, State>
        for (AState astate : automaton.states) {
            val state = createState => [
                label = astate.name
                name = "_s"+stateNameIdx++
                initial = astate == automaton.states.head
                stateList.put(astate, it)
                region.states += it
            ]
            
            for (Equation eq : astate.equations) {
                if (eq.right.isPureExpression)
                    state.createImmediateDuringAction() => [
//                        effects += createAssignment(VO.get(eq.left.name), eq.right.toKexpression)
                    ]
                else {
                    val r = createControlflowRegion => [
                        name = "_r"+regionNameIdx++
                        label = ""
    
                        state.regions += it
                    ]
                    
                    val initialState = createState => [
                        name = "_s"+stateNameIdx++
                        label = ""
                        initial = true
                    ]
    
                    r.states += initialState
                    
//                    val sList = eq.right.transformEquation(eq.left.name, state, initialState, r)
//                    for (State s : sList) {
//                        createTransition => [
//                            targetState = initialState
//                            s.outgoingTransitions += it
//                        ]
//                    }
                }
            }
            
            for (Automaton a : astate.automatons) {
                    val r = createControlflowRegion => [
                        name = "_r"+regionNameIdx++
                        label = ""
                        state.regions += it
                    ]
                    
                    a.transformAutomaton(state, r)
            }
        }
        
        for (AState astate : automaton.states) {
            for (ATransition trans : astate.transitions) {
                createTransition => [
                    targetState = stateList.get(trans.nextState)
                    stateList.get(astate).outgoingTransitions+=it
                    trigger = trans.condition.toKexpression
                    preemption = if (trans.strong) PreemptionType::STRONGABORT else PreemptionType::WEAKABORT
                    history = if (trans.history) HistoryType::DEEP else HistoryType::RESET
                ]
            }
        }
        
    }

    def private assignExpression(State startState, State endState, String currentVar, Expression expression,
        Boolean isImmediate, Expression trig) {
        val endStates = new ArrayList<State>
        if (expression.isPureExpression) {
            transformAssignment(startState, endState, currentVar, expression, isImmediate) => [
                trigger = trig.toKexpression
            ]
        } else {
            val rightState = createState => [
                name = "_s"+stateNameIdx++
                label = ""
                startState.parentRegion.states += it
            ]
            endStates.addAll(expression.transformEquation(currentVar, startState.parentRegion.parentState, rightState,
                startState.parentRegion))
            createTransition => [
                targetState = rightState
                immediate = isImmediate
                startState.outgoingTransitions += it
                trigger = trig.toKexpression
            ]
            for (State s : endStates)
                createTransition => [
                    targetState = endState
                    immediate = true
                    s.outgoingTransitions += it
                ]
        }
    }

    def private addDeclaration(State state, Variable_Declaration variable, IOType io) {
        addDeclaration(state, variable.name, variable.type.name, io, false)
    }

    def private addDeclaration(State state, Constant_Declaration constant) {
        addDeclaration(state, constant.name, constant.type.name, IOType.LOCAL, true)
    }

    def private addDeclaration(State state, String varName, String varType, IOType io, Boolean isConst) {
        val vo = createValuedObject => [
            name = varName
            VO.put(name, it)
        ]
        var formattedType = ValueType::BOOL
        if (varType == 'int')
            formattedType = ValueType::INT
        else if (varType == 'float')
            formattedType = ValueType::FLOAT
        val fType = formattedType

        var fittingDeclaration = state.declarations.filter(VariableDeclaration).filter [
            type == fType && input == (io == IOType.INPUT) && output == (io == IOType.OUTPUT) && const == isConst
        ].head

        if (fittingDeclaration === null) {
            fittingDeclaration = KExpressionsFactory.eINSTANCE.createVariableDeclaration => [
                type = fType;
                output = (io == IOType.OUTPUT);
                input = (io == IOType.INPUT);
                const = isConst;

            ]
            state.declarations += fittingDeclaration
        }

        fittingDeclaration.valuedObjects += vo
    }

    def private de.cau.cs.kieler.kexpressions.Expression toKexpression(Expression e) {
        switch (e) {
            BoolConstant:
                createBoolValue(e.value)
            IntConstant:
                createIntValue(e.value)
            FloatConstant:
                createFloatValue(e.value)
            VariableReference:
                VO.get(e.value.name).reference
            Or:
                createOperatorExpression(OperatorType::LOGICAL_OR) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            And:
                createOperatorExpression(OperatorType::LOGICAL_AND) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            Mod:
                createOperatorExpression(OperatorType::MOD) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            Plus:
                createOperatorExpression(OperatorType::ADD) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            Minus:
                createOperatorExpression(OperatorType::SUB) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            Mul:
                createOperatorExpression(OperatorType::MULT) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            Div: {
                createOperatorExpression(OperatorType::DIV) => [
                    it.subExpressions.addExprList(e.subExpressions)
                ]
            }
            Pre: {
                createOperatorExpression(OperatorType::PRE) => [
                    it.subExpressions += e.expression.toKexpression
                ]
            }
            Equality: {
                val op = createOperatorExpression() => [
                    it.subExpressions += e.left.toKexpression
                    it.subExpressions += e.right.toKexpression
                ]
                if (e.op == '=')
                    op.setOperator(OperatorType::EQ)
                else
                    op.setOperator(OperatorType::NE)
                op
            }
            Comparison: {
                val op = createOperatorExpression() => [
                    it.subExpressions += e.left.toKexpression
                    it.subExpressions += e.right.toKexpression
                ]
                if (e.op == '<')
                    op.setOperator(OperatorType::LT)
                else if (e.op == '>')
                    op.setOperator(OperatorType::GT)
                else if (e.op == '>=')
                    op.setOperator(OperatorType::GEQ)
                else
                    op.setOperator(OperatorType::LEQ)
                op
            }
            Not:
                not(e.expression.toKexpression)
            UMinus: {
                createOperatorExpression(OperatorType::SUB) => [
                    it.subExpressions += e.expression.toKexpression
                ]
            }
            Current:
                e.expression.toKexpression
            default:
                null
        }
    }

    def private boolean isPureExpression(Expression e) {
        switch (e) {
            BoolConstant: true
            IntConstant: true
            FloatConstant: true
            VariableReference: true
            Or: e.subExpressions.allPureExpression
            And: e.subExpressions.allPureExpression
            Mod: e.subExpressions.allPureExpression
            Div: e.subExpressions.allPureExpression
            Plus: e.subExpressions.allPureExpression
            Minus: e.subExpressions.allPureExpression
            Mul: e.subExpressions.allPureExpression
            Equality: (e.left.isPureExpression && e.right.isPureExpression)
            Comparison: (e.left.isPureExpression && e.right.isPureExpression)
            Pre: e.expression.isPureExpression
            UMinus: e.expression.isPureExpression
            Not: e.expression.isPureExpression
            Arrow: false
            Fby: false
            IfThenElse: false
            default: false
        }
    }

    def private allPureExpression(Iterable<Expression> l) {
        for (Expression e : l) {
            if (!e.isPureExpression)
                return false
        }
        return true
    }

    def private addExprList(EList<de.cau.cs.kieler.kexpressions.Expression> source, EList<Expression> toBeAdded) {
        for (Expression e : toBeAdded)
            source += e.toKexpression
    }

    def private Transition transformAssignment(State startingState, State finalState, String currentVar,
        Expression expression, Boolean isImmediate) {
        createTransition => [
            targetState = finalState
            effects += createAssignment(VO.get(currentVar), expression.toKexpression)
            startingState.outgoingTransitions += it
            immediate = isImmediate
        ]
    }
}
