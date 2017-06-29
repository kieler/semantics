package de.cau.cs.kieler.sccharts.ptc;

import com.google.inject.Injector
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xml.type.AnyType
import com.google.inject.Inject

/**
 * Import SCCharts from PTC
 * 
 * @author cmot
 * @kieler.design 2017-06-15 proposed cmot
 * @kieler.rating 2017-06-15 proposed yellow
 */
public class PTC2SCCharts {

    @Inject
    extension SCChartsExtension;

    //GuiceModulesExecutableExtensionFactory

    HashMap<EObject, EObject> src2target = new HashMap();
    HashMap<EObject, EObject> target2src = new HashMap();

    /** Create an injector to load the transformation via guice. */
    private static Injector injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();


    def Object name(EObject content) {
        return "EObject:null";
    }

    def String name(AnyType content) {
        for (attribute : content.anyAttribute) {
            if (attribute.EStructuralFeature.getName == "name") {
                return attribute.value as String
            }
        }
        return null;
    }

    def void transformStateMachine(List<State> targetModel, AnyType content) {
        src2target.clear
        target2src.clear
        var scchart = SCChartsFactory::eINSTANCE.createState;
        targetModel.add(scchart)
        scchart.id = content.eClass.name;
        println("CREATE STATEMACHINE '" + scchart.id + "' for " + content.hashCode )
        src2target.put(content, scchart);
        target2src.put(scchart, content);    
        targetModel.transformGeneral(content)
   }

    def void transformRegion(List<State> targetModel, AnyType content, EObject srcParent) {
        println("CREATE REGION for parent " + srcParent.hashCode)
        val state = src2target.get(srcParent) as State;
        val region = state.createControlflowRegion("Region");
        src2target.put(content, region);
        target2src.put(region, content);
        targetModel.transformGeneral(content)
    }

    def transformPseudostate(List<State> targetModel, AnyType content, EObject srcParent) {
        //
    }

    def transformFinalState(List<State> targetModel, AnyType content, EObject srcParent) {
        //
    }

    def void transformState(List<State> targetModel, AnyType content, EObject srcParent) {
        println("CREATE STATE '" + content.name + "'")
        val state = (src2target.get(srcParent) as ControlflowRegion).createState(content.name).uniqueName;
        src2target.put(content, state);
        target2src.put(state, content);
        targetModel.transformGeneral(content)
    }

    def transformActivity(List<State> targetModel, AnyType content) {
        //
    }

    def transformTransition(List<State> targetModel, AnyType content) {
        //
    }

    def transformTrigger(List<State> targetModel, AnyType content) {
        //
    }

    def transformOpaqueBehavior(List<State> targetModel, AnyType content) {
        //
    }

    def transformConstraint(List<State> targetModel, AnyType content) {
        //
    }

    def transformOpaqueExpression(List<State> targetModel, AnyType content) {
        //
    }

    def transformOperation(List<State> targetModel, AnyType content) {
        //
    }

    def transformParameter(List<State> targetModel, AnyType content) {
        //
    }

    def void transformClass(List<State> targetModel, AnyType content) {
        println("ENTERING CLASS '" + content.name + "'")
        targetModel.transformGeneral(content)
    }

    def void transformPackage(List<State> targetModel, AnyType content) {
        println("ENTERING PACKAGE '" + content.name + "'")
        targetModel.transformGeneral(content)
    }

    def transformGeneral(List<State> targetModel, EObject srcElement) {

        val newSrcParent = srcElement

        for (content : srcElement.eContents.toList) {
            if (content.eClass.name == "StateMachine") {
                targetModel.transformStateMachine(content as AnyType)
            }
            if (content.eClass.name == "Region") {
                targetModel.transformRegion(content as AnyType, newSrcParent)
            }
            if (content.eClass.name == "Pseudostate") {
                targetModel.transformPseudostate(content as AnyType, newSrcParent)
            }
            if (content.eClass.name == "FinalState") {
                targetModel.transformFinalState(content as AnyType, newSrcParent)
            }
            if (content.eClass.name == "State") {
                targetModel.transformState(content as AnyType, newSrcParent)
            }
            if (content.eClass.name == "Activity") {
                targetModel.transformActivity(content as AnyType)
            }
            if (content.eClass.name == "Transition") {
                targetModel.transformTransition(content as AnyType)
            }
            if (content.eClass.name == "Trigger") {
                targetModel.transformTrigger(content as AnyType)
            }
            if (content.eClass.name == "OpaqueBehavior") {
                targetModel.transformOpaqueBehavior(content as AnyType)
            }
            if (content.eClass.name == "OpaqueExpression") {
                targetModel.transformOpaqueExpression(content as AnyType)
            }
            if (content.eClass.name == "Operation") {
                targetModel.transformOperation(content as AnyType)
            }
            if (content.eClass.name == "Parameter") {
                targetModel.transformParameter(content as AnyType)
            }
            if (content.eClass.name == "Class") {
                targetModel.transformClass(content as AnyType)
            }
            if (content.eClass.name == "Package") {
                targetModel.transformPackage(content as AnyType)
            }
            if (content.eClass.name == "OpaqueBehavior") {
                targetModel.transformOpaqueBehavior(content as AnyType)
            }

        }

    }

