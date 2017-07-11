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
import org.eclipse.emf.edit.tree.TreeNode
import org.eclipse.emf.ecore.EReference
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsExtensionOLD
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element
import de.cau.cs.kieler.sccharts.ptx.xmi.XMIModelExtensions

/**
 * Import SCCharts from PTC
 * 
 * @author cmot
 * @kieler.design 2017-06-15 proposed cmot
 * @kieler.rating 2017-06-15 proposed yellow
 */
public class PTC2SCCharts {

    @Inject
    extension XMIModelExtensions

    @Inject
    extension PTCXMIUMLExtensions

    @Inject
    extension KEffectsExtensions

    @Inject
    extension SCChartsExtension;

    @Inject
    extension KExpressionsCreateExtensions;

    @Inject
    extension KExpressionsValuedObjectExtensions;

    // GuiceModulesExecutableExtensionFactory
    HashMap<EObject, EObject> src2target = new HashMap();
    HashMap<EObject, EObject> target2src = new HashMap();

    HashMap<String, EObject> id2src = new HashMap();
    HashMap<EObject, String> src2id = new HashMap();

    HashMap<String, ValuedObject> id2input = new HashMap();

    /** Create an injector to load the transformation via guice. */
    private static Injector injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();

    def String fixId(String name) {
        var returnName = name
        returnName = returnName.replace(" ", "")
        returnName = returnName.replace("-", "")
        returnName = returnName.replace("*", "")
        returnName = returnName.replace("/", "")
        returnName = returnName.replace("\\", "")
        returnName = returnName.replace("\"", "")
        returnName = returnName.replace("'", "")
        return returnName
    }

//    def Object name(EObject content) {
//        return "EObject:null";
//    }
    def State current(List<State> targetModel) {
        if (targetModel.nullOrEmpty) {
            src2target.clear
            target2src.clear
            id2src.clear
            src2id.clear
            var scchart = SCChartsFactory::eINSTANCE.createState;
            targetModel.add(scchart)
        }
        return targetModel.last
    }

    def void map(Element element, EObject target) {
        src2target.put(element, target);
        target2src.put(target, element);

        id2src.put(element.id, element);
        src2id.put(element, element.id);
    }

    def EObject src2target(EObject src) {
        return src2target.get(src)
    }

    def EObject target2src(EObject target) {
        return target2src.get(target)
    }

    def EObject id2src(String id) {
        return id2src.get(id)
    }

    def String src2id(EObject src) {
        return src2id.get(src)
    }

    def ValuedObject id2input(String id) {
        return id2input.get(id)
    }

    def void transformStateMachine(List<State> targetModel, Element element) {
        src2target.clear
        target2src.clear
        id2src.clear
        src2id.clear
        var scchart = SCChartsFactory::eINSTANCE.createState;
        targetModel.add(scchart)
        scchart.id = element.name.fixId;
        println("CREATE STATEMACHINE '" + scchart.id + "' for " + element.hashCode)
        element.map(scchart)
        targetModel.transformGeneral(element)
    }

    def void transformRegion(List<State> targetModel, Element element, EObject srcParent) {
        println("CREATE REGION for parent " + srcParent.hashCode)
        val state = src2target.get(srcParent) as State;
        val region = state.createControlflowRegion("Region");
        element.map(region)
        targetModel.transformGeneral(element)
    }

    def void transformPseudostate(List<State> targetModel, Element element, EObject srcParent) {
        println("CREATE INIT STATE '" + element.name + "' with id " + element.id)
        // if (element.name.startsWith("Initial")) {
        if (element.kind != "junction") {
            val state = (src2target.get(srcParent) as ControlflowRegion).createInitialState(element.name.fixId).
                uniqueName;
            element.map(state)
            targetModel.transformGeneral(element)
        } else {
            val state = (src2target.get(srcParent) as ControlflowRegion).createState(element.name.fixId).uniqueName;
            state.setTypeConnector
            element.map(state)
            targetModel.transformGeneral(element)
        }
    }

    def void transformFinalState(List<State> targetModel, Element element, EObject srcParent) {
        println("CREATE FINAL STATE '" + element.name + "' with id " + element.id)
        val state = (src2target.get(srcParent) as ControlflowRegion).createFinalState(element.name.fixId).uniqueName;
        element.map(state)
        targetModel.transformGeneral(element)
    }

