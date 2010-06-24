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
import org.eclipse.jface.dialogs.MessageDialog;
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

    private boolean isFileOutOfDate(final URI uri) {
        ExtensibleURIConverterImpl conv = new ExtensibleURIConverterImpl();

        if (!conv.exists(uri, null)) {
            return false;
        }

        try {
            InputStream is = conv.createInputStream(uri);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));

            // contains result to be written back to file
            String s = reader.readLine();
            int lineIndex = 0;
            while (s != null) {

                if (lineIndex == 1) {
                    if (!s.contains(getVersionURI(Version.v_0_2_1))) {
                        return askUser();
                    }
                }
                s = reader.readLine();
                lineIndex++;
            }
            is.close();
        } catch (IOException e0) {
            e0.printStackTrace();
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Resource createResource(final URI uri) {
        XMIResource resource = (XMIResource) super.createResource(uri);

        if (isFileOutOfDate(uri)) {

            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    Shell parent = PlatformUI.getWorkbench()
                            .getActiveWorkbenchWindow().getShell();
                    PlatformUI.getWorkbench().getProgressService();
                    ProgressMonitorDialog dialog = new ProgressMonitorDialog(
                            parent);
                    try {
                        dialog.run(true, false, new IRunnableWithProgress() {

                            public void run(IProgressMonitor monitor)
                                    throws InvocationTargetException,
                                    InterruptedException {
                                monitor
                                        .beginTask(
                                                "Converting Synccharts from older version.",
                                                IProgressMonitor.UNKNOWN);

                                try {
                                    doPreprocessing(uri, monitor);
                                } catch (UpdateException e0) {
                                    throw new UpdateRuntimeException(e0
                                            .getMessage(), e0.getCause());
                                }

                                monitor.done();
                            }
                        });
                    } catch (InvocationTargetException e) {
                        Throwable excep = e.getCause();
                        if (excep instanceof UpdateRuntimeException) {
                            throw (UpdateRuntimeException) excep;
                        }
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }

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

    private enum Version {
        v_0_1, v_0_2, v_0_2_1;
    }

    /**
     * Perform pre-processing steps that have to be done before the parser can
     * start to load the file. This is necessary because some features that have
     * changed are not recorded by the record unknown features flag and can
     * cause the file not to be opened.
     * 
     * @param uri
     *            the location of the file
     * @param monitor
     * @throws UpdateException
     */
    private void doPreprocessing(final URI uri, final IProgressMonitor monitor)
            throws UpdateException {
        monitor.subTask("Converting v0.1 to v0.2");
        convert(uri, Version.v_0_1);
        monitor.subTask("Converting v0.2 to v0.2.1");
        convert(uri, Version.v_0_2);
    }

    /**
     * @param uri
     * @param version
     * @throws UpdateException
     */
    private void convert(URI uri, Version version) throws UpdateException {
        ExtensibleURIConverterImpl conv = new ExtensibleURIConverterImpl();

        try {
            if (!conv.exists(uri, null)) {
                return;
            }
            InputStream is = conv.createInputStream(uri);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));

            // contains result to be written back to file
            List<String> lines = new LinkedList<String>();
            boolean modified = false;

            String s = reader.readLine();
            int lineIndex = 0;
            while (s != null) {

                if (lineIndex == 1) {
                    if (!s.contains(getVersionURI(version))) {
                        is.close();
                        return;
                    }
                }

                String newString = s;
                switch (version) {
                case v_0_1:
                    newString = convertLineV_0_1(s);
                    break;
                case v_0_2:
                    newString = convertLineV_0_2(s);
                    break;
                case v_0_2_1:
                    return;
                }
                lines.add(newString);
                s = reader.readLine();

                if (!modified && !s.equals(newString)) {
                    modified = true;
                }
                lineIndex++;
            }
            is.close();

            if (modified) {
                String line2 = lines.get(1);
                line2 = line2.replace(getVersionURI(version),
                        getVersionURI(getNextVersion(version)));
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
            throw new UpdateException(e);
        }
    }

    private static class UpdateException extends Exception {

        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public UpdateException(final String s) {
            super(s);
        }

        public UpdateException(final Throwable cause) {
            super(cause);
        }

    }

    private static class UpdateRuntimeException extends RuntimeException {

        /**
        *
        */
        private static final long serialVersionUID = 1L;

        public UpdateRuntimeException(final String s, final Throwable cause) {
            super(s, cause);
        }

    }

    private boolean dummyResult = false;

    /**
     * @throws UpdateException
     * 
     */
    private boolean askUser() {
        dummyResult = false;
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                Shell parent = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getShell();
                dummyResult = MessageDialog.openQuestion(parent,
                        "Old Synccharts version detected.",
                        "Convert to new version?");
            }
        });

        return dummyResult;
    }

    private static final String[] V_0_2_EXPRESSION = { "SignalReference",
            "VariableReference", "Emission", "TextualCode", "Expression",
            "ComplexExpression", "Value", "ValuedObject",
            "OperationExpression", "Signal", "Variable", "FloatValue",
            "IntValue", "BooleanValue" };

    /**
     * @param s
     * @return
     */
    private String convertLineV_0_2(String s) {
        String result = s;
        if (result.contains(getVersionURI(Version.v_0_2))) {
            result = result
                    .replace(
                            getVersionURI(Version.v_0_2),
                            getVersionURI(Version.v_0_2)
                                    + " xmlns:expressions=\"http://kieler.cs.cau.de/expressions\"");
        }

        for (String expr : V_0_2_EXPRESSION) {
            if (result.contains(expr)) {
                result = result.replaceAll("xsi:type=\"synccharts:" + expr
                        + "\"", "xsi:type=\"expressions:" + expr + "\"");
            }
        }
        return result;
    }

    /**
     * @param version
     * @return
     */
    private Version getNextVersion(Version version) {
        switch (version) {
        case v_0_1:
            return Version.v_0_2;
        case v_0_2:
            return Version.v_0_2_1;
        case v_0_2_1:
            return null;
        }
        return null;
    }

    /**
     * @param s
     * @return
     */
    private String convertLineV_0_1(String s) {
        // variable types are now in lower case, changed integer to int
        String newString = s.replaceAll("type=\"INTEGER\"", "type=\"int\"");
        newString = newString.replaceAll("type=\"UNSIGNED\"",
                "type=\"unsigned\"");
        newString = newString.replaceAll("type=\"PURE\"", "type=\"pure\"");
        newString = newString.replaceAll("type=\"BOOL\"", "type=\"bool\"");
        newString = newString.replaceAll("type=\"FLOAT\"", "type=\"float\"");
        newString = newString.replaceAll("type=\"HOST\"", "type=\"host\"");

        // triggersAndEffects is now called label
        newString = newString.replaceAll("triggersAndEffects=\"", "label=\"");

        // host code is now called textual code
        newString = newString.replaceAll("xsi:type=\"synccharts:HostCode\"",
                "xsi:type=\"synccharts:TextualCode\"");

        // complex expression with an operator are now called operator
        // expressions
        newString = newString.replaceAll(
                "xsi:type=\"synccharts:ComplexExpression\" operator=\"",
                "xsi:type=\"synccharts:OperatorExpression\" operator=\"");

        // renaming -> substitution, formal = oldID, actual = newID
        newString = newString.replaceAll(
                "xsi:type=\"synccharts:Renaming\" oldID=\"",
                "xsi:type=\"synccharts:Substitution\" formal=\"");
        if (newString.contains("xsi:type=\"synccharts:Substitution\"")) {
            newString = newString.replaceAll("newID=\"", "actual=\"");
        }

        newString = newString.replaceAll(" targetState=\"//@",
                " DUMMY_targetState=\"//@");

        if (newString.contains("regions") && newString.contains("id")) {
            newString = newString.replace(" id", " DUMMY_id");
        }
        return newString;
    }

    /**
     * @param version
     * @return
     */
    private String getVersionURI(Version version) {
        switch (version) {
        case v_0_1:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts\"";
        case v_0_2:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2\"";
        case v_0_2_1:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2.1\"";
        }
        return null;
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
                if (owner instanceof Region) {
                    Region region = (Region) owner;
                    region.setId((String) value);
                    region.setLabel((String) value);
                }
                if (owner instanceof State) {
                    State state = (State) owner;
                    state.setId((String) value);
                }
            }
            return false;
        }

    }

}
