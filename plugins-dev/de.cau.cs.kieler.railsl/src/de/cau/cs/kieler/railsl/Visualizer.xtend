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

import de.cau.cs.kieler.railSL.Program
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.railSL.Block
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.railSL.Statement
import de.cau.cs.kieler.railSL.SetTrackStatement
import com.google.inject.Inject
import de.cau.cs.kieler.railSL.SetPointStatement
import de.cau.cs.kieler.railSL.LightStatement
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.railsl.extensions.RailSLExtensions
import de.cau.cs.kieler.railsl.compilation.RailSLTransformation
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.kvis.ui.views.KVisView
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.jface.text.TextSelection
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.ui.IWorkbenchWindow

/**
 * Show on-the-fly info about the model being edited.
 * 
 * @author stu121235
 * 
 */
class Visualizer {

    final static val constants = #{"IC_JCT_0", "IC_LN_0", "IC_LN_1", "IC_LN_2", "IC_LN_3", "IC_LN_4", "IC_LN_5",
        "IC_ST_0", "IC_ST_1", "IC_ST_2", "IC_ST_3", "IC_ST_4", "IO_LN_0", "IO_LN_1", "IO_LN_2", "KH_LN_0", "KH_LN_1",
        "KH_LN_2", "KH_LN_3", "KH_LN_4", "KH_LN_5", "KH_LN_6", "KH_LN_7", "KH_LN_8", "KH_ST_0", "KH_ST_1", "KH_ST_2",
        "KH_ST_3", "KH_ST_4", "KH_ST_5", "KH_ST_6", "KIO_LN_0", "KIO_LN_1", "OC_JCT_0", "OC_LN_0", "OC_LN_1", "OC_LN_2",
        "OC_LN_3", "OC_LN_4", "OC_LN_5", "OC_ST_0", "OC_ST_1", "OC_ST_2", "OC_ST_3", "OC_ST_4", "OI_LN_0", "OI_LN_1",
        "OI_LN_2"}

        @Inject
        extension RailSLExtensions

        @Inject
        EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();

        private var DataPool pool

        new() {
            pool = new DataPool()
            val model = new Model()
            model.name = "railway"
            model.pool = pool
            pool.addModel(model)

            model.addVariable(new Variable("Backfisch", "1"))

            // Add tracks at speed 0
            for (constant : constants) {
                model.addVariable(new Variable(constant, "0"))
                model.addVariable(new Variable("S0_" + constant, "RED"))
                model.addVariable(new Variable("S1_" + constant, "RED"))
            }

            // Add points as straight
            for (var i = 0; i < RailSLTransformation::NUM_OF_POINTS; i++) {
            }
            pool.previousPool = pool.clone

        }

        public def DataPool getDataPool() {
            return pool
        }

        /**
         * Read the current cursor position from the active editor and 
         * display the changes made by the currently selected Statement.
         */
        public def void updateView() {

            Display.getDefault().asyncExec(new Runnable() {

                @Override
                override void run() {
                    val editor = EditorUtils.activeXtextEditor
                    editor.document.readOnly(new IUnitOfWork<String, XtextResource>() {

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

        def void updatePool(EObject object) {

            // reset the pool to the last state
            pool = pool.previousPool.clone
            pool.previousPool = pool
            val model = pool.getModel("railway");
//                case Block: return // TODO do something cool here
            if (object instanceof Statement) {
                model.addValues(object as Statement)

            }
        }

//    public def void assembleModel(Program program) {
//
//        val model = pool.getModel("railway")
//
//        for (block : program.blocks) {
//            model.assembleBlock(block)
//        }
//
//    }
//
//    def Model assembleBlock(Model model, Block block) {
//        for (statement : block.statements) {
//            model.addValues(statement)
//        }
//        return model
//    }
//
        def addValues(Model model, Statement statement) {
            
            //TODO fix the removal and addition of variables in the consecutive rounds.
            
            if (statement instanceof SetTrackStatement) {
                model.addTrackValues(statement as SetTrackStatement)
            } else if (statement instanceof SetPointStatement) {
                 model.addPointValues(statement as SetPointStatement)
            } else if (statement instanceof LightStatement) {
                model.addLightValues(statement as LightStatement)
            }


        }

        def addLightValues(Model model, LightStatement statement) {
            for (index : statement.lights) {
                model.addVariable(new Variable("light_" + index, statement.state))
            }
        }

        def addPointValues(Model model, SetPointStatement statement) {
            for (index : statement.points) {
                model.addVariable(new Variable("point_" + index, statement.orientation))
            }
        }

        def addTrackValues(Model model, SetTrackStatement statement) {
            val direction = statement.parseDirection
            val speed = statement.parseSpeed
            for (segment : statement.segments) {
                model.addVariable(new Variable(segment, speed))
                // model.addVariable(new Variable(segment + "_direction", direction))
                if (direction == 0) {
                    if (speed == RailSLExtensions::SPEED_FULL) {
                        model.addVariable(new Variable("S0_" + segment, "GREEN"))

                    } else if (speed == RailSLExtensions::SPEED_SLOW) {
                        model.addVariable(new Variable("S0_" + segment, "YELLOW"))
                    } else {
                        model.addVariable(new Variable("S0_" + segment, "RED"))
                    }
                    model.addVariable(new Variable("S1_" + segment, "RED"))

                } else {
                    if (speed == RailSLExtensions::SPEED_FULL) {
                        model.addVariable(new Variable("S1_" + segment, "GREEN"))

                    } else if (speed == RailSLExtensions::SPEED_SLOW) {
                        model.addVariable(new Variable("S1_" + segment, "YELLOW"))
                    } else {
                        model.addVariable(new Variable("S1_" + segment, "RED"))
                    }
                    model.addVariable(new Variable("S0_" + segment, "RED"))
                }
            }
        }

    }
    