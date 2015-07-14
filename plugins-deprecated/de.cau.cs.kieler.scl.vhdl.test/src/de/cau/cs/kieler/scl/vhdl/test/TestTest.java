/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.vhdl.test;

import java.util.Collection;
import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author gjohannsen
 *
 */
@RunWith(Parameterized.class)
public class TestTest {

    String str;
    
    /**
     * 
     */
    public TestTest(String str) {
        this.str=str;
    }
    
    @Parameters
    public static Collection<Object[]> getParameters() {
        LinkedList<Object[]> parameters = new LinkedList<Object[]>();
        parameters.add(new String [] {"a"});
        parameters.add(new String [] {"b"});
        
        return parameters;
    }
    
    @Test
    public void testIrgendwas() {
       
        Assert.assertEquals(str ,     
                "a");
    }
     
}
