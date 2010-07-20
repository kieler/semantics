package de.cau.cs.kieler.kvid.visual;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;

import de.cau.cs.kieler.kvid.data.KViDDataObject;

public class KViDGMFFigure extends Figure {
    
    private KViDDataObject currentData;
    
    public KViDGMFFigure(KViDDataObject thedata) {
        super();
        this.currentData = thedata;
        setLayoutManager(new BorderLayout());
        setBorder(new LineBorder(2));
        setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*2, 20));
        setForegroundColor(ColorConstants.black);
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*2, 10));
        add(label, BorderLayout.CENTER);
    }
    
    public void updateData(KViDDataObject newData) {
        currentData = newData;
        removeAll();
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, 10, 10));
        add(label, BorderLayout.CENTER);
    }

}
