/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.server;

import org.eclipse.core.runtime.Plugin;


/**
 * The KielerServerPlugin is a non-UI component for building light-weight HTTP servers.
 *
 * The activator class controls the plug-in life cycle.
 *
 * @author cmot
 * @kieler.design 2014-07-08 proposed
 * @kieler.rating 2014-07-08 proposed yellow
 */
public class KielerServerPlugin extends Plugin {

        /** The Constant PLUGIN_ID. */
        public static final String PLUGIN_ID = "de.cau.cs.kieler.server"; //$NON-NLS-1$

        /** The shared instance. */
        private static KielerServerPlugin plugin;

        // -------------------------------------------------------------------------

        /**
         * The constructor
         */
        public KielerServerPlugin() {
            plugin = this;
        }

        // -------------------------------------------------------------------------

        /**
         * Returns the shared instance.
         *
         * @return the shared instance
         */
        public static KielerServerPlugin getInstance() {
            return plugin;
        }

        // -------------------------------------------------------------------------

}
