package de.cau.cs.kieler.sccharts.ptx.xmi;

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author cmot
 *
 */
public class UMLActionExpression {

    public static void main(String[] args) {
        // UMLActionExpression exp = UMLActionExpression.parse("1=((1+2)*3)");
        UMLActionExpression expr = UMLActionExpression.parse("b=(a++1)+42+f"); // ((1*2)+3)

        // UMLActionExpression expr = UMLActionExpression.parse("c==a++=b");
        System.out.println("> --- ALL ---");
        for (UMLActionExpression item : expr.getAllEntities()) {
            System.out.println("> " + item.name);
        }

        System.out.println("> --- ASSIGNED ---");
        for (UMLActionExpression item : expr.getAssignedEntities()) {
            System.out.println("> " + item.name);
        }

        System.out.println("> --- REFRENCED ---");
        for (UMLActionExpression item : expr.getReferencedEntities()) {
            System.out.println("> " + item.name);
        }

        System.out.println(expr.serialize());
    }

    enum Operator {
        // &&, ||, +, -, *, /, ++, --, %, = , ==, ^, NOT, BASE
        AND, OR, ADD, SUB, MULT, DIV, INC, DEC, MOD, ASSIGN, EQUALS, POWER, NOT, BASE
    }

    enum Type {
        OPERATOREXPRESSION, VAREXPRESSION
    }

    public String name = null;
    public Operator operator = null;
    public boolean neg = false;
    public Type type = null;
    public List<UMLActionExpression> subExpressions = new ArrayList<UMLActionExpression>();

    // ------------------------------------------------------------------------

    /**
     * Constructore
     */
    public UMLActionExpression() {
    }

    private String getOperatorString() {
        return getOperatorString(operator);
    }

    public String serialize() {
        return serialize(this);
    }

    public int getOperatorPriority() {
        return getOperatorPriority(operator);
    }

    public boolean isOperatorPrefixed() {
        return (isOperatorPrefixed(operator));
    }

    public boolean isOperatorPostfixed() {
        return (isOperatorPostfixed(operator));
    }

    public boolean isEntity() {
        return isEntity(this);
    }

    // ------------------------------------------------------------------------

    // Cache the list results
    List<UMLActionExpression> returnListAssigned = null;
    List<UMLActionExpression> returnListReferenced = null;
    List<UMLActionExpression> returnListAll = null;

    public List<UMLActionExpression> getReferencedEntities() {
        if (returnListAll == null) {
            rebuildReturnLists();
        }
        return returnListReferenced;
    }

    public List<UMLActionExpression> getAssignedEntities() {
        if (returnListAll == null) {
            rebuildReturnLists();
        }
        return returnListAssigned;
    }

    public List<UMLActionExpression> getAllEntities() {
        if (returnListAll == null) {
            rebuildReturnLists();
        }
        return returnListAll;
    }

    private void rebuildReturnLists() {
        returnListAssigned = new ArrayList<UMLActionExpression>();
        returnListReferenced = new ArrayList<UMLActionExpression>();
        returnListAll = new ArrayList<UMLActionExpression>();
        searchEntities(returnListAssigned, returnListReferenced, this);
        // Calculate sum list
        for (UMLActionExpression item : returnListReferenced) {
            if (!returnListAll.contains(item)) {
                returnListAll.add(item);
            }
        }
        for (UMLActionExpression item : returnListAssigned) {
            if (!returnListAll.contains(item)) {
                returnListAll.add(item);
            }
        }
    }

    private void invalidateReturnLists() {
        returnListAssigned = null;
        returnListReferenced = null;
        returnListAll = null;
    }

