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
package de.cau.cs.kieler.prom.configurable

import org.eclipse.core.resources.IResource
import com.google.common.io.Files

/**
 * A placeholder to use with resources (i.e. IResource).
 * Adds the placeholders for<br/>
 * - the location (suffix _loc)<br/>
 * - the project relative path (suffix _path)<br/>
 * - the full path in the workspace (suffix _fullpath)<br/>
 * - the name (suffix _name)<br/>
 * - the name without file extension (suffix _basename)<br/>
 * - the file extension (suffix _ext)<br/>
 * 
 * @author aas
 *
 */
abstract class ResourceSubstitution extends Substitution {
    
    /**
     * Constructor
     * 
     * @param name The name
     */
    new(String name) {
        super(name)
    }
    
    /**
     * {@inheritDoc}
     */
    override getVariableMappings() {
        if(resource == null) {
            return #{locationVariable -> "",
                     pathVariable -> "",
                     fullPathVariable -> "",
                     nameVariable -> "",
                     nameWithoutExtensionVariable -> "",
                     fileExtensionVariable -> "",
                     variableName -> ""
                    }
        } else {
            return #{locationVariable -> resource.location.toOSString,
                     pathVariable -> resource.projectRelativePath.toOSString,
                     fullPathVariable -> resource.fullPath.toOSString,
                     nameVariable -> resource.name,
                     nameWithoutExtensionVariable -> Files.getNameWithoutExtension(resource.name),
                     fileExtensionVariable -> Files.getFileExtension(resource.name),
                     variableName -> resource.projectRelativePath.toOSString
                    }
        }
    }
    
    /**
     * Returns the placeholder variable for the absolute path in the file system.
     */
    private def String getLocationVariable() {
        return variableName+"_loc"
    }
    
    /**
     * Returns the placeholder variable for the project relative path.
     */
    private def String getPathVariable() {
        return variableName+"_path"
    }
    
    /**
     * Returns the placeholder variable for the full path in the eclipse workspace (e.g. /PROJECT_NAME/path/to/file.txt).
     */
    private def String getFullPathVariable() {
        return variableName+"_fullpath"
    }
    
    /**
     * Returns the placeholder variable for the file name.
     */
    private def String getNameVariable() {
        return variableName+"_name"
    }
    
    /**
     * Returns the placeholder variable for the file name without file extension.
     */
    private def String getNameWithoutExtensionVariable() {
        return variableName+"_basename"
    }
    
    /**
     * Returns the placeholder variable for the file extension (without the dot).
     */
    private def String getFileExtensionVariable() {
        return variableName+"_ext"
    }
    
    /**
     * Returns the resource of this file.
     */
    public def IResource getResource() {
        if(!(value instanceof IResource)){
            throw new Exception("The value of an ResourceHandlePlaceholder must be an IResource.")
        }
        return value as IResource
    }
}