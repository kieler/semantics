package de.cau.cs.kieler.lustre.transformations

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.lustre.LustreStandaloneSetup
import de.cau.cs.kieler.lustre.features.LustreFeature
import de.cau.cs.kieler.lustre.lustre.And
import de.cau.cs.kieler.lustre.lustre.BooleanConstant
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.Expression
import de.cau.cs.kieler.lustre.lustre.FloatConstant
import de.cau.cs.kieler.lustre.lustre.IfThenElse
import de.cau.cs.kieler.lustre.lustre.IntConstant
import de.cau.cs.kieler.lustre.lustre.Node_Decl
import de.cau.cs.kieler.lustre.lustre.Or
import de.cau.cs.kieler.lustre.lustre.Program
import de.cau.cs.kieler.lustre.lustre.Var_Decl
import de.cau.cs.kieler.lustre.lustre.Variableref
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.ArrayList
import org.eclipse.xtext.serializer.ISerializer
import java.util.Hashtable
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.lustre.lustre.Minus
import de.cau.cs.kieler.lustre.lustre.Plus
import de.cau.cs.kieler.lustre.lustre.Div
import de.cau.cs.kieler.lustre.lustre.Comparison
import de.cau.cs.kieler.lustre.lustre.Equality
import de.cau.cs.kieler.lustre.lustre.Mul
import de.cau.cs.kieler.lustre.lustre.Fby
import de.cau.cs.kieler.lustre.lustre.Arrow

class LustreToSccTransformation extends AbstractExpansionTransformation {
    
        private val Injector i = LustreStandaloneSetup.doSetup()
        private val ISerializer serializer = i.getInstance(typeof(ISerializer))
        
        private Hashtable<String, ValuedObject> VO = new Hashtable
        
        @Inject
        extension KExpressionsValuedObjectExtensions
        @Inject
        extension KExpressionsCreateExtensions
        @Inject
        extension KExpressionsComplexCreateExtensions
        @Inject
        extension KEffectsExtensions
        
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
        
        def State transform(Program p, KielerCompilerContext context) {
            val model = scc.createState => [ root |
                root.label = p.pkg.head.name
                root.id = root.label
                
                scc.createControlflowRegion => [
                    id = "_main"
                    label = id
                    
                    root.regions += it
                ]                
            ]
            
            for (Node_Decl node : p.pkg.body.entities) {
                model.regions.filter(ControlflowRegion).head.states += transformNode(node)   
            }
            
            model
        }
        
        private def transformNode(Node_Decl node) {

            val state = scc.createState => [ root |
                root.label = node.head.name
                root.id = root.label
                
                root.declarations += getNodeDeclarations(node)
            ]
            
            for(Equation eq : node.bdy.eq) {
                val region = scc.createControlflowRegion => [
                    id = serializer.serialize(eq)
                    label = id
                    
                    state.regions += it
                ]
                
                
                val initialState = scc.createState => [
                    id = ""
                    label = id
                    initial = true
                ]
                
                region.states += initialState
            
                val stateList = eq.right.transformEquation(eq.left, state, initialState, region)
                for (State s : stateList) {
                    scc.createTransition => [
                        targetState = initialState
                        s.outgoingTransitions += it
                    ]
                }
                
            }
                
            state
        }
     
