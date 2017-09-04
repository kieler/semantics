package de.cau.cs.kieler.lustre.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.lustre.features.LustreFeature
import de.cau.cs.kieler.lustre.lustre.And
import de.cau.cs.kieler.lustre.lustre.Arrow
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
import de.cau.cs.kieler.lustre.lustre.Minus
import de.cau.cs.kieler.lustre.lustre.Mul
import de.cau.cs.kieler.lustre.lustre.Node_Declaration
import de.cau.cs.kieler.lustre.lustre.Not
import de.cau.cs.kieler.lustre.lustre.Or
import de.cau.cs.kieler.lustre.lustre.Package_Declaration
import de.cau.cs.kieler.lustre.lustre.Plus
import de.cau.cs.kieler.lustre.lustre.Pre
import de.cau.cs.kieler.lustre.lustre.Program
import de.cau.cs.kieler.lustre.lustre.UMinus
import de.cau.cs.kieler.lustre.lustre.VariableReference
import de.cau.cs.kieler.lustre.lustre.Variable_Declaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.ArrayList
import java.util.Hashtable
import org.eclipse.emf.common.util.EList

/**
 * @author cpa
 */
class LustreToSccTransformation extends AbstractExpansionTransformation {

    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension KExpressionsCreateExtensions
    @Inject
    extension KExpressionsComplexCreateExtensions
    @Inject
    extension KEffectsExtensions
    @Inject
    extension SCChartsExtension

    override getId() {
        return LustreFeature::SCC_ID
    }

    override getName() {
        return LustreFeature::SCC_NAME
    }

    override getProducesFeatureIds() {
        return newHashSet(SCChartsFeature.REFERENCE_ID)
    }

    override getExpandsFeatureId() {
        return LustreFeature.BASIC_ID;
    }

    private enum IOType {
        INPUT,
        OUTPUT,
        LOCAL
    }

    private Hashtable<String, ValuedObject> VO = new Hashtable

    def State transform(Program p, KielerCompilerContext context) {
        // transformPackage_Declaration(p.packages.get(0))
        transformNode(p.packages.get(0).nodes.get(0))
    }

    private def State transformPackage_Declaration(Package_Declaration p) {
        val rootState = scc.createState => [ root |
            root.label = "test"
            root.id = root.label

            scc.createControlflowRegion => [
                id = "_main"
                label = id

                root.regions += it
            ]
        ]

        for (Constant_Declaration c : p.constants)
            rootState.addDeclaration(c)

        for (Node_Declaration node : p.nodes)
            rootState.regions.filter(ControlflowRegion).head.states += transformNode(node)

        rootState
    }

    private def transformNode(Node_Declaration node) {

        val state = scc.createState => [ root |
            root.label = node.name
            root.id = root.label
        ]

        for (Variable_Declaration v : node.parameters)
            state.addDeclaration(v, IOType.INPUT)
        for (Variable_Declaration v : node.returned)
            state.addDeclaration(v, IOType.OUTPUT)
        for (Variable_Declaration v : node.variables)
            state.addDeclaration(v, IOType.LOCAL)
        for (Constant_Declaration c : node.constants)
            state.addDeclaration(c)

        for (Equation eq : node.equations) {
            if (eq.right.isPureExpression)
                state.createImmediateDuringAction() => [
                    effects += createAssignment(VO.get(eq.left.name), eq.right.toKexpression)
                ]
            else {
                println("1")
                val region = scc.createControlflowRegion => [
                    id = ""
                    label = id

                    state.regions += it
                ]
                println("1")
                val initialState = scc.createState => [
                    id = ""
                    label = id
                    initial = true
                ]

                region.states += initialState
                println("2")
                val stateList = eq.right.transformEquation(eq.left.name, state, initialState, region)
                println("end")
                for (State s : stateList) {
                    scc.createTransition => [
                        targetState = initialState
                        s.outgoingTransitions += it
                    ]
                }
            }

        }

        state
    }

