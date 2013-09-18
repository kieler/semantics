/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom.update;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.ui.part.FileEditorInput;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.kexpressions.Variable;
import de.cau.cs.kieler.core.model.handlers.AbstractInitDiagramHandler;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * This class handles the migration from Synccharts 0.1 to 0.2.1.
 * 
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class UpdateResourceFactoryImpl extends XMIResourceFactoryImpl {

    /**
     *
     */
    public static final Synccharts_MM_Version CURRENT_VERSION = Synccharts_MM_Version.v_0_2_4;

    /**
     * The command for reinitializing the diagram.
     */
    private static AbstractInitDiagramHandler cmd;

    /**
     * Set the reinitialize command for automatic migration. FIXME: currently
     * not active
     * 
     * @param cmdParam
     *            the param
     */
    public static void setReInitDiagramCommand(
            final AbstractInitDiagramHandler cmdParam) {
        cmd = cmdParam;
    }

    /**
     * The file name of the last kixs file that was found.
     */
    private static String lastName;

    /**
     * Check whether the editor is out of date and thrown an exception if it is.
     * 
     * @param input
     *            the file editor input
     */
    public static void checkDiagramEditorInput(final FileEditorInput input) {
        try {
            if (isFileOutOfDate(input.getStorage().getContents())) {
                // TODO: automatic reinit currently disabled
                // IPath path = input.getPath();
                // path = path.removeLastSegments(1).addTrailingSeparator();
                // String pathString = path.toOSString() + lastName;
                // cmd.reinitialize(Path.fromOSString(pathString));
                throw new IllegalArgumentException(
                        "Syncchart diagram is out of date. "
                                + "Please open the corresponding .kixs file and then reinitialize"
                                + " the diagram.");
            }
        } catch (CoreException e0) {
            // e0.printStackTrace();
            return;
        }
    }

    /**
     * @param is
     * @return
     */
    private static boolean isFileOutOfDate(final InputStream is) {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            // contains result to be written back to file
            String s = reader.readLine();
            int lineIndex = 0;
            while (s != null) {
                if (lineIndex == 1) {
                    if (s.contains(getVersionURI(CURRENT_VERSION))) {
                        return false;
                    }
                }

                if (lineIndex > 1) {
                    String[] segments = s.split(" ");
                    for (String segment : segments) {
                        if (segment.startsWith("href=\"")) {
                            segments = segment.replace("href=", "")
                                    .replace("\"", "").split("#");
                            lastName = segments[0];
                            return true;
                        }
                    }
                }
                s = reader.readLine();
                lineIndex++;
            }
            is.close();
        } catch (IOException e0) {
            e0.printStackTrace();
        }
        return true;
    }

    /**
     * @param uri
     * @return
     */
    private boolean isFileOutOfDate(final URI uri) {
        ExtensibleURIConverterImpl conv = new ExtensibleURIConverterImpl();
        if (!conv.exists(uri, null)) {
            return false;
        }
        try {
            return isFileOutOfDate(conv.createInputStream(uri));
        } catch (IOException e0) {
            e0.printStackTrace();
        }
        return false;
    }

    private static boolean wasFileOutOfDate = true;

    /**
     * {@inheritDoc}
     */
    @Override
    public Resource createResource(final URI uri) {
        XMIResource resource = (XMIResource) super.createResource(uri);

        wasFileOutOfDate = false;
        if (isFileOutOfDate(uri) && askUser()) {
            wasFileOutOfDate = true;
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    Shell parent = PlatformUI.getWorkbench()
                            .getActiveWorkbenchWindow().getShell();
                    PlatformUI.getWorkbench().getProgressService();
                    ProgressMonitorDialog dialog = new ProgressMonitorDialog(
                            parent);
                    try {
                        dialog.run(true, false, new IRunnableWithProgress() {

                            public void run(final IProgressMonitor monitor)
                                    throws InvocationTargetException,
                                    InterruptedException {
                                monitor.beginTask(
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
                new SyncchartsResourceHandler(uri));
        defaultLoadOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
                XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);

        return resource;
    }

    /**
     * @author soh
     */
    public enum Synccharts_MM_Version {
        /**
         *
         */
        v_0_1,
        /**
         *
         */
        v_0_2,
        /**
         *
         */
        v_0_2_1,
        /**
        *
        */
        v_0_2_2,
        /**
         * 
         */
        v_0_2_3,
        /**
         * 
         */
        v_0_2_4;
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
        convert(uri, Synccharts_MM_Version.v_0_1);
        monitor.subTask("Converting v0.2 to v0.2.1");
        convert(uri, Synccharts_MM_Version.v_0_2);
        monitor.subTask("Converting v0.2.1 to v0.2.2");
        convert(uri, Synccharts_MM_Version.v_0_2_1);
        monitor.subTask("Converting v0.2.2 to v0.2.3");
        convert(uri, Synccharts_MM_Version.v_0_2_2);
        monitor.subTask("Converting v0.2.3 to v0.2.4");
        convert(uri, Synccharts_MM_Version.v_0_2_3);
    }

    /**
     * @param uri
     * @param version
     * @throws UpdateException
     */
    private void convert(final URI uri, final Synccharts_MM_Version version)
            throws UpdateException {
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
                    newString = convertLineV_0_1ToV_0_2(s);
                    break;
                case v_0_2:
                    newString = convertLineV_0_2ToV_0_2_1(s);
                    break;
                case v_0_2_1:
                    newString = convertLineV_0_2_1ToV_0_2_2(s);
                    break;
                case v_0_2_2:
                    newString = convertLineV_0_2_2ToV_0_2_3(s);
                    break;
                case v_0_2_3:
                    newString = convertLineV_0_2_3ToV_0_2_4(s);
                    break;
                case v_0_2_4:
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
                }
                bw.flush();
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new UpdateException(e);
        }
    }

    /**
     * @param s
     * @return
     */
    private String convertLineV_0_2_2ToV_0_2_3(final String s) {
        String result = s;
        if (result.contains(getVersionURI(Synccharts_MM_Version.v_0_2_2))) {
            result = result.replace(
                    getVersionURI(Synccharts_MM_Version.v_0_2_2),
                    getVersionURI(Synccharts_MM_Version.v_0_2_3));
            result = result
                    .replaceAll(
                            "xmlns:expressions=\"http://kieler.cs.cau.de/expressions/0.1.1\"",
                            "xmlns:expressions=\"http://kieler.cs.cau.de/expressions/0.1.2\"");
        }
        if (result.contains("xsi:type=\"expressions:ValuedObjectReference\"")) {
            result = result.replaceAll(" valuedObject=\"",
                    " DUMMY_valuedObject=\"");
            System.out.println(result);
        }
        if (result.contains("xsi:type=\"synccharts:Emission\"")) {
            result = result.replaceAll(" signal=\"", " DUMMY_signal=\"");
        }
        return result;
    }

    private String convertLineV_0_2_3ToV_0_2_4(final String s) {
        String result = s;
        if (result.contains(getVersionURI(Synccharts_MM_Version.v_0_2_3))) {
            result = result.replace(
                    getVersionURI(Synccharts_MM_Version.v_0_2_3),
                    getVersionURI(Synccharts_MM_Version.v_0_2_4));
            result = result
                    .replaceAll(
                            "xmlns:expressions=\"http://kieler.cs.cau.de/expressions/0.1.2\"",
                            "xmlns:kexpressions=\"http://kieler.cs.cau.de/kexpressions/0.1.2\"");
        }
        result = result.replaceAll("xsi:type=\"expressions:",
                "xsi:type=\"kexpressions:");
        return result;
    }

    /**
     * Converts a single line of of version 0.2.1 to 0.2.2.
     * 
     * @param s
     *            the line
     * @return the result
     */
    private String convertLineV_0_2_1ToV_0_2_2(final String s) {
        String result = s;
        if (result.contains("xsi:type=\"expressions:SignalReference\"")) {
            result = result.replaceAll(
                    "xsi:type=\"expressions:SignalReference\"",
                    "xsi:type=\"expressions:ValuedObjectReference\"");
            result = result.replaceAll(" signal=\"", " valuedObject=\"");
        }
        if (result.contains("xsi:type=\"expressions:VariableReference\"")) {
            result = result.replaceAll(
                    "xsi:type=\"expressions:VariableReference\"",
                    "xsi:type=\"expressions:ValuedObjectReference\"");
            result = result.replaceAll(" variable=\"", " valuedObject=\"");
        }
        result = result.replaceAll("<innerStates ", "<states ");
        result = result.replaceAll("</innerStates>", "</states>");
        result = result.replaceAll("/@innerStates.", "/@states.");

        if (result.contains(getVersionURI(Synccharts_MM_Version.v_0_2_1))) {
            result = result.replace(
                    getVersionURI(Synccharts_MM_Version.v_0_2_1),
                    getVersionURI(Synccharts_MM_Version.v_0_2_2));
            result = result
                    .replaceAll(
                            "xmlns:expressions=\"http://kieler.cs.cau.de/expressions\"",
                            "xmlns:expressions=\"http://kieler.cs.cau.de/expressions/0.1.1\"");
        }
        return result;
    }

    /**
     * @author soh
     */
    private static class UpdateException extends Exception {

        /**
         *
         */
        private static final long serialVersionUID = 1L;

        /**
         * Creates a new UpdateResourceFactoryImpl.java.
         * 
         * @param cause
         */
        public UpdateException(final Throwable cause) {
            super(cause);
        }

    }

    /**
     * @author soh
     */
    private static class UpdateRuntimeException extends RuntimeException {

        /**
        *
        */
        private static final long serialVersionUID = 1L;

        /**
         * Creates a new UpdateResourceFactoryImpl.java.
         * 
         * @param s
         * @param cause
         */
        public UpdateRuntimeException(final String s, final Throwable cause) {
            super(s, cause);
        }

    }

    /**
     *
     */
    private boolean dummyResult = false;

    /**
     * @return
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

    /**
     *
     */
    private static final String[] V_0_2_EXPRESSION = { "CombineOperator",
            "SignalReference", "VariableReference", "TextualCode",
            "Expression", "ComplexExpression", "Value", "ValuedObject",
            "OperatorType", "Signal", "ValueType", "Variable", "FloatValue",
            "IntValue", "BooleanValue", "OperatorExpression", "TextExpression" };

    /**
     * Converts a single line of of version 0.2 to 0.2.1.
     * 
     * @param s
     *            the line
     * @return the result
     */
    private String convertLineV_0_2ToV_0_2_1(final String s) {
        String result = s;
        if (result.contains(getVersionURI(Synccharts_MM_Version.v_0_2))) {
            result = result
                    .replace(
                            getVersionURI(Synccharts_MM_Version.v_0_2),
                            getVersionURI(Synccharts_MM_Version.v_0_2)
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
    private Synccharts_MM_Version getNextVersion(
            final Synccharts_MM_Version version) {
        switch (version) {
        case v_0_1:
            return Synccharts_MM_Version.v_0_2;
        case v_0_2:
            return Synccharts_MM_Version.v_0_2_1;
        case v_0_2_1:
            return Synccharts_MM_Version.v_0_2_2;
        case v_0_2_2:
            return Synccharts_MM_Version.v_0_2_3;
        case v_0_2_3:
            return Synccharts_MM_Version.v_0_2_4;
        case v_0_2_4:
            return null;
        }
        return null;
    }

    /**
     * Converts a single line of of version 0.1 to 0.2.
     * 
     * @param s
     *            the line
     * @return the result
     */
    private String convertLineV_0_1ToV_0_2(final String s) {
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
        if (newString.contains("renamings")) {
            newString = newString.replaceAll(" oldID=\"", " formal=\"");
            newString = newString.replaceAll(" newID=\"", " actual=\"");
        }

        String[] array = newString.split(" ");
        StringBuilder builder = new StringBuilder();
        boolean isRegionHeader = false;
        for (String token : array) {
            if (token.length() > 1) {
                if (token.startsWith("targetState=\"//@")) {
                    String newToken = token.replaceFirst("targetState=\"//@",
                            "DUMMY_targetState=\"//@");
                    builder.append(newToken.replace("/>", "").replace(">", "")
                            + " ");
                }
                if (token.contains("regions")) {
                    isRegionHeader = true;
                }
                if (isRegionHeader && token.startsWith("id")) {
                    String newToken = token.replaceFirst("id", "DUMMY_id");
                    builder.append(newToken.replace("/>", "").replace(">", "")
                            + " ");
                }
            }
            builder.append(token + " ");
        }
        newString = builder.toString();

        return newString;
    }

    /**
     * @param version
     * @return
     */
    private static String getVersionURI(final Synccharts_MM_Version version) {
        switch (version) {
        case v_0_1:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts\"";
        case v_0_2:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2\"";
        case v_0_2_1:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2.1\"";
        case v_0_2_2:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2.2\"";
        case v_0_2_3:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2.3\"";
        case v_0_2_4:
            return "xmlns:synccharts=\"http://kieler.cs.cau.de/synccharts/0.2.4\"";
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

        private URI uri;

        /**
         * Creates a new UpdateResourceFactoryImpl.java.
         * 
         * @param uri
         */
        public SyncchartsResourceHandler(final URI uriParam) {
            uri = uriParam;
        }

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

            if (wasFileOutOfDate) {
                Map<Object, Object> defaultSaveOptions = resource
                        .getDefaultSaveOptions();
                defaultSaveOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
                        new SyncchartsCleanupHandler(uri));

                try {
                    resource.save(defaultSaveOptions);
                } catch (IOException e0) {
                    e0.printStackTrace();
                }
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
//            System.out.println(owner);
//            System.out.println(f);
//            System.out.println(value);
//            System.out.println();
            if (f.getName().equals("DUMMY_signal")) {
                Emission em = (Emission) owner;
                EObject container = em.eContainer();
                if (container instanceof Action) {
                    ValuedObject val = findValuedObject((String) value,
                            (Action) container);
                    if (val != null && val instanceof Signal) {
                        em.setSignal((Signal) val);
                    }
                }
            } else if (f.getName().equals("DUMMY_valuedObject")) {
                ValuedObjectReference valObj = (ValuedObjectReference) owner;
                EObject container = valObj;
                while (!(container instanceof Action)) {
                    container = container.eContainer();
                }
                ValuedObject val = findValuedObject((String) value,
                        (Action) container);
                if (val != null) {
                    valObj.setValuedObject(val);
                }
            } else if (f.getName().equals("DUMMY_targetState")) {
                Transition trans = (Transition) owner;
                Region parent = trans.getSourceState().getParentRegion();

                for (State state : parent.getStates()) {
                    URI stateURI = EcoreUtil.getURI(state);
                    String uriString = stateURI.toString();
                    uriString = uriString.substring(uriString.indexOf("#") + 1);
                    if (uriString.equals(value)) {
                        trans.setTargetState(state);
                        return true;
                    }
                }
            } else if (f.getName().equals("DUMMY_id")) {
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

        private Map<String, ValuedObject> cashedValuedObject = new HashMap<String, ValuedObject>();

        /**
         * @param value
         * @return
         */
        private ValuedObject findValuedObject(final String value,
                final Action parent) {
            if (cashedValuedObject.containsKey(value)) {
                return cashedValuedObject.get(value);
            }
            State parentState = null;
            EObject par = parent.eContainer();
            if (parent instanceof Transition) {
                parentState = ((Transition) parent).getSourceState()
                        .getParentRegion().getParentState();
            } else if (par instanceof State) {
                parentState = (State) par;
            }
            while (parentState != null) {
                for (Signal s : parentState.getSignals()) {
                    if (s.getName().equals(value)) {
                        cashedValuedObject.put(value, s);
                        return s;
                    }
                }
                for (Variable s : parentState.getVariables()) {
                    if (s.getName().equals(value)) {
                        cashedValuedObject.put(value, s);
                        return s;
                    }
                }
                parentState = parentState.getParentRegion().getParentState();
            }
            return null;
        }
    }

    /**
     * Save handler for cleaning up the DUMMY additions to the file.
     * 
     * @author soh
     */
    private static class SyncchartsCleanupHandler extends BasicResourceHandler {
        private URI uri;

        /**
         * Creates a new UpdateResourceFactoryImpl.java.
         * 
         * @param uriParam
         */
        public SyncchartsCleanupHandler(final URI uriParam) {
            uri = uriParam;
        }

        @Override
        public void postSave(final XMLResource resource,
                final OutputStream outputStream, final Map<?, ?> options) {
            cleanUpFile();
        }

        /**
         * 
         */
        private void cleanUpFile() {
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
                    String[] array = s.split(" ");
                    StringBuilder builder = new StringBuilder();
                    for (String token : array) {
                        if (token.length() > 0) {
                            if (!token.startsWith("DUMMY")) {
                                builder.append(token + " ");
                            } else {
                                if (token.endsWith("/>")) {
                                    builder.append("/>");
                                } else if (token.endsWith(">")) {
                                    builder.append(">");
                                }
                            }
                        } else {
                            builder.append(" ");
                        }
                    }
                    lines.add(builder.toString());
                    s = reader.readLine();

                    if (!modified && !s.equals(builder.toString())) {
                        modified = true;
                    }
                }
                is.close();

                if (modified) {
                    // write modified lines back to file
                    OutputStream os = conv.createOutputStream(uri);
                    BufferedWriter bw = new BufferedWriter(
                            new OutputStreamWriter(os));
                    for (String line : lines) {
                        bw.write(line + "\n");
                    }
                    bw.flush();
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