    def void transformState(List<State> targetModel, Element element, EObject srcParent) {
        println("CREATE STATE '" + element.name + "' with id " + element.id)
        val state = (src2target.get(srcParent) as ControlflowRegion).createState(element.name.fixId).uniqueName;
        element.map(state)
        targetModel.transformGeneral(element)

//        for (child : element.eContents.toList) {
//            val childElement = child as Element
//            if (childElement != null) {
//                println(
//                    "STATE CHILD eAllContents XXXXXXXXXX: [" + childElement.eClass.name + "]  " + childElement.name +
//                        " : " + childElement.id + " --- " + childElement.kind);
//
//                if (child instanceof Element) {
//                }
//            }
//        }

// TODO: Entry & Exit
    /*
     *                       <subvertex xmi:type = "uml:State" xmi:id = "_b1665af3-fe27-11d2-a541-00104bb05af8" name = "FlashOn">
     *                         <entry xmi:id = "_b1665afe-fe27-11d2-a541-00104bb05af8Activ" xmi:type = "uml:Activity" name = "Lights::Amber(1);">
     *                         </entry>
     *                         <exit xmi:id = "_98368722-fe2c-11d2-a541-00104bb05af8Activ" xmi:type = "uml:Activity" name = "Lights::Amber(0);">
     *                         </exit>
     */
    }

    def transformActivity(List<State> targetModel, Element element) {
        if (element.umlType != "Activity") {
            return
        }
        if (element.type == "entry" || element.umlType == "exit") {
        val parentState = element.parentAnyState
        if (parentState != null) {
                 if (element.type == "entry") {
                        val action = (parentState.src2target as State).createEntryAction
                        action.addEffect(asHostcodeEffect(element.name))
                 }
                 if (element.umlType == "exit") {
                        val action = (parentState.src2target as State).createExitAction
                        action.addEffect(asHostcodeEffect(element.name))
                 }
        }
            
            
        }
    }

    def transformEvent(List<State> targetModel, Element element) {
//        val varName = element.name
//        val declaration = KExpressionsFactory::eINSTANCE.createDeclaration
//        declaration.input = true
//        declaration.type = ValueType::BOOL
//        targetModel.current.declarations.add(declaration)
//        val valuedObject = createValuedObject(targetModel.current, varName, declaration)
//        element.map(valuedObject)
//        id2input.put(element.id, valuedObject)
    }

    def transformProperty(List<State> targetModel, Element element) {
//        if ((element == null) || (element.name == null)) {
//            return
//        }
//        val varName = element.name.replace(" ", "")
//
//        println(" $$$ ADDING PROPERTY: '" + varName + "'");
//        val declaration = KExpressionsFactory::eINSTANCE.createDeclaration
//        // declaration.input = true
//        declaration.type = ValueType::INT
//        targetModel.current.declarations.add(declaration)
//        val valuedObject = createValuedObject(targetModel.current, varName, declaration)
//        element.map(valuedObject)
//        id2input.put(element.id, valuedObject)
    }

    /*
     *         <packagedElement xmi:type = "uml:Class" xmi:id = "_43442151-fbf2-11d2-a53d-00104bb05af8" name = "Controller">
     *           <ownedAttribute xmi:type = "uml:Property" xmi:id = "_0018e606-fd6b-11d2-a540-00104bb05af8" name = "ped_wait" type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" visibility = "private" aggregation = "composite">
     *             <defaultValue xmi:type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" xmi:id = "_0018e606-fd6b-11d2-a540-00104bb05af8defaultValue" value = "0"/>
     *           </ownedAttribute>
     *           <ownedAttribute xmi:type = "uml:Property" xmi:id = "_98368725-fe2c-11d2-a541-00104bb05af8" name = "flashes" type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" visibility = "private" aggregation = "composite">
     *           </ownedAttribute>
     */
    def transformTransition(List<State> targetModel, Element element) {
        println(" --> TRANSITION: from " + element.source + " to " + element.target);

        val src = element.source.id2src.src2target
        val dst = element.target.id2src.src2target

        if ((src instanceof State) && (dst instanceof State)) {
            val transition = (src as State).createTransitionTo(dst as State)
            if ((src as State).isInitial) {
                transition.immediate = true
            }

            for (attribute : element.attributes.toList) {
                println("TRANSITION XXXXXXXXXX: " + attribute.name + " = " + attribute.value);
            }
            for (child : element.eAllContents.toList) {
                println("TRANSITION XXXXXXXXXX: " + child.class.getName + " : " + child.id);

                if (child instanceof Element)
                    if (child.event != null) {
                        targetModel.transformTrigger(child, element)

                    } else if (child.body != null) {
                        transition.label = child.body
                    }
            }

        }
    }

