package de.cau.cs.kieler.synccharts.custom.update;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * This class handles the migration from Synccharts 0.1 to 0.2.
 * 
 * @author soh
 * 
 */
public class UpdateResourceFactoryImpl extends XMIResourceFactoryImpl {

    /**
     * {@inheritDoc}
     */
    @Override
    public Resource createResource(final URI uri) {
        XMIResource resource = (XMIResource) super.createResource(uri);

        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                Shell parent = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getShell();
                PlatformUI.getWorkbench().getProgressService();
                ProgressMonitorDialog dialog = new ProgressMonitorDialog(parent);
                try {
                    dialog.run(true, false, new IRunnableWithProgress() {

                        public void run(IProgressMonitor monitor)
                                throws InvocationTargetException,
                                InterruptedException {
                            monitor.beginTask(
                                    "Converting Synccharts 0.1 to 0.2!",
                                    IProgressMonitor.UNKNOWN);
                            doPreprocessing(uri);
                            monitor.done();
                        }
                    });
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Map<Object, Object> defaultLoadOptions = resource
                .getDefaultLoadOptions();
        defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
                Boolean.TRUE);
        defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
                new SyncchartsResourceHandler());
        defaultLoadOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
                XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);

        return resource;
    }

    /**
     * Perform pre-processing steps that have to be done before the parser can
     * start to load the file. This is necessary because some features that have
     * changed are not recorded by the record unknown features flag and can
     * cause the file not to be opened.
     * 
     * @param uri
     *            the location of the file
     */
    private void doPreprocessing(final URI uri) {
        ExtensibleURIConverterImpl conv = new ExtensibleURIConverterImpl();

        try {
            InputStream is = conv.createInputStream(uri);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));

            // contains result to be written back to file
            List<String> lines = new LinkedList<String>();
            boolean modified = false;

            String s = reader.readLine();
            while (s != null) {

                if (s
                        .contains("xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2\"")) {
                    is.close();
                    return;
                }

                // variable types are now in lower case, changed integer to int
                String newString = s.replaceAll("type=\"INTEGER\"",
                        "type=\"int\"");
                newString = newString.replaceAll("type=\"UNSIGNED\"",
                        "type=\"unsigned\"");
                newString = newString.replaceAll("type=\"PURE\"",
                        "type=\"pure\"");
                newString = newString.replaceAll("type=\"BOOL\"",
                        "type=\"bool\"");
                newString = newString.replaceAll("type=\"FLOAT\"",
                        "type=\"float\"");
                newString = newString.replaceAll("type=\"HOST\"",
                        "type=\"host\"");

                // triggersAndEffects is now called label
                newString = newString.replaceAll("triggersAndEffects=\"",
                        "label=\"");

                // host code is now called textual code
                newString = newString.replaceAll(
                        "xsi:type=\"synccharts:HostCode\"",
                        "xsi:type=\"synccharts:TextualCode\"");

                // complex expression with an operator are now called operator
                // expressions
                newString = newString
                        .replaceAll(
                                "xsi:type=\"synccharts:ComplexExpression\" operator=\"",
                                "xsi:type=\"synccharts:OperatorExpression\" operator=\"");

                // renaming -> substitution, formal = oldID, actual = newID
                newString = newString.replaceAll(
                        "xsi:type=\"synccharts:Renaming\" oldID=\"",
                        "xsi:type=\"synccharts:Substitution\" formal=\"");
                if (newString.contains("xsi:type=\"synccharts:Substitution\"")) {
                    newString = newString.replaceAll("newID=\"", "actual=\"");
                }

                newString = newString.replaceAll("targetState=\"//@",
                        "DUMMY_targetState=\"//@");

                if (newString.contains("regions") && newString.contains("id")) {
                    newString = newString.replace("id", "DUMMY_id");
                }

                lines.add(newString);
                s = reader.readLine();

                if (!modified && !s.equals(newString)) {
                    modified = true;
                }
            }
            is.close();

            if (modified) {
                String line2 = lines.get(1);
                line2 = line2
                        .replace(
                                "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts\"",
                                "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2\"");
                lines.set(1, line2);

                // write modified lines back to file
                OutputStream os = conv.createOutputStream(uri);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                        os));
                for (String line : lines) {
                    bw.write(line + "\n");
                    bw.flush();
                }
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This class is responsible for handling the unknown features. For example
     * renaming triggersAndEffects to label.
     * 
     * @author soh
     * 
     */
    private class SyncchartsResourceHandler extends BasicResourceHandler {

        @Override
        public void preLoad(final XMLResource resource,
                final InputStream inputStream, final Map<?, ?> options) {
            // doPreprocessing(lastURI);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void postLoad(final XMLResource resource,
                final InputStream inputStream, final Map<?, ?> options) {
            Map<EObject, AnyType> extMap = resource.getEObjectToExtensionMap();
            for (Iterator<Map.Entry<EObject, AnyType>> itr = extMap.entrySet()
                    .iterator(); itr.hasNext();) {
                Map.Entry<EObject, AnyType> entry = itr.next();
                EObject key = entry.getKey();
                AnyType value = entry.getValue();
                handleUnknownData(key, value);
            }
        }

        /**
         * Handle all unknown data in the loaded resource.
         * 
         * @param eObj
         *            the resource containing the unknown data.
         * @param unknownData
         *            the unknown data
         */
        private void handleUnknownData(final EObject eObj,
                final AnyType unknownData) {
            handleUnknownFeatures(eObj, unknownData.getMixed());
            handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
        }

        /**
         * Handle the unknown features of a specific type.
         * 
         * @param owner
         *            the containing resource
         * @param featureMap
         *            the feature map
         */
        private void handleUnknownFeatures(final EObject owner,
                final FeatureMap featureMap) {
            for (Iterator<?> iter = featureMap.iterator(); iter.hasNext();) {
                FeatureMap.Entry entry = (FeatureMap.Entry) iter.next();
                EStructuralFeature f = entry.getEStructuralFeature();
                if (handleUnknownFeature(owner, f, entry.getValue())) {
                    iter.remove();
                }
            }
        }

        /**
         * Handle a specific unknown feature.
         * 
         * @param owner
         *            the containing resource
         * @param f
         *            the unknown feature
         * @param value
         *            the unknown value
         * @return true if the feature could be handled, else false
         */
        private boolean handleUnknownFeature(final EObject owner,
                final EStructuralFeature f, final Object value) {
            if (f.getName().equals("DUMMY_targetState")) {
                Transition trans = (Transition) owner;
                Region parent = trans.getSourceState().getParentRegion();

                for (State state : parent.getInnerStates()) {
                    URI uri = EcoreUtil.getURI(state);
                    String uriString = uri.toString();
                    uriString = uriString.substring(uriString.indexOf("#") + 1);
                    if (uriString.equals(value)) {
                        trans.setTargetState(state);
                        return true;
                    }
                }
            }
            if (f.getName().equals("DUMMY_id")) {
                Region region = (Region) owner;
                region.setId((String) value);
                region.setLabel((String) value);
            }
            return false;
        }

    }

}
