/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testing

import com.google.common.collect.LinkedHashMultimap
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author als
 */
class TestSuite {

    static class Test {
        @Accessors val TestModelData data
        @Accessors val String id
        @Accessors(PUBLIC_GETTER) var CompilationContext context
        
        new(TestModelData data, String id, CompilationContext context) {
            this.data = data
            this.id = id
            this.context = context
        }
        
        def free() {
            this.context = null
        }
    }
    
    val List<Test> tests;
    @Accessors val TestModelCollection testModels
    
    new (TestModelCollection testModels, int numOfTests) {
        this.testModels = testModels
        this.tests = new ArrayList(numOfTests * testModels.models.size)
    }
    
    def add(TestModelData data, String id, CompilationContext context) {
        tests.add(new Test(data, id, context))
    }
    
    def getTests() {
        tests.unmodifiableView
    }
    
    def getTestsByModel() {
        val mm = LinkedHashMultimap.create()
        for (t : tests) {
            mm.put(t.data, t)
        }
        return mm
    }
    
    def getTestsByTest() {
        val mm = LinkedHashMultimap.create()
        for (t : tests) {
            mm.put(t.id, t)
        }
        return mm
    }
}