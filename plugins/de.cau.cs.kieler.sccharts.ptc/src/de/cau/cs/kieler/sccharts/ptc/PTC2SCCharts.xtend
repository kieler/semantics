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

/**
 * Import SCCharts from PTC
 * 
 * @author cmot
 * @kieler.design 2017-06-15 proposed cmot
 * @kieler.rating 2017-06-15 proposed yellow
 */
public class PTC2SCCharts {

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

//    def Object name(EObject content) {
//        return "EObject:null";
//    }
    def String attributeByName(AnyType content, String attributeName) {
        for (attribute : content.anyAttribute) {
            if (attribute.EStructuralFeature.getName == attributeName) {
                return attribute.value as String
            } else {
//                println("  ATTRIB '"+attribute.EStructuralFeature.getName+"' = '" + attribute.value + "'" );
            }
        }
        return null;
    }

//    def TreeNode attributeReferenceByName(AnyType content, String attributeName) {
//        for (attribute : content.getMixed) {
//            println("  MIXED '"+attribute.EStructuralFeature.getName+"' = '" + attribute.value + "'" );
//            if (attribute.EStructuralFeature.getName == attributeName) {
//                if (attribute instanceof EReference) {
//                    return attribute.value as TreeNode
//                }
//            }
//        }
//        println("");
//        return null;
//    }    
    def String name(AnyType content) {
        return content.attributeByName("name")
    }

    def String source(AnyType content) {
        return content.attributeByName("source")
    }

    def String target(AnyType content) {
        return content.attributeByName("target")
    }

    def String guard(AnyType content) {
        return content.attributeByName("guard")
    }

    def String body(AnyType content) {
        return content.attributeByName("body")
    }

    def String kind(AnyType content) {
        return content.attributeByName("kind")
    }

    def String event(AnyType content) {
        return content.attributeByName("event")
    }

//    def TreeNode source(AnyType content) {
//        return content.attributeReferenceByName("source")
//    }
//    def TreeNode target(AnyType content) {
//        return content.attributeReferenceByName("target")
//    }
    def String getId(AnyType content) {
        return (content as EObject).eResource.getURIFragment(content);
    }