        private def getNodeDeclarations (Node_Decl node) {
            val  declarations = new ArrayList<Declaration>()
            
            val outputBoolDeclaration = kex.createDeclaration => [ type = ValueType::BOOL; output = true ]
            val outputIntDeclaration = kex.createDeclaration => [ type = ValueType::INT; output = true ]
            val outputFloatDeclaration = kex.createDeclaration => [ type = ValueType::FLOAT; output = true ]
            
            for (Var_Decl decl : node.head.ret.varList) {    
                val outputValuedObject = kex.createValuedObject => [
                    name = decl.name
                    VO.put(decl.name, it)
                ]
                
                if (decl.type.name == 'bool')
                    outputBoolDeclaration.valuedObjects += outputValuedObject
                else if (decl.type.name == 'int')
                    outputIntDeclaration.valuedObjects += outputValuedObject
                else if (decl.type.name == 'float')
                    outputFloatDeclaration.valuedObjects += outputValuedObject
            }
            
            val inputBoolDeclaration = kex.createDeclaration => [ type = ValueType::BOOL; input = true ]
            val inputIntDeclaration = kex.createDeclaration => [ type = ValueType::INT; input = true ]
            val inputFloatDeclaration = kex.createDeclaration => [ type = ValueType::FLOAT; input = true ]
            
            for (Var_Decl decl : node.head.param.varList) {    
                val inputValuedObject = kex.createValuedObject => [
                    name = decl.name
                    VO.put(decl.name, it)
                ]
                
                if (decl.type.name == 'bool')
                    inputBoolDeclaration.valuedObjects += inputValuedObject
                else if (decl.type.name == 'int')
                    inputIntDeclaration.valuedObjects += inputValuedObject
                else if (decl.type.name == 'float')
                    inputFloatDeclaration.valuedObjects += inputValuedObject
            }
            
            val localBoolDeclaration = kex.createDeclaration => [ type = ValueType::BOOL ]
            val localIntDeclaration = kex.createDeclaration => [ type = ValueType::INT ]
            val localFloatDeclaration = kex.createDeclaration => [ type = ValueType::FLOAT ]
            
            for (Var_Decl decl : node.bdy.decl) {    
                val localValuedObject = kex.createValuedObject => [
                    name = decl.name
                    VO.put(decl.name, it)
                ]
                
                if (decl.type.name == 'bool')
                    localBoolDeclaration.valuedObjects += localValuedObject
                else if (decl.type.name == 'int')
                    localIntDeclaration.valuedObjects += localValuedObject
                else if (decl.type.name == 'float')
                    localFloatDeclaration.valuedObjects += localValuedObject
            }
            
            if (!outputBoolDeclaration.valuedObjects.isEmpty)
                declarations += outputBoolDeclaration
            if (!outputIntDeclaration.valuedObjects.isEmpty)
                declarations += outputIntDeclaration
            if (!outputFloatDeclaration.valuedObjects.isEmpty)
                declarations += outputFloatDeclaration
            
            if (!inputBoolDeclaration.valuedObjects.isEmpty)
                declarations += inputBoolDeclaration
            if (!inputIntDeclaration.valuedObjects.isEmpty)
                declarations += inputIntDeclaration
            if (!inputFloatDeclaration.valuedObjects.isEmpty)
                declarations += inputFloatDeclaration
            
            if (!localBoolDeclaration.valuedObjects.isEmpty)
                declarations += localBoolDeclaration
            if (!localIntDeclaration.valuedObjects.isEmpty)
                declarations += localIntDeclaration
            if (!localFloatDeclaration.valuedObjects.isEmpty)
                declarations += localFloatDeclaration
            
            declarations
        }
    
        def private ArrayList<State> transformEquation(Expression expression, String currentVar, 
        State superState, State previousState, ControlflowRegion region) {
            
            if (expression instanceof BooleanConstant || 
                 expression instanceof IntConstant || 
                 expression instanceof FloatConstant ||
                 expression instanceof Variableref
            )
                expression.transformAtomicExpression(currentVar, superState, previousState, region)
            
            else if (expression instanceof IfThenElse)
                expression.transformIfThenElseExpression(currentVar, superState, previousState, region)

            else if (expression instanceof Or ||
                expression instanceof And ||
                expression instanceof Equality ||
                expression instanceof Comparison ||
                expression instanceof Plus ||
                expression instanceof Minus ||
                expression instanceof Mul ||
                expression instanceof Div 
            )
                expression.transformBinaryExpression(currentVar, superState, previousState, region)
            
            else if (expression instanceof Fby)
 //               expression.transformFbyExpression(currentVar, superState, previousState, region)
            {   }
                
            else if (expression instanceof Arrow)
                expression.transformArrowExpression(currentVar, superState, previousState, region)
        }
        
        def private transformAtomicExpression(Expression expression, String currentVar, State superState, 
        State previousState, ControlflowRegion region) {
           val endState = scc.createState => [
                    id = ""
                    label = id
                ]
                region.states += endState
                
                scc.createTransition => [
                    effects += assignAtomicExpression(currentVar, expression)
                    targetState = endState
                    immediate = true
                    previousState.outgoingTransitions += it
                ]
            val ret = new ArrayList<State>
            ret.add(endState)
            ret
        }
        
        def private assignAtomicExpression(String currentVar, Expression expression) {
            if (expression instanceof BooleanConstant) {
                val expr = expression as BooleanConstant
                createAssignment(VO.get(currentVar), createBoolValue(expr.value))
            }
            else if (expression instanceof IntConstant) {
                val expr = expression as IntConstant
                createAssignment(VO.get(currentVar), createIntValue(expr.value))
            }
            else if (expression instanceof FloatConstant) {
                val expr = expression as FloatConstant
                createAssignment(VO.get(currentVar), createFloatValue(expr.value))
            }
            else if (expression instanceof Variableref) {
                val expr = expression as Variableref
                createAssignment(VO.get(currentVar), VO.get(expr.value).reference)
            }
        }
        
