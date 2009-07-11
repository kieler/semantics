package de.cau.cs.kieler.kev.extension;

import java.util.EventListener;

public interface DataChangeListener extends EventListener {

	void dataChanged( DataChangeEvent e);
	void setDataSize( int size );
	
}