    private void searchEntities(List<UMLActionExpression> returnListAssigned,
            List<UMLActionExpression> returnListReferenced, UMLActionExpression expression) {
        if (expression.type == UMLActionExpression.Type.VAREXPRESSION) {
            if (isEntity(expression)) {
                if (!returnListReferenced.contains(expression)) {
                    returnListReferenced.add(expression);
                }
            }
        } else {
            // Left side
            boolean skipFirstAssigned = false;
            if (expression.operator == UMLActionExpression.Operator.ASSIGN) {
                UMLActionExpression leftSide = expression.subExpressions.get(0);
                // Add left side
                if (isEntity(leftSide)) {
                    if (!returnListAssigned.contains(leftSide)) {
                        returnListAssigned.add(leftSide);
                        skipFirstAssigned = true;
                    }
                }
            }
            if (expression.operator == UMLActionExpression.Operator.INC
                    || expression.operator == UMLActionExpression.Operator.DEC) {
                UMLActionExpression leftSide = expression.subExpressions.get(0);
                // Add left side
                if (isEntity(leftSide)) {
                    if (!returnListAssigned.contains(leftSide)) {
                        returnListAssigned.add(leftSide);
                    }
                    if (!returnListReferenced.contains(leftSide)) {
                        returnListReferenced.add(leftSide);
                    }
                }
            }
            for (UMLActionExpression subExpression : expression.subExpressions) {
                if (!skipFirstAssigned) {
                    searchEntities(returnListAssigned, returnListReferenced, subExpression);
                } else {
                    skipFirstAssigned = false;
                }
            }
        }
    }

