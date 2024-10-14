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
import de.cau.cs.kieler.klighd.filtering.NegationConnective;
import de.cau.cs.kieler.klighd.filtering.SemanticFilterRule;

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

    // The descriptions should utilize the checkbox as the verb
    // The filters exclude element types, but on the UI of the client the checkbox will be inverted i.e. indicating
    // that the user excludes these elements by unchecking the box

    /** Rule to exclude elements that are states. */
    public static final SemanticFilterRule SHOW_STATES =
            new NegationConnective(SCChartsSemanticFilterTags.STATE, true, "All States");
    /** Rule to exclude elements that are regions. */
    public static final SemanticFilterRule SHOW_REGIONS =
            new NegationConnective(SCChartsSemanticFilterTags.REGION, true, "All Regions");

    /** Rule to exclude elements that are simple states. */
    public static final SemanticFilterRule SHOW_SIMPLE_STATE =
            new NegationConnective(SCChartsSemanticFilterTags.SIMPLE_STATE, true, "Simple States");
    /** Rule to exclude elements that are hierarchical states. */
    public static final SemanticFilterRule SHOW_HIERARCHICAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.HIERARCHICAL_STATE, true, "Hierarchical States");
    /** Rule to exclude elements that are connector states. */
    public static final SemanticFilterRule SHOW_CONNECTOR_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.CONNECTOR_STATE, false, "Connector States");
    /** Rule to exclude elements that are controlflow regions. */
    public static final SemanticFilterRule SHOW_CONTROLFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.CONTROLFLOW_REGION, true, "Controlflow Regions");
    /** Rule to exclude elements that are dataflow regions. */
    public static final SemanticFilterRule SHOW_DATAFLOW_REGION = new NegationConnective(
            SCChartsSemanticFilterTags.DATAFLOW_REGION, true, "Dataflow Regions");

    /** Rule to exclude elements that are initial states. */
    public static final SemanticFilterRule SHOW_INITIAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.INITIAL, true, "Initial States");
    /** Rule to exclude elements that are final states. */
    public static final SemanticFilterRule SHOW_FINAL_STATE = new NegationConnective(
            SCChartsSemanticFilterTags.FINAL, true, "Final States");
}
