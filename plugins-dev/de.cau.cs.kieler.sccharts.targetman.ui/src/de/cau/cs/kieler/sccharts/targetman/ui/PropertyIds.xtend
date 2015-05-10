/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.targetman.ui

import org.eclipse.core.runtime.QualifiedName

/**
 * @author aas
 *
 */
class PropertyIds {
    
    public static val QualifiedName COMPILE_ON_SAVE_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "compileOnSave")
    public static val QualifiedName TARGET_LANGUAGE_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "targetLanguage")
    public static val QualifiedName TARGET_PATH_PROPERTY_ID = new QualifiedName(
            TargetManagementPlugin.PLUGIN_ID, "targetPath")
}