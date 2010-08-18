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
 */
package de.cau.cs.kieler.core.model.validation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;

/**
 * This class is responsible for gathering the data contributed through the extension point.
 * 
 * @author soh
 * @kieler.rating 2010-07-01 proposed yellow soh
 */
public class ValidationInformationCollector implements IStartup, IPartListener {

    /** The map for mapping ePackage IDs to ePackage nsURIs. */
    private static Map<String, String> ePackages = new HashMap<String, String>();

    /**
     * The map for mapping ePackage IDs to the elements containing the validate action.
     */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private static Map<String, List<IConfigurationElement>> validateActions = new HashMap<String, List<IConfigurationElement>>();

    /**
     * The map for mapping the ePackage IDs to the checkfiles registered under the given ePackage.
     * The checkfiles are mapped from their ID to the definition.
     */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private static Map<String, Map<String, CheckfileDefinition>> checkfiles = new HashMap<String, Map<String, CheckfileDefinition>>();

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        IConfigurationElement[] elements = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.core.model.Validation");

        for (IConfigurationElement element : elements) {
            if (element.isValid()) {
                String elemName = element.getName();
                if (elemName.equals("ePackageDefinition")) {
                    addEPackageDefinition(element);
                } else if (elemName.equals("Checkfile")) {
                    addCheckfile(element);
                } else if (elemName.equals("ValidateAction")) {
                    addValidateAction(element);
                }
            }
        }

