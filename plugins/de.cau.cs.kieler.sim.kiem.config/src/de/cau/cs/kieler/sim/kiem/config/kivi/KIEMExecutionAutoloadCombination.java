/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.config.kivi;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.kivi.triggers.EffectTrigger.EffectTriggerState;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.triggers.PartTrigger.EditorState;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.DiagramSelectionState;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.validation.ValidationManager;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.config.KiemConfigurationPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.EditorIdWrapper;
import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;
import de.cau.cs.kieler.sim.kiem.config.exception.ScheduleFileMissingException;
import de.cau.cs.kieler.sim.kiem.config.managers.ContributionManager;
import de.cau.cs.kieler.sim.kiem.config.managers.EditorManager;
import de.cau.cs.kieler.sim.kiem.config.managers.ScheduleManager;
import de.cau.cs.kieler.sim.kiem.internal.KiemProxyEditor;

/**
 * A KiVi Combination controlling the autoloading of execution files. While NO
 * execution is currently running when the user changes the editor the best
 * fitting execution schedule is selected.
 * 
 * @author cmot
 * 
 */
public class KIEMExecutionAutoloadCombination extends AbstractCombination {

	private EditorIdWrapper lastEditorId = null;

	public KIEMExecutionAutoloadCombination() {
	}

	public void execute(final EditorState editorState) {

		// if currently active editor is also the active part
		if (editorState != null && editorState.editorIsActivePart()) {
			
			// this is a special editor and we do'nt want to adjust kiem when it is loaded
			if (editorState.getEditorPart() instanceof KiemProxyEditor) {
				return;
			}

			// if no execution is running or is about to run
			if (!(KiemPlugin.getDefault().isInitializingExecution() || KiemPlugin
					.getDefault().getExecution() != null)) {

				EditorIdWrapper editorId = null;
				String editorName = null;

				// get the currently opened editor
				// this may throw a NullPointerException if no editor is open
				IEditorSite editor = KiemConfigurationPlugin.getDefault()
						.getActiveEditor();

				// if an editor is opened
				if (editor != null) {
					// get the attributes from the editor
					editorId = new EditorIdWrapper(editor.getId());
					editorName = editor.getRegisteredName();

					// only if editor has been changed
					if (editorId == null  || (!editorId.equals(lastEditorId))) {
						lastEditorId = editorId;
						ScheduleManager scheduleManager = ScheduleManager
								.getInstance();
						List<ScheduleData> scheduleDataList = scheduleManager
								.getMatchingSchedules(editorId, editorName);

						// if at least one matching schedule, take the first one
						if (scheduleDataList.size() > 0) {
							ScheduleData scheduleData = scheduleDataList.get(0);
							// open execution file
							try {
								scheduleManager.openSchedule(scheduleData);
							} catch (ScheduleFileMissingException e) {
								// fail silently if this does not work
							}
						}
					}

				}

			}
		}

	}

}
