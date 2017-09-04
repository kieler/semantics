package de.cau.cs.kieler.lustre.validation

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * @author cpa
 */
class LustreValidator extends AbstractLustreValidator {

//    public static val ALREADY_DEFINED = "alreadyDefined"
//    public static val TYPE_MISMATCH = "TypeMismatch"
//
//    @Inject
//    extension ExpressionTyper
//
//    def private checkExpectedBoolean(Expression expr, EReference reference) {
//        checkExpectedType(expr, ExpressionTyper.BOOL_TYPE, reference)
//    }
//
//    def private checkExpectedNum(Expression expr, EReference reference) {
//        val actualType = getTypeAndCheckNotNull(expr, reference)
//        if (actualType != ExpressionTyper.FLOAT_TYPE || actualType != ExpressionTyper.INT_TYPE)
//            error("expected numeric type, but was " + actualType, reference, TYPE_MISMATCH)
//    }
//
//    def private checkExpectedType(Expression exp, ExpressionType expectedType, EReference reference) {
//        val actualType = getTypeAndCheckNotNull(exp, reference)
//        if (actualType != expectedType)
//            error("expected " + expectedType + " type, but was " + actualType, reference, TYPE_MISMATCH)
//    }
//
//    def private ExpressionType getTypeAndCheckNotNull(Expression exp, EReference reference) {
//        var type = exp.typeExpression
//        if (type === null)
//            error("null type", reference, TYPE_MISMATCH)
//        return type;
//    }
//
//    def private ExpressionType getTypeAndCheckNotNull(Variable_Declaration variable, EReference reference) {
//        var type = variable.typeDeclaration
//        if (type === null)
//            error("null type", reference, TYPE_MISMATCH)
//        return type;
//    }
//
//    def private ExpressionType getTypeAndCheckNotNull(Constant_Declaration constant, EReference reference) {
//        var type = constant.typeDeclaration
//        if (type === null)
//            error("null type", reference, TYPE_MISMATCH)
//        return type;
//    }
//
//    def private checkExpectedSame(ExpressionType left, ExpressionType right) {
//        if (right !== null && left !== null && right != left) {
//            error("expected the same type, but was " + left + ", " + right,
//                LustrePackage.Literals.EQUALITY.getEIDAttribute(), TYPE_MISMATCH)
//        }
//    }
//
//    @Check
//    def checkType(Not not) {
//        checkExpectedBoolean(not.expression, LustrePackage.Literals.NOT__EXPRESSION)
//    }
//
//    @Check
//    def checkType(And and) {
//        checkExpectedBoolean(and.left, LustrePackage.Literals.AND__LEFT)
//        checkExpectedBoolean(and.right, LustrePackage.Literals.AND__RIGHT)
//    }
//
//    @Check
//    def checkType(Or or) {
//        checkExpectedBoolean(or.left, LustrePackage.Literals.OR__LEFT)
//        checkExpectedBoolean(or.left, LustrePackage.Literals.OR__RIGHT)
//    }
//
//    @Check
//    def checkType(UMinus minus) {
//        checkExpectedNum(minus.expression, LustrePackage.Literals.UMINUS__EXPRESSION)
//    }
//
//    @Check
//    def checkType(Equality equality) {
//        val leftType = getTypeAndCheckNotNull(equality.left, LustrePackage.Literals.EQUALITY__LEFT)
//        val rightType = getTypeAndCheckNotNull(equality.right, LustrePackage.Literals.EQUALITY__RIGHT)
//        checkExpectedSame(leftType, rightType)
//    }
//
//    @Check
//    def checkType(Comparison comparison) {
//        checkExpectedNum(comparison.left, LustrePackage.Literals.COMPARISON__LEFT)
//        checkExpectedNum(comparison.right, LustrePackage.Literals.COMPARISON__RIGHT)
//    }
//
//    @Check
//    def checkType(Plus plus) {
//        checkExpectedNum(plus.left, LustrePackage.Literals.PLUS__LEFT)
//        checkExpectedNum(plus.right, LustrePackage.Literals.PLUS__RIGHT)
//    }
//
//    @Check
//    def checkType(Minus minus) {
//        checkExpectedNum(minus.left, LustrePackage.Literals.MINUS__LEFT)
//        checkExpectedNum(minus.right, LustrePackage.Literals.MINUS__RIGHT)
//    }
//
//    @Check
//    def checkType(Mul mul) {
//        checkExpectedNum(mul.left, LustrePackage.Literals.MUL__LEFT)
//        checkExpectedNum(mul.right, LustrePackage.Literals.MUL__RIGHT)
//    }
//
//    @Check
//    def checkType(Div div) {
//        checkExpectedNum(div.left, LustrePackage.Literals.DIV__LEFT)
//        checkExpectedNum(div.right, LustrePackage.Literals.DIV__RIGHT)
//    }
//
//    @Check
//    def checkType(IfThenElse ifthenelse) {
//        checkExpectedBoolean(ifthenelse.ifexpr, LustrePackage.Literals.IF_THEN_ELSE__IFEXPR)
//        val thenType = getTypeAndCheckNotNull(ifthenelse.thenexpr, LustrePackage.Literals.IF_THEN_ELSE__THENEXPR)
//        val elseType = getTypeAndCheckNotNull(ifthenelse.elseexpr, LustrePackage.Literals.IF_THEN_ELSE__ELSEEXPR)
//        checkExpectedSame(thenType, elseType)
//    }
//
//    @Check
//    def checkType(Arrow arrow) {
//        val leftType = getTypeAndCheckNotNull(arrow.left, LustrePackage.Literals.ARROW__LEFT)
//        val rightType = getTypeAndCheckNotNull(arrow.right, LustrePackage.Literals.ARROW__RIGHT)
//        checkExpectedSame(leftType, rightType)
//    }
//
//    @Check
//    def checkType(Fby fby) {
//        val leftType = getTypeAndCheckNotNull(fby.left, LustrePackage.Literals.FBY__LEFT)
//        val rightType = getTypeAndCheckNotNull(fby.right, LustrePackage.Literals.FBY__RIGHT)
//        checkExpectedSame(leftType, rightType)
//    }
//
//    @Check
//    def checkType(Equation equation) {
//        val leftType = getTypeAndCheckNotNull(equation.left, LustrePackage.Literals.EQUATION__LEFT)
//        val rightType = getTypeAndCheckNotNull(equation.right, LustrePackage.Literals.EQUATION__RIGHT)
//        checkExpectedSame(leftType, rightType)
//    }
//
//    @Check
//    def CheckType(Constant_Declaration constant) {
//        if (constant.expr !== null) {
//            val leftType = getTypeAndCheckNotNull(constant, LustrePackage.Literals.EQUATION__LEFT)
//            val rightType = getTypeAndCheckNotNull(constant.expr, LustrePackage.Literals.CONSTANT_DECLARATION__EXPR)
//            checkExpectedSame(leftType, rightType)
//        }
//
//    }
//
//    @Check
//    def checkDefinitions(Node_Declaration node) {
//        val definedVariables = new HashSet<Variable_Declaration>
//
//        for (Variable_Declaration decl : node.parameters) {
//            definedVariables.add(decl)
//        }
//
//        for (Equation equation : node.equations) {
//            if (definedVariables.contains(equation.left))
//                error("Variable '" + equation.left.name + "' was already defined", equation,
//                    LustrePackage.Literals.EQUATION__LEFT, ALREADY_DEFINED)
//            else
//                definedVariables.add(equation.left)
//        }
//
//    }
//    
//    @Check
//    def checkCycles(Node_Declaration node) {
//        
//    }
//
//    @Check
//    def checkNodeHeaders(Package_Provided header) {
//        // TODO
//    }
}
