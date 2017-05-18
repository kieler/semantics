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
package de.cau.cs.kieler.kicool.ui

import org.eclipse.ui.IStorageEditorInput
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.resources.IStorage
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import java.io.ByteArrayInputStream
import org.eclipse.xtext.serializer.ISerializer
import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup

/**
 * @author ssm
 * @kieler.design 2017-05-18 proposed
 * @kieler.rating 2017-05-18 proposed yellow  
 */
class KiCoolEditorInput implements IStorageEditorInput {
    
    @Accessors String name
    @Accessors String tooltip
    @Accessors KiCoolStorage storage
    
    new(de.cau.cs.kieler.kicool.System system) {
        name = "Temporary Compilation System"
        tooltip = "This is an imported compilation system. You must save it if you want to keep it."
        storage = new KiCoolStorage(system)
    }
    
    override getStorage() throws CoreException {
        storage
    }
    
    override exists() {
        false
    }
    
    override getImageDescriptor() {
        null
    }
    
    override getName() {
        name
    }
    
    override getPersistable() {
        null
    }
    
    override getToolTipText() {
        tooltip
    }
    
    override <T> getAdapter(Class<T> adapter) {
        null
    }
    
}

class KiCoolStorage implements IStorage {
    
    static val RESOURCE_EXTENSION = "kico"
    static val injector = KiCoolStandaloneSetup.doSetup
    static val serializer = injector.getInstance(typeof(ISerializer))   
        
    @Accessors de.cau.cs.kieler.kicool.System system
    
    new(de.cau.cs.kieler.kicool.System system) {
        this.system = system
    }
    
    override getContents() throws CoreException {
        val contents = serializer.serialize(system)
        new ByteArrayInputStream(contents.getBytes)
    }
    
    override getFullPath() {
        val num = (this.hashCode() + "").replace("-", "");
        val IPath path = new Path("dummy:/inmemory/" + num + "." + RESOURCE_EXTENSION);
        return path;
    }
    
    override getName() {
        null
    }
    
    override isReadOnly() {
        true
    }
    
    override <T> getAdapter(Class<T> adapter) {
        null
    }
    
}