    def transform(EObject model) {
        println("XXXXXX: " + model.eClass.name + ":" + model.eContents.length);


        var sccharts = newArrayList() //<State>;
        


        sccharts.transformGeneral(model)

        return sccharts.get(0)

//        for (content : model.eAllContents.toList) {
//             println("---XXXXXX: " + content.eClass.name + ":" + content.eContents.length);
//             
//             if (content.eClass.name == "StateMachine") {
//             //if (content instanceof StateMachine) {
//                 println("-----XXXXXXXXX STATEMACHINE '" + (content as AnyType).name + "'");
//                 
//             }
//             
//        }
//        
//        //scope.eAllContents().filter(typeof(State))
//        
//        println("XXXXXX Packages: " + model.eAllContents.filter(typeof(org.eclipse.uml2.uml.Package)).size);
//
//        println("XXXXXX States: " + model.eAllContents.filter(typeof(org.eclipse.uml2.uml.State)).size);
//        
//        //println("XXXXXX SMs: " + model.eAllContents.filter(typeof(OwnedBehavior)).size);
    }

}
//    /** The Constant S_TRANSFORMATION. */
//    public static final String S_TRANSFORMATION =
//            "de.cau.cs.kieler.sccharts.commands.STransformation";
//    /** Create an injector to load the transformation via guice. */
//    private static Injector injector = new SctStandaloneSetup()
//            .createInjectorAndDoEMFRegistration();
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Instantiates a new sC charts model file handler.
//     */
//    public PTCModelFileHandler() {
//        super();
//        
//     }
//         
//        override protected createResourceInjector() {
//            throw new UnsupportedOperationException("TODO: auto-generated method stub")
//        }
//        
//        override protected getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
//            throw new UnsupportedOperationException("TODO: auto-generated method stub")
//        }
//        
//        override protected transform(EObject model, ExecutionEvent event, ISelection selection) {
//            throw new UnsupportedOperationException("TODO: auto-generated method stub")
//        }
//        
//    }
//
//    // -------------------------------------------------------------------------
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
//        Object transformed = null;
//
//        String dlgValue = showInputDialog(title, msg, "" + defaultValue);
//
//        int ticks = 0;
//        int traces = 1;
//        try {
//            if (dlgValue.contains(",")) {
//                String dlgValues[] = dlgValue.split(",");
//                traces = Integer.parseInt(dlgValues[1].trim());
//                dlgValue = dlgValues[0];
//            }
//            ticks = Integer.parseInt(dlgValue);
//        } catch (Exception e) {
//            // fallback are ticks=0, traces=1
//        }
//
//        State state = (State) model;
//
//        StringBuilder builder = new StringBuilder();
//
//        for (int trace = 0; trace < traces; trace++) {
//            builder.append("! reset;\n");
//            for (int tick = 0; tick < ticks; tick++) {
//
//                for (Declaration declaration : state.getDeclarations()) {
//                    if (declaration.isInput()) {
//                        String type = declaration.getType().getLiteral();
//
//                        String value = null;
//                        // get random value
//                        if (type.equals("int")) {
//                            value = ((int)(1000 - (Math.random() * 2000))) + "";
//                        } else if (type.equals("bool")) {
//                            if (Math.random()*2 > 1) {
//                                value =  "true";
//                            } else {
//                                value =  "false";
//                            }
//                        } else if (type.equals("pure")) {
//                            if (Math.random()*2 > 1) {
//                                value =  "PRESENT";
//                            } 
//                        } else if (type.equals("double")) {
//                            value = (1000 - (Math.random() * 2000)) + "";
//                        }
//
//                        for (ValuedObject valuedObject : declaration.getValuedObjects()) {
//                            String name = valuedObject.getName();
//
//                            if (!declaration.isSignal() || (!type.equals("pure"))) {
//                                // variables
//                                builder.append(name + "(" + value + ") ");
//                            } else {
//                                // signals
//                                if (value != null) {
//                                    builder.append(name + " ");
//                                }
//                            }
//                        }
//                    }// input
//                }// declaration
//                builder.append("\n% Output: \n;\n");
//
//            }// tick
//        }
//
//        transformed = builder.toString();
//
//        return transformed;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * {@inheritDoc}
//     */
//    public String getDiagramEditorID() {
//        return null;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * {@inheritDoc}
//     */
//    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
//            final ISelection selection) {
//        return false;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
//        return "eso";
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * {@inheritDoc}
//     */
//    @Override
//    protected Injector createResourceInjector() {
//        // Force AbstractConvertModelHandler to use XMIResource (instead of Xtext Resources)
//        return injector;
//    }
//
//    // -------------------------------------------------------------------------
//
//    /**
//     * Show an input dialog with the message, a default value and a specific title.
//     * 
//     * @param title
//     *            the title of the dialog
//     * @param message
//     *            the message to present
//     * @param defaultValue
//     *            the default value
//     * 
//     * @return the string value entered or null if aborted
//     */
//    String inputDialogReturnValue = null;
//
//    private String showInputDialog(final String title, final String message,
//            final String defaultValue) {
//        inputDialogReturnValue = null;
//        Display.getDefault().syncExec(new Runnable() {
//            public void run() {
//                final Shell shell = Display.getCurrent().getShells()[0];
//                InputDialog dlg = new InputDialog(shell, title, message, defaultValue, null);
//                dlg.open();
//                if (dlg.getReturnCode() == InputDialog.OK) {
//                    inputDialogReturnValue = dlg.getValue();
//                }
//            }
//        });
//        return inputDialogReturnValue;
//    }
//
//    // -------------------------------------------------------------------------
//}
