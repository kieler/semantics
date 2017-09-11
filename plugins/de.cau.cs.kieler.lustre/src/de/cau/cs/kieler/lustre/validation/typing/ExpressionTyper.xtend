//package de.cau.cs.kieler.lustre.validation.typing
//
//import de.cau.cs.kieler.lustre.lustre.And
//import de.cau.cs.kieler.lustre.lustre.Arrow
//import de.cau.cs.kieler.lustre.lustre.BoolConstant
//import de.cau.cs.kieler.lustre.lustre.Comparison
//import de.cau.cs.kieler.lustre.lustre.Constant_Declaration
//import de.cau.cs.kieler.lustre.lustre.Current
//import de.cau.cs.kieler.lustre.lustre.Div
//import de.cau.cs.kieler.lustre.lustre.Equality
//import de.cau.cs.kieler.lustre.lustre.Expression
//import de.cau.cs.kieler.lustre.lustre.Fby
//import de.cau.cs.kieler.lustre.lustre.FloatConstant
//import de.cau.cs.kieler.lustre.lustre.IntConstant
//import de.cau.cs.kieler.lustre.lustre.Minus
//import de.cau.cs.kieler.lustre.lustre.Mul
//import de.cau.cs.kieler.lustre.lustre.Not
//import de.cau.cs.kieler.lustre.lustre.Or
//import de.cau.cs.kieler.lustre.lustre.Plus
//import de.cau.cs.kieler.lustre.lustre.Pre
//import de.cau.cs.kieler.lustre.lustre.UMinus
//import de.cau.cs.kieler.lustre.lustre.VariableReference
//import de.cau.cs.kieler.lustre.lustre.Variable_Declaration
//
///**
// * @author cpa
// * 
// */
//class ExpressionTyper {
//
//    public static val FLOAT_TYPE = new FloatType
//    public static val INT_TYPE = new IntType
//    public static val BOOL_TYPE = new BoolType
//    
//    def typeFromString(String s) {
//        if (s == 'bool')
//            BOOL_TYPE
//        else if (s == 'int')
//            INT_TYPE
//        else if (s == 'float')
//            FLOAT_TYPE
//    }
//
//    def isIntType(ExpressionType type) {
//        type === INT_TYPE
//    }
//
//    def isFloatType(ExpressionType type) {
//        type === FLOAT_TYPE
//    }
//
//    def isBoolType(ExpressionType type) {
//        type === BOOL_TYPE
//    }
//
//    def dispatch ExpressionType typeExpression(Expression e) {
//        switch (e) {
//            FloatConstant: FLOAT_TYPE
//            IntConstant: INT_TYPE
//            BoolConstant: BOOL_TYPE
//            Not: BOOL_TYPE
//            Comparison: BOOL_TYPE
//            Equality: BOOL_TYPE
//            And: BOOL_TYPE
//            Or: BOOL_TYPE     
//            Div: FLOAT_TYPE       
//        }
//    }
//    
//    def dispatch ExpressionType typeExpression(Plus plus) {
//        val leftType = plus.left.typeExpression
//        val rightType = plus.right.typeExpression
//        if (leftType == FLOAT_TYPE || rightType == FLOAT_TYPE)
//            FLOAT_TYPE
//        else
//            INT_TYPE
//    }
//    
//    def dispatch ExpressionType typeExpression(Minus minus) {
//        val leftType = minus.left.typeExpression
//        val rightType = minus.right.typeExpression
//        if (leftType == FLOAT_TYPE || rightType == FLOAT_TYPE)
//            FLOAT_TYPE
//        else
//            INT_TYPE
//    }
//    
//    def dispatch ExpressionType typeExpression(Mul mul) {
//        val leftType = mul.left.typeExpression
//        val rightType = mul.right.typeExpression
//        if (leftType == FLOAT_TYPE || rightType == FLOAT_TYPE)
//            FLOAT_TYPE
//        else
//            INT_TYPE
//    }
//    
//    def dispatch ExpressionType typeExpression(UMinus minus) {
//        minus.expression.typeExpression
//    }
//    
//    def dispatch ExpressionType typeExpression(Pre pre) {
//        pre.expression.typeExpression
//    }
//    
//    def dispatch ExpressionType typeExpression(Current current) {
//        current.expression.typeExpression
//    }
//    
//    def dispatch ExpressionType typeExpression(VariableReference ref) {
//        ref.value.type.name.name.typeFromString
//    }
//    
//    def dispatch ExpressionType typeExpression(Arrow arrow) {
//        arrow.left.typeExpression
//    }
//    
//    def dispatch ExpressionType typeExpression(Fby fby) {
//        fby.left.typeExpression
//    }
//    
//    def ExpressionType typeDeclaration(Variable_Declaration variable) {
//        variable.type.name.name.typeFromString
//    }
//    
//    def ExpressionType typeDeclaration(Constant_Declaration constant) {
//        constant.type.name.name.typeFromString
//    }
//
//}
