/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.karma.kivi;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.karma.AdvancedRenderingLabelEditPart;
import de.cau.cs.kieler.karma.IRenderingProvider;
import de.cau.cs.kieler.karma.IRenderingProvider.CollapseStatus;
import de.cau.cs.kieler.karma.SwitchableFigure;

/**
 * With this effect you can manually trigger a new karma rendering. This behaves as if a condition
 * has just been evaluated to true and sets a new rendering according to the given parameters.
 * 
 * Be careful there are no conflicting conditions i.e. if at the same time as this is executed a
 * condition that wants a different rendering is evaluated true it might produce an unexpected
 * result.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public class KarmaEffect extends AbstractEffect {

    private IRenderingProvider renderingProvider;
    private IFigure figure;
    private IFigure oldFigure;
    private EObject modelElement;
    private IGraphicalEditPart editPart;

    private String layoutParam;
    private String figureParam;
    private String borderItemParam;
    private Pair<Integer, Integer> figureSize = new Pair<Integer, Integer>(-1, -1);

    private CollapseStatus collapseStatus = CollapseStatus.UNCHANGED;

    /**
     * Constructor for initializing a new karma effect that executes a new rendering according to
     * the given parameters.
     * 
     * @param renderingProvider
     *            the rendering provider to be used for the rendering.
     * @param figure
     *            the figure whose rendering should be changed. This is supposed to be the container
     *            figure which is likely of type SwitchableFigure. 
     *            You can often get it by calling someIAdvancedREnderingEditPart.getPrimaryShape().
     * @param modelElement
     *            the modelelement whose rendering should be changed.
     * @param editPart
     *            the editpart whose rendering should be changed
     * @param figureParam
     *            the figureParam to be given to the rendering provider. May be null if no change is
     *            intended.
     * @param layoutParam
     *            the layoutParam to be given to the rendering provider. May be null if no change is
     *            intended.
     * @param borderItemParam
     *            the borderItemParam to be given to the rendering provider. May be null if no
     *            change is intended.
     * @param figureSize
     *            the figureSize that sets a fixed node size. May be null if no change is intended.
     * @param collapseStatus
     *            the collapse status to be given to the rendering provider, default is
     *            CollapseStatus.UNCHANGED .
     */
    public KarmaEffect(final IRenderingProvider renderingProvider, final IFigure figure,
            final EObject modelElement, final IGraphicalEditPart editPart,
            final String figureParam, final String layoutParam, final String borderItemParam,
            final Pair<Integer, Integer> figureSize, final CollapseStatus collapseStatus) {
        this.renderingProvider = renderingProvider;
        this.figure = figure;
        this.modelElement = editPart.getNotationView().getElement();
        this.editPart = editPart;
        this.layoutParam = layoutParam;
        this.figureParam = figureParam;
        this.borderItemParam = borderItemParam;
        if (figureSize != null) {
            this.figureSize = figureSize;
        }
        if (collapseStatus != null) {
            this.collapseStatus = collapseStatus;
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void execute() {
        SwitchableFigure switchableFigure = null;
        if ((figure instanceof SwitchableFigure)) {
            switchableFigure = (SwitchableFigure) figure;
            oldFigure = switchableFigure.getCurrentFigure();
        } else {
            oldFigure = figure;
        }
        this.setFigure(renderingProvider, figureParam, oldFigure, modelElement, switchableFigure,
                editPart);
        this.setLayoutManager(figure, renderingProvider, layoutParam, modelElement);
        this.setBorderItemLocator(editPart, renderingProvider, borderItemParam, modelElement,
                figure);

        // setting a fixed node size
        if (((figureSize.getFirst() >= 0) && (figureSize.getSecond() >= 0))
                && switchableFigure != null) {
            Dimension size = new Dimension(figureSize.getFirst(), figureSize.getSecond());
            setFixedNodeSize(switchableFigure, figure, size);
        } else {
            Dimension size = renderingProvider.getSizeByString(figureParam, modelElement, editPart);
            if (size != null) {
                setFixedNodeSize(switchableFigure, figure, size);
            }
        }
    }

    /**
     * Gets the most recent collapse status.
     * @return the collapse status
     */
    public CollapseStatus getCollapseStatus() {
        return collapseStatus;
    }

    /**
     * Sets the current collapse status.
     * @param collapseStatus the current collapse status
     */
    public void setCollapseStatus(final CollapseStatus collapseStatus) {
        this.collapseStatus = collapseStatus;
    }

    /**
     * method that gets a figure from the renderingProvider and sets it to the SwitchableFigure for
     * display.
     * 
     * @param renderingProvider
     *            the renderingProvider to get the new figure from.
     * @param figureParam
     *            the string representation of the new figure to be given to the renderingProvider.
     * @param oldFigure
     *            the old figure.
     * @param modelElement
     *            the modelElement whose graphical representation should be changed
     * @param switchableFigure
     *            the enclosing SwitchableFigure
     */
    private void setFigure(final IRenderingProvider theRenderingProvider, final String theFigureParam,
            final IFigure theOldFigure, final EObject theModelElement,
            final SwitchableFigure switchableFigure, final EditPart part) {
        // setting the new figure
        IFigure newFigure = theRenderingProvider.getFigureByString(theFigureParam, theOldFigure,
                theModelElement, part);
        if (newFigure != null) {
            if (switchableFigure != null) {
                switchableFigure.setCurrentFigure(newFigure);
            }
        }
    }

    /**
     * Method to get a new LayoutManager from the RenderingProvider and set it.
     * 
     * @param figure
     *            the figure whose LayoutManager should be changed.
     * @param renderingProvider
     *            the RenderingProvider.
     * @param layoutParam
     *            the string representation of the layout to be given to the RenderingProvider.
     * @param modelElement
     *            the ModelElement whose figures LayoutManager should be changed.
     */
    private void setLayoutManager(final IFigure theFigure, final IRenderingProvider theRenderingProvider,
            final String theLayoutParam, final EObject theModelElement) {
        // setting the LayoutManager
        if (theFigure != null) {
            LayoutManager newLayoutManager = theRenderingProvider.getLayoutManagerByString(
                    theLayoutParam, theFigure.getLayoutManager(), theModelElement);
            if (newLayoutManager != null) {
                theFigure.setLayoutManager(newLayoutManager);
            }
        }
    }

    /**
     * Method to get a new BorderItemLocator from the RenderingProvider and setting it to the
     * BorderItem.
     * 
     * @param editPart
     *            the EditPart of the BorderItem.
     * @param renderingProvider
     *            the RenderingProvider.
     * @param borderItemParam
     *            the string representation of the new BorderItemLocator.
     * @param modelElement
     *            the ModelElement of the BorderItem
     * @param figure
     *            the Figure of the BorderItem
     */
    private void setBorderItemLocator(final IGraphicalEditPart theEditPart,
            final IRenderingProvider theRenderingProvider, final String theBorderItemParam,
            final EObject theModelElement, final IFigure theFigure) {
        // sets the new BoderItemLocator. unfortunately pretty hacked to get the right elements and
        // special cases
        if (theEditPart instanceof IBorderItemEditPart) {
            if (theEditPart.getParent() instanceof AbstractBorderedShapeEditPart) {
                AbstractBorderedShapeEditPart parent = ((AbstractBorderedShapeEditPart) theEditPart
                        .getParent());
                IFigure mainFigure = parent.getMainFigure();
                // special case for labels since hierarchy is different
                if (theEditPart instanceof AdvancedRenderingLabelEditPart) {
                    IFigure contentPane = theEditPart.getContentPane();
                    if (contentPane != null) {
                        IBorderItemLocator oldLocator = (IBorderItemLocator) contentPane
                                .getParent().getLayoutManager().getConstraint(contentPane);
                        IBorderItemLocator newLocator = theRenderingProvider
                                .getBorderItemLocatorByString(theBorderItemParam, mainFigure,
                                        oldLocator, theModelElement, this.collapseStatus);
                        parent.setLayoutConstraint(theEditPart, contentPane, newLocator);
                    }
                } else {
                    // this is the code for ports etc.
                    IFigure parentsParent = theFigure.getParent().getParent();
                    if (parentsParent instanceof BorderedNodeFigure) {
                        BorderedNodeFigure borderedNodeFigure = (BorderedNodeFigure) parentsParent;
                        if (borderedNodeFigure.getParent() != null) {
                            IBorderItemLocator oldLocator = (IBorderItemLocator) borderedNodeFigure
                                    .getParent().getLayoutManager()
                                    .getConstraint(borderedNodeFigure);
                            IBorderItemLocator newLocator = theRenderingProvider
                                    .getBorderItemLocatorByString(theBorderItemParam, mainFigure,
                                            oldLocator, theModelElement, this.collapseStatus);
                            if (oldLocator != newLocator) {
                                parent.setLayoutConstraint(theEditPart, borderedNodeFigure, newLocator);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Method to set a fixed size of a SwitchableFigure.
     * 
     * @param switchableFigure
     *            enclosing figure of the figure whose size should be set.
     * @param figure
     *            the figure whose size should be set.
     * @param dim
     *            the new fixed size
     */
    private void setFixedNodeSize(final SwitchableFigure switchableFigure, final IFigure theFigure,
            final Dimension dim) {
        theFigure.getBounds().setSize(dim);
        theFigure.setMaximumSize(dim.getCopy());
        theFigure.setMinimumSize(dim.getCopy());
        theFigure.setPreferredSize(dim.getCopy());
        if (theFigure.getParent() instanceof DefaultSizeNodeFigure) {
            ((DefaultSizeNodeFigure) theFigure.getParent()).setDefaultSize(
                    theFigure.getSize().getCopy());
        } else if (theFigure.getParent() instanceof NodeFigure) {
            ((NodeFigure) theFigure.getParent()).setSize(theFigure.getSize().getCopy());
        }
        switchableFigure.setResizeable(false);
    }

    /**
     * Get the RenderingProvider. 
     * @return the RenderingProvider
     */
    public IRenderingProvider getRenderingProvider() {
        return renderingProvider;
    }

    /**
     * Sets the RenderingProvider.
     * @param renderingProvider the new RenderingProvider
     */
    public void setRenderingProvider(final IRenderingProvider renderingProvider) {
        this.renderingProvider = renderingProvider;
    }

    /**
     * Gets the Figure.
     * @return the Figure
     */
    public IFigure getFigure() {
        return figure;
    }

    /**
     * Sets the Figure.
     * @param figure the new Figure
     */
    public void setFigure(final IFigure figure) {
        this.figure = figure;
    }

    /**
     * Gets the old figure.
     * @return the old figure
     */
    public IFigure getOldFigure() {
        return oldFigure;
    }

    /**
     * Sets the old figure.
     * @param oldFigure the new old figure
     */
    public void setOldFigure(final IFigure oldFigure) {
        this.oldFigure = oldFigure;
    }

    /**
     * Gets the model element.
     * @return the model element
     */
    public EObject getModelElement() {
        return modelElement;
    }

    /**
     * Sets the new model element.
     * @param modelElement the new model element
     */
    public void setModelElement(final EObject modelElement) {
        this.modelElement = modelElement;
    }

    /**
     * Get the edit part.
     * @return the edit part
     */
    public IGraphicalEditPart getEditPart() {
        return editPart;
    }

    /**
     * Sets the edit part.
     * @param editPart the new edit part
     */
    public void setEditPart(final IGraphicalEditPart editPart) {
        this.editPart = editPart;
    }

    /**
     * Get the layout param.
     * @return the layout param
     */
    public String getLayoutParam() {
        return layoutParam;
    }

    /**
     * Sets the layout param.
     * @param layoutParam the new layout param
     */
    public void setLayoutParam(final String layoutParam) {
        this.layoutParam = layoutParam;
    }
    
    /**
     * Get the figure param.
     * @return the figure param
     */
    public String getFigureParam() {
        return figureParam;
    }

    /**
     * Sets the figure param.
     * @param figureParam the new figure param
     */
    public void setFigureParam(final String figureParam) {
        this.figureParam = figureParam;
    }

    /**
     * Get the border item param.
     * @return the border item param
     */
    public String getBorderItemParam() {
        return borderItemParam;
    }

    /**
     * Set the border item param.
     * @param borderItemParam the enw border item param
     */
    public void setBorderItemParam(final String borderItemParam) {
        this.borderItemParam = borderItemParam;
    }

    /**
     * Get the figure size.
     * @return the figure size
     */
    public Pair<Integer, Integer> getFigureSize() {
        return figureSize;
    }

    /**
     * Set the figure size.
     * @param figureSize the new figure size
     */
    public void setFigureSize(final Pair<Integer, Integer> figureSize) {
        this.figureSize = figureSize;
    }
    
    @Override
    public String getName() {
        return "KarmaEffect";
    }

}
