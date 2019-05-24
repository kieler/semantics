/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.processors.ast

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

/**
 * @author ssm
 * @kieler.design 2019-04-23 proposed
 * @kieler.rating 2019-04-23 proposed yellow
 */
class KAST {
    @Accessors var List<KAST> subKASTs = <KAST> newArrayList
    @Accessors var List<KASTNode> nodes = <KASTNode> newArrayList
    @Accessors var String name
    
    static class KASTNode {
        @Accessors var int index
        @Accessors var String name
        @Accessors var List<KASTField> fields = <KASTField> newArrayList    
        
        new(int index, String name) {
            this.index = index
            this.name = name
        }
    }
    
    static class KASTField {
        @Accessors var String name
        
        new(String name) {
            this.name = name
        }
    }
    
    static class KASTFieldValue extends KASTField {
        @Accessors var String value
        
        new(String name, String value) {
            super(name)
            this.value = value
        }
    }
    
    static class KASTFieldReference extends KASTField {
        @Accessors var int index
        @Accessors var KASTNode reference
        
        new (String name, int index, KASTNode reference) {
            super(name)
            this.index = index
            this.reference = reference
        }
    }
}