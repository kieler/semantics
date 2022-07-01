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
package de.cau.cs.kieler.sccharts.ui.synthesis.filtering;

import de.cau.cs.kieler.klighd.filtering.*;

/**
 * Contains semantic filter rules for SCCharts.
 * 
 * @author stu215592
 */
public class SCChartsSemanticFilterRules {
    /** Rule to exclude elements that are states. */
    public static final SemanticFilterRule NO_STATES =
            new NegationConnective(SCChartsSemanticFilterTags.STATE, "Don't Show States");
    /** Rule to exclude elements that are regions. */
    public static final SemanticFilterRule NO_REGIONS =
            new NegationConnective(SCChartsSemanticFilterTags.REGION, "Don't Show Regions");

    /** Rule to exclude elements that are simple states. */
    public static final SemanticFilterRule NO_SIMPLE_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.SIMPLE_STATE, "Don't Show Simple States");
    /** Rule to exclude elements that are hierarchical states. */
    public static final SemanticFilterRule NO_HIERARCHICAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.HIERARCHICAL_STATE, "Don't Show Hierarchical States");
    /** Rule to exclude elements that are connector states. */
    public static final SemanticFilterRule NO_CONNECTOR_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.CONNECTOR_STATE, "Don't Show Connector States");
    /** Rule to exclude elements that are controlflow regions. */
    public static final SemanticFilterRule NO_CONTROLFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.CONTROLFLOW_REGION, "Don't Show Controlflow Regions");
    /** Rule to exclude elements that are dataflow regions. */
    public static final SemanticFilterRule NO_DATAFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.DATAFLOW_REGION, "Don't Show Dataflow Regions");

    /** Rule to exclude elements that are initial states. */
    public static final SemanticFilterRule NO_INITIAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.INITIAL_STATE, "Don't Show Initial States");
    /** Rule to exclude elements that are final states. */
    public static final SemanticFilterRule NO_FINAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.FINAL_STATE, "Don't Show Final States");

    /** Rule to exclude elements that are either initial XOR final states. */
    public static final SemanticFilterRule NO_INITIAL_XOR_FINAL_STATE = new NegationConnective(
            new OrConnective(
                    new AndConnective(SCChartsSemanticFilterTags.INITIAL_STATE, NO_FINAL_STATE),
                    new AndConnective(NO_INITIAL_STATE, SCChartsSemanticFilterTags.FINAL_STATE)),
            "Don't Show Initial XOR Final States");
}
