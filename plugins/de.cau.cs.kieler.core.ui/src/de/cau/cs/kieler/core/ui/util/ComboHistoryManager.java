/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.ui.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Combo;


/**
 * This class can be used to manage the items in a combo box as a history. The
 * history has a certain size. New items are added to the top, while keeping
 * the history at the given size. Existing items are just moved to the top.
 * The combo history manager provides ways to load and restore the combo box's
 * settings using a {@code DialogSettings} instance.
 * 
 * @author cds
 */
public class ComboHistoryManager {
    /**
     * History size.
     */
    private int historySize = 0;
    
    /**
     * The combo box managed.
     */
    private Combo combo = null;
    
    
    /**
     * Constructs a new instance for the given combo box with the given
     * history size.
     * 
     * @param theCombo the combo box whose history to manage.
     * @param theHistorySize size of the history.
     */
    public ComboHistoryManager(final Combo theCombo, final int theHistorySize) {
        if (theCombo == null) {
            throw new NullPointerException("combo cannot be null.");
        }
        
        if (theHistorySize <= 0) {
            throw new NullPointerException("size must be >0.");
        }
        
        combo = theCombo;
        historySize = theHistorySize;
    }
    
    
    /**
     * Adds the given item to the history and sets it as the combo box's text. Empty
     * items or {@code null} items are ignored history-wise, but set as the combo
     * box's new text.
     * 
     * @param item the item to add.
     */
    public void recordAndDisplay(final String item) {
        if (item == null || item.trim().length() == 0) {
            combo.setText("");
            return;
        }
        
        // Get the item's current position in the list of items
        List<String> items = new ArrayList<String>(Arrays.asList(combo.getItems()));
        int index = items.indexOf(item);
        
        if (index >= 0) {
            // The item is in the list; move it to the top
            items.remove(index);
            items.add(0, item);
        } else {
            // The item is not in the list; insert it at the top
            items.add(0, item);
            
            // Make sure the list doesn't exceed the history size
            if (items.size() > historySize) {
                items.remove(items.size() - 1);
            }
        }
        
        combo.setItems(items.toArray(new String[items.size()]));
        combo.setText(items.get(0));
    }
    
    /**
     * Saves the history in the given dialog settings.
     * 
     * @param settings the settings to store the history in.
     * @param key the key to use.
     */
    public void saveHistory(final IDialogSettings settings, final String key) {
        settings.put(key, combo.getItems());
    }
    
    /**
     * Loads the history from the given dialog settings.
     * 
     * @param settings the settings to load the history from.
     * @param key the key to use.
     */
    public void restoreHistory(final IDialogSettings settings, final String key) {
        String[] history = settings.getArray(key);
        if (history != null) {
            combo.setItems(history);
        }
    }
}
