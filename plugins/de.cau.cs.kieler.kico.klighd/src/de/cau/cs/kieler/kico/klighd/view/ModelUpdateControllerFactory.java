/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view;

import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.kico.klighd.KiCoKLighDPlugin;

/**
 * Manages the different {@link AbstractModelUpdateController} instances for the {@link ModelView}
 * and provides correct instantiation.
 * <p>
 * This class evaluates the controller extension point.
 * <p>
 * This class is a singleton.
 * 
 * @author als
 * @kieler.design 2015-06-22 proposed
 * @kieler.rating 2015-06-22 proposed yellow
 *
 */
public class ModelUpdateControllerFactory {

    // -- CONSTANTS --
    /** Identifier of the extension point for controllers. */
    public static final String EXTP_ID_CONTROLLER = "de.cau.cs.kieler.kico.klighd.controller";

    /** Identifier of the extension point for controllers. */
    public static final String EXTP_ID_EDITOR = "de.cau.cs.kieler.kico.klighd.editor";

    /** Name of the 'controller' element. */
    private static final String ELEMENT_CONTROLLER = "controller";

    /** Name of the 'generalSynthesis' element. */
    private static final String ELEMENT_SYNTHESIS = "generalSynthesis";

    /** Name of the 'editor' element. */
    private static final String ELEMENT_EDITOR = "editor";

    /** Name of the 'id' attribute in the extension points. */
    private static final String ATTRIBUTE_ID = "id";

    /** Name of the 'class' attribute in the extension points. */
    private static final String ATTRIBUTE_CLASS = "class";

    /** Name of the 'id' attribute in the extension points. */
    private static final String ATTRIBUTE_EDITOR = "editorID";

    /** Name of the 'id' attribute in the extension points. */
    private static final String ATTRIBUTE_CONTROLLER = "controllerID";

    // -- SINGLETON --

    /** the singleton instance. */
    private static ModelUpdateControllerFactory instance;

    /**
     * A private constructor to prevent instantiation.
     */
    private ModelUpdateControllerFactory() {
        // do nothing
    }

    /**
     * Creates the singleton and initializes it with the data from the extension point.
     */
    static {
        instance = new ModelUpdateControllerFactory();
        // load the data from the extension points
        try {
            instance.loadControllerExtension();
            instance.loadEditorExtension();
        } catch (final Exception e) {
            StatusManager
                    .getManager()
                    .handle(new Status(
                            IStatus.ERROR,
                            KiCoKLighDPlugin.PLUGIN_ID,
                            ModelUpdateControllerFactory.class.getName()
                                    + ": Unexptected failure while loading registered controllers.",
                            e));
        }
    }

    /**
     * Returns the singleton instance.
     *
     * @return the singleton
     */
    public static ModelUpdateControllerFactory getInstance() {
        return instance;
    }

    // -- ATTRIBUES --
    /** The mapping of IDs to the corresponding classes of {@link AbstractModelUpdateController} . */
    private final HashMap<String, Class<? extends AbstractModelUpdateController>> idControllerMapping =
            new HashMap<String, Class<? extends AbstractModelUpdateController>>();
    /** The mapping of editor-IDs to the corresponding controller IDs. */
    private final HashMap<String, String> editorControllerMapping = new HashMap<String, String>();

    // -- Extension Point Parsing
    // -------------------------------------------------------------------------

    /**
     * Loads the registered {@link AbstractModelUpdateController} from the extension point and
     * builds up the {@link #controllerClasses}.
     */
    private void loadControllerExtension() {
        final IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTP_ID_CONTROLLER);

