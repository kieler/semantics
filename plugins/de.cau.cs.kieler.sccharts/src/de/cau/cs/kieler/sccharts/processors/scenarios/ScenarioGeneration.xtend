/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.scenarios

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsFixExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsOptimization
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.Random
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import java.util.List
import java.util.ArrayList
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValueType
import java.util.Map
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.annotations.StringAnnotation

/**
 * @author jep
 * 
 */
class ScenarioGeneration extends SCChartsProcessor {

    @Inject extension KExpressionsCompareExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsFixExtensions
    @Inject extension SCChartsOptimization

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.scenarioGeneration"
    }

    override getName() {
        "Scenarios"
    }

    override process() {
        setModel(model.transform)
    }

    def SCCharts transform(SCCharts sccharts) {
        val scenarioPragma = sccharts.pragmas.filter[pragma|pragma.name.equals("scenarios")]
        sccharts => [rootStates.forEach[transform]]
    }

    def State transform(State rootState) {
        // determines how many pairs of start and end state are inspected
        // TODO: let the user determine this number?
        val testsuites = 2
        // determine for how many paths between a start/end state pair is searched
        // TODO: eliminate in the future? number of paths should depend on coverage criteria. if the criteria is near 100% we can generate the next start/end pair
        val numberPaths = 2

        // a random generator is needed to determine start/end state and path calculation
        val random = new Random()
        // map for the variables used in the scchart        
        val variableMap = new HashMap<String, Object>()

        // calculate test cases
        for (var i = 0; i < testsuites; i++) {
            // determine random start and end state
            val allStates = rootState.allStates.toList
            val start = random.nextInt(allStates.length)
            val end = random.nextInt(allStates.length)

            for (var pathNumber = 0; pathNumber < numberPaths; pathNumber++) {
                // init/reset variable values and determine random input values
                initTestCase(rootState, variableMap, random)

                // generate possible paths between the two states by modeling randomly the behavior of the other vehicle
                // TODO
                println("test")
            }
        }

        return rootState
    }

    def void initTestCase(State rootState, Map<String, Object> map, Random random) {
        // initialize the variables of the model and save them in a map
        initVariableMap(rootState.declarations, map)
        // collect input variables
        val List<VariableDeclaration> inputVariables = new ArrayList()
        for (decl : rootState.declarations) {
            if (decl instanceof VariableDeclaration && (decl as VariableDeclaration).input) {
                inputVariables.add(decl as VariableDeclaration)
            }
        }
        // assign random values to input variables based on their assumed range annotation
        for (inputVar : inputVariables) {
            if (inputVar.type === ValueType.BOOL) {
                inputVar.valuedObjects.forEach[variable|map.put(variable.name, random.nextBoolean())]
            } else {
                val rangeAnnotation = inputVar.annotations.findFirst[anno|anno.name.equals("AssumeRange")]
                val first = (rangeAnnotation as StringAnnotation).values.get(0)
                val second = (rangeAnnotation as StringAnnotation).values.get(1)
                switch (inputVar.type) {
                    case ValueType.INT: {
                        val firstInt = Integer.parseInt(first)
                        val secondInt = Integer.parseInt(second)
                        if (firstInt === secondInt) {
                            inputVar.valuedObjects.forEach [ variable |
                                map.put(variable.name, firstInt)
                            ]
                        } else {
                            inputVar.valuedObjects.forEach [ variable |
                                map.put(variable.name, random.nextInt(secondInt - firstInt) + firstInt)
                            ]
                        }
                    }
                    case ValueType.FLOAT: {
                        val firstFloat = Float.parseFloat(first)
                        val secondFloat = Float.parseFloat(second)
                        if (firstFloat === secondFloat) {
                            inputVar.valuedObjects.forEach [ variable |
                                map.put(variable.name, firstFloat)
                            ]
                        } else {
                            inputVar.valuedObjects.forEach [ variable |
                                map.put(variable.name, random.nextFloat() * secondFloat + firstFloat)
                            ]
                        }
                    }
                    default:
                        println("ValueType of an input variable not supported")
                }
            }
        }
    }

    def void initVariableMap(List<Declaration> declarations, Map<String, Object> map) {
        for (decl : declarations) {
            if (decl instanceof VariableDeclaration) {
                // TODO: support arrays
                switch (decl.type) {
                    case ValueType.BOOL:
                        decl.valuedObjects.forEach [ object |
                            {
                                if (object.initialValue === null) {
                                    map.put(object.name, false)
                                } else {
                                    map.put(object.name, object.initialValue)
                                }
                            }
                        ]
                    case ValueType.FLOAT:
                        decl.valuedObjects.forEach [ object |
                            {
                                if (object.initialValue === null) {
                                    map.put(object.name, 0.0)
                                } else {
                                    map.put(object.name, object.initialValue)
                                }
                            }
                        ]
                    case ValueType.INT:
                        decl.valuedObjects.forEach [ object |
                            {
                                if (object.initialValue === null) {
                                    map.put(object.name, 0)
                                } else {
                                    map.put(object.name, object.initialValue)
                                }
                            }
                        ]
                    default:
                        println("ValueType of a variable not supported")
                }
            }
        }
    }

}
