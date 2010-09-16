/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.KielerRuntimeException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.synchronizer.Activator;
import de.cau.cs.kieler.synccharts.synchronizer.InvokeGMFEditorSynchronizationRunnable;
import de.cau.cs.kieler.synccharts.synchronizer.ModelSynchronizer;

public class SyncChartSynchronizerJob extends Job {

	private Region leftRegion = null;
	private Region rightRegion = null;
	private SyncchartsDiagramEditor passiveEditor = null;
    private static Map<String, Object> matchOptions = new HashMap<String, Object>();
	
	public SyncChartSynchronizerJob(String name) {
		super(name);
        matchOptions.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);
	}

	
	public void setLeftRegion(Region leftRegion) {
		this.leftRegion = leftRegion;
	}


	public void setPassiveEditor(SyncchartsDiagramEditor passiveEditor) {
		this.passiveEditor = passiveEditor;
	}


	@Override
	protected IStatus run(IProgressMonitor monitor) {
		final DiffModel diffModel;

		MatchModel matchModel = null;

        rightRegion = (Region) ((Diagram) ((IDiagramWorkbenchPart) passiveEditor)
                .getDiagramEditPart().getModel()).getElement();
		try {
			matchModel = MatchService.doMatch(leftRegion, rightRegion,
					matchOptions);
		} catch (InterruptedException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID,
					ModelSynchronizer.MSG_MATCH_FAILED,
					new KielerRuntimeException(
							ModelSynchronizer.MSG_MATCH_FAILED));
		}

		diffModel = DiffService.doDiff(matchModel);

		PlatformUI
				.getWorkbench()
				.getDisplay()
				.syncExec(
						new InvokeGMFEditorSynchronizationRunnable(
								(DiagramDocumentEditor) passiveEditor,
								diffModel));
		
        return Status.OK_STATUS;
	}

}
