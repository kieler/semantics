/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2026 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.definitions;

import java.util.EnumSet;
import java.util.List;

import de.cau.cs.kieler.annotations.Pragma;
import de.cau.cs.kieler.annotations.Pragmatable;
import de.cau.cs.kieler.annotations.StringPragma;

/**
 * @author dam, als
 */
public class Semantics {
    
    public enum SCCharts {
        LEAN, CLASSIC
    }
    
    public static String PRAGMA_SEMANTICS = "semantics";
    
    public static EnumSet<SCCharts> getSemantics(Pragmatable model) {
        List<String> sem = null;
        for (Pragma p : model.getPragmas()) {
            if (PRAGMA_SEMANTICS.equalsIgnoreCase(p.getName())) {
                if (p instanceof StringPragma sp) {
                    if (!sp.getValues().isEmpty()) {
                        sem = sp.getValues();
                    }
                }
            }
        }
        if (sem != null) {
            return EnumSet.copyOf(sem.stream().map(s -> SCCharts.valueOf(s)).toList());
        } else {
            return EnumSet.noneOf(SCCharts.class);
        }
    }
    
    public static boolean hasSemantics(Pragmatable model, SCCharts sem) {
        EnumSet<SCCharts> semantics = getSemantics(model);
        if (semantics.isEmpty() && sem == SCCharts.CLASSIC) {
            return true;
        } else {
            return semantics.contains(sem);
        }
    }
    
}
