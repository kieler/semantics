/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ksbase.gmf.handler;

import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.model.gmf.policies.BalloonMouseListener;
import de.cau.cs.kieler.core.model.gmf.policies.DiagramPopupBarPolicy;
import de.cau.cs.kieler.core.model.gmf.policies.IBalloonContribution;


/**
 * Policy for displaying balloons.
 * 
 * @author soh
 */
public class BalloonPopupBarEditPolicy extends DiagramPopupBarPolicy {

    /** The edit part that the policy belongs to. */
    private EditPart editPart;

    /** The list of contributions that should be applied to the edit part. */
    private List<IBalloonContribution> contributions;

    /** The delay for showing the balloon. */
    private static final int DELAY = 200;

    /**
     * 
     * Creates a new BalloonPopupBarEditPolicy.
     * 
     * @param contrib
     *            contributions
     * @param part
     *            the edit part
     */
    public BalloonPopupBarEditPolicy(final List<IBalloonContribution> contrib, final EditPart part) {
        editPart = part;
        contributions = contrib;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void mouseHover(final MouseEvent me) {
        // if the cursor is inside the popup bar
        // or the keyboard triggred activation
        // then we do not want to deactivate
        if (!isDiagramAssistant(me.getSource())) {
            setAvoidHidingDiagramAssistant(false);
        }
        setMouseLocation(me.getLocation());
        if (getIsDisplayAtMouseHoverLocation()) {
            showDiagramAssistantAfterDelay(DELAY); // no
        } else {
            showDiagramAssistant(getMouseLocation()); // no delay
        }
    }

    @Override
    protected void fillPopupBarDescriptors() {
        super.fillPopupBarDescriptors();

        IDiagramEditDomain domain = null;
        EditDomain editDomain = editPart.getRoot().getViewer().getEditDomain();
        if (editDomain instanceof IDiagramEditDomain) {
            domain = (IDiagramEditDomain) editDomain;
        }
        
        if (domain != null && domain instanceof DiagramEditDomain) {
            IEditorPart editor = ((DiagramEditDomain) domain).getEditorPart();
            final DiagramDocumentEditor diagramEditor = (DiagramDocumentEditor) editor;
            String id = diagramEditor.getEditorSite().getPluginId();
            boolean showPopupBars = Platform.getPreferencesService().getBoolean(id,
                    "Global.showPopupBars", true, null);
            if (contributions != null && showPopupBars) {
                for (IBalloonContribution item : contributions) {
                    item.init(editPart);
                    if (item.isValid()) {
                        String tip = item.getTooltip();
                        Image image = item.getImage();
                        DragTracker tracker = new BalloonMouseListener(item);
                        IElementType type = generateType();
                        super.addPopupBarDescriptor(type, image, tracker, tip);
                    }
                }
            }
        }
    }

    /**
     * generate the type.
     * 
     * @return type
     */
    private IElementType generateType() {
        return new IElementType() {

            @SuppressWarnings("rawtypes")
            public Object getAdapter(final Class adapter) {
                return null;
            }

            public String getId() {
                return null;
            }

            public URL getIconURL() {
                return null;
            }

            public IEditHelper getEditHelper() {
                return null;
            }

            public ICommand getEditCommand(final IEditCommandRequest request) {
                return null;
            }

            public EClass getEClass() {
                return null;
            }

            public String getDisplayName() {
                return "The name";
            }

            public IElementType[] getAllSuperTypes() {
                return null;
            }

            public boolean canEdit(final IEditCommandRequest req) {
                return false;
            }
        };
    }

}
