/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.filtering;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import de.cau.cs.kieler.klighd.filtering.AndConnective;
import de.cau.cs.kieler.klighd.filtering.FalseConnective;
import de.cau.cs.kieler.klighd.filtering.GreaterEqualsConnective;
import de.cau.cs.kieler.klighd.filtering.GreaterThanConnective;
import de.cau.cs.kieler.klighd.filtering.IfThenElseConnective;
import de.cau.cs.kieler.klighd.filtering.LessThanConnective;
import de.cau.cs.kieler.klighd.filtering.LogicEqualConnective;
import de.cau.cs.kieler.klighd.filtering.NegationConnective;
import de.cau.cs.kieler.klighd.filtering.NumericAdditionConnective;
import de.cau.cs.kieler.klighd.filtering.NumericConstantConnective;
import de.cau.cs.kieler.klighd.filtering.NumericEqualConnective;
import de.cau.cs.kieler.klighd.filtering.NumericSubtractionConnective;
import de.cau.cs.kieler.klighd.filtering.OrConnective;
import de.cau.cs.kieler.klighd.filtering.SemanticFilterRule;
import de.cau.cs.kieler.klighd.filtering.SemanticFilterRuleUtil;
import de.cau.cs.kieler.klighd.filtering.TrueConnective;

/**
 * Contains semantic filter rules for SCCharts.
 * 
 * @author tik
 */
public abstract class SCChartsSemanticFilterRules {

    /** Returns all semantic filter rules defined in this class. */
    public static List<SemanticFilterRule> getAllFilters() {
        Field[] fields = SCChartsSemanticFilterRules.class.getFields();
        List<SemanticFilterRule> filters = new ArrayList<>(fields.length);
        // Map the fields to the actual rules
        for (Field f : fields) {
            try {
                filters.add((SemanticFilterRule) f.get(null));
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // Neither of these should ever occur as
                // 1. the fields are static, i.e. no instance is needed
                // 2. the fields are accessible by this class
            }
        }
        return filters;
    }

    // Naming conventions:
    // The class variables' names should start with NO_ or ONLY_,
    // indicating which elements are kept out or left in
    // The descriptions should utilize the checkbox as the verb

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
}
