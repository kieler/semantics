package de.cau.cs.kieler.core.ui.figures.layout.container;

/**Represents a single cell of a table layout, used in ExtendedTable. */
public class Cell{
	
	public boolean isEmpty;
	public int figure;
	
	public Cell(int figureIndex, boolean isEmpty){
		this.isEmpty = isEmpty;
		this.figure = figureIndex;
	}
	
	public Cell(){
		figure = -1;
		isEmpty = true;			
	}
}
