/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.cview.hooks;

import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.cview.model.cViewModel.CViewModel;
import de.cau.cs.kieler.cview.model.cViewModel.Component;
import de.cau.cs.kieler.cview.model.cViewModel.Connection;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;

/**
 * @author cmot
 *
 */
public interface ICViewLanguage {

    /**
     * Define an id for this language extension hook.
     * 
     * @return the name
     */
    String getId();

    /**
     * Return a set of CustomComponentTypeIDs which this language handles. Note that each
     * CustomComponentTypeID shall only be handled by at most one language.
     * 
     * @return
     */
    Set<String> diagramHandleComponentCustomTypes();

    /**
     * For a component with a type supported by this language, return the color to show it or null
     * if this language does not contribute this type.
     * 
     * @param customTypeID
     * @return
     */
    String diagramColor(Component component);

    /**
     * For a component, decide if a double click opens the component content in another editor.
     * 
     * @param component
     * @return
     */
    boolean diagramOpensInEditor(Component component);

    /**
     * For component, decide if it shall be expandable.
     * 
     * @param component
     * @return
     */
    boolean diagramIsHierarchical(Component component);

    /**
     * For a component, decide the label to show.
     * 
     * @param component
     * @return
     */
    String diagramLabel(Component component);

    /**
     * For a component, decide the tooltip to show
     * 
     * @param component
     * @return
     */
    String diagramToolTip(Component component);

    /**
     * Provides all synthesis options for this plugin.
     * 
     * @return
     */
    List<SynthesisOption> diagramSynthesisOptions();

    /**
     * Return synthesis options that if changes requires a complete re-parsing of all files
     * 
     * @return
     */
    Set<SynthesisOption> reparsingRequired();

    /**
     * Define generally whether a component is visible. Note that even if a component is visible it
     * can still be filtered away.
     * 
     * @param component
     * @return
     */
    boolean diagramIsVisible(Component component);

    /**
     * Used to create any file subcomponents, e.g., functions, declarations, types, ... If
     * parseContent is false, then the content shall not be parsed to increase speed.
     * 
     * @param fileComponent
     */
    void modelCreateFileSubComponents(CViewModel model, Component fileComponent,
            boolean parseContent);

    /**
     * The central parse method for creating a parsed version of the file.
     * 
     * @param fileContent
     * @return
     */
    Object parseFile(char[] fileContent);

    /**
     * Return the set of file extensions that belong to this language. modelCreateFileSubComponents
     * is called only for these file extensions. parseFile() is also called for these file extension
     * only.
     * 
     * @return
     */
    Set<String> fileExtensions();
    
    
    /**
     * Return a set of build-in connections for this language, e.g., type, include or function
     * connections or null.
     * 
     * @param model
     * @return
     */
    Set<Connection> provideConnections(CViewModel model);

}