    def transformTrigger(List<State> targetModel, Element element, Element parentElement) {
//        val transition = parentElement.src2target as Transition
//        println(" --> TRIGGER FOR TRANSITION: " + transition);
//
//        if (transition != null) {
//            val valuedObject = element.event.id2input
//            println(" --> TRIGGER ValuedObject: " + valuedObject.name);
//            transition.trigger = valuedObject.reference
//        }
    }

    def transformOpaqueBehavior(List<State> targetModel, Element element) {
        //
    }

    def transformConstraint(List<State> targetModel, Element element) {
        //
    }

    def transformOpaqueExpression(List<State> targetModel, Element element) {
        //
    }

    def transformOperation(List<State> targetModel, Element element) {
        //
    }

    def transformParameter(List<State> targetModel, Element element) {
        //
    }

    def transformGeneral(List<State> targetModel, Element element) {
        for (childElement : element.children) {
            println("UML TYPE:" + childElement.umlType)
            if (childElement.id.endsWith("Event")) {
                targetModel.transformEvent(childElement)
            } else if (childElement.isUMLStateMachine) {
                targetModel.transformStateMachine(childElement)
            } else if (childElement.isUMLRegion) {
                targetModel.transformRegion(childElement, element)
            } else if (childElement.isUMLPseudostate) {
                targetModel.transformPseudostate(childElement, element)
            } else if (childElement.isUMLFinalState) {
                targetModel.transformFinalState(childElement, element)
            } else if (childElement.isUMLState) {
                targetModel.transformState(childElement, element)
            } else if (childElement.isUMLActivity) {
                targetModel.transformActivity(childElement)
            } else if (childElement.isUMLTransition) {
                targetModel.transformTransition(childElement)
            } else if (childElement.isUMLTrigger) {
                targetModel.transformTrigger(childElement, element)
            } else if (childElement.isUMLOpaqueBehavior) {
                targetModel.transformOpaqueBehavior(childElement)
            } else if (childElement.isUMLOpaqueExpression) {
                targetModel.transformOpaqueExpression(childElement)
            } else if (childElement.isUMLOperation) {
                targetModel.transformOperation(childElement)
            } else if (childElement.isUMLParameter) {
                targetModel.transformParameter(childElement)
            } else if (childElement.isUMLOpaqueBehavior) {
                targetModel.transformOpaqueBehavior(childElement)
            } else if (childElement.isUMLProperty) {
                targetModel.transformProperty(childElement)
            } else if (childElement.children.size > 0) {
                // A container
                targetModel.transformGeneral(childElement)
            }

        }
    }

    def transform(EObject model) {
        println("XXXXXX: " + model.eClass.name + ":" + model.eContents.length);

        var sccharts = newArrayList() // <State>;
        sccharts.transformGeneral(model as Element)

        for (scchart : sccharts) {
            scchart.fixAllPriorities.fixAllTextualOrdersByPriorities
        }

        return sccharts

//        for (content : model.eAllContents.toList) {
//             println("---XXXXXX: " + content.eClass.name + ":" + content.eContents.length);
//             
//             if (content.eClass.name == "StateMachine") {
//             //if (content instanceof StateMachine) {
//                 println("-----XXXXXXXXX STATEMACHINE '" + (content as Element).name + "'");
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
//        for (attribute : element.anyAttribute.toList) {
//            println("STATE CHILD anyAttribute XXXXXXXXXX: " + attribute.EStructuralFeature.getName + " = " + attribute.value);
//        }
