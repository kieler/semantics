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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.gmf.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Handle;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Tool;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.gmf.runtime.common.ui.services.icon.IconService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.ISurfaceEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantService;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * Popup bars are esentially a cartoon balloon with buttons that are activated
 * during mouse hover over a shape.
 * 
 * soh: Modified slightly for better balloon placement and customized contents
 * of balloons.
 * 
 * @author affrantz@us.ibm.com, cmahoney
 */
@SuppressWarnings("restriction")
public class PopupBarPolicy extends DiagramAssistantEditPolicy {

    /* ************************** nested classes *********************** */
    /**
     * 
     * Class to hold pertinent information about the tool placed on the popup
     * bar.
     * 
     * @author affrantz@us.ibm.com
     */
    private class PopupBarDescriptor {

        /** The action button tooltip. */
        private String theTooltip = new String();

        /** The image for the button. */
        private Image theIcon = null;

        /** The typeinfo used to create the Request for the command. */
        private IElementType theElementType;

        /** The DracgTracker / Tool associatd with the popup bar button. */
        private DragTracker theDragTracker = null;

        /**
         * constructor.
         * 
         * @param s
         * @param i
         * @param elementType
         * @param theTracker
         */
        public PopupBarDescriptor(final String s, final Image i,
                final IElementType elementType, final DragTracker theTracker) {
            theTooltip = s;
            theIcon = i;
            theDragTracker = theTracker;
            theElementType = elementType;

        }

        /**
         * gets the element type associated with this Descriptor.
         * 
         * @return element type
         */
        @SuppressWarnings("unused")
        public final IElementType getElementtype() {
            return theElementType;
        }

        /**
         * gets the icon associated with this Descriptor.
         * 
         * @return Image
         */
        public final Image getIcon() {
            return theIcon;
        }

        /**
         * gets the drag tracker associated with this Descriptor.
         * 
         * @return drag tracker
         */
        public final DragTracker getDragTracker() {
            return theDragTracker;
        }

        /**
         * gets the tool tip associated with this Descriptor.
         * 
         * @return string
         */
        public final String getToolTip() {
            return theTooltip;
        }

    } // end PopupBarDescriptor

    /**
     * Default tool placed on the popup bar.
     * 
     * @author affrantz@us.ibm.com
     */
    private class PopupBarLabelHandle extends Label implements Handle {
        /**
         * flag to drawFocus rect around the handle when the mouse rolls over
         * it.
         */
        private boolean myMouseOver = false;

        /** The disabled image. */
        private Image myDisabledImage = null;

        /** The dragTracker CreationTool associated with the handle. * */
        private DragTracker myDragTracker = null;

        /**
         * Getter for the disabled image.
         * 
         * @return
         */
        private Image getDisabledImage() {
            if (myDisabledImage != null) {
                return myDisabledImage;
            }

            Image theImage = this.getIcon();
            if (theImage == null) {
                return null;
            }

            myDisabledImage = new Image(Display.getCurrent(), theImage,
                    SWT.IMAGE_DISABLE);
            if (imagesToBeDisposed == null) {
                imagesToBeDisposed = new ArrayList<Image>();
            }
            imagesToBeDisposed.add(myDisabledImage);
            return myDisabledImage;
        }

        /**
         * cnostructor. [sic!]
         * 
         * @param tracker
         * @param theImage
         */
        public PopupBarLabelHandle(final DragTracker tracker,
                final Image theImage) {
            super(theImage);
            myDragTracker = tracker;
            this.setOpaque(true);
            this.setBackgroundColor(ColorConstants.buttonLightest);
            calculateEnabled();
        }

        /**
         * @see org.eclipse.gef.Handle#getAccessibleLocation()
         */
        public Point getAccessibleLocation() {
            return null;
        }

        /**
         * @see org.eclipse.gef.Handle#getDragTracker()
         */
        public DragTracker getDragTracker() {
            return myDragTracker;
        }

