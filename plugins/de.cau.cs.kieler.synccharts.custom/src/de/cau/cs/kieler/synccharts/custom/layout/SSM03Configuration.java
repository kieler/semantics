package de.cau.cs.kieler.synccharts.custom.layout;

import static de.cau.cs.kieler.synccharts.custom.StateLayout.BODYTEXT;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.COND_HEIGHT;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.COND_WIDTH;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.ENTRYACTIONS;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.EXITACTIONS;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.INSIDEACTIONS;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.INTERFACEDECL;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.MIN_HEIGHT;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.MIN_WIDTH;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.POLYLINE;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.REGION;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.SIGNALS;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.STATELABEL;
import static de.cau.cs.kieler.synccharts.custom.StateLayout.SUSPENDTRIGGER;
import de.cau.cs.kieler.core.ui.figures.layout.container.ExtendedTable;
import de.cau.cs.kieler.synccharts.custom.StateLayout.AbstractSyncChartsConfiguration;

public class SSM03Configuration extends AbstractSyncChartsConfiguration{
	
	// A SyncChartsLayout borrowed from RR200324.pdf
	public SSM03Configuration() {
		referenceStateLayout = ExtendedTable.build()
			.tableLayout(new int[][] {
				{ STATELABEL }, { ExtendedTable.CENTER }, 
				{ POLYLINE }, { ExtendedTable.SEPARATOR },
				{ INTERFACEDECL }, { ExtendedTable.JUSTIFY }})
			.setVerticalAlignment(ExtendedTable.JUSTIFY)
			.setMinHeight(MIN_HEIGHT)
			.setMinWidth(MIN_WIDTH)
			.setAdjustableCanvas(INTERFACEDECL);
													
	
		complexStateLayout = ExtendedTable.build()
			.tableLayout(new int[][] { 
				{ STATELABEL }, { ExtendedTable.CENTER }, 
				{ POLYLINE }, { ExtendedTable.SEPARATOR }, 
				{ REGION }, { ExtendedTable.JUSTIFY },
				{ INTERFACEDECL }, { ExtendedTable.JUSTIFY }, 
				{ SIGNALS }, { ExtendedTable.JUSTIFY }, 
				{ ENTRYACTIONS }, { ExtendedTable.JUSTIFY }, 
				{ INSIDEACTIONS }, { ExtendedTable.JUSTIFY }, 
				{ EXITACTIONS }, { ExtendedTable.JUSTIFY }, 
				{ SUSPENDTRIGGER }, { ExtendedTable.JUSTIFY } })
			.setVerticalAlignment(ExtendedTable.JUSTIFY)
			.setMinHeight(MIN_HEIGHT)
			.setMinWidth(MIN_WIDTH)
			.setAdjustableCanvas(REGION);
													
	
		simpleStateLayout = ExtendedTable.build()
			.tableLayout(new int[][] { 
				{ STATELABEL }, { ExtendedTable.CENTER } })
			.setVerticalAlignment(ExtendedTable.CENTER)
			.setMinHeight(MIN_HEIGHT)
			.setMinWidth(MIN_WIDTH);
														
	
		conditionalStateLayout = ExtendedTable.build()
			.setMinHeight(COND_HEIGHT)
			.setMinWidth(COND_WIDTH)
			.setUserResizeable(false);
	

		textualStateLayout = ExtendedTable.build()
			.tableLayout(new int[][] { 
				{ STATELABEL }, { ExtendedTable.CENTER },
			    { POLYLINE }, { ExtendedTable.SEPARATOR }, 
			    { SIGNALS }, { ExtendedTable.JUSTIFY }, 
				{ INTERFACEDECL }, { ExtendedTable.JUSTIFY },
			    { ENTRYACTIONS }, { ExtendedTable.JUSTIFY }, 
			    { INSIDEACTIONS }, { ExtendedTable.JUSTIFY }, 
			    { EXITACTIONS }, { ExtendedTable.JUSTIFY }, 
			    { SUSPENDTRIGGER }, { ExtendedTable.JUSTIFY }, 
			    { BODYTEXT }, { ExtendedTable.JUSTIFY } })
			 .setVerticalAlignment(ExtendedTable.JUSTIFY)
			 .setMinHeight(MIN_HEIGHT)
			 .setMinWidth(MIN_WIDTH)
			 .setAdjustableCanvas(BODYTEXT);
	}

}
