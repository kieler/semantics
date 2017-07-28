/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.ui

import com.google.common.collect.Lists
import de.cau.cs.kieler.prom.ExtensionLookupUtil
import java.util.ArrayList
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.ui.IWorkbenchWizard
import java.util.List

/**
 * @author aas
 *
 */
class UIExtensionLookupUtil extends ExtensionLookupUtil {
    /**
     * The attribute name for a flag
     * indicating if a wizard creates a project (flag is true) or resource (flag is false).
     */
    public static val PROJECT_ATTRIBUTE_NAME = "project"
    
    /**
     * The extension id of a launch shortcut.
     */
    public static val LAUNCH_SHORTCUT_EXTENSION_ID = "org.eclipse.debug.ui.launchShortcuts"
    
    /**
     * The element name for wizard extensions
     */
    public static val LAUNCH_SHORTCUT_ELEMENT_NAME = "shortcut"
    
    /**
     * The extension id of newWizards.
     */
    public static val WIZARD_EXTENSION_ID = "org.eclipse.ui.newWizards"
    
    /**
     * The element name for wizard extensions
     */
    public static val WIZARD_ELEMENT_NAME = "wizard"
    
    
    /**
     * Searches for launch shortcuts and initializes the one with the fully qulified class name.
     * 
     * @param fullyQualifiedClassName The fully qualified class name of an implementation of a launch shortcut.
     * @return The launch shortcut implemented by the fully qualified class name<br/>
     *         or null if there is no such implementation.
     */
    static def ILaunchShortcut getLaunchShortcut(String fullyQualifiedClassName) {
        return instantiateClassFromExtension(LAUNCH_SHORTCUT_EXTENSION_ID, LAUNCH_SHORTCUT_ELEMENT_NAME, CLASS_ATTRIBUTE_NAME, fullyQualifiedClassName) as ILaunchShortcut
    }
    
    /**
     * Searches for newWizards and initializes the one with the fully qulified class name.
     * Before the returned wizard is opened, its init(...) method should be called.
     * 
     * @param fullyQualifiedClassName The fully qualified class name of an implementation of a newWizard.
     * @return The wizard implemented by the fully qualified class name<br/>
     *         or null if there is no such wizard.
     */
    static def IWorkbenchWizard getWizard(String fullyQualifiedClassName) {
        return instantiateClassFromExtension(WIZARD_EXTENSION_ID, WIZARD_ELEMENT_NAME, CLASS_ATTRIBUTE_NAME, fullyQualifiedClassName) as IWorkbenchWizard
    }

    /**
     * Searches for extension point configurations of launch shortcuts.
     * 
     * @return a list with all configurations that contribute to the launch shortcut extension point.
     */
    static def List<IConfigurationElement> getLaunchShortcutConfigurationElements() {
        return getConfigurationElements(LAUNCH_SHORTCUT_EXTENSION_ID, LAUNCH_SHORTCUT_ELEMENT_NAME)
    }

    /**
     * Searches for extension point configurations of newWizards.
     * 
     * @param onlyProjectWizards Specifies if file wizards should be excluded in the search.
     * @return a list with all configurations that contribute to the 'org.eclipse.ui.newWizards' extension point.
     */
    static def List<IConfigurationElement> getWizardConfigurationElements(boolean onlyProjectWizards) {
         
         
         val iterable = getConfigurationElements(WIZARD_EXTENSION_ID, WIZARD_ELEMENT_NAME).filter[
            val isProject = Boolean.valueOf(it.getAttribute(PROJECT_ATTRIBUTE_NAME))
            return (isProject || !onlyProjectWizards)
        ]
        return Lists.newArrayList(iterable)
    }

    
}