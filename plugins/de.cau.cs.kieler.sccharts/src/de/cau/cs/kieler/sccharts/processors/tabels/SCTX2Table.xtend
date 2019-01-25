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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import java.util.List

/**
 * @author stu114663
 * 
 */
class SCTX2Table extends ExogenousProcessor<SCCharts, List<List<String>>> {
    @Inject
    var StateTransitionTableBuilder sttb
    @Inject
    var StateEventTableBuilder setb

    final TableType DEFAULT_TABLE_TYPE = TableType.StateTransition

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.SCTX2Table"
    }

    override getName() {
        "SCTX2Table"
    }

    override process() {
        try {
            val SCCharts scc = getModel
            val TableBuilder tb = getBuilder(evaluateTableTypeAnnotations(scc))
            tb.model = scc
            // TODO check for empty model
            model = tb.build

        } catch (Exception exception) {
            // TODO TODO exception is not shown?
            environment.errors.add(exception)
        }
    }

    def TableBuilder getBuilder(TableType type) {
        return switch (type) {
            case StateTransition: sttb
            case StateEvent: setb
        }
    }

    def TableType evaluateTableTypeAnnotations(SCCharts scc) {
        for (rootstate : scc.rootStates) {
            return rootstate.evaluateTableTypeAnnotations
        }
    }

    def TableType evaluateTableTypeAnnotations(Scope scp) {
        val annotationList = scp.annotations
        var TableType type = DEFAULT_TABLE_TYPE
        val stringAnnotations = annotationList.filter[v|v instanceof StringAnnotation]
        for (anno : stringAnnotations) {
            val strA = anno as StringAnnotation
            if (strA.name.equals("TABLETYPE") && !strA.values.empty) {
                type = TableType.valueOf(strA.values.get(0))
            }
        }
        return type
    }
}
