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

/**
 * The abstract handler for SCCharts file formats scc and sct.
 * 
 * @author cmot
 * @kieler.design 2015-02-15 proposed cmot
 * @kieler.rating 2015-02-15 proposed yellow
 */
public class PTCModelFileHandler extends PTCAbstractConvertModelHandler {

    extension SCChartsExtension;

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
        val pts2sccharts = Guice.createInjector().getInstance(PTC2SCCharts);
        return pts2sccharts.transform(model);
    }

    override preprocessFile(String content) {
        // Only extraxt the first uml model
        val startIndex = content.indexOf("<uml:Model name");
        val endIndex = content.indexOf("</uml:Model>");
        var returnText = "";
        returnText = returnText + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        returnText = returnText +
            "<xmi:XMI xmlns:xmi = \"http://www.omg.org/spec/XMI/20110701\" xmlns:uml = \"http://www.omg.org/spec/UML/20110701\" >";
        returnText = returnText + content.substring(startIndex, endIndex);
        returnText = returnText + "</uml:Model></xmi:XMI>";
        return returnText;
    }
    
    override doOpenEditor(Object modelObject, ExecutionEvent event, 
            ISelection selection) {
        return true;
    }
}
