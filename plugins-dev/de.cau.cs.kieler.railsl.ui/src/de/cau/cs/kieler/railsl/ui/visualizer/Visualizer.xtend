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
package de.cau.cs.kieler.railsl.ui.visualizer

import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.railsl.railSL.Statement
import de.cau.cs.kieler.railsl.railSL.SetTrackStatement
import de.cau.cs.kieler.railsl.railSL.SetPointStatement
import de.cau.cs.kieler.railsl.railSL.LightStatement
import de.cau.cs.kieler.railsl.extensions.RailSLExtensions
import de.cau.cs.kieler.railsl.compilation.RailSLTransformation
import de.cau.cs.kieler.kvis.ui.views.KVisView
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import org.eclipse.jface.text.TextSelection
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import com.google.inject.Inject

import org.eclipse.jface.text.IDocumentListener
import org.eclipse.jface.text.DocumentEvent
import com.google.inject.Injector
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.ui.IPartListener2
import org.eclipse.ui.IWorkbenchPartReference
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.ui.internal.Workbench
import de.cau.cs.kieler.railsl.railSL.ContactWaitStatement
import de.cau.cs.kieler.railsl.railSL.ConditionalStatement
import de.cau.cs.kieler.railsl.railSL.ConditionalLine
import de.cau.cs.kieler.railsl.railSL.Block

/**
 * Show on-the-fly info about the model being edited.
 * 
 * @author Philip Eumann (peu) - stu121235@mail.uni-kiel.de
 */
class Visualizer {

    /*************************************************************************
     * I N J E C T I O N S ***************************************************
     *************************************************************************/
     
    // For parsing helpers and speed constants
    @Inject extension RailSLExtensions

    // To determine the EObject generated from a certain cursor position in the XText editor
    @Inject EObjectAtOffsetHelper eObjectAtOffsetHelper
    
    /*************************************************************************
     * F I E L D S ***********************************************************
     *************************************************************************/
    /**
     * The singleton instance to be used for all behalfs
     */
    private static var Visualizer instance

    /**
     * The editor being currently monitored by the Visualizer
     */
    private var XtextEditor registeredEditor

    /**
     * The currently registered DocumentListener
     */
    @Accessors
    private var IDocumentListener listener

    /**
     * The DataPool object maintained by this object.
     * It is passed to the KVis view whenever updateView is called.
     * 
     * @see Visualizer#updateView
     */
    private var DataPool pool

    private val DataPool emptyPool = createEmptyPool()

