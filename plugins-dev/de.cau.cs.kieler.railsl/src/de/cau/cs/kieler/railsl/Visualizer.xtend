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
package de.cau.cs.kieler.railsl

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.railSL.Statement
import de.cau.cs.kieler.railSL.SetTrackStatement
import com.google.inject.Inject
import de.cau.cs.kieler.railSL.SetPointStatement
import de.cau.cs.kieler.railSL.LightStatement
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.railsl.extensions.RailSLExtensions
import de.cau.cs.kieler.railsl.compilation.RailSLTransformation
import de.cau.cs.kieler.kvis.ui.views.KVisView
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.jface.text.TextSelection
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList

/**
 * Show on-the-fly info about the model being edited.
 * 
 * @author Philip Eumann (peu) - stu121235@mail.uni-kiel.de
 */
class Visualizer {

    /**
     * All the track name constants
     */
    final static val constants = #{"IC_JCT_0", "IC_LN_0", "IC_LN_1", "IC_LN_2", "IC_LN_3", "IC_LN_4", "IC_LN_5",
        "IC_ST_0", "IC_ST_1", "IC_ST_2", "IC_ST_3", "IC_ST_4", "IO_LN_0", "IO_LN_1", "IO_LN_2", "KH_LN_0", "KH_LN_1",
        "KH_LN_2", "KH_LN_3", "KH_LN_4", "KH_LN_5", "KH_LN_6", "KH_LN_7", "KH_LN_8", "KH_ST_0", "KH_ST_1", "KH_ST_2",
        "KH_ST_3", "KH_ST_4", "KH_ST_5", "KH_ST_6", "KIO_LN_0", "KIO_LN_1", "OC_JCT_0", "OC_LN_0", "OC_LN_1", "OC_LN_2",
        "OC_LN_3", "OC_LN_4", "OC_LN_5", "OC_ST_0", "OC_ST_1", "OC_ST_2", "OC_ST_3", "OC_ST_4", "OI_LN_0", "OI_LN_1",
        "OI_LN_2"}

        /*
         * For parsing helpers and speed constants
         */
        @Inject
        extension RailSLExtensions

        /*
         * To determine the EObject generated from a certain cursor position in the XText editor
         */
        @Inject
        EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();

        /**
         * The DataPool object maintained by this object.
         * It is passed to the KVis view whenever updateView is called.
         * 
         * @see Visualizer#updateView
         */
        private var DataPool pool
        
        /**
         * Helper list to keep track of all variables added to the DataPool.
         * Used to clear the variables added by the previous statement when computing the DataPool for a new one.
         */
        private val addedVars = new ArrayList<Variable>()

        /**
         * Default constructor.
         * Instantiates the DataPool and fills it with default values for all tracks, points and lights.
         */
        new() {
            pool = new DataPool()
            val model = new Model()
            model.name = "railway"
            model.pool = pool
            pool.addModel(model)

            // Add tracks at speed 0
            for (constant : constants) {
                model.addVariable(new Variable(constant, 0))
                model.addVariable(new Variable("S0_" + constant, 4))
                model.addVariable(new Variable("S1_" + constant, 4))
            }

            // Add points as straight
            for (var i = 0; i < RailSLTransformation::NUM_OF_POINTS; i++) {
            }

        }

        /**
         * Getter for the DataPool.
         * Currently unused.
         */
        public def DataPool getDataPool() {
            return pool
        }

        /**
         * Read the current cursor position from the active editor and 
         * display the effects of the currently selected Statement in the KVis View.
         */
        public def void updateView() {

            Display.getDefault().asyncExec(new Runnable() {

                @Override
                override void run() {
                    val editor = EditorUtils.activeXtextEditor
                    editor.document.readOnly(new IUnitOfWork<String, XtextResource>() {
                           
                        @Override
                        override exec(XtextResource state) {
                            try {
                                val textSelection = editor.getSelectionProvider().getSelection() as TextSelection;
                                val object = eObjectAtOffsetHelper.resolveElementAt(state, textSelection.getOffset())
                                updatePool(object)

                                KVisView.instance?.update(pool)

                                return null
                            } catch (Exception e) {
                                e.printStackTrace
                                return null
                            }
                        }
                    })
                }
            })
        }

        /**
         * Updates the DataPool according to the object passed as a parameter.
         * 
         * Currently only supports certain kinds of statements.
         * 
         * @param object The EObject generated by the currently selected line in the XText Editor
         */
        def void updatePool(EObject object) {
            
            // delete previously added variables
            val model = pool.getModel("railway");
            val modelVars = model.variables

            for (variable : addedVars) {
                modelVars.remove(variable)
            }
            
            addedVars.clear   
            
            // process the EObject passed as a parameter
            if (object instanceof Statement) {
                model.addValues(object as Statement)
            }// else if (object instanceof Block) {
             // TODO how do we display blocks? 
             //}
        }

        /**
         * Add data representing the statement to the model.
         * 
         * @param model The model from the DataPool to which the data should be added
         * @param statement The statement to be represented
         */
        def addValues(Model model, Statement statement) {
            
           if (statement instanceof SetTrackStatement) {
                model.addTrackValues(statement as SetTrackStatement)
            } else if (statement instanceof SetPointStatement) {
                 model.addPointValues(statement as SetPointStatement)
            } else if (statement instanceof LightStatement) {
                model.addLightValues(statement as LightStatement)
            }
        }

        /**
         * Add data representing the LightStatement to the model.
         * 
         * @param model The model from the DataPool to which the data should be added
         * @param statement The statement to be represented
         */
        def addLightValues(Model model, LightStatement statement) {
            for (index : statement.lights) {
                model.addVariable(new Variable("light_" + index, statement.state))
            }
        }
        
        /**
         * Add data representing the SetPointStatement to the model.
         * 
         * @param model The model from the DataPool to which the data should be added
         * @param statement The statement to be represented
         */
        def addPointValues(Model model, SetPointStatement statement) {
            for (index : statement.points) {
                model.addVariable(new Variable("point_" + index, statement.orientation))
            }
        }

        /**
         * Add data representing the SetTrackStatement to the model.
         * 
         * @param model The model from the DataPool to which the data should be added
         * @param statement The statement to be represented
         */
        def addTrackValues(Model model, SetTrackStatement statement) {
            val direction = statement.parseDirection
            val speed = statement.parseSpeed
            for (segment : statement.segments) {
                
                var Variable forwardSignal 
                var Variable reverseSignal
                
                var speedVar = new Variable(segment, speed)
                
                // Determine setting for signals
                if (direction == 0) {
                    if (speed == RailSLExtensions::SPEED_FULL) {
                        forwardSignal = new Variable("S0_" + segment, 1)
                    } else if (speed == RailSLExtensions::SPEED_SLOW) {
                        forwardSignal = new Variable("S0_" + segment, 2)
                    } else {
                        forwardSignal = new Variable("S0_" + segment, 4)
                    }
                    reverseSignal = new Variable("S1_" + segment, 4)
                } else {
                    if (speed == RailSLExtensions::SPEED_FULL) {
                        reverseSignal = new Variable("S1_" + segment, 1)
                    } else if (speed == RailSLExtensions::SPEED_SLOW) {
                        reverseSignal = new Variable("S1_" + segment, 2)
                    } else {
                        reverseSignal = new Variable("S1_" + segment, 4)
                    }
                    forwardSignal = new Variable("S0_" + segment, 4)
                }
                
                // Add the new variables to the DataPool and log them as newly added 
                model.addVariable(forwardSignal)
                model.addVariable(reverseSignal)
                model.addVariable(speedVar)
                
                addedVars.add(forwardSignal)
                addedVars.add(reverseSignal)
                addedVars.add(speedVar)
            }
        }
    }
    