        def private transformBinaryExpression(Expression expression, String currentVar, State superState,
        State previousState, ControlflowRegion region) {
  
            var Expression left = null
            var Expression right = null
  
            if (expression instanceof Or) {
                val e = expression as Or
                left = e.left
                right = e.right
            }
            else if (expression instanceof And) {
                val e = expression as And
                left = e.left
                right = e.right
            }
            else if (expression instanceof Plus) {
                val e = expression as Plus
                left = e.left
                right = e.right
            }
            else if (expression instanceof Minus) {
                val e = expression as Minus
                left = e.left
                right = e.right
            }
            else if (expression instanceof Mul) {
                val e = expression as Mul
                left = e.left
                right = e.right
            }
            else if (expression instanceof Div) {
                val e = expression as Div
                left = e.left
                right = e.right
            }
            else if (expression instanceof Comparison) {
                val e = expression as Comparison
                left = e.left
                right = 
                e.right
            }
            else if (expression instanceof Equality) {
                val e = expression as Equality
                left = e.left
                right = e.right
            }
                
            val _left = left
            val _right = right
            
            val mainState = previousState
            val ARegion = scc.createControlflowRegion => [
                id = serializer.serialize(_left)
                label = id
                mainState.regions += it
            ]
            val AStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                ARegion.states += it
            ]
    
            val BRegion = scc.createControlflowRegion => [
                id = serializer.serialize(_right)
                label = id
                mainState.regions += it
            ]
            val BStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                BRegion.states += it
            ]
    
            kex.createValuedObject => [
                name = currentVar + "_1"
                superState.declarations.filter[type == ValueType::BOOL && !input && !output].head.valuedObjects += it
                VO.put(currentVar + "_1", it)
            ]
            kex.createValuedObject => [
                name = currentVar + "_2"
                superState.declarations.filter[type == ValueType::BOOL && !input && !output].head.valuedObjects += it
                VO.put(currentVar + "_2", it)
            ]
    
            left.transformEquation(currentVar + "_1", superState, AStartingState, ARegion)
            right.transformEquation(currentVar + "_2", superState, BStartingState, BRegion)
    
            region.states += mainState
    
            val secState = scc.createState => [
                id = ""
                label = id
            ]
    
            region.states += secState
    
            scc.createTransition => [
                effects += assignBinaryExpression(currentVar, expression)
                immediate = true
                targetState = secState
                mainState.outgoingTransitions += it
            ]
    
            val ret = new ArrayList<State>
            ret.add(secState)
            ret
        }
        
        def private assignBinaryExpression(String currentVar, Expression expression) {
            if (expression instanceof Or)
                createAssignment(VO.get(currentVar), or(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
            else if (expression instanceof And)
                createAssignment(VO.get(currentVar), and(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
            else if (expression instanceof Plus)
                createAssignment(VO.get(currentVar), add(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
            else if (expression instanceof Minus)
                createAssignment(VO.get(currentVar), sub(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
            else if (expression instanceof Mul)
                createAssignment(VO.get(currentVar), mult(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
//            else if (expression instanceof Div)
//                createAssignment(VO.get(currentVar), div(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference))
            else if (expression instanceof Comparison) {
                val expr = expression as Comparison
                val eqExpr = eq(VO.get(currentVar+"_1").reference, VO.get(currentVar+"_2").reference)
                if (expr.op == "=")
                    createAssignment(VO.get(currentVar), eqExpr)
                else if (expression instanceof Mul)
                    createAssignment(VO.get(currentVar), not(eqExpr))
            }
                
  
        }
        
        def private transformIfThenElseExpression(IfThenElse expression, String currentVar, State superState, State previousState, ControlflowRegion region) {
            val ifState = previousState
            val ifRegion =  scc.createControlflowRegion => [
                id = serializer.serialize(expression.ifexpr)
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
                id = serializer.serialize(expression.thenexpr)
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
                id = serializer.serialize(expression.elseexpr)
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
            
            val ret = new ArrayList<State>
            ret.add(thenState)
            ret.add(elseState)
            ret

        }
        
        def private transformArrowExpression(Arrow expression, String currentVar, State superState, State previousState, ControlflowRegion region) {
            
            val mainState = previousState
            
            val mainRegion =  scc.createControlflowRegion => [
                id = serializer.serialize(expression.left)
                label = id
                mainState.regions += it
            ]
                val mainStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                mainRegion.states += it
            ]
            expression.left.transformEquation(currentVar, superState, mainStartingState, mainRegion)
            
            
            val secState = scc.createState => [
                label = ""
                id = label
            ]
            val secRegion =  scc.createControlflowRegion => [
                id = serializer.serialize(expression.right)
                label = id
                secState.regions += it
            ]
                val secStartingState = scc.createState => [
                id = ""
                label = id
                initial = true
                secRegion.states += it
            ]
            expression.right.transformEquation(currentVar, superState, secStartingState, secRegion)
            region.states += secState
            
            scc.createTransition => [
                targetState = secState
                mainState.outgoingTransitions += it
            ]
            
            scc.createTransition => [
                targetState = secState
                secState.outgoingTransitions += it
            ]
            
            val ret = new ArrayList<State>
            ret
        }
        
        
        def private addDeclaration(State s, String name, String varType, String type) {
            
        }
        
        private def scc() {
            SCChartsFactory::eINSTANCE
        }
        
        private def kex() {
            KExpressionsFactory::eINSTANCE
        }
    }
