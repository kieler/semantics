/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ide.view.actions

/**
 * @author sdo
 *
 */
class AbstractSkinSelectionActions {

    public val static SKINS = #[new Pair<String, String>("Default Skin", "default/"),
                         new Pair<String, String>("Flexible Skin", "flexible/"),
                         new Pair<String, String>("Fixed Skin", "fixed/"),
                         new Pair<String, String>("SCCharts Skin", "scc/"),
                         new Pair<String, String>("Detailed Skin", "detailed/")
    ]
    
    public val static SKINS_MAX_NAME_SIZE = #[255, 255, 15, 255, 255]
    
}