    /**
     * All the track name constants
     */
    static val constants = #{"IC_JCT_0", "IC_LN_0", "IC_LN_1", "IC_LN_2", "IC_LN_3", "IC_LN_4", "IC_LN_5", "IC_ST_0",
        "IC_ST_1", "IC_ST_2", "IC_ST_3", "IC_ST_4", "IO_LN_0", "IO_LN_1", "IO_LN_2", "KH_LN_0", "KH_LN_1", "KH_LN_2",
        "KH_LN_3", "KH_LN_4", "KH_LN_5", "KH_LN_6", "KH_LN_7", "KH_LN_8", "KH_ST_0", "KH_ST_1", "KH_ST_2", "KH_ST_3",
        "KH_ST_4", "KH_ST_5", "KH_ST_6", "KIO_LN_0", "KIO_LN_1", "OC_JCT_0", "OC_LN_0", "OC_LN_1", "OC_LN_2", "OC_LN_3",
        "OC_LN_4", "OC_LN_5", "OC_ST_0", "OC_ST_1", "OC_ST_2", "OC_ST_3", "OC_ST_4", "OI_LN_0", "OI_LN_1", "OI_LN_2"}

    /*************************************************************************
     * C O N S T R U C T O R *************************************************
     *************************************************************************/
    /**
     * Default constructor.
     * Instantiates the DataPool and fills it with default values for all tracks, points and lights.
     */
    new() {

        System.out.println("Creating Visualizer...")

        pool = emptyPool.clone

        // TODO Add more default variable values here
        registerListenerToEditor

        // Register listener to keep track of changing editors
        Display.getDefault.asyncExec(
            new Runnable() {
                @Override
                override void run() {
                    Workbench.getInstance().getActiveWorkbenchWindow().getPartService().addPartListener(
                        new IPartListener2() {

                            @Override
                            override partActivated(IWorkbenchPartReference partRef) {
                                if (partRef.getPart(false).equals(EditorUtils.activeXtextEditor)) {
                                    Visualizer.instance.registerListenerToEditor
                                }
                            }

                            @Override
                            override partBroughtToTop(IWorkbenchPartReference partRef) {
                                // ignore
                            }

                            @Override
                            override partClosed(IWorkbenchPartReference partRef) {
                                if (partRef.getPart(false).equals(Visualizer.instance.getRegisteredEditor)) {
                                    Visualizer.instance.deactivateListener
                                }
                            }

                            @Override
                            override partDeactivated(IWorkbenchPartReference partRef) {
                                if (partRef.getPart(false).equals(Visualizer.instance.getRegisteredEditor)) {
                                    Visualizer.instance.deactivateListener
                                }
                            }

                            @Override
                            override partHidden(IWorkbenchPartReference partRef) {
                                // ignore
                            }

                            @Override
                            override partInputChanged(IWorkbenchPartReference partRef) {
                                // ignore
                            }

                            @Override
                            override partOpened(IWorkbenchPartReference partRef) {
                                // ignore
                            }

                            @Override
                            override partVisible(IWorkbenchPartReference partRef) {
                                // ignore
                            }
                        })
                }
            })
    }

    private def DataPool createEmptyPool()  {
        val pool = new DataPool()
        val model = new Model()
        model.name = "railway"
        model.pool = pool
        pool.addModel(model)

        // Add tracks at speed 0
        for (constant : constants) {
            model.addVariable(new Variable(constant, 0))
            model.addVariable(new Variable("S0_" + constant, 4))
            model.addVariable(new Variable("S1_" + constant, 4))
            model.addVariable(new Variable(constant + "_C_0", "off"))
            model.addVariable(new Variable(constant + "_C_1", "off"))
        }

        // Add points as straight
        for (var i = 0; i < RailSLTransformation::NUM_OF_POINTS; i++) {
            model.addVariable(new Variable("point_" + i, 0))
        }

        // Add lights as off
        for (var i = 0; i < RailSLTransformation::NUM_OF_LIGHTS; i++) {
            model.addVariable(new Variable("light_" + i, "off"))
        }
        
        pool
        
    }

    /**
     * Creates the singleton instance of the Visualizer.
     */
    public static def void initialize(Injector injector) {
        instance = injector.getInstance(Visualizer)
    }

    /*************************************************************************
     * L I S T E N E R S *****************************************************
     *************************************************************************/

    /**
     * Deactivates the IDocumentListener attached to the XtextEditor.
     * 
     * Called by the IPartListener when the active editor is closed or deactivated.
     */
    def void deactivateListener() {
        Display.getDefault.asyncExec(new Runnable() {

            @Override
            override void run() {
                registeredEditor.document?.removeDocumentListener(Visualizer.instance.getListener)
            }

        })
    }

    /**
     * Registers an IDocumentListener to the currently open document in the XTextEditor.
     */
    def void registerListenerToEditor() {

        Display.getDefault.asyncExec(new Runnable() {
            @Override
            override void run() {

                registeredEditor = EditorUtils.activeXtextEditor
                val listener = (new IDocumentListener {

                    @Override
                    override documentAboutToBeChanged(DocumentEvent event) {
                        // ignore
                    }

                    @Override
                    override documentChanged(DocumentEvent event) {
                        Visualizer.instance.updateView
                    }

                })
                registeredEditor.document.addDocumentListener(listener)
                Visualizer.instance.listener = listener

            }
        })
    }

    /*************************************************************************
     * U P D A T I N G *******************************************************
     *************************************************************************/

    /**
     * Read the current cursor position from the active editor and 
     * display the effects of the currently selected Statement in the KVis View.
     */
    public def void updateView() {

        Display.getDefault().asyncExec(new Runnable() {

            @Override
            override void run() {

                registeredEditor.document.readOnly(new IUnitOfWork<String, XtextResource>() {

                    @Override
                    override exec(XtextResource state) {
                        try {
                            val textSelection = registeredEditor.getSelectionProvider().getSelection() as TextSelection;
                            val object = eObjectAtOffsetHelper.resolveElementAt(state, textSelection.getOffset())
                            updatePool(object)

                            KVisView.instance?.update(pool, true)

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
        pool = emptyPool.clone()
        
        val model = pool.getModel("railway");
        
        // process the EObject passed as a parameter
        if (object instanceof Statement) {
            model.addValues(object as Statement)
        }  else if (object instanceof Block) {
            
            // For a block, display all statements at once
            for (statement : (object as Block).statements) {
                model.addValues(statement)
            }
        } else if (object instanceof ConditionalLine) {
            model.addConditionalLineValues(object as ConditionalLine)
        }
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
        } else if (statement instanceof ContactWaitStatement) {
            model.addContactValue(statement as ContactWaitStatement)
        } else if (statement instanceof ConditionalStatement) {
            model.addConditionalValues(statement as ConditionalStatement)
        }
    }

    /**
     * Add data representing the SetTrackStatement to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addTrackValues(Model model, SetTrackStatement statement) {

        try {
            val direction = statement.parseDirection
            val speed = statement.parseSpeed
            for (segment : statement.segments) {

                var Variable forwardSignal
                var Variable reverseSignal

                var speedVar = new Variable(segment, speed)

                // Determine setting for signals
                if (direction == 1) {
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
                model.variables.add(0, forwardSignal)
                model.variables.add(0, reverseSignal)
                model.variables.add(0, speedVar)
            }
        } catch (NullPointerException e) {
            System.out.println("Parsed illegal statement.")
            return
        }
    }

    /**
     * Add data representing the SetPointStatement to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addPointValues(Model model, SetPointStatement statement) {
        
        var Variable variable
        
        for (index : statement.points) {
            variable = new Variable("point_" + index, statement.orientation)
            model.addVariable(variable)
        }
    }
    
    /**
     * Add data representing the LightStatement to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addLightValues(Model model, LightStatement statement) {
        
        var Variable variable
        
        for (index : statement.lights) {
            variable = new Variable("light_" + index, statement.state)
            model.addVariable(variable)
        }
    }

    /**
     * Add data representing the ContactWaitStatement to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addContactValue(Model model, ContactWaitStatement statement) {
        val variable = new Variable(statement.segName + "_C_" + statement.parseContactIndex, "on")
        model.addVariable(variable)
    }

    /**
     * Add data representing the ConditionalStatement to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addConditionalValues(Model model, ConditionalStatement statement) {
        for (line : statement.lines) {
            model.addConditionalLineValues(line)
        }
    }

    /**
     * Add data representing the ConditionalLine to the model.
     * 
     * @param model The model from the DataPool to which the data should be added
     * @param statement The statement to be represented
     */
    def addConditionalLineValues(Model model, ConditionalLine line) {
        val variable = new Variable(line.segName + "_C_" + line.parseContactIndex, "on")
        model.addVariable(variable)
    }

    /*************************************************************************
     * G E T T E R S   &   S E T T E R S *************************************
     *************************************************************************/

    /**
     * Getter for the DataPool.
     * Currently unused.
     */
    public def DataPool getDataPool() {
        return pool
    }

    public def XtextEditor getRegisteredEditor() {
        return registeredEditor
    }

}
