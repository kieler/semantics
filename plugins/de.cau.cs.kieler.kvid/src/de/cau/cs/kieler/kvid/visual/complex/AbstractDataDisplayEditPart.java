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
package de.cau.cs.kieler.kvid.visual.complex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.KvidUri;
import de.cau.cs.kieler.kvid.datadistributor.IDataListener;

/**
 * Abstract EditPart to use when implementing KViD elements that should appear in an
 * GMF Editor.
 * 
 * @author jjc
 *
 */
public abstract class AbstractDataDisplayEditPart extends ShapeNodeEditPart
        implements IDataListener {
    
    /**
     * Constructor using only the constructor of the superclass.
     * 
     * @param view The view to contribute to
     */
    public AbstractDataDisplayEditPart(final View view) {
        super(view);
    }
    
    /**
     * Resolves the element connected to this DataDisplay.
     * 
     * @return A KvidUri referring the connected element or null if it couldn't resolved
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected KvidUri getConnectedElementsUri() {
        String ptolemyUri;

        // Check the connected object and try to use it as a data source
        View view = this.getNotationView();
        EList list = view.getSourceEdges();
        list.addAll(view.getTargetEdges());
        if (list.size() == 1) {
            Connector con = (Connector) list.get(0);
            Node connected;
            if (con.getSource() != view) {
                connected = (Node) con.getSource();
            } else {
                connected = (Node) con.getTarget();
            }
            EObject model = connected.getElement();
            ptolemyUri = KvidUtil.fragmentUri2PtolemyUri(
                    ModelingUtil.getFragmentUri(model), model.eResource());

        } else {
            return null;
        }
        
        return new KvidUri(ptolemyUri);
    }

    /**
     * {@inheritDoc}
     */
    public abstract void triggerDataChanged(boolean isHistoryValue);

    /**
     * {@inheritDoc}
     */
    public abstract void triggerWrapup();
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected abstract NodeFigure createNodeFigure();

}
