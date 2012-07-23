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
package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;

import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * Special {@link AbstractTransactionalCommand} merging changes into a GMF document.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class SynchronizeGMFEditorCommand extends AbstractTransactionalCommand {

    private DiagramDocumentEditor passiveEditor = null;
    private DiffModel diffModel = null;

    public SynchronizeGMFEditorCommand(DiagramDocumentEditor thePassiveEditor,
            DiffModel theDiffModel) {
        super(thePassiveEditor.getEditingDomain(), "Merge model changes", null);
        this.passiveEditor = thePassiveEditor;
        this.diffModel = theDiffModel;
    }

    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
            throws ExecutionException {

        try {
            MergeService.merge(diffModel.getOwnedElements(), true);
        } catch (NullPointerException e) {
            EditorUtils.log(new Status(IStatus.WARNING, SyncchartsSynchronizerPlugin.PLUGIN_ID,
                    ModelSynchronizer.MSG_MERGING_FAILED, e));
        }

        EObject model = ((Diagram) ((DiagramDocumentEditor) passiveEditor).getDiagramEditPart()
                .getModel()).getElement();

        new KitsSynchronizeLinker().setDiffModel(diffModel).linkElement(model)
                .serializeActions(model);

        try {
            ActionLabelProcessorWrapper.processActionLabels(((Diagram) this.passiveEditor
                    .getDiagramEditPart().getModel()).getElement(),
                    ActionLabelProcessorWrapper.PARSE);
            // ActionLabelProcessorWrapper.SERIALIZE);
        } catch (Exception e) {
            // EditorUtils.log(new Status(IStatus.WARNING, SyncchartsSynchronizerPlugin.PLUGIN_ID,
            // SyncchartsUtil.MSG_LABEL_SERIAL_FAILED, e));
        }

        // for (CanonicalEditPolicy p : CanonicalEditPolicy.getRegisteredEditPolicies(model)) {
        // p.refresh();
        // }
        //
        // ((DiagramDocumentEditor) passiveEditor).getDiagramGraphicalViewer().flush();

        return CommandResult.newOKCommandResult();
    }

}
