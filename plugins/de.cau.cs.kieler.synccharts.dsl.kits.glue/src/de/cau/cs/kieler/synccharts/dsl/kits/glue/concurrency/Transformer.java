/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.kits.glue.concurrency;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.impl.RegionImpl;

/**
 * @author oba
 * 
 */
public class Transformer {
    public Transformer() {
        // TODO Auto-generated constructor stub
    }

    // @SuppressWarnings("unused")
    void setLabel2Id() {
        EObject regionElement = null;
        EditPart diagramEditPart = getDiagramEditPart();
        if (diagramEditPart.getModel() != null) {
            regionElement = ((View) diagramEditPart.getModel()).getElement();
        }
        if (regionElement instanceof RegionImpl) {
            Region diagramRoot = (Region) regionElement;
            /** start from the diagram root which is a region */
            setLabel2Id(diagramRoot);
            setDelay(diagramRoot);
            System.out.println("Dolly created, can you see her?");
        }
    }

    void setLabel2Id(Region region) {
        /** get the workbench and editing domain */
        IWorkbenchPart workbenchPart = getIWorkbenchPart();
        TransactionalEditingDomain editingDomain = (TransactionalEditingDomain) ((SyncchartsDiagramEditor) workbenchPart)
                .getEditingDomain();
        /** if the region has inner states */
        if (region.getInnerStates() != null) {
            EList<State> innerStates = region.getInnerStates();
            for (State s : innerStates) {
                /** set label of one of its states to its id */
                EAttribute labelAttribute = SyncchartsPackage.eINSTANCE
                        .getState_Label();
                SetCommand setLabelCommand = (SetCommand) SetCommand.create(
                        editingDomain, s, labelAttribute, s.getId());

                editingDomain.getCommandStack().execute(setLabelCommand);
                /** every state has regions */
                setLabel2Id(s);

            }
        }

    }

    void setLabel2Id(State s) {
        if (s.getRegions() != null) {
            for (Region r : s.getRegions()) {
                setLabel2Id(r);
                setDelay(r);
            }
        }
    }

    void setDelay(Region r) {
        if (r.getInnerStates() != null) {
            for (State s : r.getInnerStates()) {
                if (s.getOutgoingTransitions() != null) {
                    for (Transition t : s.getOutgoingTransitions()) {
                        /**
                         * init I final F I-->F;
                         * 
                         * yields to the transition F-->F; because the
                         * transition belongs to F thus sourceState =
                         * EOpposite(F.outgoingTransitions) <=> sourceState =
                         * EOpposite(???)
                         */
                        t.setDelay(1);

                    }

                }
            }
        }
    }

    // ================ HELPER METHODS ================ //

    /**
     * copied from {@link ACombination}
     * 
     * @param part
     */
    DiagramEditPart getDiagramEditPart() {
        IWorkbenchPart workbenchPart = getIWorkbenchPart();
        IEditorPart editorPart = null;
        DiagramEditPart rootEditPart = null;

        if (workbenchPart instanceof IEditorPart) {
            editorPart = ((IEditorPart) workbenchPart);

        }
        if (editorPart instanceof DiagramEditor) {
            rootEditPart = ((DiagramEditor) editorPart).getDiagramEditPart();
        }
        return rootEditPart;
    }

    /**
     * get the active editor part
     * 
     * @return IWorkbenchPart
     */
    IWorkbenchPart getIWorkbenchPart() {
        IWorkbenchPart editor = null;
        IWorkbenchPage activePage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();

        IEditorReference[] editorReferences = activePage.getEditorReferences();

        for (IEditorReference editorReference : editorReferences) {
            editor = editorReference.getEditor(false);
            if (editor instanceof DiagramEditor) {
                editor = ((DiagramEditor) editor);

            }

        }
        System.out
                .println("========================================================");
        System.out
                .println("getIWorkbenchPart results in: " + editor.toString());
        System.out
                .println("========================================================");
        return editor;
    }

    // @SuppressWarnings("unused")
    void ManualLayoutTrigger(IWorkbenchPart part) {
        if (part instanceof DiagramEditor) {
            // get the RegionEditPart
            EditPart e = ((DiagramEditor) part).getDiagramEditPart().getRoot()
                    .getContents();
            if (!(e instanceof DiagramEditPart)) {
                System.out
                        .println("========================================================");
                System.out.println("Problem in: ManualLayoutTrigger");
                System.out.println("You really shouldn't be here!");
                // e = (EditPart) e.getChildren().get(0);
                System.out
                        .println("It is crazy that the root of the diagram is: "
                                + e.toString());
                System.out.println("Thus layout will probably fail");
                System.out
                        .println("========================================================");
            }
            // run msp layout
            DiagramLayoutManager.layout(((DiagramEditor) part), e, true, false);

        } else {
            System.out
                    .println("========================================================");
            System.out.println("I was invoked from an Xtext editor");

            System.out
                    .println("========================================================");
        }

    }
}
