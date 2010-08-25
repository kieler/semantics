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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;

/**
 * This class is responsible for gathering the data contributed through the
 * extension point.
 * 
 * @author soh
 * @kieler.rating 2010-07-01 proposed yellow soh
 */
public class ValidationInformationCollector implements IStartup, IPartListener {

    /** The map for mapping ePackage IDs to ePackage nsURIs. */
    private static Map<String, String> ePackages = new HashMap<String, String>();

    /**
     * The map for mapping ePackage IDs to the elements containing the validate
     * action.
     */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private static Map<String, List<IValidationActionFactory>> validateActions = new HashMap<String, List<IValidationActionFactory>>();

    /**
     * The map for mapping the ePackage IDs to the checkfiles registered under
     * the given ePackage. The checkfiles are mapped from their ID to the
     * definition.
     */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private static Map<String, Map<String, CheckfileDefinition>> checkfiles = new HashMap<String, Map<String, CheckfileDefinition>>();

    /**
     * {@inheritDoc}
     */
    public void earlyStartup() {
        IConfigurationElement[] elements = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(
                        "de.cau.cs.kieler.core.model.Validation");

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
        List<IValidationActionFactory> list = validateActions.get(ePackageId);
        if (list == null) {
            list = new LinkedList<IValidationActionFactory>();
            validateActions.put(ePackageId, list);
        }
        try {
            list.add((IValidationActionFactory) element
                    .createExecutableExtension("actionFactory"));
        } catch (CoreException e0) {
            e0.printStackTrace();
        }
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

        String isEnabledByDefaultExisting = element
                .getAttribute("isEnabledByDefault");
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
            checkfiles.put(ePackageId,
                    new HashMap<String, CheckfileDefinition>());
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
     * Helper class for holding all the information about a checkfile parsed
     * from the extension point.
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
                check.isWrapExistingValidator, check.referencedURIs,
                check.name, check.tooltip, check.isEnabledByDefault);
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
                // IEditorPart editorPart = (IEditorPart) workbenchPart;
                // EObject eObj = null;
                // // FIXME: @SOH HERE we definitively need an extension point
                // so
                // // that it is possible
                // // to source out code to get the model to a plugin that has
                // // dependencies to
                // // the specific diagram editor
                // if (editorPart instanceof DiagramEditor) {
                // DiagramEditor diagEd = (DiagramEditor) editorPart;
                // Object obj = diagEd.getDiagramEditPart().getModel();
                // if (obj != null && obj instanceof View) {
                // eObj = ((View) obj).getElement();
                // }
                // // } else if (part instanceof PapyrusMultiDiagramEditor) {
                // // //PapyrusMultiDiagramEditor pmd =
                // // (PapyrusMultiDiagramEditor) part;
                // // //eObj = pmd.getModel();
                // } else if (editorPart instanceof XtextEditor) {
                // XtextEditor xtextEd = (XtextEditor) editorPart;
                // eObj = ModelingUtil.getModelFromXtextEditor(xtextEd);
                // } else {
                // // now we have to ask the extension point for a suitable
                // // class
                // IModelDiagramInterface modelDiagramInterface =
                // getModelDiagramInterface(editorPart
                // .getClass().getName());
                // if (modelDiagramInterface != null) {
                // eObj = modelDiagramInterface.getModel(editorPart);
                // } else {
                // // FIXME: Ignored for now ... fix this! E.g., when
                // // changing the editor to a
                // // supported one, partOpened is fired BUT the active
                // // editor is still the old
                // // one!
                // // String message =
                // //
                // "Cannot find validation extension point definition for editor "
                // // + editorPart.getClass().getName();
                // // throw new RuntimeException(message);
                // }
                // }
                for (String key : validateActions.keySet()) {
                    Object o = validateActions.get(key);

                    if (o != null && o instanceof List<?>) {
                        List<IValidationActionFactory> list = (List<IValidationActionFactory>) o;

                        for (IValidationActionFactory fact : list) {
                            if (fact.getValidationActionForEditor((IEditorPart) workbenchPart) != null) {
                                Map<String, CheckfileDefinition> checks = checkfiles
                                        .get(key);
                                if (checks != null) {
                                    for (CheckfileDefinition check : checks
                                            .values()) {
                                        registerCheckfile(check);
                                    }
                                }
                                break;
                            }
                        }

                        validateActiveEditor();
                    }
                }

