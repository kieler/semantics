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
package de.cau.cs.kieler.core.ui.policies;

import java.net.URL;
import java.util.List;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.swt.graphics.Image;

/**
 * Policy for displaying balloons.
 * 
 * @author soh
 * @kieler.rating 2010-03-04 proposed yellow
 */
public class BalloonPopupBarEditPolicy extends DiagramPopupBarPolicy {

    /** */
    private EditPart editPart;

    /** */
    private List<IBalloonContribution> contributions;

    /** */
    private static final int DELAY = 200;

    /**
     * 
     * Creates a new Policy2.java.
     * 
     * @param contrib
     *            contributions
     * @param part
     *            the edit part
     */
    public BalloonPopupBarEditPolicy(final List<IBalloonContribution> contrib,
            final EditPart part) {
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
        // or the keyboar triggred activation
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
        if (contributions != null) {
            for (IBalloonContribution item : contributions) {
                if (item.setEditPart(editPart)) {
                    String tip = item.getTooltip();
                    Image image = item.getImage();
                    DragTracker tracker = new BalloonMouseListener(item);
                    IElementType type = generateType();
                    super.addPopupBarDescriptor(type, image, tracker, tip);

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

            @SuppressWarnings("unchecked")
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
