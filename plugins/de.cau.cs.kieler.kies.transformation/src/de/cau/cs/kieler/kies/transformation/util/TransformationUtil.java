/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.transformation.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.kexpressions.BooleanValue;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.TextualCode;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.kies.EsterelStandaloneSetup;
import de.cau.cs.kieler.kies.esterel.ConstantExpression;
import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelSerializer;

/**
 * utility class.
 * 
 * @author uru
 * 
 */
public final class TransformationUtil {

    private static Injector injector;

    static {
        injector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    /** utility class. */
    private TransformationUtil() {

    }

    /**
     * 
     * @param e
     *            esterel object
     * @return serialized string
     */
    public static String getSerializedString(final EObject e) {

        if (!EsterelPackage.eINSTANCE.eContents().contains(e.eClass())) {
            System.out.println("nixda");
            return "";
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);

        try {
            Serializer serializerUtil = injector.getInstance(Serializer.class);
            serializerUtil.serialize(e, osw, SaveOptions.defaultOptions());
            // System.out.println("Serialized result: " + baos.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return baos.toString();
    }

    /**
     * Do some casting. Dunno why this is needed. But else Xtend editor marks some casts as error.
     * 
     * @param obj
     *            object to cast
     * @return casted object
     */
    public static EObject castToEObjcet(final EObject obj) {
        return obj;
    }

    /**
     * Convenient method for setting the body reference for a state. Maybe in some later state to
     * any kind of actions here.
     * 
     * @param s
     *            state
     * @param obj
     *            any EObject
     */
    public static void setBodyReference(final State s, final EObject obj) {

        if (obj != null) {
            s.setBodyReference(obj);

            TextualCode code = KExpressionsFactory.eINSTANCE.createTextualCode();
            s.setType(StateType.TEXTUAL);
            code.setCode(TransformationUtil.getSerializedString(obj));
            s.getBodyText().add(code);
        }
    }

    /**
     * Converts an Esterel {@link ConstantExpression} into an equivalent {@link Expression}. This is
     * in unambiguous order: {@link IntValue}, {@link FloatValue}, {@link BooleanValue} or an
     * {@link TextExpression} for a string constant or a referenced constant.
     * 
     * @param cexpr
     *            constant expression to convert
     * @return equivalent kexpression
     */
    public static Expression convertConstantExpression(final ConstantExpression cexpr) {
        if (cexpr == null) {
            return null;
        }

        KExpressionsFactory fac = KExpressionsFactory.eINSTANCE;
        if (cexpr.getValue() != null) {
            String val = cexpr.getValue();
            try {
                // first try integer
                IntValue intVal = fac.createIntValue();
                intVal.setValue(Integer.valueOf(val));
                return intVal;
            } catch (NumberFormatException nfeInt) {
                try { // second float
                    FloatValue floatVal = fac.createFloatValue();
                    floatVal.setValue(Float.valueOf(val));
                    return floatVal;
                } catch (NumberFormatException nfeFloat) {
                    if (val.equalsIgnoreCase("true") || val.equalsIgnoreCase("false")) {
                        BooleanValue boolVal = fac.createBooleanValue();
                        boolVal.setValue(Boolean.valueOf(val));
                        return boolVal;
                    } else {
                        TextExpression te = fac.createTextExpression();
                        te.setCode(val);
                        return te;
                    }
                }
            }
        } else if (cexpr.getConstant() != null) {
            TextExpression te = fac.createTextExpression();
            te.setCode(cexpr.getConstant().getName());
            return te;
        }
        TextExpression te = fac.createTextExpression();
        te.setCode("unsupported ConstantExpression: " + cexpr.getClass());
        return te;
    }

    /**
     * Compares the triggers of two transitions. Any delay is ignored as it does not matter here.
     * The same applies for any effects of the second transition.
     * 
     * Used in context of optimization rule3.
     * 
     * @param t1
     *            chronologically first transition
     * @param t2
     *            chronologically second transition
     * @return true if the triggers of both transitions match, false otherwise.
     */
    public static boolean compareTrigger(final Action t1, final Action t2) {
        Action tmp1 = EcoreUtil.copy(t1);
        tmp1.setDelay(1);
        Action tmp2 = EcoreUtil.copy(t2);
        tmp2.setDelay(1);
        tmp2.getEffects().clear();
        return ActionLabelSerializer.toString(tmp1).equals(ActionLabelSerializer.toString(tmp2));
    }

    public static void addToFrontOfList(final List<State> list, final List<State> list2) {
        list.addAll(0, list2);
    }

    public static void debug(final EObject obj) {
        System.out.println("Debug: " + obj);
        if (obj instanceof Region) {
            System.out.println(((Region) obj).getParentState());
            System.out.println(((Region) obj).getStates());
        }
    }

    public static DiagramEditor getActiveEditor() {
        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

    public static List<EObject> getCurrentEditorSelection() {
        LinkedList<EObject> selectedElements = null;
        // get the active editor
        IEditorPart editor = getActiveEditor();
        if (editor instanceof SyncchartsDiagramEditor) {
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();
            EditPartViewer viewer = rootEditPart.getViewer();

            // get the selection
            ISelection selection = viewer.getSelection();
            if (!selection.isEmpty()) {
                selectedElements = new LinkedList<EObject>();
                if (selection instanceof StructuredSelection) {
                    // append all elements to the list being returned
                    for (Object o : ((StructuredSelection) selection).toArray()) {
                        if (o instanceof EditPart) {
                            EObject selModel = ((View) ((EditPart) o).getModel()).getElement();
                            selectedElements.add(selModel);
                        }
                    }
                }
            }
        }
        return selectedElements;
    }

    /**
     * Fill the root esterel elements into the syncchart.
     */
    public static void doInitialEsterelTransformation(IFile strlFile, IFile kixsFile) {
        try {
            ResourceSet resourceSet = new ResourceSetImpl();
            final URI strlURI = URI.createPlatformResourceURI(strlFile.getFullPath().toString(),
                    true);
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(),
                    false);

            // setup initial syncchart with one state in the global region
            Resource resource = resourceSet.getResource(kixsURI, true);
            SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
            Region rootRegion = (Region) resource.getContents().get(0);
            State rootState = sf.createState();
            rootState.setId("rsstate");
            rootRegion.getStates().add(rootState);
            rootState.setLabel("EsterelState");
            rootState.setType(StateType.TEXTUAL);

            // get the esterel code and add it as body reference
            Resource xtextResource = resourceSet.getResource(strlURI, true);
            EObject esterelModule = xtextResource.getContents().get(0);
            rootState.setBodyReference(esterelModule);

            // parse the esterel code and display as textual code
            TextualCode code = KExpressionsFactory.eINSTANCE.createTextualCode();
            rootState.getBodyText().add(code);
            code.setCode(TransformationUtil.getSerializedString(esterelModule));

            // save the resource
            resource.save(null);

        } catch (Exception e) {
            e.printStackTrace();
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Problem parsing the Esterel file.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * Creates a new SyncChart.
     */
    public static void createSyncchartDiagram(IFile kixsFile, String name) {
        try {
            if (kixsFile.exists()) {
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                String currentName = name;
                currentName = currentName.substring(0, currentName.lastIndexOf(".") + 1) + "kixs";
                InputDialog inputdiag = new InputDialog(shell, "Existing File.",
                        "File already exists. Overwrite or choose a new name.", currentName,
                        new KixsInputValidator());
                if (inputdiag.open() == InputDialog.OK) {
                    String newName = inputdiag.getValue();
                    IPath newPath = new Path(kixsFile.getFullPath().removeLastSegments(1)
                            .append(newName).toString());
                    IWorkspace workspace = ResourcesPlugin.getWorkspace();
                    kixsFile = workspace.getRoot().getFile(newPath);
                }
            }

            // create corresponding syncchart
            final URI kidsURI = URI.createPlatformResourceURI(kixsFile.getFullPath()
                    .removeFileExtension().addFileExtension("kids").toString(), false);
            final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(),
                    false);

            System.out.println("Creating new SyncCharts Diagram.");

            // create a new SyncCharts Diagram.
            final IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                protected void execute(final IProgressMonitor monitor) throws CoreException,
                        InterruptedException {
                    Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI, kixsURI,
                            monitor);
                    try {
                        diagram.save(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            // run
            op.run(null);

            int i = 0;
        } catch (Exception e) {
            e.printStackTrace();
            Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Problem creating a new SyncChartsDiagram.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    public static void refreshEditPolicies() {
        // update edit policies, so GMF will generate diagram elements
        // for model elements which have been generated during the
        // transformation.
        IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().getActiveEditor();
        if (activeEditor instanceof IDiagramWorkbenchPart) {
            EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor).getDiagramEditPart()
                    .getModel()).getElement();
            List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(obj);
            for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
                CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                System.out.println(nextEditPolicy.toString());
                nextEditPolicy.refresh();
            }
            IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                    .getDiagramGraphicalViewer();
            graphViewer.flush();
        }
    }

    /**
     * assures that string inputs have the file extention ".kixs".
     * 
     * @author uru
     * 
     */
    private static class KixsInputValidator implements IInputValidator {
        /**
         * {@inheritDoc}
         */
        public String isValid(final String newText) {
            int i = newText.lastIndexOf(".");
            String fileExt = newText.substring(i + 1, newText.length());
            if (fileExt.equals("kixs")) {
                return null;
            } else {
                return "File extention has to be .kixs";
            }
        }
    }
}
