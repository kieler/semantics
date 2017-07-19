package de.cau.cs.kieler.sccharts.ptc;

import com.google.inject.Guice
import com.google.inject.Injector
import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import java.util.HashMap
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelection
import org.eclipse.emf.common.util.URI
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModelParser
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModelSerializer
import de.cau.cs.kieler.sccharts.ptc.dialog.ImportOptionsDialog
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModelExtensions

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2015-02-15 proposed cmot
 * @kieler.rating 2015-02-15 proposed yellow
 */
public class PTCModelFileHandler extends PTCAbstractConvertModelHandler {
    
    public static String OPTION_EXPAND_SUBSTATEMACHINES = " Expand Substatemachines"
    public static String OPTION_NO_TRANSITIONS = " Skip Transitions"
    public static String OPTION_NO_ENTRYEXIT = " Skip Entry/Exit Actions"
    public static String OPTION_HOSTLABELS = " Transition Hostcode Labels"
    public static String OPTION_ADDTRIGGERS = "XAdd Triggers to untriggered Transitions";
    
    public static String[] options = #[OPTION_EXPAND_SUBSTATEMACHINES, 
                                       OPTION_NO_TRANSITIONS,
                                       OPTION_NO_ENTRYEXIT,
                                       OPTION_HOSTLABELS, 
                                       OPTION_ADDTRIGGERS
    ];

    @Inject
    extension SCChartsExtension;

    @Inject
    extension PTCXMIUMLExtensions;

    @Inject
    extension XMIModelExtensions;

    // GuiceModulesExecutableExtensionFactory
    HashMap<EObject, EObject> src2target = new HashMap();
    HashMap<EObject, EObject> target2src = new HashMap();

    /** Create an injector to load the transformation via guice. */
    private static Injector injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();

    override protected createResourceInjector() {
        // Use an Xtext parser, it will handle the XMI
        return injector;
    }

    override protected getSourceExtension(String originalExtension) {
        return "uml";
    }

    override protected getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "sct";
    }

    override protected transform(EObject model, ExecutionEvent event, ISelection selection) {
        
                

        ImportOptionsDialog.optionList = options
        ImportOptionsDialog.statemachineList = (model as Element).getStatemachines
        val ok = showImportOptionsDialog();
        
        if (ok) { 
            val pts2sccharts = Guice.createInjector().getInstance(PTC2SCCharts);
            return pts2sccharts.transform(model, ImportOptionsDialog.statemachineList,
                ImportOptionsDialog.optionListSelected);
        } else {
            return null
        }

    }

    def String getStatemachineName(Element elem) {
        var boolean isStatemachine = false
        var String stateMachineName = null
        for (attrib : elem.attributes) {
            if (attrib.name == "xmi:type") {
                if (attrib.value == "uml:StateMachine") {
                    isStatemachine = true
                }

            }
            if (attrib.name == "name") {
                stateMachineName = attrib.value
            }

        }
        if (isStatemachine) {
            return stateMachineName
        }
        return null
    }

    def List<String> getStatemachines(Element model) {
        val List<String> returnList = newArrayList
        val allContent = model.eAllContents.filter[e|(e instanceof Element)].toList
        for (stateMachine : allContent.filter[e|getStatemachineName(e as Element) != null].toList) {
            returnList.add((stateMachine as Element).getStatemachineName)
        }
        return returnList
    }

    def String removeSection(String text, String startTag, String endTag, boolean removeAll) {
        var returnText = text;

        while (true) {
            val startIndex = returnText.indexOf(startTag)
            val endIndex = returnText.indexOf(endTag, startIndex)

            if ((startIndex < 0) || (endIndex < 0)) {
                return returnText
            }

            returnText = returnText.substring(0, startIndex) +
                returnText.substring(endIndex + endTag.length, returnText.length)

            if (!removeAll) {
                return returnText
            }
        }
    }

    def String extractSection(String text, String startTag, String endTag, String whenContainsText) {
        var returnText = text;
        var lastStart = 0

        while (true) {
            val startIndex = text.indexOf(startTag, lastStart)
            val endIndex = text.indexOf(endTag, startIndex)

            if ((startIndex < 0) || (endIndex < 0)) {
                return returnText
            }

            returnText = text.substring(startIndex, endIndex + endTag.length)
            if (returnText.contains(whenContainsText)) {
                return returnText
            }
        }

    }

    override preprocessFile(String content) {

//        val model = XMIModelParser.parse(content)
//        val serialized = XMIModelSerializer.serialize(model);        
//        val output = URI.createURI("platform:/resource/SCCharts/test.xmi");
//        saveToFile(output, serialized);
//
//        
//        val startIndex = content.indexOf("<uml:Model name");
//        val endIndex = content.indexOf("</uml:Model>");
//        var returnText = "";
//        returnText = returnText + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
//        returnText = returnText +
//            "<xmi:XMI xmlns:xmi = \"http://www.omg.org/spec/XMI/20110701\" xmlns:uml = \"http://www.omg.org/spec/UML/20110701\" >";
//        returnText = returnText + content.substring(startIndex, endIndex);
//        returnText = returnText + "</uml:Model></xmi:XMI>";
//        
//        
//        returnText = returnText.replace("<entry ", "<entry kind=\"entry\" ")
//        returnText = returnText.replace("<exit ", "<exit kind=\"exit\" ")
//        
        // Remove
        // <ownedBehavior xmi:type = "uml:Activity"
        // ..
        // </ownedBehavior>
        // returnText = returnText.removeSection("<ownedBehavior xmi:type = \"uml:Activity\"", "</ownedBehavior>", true)
        // Remove
        // <packagedElement xmi:type = "uml:Class"
        // </packagedElement>
        // returnText = returnText.removeSection("<packagedElement xmi:type = \"uml:Class\"", "</packagedElement>", true)
//        returnText = returnText.extractSection(
//        "<packagedElement xmi:type = \"uml:Package\"",
//        "",
//        "<ownedBehavior xmi:type = \"uml:StateMachine\"");
//
//        val output = URI.createURI("platform:/resource/SCCharts/test.xmi");
//        saveToFile(output, returnText);
////        print(returnText)
//
//        return returnText;
        return content
    }

    override doOpenEditor(Object modelObject, ExecutionEvent event, ISelection selection) {
        return true;
    }
}