    public static int getInteger(String expressionString) {
        try {
            int i = Integer.parseInt(expressionString);
            return i;
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean isEntity(String expressionString) {
        try {
            int i = Integer.parseInt(expressionString);
            return (!(expressionString.equals(i + "")));
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean isEntity(UMLActionExpression expression) {
        if (expression.type == UMLActionExpression.Type.VAREXPRESSION) {
            return isEntity(expression.name);
        }
        return false;
    }

    // ------------------------------------------------------------------------

    private static int getOperatorPriority(Operator operator) {
        if (operator == UMLActionExpression.Operator.EQUALS) {
            return 1; // ==
        }
        if (operator == UMLActionExpression.Operator.ASSIGN) {
            return 2; // =
        }
        if (operator == UMLActionExpression.Operator.ADD) {
            return 3; // &&
        }
        if (operator == UMLActionExpression.Operator.SUB) {
            return 4; // -
        }
        if (operator == UMLActionExpression.Operator.OR) {
            return 5; // ||
        }
        if (operator == UMLActionExpression.Operator.AND) {
            return 6; // &&
        }
        if (operator == UMLActionExpression.Operator.DIV) {
            return 7; // /
        }
        if (operator == UMLActionExpression.Operator.MULT) {
            return 8; // *
        }
        if (operator == UMLActionExpression.Operator.DEC) {
            return 9; // --
        }
        if (operator == UMLActionExpression.Operator.INC) {
            return 10; // ++
        }
        if (operator == UMLActionExpression.Operator.MOD) {
            return 11; // %
        }
        if (operator == UMLActionExpression.Operator.POWER) {
            return 12; // ^
        }
        if (operator == UMLActionExpression.Operator.NOT) {
            return 13; // !
        }
        return 0;
    }

    private static Operator getOperator(String operatorString) {
        if (operatorString.equals("+")) {
            return UMLActionExpression.Operator.ADD;
        }
        if (operatorString.equals("&&")) {
            return UMLActionExpression.Operator.AND;
        }
        if (operatorString.equals("=")) {
            return UMLActionExpression.Operator.ASSIGN;
        }
        if (operatorString.equals("--")) {
            return UMLActionExpression.Operator.DEC;
        }
        if (operatorString.equals("/")) {
            return UMLActionExpression.Operator.DIV;
        }
        if (operatorString.equals("==")) {
            return UMLActionExpression.Operator.EQUALS;
        }
        if (operatorString.equals("++")) {
            return UMLActionExpression.Operator.INC;
        }
        if (operatorString.equals("%")) {
            return UMLActionExpression.Operator.MOD;
        }
        if (operatorString.equals("*")) {
            return UMLActionExpression.Operator.MULT;
        }
        if (operatorString.equals("||")) {
            return UMLActionExpression.Operator.OR;
        }
        if (operatorString.equals("*")) {
            return UMLActionExpression.Operator.SUB;
        }
        if (operatorString.equals("^")) {
            return UMLActionExpression.Operator.POWER;
        }
        if (operatorString.equals("!")) {
            return UMLActionExpression.Operator.NOT;
        }
        return null;
    }

    private static String getOperatorString(Operator operator) {
        if (operator == UMLActionExpression.Operator.ADD) {
            return "+";
        }
        if (operator == UMLActionExpression.Operator.AND) {
            return "&&";
        }
        if (operator == UMLActionExpression.Operator.ASSIGN) {
            return "=";
        }
        if (operator == UMLActionExpression.Operator.DEC) {
            return "--";
        }
        if (operator == UMLActionExpression.Operator.DIV) {
            return "/";
        }
        if (operator == UMLActionExpression.Operator.EQUALS) {
            return "==";
        }
        if (operator == UMLActionExpression.Operator.INC) {
            return "++";
        }
        if (operator == UMLActionExpression.Operator.MOD) {
            return "%";
        }
        if (operator == UMLActionExpression.Operator.MULT) {
            return "*";
        }
        if (operator == UMLActionExpression.Operator.OR) {
            return "||";
        }
        if (operator == UMLActionExpression.Operator.SUB) {
            return "-";
        }
        if (operator == UMLActionExpression.Operator.POWER) {
            return "^";
        }
        if (operator == UMLActionExpression.Operator.NOT) {
            return "!";
        }
        return "";
    }

    public boolean isOperatorPrefixed(Operator operator) {
        return (operator == UMLActionExpression.Operator.NOT);
    }

    public boolean isOperatorPostfixed(Operator operator) {
        return ((operator == UMLActionExpression.Operator.INC)
                || (operator == UMLActionExpression.Operator.DEC));
    }

    /**
     * Check if the character is an operator
     * 
     * @param character
     * @return
     */
    private static boolean isOpCharacter(char character) {
        return ((character == '^') || (character == '&') || (character == '|') || (character == '+')
                || (character == '-') || (character == '*') || (character == '/')
                || (character == '%') || (character == '='));
    }

    private static boolean isVarCharacter(char character) {
        return (!(character == ' ') || (character == '(') || (character == ')')
                || isOpCharacter(character));
    }

    // ------------------------------------------------------------------------
    // ------------------------------------------------------------------------
    
    public static UMLActionExpression parse(String text) {

        // Append a space character to ease end of var detection
        // Otherwise one would need to consider both cases:
        // 1. one-character-vars
        // 2. ending of multy-character-vars
        text = text + " ";

        // long start = System.currentTimeMillis();

        Stack<UMLActionExpression> stack = new Stack<UMLActionExpression>();
        boolean var = false;
        boolean op = false;
        boolean comment = false; // is true after the first "
        int invisibleParanthesisCounter = 0; // counts extra bindings
        boolean nextNeg = false; // if true, the next new Expression is turned neg

        StringBuilder varPart = new StringBuilder();
        StringBuilder opPart = new StringBuilder();
        StringBuilder commentPart = new StringBuilder();

        char[] chars = null;

        // Field field = (Field) String.class.getField("value");
        Class<String> c = String.class;
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true); // bye-bye "private"

            // ALthough String.class.getField("value") throws a
            // NoSuchField exception, this way works, alas.
            if ("value" == f.getName()) {
                try {
                    chars = (char[]) f.get(text);
                } catch (Exception e) {
                    return null;
                }
                break;
            }
        }
        // Create surrounding dummy-element of type XMIModel
        UMLActionExpression baseExpression = new UMLActionExpression();
        baseExpression.name = "EXPRESSION";
        baseExpression.type = UMLActionExpression.Type.OPERATOREXPRESSION;
        baseExpression.operator = UMLActionExpression.Operator.BASE;
        stack.push(baseExpression);

        int len = chars.length;
        for (int i = 0; i < len; i++) {
            boolean lastChar = (i == len - 1);
            char character = chars[i];
            char nextCharacter = ' ';
            char lastCharacter = ' ';
            if (!lastChar) {
                nextCharacter = chars[i + 1];
            }
            if (i > 0) {
                lastCharacter = chars[i - 1];
            }
            boolean skip = false;

            if (character == ' ') {
                skip = true;
            }

            boolean isOpCharacter = false;
            if (!skip) {
                isOpCharacter = isOpCharacter(character);
            }

            if (character == '!') {
                // Just insert another hierarchy layer
                nextNeg = !nextNeg;
                skip = true;
            }

            boolean opChanged = false || ((opPart.length() == 2) && (character != ')'));
            if ((!skip || lastChar) && !comment && op
                    && (!isOpCharacter || character == ')' || lastChar || (opPart.length() == 2))) {
                // End of op
                op = false;
                String opPartString = opPart.toString();
                opPart = new StringBuilder();

                Operator newOperator = getOperator(opPartString);

                if (stack.peek().operator == null) {
                    // Not yet set operator, so set it
                    stack.peek().operator = newOperator;
                }

                opChanged = opChanged || !stack.peek().getOperatorString().equals(opPartString);
                if (opChanged) {
                    // Now must consider two cases,
                    // 1. new op has higher prio => bind last expression in new subsub expression ..
                    // like (
                    // 2. new op has lower prio => close subsub expression ... like )
                    // throw new RuntimeException("UNSUPPORTED: Expression shall be parenthesized
                    // completely.");
                    // TODO: Implement this (s.a.)
                    UMLActionExpression lastExpression = stack.peek();
                    if (lastExpression.getOperatorPriority() < getOperatorPriority(newOperator)) {
                        // 3 + 4 * 2 + 3
                        // (3 + 4 * 2)
                        // 3 + 4 * 2
                        // 3 + 4 * 2 ^ 3 --> 3 + ((4 * 2) ^ 3)

                        // OPEN NEW
                        invisibleParanthesisCounter++;
                        UMLActionExpression subExpression = new UMLActionExpression();
                        subExpression.type = UMLActionExpression.Type.OPERATOREXPRESSION;

                        // Get the last subExpression and move it to this new expression
                        UMLActionExpression curentExp = stack.peek();
                        if (newOperator != UMLActionExpression.Operator.NOT) {
                            if (curentExp.subExpressions.size() < 1) {
                                throw new RuntimeException(
                                        "ERROR: Expression error, subexpression must exist");
                            }
                            UMLActionExpression lastExp = curentExp.subExpressions
                                    .get(curentExp.subExpressions.size() - 1);
                            subExpression.subExpressions.add(lastExp);
                            curentExp.subExpressions.remove(lastExp);
                        }

                        subExpression.operator = newOperator;

                        // Add a new operator subexpression to current expression's subExpressions
                        stack.peek().subExpressions.add(subExpression);
                        // Then go into it by making it the current expression
                        stack.push(subExpression);
                        opChanged = false; // handled this case, do not reset for the 'else'-case
                    } else {
                        // 3 * 4 + 2 --> (3 * 4) + 2
                        // 3 * 4 + 2 * 3
                        // (3 * 4 + 2)
                        // 3 ^ 4 * 2 + 3 --> ((3^4) * 2) + 3)

                        // OPEN NEW
                        UMLActionExpression subExpression = new UMLActionExpression();
                        subExpression.type = UMLActionExpression.Type.OPERATOREXPRESSION;

                        // Get the last subExpression and move it to this new expression
                        UMLActionExpression curentExp = stack.peek();
                        stack.pop();

                        stack.peek().subExpressions.remove(curentExp);
                        stack.peek().subExpressions.add(subExpression);

                        stack.push(subExpression);

                        subExpression.operator = newOperator;
                        subExpression.subExpressions.add(curentExp);

                        opChanged = false; // handled this case, do not reset for the 'else'-case
                    }
                }
                // skip = true;
            }

            if ((!skip || lastChar) && !comment && var
                    && (isOpCharacter || character == ')' || lastChar)) {
                // End of var
                var = false;

                // Add new variable expression
                UMLActionExpression varExpression = new UMLActionExpression();
                varExpression.type = UMLActionExpression.Type.VAREXPRESSION;
                varExpression.name = varPart.toString();
                stack.peek().subExpressions.add(varExpression);

                if (nextNeg) {
                    varExpression.neg = true;
                    nextNeg = false;
                }

                varPart = new StringBuilder();
                // skip = true;
            }

            if (!comment && character == '(') {
                // Open new hierarchy level
                UMLActionExpression subExpression = new UMLActionExpression();
                subExpression.type = UMLActionExpression.Type.OPERATOREXPRESSION;
                // Add a new operator subexpression to current expression's subExpressions
                stack.peek().subExpressions.add(subExpression);
                // Then go into it by making it the current expression
                stack.push(subExpression);

                if (nextNeg) {
                    stack.peek().neg = true;
                    nextNeg = false;
                }
                skip = true;
            }

            if (!comment) {
                if (character == ')' || opChanged
                        || ((invisibleParanthesisCounter > 0) && lastChar)) {

                    invisibleParanthesisCounter = 0;
                    // while (invisibleParanthesisCounter > 0) {
                    // invisibleParanthesisCounter--;
                    // }
                    // Close hierarchy level
                    stack.pop();
                    if (character == ')') {
                        skip = true;
                    }
                }
            }

            if (!skip && !comment && !var & !op && isOpCharacter) {
                // start op
                op = true;
            }
            if (!skip && !comment && !var & !op && !isOpCharacter) {
                // start variable
                var = true;
            }

            // Append
            if (!skip && var) {
                varPart.append(character);
            }
            if (!skip && op) {
                opPart.append(character);
            }
            if (!skip && comment) {
                commentPart.append(character);
            }
        }

        // long end = System.currentTimeMillis();
        // System.out.println("XMIModel parsed in " + (end - start) + " Milliseconds.");

        return baseExpression;
    }

    // ------------------------------------------------------------------------

    public static String serialize(UMLActionExpression umlActionExpression) {
        String returnString = serializeHelper(umlActionExpression);
        // The outermost ( )
        if (umlActionExpression.neg) {
            returnString = "!" + returnString;
        }
        if (returnString.startsWith("(") && returnString.endsWith(")")) {
            returnString = returnString.substring(1, returnString.length() - 1);
        }
        return returnString;
    }

    public static String serializeHelper(UMLActionExpression umlActionExpression) {
        if (umlActionExpression.type == UMLActionExpression.Type.VAREXPRESSION) {
            if (umlActionExpression.neg) {
                return "!" + umlActionExpression.name;
            } else {
                return umlActionExpression.name;
            }
        } else if (umlActionExpression.operator == UMLActionExpression.Operator.BASE
                && (umlActionExpression.subExpressions.size() > 0)) {
            return serializeHelper(umlActionExpression.subExpressions.get(0));
        } else {
            StringBuilder appendString = new StringBuilder();

            boolean postFixed = umlActionExpression.isOperatorPostfixed();
            String opString = umlActionExpression.getOperatorString();
            int numSubexpressions = umlActionExpression.subExpressions.size();
            for (int c = 0; c < numSubexpressions; c++) {
                UMLActionExpression subExpresion = umlActionExpression.subExpressions.get(c);
                appendString.append(serializeHelper(subExpresion));
                if (c < numSubexpressions - 1) {
                    appendString.append(opString);
                }
            }
            if (postFixed) {
                appendString.append(opString);
            }

            String toAppend = appendString.toString();
            // if (!fullParenthesis && (toAppend.startsWith("(") && toAppend.endsWith(")"))) {
            // return toAppend;
            // }
            // else {
            StringBuilder returnString = new StringBuilder();
            if (umlActionExpression.neg) {
                returnString.append("!");
            }
            returnString.append("(");
            returnString.append(toAppend);
            returnString.append(")");
            return returnString.toString();
            // }
        }
    }

    // ------------------------------------------------------------------------

}
