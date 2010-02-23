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
package de.cau.cs.kieler.core.ui.policies;

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
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Handle;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Tool;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.gmf.runtime.common.ui.services.icon.IconService;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramAssistantEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.editparts.ISurfaceEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.PopupBarTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantService;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * Edit policy for the popup-bar.
 * 
 * @author soh
 * @kieler.rating 2009-02-23 proposed yellow
 * 
 */
@SuppressWarnings("restriction")
public class BalloonPopupBarEditPolicy extends DiagramAssistantEditPolicy {

    /**
     * 
     */
    private List<IBalloonContribution> contributions;

    /**
     * 
     */
    private EditPart editPart;

    /**
     * Creates a new BalloonPopupBarEditPolicy.java.
     * 
     * @param items
     *            the contributions
     * @param editPartParam
     *            the corresponding edit part
     */
    public BalloonPopupBarEditPolicy(final List<IBalloonContribution> items,
            final EditPart editPartParam) {
        contributions = items;
        this.editPart = editPartParam;
    }

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
        private String tooltip = new String();

        /** The image for the button. */
        private Image icon = null;

        /** The DracgTracker / Tool associated with the popup bar button. */
        private DragTracker dragTracker = null;

        /**
         * constructor.
         * 
         * @param s
         * @param i
         * @param theTracker
         */
        public PopupBarDescriptor(final String s, final Image i,
                final DragTracker theTracker) {
            tooltip = s;
            icon = i;
            dragTracker = theTracker;

        }

        /**
         * gets the icon associated with this Descriptor.
         * 
         * @return Image
         */
        public final Image getIcon() {
            return icon;
        }

        /**
         * gets the drag tracker associated with this Descriptor.
         * 
         * @return drag tracker
         */
        public final DragTracker getDragTracker() {
            return dragTracker;
        }

