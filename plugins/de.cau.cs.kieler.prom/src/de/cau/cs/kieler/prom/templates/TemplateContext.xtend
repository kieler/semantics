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
package de.cau.cs.kieler.prom.templates

import de.cau.cs.kieler.prom.data.MacroCallData
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IFile
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Container for the configuration of a template to be processed.
 * The template can be processed using additional variable mappings
 * as well as macro call datas to be injected in the template code before it is processed. 
 * 
 * @author aas
 *
 */
class TemplateContext {
    /**
     * The template file
     */
    @Accessors(PUBLIC_GETTER)
    private var IFile templateFile
    
    /**
     * Additional variable mappings for the template.
     * A variable can have a numeric or text value. Furthermore a variable's value can be a list or another map.
     */
    @Accessors
    private var Map<String, Object> additionalMappings
    
    /**
     * Macro call datas that should be injected into the template before it is processed.
     */
    @Accessors
    private var List<MacroCallData> macroCallDatas
    
    /**
     * Constructor
     * 
     * @param templateFile The template file
     */
    new(IFile templateFile) {
        this.templateFile = templateFile
    }
}