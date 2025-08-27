/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.execution;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * The Class DataPoolTestApplication. It only exists for experimental use debug and testing of the
 * {@link JSONDataPool}.
 * 
 * @author cmot
 * @kieler.ignore This is just a test application and is not intended for production usage.
 * 
 */
public final class DataPoolTestApplication {

    /**
     * Instantiates a new data pool test application.
     */
    private DataPoolTestApplication() {
        // NOOP
    }

    // -------------------------------------------------------------------------

    /**
     * The main method. It creates some example data keys and puts the into the data pool. It then
     * tries to get the data values back from the pool using the different getData() variants.
     * 
     * @param args
     *            the args
     */
    public static void main(final String[] args) {
        String[] filter = null; // {"key01","key03","key05","key07"};

        try {
            JSONDataPool dataPool = new JSONDataPool();
            // long index = dataPool.getPoolCounter();
            dataPool.putData(new JSONObject("{key01={key01=value01}}"));
            dataPool.putData(new JSONObject("{key02=value02}"));
            dataPool.putData(new JSONObject("{key03=value03}"));
            // can also put in null values
            dataPool.putData(null);
            dataPool.putData(new JSONObject("{key05=value05}"));
            dataPool.putData(new JSONObject("{key06=value06}"));
            dataPool.putData(new JSONObject("{key07={key07=value07}}"));
            // KiemPlugin.log(dataPool.getDeltaData(filter,index).toString());
            KiemPlugin.log(dataPool.getData(null).toString());

            KiemPlugin.log("");
            KiemPlugin.log(dataPool.getPoolCounter() + "");
            KiemPlugin.log("");
            // CHECKSTYLEOFF MagicNumber
            // Rationale: This is just a test application
            KiemPlugin.log(dataPool.getDeltaData(filter, 0).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 1).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 2).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 3).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 4).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 5).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 6).toString());
            KiemPlugin.log(dataPool.getDeltaData(filter, 7).toString());
            // CHECKSTYLEON MagicNumber

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