        /**
         * gets the tool tip associated with this Descriptor.
         * 
         * @return string
         */
        public final String getToolTip() {
            return tooltip;
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

        /** The dragTracker CreationTool associated with the handle. */
        private DragTracker myDragTracker = null;

        /**
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
         * constructor.
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
         * 
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

    /** */
    private static final Image IMAGE_POPUPBAR_PLUS = DiagramUIPluginImages
            .get(DiagramUIPluginImages.IMG_POPUPBAR_PLUS);

    /** */
    private static final Image IMAGE_POPUPBAR = DiagramUIPluginImages
            .get(DiagramUIPluginImages.IMG_POPUPBAR);

    /**
     * 
     * This is the figure that represents the ballon portion of the popup bar.
     * 
     * @author affrantz@us.ibm.com
     */
    private class RoundedRectangleWithTail extends RoundedRectangle {

        /** */
        private Image myTailImage = null;

        /** */
        private boolean bIsInit = false;

        /** */
        private static final int CORNER_DIM_DEFAULT = 6;

        /** */
        private static final int SHIFT_WIDTH = 3;

        /** */
        private static final int X_DIF = 6;

        /** */
        private int myCornerDimension = CORNER_DIM_DEFAULT;

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
            graphics.fillRoundRectangle(theBounds, myCornerDimension,
                    myCornerDimension);
            graphics.drawRoundRectangle(theBounds, myCornerDimension,
                    myCornerDimension);

            graphics.drawImage(theTail, theBounds.x + X_DIF, theBounds.y
                    + theBounds.height - 1);

        }

        /**
         * 
         * @return
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

        /** */
        private Point myPopupBarLastPosition = new Point(0, 0);

        /**
         * 
         * @param theBounds
         * @return
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

        /** */
        private static final int SOME_BUTTON_CONSTANT = 3;

        /**
         * @see org.eclipse.draw2d.MouseListener#mousePressed(org.eclipse.draw2d.MouseEvent)
         */
        @Override
        public void mousePressed(final MouseEvent me) {
            if (SOME_BUTTON_CONSTANT == me.button) {
                // context menu, hide the popup bar
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

    /** Y postion offset from shape where the balloon top begin. */
    private static final double BALLOON_X_OFFSET_RHS = 0.65;
    /** */
    private static final double BALLOON_X_OFFSET_LHS = 0.25;

    /** Y postion offset from shape where the balloon top begin. */
    private static final int ACTION_WIDTH_HGT = 30;
    /** */
    private static final int ACTION_BUTTON_START_X = 5;
    /** */
    private static final int ACTION_BUTTON_START_Y = 5;
    /** */
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
    /* For popup bars on connection edit parts*/

    /** Bit field for the actrionbar associated bits. */
    private int myPopupBarFlags = POPUPBAR_ACTIVATEONHOVER;

    /** */
    private double myBallonOffsetPercent = BALLOON_X_OFFSET_RHS;

    /** the figure used to surround the action buttons. */
    private IFigure myBalloon = null;

    /** The popup bar descriptors for the popup bar buttons. */
    private List<PopupBarDescriptor> myPopupBarDescriptors = new ArrayList<PopupBarDescriptor>();

    /** Images created that must be deleted when popup bar is removed. */
    private List<Image> imagesToBeDisposed = null;

    /** mouse keys listener for the owner shape. */
    private PopupBarMouseListener myMouseKeyListener = new PopupBarMouseListener();

    /** listener for owner shape movement. */
    private OwnerMovedListener myOwnerMovedListener = new OwnerMovedListener();

    /**
     * Flag for whether the mouse cursor is in the shape.
     * 
     * @param bit
     * @param b
     */
    private void setFlag(final int bit, final boolean b) {
        if (b) {
            myPopupBarFlags |= bit;
        } else if (getFlag(bit)) {
            myPopupBarFlags ^= bit;
        }

    }

    /**
     * 
     * @param bit
     * @return
     */
    private boolean getFlag(final int bit) {
        return ((myPopupBarFlags & bit) > 0);
    }

    /**
     * 
     * @param bVal
     */
    private void setPopupBarOnDiagramActivated(final boolean bVal) {
        setFlag(POPUPBAR_ONDIAGRAMACTIVATED, bVal);
    }

    /**
     * 
     * @return
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
     * Populates the popup bar with popup bar descriptors added by subclassing
     * this editpolicy (i.e. <code>fillPopupBarDescriptors</code> and by
     * querying the modeling assistant service for all types supported on the
     * popup bar of this host. For those types added by the modeling assistant
     * service the icons are retrieved using the Icon Service.
     */

    @SuppressWarnings("unchecked")
    protected void populatePopupBars() {
        fillPopupBarDescriptors();
        List types = ModelingAssistantService.getInstance()
                .getTypesForPopupBar(getHost());
        for (Iterator iter = types.iterator(); iter.hasNext();) {
            Object type = iter.next();
            if (type instanceof IElementType) {
                addPopupBarDescriptor((IElementType) type, IconService
                        .getInstance().getIcon((IElementType) type));
            }
        }
    }

    /**
     * This is the entry point that subclasses can override to fill the popup
     * bar descriptors if they have customized tools that cannot be done using
     * the type along with the modeling assistant service.
     */

    protected void fillPopupBarDescriptors() {
        // subclasses can override.
    }

    /**
     * 
     * @return
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
     * allows plugins to add their own popup bar tools and tips.
     * 
     * @param theImage
     *            the image of the descriptor
     * @param theTracker
     *            the drag tracker
     * @param theTip
     *            the tooltip
     */
    protected void addPopupBarDescriptor(final Image theImage,
            final DragTracker theTracker, final String theTip) {

        PopupBarDescriptor desc = new PopupBarDescriptor(theTip, theImage,
                theTracker);
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
     */
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final DragTracker theTracker) {

        String theInputStr = DiagramUIMessages.PopupBar_AddNew;

        String theTip = NLS.bind(theInputStr, elementType.getDisplayName());

        addPopupBarDescriptor(theImage, theTracker, theTip);
    }

    /**
     * default method for plugins which passes along the PopupBarTool as the
     * tool to be used.
     * 
     * @param elementType
     *            the element type
     * @param theImage
     *            the image
     */
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage) {

        this.addPopupBarDescriptor(elementType, theImage, new PopupBarTool(
                getHost(), elementType));

    }

    /**
     * @param elementType
     *            the type
     * @param theImage
     *            the image
     * @param theTip
     *            the tool tip
     */
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final String theTip) {

        PopupBarTool theTracker = new PopupBarTool(getHost(), elementType);
        PopupBarDescriptor desc = new PopupBarDescriptor(theTip, theImage,
                theTracker);
        myPopupBarDescriptors.add(desc);

    }

    /**
     * method used primarily to add UnspecifiedTypeCreationTool.
     * 
     * @param elementType
     *            the type
     * @param theImage
     *            the image
     * @param theRequest
     *            the create request to be used
     */
    protected void addPopupBarDescriptor(final IElementType elementType,
            final Image theImage, final CreateRequest theRequest) {

        PopupBarTool theTracker = new PopupBarTool(getHost(), theRequest);

        this.addPopupBarDescriptor(elementType, theImage, theTracker);
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
            PopupBarLabelHandle b = new PopupBarLabelHandle(theDesc
                    .getDragTracker(), theDesc.getIcon());

            Rectangle r1 = new Rectangle();
            r1.setLocation(xLoc, yLoc);
            xLoc += ACTION_WIDTH_HGT;
            r1
                    .setSize(ACTION_WIDTH_HGT, ACTION_WIDTH_HGT
                            - ACTION_MARGIN_RIGHT);

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
     * 
     * {@inheritDoc}
     */
    @Override
    protected boolean isDiagramAssistantShowing() {
        return getBalloon() != null;
    }

    /**
     * 
     * @return
     */
    private IFigure getBalloon() {
        return myBalloon;
    }

    /**
     * 
     * @return a rounded figure
     */
    protected IFigure createPopupBarFigure() {
        return new RoundedRectangleWithTail();
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    protected void showDiagramAssistant(final Point referencePoint) {
        Point refPoint = referencePoint;
        // already have a one
        if (getBalloon() != null && getBalloon().getParent() != null) {
            return;
        }

        if (contributions != null) {
            for (IBalloonContribution item : contributions) {
                if (item.setEditPart(editPart)) {
                    String tip = item.getTooltip();
                    Image image = item.getImage();
                    DragTracker tracker = new BalloonMouseListener(item);
                    PopupBarDescriptor desc = new PopupBarDescriptor(tip,
                            image, tracker);
                    getPopupBarDescriptors().add(desc);
                }
            }
        }

        initPopupBars();

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
        hideDiagramAssistantAfterDelay(getDisappearanceDelay());
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
     * 
     * @param bVal
     *            a boolean value.
     */
    protected void setIsDisplayAtMouseHoverLocation(final boolean bVal) {
        setFlag(POPUPBAR_DISPLAYATMOUSEHOVERLOCATION, bVal);
    }

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
        Point thePoint = new Point();
        boolean atMouse = getIsDisplayAtMouseHoverLocation();
        if (atMouse) {
            thePoint.setLocation(referencePoint);
            getHostFigure().translateToAbsolute(thePoint);
            getBalloon().translateToRelative(thePoint);

            // shift the ballon so it is above the cursor.
            thePoint.y -= ACTION_WIDTH_HGT;
            adjustToFitInViewport(thePoint);
        } else {
            Dimension theoffset = new Dimension();
            Rectangle rcBounds = getHostFigure().getBounds().getCopy();

            getHostFigure().translateToAbsolute(rcBounds);
            getBalloon().translateToRelative(rcBounds);

            theoffset.height = -(BALLOON_Y_OFFSET + ACTION_WIDTH_HGT);
            theoffset.width = (int) (rcBounds.width * myBallonOffsetPercent);

            thePoint.x = rcBounds.x + theoffset.width;
            thePoint.y = rcBounds.y + theoffset.height;
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

    /**
     * 
     */
    private void teardownPopupBar() {
        getBalloon().removeMouseMotionListener(this);
        getBalloon().removeMouseListener(myMouseKeyListener);
        // the feedback layer figures do not recieve mouse events
        IFigure layer = getLayer(LayerConstants.HANDLE_LAYER);
        if (myBalloon.getParent() != null) {
            layer.remove(myBalloon);
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
