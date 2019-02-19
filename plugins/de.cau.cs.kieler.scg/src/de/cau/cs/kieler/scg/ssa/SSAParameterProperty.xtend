/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssa

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.scg.BasicBlock
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.xtend.lib.annotations.Data
import com.google.common.collect.BiMap

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@Data
class SSAParameterProperty implements IKiCoolCloneable {
    
    public static val IProperty<SSAParameterProperty> SSA_PARAMETER_PROPERTY = 
        new Property<SSAParameterProperty>("de.cau.cs.kieler.scg.processors.ssa.paramer", null)
    
    val Map<Parameter, BasicBlock> parameterMapping
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new SSAParameterProperty(parameterMapping)
    }
    
    override void resolveCopiedObjects(Copier copier) {
        val newMapping = newHashMap
        for (entry : parameterMapping.entrySet) {
            newMapping.put(copier.get(entry.key) as Parameter, copier.get(entry.value) as BasicBlock)
        }
        parameterMapping.clear
        parameterMapping.putAll(newMapping)
    } 
    
}