        CombinedWorkbenchListener.addPartListener(this);
        CombinedWorkbenchListener.receiveAlreadyOpenedParts(this);
    }

    /**
     * @param element
     */
    private void addValidateAction(final IConfigurationElement element) {
        String ePackageId = element.getAttribute("ePackageId");
        List<IConfigurationElement> list = validateActions.get(ePackageId);
        if (list == null) {
            list = new LinkedList<IConfigurationElement>();
            validateActions.put(ePackageId, list);
        }
        list.add(element);
    }

    /**
     * @param element
     */
    private void addCheckfile(final IConfigurationElement element) {
        String ePackageId = element.getAttribute("ePackageId");
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String path = element.getAttribute("path");
        String tooltip = element.getAttribute("tooltip");
        if (tooltip == null) {
            tooltip = "";
        }
        String isWrapExisting = element.getAttribute("isWrapExistingValidator");
        boolean isWrap = isWrapExisting.equals("true");

        String isEnabledByDefaultExisting = element.getAttribute("isEnabledByDefault");
        boolean isEnabledByDefault = isEnabledByDefaultExisting.equals("true");

        CheckfileDefinition definition = new CheckfileDefinition();
        definition.id = id;
        definition.ePackageId = ePackageId;
        definition.name = name;
        definition.path = path;
        definition.tooltip = tooltip;
        definition.isWrapExistingValidator = isWrap;
        definition.isEnabledByDefault = isEnabledByDefault;
        definition.referencedURIs = new LinkedList<String>();

        for (IConfigurationElement child : element.getChildren()) {
            String uri = child.getAttribute("nsURI");
            definition.referencedURIs.add(uri);
        }

        if (!checkfiles.containsKey(ePackageId)) {
            checkfiles.put(ePackageId, new HashMap<String, CheckfileDefinition>());
        }
        Map<String, CheckfileDefinition> map = checkfiles.get(ePackageId);
        map.put(id, definition);
    }

    /**
     * @param element
     */
    private void addEPackageDefinition(final IConfigurationElement element) {
        String ePackageId = element.getAttribute("ePackageId");
        String ePackageNsURI = element.getAttribute("ePackageNsURI");
        ePackages.put(ePackageId, ePackageNsURI);
    }

    /**
     * @param nsUri
     *            the namespace URI
     * @return true if the validate action is available
     */
    public static boolean hasValidateAction(final String nsUri) {
        String id = getId(nsUri);
        if (id != null) {
            return validateActions.containsKey(id);
        }
        return false;
    }

    /**
     * Helper class for holding all the information about a checkfile parsed from the extension
     * point.
     * 
     * @author soh
     */
    private static final class CheckfileDefinition {

        private CheckfileDefinition() {

        }

        private String id;

        private String ePackageId;

        private String name;

        private String path;

        private String tooltip;

        private boolean isWrapExistingValidator;

        private boolean isEnabledByDefault;

        private List<String> referencedURIs;

    }

    /**
     * @param check
     */
    private void registerCheckfile(final CheckfileDefinition check) {
        String nsURI = ePackages.get(check.ePackageId);
        EPackage ePackage = EPackageRegistryImpl.INSTANCE.getEPackage(nsURI);

        ValidationManager.registerCheckFile(check.id, ePackage, check.path,
                check.isWrapExistingValidator, check.referencedURIs, check.name, check.tooltip,
                check.isEnabledByDefault);
    }

    /**
     * @param uriParam
     * @return
     */
    private static String getId(final String uriParam) {
        for (Entry<String, String> entry : ePackages.entrySet()) {
            if (entry.getValue().equals(uriParam)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {

    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart workbenchPart) {
        try {
            if (workbenchPart instanceof IEditorPart) {
                IEditorPart editorPart = (IEditorPart) workbenchPart;
                EObject eObj = null;
                // FIXME: @SOH HERE we definitively need an extension point so that it is possible
                // to source out code to get the model to a plugin that has dependencies to
                // the specific diagram editor
                if (editorPart instanceof DiagramEditor) {
                    DiagramEditor diagEd = (DiagramEditor) editorPart;
                    Object obj = diagEd.getDiagramEditPart().getModel();
                    if (obj != null && obj instanceof View) {
                        eObj = ((View) obj).getElement();
                    }
                    // } else if (part instanceof PapyrusMultiDiagramEditor) {
                    // //PapyrusMultiDiagramEditor pmd = (PapyrusMultiDiagramEditor) part;
                    // //eObj = pmd.getModel();
                } else if (editorPart instanceof XtextEditor) {
                    XtextEditor xtextEd = (XtextEditor) editorPart;
                    eObj = ModelingUtil.getModelFromXtextEditor(xtextEd);
                } else {
                    // now we have to ask the extension point for a suitable class
                    eObj = getModelDiagramInterface(editorPart.getClass().getName()).getModel(
                            editorPart);
                }

                if (eObj != null) {
                    String uri = eObj.eClass().getEPackage().getNsURI();
                    String id = getId(uri);
                    if (id != null) {
                        Map<String, CheckfileDefinition> checks = checkfiles.get(id);
                        if (checks != null) {
                            for (CheckfileDefinition check : checks.values()) {
                                registerCheckfile(check);
                            }
                        }
                    }

                    ValidationManager.validateActiveEditor();
                }
            }
        } catch (RuntimeException e0) {
            e0.printStackTrace();
            throw e0;
        }

    }

    /**
     * Validate all editors belonging to a given ePackage.
     * 
     * @param ePackage
     *            the epackage to for which the editors should be validated
     */
    public static void validateEPackage(final EPackage ePackage) {
        if (ePackage != null) {
            String id = getId(ePackage.getNsURI());
            if (id != null) {
                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage();
                if (validateActions.containsKey(id)) {
                    List<IConfigurationElement> elements = validateActions.get(id);
                    for (IConfigurationElement elem : elements) {
                        try {
                            Object obj = elem.createExecutableExtension("actionFactory");
                            if (obj instanceof IValidationActionFactory) {
                                IValidationActionFactory factory = (IValidationActionFactory) obj;
                                Action action = factory.getValidationAction(page);
                                if (action != null) {
                                    action.run();
                                }
                            }
                        } catch (CoreException e0) {
                            e0.printStackTrace();
                        } catch (RuntimeException e0) {
                            e0.printStackTrace();
                            throw e0;
                        }
                    }
                }
            }
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Get the correct getModelDiagramInterface implementation.
     * 
     * @param editorClassName
     *            the editor class name
     * @return the list of listeners
     */
    public static IModelDiagramInterface getModelDiagramInterface(String editorClassName) {
        IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                .getConfigurationElementsFor("de.cau.cs.kieler.core.model.Validation");

        for (IConfigurationElement element : contributors) {
            if (element.isValid()) {
                try {
                    Object obj = element.createExecutableExtension("editorClassName");
                    if ((obj instanceof String) && (obj != null)
                            && (((String) obj).equals(editorClassName))) {
                        obj = element.createExecutableExtension("class");
                        return (IModelDiagramInterface) obj;
                    }
                } catch (CoreException e0) {
                    e0.printStackTrace();
                }
            }
        }
        return null;
    }
}