        /**
         * @see org.eclipse.draw2d.Figure#paintBorder(org.eclipse.draw2d.Graphics)
         *      paint a focus rectangle for the label if the mouse is inside the
         *      label
         */
        @Override
        protected void paintBorder(final Graphics graphics) {
            super.paintBorder(graphics);

            if (myMouseOver) {

                Rectangle area = getClientArea();
                graphics.setForegroundColor(ColorConstants.black);
                graphics.setBackgroundColor(ColorConstants.white);

                graphics.drawFocus(area.x, area.y, area.width - 1,
                        area.height - 1);

            }

        }

        /**
         * @see org.eclipse.draw2d.IFigure#handleMouseEntered(org.eclipse.draw2d.MouseEvent)
         *      flip myMouseOver bit and repaint
         */
        @Override
        public void handleMouseEntered(final MouseEvent event) {

            calculateEnabled();

            super.handleMouseEntered(event);
            myMouseOver = true;
            repaint();
        }

        /**
         * @see org.eclipse.draw2d.IFigure#handleMouseExited(org.eclipse.draw2d.MouseEvent)
         *      flip myMouseOver bit and repaint
         */
        @Override
        public void handleMouseExited(final MouseEvent event) {

            super.handleMouseExited(event);
            myMouseOver = false;
            repaint();
        }

        /**
         * @see org.eclipse.draw2d.IFigure#handleMousePressed(org.eclipse.draw2d.MouseEvent)
         *      set PopupBarEditPolicy.myActionMoveFigure bit so the popup bar
         *      is not dismissed after creating an item in the editpart
         * 
         */
        @Override
        public void handleMousePressed(final MouseEvent event) {

            if (1 == event.button) {
                // this is the flag in PopupBarEditPolicy that
                // prevents the popup bar from dismissing after a new item
                // is added to a shape, which causes the editpart to be
                // resized.
                setFlag(POPUPBAR_MOVE_FIGURE, true);
                // future: when other tools besides PopupBarTool are
                // used
                // we will need a way in which to call

            }

            super.handleMousePressed(event);
        }

        /**
         * Calculate the enablement.
         */
        private void calculateEnabled() {
            if ((myDragTracker != null)
                    && (myDragTracker instanceof AbstractPopupBarTool)) {
                AbstractPopupBarTool abarTool = (AbstractPopupBarTool) myDragTracker;
                setEnabled(abarTool.isCommandEnabled());
            } else {
                setEnabled(true);
            }
        }

        /**
         * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
         */
        @Override
        protected void paintFigure(final Graphics graphics) {
            if (!isEnabled()) {
                Image theImage = getDisabledImage();
                if (theImage != null) {
                    graphics.translate(bounds.x, bounds.y);
                    graphics.drawImage(theImage, getIconLocation());
                    graphics.translate(-bounds.x, -bounds.y);
                    return;
                }

            }
            super.paintFigure(graphics);

        }
    }

    /** The image for the plus sign. */
    private static final Image IMAGE_POPUPBAR_PLUS = DiagramUIPluginImages
            .get(DiagramUIPluginImages.IMG_POPUPBAR_PLUS);

    /** The image for the popup bar. */
    private static final Image IMAGE_POPUPBAR = DiagramUIPluginImages
            .get(DiagramUIPluginImages.IMG_POPUPBAR);

    /**
     * 
     * This is the figure that represents the ballon portion of the popup bar.
     * 
     * @author affrantz@us.ibm.com
     */
    private class RoundedRectangleWithTail extends RoundedRectangle {

        /** The tail image. */
        private Image myTailImage = null;

        /** True if it is initial. */
        private boolean bIsInit = false;

        /** The corner dimension. */
        private static final int MY_CORNER_DIMENSION = 6;

        /** The shift width. */
        private static final int SHIFT_WIDTH = 3;

        /** The offset on the x axis. */
        private static final int X_OFFSET = 6;

