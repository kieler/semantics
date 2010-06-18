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
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * @author soh
 */
public class ValidationInformationCollector implements IStartup, IPartListener,
        IPageListener, IWindowListener {

    private static Map<String, String> ePackages = new HashMap<String, String>();

    private static Map<String, IConfigurationElement> validateActions = new HashMap<String, IConfigurationElement>();

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

        IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        PlatformUI.getWorkbench().addWindowListener(this);
        if (window != null) {
            windowOpened(window);
        }
    }

    /**
     * @param element
     */
    private void addValidateAction(final IConfigurationElement element) {
        String ePackageId = element.getAttribute("ePackageId");
        validateActions.put(ePackageId, element);
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

        CheckfileDefinition definition = new CheckfileDefinition();
        definition.id = id;
        definition.ePackageId = ePackageId;
        definition.name = name;
        definition.path = path;
        definition.tooltip = tooltip;
        definition.isWrapExistingValidator = isWrap;
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
     * @param nsUri
     * @return
     */
    public static boolean hasValidateAction(String nsUri) {
        String id = getId(nsUri);
        if (id != null) {
            return validateActions.containsKey(id);
        }
        return false;
    }

    private static class CheckfileDefinition {

        private String id;

        private String ePackageId;

        private String name;

        private String path;

        private String tooltip;

        private boolean isWrapExistingValidator;

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
                check.name, check.tooltip);
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
    public void partOpened(final IWorkbenchPart part) {
        try {
            if (part instanceof IEditorPart) {
                if (part instanceof DiagramEditor) {
                    DiagramEditor diagEd = (DiagramEditor) part;
                    Object obj = diagEd.getDiagramEditPart().getModel();
                    if (obj != null && obj instanceof View) {
                        EObject eObj = ((View) obj).getElement();
                        String uri = eObj.eClass().getEPackage().getNsURI();
                        String id = getId(uri);
                        if (id != null) {
                            Map<String, CheckfileDefinition> checks = checkfiles
                                    .get(id);
                            if (checks != null) {
                                for (CheckfileDefinition check : checks
                                        .values()) {
                                    registerCheckfile(check);
                                }
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
     * {@inheritDoc}
     */
    public void pageActivated(final IWorkbenchPage page) {
    }

    /**
     * {@inheritDoc}
     */
    public void pageClosed(final IWorkbenchPage page) {
    }

    /**
     * {@inheritDoc}
     */
    public void pageOpened(final IWorkbenchPage page) {
        page.addPartListener(this);
        IEditorPart part = page.getActiveEditor();
        if (part != null) {
            partOpened(part);
        }
    }

    private boolean windowActivated = false;

    /**
     * {@inheritDoc}
     */
    public void windowActivated(final IWorkbenchWindow window) {
        if (!windowActivated) {
            windowOpened(window);
            windowActivated = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void windowClosed(final IWorkbenchWindow window) {
    }

    /**
     * {@inheritDoc}
     */
    public void windowDeactivated(final IWorkbenchWindow window) {
    }

    /**
     * {@inheritDoc}
     */
    public void windowOpened(final IWorkbenchWindow window) {
        window.addPageListener(this);
        IWorkbenchPage page = window.getActivePage();
        if (page != null) {
            pageOpened(page);
        }
    }

    /**
     * @param ePackage
     */
    public static void validateEPackage(final EPackage ePackage) {
        String id = getId(ePackage.getNsURI());
        if (id != null) {
            IWorkbenchPage page = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage();
            if (validateActions.containsKey(id)) {
                IConfigurationElement elem = validateActions.get(id);
                try {
                    Object obj = elem
                            .createExecutableExtension("actionFactory");
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
