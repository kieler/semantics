package de.cau.cs.kieler.sccharts.ptx.xmi;
import static org.junit.Assert.*;

import org.junit.Test;

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
 
/**
 * @author delphino
 *
 */
public class UMLActionExpressionTest {

    boolean check(String input, String output) {
        UMLActionExpression parsed = UMLActionExpression.parse(input);
        String serialized = UMLActionExpression.serialize(parsed);
        if (serialized.equals(output)) {
            System.out.println("OK  INPUT='" + input + "',  OUTPUT='" + serialized + "', EXPECTED='"
                    + output + "' (expected)");
            return true;
        } else {
            System.out.println("NOK INPUT='" + input + "',  OUTPUT='" + serialized + "', EXPECTED='"
                    + output + "' (expected)");
            fail("NOK INPUT='" + input + "',  OUTPUT='" + serialized + "', EXPECTED='" + output
                    + "' (expected)");
        }
        return false;
    }

    @Test
    public void testAddSimple() {
        check("1+2", "1+2");
    }

    @Test
    public void testAddMultChar1() {
        check("1234+2", "1234+2");
    }

    @Test
    public void testAddMultChar2() {
        check("1+234", "1+234");
    }

    @Test
    public void testAddMultChar3() {
        check("12345+234", "12345+234");
    }

    @Test
    public void testMultAdd1() {
        check("1+2+3+4", "1+2+3+4");
    }

    @Test
    public void testMultAdd2() {
        check("111+222+3+4444", "111+222+3+4444");
    }

    @Test
    public void testAddPar() {
        check("(1+2)", "1+2");
    }

    @Test
    public void testPower() {
        check("1^2", "1^2");
    }

    @Test
    public void testBindAddMult() {
        check("1+2*3", "1+(2*3)");
    }

    @Test
    public void testBindAddMultPar() {
        check("(1+2*3)", "1+(2*3)");
    }

    @Test
    public void testBindAddMultAdd() {
        check("1+2*3+4", "1+((2*3)+4)");
    }

    @Test
    public void testBindAddMult2() {
        check("0+1+2*3", "0+1+(2*3)");
    }

    @Test
    public void testBindAddMult3() {
        check("0+1+2*3*4", "0+1+(2*3*4)");
    }

    @Test
    public void testBindAddMult4() {
        check("0+1+2*3*4^9", "0+1+(2*3*(4^9))");
    }

    @Test
    public void testBindAddMult5() {
        check("00+11+22*33*44^99", "00+11+(22*33*(44^99))");
    }

    @Test
    public void testBindAddMultRevers() {
        check("1*2+3", "(1*2)+3");
    }

    @Test
    public void testBindPower1() {
        check("1^2*3", "(1^2)*3");
    }

    @Test
    public void testBindPower2() {
        check("1*1^2", "1*(1^2)");
    }

    @Test
    public void testEquals() {
        check("1==2", "1==2");
    }

    @Test
    public void testEquals2() {
        check("1==2+3", "1==(2+3)");
    }

    @Test
    public void testEquals3() {
        check("1+2==2+3", "(1+2)==(2+3)");
    }

    @Test
    public void testAssign() {
        check("a=b", "a=b");
    }

    @Test
    public void testAssign2() {
        check("1+2=2+3", "(1+2)=(2+3)");
    }

    @Test
    public void testAssign3() {
        check("a=b+c", "a=(b+c)");
    }

    @Test
    public void testIncrement() {
        check("a++", "a++");
    }

    @Test
    public void testDecrement() {
        check("a--", "a--");
    }

    @Test
    public void testIncrementAssign() {
        check("b=a++", "b=(a++)");
    }

    @Test
    public void testDoubleIncrement() {
        check("a++++", "(a++)++");
    }

    @Test
    public void testDoubleIncrement2() {
        check("(a++)++", "(a++)++");
    }

    @Test
    public void testDoubleIncrementAssign() {
        check("b=(a++)++", "b=((a++)++)");
    }

    @Test
    public void testIncrementMult() {
        check("a++*5", "(a++)*5");
    }

    @Test
    public void testIncrementMult2() {
        check("a++++*5", "((a++)++)*5");
    }

    @Test
    public void testBinding1() {
        check("3 + 4 * 2 + 3", "3+((4*2)+3)");
    }

    @Test
    public void testBinding2() {
        check("(3 + 4 * 2)", "3+(4*2)");
    }

    @Test
    public void testBinding3() {
        check("3 + 4 * 2", "3+(4*2)");
    }

    @Test
    public void testBinding4() {
        check("3 + 4 * 2 ^ 3", "3+(4*(2^3))");
    }

    @Test
    public void testBinding5() {
        check("3 * 4 + 2 ", "(3*4)+2");
    }

    @Test
    public void testBinding6() {
        check("3 * 4 + 2 * 3", "(3*4)+(2*3)");
    }

    @Test
    public void testBinding7() {
        check("(3 * 4 + 2)", "(3*4)+2");
    }

    @Test
    public void testBinding8() {
        check("3 ^ 4 * 2 + 3", "((3^4)*2)+3");
    }

    @Test
    public void testNot() {
        check("!a", "!a");
    }

    @Test
    public void testNot2() {
        check("!(a+b)", "!(a+b)");
    }

    @Test
    public void testNot3() {
        check("!a+b", "!a+b");
    }

    @Test
    public void testNot4() {
        check("c=(!a)", "c=(!a)");
    }

    @Test
    public void testNot5() {
        check("!a++", "!a++");
    }

    @Test
    public void testNot6() {
        check("c=!a", "c=!a");
    }

    @Test
    public void testNot7() {
        check("c=!a", "c=!a");
    }

    @Test
    public void testNot8() {
        check("c=!a", "c=!a");
    }

    @Test
    public void testNot9() {
        check("c= !a+b", "c=(!a+b)");
    }

    @Test
    public void testEquals1() {
        check("c==a", "c==a");
    }

    @Test
    public void testEqualsIncrement() {
        check("c==a++", "c==(a++)");
    }

    @Test
    public void testEqualsAssign() {
        check("c==a=b", "c==(a=b)");
    }

    @Test
    public void testEqualsAssignIncrement() {
        check("c==a++=b", "c==((a++)=b)");
    }

    @Test
    public void testLists() {
//        UMLActionExpression expr = UMLActionExpression.parse("c==a++=b");
//            fail("");
    }


}
