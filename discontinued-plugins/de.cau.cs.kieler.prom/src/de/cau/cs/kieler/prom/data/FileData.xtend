package de.cau.cs.kieler.prom.data

import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

class FileData extends ConfigurationSerializable implements Cloneable {
    
    /**
     * The project relative path of this file.
     */
    @Accessors
    protected var String projectRelativePath = ""
    
    /**
     * The origin of the resource to be created.
     * This is either an absolute file system path or an url with the platform scheme provided by eclipse
     * (e.g. 'platform:/plugin/org.myplugin/path/to/my/Main.java').
     */
    @Accessors
    protected var String origin = ""
    
    /**
     * Creates a new instance of the class.
     */
    new() {
    }

    /**
     * Creates a new instance of the class with the given path.
     */
    new(String projectRelativePath) {
        this.projectRelativePath = projectRelativePath
    }

    /**
     * Creates a new instance of the class with the given path and origin.
     */
    new(String projectRelativePath, String origin) {
        this(projectRelativePath)
        this.origin = origin
    }

    /**
     * Returns the file name (including extension) of the project relative path.
     * 
     * @return the name of the file of this object's project relative path
     */
    public def String getName(){
        return new Path(projectRelativePath).lastSegment
    }

    /**
     * {@inheritDoc}
     */    
    override getIdentifier() {
        return projectRelativePath
    }
    
    /**
     * {@inheritDoc}
     */    
    override setIdentifier(String value) {
        projectRelativePath = value
    }
    
    /**
     * Returns the location of the project plus the project relative path of this data container.
     * 
     * @param project The project with the base location
     */
    public def String getLocation(IProject project) {
        return project.location.toOSString + File.separator + projectRelativePath
    }
    
    /**
     * Returns an IPath with the location of the project plus the project relative path of this data container.
     * 
     * @param project The project with the base location
     */
    public def IPath getLocationAsPath(IProject project) {
        return new Path(getLocation(project))
    }
     
    /**
     * Returns an IFile of this file in the project.
     * 
     * @param project The project with the base location
     */
    public def IFile getFile(IProject project) {
        return project.getFile(projectRelativePath)
    }
    
    /**
     * Compares this object with another object.
     * 
     * @param o The other object.
     * @return true if the other object is a FileData with the same path.<br />
     *         false otherwise.
     */
    override boolean equals(Object o) {
        if (o instanceof FileData) {
            val data = o as FileData
            return data.projectRelativePath == projectRelativePath
        }
        return false
    }
    
    /**
     * {@inheritDoc}
     */
    override clone() {
        val copy = new FileData
        copy.origin = origin
        copy.projectRelativePath = projectRelativePath
        return copy
    }
}