        /**
         * constructor.
         */
        public RoundedRectangleWithTail() {
            // we do not make the myActionTailFigue opaque because it
            // doesn't look good when magnification is set.
            this.setFill(true);
            this.setBackgroundColor(ColorConstants.buttonLightest);
            this.setForegroundColor(ColorConstants.lightGray);
            this.setVisible(true);
            this.setEnabled(true);
            this.setOpaque(true);

        }

        /**
         * @see org.eclipse.draw2d.Figure#paintFigure(org.eclipse.draw2d.Graphics)
         */
        @Override
        public void paintFigure(final Graphics graphics) {
            Image theTail = getTail();
            Rectangle theBounds = this.getBounds().getCopy();
            theBounds.height -= theTail.getBounds().height;
            theBounds.height -= SHIFT_WIDTH; // shift slight above cursor
            theBounds.x += SHIFT_WIDTH; // shift slight to right of cursor
            theBounds.width -= (SHIFT_WIDTH + 1); // otherwise rhs is clipped

            // fill the round rectangle first since it is opaque
            graphics.fillRoundRectangle(theBounds, MY_CORNER_DIMENSION,
                    MY_CORNER_DIMENSION);
            graphics.drawRoundRectangle(theBounds, MY_CORNER_DIMENSION,
                    MY_CORNER_DIMENSION);
            graphics.drawImage(theTail, theBounds.x + X_OFFSET, theBounds.y
                    + theBounds.height - 1);
        }

