/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.instructions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * This activator class controls the life cycle of the InstructionsViewPlugin. It also provides the
 * access to the one and only instance of this class. It enables access to all registered
 * InstructionDataProviders.
 * 
 * @author cmot
 * @kieler.design proposed 2013-02-28
 * @kieler.rating proposed 2013-02-28 yellow
 * 
 */
public class InstructionsViewPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.instructions"; //$NON-NLS-1$

    // The shared instance
    private static InstructionsViewPlugin plugin;

    /** The list of all registered instruction view data providers. */
    private static LinkedList<IInstructionsDataProvider> instructionDataProviderList = new LinkedList<IInstructionsDataProvider>();

    //-------------------------------------------------------------------------

    /**
     * The constructor
     */
    public InstructionsViewPlugin() {
    }

    //-------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    //-------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }
    
    //-------------------------------------------------------------------------

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static InstructionsViewPlugin getDefault() {
        return plugin;
    }

    //-------------------------------------------------------------------------
    
    public void refresh() {
        try {
            // Retrieve a handle to the instruction list table
            InstructionsDataList list = InstructionsDataList.getInstance();
            // Clear the table
            list.clear();
            // Add lines of ALL providers to the table
            for (IInstructionsDataProvider provider : getInstructionsDataProviderList()) {
                List<EObject> statementList = provider.getMarkedStatements();
                for (EObject statement : statementList) {
                    InstructionsData instructionsData = provider.getInstructionsData(statement);
                    
                    list.add(instructionsData);
                }
            }
            // Refresh the instruction View
            InstructionsView.getInstance().refreshViewerAsync();
            return;
        }
        catch (Exception e) {
            // ignore refresh errors
        }
    }
    
    //-------------------------------------------------------------------------

    /**
     * Gets the instructions data provider list.
     *
     * @return the instructions data provider list
     */
    public List<IInstructionsDataProvider> getInstructionsDataProviderList() {
        // If the list is empty, renew it
        if (instructionDataProviderList.isEmpty()) {
            instructionDataProviderList.clear();

            IConfigurationElement[] contributors = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor("de.cau.cs.kieler.sim.instructions.provider");

            for (IConfigurationElement element : contributors) {
                try {
                    IInstructionsDataProvider dataProvider = (IInstructionsDataProvider) (element
                            .createExecutableExtension("class"));

                    instructionDataProviderList.add(dataProvider);
                } catch (CoreException e0) {
                    // class attribute not found, throw exception and
                    // proceed with next listener
                    e0.printStackTrace();
                }
            }
        }
        return instructionDataProviderList;
    }

    //-------------------------------------------------------------------------
}