    def private ArrayList<State> transformEquation(Expression expression, String currentVar, State superState,
        State previousState, ControlflowRegion region) {

        if (expression instanceof IfThenElse)
            expression.transformIfThenElseExpression(currentVar, superState, previousState, region)
        else if (expression instanceof Or || expression instanceof And || expression instanceof Equality ||
            expression instanceof Comparison || expression instanceof Plus || expression instanceof Minus ||
            expression instanceof Mul || expression instanceof Div)
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
            } else {
                val newRegion = scc.createControlflowRegion => [
                    id = ""
                    label = id
                    previousState.regions += it
                ]
                val newState = scc.createState => [
                    id = ""
                    label = id
                    initial = true
                    newRegion.states += it
                ]
                val newVarName = "__" + currentVar + "_" + subE.indexOf(e)
                superState.addDeclaration(newVarName, VO.get(currentVar).declaration.type.toString, IOType.LOCAL, false)
                val endStates = e.transformEquation(newVarName, superState, newState, newRegion)
                for (State s : endStates)
                    s.final = true
                purePart.subExpressions += VO.get(newVarName).reference
            }
        }
        val endState = scc.createState => [ s |
            s.id = ""
            s.label = s.id
            region.states += s

            scc.createTransition => [
                targetState = s
                previousState.outgoingTransitions += it
                immediate = true
                type = TransitionType::TERMINATION
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
            val endState = scc.createState => [
                id = ""
                label = id
                region.states += it
            ]

            assignExpression(previousState, endState, currentVar, expression.thenexpr, true, expression.ifexpr)
            assignExpression(previousState, endState, currentVar, expression.elseexpr, true, null)

            ret.add(endState)
            return ret

        } else {

            val ifState = previousState

            val ifRegion = scc.createControlflowRegion => [
                id = ""
                label = id
                ifState.regions += it
            ]
            val ifStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                ifRegion.states += it
            ]

            kex.createValuedObject => [
                name = currentVar + "_if"
                superState.declarations.filter[type == ValueType::BOOL && !input && !output].head.valuedObjects += it
                VO.put(name, it)
            ]
            expression.ifexpr.transformEquation(currentVar + "_if", superState, ifStartingState, ifRegion)

            val thenState = scc.createState => [
                id = ""
                label = id
            ]

            val thenRegion = scc.createControlflowRegion => [
                id = ""
                label = id
                thenState.regions += it
            ]
            val thenStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                thenRegion.states += it
            ]

            expression.thenexpr.transformEquation(currentVar, superState, thenStartingState, thenRegion)
            region.states += thenState

            val elseState = scc.createState => [
                id = ""
                label = id
            ]
            val elseRegion = scc.createControlflowRegion => [
                id = ""
                label = id
                elseState.regions += it
            ]
            val elseStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                elseRegion.states += it
            ]

            expression.elseexpr.transformEquation(currentVar, superState, elseStartingState, elseRegion)
            region.states += elseState

            scc.createTransition => [
                trigger = VO.get(currentVar + "_if").reference
                targetState = thenState
                immediate = true
                ifState.outgoingTransitions += it
            ]

            scc.createTransition => [
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
                val nextState = scc.createState => [
                    label = ""
                    id = label
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

    def private assignExpression(State startState, State endState, String currentVar, Expression expression,
        Boolean isImmediate, Expression trig) {
        val endStates = new ArrayList<State>
        if (expression.isPureExpression) {
            transformAssignment(startState, endState, currentVar, expression, isImmediate) => [
                trigger = trig.toKexpression
            ]
        } else {
            val rightState = scc.createState => [
                id = ""
                label = id
                startState.parentRegion.states += it
            ]
            endStates.addAll(expression.transformEquation(currentVar, startState.parentRegion.parentState, rightState,
                startState.parentRegion))
            scc.createTransition => [
                targetState = rightState
                immediate = isImmediate
                startState.outgoingTransitions += it
                trigger = trig.toKexpression
            ]
            for (State s : endStates)
                scc.createTransition => [
                    targetState = endState
                    immediate = true
                    s.outgoingTransitions += it
                ]
        }
    }

    def private addDeclaration(State state, Variable_Declaration variable, IOType io) {
        addDeclaration(state, variable.name, variable.type.name.name, io, false)
    }

    def private addDeclaration(State state, Constant_Declaration constant) {
        addDeclaration(state, constant.name, constant.type.name.name, IOType.LOCAL, true)
    }

    def private addDeclaration(State state, String varName, String varType, IOType io, Boolean isConst) {
        val vo = kex.createValuedObject => [
            name = varName
            VO.put(name, it)
        ]
        var formattedType = ValueType::BOOL
        if (varType == 'int')
            formattedType = ValueType::INT
        else if (varType == 'float')
            formattedType = ValueType::FLOAT
        val fType = formattedType

        var fittingDeclaration = state.declarations.filter [
            type == fType && input == (io == IOType.INPUT) && output == (io == IOType.OUTPUT) && const == isConst
        ].head

        if (fittingDeclaration === null) {
            fittingDeclaration = kex.createDeclaration => [
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
        scc.createTransition() => [
            targetState = finalState
            effects += createAssignment(VO.get(currentVar), expression.toKexpression)
            startingState.outgoingTransitions += it
            immediate = isImmediate
        ]
    }

    private def scc() {
        SCChartsFactory::eINSTANCE
    }

    private def kex() {
        KExpressionsFactory::eINSTANCE
    }
}
