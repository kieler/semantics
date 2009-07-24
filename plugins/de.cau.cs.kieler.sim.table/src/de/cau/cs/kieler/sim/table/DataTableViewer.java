/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.table;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;


public class DataTableViewer extends TreeViewer {
	
	public DataTableViewer(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	public DataTableViewer(Composite parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	public DataTableViewer(Table table) {
		super(table);
		// TODO Auto-generated constructor stub
	}
}