    def void map(AnyType element, EObject target) {
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

    def void transformStateMachine(List<State> targetModel, AnyType element) {
//        src2target.clear
//        target2src.clear
//        id2src.clear
//        src2id.clear
//        var scchart = SCChartsFactory::eINSTANCE.createState;
//        targetModel.add(scchart)
        var scchart = targetModel.get(0);
        scchart.id = element.eClass.name;
        println("CREATE STATEMACHINE '" + scchart.id + "' for " + element.hashCode)
        element.map(scchart)
        targetModel.transformGeneral(element)
    }

    def void transformRegion(List<State> targetModel, AnyType element, EObject srcParent) {
        println("CREATE REGION for parent " + srcParent.hashCode)
        val state = src2target.get(srcParent) as State;
        val region = state.createControlflowRegion("Region");
        element.map(region)
        targetModel.transformGeneral(element)
    }

    def void transformPseudostate(List<State> targetModel, AnyType element, EObject srcParent) {
        println("CREATE INIT STATE '" + element.name + "' with id " + element.id)
        // if (element.name.startsWith("Initial")) {
        if (element.kind != "junction") {
            val state = (src2target.get(srcParent) as ControlflowRegion).createInitialState(element.name).uniqueName;
            element.map(state)
            targetModel.transformGeneral(element)
        } else {
            val state = (src2target.get(srcParent) as ControlflowRegion).createState(element.name).uniqueName;
            state.setTypeConnector
            element.map(state)
            targetModel.transformGeneral(element)
        }
    }

    def void transformFinalState(List<State> targetModel, AnyType element, EObject srcParent) {
        println("CREATE FINAL STATE '" + element.name + "' with id " + element.id)
        val state = (src2target.get(srcParent) as ControlflowRegion).createFinalState(element.name).uniqueName;
        element.map(state)
        targetModel.transformGeneral(element)
    }

    def void transformState(List<State> targetModel, AnyType element, EObject srcParent) {
        println("CREATE STATE '" + element.name + "' with id " + element.id)
        val state = (src2target.get(srcParent) as ControlflowRegion).createState(element.name).uniqueName;
        element.map(state)
        targetModel.transformGeneral(element)

//        for (attribute : element.anyAttribute.toList) {
//            println("STATE CHILD anyAttribute XXXXXXXXXX: " + attribute.EStructuralFeature.getName + " = " + attribute.value);
//        }
        for (child : element.eContents.toList) {
            val childElement = child as AnyType
            if (childElement != null) {
                println("STATE CHILD eAllContents XXXXXXXXXX: [" + childElement.eClass.name + "]  " + childElement.name + " : " +
                    childElement.id + " --- " + childElement.kind);

                if (child instanceof AnyType)
                    if (child.kind == "entry") {
                        val action = state.createEntryAction
                        action.addEffect(asHostcodeEffect(childElement.name))
                    }
                    else if (child.kind == "exit") {
                        val action = state.createExitAction
                        action.addEffect(asHostcodeEffect(childElement.name))
                    } else if (child.body != null) {
                        // transition.label = child.body
                    }
            }
        }

    // TODO: Entry & Exit
    /*
     *                       <subvertex xmi:type = "uml:State" xmi:id = "_b1665af3-fe27-11d2-a541-00104bb05af8" name = "FlashOn">
     *                         <entry xmi:id = "_b1665afe-fe27-11d2-a541-00104bb05af8Activ" xmi:type = "uml:Activity" name = "Lights::Amber(1);">
     *                         </entry>
     *                         <exit xmi:id = "_98368722-fe2c-11d2-a541-00104bb05af8Activ" xmi:type = "uml:Activity" name = "Lights::Amber(0);">
     *                         </exit>
     */
    }

    def transformActivity(List<State> targetModel, AnyType element) {
        //
    }

    def transformEvent(List<State> targetModel, AnyType element) {
        val varName = element.name
        val declaration = KExpressionsFactory::eINSTANCE.createDeclaration
        declaration.input = true
        declaration.type = ValueType::BOOL
        targetModel.get(0).declarations.add(declaration)
        val valuedObject = createValuedObject(targetModel.get(0), varName, declaration)
        element.map(valuedObject)
        id2input.put(element.id, valuedObject)
    }

    def transformProperty(List<State> targetModel, AnyType element) {
        if ((element == null) || (element.name == null)) {
            return
        }
        val varName = element.name.replace(" ", "")

        println(" $$$ ADDING PROPERTY: '" + varName + "'");

        val declaration = KExpressionsFactory::eINSTANCE.createDeclaration
        // declaration.input = true
        declaration.type = ValueType::INT
        targetModel.get(0).declarations.add(declaration)
        val valuedObject = createValuedObject(targetModel.get(0), varName, declaration)
        element.map(valuedObject)
        id2input.put(element.id, valuedObject)
    }

    /*
     *         <packagedElement xmi:type = "uml:Class" xmi:id = "_43442151-fbf2-11d2-a53d-00104bb05af8" name = "Controller">
     *           <ownedAttribute xmi:type = "uml:Property" xmi:id = "_0018e606-fd6b-11d2-a540-00104bb05af8" name = "ped_wait" type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" visibility = "private" aggregation = "composite">
     *             <defaultValue xmi:type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" xmi:id = "_0018e606-fd6b-11d2-a540-00104bb05af8defaultValue" value = "0"/>
     *           </ownedAttribute>
     *           <ownedAttribute xmi:type = "uml:Property" xmi:id = "_98368725-fe2c-11d2-a541-00104bb05af8" name = "flashes" type = "_bf9531dd-fd6d-429c-9c77-72c228475b8e" visibility = "private" aggregation = "composite">
     *           </ownedAttribute>
     */
    def transformTransition(List<State> targetModel, AnyType element) {

        println(" --> TRANSITION: from " + element.source + " to " + element.target);

        val src = element.source.id2src.src2target
        val dst = element.target.id2src.src2target

        if ((src instanceof State) && (dst instanceof State)) {
            val transition = (src as State).createTransitionTo(dst as State)
            if ((src as State).isInitial) {
                transition.immediate = true
            }

            for (attribute : element.anyAttribute.toList) {
                println("TRANSITION XXXXXXXXXX: " + attribute.EStructuralFeature.getName + " = " + attribute.value);
            }
            for (child : element.eAllContents.toList) {
                println("TRANSITION XXXXXXXXXX: " + child.class.getName + " : " + child.id);

                if (child instanceof AnyType)
                    if (child.event != null) {
                        targetModel.transformTrigger(child, element)

                    } else if (child.body != null) {
                        transition.label = child.body
                    }
            }

        }
    }

    def transformTrigger(List<State> targetModel, AnyType element, AnyType parentElement) {

        val transition = parentElement.src2target as Transition
        println(" --> TRIGGER FOR TRANSITION: " + transition);

        if (transition != null) {
            val valuedObject = element.event.id2input
            println(" --> TRIGGER ValuedObject: " + valuedObject.name);
            transition.trigger = valuedObject.reference
        }
    }

    def transformOpaqueBehavior(List<State> targetModel, AnyType element) {
        //
    }

    def transformConstraint(List<State> targetModel, AnyType element) {
        //
    }

    def transformOpaqueExpression(List<State> targetModel, AnyType element) {
        //
    }

    def transformOperation(List<State> targetModel, AnyType element) {
        //
    }

    def transformParameter(List<State> targetModel, AnyType element) {
        //
    }

    def void transformClass(List<State> targetModel, AnyType element) {
        println("ENTERING CLASS '" + element.name + "'")
        targetModel.transformGeneral(element)
    }

    def void transformPackage(List<State> targetModel, AnyType element) {
        println("ENTERING PACKAGE '" + element.name + "'")
        targetModel.transformGeneral(element)
    }

    def transformGeneral(List<State> targetModel, AnyType element) {

        for (childElement : element.eContents.toList) {
            println("XXXXXXXXXX: " + childElement.eClass.name + ":" + childElement.eContents.length);

            if (childElement.eClass.name.endsWith("Event")) {
                targetModel.transformEvent(childElement as AnyType)
            }

            if (childElement.eClass.name == "StateMachine") {
                targetModel.transformStateMachine(childElement as AnyType)
            }
            if (childElement.eClass.name == "Region") {
                targetModel.transformRegion(childElement as AnyType, element)
            }
            if (childElement.eClass.name == "Pseudostate") {
                targetModel.transformPseudostate(childElement as AnyType, element)
            }
            if (childElement.eClass.name == "FinalState") {
                targetModel.transformFinalState(childElement as AnyType, element)
            }
            if (childElement.eClass.name == "State") {
                targetModel.transformState(childElement as AnyType, element)
            }
            if (childElement.eClass.name == "Activity") {
                targetModel.transformActivity(childElement as AnyType)
            }
            if (childElement.eClass.name == "Transition") {
                targetModel.transformTransition(childElement as AnyType)
            }
            if (childElement.eClass.name == "Trigger") {
                targetModel.transformTrigger(childElement as AnyType, element)
            }
            if (childElement.eClass.name == "OpaqueBehavior") {
                targetModel.transformOpaqueBehavior(childElement as AnyType)
            }
            if (childElement.eClass.name == "OpaqueExpression") {
                targetModel.transformOpaqueExpression(childElement as AnyType)
            }
            if (childElement.eClass.name == "Operation") {
                targetModel.transformOperation(childElement as AnyType)
            }
            if (childElement.eClass.name == "Parameter") {
                targetModel.transformParameter(childElement as AnyType)
            }
            if (childElement.eClass.name == "Class") {
                targetModel.transformClass(childElement as AnyType)
            }
            if (childElement.eClass.name == "Package") {
                targetModel.transformPackage(childElement as AnyType)
            }
            if (childElement.eClass.name == "OpaqueBehavior") {
                targetModel.transformOpaqueBehavior(childElement as AnyType)
            }
            if (childElement.eClass.name == "Property") {
                targetModel.transformProperty(childElement as AnyType)
            }

        }

    }

    def transform(EObject model) {
        println("XXXXXX: " + model.eClass.name + ":" + model.eContents.length);

        var sccharts = newArrayList() // <State>;
        src2target.clear
        target2src.clear
        id2src.clear
        src2id.clear
        var scchart = SCChartsFactory::eINSTANCE.createState;
        sccharts.add(scchart)

        sccharts.transformGeneral(model as AnyType)

        return sccharts.get(0).fixAllPriorities.fixAllTextualOrdersByPriorities

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
