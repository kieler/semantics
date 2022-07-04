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
 * @author tik
 */
public class SCChartsSemanticFilterRules {
    // Naming conventions:
    // The names should start with NO_ or ONLY_, indicating
    // which elements are kept out or left in

    /** Rule to exclude elements that are states. */
    public static final SemanticFilterRule NO_STATES =
            new NegationConnective(SCChartsSemanticFilterTags.STATE, "Filter States");
    /** Rule to exclude elements that are regions. */
    public static final SemanticFilterRule NO_REGIONS =
            new NegationConnective(SCChartsSemanticFilterTags.REGION, "Filter Regions");

    /** Rule to exclude elements that are simple states. */
    public static final SemanticFilterRule NO_SIMPLE_STATE =
            new NegationConnective(SCChartsSemanticFilterTags.SIMPLE_STATE, "Filter Simple States");
    /** Rule to exclude elements that are hierarchical states. */
    public static final SemanticFilterRule NO_HIERARCHICAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.HIERARCHICAL_STATE, "Filter Hierarchical States");
    /** Rule to exclude elements that are connector states. */
    public static final SemanticFilterRule NO_CONNECTOR_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.CONNECTOR_STATE, "Filter Connector States");
    /** Rule to exclude elements that are controlflow regions. */
    public static final SemanticFilterRule NO_CONTROLFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.CONTROLFLOW_REGION, "Filter Controlflow Regions");
    /** Rule to exclude elements that are dataflow regions. */
    public static final SemanticFilterRule NO_DATAFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.DATAFLOW_REGION, "Filter Dataflow Regions");

    /** Rule to exclude elements that are initial states. */
    public static final SemanticFilterRule NO_INITIAL_STATE = new AndConnective(
            SCChartsSemanticFilterTags.STATE,
            new NegationConnective(SCChartsSemanticFilterTags.INITIAL), "Filter Initial States");
    /** Rule to exclude elements that are final states. */
    public static final SemanticFilterRule NO_FINAL_STATE = new AndConnective(
            SCChartsSemanticFilterTags.STATE,
            new NegationConnective(SCChartsSemanticFilterTags.FINAL), "Filter Final States");

    /** Rule to exclude elements that are either initial XOR final states. */
    public static final SemanticFilterRule NO_INITIAL_XOR_FINAL_STATE =
            new AndConnective(SCChartsSemanticFilterTags.STATE,
                    new LogicEqualConnective(SCChartsSemanticFilterTags.INITIAL,
                            SCChartsSemanticFilterTags.FINAL),
                    "Filter Initial XOR Final States");

    /** Rule to only include elements that are either initial states or regions. */
    public static final SemanticFilterRule ONLY_INITIAL_STATES_OR_REGIONS =
            new IfThenElseConnective(SCChartsSemanticFilterTags.STATE,
                    SCChartsSemanticFilterTags.INITIAL, SCChartsSemanticFilterTags.REGION,
                    "Filter Everything but Initial States or Regions");

    /** Rule to only include elements that have at least 3 declarations. */
    public static final SemanticFilterRule ONLY_AT_LEAST_3_DECLARATIONS = new OrConnective(
            // 3 < num
            new LessThanConnective(SCChartsSemanticFilterTags.DECLARATIONS(3.0)),
            // 3 == num
            new NumericEqualConnective(SCChartsSemanticFilterTags.DECLARATIONS(3.0)),
            "Filter Elements With Less Than 3 Declarations");

    /** Rule to only include elements that are initial, final or a region. */
    public static final SemanticFilterRule ONLY_INITIAL_OR_FINAL_OR_REGION =
            SemanticFilterRuleUtil.getBigOrConnective("Filter Everything but Initial, Final or Regions",
                    SCChartsSemanticFilterTags.INITIAL, SCChartsSemanticFilterTags.FINAL,
                    SCChartsSemanticFilterTags.REGION);

    /** Rule to exclude every element. */
    public static final SemanticFilterRule NO_EVERYTHING =
            SemanticFilterRuleUtil.addRuleName("Filter Everything", SemanticFilterRuleUtil.FALSE);

    /** Rule to only include every element. */
    public static final SemanticFilterRule ONLY_EVERYTHING =
            SemanticFilterRuleUtil.addRuleName("Filter Nothing", SemanticFilterRuleUtil.TRUE);
}
