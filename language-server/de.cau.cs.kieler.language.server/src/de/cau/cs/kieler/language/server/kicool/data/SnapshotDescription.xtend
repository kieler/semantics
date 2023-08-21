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
package de.cau.cs.kieler.language.server.kicool.data

import de.cau.cs.kieler.kicool.environments.Errors
import de.cau.cs.kieler.kicool.environments.Warnings
import de.cau.cs.kieler.kicool.environments.Infos
import java.util.List
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.environments.MessageObjectLink
import de.cau.cs.kieler.kicool.environments.MessageObjectList
import java.util.LinkedList
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Description of a Snapshot. Used by client to generate snapshot selection view.
 * 
 * @author sdo
 * 
 */
class SnapshotDescription {

    @Accessors String name
    @Accessors int index
    @Accessors int snapshotIndex
    @Accessors List<String> errors
    @Accessors List<String> warnings
    @Accessors List<String> infos
    
    new (String name, int index, int snapshotIndex, Errors errors, Warnings warnings, Infos infos) {
        this.errors = new LinkedList
        this.warnings = new LinkedList
        this.infos = new LinkedList
        
        this.name = name
        this.index = index
        this.snapshotIndex = snapshotIndex

        if (errors !== null) {
            var list = (errors as MessageObjectReferences).get(null) as MessageObjectList
            if (list !== null) {
                for ( MessageObjectLink mol : list) {
                    if (mol !== null) {
                        var message = mol.message
                        if (mol.exception !== null) {
                            message += mol.exception.stackTrace.fold("", [s, trace | s + "\n\t\t" + trace])
                        }
                        this.errors.add(message)
                    }
                }
            }
        }
        if (warnings !== null) {
            var list = (warnings as MessageObjectReferences).get(null) as MessageObjectList
            if (list !== null) {
                for ( MessageObjectLink mol : list) {
                    if (mol !== null) {
                        this.warnings.add(mol.message)
                    }
                }
            }
        }
        if (infos !== null) {
            var list = (infos as MessageObjectReferences).get(null) as MessageObjectList
            if (list !== null) {
                for ( MessageObjectLink mol : list) {
                    if (mol !== null) {
                        this.infos.add(mol.message)
                    }
                }
            }
        }
    }
}