                // if (eObj != null) {
                // String uri = eObj.eClass().getEPackage().getNsURI();
                // String id = getId(uri);
                // if (id != null) {
                // Map<String, CheckfileDefinition> checks = checkfiles
                // .get(id);
                // if (checks != null) {
                // for (CheckfileDefinition check : checks.values()) {
                // registerCheckfile(check);
                // }
                // }
                // }
                //
                // ValidationManager.validateActiveEditor();
                // }
            }
        } catch (RuntimeException e0) {
            e0.printStackTrace();
            throw e0;
        }

    }

    /**
     * 
     */
    public static void validateActiveEditor() {
        for (String key : validateActions.keySet()) {
            Object o = validateActions.get(key);

            if (o != null && o instanceof List<?>) {
                List<IValidationActionFactory> factories = (List<IValidationActionFactory>) o;

                for (IValidationActionFactory fact : factories) {
                    Action action = fact.getValidationActionForActiveEditor();

                    if (action != null) {
                        action.run();
                    }
                }
            }
        }
    }

    /**
     * Check whether there is a validate action available for the currently
     * active editor.
     * 
     * @return true if there is
     */
    public static boolean hasValidateActionForActiveEditor() {
        for (String key : validateActions.keySet()) {
            if (hasValidateActionForKey(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check whether the currently active editor has a validate action for the
     * specific ePackage id.
     * 
     * @param key
     *            the id
     * @return true if it has
     */
    private static boolean hasValidateActionForKey(final String key) {
        Object o = validateActions.get(key);

        if (o != null && o instanceof List<?>) {
            List<IValidationActionFactory> factories = (List<IValidationActionFactory>) o;

            for (IValidationActionFactory fact : factories) {
                Action action = fact.getValidationActionForActiveEditor();

                if (action != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check whether the given checkfile should be displayed in the selection.
     * 
     * @param id
     *            the id of the checkfile
     * @return true if it should be visible.
     */
    public static boolean isVisible(final String id) {
        for (String key : checkfiles.keySet()) {
            Object o = checkfiles.get(key);

            if (o != null && o instanceof Map<?, ?>) {
                Map<String, CheckfileDefinition> map = (Map<String, CheckfileDefinition>) o;

                if (map.containsKey(id)) {
                    return hasValidateActionForKey(key);
                }
            }
        }
        return false;
    }

    // /**
    // * Validate all editors belonging to a given ePackage.
    // *
    // * @param ePackage
    // * the epackage to for which the editors should be validated
    // */
    // public static void validateEPackage(final EPackage ePackage) {
    // if (ePackage != null) {
    // String id = getId(ePackage.getNsURI());
    // if (id != null) {
    // IWorkbenchPage page = PlatformUI.getWorkbench()
    // .getActiveWorkbenchWindow().getActivePage();
    // if (validateActions.containsKey(id)) {
    // List<IConfigurationElement> elements = validateActions
    // .get(id);
    // for (IConfigurationElement elem : elements) {
    // try {
    // Object obj = elem
    // .createExecutableExtension("actionFactory");
    // if (obj instanceof IValidationActionFactory) {
    // IValidationActionFactory factory = (IValidationActionFactory) obj;
    // Action action = factory
    // .getValidationAction(page);
    // if (action != null) {
    // action.run();
    // }
    // }
    // } catch (CoreException e0) {
    // e0.printStackTrace();
    // } catch (RuntimeException e0) {
    // e0.printStackTrace();
    // throw e0;
    // }
    // }
    // }
    // }
    // }
    // }

    // --------------------------------------------------------------------------

    // /**
    // * Get the correct getModelDiagramInterface implementation.
    // *
    // * @param editorClassName
    // * the editor class name
    // * @return the list of listeners
    // */
    // public static IModelDiagramInterface getModelDiagramInterface(
    // final String editorClassName) {
    // IConfigurationElement[] contributors = Platform.getExtensionRegistry()
    // .getConfigurationElementsFor(
    // "de.cau.cs.kieler.core.model.Validation");
    //
    // for (IConfigurationElement element : contributors) {
    // if (element.isValid()) {
    // try {
    // Object obj = element.getAttribute("editorClassName");
    // if ((obj instanceof String) && (obj != null)
    // && (((String) obj).equals(editorClassName))) {
    // obj = element.createExecutableExtension("class");
    // return (IModelDiagramInterface) obj;
    // }
    // } catch (CoreException e0) {
    // e0.printStackTrace();
    // }
    // }
    // }
    // return null;
    // }
}
