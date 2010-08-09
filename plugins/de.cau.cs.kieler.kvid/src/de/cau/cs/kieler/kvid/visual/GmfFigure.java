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
package de.cau.cs.kieler.kvid.visual;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

import de.cau.cs.kieler.kvid.data.DataObject;

/**
 * 
 * @author jjc
 *
 */
public class GmfFigure extends RoundedRectangle implements IKvidFigure {
    
    private DataObject currentData;
    
    public GmfFigure(DataObject thedata) {
        super();
        this.currentData = thedata;
        setLayoutManager(new BorderLayout());
        //setBorder(new LineBorder(2));
        setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 20));
        setForegroundColor(ColorConstants.black);
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 10));
        add(label, BorderLayout.CENTER);
        this.addLayoutListener(LayoutAnimator.getDefault());
    }
    
    public void updateData(DataObject newData) {
        currentData = newData;
        removeAll();
        setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 20));
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 10));
        add(label, BorderLayout.CENTER);
    }

}
