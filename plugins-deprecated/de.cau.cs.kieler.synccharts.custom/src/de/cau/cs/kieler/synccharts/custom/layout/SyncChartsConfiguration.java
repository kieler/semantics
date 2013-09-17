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
package de.cau.cs.kieler.synccharts.custom.layout;

import static de.cau.cs.kieler.synccharts.custom.StateLayout.*;
import static de.cau.cs.kieler.core.model.gmf.figures.layout.container.ExtendedTable.*;
import de.cau.cs.kieler.core.model.gmf.figures.layout.container.ExtendedTable;

/**
 * The layout configuration for SyncCharts.
 * 
 * @author abl
 * @kieler.ignore (excluded from review process)
 */
public class SyncChartsConfiguration extends AbstractSyncChartsConfiguration {

    /**
     * Constructor.
     */
    public SyncChartsConfiguration() {
        simpleStateLayout = ExtendedTable.build().tableLayout(
                new int[][] { 
                        { STATELABEL }, { CENTER } })
                .setVerticalAlignment(CENTER)
                .setMinHeight(MIN_HEIGHT).setMinWidth(MIN_WIDTH);
        
        complexStateLayout = ExtendedTable.build().tableLayout(
                new int[][] { 
                        { STATELABEL }, { CENTER },
                        { SIGNALS }, { JUSTIFY }, 
                        { INTERFACEDECL }, { JUSTIFY }, 
                        { ENTRYACTIONS }, { JUSTIFY }, 
                        { INSIDEACTIONS }, { JUSTIFY }, 
                        { EXITACTIONS }, { JUSTIFY },
                        { SUSPENDTRIGGER }, { JUSTIFY },
                        { POLYLINE }, { SEPARATOR },
                     //   { BODYTEXT }, { JUSTIFY }, 
                        { REGION }, { JUSTIFY } })
                .setVerticalAlignment(JUSTIFY)
                .setMinHeight(MIN_HEIGHT)
                .setMinWidth(MIN_WIDTH)
                .setAdjustableCanvas(REGION);

        /* Reference states have the interface declaration as central element, as it can become
         * extensive because of the renamings*/
        referenceStateLayout = ExtendedTable.build().tableLayout(
                new int[][] { 
                        { STATELABEL }, { CENTER },
                        { SIGNALS }, { JUSTIFY }, 
                        { ENTRYACTIONS }, { JUSTIFY }, 
                        { INSIDEACTIONS }, { JUSTIFY }, 
                        { EXITACTIONS }, { JUSTIFY },
                        { SUSPENDTRIGGER }, { JUSTIFY },
                        { POLYLINE }, { SEPARATOR },
                        { INTERFACEDECL }, { JUSTIFY },
                    //    { BODYTEXT }, { JUSTIFY }, 
                        { REGION }, { JUSTIFY } })
                .setVerticalAlignment(JUSTIFY)
                .setMinHeight(MIN_HEIGHT)
                .setMinWidth(MIN_WIDTH)
                .setAdjustableCanvas(REGION);



        conditionalStateLayout = ExtendedTable.build()
                .setMinHeight(COND_HEIGHT)
                .setMinWidth(COND_WIDTH)
                .setUserResizeable(false);

        // textualStateLayout = ExtendedTable.build()
        // .tableLayout(new int[][] {
        // { STATELABEL }, { CENTER },
        // { POLYLINE }, { SEPARATOR },
        // { SIGNALS }, { JUSTIFY },
        // { INTERFACEDECL }, { JUSTIFY },
        // { ENTRYACTIONS }, { JUSTIFY },
        // { INSIDEACTIONS }, { JUSTIFY },
        // { EXITACTIONS }, { JUSTIFY },
        // { SUSPENDTRIGGER }, { JUSTIFY },
        // { BODYTEXT }, { JUSTIFY },
        // { REGION }, {JUSTIFY}})
        // .setVerticalAlignment(JUSTIFY)
        // .setMinHeight(MIN_HEIGHT)
        // .setMinWidth(MIN_WIDTH)
        // .setAdjustableCanvas(BODYTEXT);
    }

}