        for (final IConfigurationElement element : extensions) {
            if (ELEMENT_CONTROLLER.equals(element.getName())) {
                // initialize controller class from the extension point
                try {
                    Class<? extends AbstractModelUpdateController> controllerClass =
                            (Class<? extends AbstractModelUpdateController>) Class.forName(element
                                    .getAttribute(ATTRIBUTE_CLASS));
                    String id = element.getAttribute(ATTRIBUTE_ID);
                    if (id == null || controllerClass == null) {
                        throw new NullPointerException("Cannot retrive id or class");
                    }
                    idControllerMapping.put(id, controllerClass);
                } catch (final Exception exception) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID,
                                    this.getClass().getName()
                                            + ": Error while parsing controller extension point",
                                    exception));
                }
            } else if (ELEMENT_SYNTHESIS.equals(element.getName())) {
                // initialize general synthesis class from the extension point
                try {
                    ISelectableGeneralSynthesis synthesis =
                            (ISelectableGeneralSynthesis) element
                                    .createExecutableExtension(ATTRIBUTE_CLASS);
                    SynthesisSelectionMenu.addGeneralSynthesis(synthesis.getID(), synthesis);
                } catch (final Exception exception) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID, this.getClass()
                                    .getName()
                                    + ": Error while parsing general synthesis extension point",
                                    exception));
                }
            }
        }
    }

    /**
     * Loads the registered editor association from the extension point and builds up the
     * {@link #controllerClasses}.
     */
    private void loadEditorExtension() {
        final IConfigurationElement[] extensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(EXTP_ID_EDITOR);

        for (final IConfigurationElement element : extensions) {
            if (ELEMENT_EDITOR.equals(element.getName())) {
                // initialize controller classes from the extension point
                try {
                    String editor = element.getAttribute(ATTRIBUTE_EDITOR);
                    String controller = element.getAttribute(ATTRIBUTE_CONTROLLER);
                    if (editor == null || controller == null) {
                        throw new NullPointerException("Cannot retrive id or class");
                    }
                    if (idControllerMapping.containsKey(controller)) {
                        editorControllerMapping.put(editor, controller);
                    } else {
                        // Log error if controller id is not registered
                        StatusManager.getManager().handle(
                                new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID, this
                                        .getClass().getName()
                                        + ": Given controller id ["
                                        + controller + "] is not registered"), StatusManager.LOG);
                    }
                } catch (final Exception exception) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID, this.getClass()
                                    .getName() + ": Error while parsing editor extension point",
                                    exception));
                }
            }
        }
    }

    // -- Controller Access
    // -------------------------------------------------------------------------

    /**
     * Indicates if the given editor has a handling controller and thus should be displayed in a
     * ModelView.
     * 
     * @param editor
     *            The EditorPart
     * @return true if controller is associated otherwise false
     */
    public static boolean isHandledEditor(IEditorPart editor) {
        if (editor != null) {
            return ModelUpdateControllerFactory.getInstance().editorControllerMapping
                    .containsKey(editor.getEditorSite().getId());
        }
        return true;
    }

    /**
     * Returns the ID of the controller responsible for handling the given editor.
     * 
     * @param editor
     *            The EditorPart
     * @return the controller id or null if no controller is associated
     */
    public static String getHandlingControllerID(IEditorPart editor) {
        if (editor != null) {
            return ModelUpdateControllerFactory.getInstance().editorControllerMapping.get(editor
                    .getEditorSite().getId());
        }
        return null;
    }

    /**
     * Creates an instance of the controller with the given id for the given ModelView.
     * 
     * @param controllerID
     *            The ID of the controller
     * @param modelView
     *            The ModelView
     * @return The new instance of null if the controller does not exist
     */
    public static AbstractModelUpdateController getNewInstance(String controllerID,
            ModelView modelView) {
        if (controllerID != null && modelView != null) {
            ModelUpdateControllerFactory mucm = ModelUpdateControllerFactory.getInstance();
            Class<? extends AbstractModelUpdateController> clazz =
                    mucm.idControllerMapping.get(controllerID);
            if (clazz != null) {
                try {
                    return clazz.getConstructor(ModelView.class).newInstance(modelView);
                } catch (Exception e) {
                    StatusManager.getManager().handle(
                            new Status(IStatus.ERROR, KiCoKLighDPlugin.PLUGIN_ID,
                                    ModelUpdateControllerFactory.class.getName()
                                            + ": Cannot instanciate controller", e),
                            StatusManager.LOG);
                }
            }
        }
        return null;
    }

}
