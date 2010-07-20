package de.cau.cs.kieler.kvid.visual;

import java.util.HashMap;

import de.cau.cs.kieler.kvid.data.KViDDataObject;

public interface IDrawer {
    
    void draw(HashMap<String, KViDDataObject> dataSet);
    
    void clearDrawing();

}
