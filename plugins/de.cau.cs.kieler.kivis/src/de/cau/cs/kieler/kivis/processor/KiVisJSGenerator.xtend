/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kivis.processor

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kivis.kivis.Visualization

import static de.cau.cs.kieler.kivis.kivis.KivisPackage.*
import static de.cau.cs.kieler.kivis.KiVisConstants.*
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kivis.kivis.Binding
import de.cau.cs.kieler.kivis.kivis.Handler
import de.cau.cs.kieler.kivis.kivis.Code
import de.cau.cs.kieler.kivis.kivis.Action
import de.cau.cs.kieler.kivis.kivis.Interface
import de.cau.cs.kieler.kivis.kivis.SimulationCorntrol

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class KiVisJSGenerator extends Processor<Visualization, CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.kivis.js"
    }
    
    override getName() {
        "KiVis to JS"
    }
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val cc = new CodeContainer
        cc.add("visualization.js", model.translate)
        model = cc
    }
    
    def translate(Visualization viz) {
        return '''
            «IF viz.content.filter(Action).exists[deferred]»
                var _kivis_deferred_actions = [];
            «ENDIF»
            function «VISUALIZATION_FUNCTION»(_dataPool) { // Visualize State
                «FOR content : viz.content.filter[!(it instanceof Action)]»
                    «content.translateContent»
                «ENDFOR»
                
                «IF viz.content.filter(Action).exists[deferred]»
                    // Deferred actions
                    var _i;
                    for (_i = 0; _i < _kivis_deferred_actions.length; _i++) {
                        _kivis_deferred_actions[_i](_dataPool);
                    }
                    _kivis_deferred_actions = [];
                «ENDIF»
                «IF viz.content.filter(Action).exists[!variable.nullOrEmpty]»
                    // Actions indicators reset
                    «FOR variable : viz.content.filter(Action).filter[!variable.nullOrEmpty].map[variable].toSet»
                        _dataPool["«variable»"] = false;
                    «ENDFOR»
                «ENDIF»
                return JSON.stringify(_dataPool);
            }
            «FOR action : viz.content.filter(Action)»
                «action.translateContent»
            «ENDFOR»
            «IF !viz.init.nullOrEmpty»
                (function () { // Init
                    «viz.init»
                })();
            «ENDIF»
        '''
    }
    
    def dispatch translateContent(Binding binding) {
        if (!binding.domElement.nullOrEmpty) {
            return '''
                _dataPool«binding.variable.varAccessor» = (function(«binding.interface.createParameters(INTERFACE__ELEMENT, INTERFACE__VARIABLE, INTERFACE__POOL)») {
                    «binding.script.fixReturn»
                })(document.querySelectorAll('«binding.domElement»')[0], _dataPool«binding.variable.varAccessor», _dataPool);
            '''
        } else {
            return '''
                _dataPool«binding.variable.varAccessor» = (function(«binding.interface.createParameters(INTERFACE__VARIABLE, INTERFACE__POOL)») {
                    «binding.script.fixReturn»
                })(_dataPool«binding.variable.varAccessor», _dataPool);
            '''
        }
    }
    
    def dispatch translateContent(Handler handler) {
        if (!handler.domElement.nullOrEmpty) {
            return '''
                var _elems = document.querySelectorAll('«handler.domElement»');
                var _i;
                for (_i = 0; _i < _elems.length; _i++) {
                    (function(«handler.interface.createParameters(INTERFACE__ELEMENT, INTERFACE__VARIABLE, INTERFACE__POOL)») {
                        «handler.script»
                    })(_elems[_i], _dataPool«handler.variable.varAccessor», _dataPool);
                }
            '''
        } else {
            return '''
                (function(«handler.interface.createParameters(INTERFACE__VARIABLE, INTERFACE__POOL)») {
                    «handler.script»
                })(_dataPool«handler.variable.varAccessor», _dataPool);
            '''
        }
    }
    
    def dispatch translateContent(Action action) {
        return '''
            (function(){ // Register event listener
                var _elems = document.querySelectorAll('«action.domElement»');
                var _i;
                for (_i = 0; _i < _elems.length; _i++) {
                    _elems[_i].addEventListener("«action.domEvent»", function() {
                        «IF action.deferred»
                            _kivis_deferred_actions.push(
                                function(«action.interface.createParameters(INTERFACE__POOL)») {
                                    «action.script»
                                }
                            );
                        «ELSE»
                            (function() {
                                «action.script»
                            })();
                        «ENDIF»
                        «IF !action.variable.nullOrEmpty»
                            «ACTION_INDICATOR_CALLBACK»("«action.variable»");
                        «ENDIF»
                        «IF action.control !== null && action.control !== SimulationCorntrol.NONE»
                            «SIMULATION_CONTROL_CALLBACK»("«action.control.literal»");
                        «ENDIF»
                    });
                }
            })();
        '''
    }
    
    def dispatch translateContent(Code code) {
        return '''
            (function(«code.interface.createParameters(INTERFACE__POOL)») {
                «code.script»
            })(_dataPool);
        '''
    }
    
    def varAccessor(String variable) {
        if (variable.contains('.')) {
            return variable.trim.split(".").map["[\"" + it + "\"]"].join(".")
        } else {
            return "[\"" + variable.trim + "\"]"
        }
    }
    
    def createParameters(Interface interf, int... order) {
        var sb = new StringBuilder
        for (i : order) {
            val name = switch(i) {
                case INTERFACE__VARIABLE: interf.variable
                case INTERFACE__ELEMENT: interf.element
                case INTERFACE__POOL: interf.pool
            }
            if (!name.nullOrEmpty) {
                if (sb.length > 0) {
                    sb.append(", ")
                }
                sb.append(name)
            }
        }
        return sb.toString
    }
    
    def fixReturn(String script) {
        if (!script.contains("return")) {
            if (script.contains(";")) {
                environment.warnings.add("Missing return statement in binding script.")
            } else {
                return "return " + script
            }
        }
    }
}
