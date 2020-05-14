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
package de.cau.cs.kieler.kicool.processors.analyzers

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.environments.Environment

/**
 * @author als
 */
class LinesOfCodeCounter extends InplaceProcessor<CodeContainer> {
    
    public static val IProperty<Integer> LOC = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.analyzers.loc", 0)
    public static val IProperty<Integer> RAW_LOC = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.analyzers.loc.raw", 0)
    public static val IProperty<String> BLOCK_COMMENT = 
        new Property<String>("de.cau.cs.kieler.kicool.processors.analyzers.loc.comment.block", "(?s)\\s*?/\\*.*?\\*/")
    public static val IProperty<String> LINE_COMMENT = 
        new Property<String>("de.cau.cs.kieler.kicool.processors.analyzers.loc.comment.line", "\\s*//.*")
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.analyzers.loc"
    }
    
    override getName() {
        "LoC Counter"
    }
    
    override process() {
        var loc = 0
        var rawloc = 0
        try {
            for (file : model.files.filter[!library]) {
                if (!file.code.nullOrEmpty) {
                    rawloc += file.code.split("\r\n|\r|\n").size
                    loc += file.code.replaceAll(BLOCK_COMMENT.property, "").split("\r\n|\r|\n").filter[!it.matches(LINE_COMMENT.property) && it.trim.length > 0].size
                }
            }
        } catch (Exception e) {
            environment.warnings.add("Could not count lines of code", e)
        }
        if (rawloc > 0) {
            setProperty(LOC, loc)
            setProperty(RAW_LOC, rawloc)
            environment.getPropertyAndSetIfAbsent(Environment.BENCHMARK_RESULT_KEYS, newArrayList()).addAll(#[LOC.id, RAW_LOC.id])
        }
    }
    
}