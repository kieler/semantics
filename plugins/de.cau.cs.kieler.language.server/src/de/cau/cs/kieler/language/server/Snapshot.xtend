/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import de.cau.cs.kieler.kicool.environments.Errors
import de.cau.cs.kieler.kicool.environments.Warnings
import de.cau.cs.kieler.kicool.environments.Infos
import java.util.List
import de.cau.cs.kieler.kicool.environments.MessageObjectReferences
import de.cau.cs.kieler.kicool.environments.MessageObjectLink
import de.cau.cs.kieler.kicool.environments.MessageObjectList
import java.util.LinkedList

/**
 * Description of a Snapshot. Used by client to generate snapshot selection view.
 * 
 * @author sdo
 * 
 */
class Snapshot {

    public String groupId
    public String name
    public int snapshotIndex
    public List<String> errors
    public List<String> warnings
    public List<String> infos
    
    new (String groupId, String name, int snapshotIndex, Errors errors, Warnings warnings, Infos infos) {
        this.errors = new LinkedList
        this.warnings = new LinkedList
        this.infos = new LinkedList
        
        this.groupId = groupId
        this.name = name
        this.snapshotIndex = snapshotIndex

        if (errors !== null) {
            var list = (errors as MessageObjectReferences).get(null) as MessageObjectList
            if (list !== null) {
                for ( MessageObjectLink mol : list) {
                    if (mol !== null) {
                        this.errors.add(mol.message)
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