        /**
         * Get the tail for the image.
         * 
         * @return the tail image
         */
        private Image getTail() {
            if (!bIsInit) {
                if (getIsDisplayAtMouseHoverLocation() && !isHostConnection()) {
                    if (myTailImage == null) {
                        myTailImage = IMAGE_POPUPBAR_PLUS;
                        bIsInit = true;
                    }
                } else {
                    if (myTailImage == null) {
                        myTailImage = IMAGE_POPUPBAR;
                        bIsInit = true;
                    }
                }
            }
            return myTailImage;
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected boolean isDiagramAssistant(final Object object) {
        return object instanceof RoundedRectangleWithTail
                || object instanceof PopupBarLabelHandle;
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
            showDiagramAssistantAfterDelay(getAppearanceDelayLocationSpecific()); // no
        } else if (shouldShowDiagramAssistant()) {
            showDiagramAssistant(getMouseLocation()); // no delay
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void mouseMoved(final MouseEvent me) {
        if (getIsDisplayAtMouseHoverLocation()) {
            Object srcObj = me.getSource();
            if ((srcObj != null) && srcObj.equals(getHostFigure())) {
                hideDiagramAssistant();
            }
        }
        setAvoidHidingDiagramAssistant(true);
        setMouseLocation(me.getLocation());

        if (!getIsDisplayAtMouseHoverLocation()) {
            // if the cursor is inside the popup bar
            // or the keyboar triggred activation
            // then we do not want to deactivate
            if (!isDiagramAssistant(me.getSource())) {
                setAvoidHidingDiagramAssistant(false);
            }

            showDiagramAssistantAfterDelay(getAppearanceDelay());
        }
    }

    /**
     * Listens to the owner figure being moved so the handles can be removed
     * when this occurs.
     * 
     * @author affrantz@us.ibm.com
     * 
     */
    private class OwnerMovedListener implements FigureListener {

        /** The last position of the popup bar. */
        private Point myPopupBarLastPosition = new Point(0, 0);

        /**
         * Determine whether the position of the popup bar was changed.
         * 
         * @param theBounds
         *            the new bounds
         * @return true if it has changed
         */
        boolean hasPositionChanged(final Rectangle theBounds) {
            if (theBounds.x != myPopupBarLastPosition.x) {
                return true;
            }
            if (theBounds.y != myPopupBarLastPosition.y) {
                return true;
            }
            return false;
        }

        /**
         * @see org.eclipse.draw2d.FigureListener#figureMoved(org.eclipse.draw2d.IFigure)
         */
        public void figureMoved(final IFigure source) {
            // for some reason we get more than one
            // figure moved call after compartment items are added
            // myActionMoveFigure handles the first one which we expect
            // hasPositionChanged handles the others caused by the selection of
            // the compartment
            // item.
            if (getFlag(POPUPBAR_MOVE_FIGURE)
                    && hasPositionChanged(source.getBounds())) {
                hideDiagramAssistant(); // without delay
            } else {
                setFlag(POPUPBAR_MOVE_FIGURE, false); // toggle flag back
                Rectangle theBounds = source.getBounds();
                myPopupBarLastPosition.setLocation(theBounds.x, theBounds.y);

            }

        }
    }

    /**
     * Listens for mouse key presses so the popup bar can be dismissed if the
     * context menu is displayed.
     * 
     * @author affrantz@us.ibm.com
     */
    private class PopupBarMouseListener extends MouseListener.Stub {

        /** Mouse Button 3 constant. */
        private static final int MOUSE_3 = 3;

        /**
         * @see org.eclipse.draw2d.MouseListener#mousePressed(org.eclipse.draw2d.MouseEvent)
         */
        @Override
        public void mousePressed(final MouseEvent me) {
            if (MOUSE_3 == me.button) { // context menu, hide the popup bar
                hideDiagramAssistant();
            }
            super.mousePressed(me);
            setPopupBarOnDiagramActivated(true);
        }

        @Override
        public void mouseReleased(final MouseEvent me) {
            super.mouseReleased(me);

        }
    }

    /* ************************* End nested classes ******************** */

    /** Y postion offset from shape where the balloon top begin. */
    private static final int BALLOON_Y_OFFSET = 10;

    /** X postion offset from shape where the balloon top begin. */
    private static final double BALLOON_X_OFFSET_RHS = 0.65;
    /** X postion offset from shape where the balloon top begin. */
    private static final double BALLOON_X_OFFSET_LHS = 0.25;

    /** The action height. */
    private static final int ACTION_WIDTH_HGT = 30;

    /** X position offset from balloon where the action starts. */
    private static final int ACTION_BUTTON_START_X = 5;

    /** Y position offset from balloon where the action starts. */
    private static final int ACTION_BUTTON_START_Y = 5;

    /** The right margin of actions. */
    private static final int ACTION_MARGIN_RIGHT = 10;

    /** popup bar bits. */
    private static final int POPUPBAR_ACTIVATEONHOVER = 0x01;
    /** Display the action when hovering. */
    private static final int POPUPBAR_MOVE_FIGURE = 0x02;
    /**
     * Ignore the first figureMoved event when creating elements inside a shape
     * via a popup bar.
     */
    private static final int POPUPBAR_DISPLAYATMOUSEHOVERLOCATION = 0x04;
    /**
     * Display the popup bar at the mouse location used by diagrams and machine
     * edit parts.
     */
    private static final int POPUPBAR_ONDIAGRAMACTIVATED = 0x10;
    /**
     * For popup bars on diagram and machine edit parts, where we
     * POPUPBAR_DISPLAYATMOUSEHOVERLOCATION, don't display popup bar until user
     * clicks on surface.
     */
    private static final int POPUPBAR_HOST_IS_CONNECTION = 0x20;
    /** For popup bars on connection edit parts. */

    /** Bit field for the actrionbar associated bits. */
    private int myPopupBarFlags = POPUPBAR_ACTIVATEONHOVER;

    /** Offset percentage. */
    private double myBallonOffsetPercent = BALLOON_X_OFFSET_RHS;

    /** the figure used to surround the action buttons. */
    private IFigure myBalloon = null;

    /** The popup bar descriptors for the popup bar buttons. */
    private List<PopupBarDescriptor> myPopupBarDescriptors = new ArrayList<PopupBarDescriptor>();

    /** Images created that must be deleted when popup bar is removed. */
    private List<Image> imagesToBeDisposed = null;

    /**
     * Getter for the list.
     * 
     * @return the list
     */
    protected List<Image> getImagesToBeDisposed() {
        return imagesToBeDisposed;
    }

    /** mouse keys listener for the owner shape. */
    private PopupBarMouseListener myMouseKeyListener = new PopupBarMouseListener();

    /** listener for owner shape movement. */
    private OwnerMovedListener myOwnerMovedListener = new OwnerMovedListener();

    /** flag for whether mouse cursor within shape. */

    /**
     * Set a flag.
     * 
     * @param bit
     *            the flag to set
     * @param b
     *            the new value
     * 
     */
    private void setFlag(final int bit, final boolean b) {
        if (b) {
            myPopupBarFlags |= bit;
        } else if (getFlag(bit)) {
            myPopupBarFlags ^= bit;
        }

    }

    /**
     * Getter for a flag.
     * 
     * @param bit
     *            the flag to get
     * @return true if the flag is set
     */
    private boolean getFlag(final int bit) {
        return ((myPopupBarFlags & bit) > 0);
    }

    /**
     * Set the flag.
     * 
     * @param bVal
     *            the new value of the flag
     */
    private void setPopupBarOnDiagramActivated(final boolean bVal) {
        setFlag(POPUPBAR_ONDIAGRAMACTIVATED, bVal);
    }

    /**
     * Getter for the flag.
     * 
     * @return the flag
     */
    private boolean getPopupBarOnDiagramActivated() {
        return getFlag(POPUPBAR_ONDIAGRAMACTIVATED);
    }

    /**
     * set the host is connection flag.
     * 
     * @param bVal
     *            the new value
     */
    protected void setHostConnection(final boolean bVal) {
        setFlag(POPUPBAR_HOST_IS_CONNECTION, bVal);
    }

    /**
     * get the host is connection flag.
     * 
     * @return true or false
     */
    protected boolean isHostConnection() {
        return getFlag(POPUPBAR_HOST_IS_CONNECTION);
    }

    /**
     * Populates the popup bar with popup bar descriptors added by suclassing
     * this editpolicy (i.e. <code>fillPopupBarDescriptors</code> and by
     * querying the modeling assistant service for all types supported on the
     * popup bar of this host. For those types added by the modeling assistant
     * service the icons are retrieved using the Icon Service.
     */
    protected void populatePopupBars() {
        fillPopupBarDescriptors();
        List<?> types = ModelingAssistantService.getInstance()
                .getTypesForPopupBar(getHost());
        for (Iterator<?> iter = types.iterator(); iter.hasNext();) {
            Object type = iter.next();
            if (type instanceof IElementType) {
                addPopupBarDescriptor((IElementType) type, IconService
                        .getInstance().getIcon((IElementType) type));
            }
        }
    }

    /**
     * This is the entry point that subclasses can override to fill the popup
     * bar descrioptors if they have customized tools that cannot be done using
     * the type along with the modeling assistant service.
     */
    protected void fillPopupBarDescriptors() {
        // subclasses can override.
    }

    /**
     * Determine whether the selection tool is active.
     * 
     * @return true if it is
     */
    private boolean isSelectionToolActive() {
        // getViewer calls getParent so check for null
        if (getHost().getParent() != null && getHost().isActive()) {
            Tool theTool = getHost().getViewer().getEditDomain()
                    .getActiveTool();
            if ((theTool != null) && theTool instanceof SelectionTool) {
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected boolean shouldShowDiagramAssistant() {
        if (!super.shouldShowDiagramAssistant()) {
            return false;
        }

        if (this.getIsDisplayAtMouseHoverLocation()) {
            if (isHostConnection()) {
                return isSelectionToolActive();
            }
            if (getPopupBarOnDiagramActivated()) {
                return isSelectionToolActive();
            }
            return false;
        }
        return isSelectionToolActive();

    }

    /**
     * This method allows plugins to add their own popup bar tools and tips.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     * @param theTracker
     *            the tracker
     * @param theTip
     *            the tool tip
     */
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final DragTracker theTracker,
            final String theTip) {

        PopupBarDescriptor desc = new PopupBarDescriptor(theTip, theImage,
                elementType, theTracker);
        myPopupBarDescriptors.add(desc);
    }

    /**
     * adds popup bar descriptor.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     * @param theTracker
     *            the tracker
     * @deprecated don't use this
     */
    @Deprecated
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final DragTracker theTracker) {
    }

    /**
     * default method for plugins which passes along the PopupBarTool as the
     * tool to be used.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     * @deprecated don't use this
     */
    @Deprecated
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage) {
    }

    /**
     * Add a new descriptor.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     * @param theTip
     *            the tool tip
     * @deprecated don't use this
     */
    @Deprecated
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final String theTip) {
    }

    /**
     * method used primarily to add UnspecifiedTypeCreationTool.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     * @param theRequest
     *            the create request to be used
     * @deprecated don't use this
     */
    @Deprecated
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final CreateRequest theRequest) {
    }

