package de.cau.cs.kieler.kvid.visual;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

import de.cau.cs.kieler.kvid.data.KViDDataObject;

public class KViDGMFFigure extends RoundedRectangle {
    
    private KViDDataObject currentData;
    
    public KViDGMFFigure(KViDDataObject thedata) {
        super();
        this.currentData = thedata;
        setLayoutManager(new BorderLayout());
        //setBorder(new LineBorder(2));
        setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*20, 20));
        setForegroundColor(ColorConstants.black);
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 10));
        //add(label, BorderLayout.CENTER);
    }
    
    public void updateData(KViDDataObject newData) {
        currentData = newData;
        removeAll();
        setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*20, 20));
        Label label = new Label(currentData.getData().toString());
        label.setForegroundColor(ColorConstants.black);
        label.setBounds(new Rectangle(0, 0, 10, 10));
        label.setBounds(new Rectangle(0, 0, currentData.getData().toString().length()*10, 10));
        add(label, BorderLayout.CENTER);
    }
    
    /*@Override
    public void paintFigure(Graphics g) {
        Rectangle r = bounds;
        g.drawArc(r.x + r.width / 8, r.y, r.width / 4, r.height - 1, 90, 180);
        g.drawLine(r.x + r.width / 4, r.y, r.x + 3 * r.width / 4, r.y);
        g.drawLine(r.x + r.width / 4, r.y + r.height - 1,
            r.x + 3 * r.width / 4, r.y + r.height - 1);
        g.drawArc(r.x + 5 * r.width / 8, r.y, r.width / 4, r.height - 1, 270,
            180);
        g.drawText(currentData.getData().toString(), r.x + 3 * r.width / 8, r.y + r.height / 8);
      }*/

}
