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
package de.cau.cs.kieler.sccharts.processors.dataflow

import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import java.util.LinkedHashSet
import de.cau.cs.kieler.sccharts.State
import java.util.Set
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

import static extension java.lang.String.format
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.kexpressions.keffects.Linkable

/**
 * 
 */
class RegionDependencyCheck extends SCChartsProcessor {

    public static val ID = "de.cau.cs.kieler.sccharts.processors.regionDependencyCheck"
    // TODO: rewrite
    public static val ERROR_MSG = "Region dependencies are not in model order: "

    public static val IProperty<Boolean> ERROR_ON_FAILURE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.processors.regionDependencyCheck.errorOnFailure", true)

    override getId() {
        ID
    }

    override getName() {
        "Region Dependency Check"
    }

    @Inject
    extension SCChartsScopeExtensions;

    override process() {
        val model = getModel

        val lcafMap = environment.getProperty(RegionDependencies.REGION_LCAF_MAP)
        if (lcafMap === null) {
            environment.warnings.add("No LCAF map found. No sorting applied.")
            return;
        }

        for (rootState : model.rootStates) {
            val dependencies = rootState.eAllContents.filter(ControlflowRegion).map[outgoingLinks].toList.flatten.
                filter(DataDependency).filter[concurrent && !confluent].toList
            val all_dependencies = rootState.eAllContents.filter(Linkable).map[outgoingLinks].toList.flatten.filter(
                DataDependency).toList
            // println(all_dependencies)
            val regionDependencies = <Pair<Linkable, Linkable>>newLinkedHashSet
            for (dependency : all_dependencies) {
                val cfrs = lcafMap.levelRegions(dependency)
                if(cfrs.key != cfrs.value) regionDependencies.add(cfrs)
            }

//            rootState.checkSortedTopologically(regionDependencies)
            rootState.allStates.forEach[checkSortedTopologically(regionDependencies)]
        }
    }

    protected def checkSortedTopologically(State s, Set<Pair<Linkable, Linkable>> dependencies) {

        val duringActionsAndRegions = (s.actions.filter(DuringAction) + s.regions).toList

        duringActionsAndRegions.forEach [ r, idx |

            val dependingRegions = dependencies.filter[key == r].map[value].toSet

            val depencenciesInWrongOrder = dependingRegions.filter[duringActionsAndRegions.indexOf(it) < idx].toSet

            if (depencenciesInWrongOrder.exists[duringActionsAndRegions.indexOf(it) < 0]) {
                throw new UnsupportedOperationException(
                    "Dependencies between different hierarchy levels are not supported!")
            }

//            println(r.labelOrDefault + " -> " + dependingRegions.map[labelOrDefault])
//            println(idx + " -> " + depencenciesInWrongOrder)
            if (depencenciesInWrongOrder.size > 0) {
                // If we depend on anything with lower model order, this means LeanChartScheduling will cause semantic deviations
                // TODO: Give a more helpful error message, i.e. include which region depends on which other region, if they
                // have a name.
                (if(environment.getProperty(ERROR_ON_FAILURE)) environment.errors else environment.infos).add(
                    ERROR_MSG + "previous " + depencenciesInWrongOrder.map[labelOrDefault] + " depend on " +
                        r.labelOrDefault)

            }

        ]

    }

    def String labelOrDefault(Linkable l) {
        if (l instanceof Region) {
            val r = l
            if (r.label !== null && !r.label.empty) {
                "region \"%s\"".format(r.label)
            } else {
                val parentState = r.parentState
                val idx = parentState.regions.indexOf(r)
                "<%d. region of %s>".format(idx, parentState.label)
            }
        } else if (l instanceof DuringAction) {
            val d = l
            if (d.label !== null && !d.label.empty) {
                "during action \"%s\"".format(d.label)
            } else {
                val parent = d.eContainer
                if (parent instanceof State) {
                    val idx = parent.actions.filter(DuringAction).toList.indexOf(d)
                    "<%d. during action of state %s>".format(idx, parent.label)
                } else if (parent instanceof Region) {
                    val idx = parent.actions.filter(DuringAction).toList.indexOf(d)
                    "<%d. during action of region %s>".format(idx, parent.labelOrDefault)
                } else {
                    "<during action of %s>".format(parent)
                }
            }
        } else {
            l.toString
        }

    }

}
