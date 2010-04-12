/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser;

import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;

import de.cau.cs.kieler.synccharts.interfacedeclparser.formatting.InterfaceDeclFormatter;
import de.cau.cs.kieler.synccharts.interfacedeclparser.formatting.InterfaceDeclTransientValueService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class InterfaceDeclRuntimeModule
        extends
        de.cau.cs.kieler.synccharts.interfacedeclparser.AbstractInterfaceDeclRuntimeModule {

    @Override
    public Class<? extends ITransientValueService> bindITransientValueService() {
        return InterfaceDeclTransientValueService.class;
    }

    @Override
    public Class<? extends IFormatter> bindIFormatter() {
        return InterfaceDeclFormatter.class;
    }
}
