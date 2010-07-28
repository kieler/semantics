package de.cau.cs.kieler.kvid.visual;

import org.eclipse.draw2d.IFigure;

import de.cau.cs.kieler.kvid.data.KViDDataObject;

public interface IKViDFigure extends IFigure {
    
    void updateData(KViDDataObject thedata);

}
