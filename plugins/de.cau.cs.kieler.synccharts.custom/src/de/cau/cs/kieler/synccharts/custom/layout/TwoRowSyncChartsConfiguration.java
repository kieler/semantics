package de.cau.cs.kieler.synccharts.custom.layout;

import de.cau.cs.kieler.core.ui.figures.layout.container.ExtendedTable;
import de.cau.cs.kieler.synccharts.custom.StateLayout;
import de.cau.cs.kieler.synccharts.custom.StateLayout.AbstractSyncChartsConfiguration;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.*;


public class TwoRowSyncChartsConfiguration extends AbstractSyncChartsConfiguration{
    
    public TwoRowSyncChartsConfiguration() {
        referenceStateLayout = ExtendedTable.build()
		.tableLayout(new int[][] {
			{ StateLayout.STATELABEL }, { ExtendedTable.CENTER }, 
			{ StateLayout.POLYLINE }, { ExtendedTable.SEPARATOR },
			{ StateLayout.INTERFACEDECL }, { ExtendedTable.JUSTIFY }})
		.setVerticalAlignment(ExtendedTable.JUSTIFY)
		.setMinHeight(StateLayout.MIN_HEIGHT)
		.setMinWidth(StateLayout.MIN_WIDTH)
		.setAdjustableCanvas(StateLayout.INTERFACEDECL);
														
		
	complexStateLayout = ExtendedTable.build()
		.tableLayout(new int[][] { 
			{ STATELABEL }, { ExtendedTable.CENTER }, 
			{ StateLayout.INTERFACEDECL }, { ExtendedTable.JUSTIFY }, 
			{ StateLayout.SIGNALS }, { ExtendedTable.JUSTIFY }, 
			{ StateLayout.ENTRYACTIONS, StateLayout.INSIDEACTIONS }, { ExtendedTable.JUSTIFY }, 
			{ StateLayout.EXITACTIONS, StateLayout.SUSPENDTRIGGER }, { ExtendedTable.JUSTIFY }, 
			{ StateLayout.POLYLINE }, { ExtendedTable.SEPARATOR },
			{ StateLayout.REGION }, { ExtendedTable.JUSTIFY } })
		.setVerticalAlignment(ExtendedTable.JUSTIFY)
		.setMinHeight(StateLayout.MIN_HEIGHT)
		.setMinWidth(StateLayout.MIN_WIDTH)
		.setAdjustableCanvas(StateLayout.REGION);
													
		
	simpleStateLayout = ExtendedTable.build()
		.tableLayout(new int[][] { 
			{ StateLayout.STATELABEL }, { ExtendedTable.CENTER } })
		.setVerticalAlignment(ExtendedTable.CENTER)
		.setMinHeight(StateLayout.MIN_HEIGHT)
		.setMinWidth(StateLayout.MIN_WIDTH);
													
	conditionalStateLayout = ExtendedTable.build()
		.setMinHeight(StateLayout.COND_HEIGHT)
		.setMinWidth(StateLayout.COND_WIDTH)
		.setUserResizeable(false);
	

	textualStateLayout = ExtendedTable.build()
		.tableLayout(new int[][] { 
		    { StateLayout.STATELABEL }, { ExtendedTable.CENTER },
		    { StateLayout.POLYLINE }, { ExtendedTable.SEPARATOR }, 
		    { StateLayout.SIGNALS }, { ExtendedTable.JUSTIFY }, 
		    { StateLayout.INTERFACEDECL }, { ExtendedTable.JUSTIFY },
		    { StateLayout.ENTRYACTIONS }, { ExtendedTable.JUSTIFY }, 
		    { StateLayout.INSIDEACTIONS }, { ExtendedTable.JUSTIFY }, 
		    { StateLayout.EXITACTIONS }, { ExtendedTable.JUSTIFY }, 
		    { StateLayout.SUSPENDTRIGGER }, { ExtendedTable.JUSTIFY }, 
		    { StateLayout.BODYTEXT }, { ExtendedTable.JUSTIFY } })
		 .setVerticalAlignment(ExtendedTable.JUSTIFY)
		 .setMinHeight(StateLayout.MIN_HEIGHT)
		 .setMinWidth(StateLayout.MIN_WIDTH)
		 .setAdjustableCanvas(StateLayout.BODYTEXT);
	}
}