    /**
     * gets the popup bar descriptors.
     * 
     * @return list
     */
    protected List<PopupBarDescriptor> getPopupBarDescriptors() {
        return myPopupBarDescriptors;
    }

    /**
     * initialize the popup bars from the list of action descriptors.
     */
    private void initPopupBars() {

        List<PopupBarDescriptor> theList = getPopupBarDescriptors();
        if (theList.isEmpty()) {
            return;
        }
        myBalloon = createPopupBarFigure();

        int iTotal = ACTION_WIDTH_HGT * theList.size() + ACTION_MARGIN_RIGHT;

        getBalloon().setSize(iTotal,
                ACTION_WIDTH_HGT + 2 * ACTION_BUTTON_START_Y);

        int xLoc = ACTION_BUTTON_START_X;
        int yLoc = ACTION_BUTTON_START_Y;

        for (Iterator<PopupBarDescriptor> iter = theList.iterator(); iter
                .hasNext();) {
            PopupBarDescriptor theDesc = iter.next();

            // Button b = new Button(theDesc.myButtonIcon);
            PopupBarLabelHandle b = new PopupBarLabelHandle(
                    theDesc.getDragTracker(), theDesc.getIcon());

            Rectangle r1 = new Rectangle();
            r1.setLocation(xLoc, yLoc);
            xLoc += ACTION_WIDTH_HGT;
            r1.setSize(ACTION_WIDTH_HGT, ACTION_WIDTH_HGT - ACTION_MARGIN_RIGHT);

            Label l = new Label();
            l.setText(theDesc.getToolTip());

            b.setToolTip(l);
            b.setPreferredSize(ACTION_WIDTH_HGT, ACTION_WIDTH_HGT);
            b.setBounds(r1);

            getBalloon().add(b);

            b.addMouseMotionListener(this);
            b.addMouseListener(this.myMouseKeyListener);

        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isPreferenceOn() {
        String prefName = IPreferenceConstants.PREF_SHOW_POPUP_BARS;
        if (prefName == null) {
                return true;
        }
        IPreferenceStore preferenceStore = (IPreferenceStore) ((IGraphicalEditPart) getHost())
                .getDiagramPreferencesHint().getPreferenceStore();
        return preferenceStore.getBoolean(prefName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean isDiagramAssistantShowing() {
        return getBalloon() != null;
    }

    /**
     * Get the current balloon.
     * 
     * @return the balloon
     */
    private IFigure getBalloon() {
        return myBalloon;
    }

    /**
     * Create a new figure for the balloon.
     * 
     * 
     * @return a figure for the balloon
     */
    protected IFigure createPopupBarFigure() {
        return new RoundedRectangleWithTail();
    }

    @Override
    protected void showDiagramAssistant(final Point referencePoint) {
        Point refPoint = referencePoint;
        // already have a one
        if (getBalloon() != null && getBalloon().getParent() != null) {
            return;
        }

        if (this.myPopupBarDescriptors.isEmpty()) {

            populatePopupBars();
            initPopupBars();

            if (myPopupBarDescriptors.isEmpty()) {
                return; // nothing to show
            }
        }
        if (getBalloon() == null) {
            // nothing to show
            return;
        }
        getBalloon().addMouseMotionListener(this);
        getBalloon().addMouseListener(myMouseKeyListener);

        // the feedback layer figures do not recieve mouse events so do not use
        // it for popup bars
        IFigure layer = getLayer(LayerConstants.HANDLE_LAYER);
        layer.add(getBalloon());

        if (refPoint == null) {
            refPoint = getHostFigure().getBounds().getCenter();
        }

        Point thePoint = getBalloonPosition(refPoint);

        getBalloon().setLocation(thePoint);

        // dismiss the popup bar after a delay
        if (!shouldAvoidHidingDiagramAssistant()) {
            hideDiagramAssistantAfterDelay(getDisappearanceDelay());
        }
    }

    /**
     * getter for the IsDisplayAtMouseHoverLocation flag.
     * 
     * @return true or false
     */
    protected boolean getIsDisplayAtMouseHoverLocation() {
        return getFlag(POPUPBAR_DISPLAYATMOUSEHOVERLOCATION);
    }

    /**
     * setter for the IsDisplayAtMouseHoverLocation.
     * 
     * @param bVal
     *            the new value
     */
    protected void setIsDisplayAtMouseHoverLocation(final boolean bVal) {
        setFlag(POPUPBAR_DISPLAYATMOUSEHOVERLOCATION, bVal);
    }

    private static final int X_OFFSET = 5;

    /**
     * For editparts that consume the entire viewport, statechart, structure,
     * communication, we want to display the popup bar at the mouse location.
     * 
     * @param referencePoint
     *            The reference point which may be used to determine where the
     *            diagram assistant should be located. This is most likely the
     *            current mouse location.
     * @return Point
     */
    private Point getBalloonPosition(final Point referencePoint) {
        int hostUpperX = getHostFigure().getBounds().x;
        int hostUpperY = getHostFigure().getBounds().y;
        int hostLowerX = getHostFigure().getBounds().width + hostUpperX;
        int hostLowerY = getHostFigure().getBounds().height + hostUpperY;
        Point thePoint = new Point();
        thePoint.setLocation(referencePoint);
        getHostFigure().translateToAbsolute(thePoint);
        getBalloon().translateToRelative(thePoint);

        boolean atMouse = getIsDisplayAtMouseHoverLocation();
        if (atMouse
                || (thePoint.x >= hostUpperX && thePoint.x <= hostLowerX
                        && thePoint.y >= hostUpperY && thePoint.y <= hostLowerY)) {

            // shift the ballon so it is above the cursor.
            thePoint.y -= ACTION_WIDTH_HGT;
            thePoint.x += X_OFFSET;
            adjustToFitInViewport(thePoint);
        } else {
            if (thePoint.x < getHostFigure().getBounds().width) {
                thePoint.x = referencePoint.x;
                thePoint.y -= ACTION_WIDTH_HGT;
            } else {
                Dimension theoffset = new Dimension();
                Rectangle rcBounds = getHostFigure().getBounds().getCopy();

                getHostFigure().translateToAbsolute(rcBounds);
                getBalloon().translateToRelative(rcBounds);

                theoffset.height = -(BALLOON_Y_OFFSET + ACTION_WIDTH_HGT);
                theoffset.width = (int) (rcBounds.width * myBallonOffsetPercent);

                thePoint.x = rcBounds.x + theoffset.width;
                thePoint.y = rcBounds.y + theoffset.height;
            }
            adjustToFitInViewport(thePoint);
        }
        return thePoint;
    }

    /**
     * Uses the balloon location passed in and its size to determine if the
     * balloon will appear outside the viewport. If so, the balloon location
     * will be modified accordingly.
     * 
     * @param balloonLocation
     *            the suggested balloon location passed in and potentially
     *            modified when this method completes
     */
    private void adjustToFitInViewport(final Point balloonLocation) {
        Control control = getHost().getViewer().getControl();
        if (control instanceof FigureCanvas) {
            Rectangle viewportRect = ((FigureCanvas) control).getViewport()
                    .getClientArea();
            Rectangle balloonRect = new Rectangle(balloonLocation, getBalloon()
                    .getSize());

            int yDiff = viewportRect.y - balloonRect.y;
            if (yDiff > 0) {
                // balloon is above the viewport, shift down
                balloonLocation.translate(0, yDiff);
            }
            int xDiff = balloonRect.right() - viewportRect.right();
            if (xDiff > 0) {
                // balloon is to the right of the viewport, shift left
                balloonLocation.translate(-xDiff, 0);
            }
        }
    }

    private void teardownPopupBar() {
        // TODO: need this modified method
        getBalloon().removeMouseMotionListener(this);
        getBalloon().removeMouseListener(myMouseKeyListener);
        // the feedback layer figures do not recieve mouse events
        // IFigure layer = getLayer(LayerConstants.HANDLE_LAYER);
        if (myBalloon.getParent() != null) {
            myBalloon.getParent().remove(myBalloon);
            myBalloon.erase();
            // layer.remove(myBalloon);
        }
        myBalloon = null;

        this.myPopupBarDescriptors.clear();

        if (imagesToBeDisposed != null) {
            for (Iterator<Image> iter = imagesToBeDisposed.iterator(); iter
                    .hasNext();) {
                iter.next().dispose();
            }
            imagesToBeDisposed.clear();
        }
    }

    @Override
    protected void hideDiagramAssistant() {
        if (getBalloon() != null) {

            teardownPopupBar();
        }

    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected void showDiagramAssistantAfterDelay(final int theDelay) {
        // only show the popup bar if it isn't already showing
        if (!isDiagramAssistantShowing()) {
            super.showDiagramAssistantAfterDelay(theDelay);
        }
    }

    @Override
    public void activate() {
        super.activate();

        getHostFigure().addMouseListener(this.myMouseKeyListener);
        getHostFigure().addFigureListener(this.myOwnerMovedListener);

        if (getHost() instanceof ISurfaceEditPart) {
            setIsDisplayAtMouseHoverLocation(true);
        }
    }

    @Override
    public void deactivate() {
        getHostFigure().removeMouseListener(this.myMouseKeyListener);
        getHostFigure().removeFigureListener(this.myOwnerMovedListener);

        super.deactivate();

    }

    /**
     * This is the default which places the popup bar to favor the right side of
     * the shape.
     * 
     * @deprecated this is not being used anymore
     */
    @Deprecated
    protected void setRightHandDisplay() {
        this.myBallonOffsetPercent = BALLOON_X_OFFSET_RHS;
    }

    /**
     * Place the popup bar to favor the left had side of the shape.
     * 
     * @deprecated this is not being used anymore
     */
    @Deprecated
    protected void setLeftHandDisplay() {
        this.myBallonOffsetPercent = BALLOON_X_OFFSET_LHS;
    }

    /**
     * check thee right display status.
     * 
     * @return true or false
     * @deprecated this is not being used anymore
     */
    @Deprecated
    protected boolean isRightDisplay() {
        return (BALLOON_X_OFFSET_RHS == myBallonOffsetPercent);
    }

    /**
     * Gets the amount of time to wait before showing the popup bar if the popup
     * bar is to be shown at the mouse location
     * {@link #getIsDisplayAtMouseHoverLocation()}.
     * 
     * @return the time to wait in milliseconds
     */
    protected int getAppearanceDelayLocationSpecific() {
        return getAppearanceDelay();
    }

    @Override
    protected String getDiagramAssistantID() {
        return PopupBarEditPolicy.class.getName();
    }
}
