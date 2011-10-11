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
package de.cau.cs.kieler.synccharts.kivi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.kivi.menu.ButtonTrigger.ButtonState;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService.LocationScheme;
import de.cau.cs.kieler.core.kivi.menu.KiviMenuContributionService;
import de.cau.cs.kieler.core.kivi.menu.MenuItemEnableStateEffect;
import de.cau.cs.kieler.core.model.gmf.effects.FocusContextEffect;
import de.cau.cs.kieler.core.model.triggers.DiagramTrigger.DiagramState;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutEffect;

/**
 * A Kieler Viewmanagement Combination that lets the user manually select a focus in a diagram and
 * then configures Focus&Context accordingly by collapsing and expanding compartments. Elements in
 * the focus are shown with most details and elements in the context with the least details, e.g.
 * their compartments get collapsed. Zoom buttons allow to change the hierarchy level for which the
 * contents of the focus should be shown.
 * 
 * @author haf
 * 
 */
public class ManualFocusCombination extends AbstractCombination {

    private static final String FOCUS_BUTTON_ID = "de.cau.cs.kieler.core.kivi.selectionFocus";
    private static final String PLUS_BUTTON_ID = "de.cau.cs.kieler.core.kivi.focusPlus";
    private static final String MINUS_BUTTON_ID = "de.cau.cs.kieler.core.kivi.focusMinus";
    private static final String ALL_BUTTON_ID = "de.cau.cs.kieler.core.kivi.focusAll";

    /*
     * Add editor ID here to enable this button also for other editors.
     */
    private static final ArrayList<String> EDITOR_IDS = Lists.newArrayList(
            "de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorID",
            "de.cau.cs.kieler.kaom.diagram.part.KaomDiagramEditorID");

    private static final int DEFAULT_ZOOM_LEVEL = 1;
    private int zoomLevel = DEFAULT_ZOOM_LEVEL;
    private boolean enabled = false;

    /**
     * Default Constructor defining some Buttons.
     */
    public ManualFocusCombination() {
        // KiVi.getInstance().setDebug(true);

        ImageDescriptor iconFC = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/focusContext.png");
        ImageDescriptor iconPlus = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/focusContextPlus.png");
        ImageDescriptor iconPlusPlus = Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, "icons/focusContextPlusPlus.png");
        ImageDescriptor iconMinus = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
                "icons/focusContextMinus.png");

        KiviMenuContributionService.INSTANCE.addToolbarButton(this, FOCUS_BUTTON_ID,
                "Manual Focus", "Focus selected model objects and do a semantic zooming.", iconFC,
                SWT.CHECK, LocationScheme.MENU_POPUP_TOOLBAR, null, null,
                EDITOR_IDS.toArray(new String[2]));

        KiviMenuContributionService.INSTANCE.addToolbarButton(this, PLUS_BUTTON_ID, "Focus more",
                "Increase Focus/Context zoom level.", iconPlus, SWT.PUSH,
                LocationScheme.MENU_POPUP_TOOLBAR, null, null, EDITOR_IDS.toArray(new String[2]));

        KiviMenuContributionService.INSTANCE.addToolbarButton(this, MINUS_BUTTON_ID, "Focus less",
                "Decrease Focus/Context zoom level.", iconMinus, SWT.PUSH,
                LocationScheme.MENU_POPUP_TOOLBAR, null, null, EDITOR_IDS.toArray(new String[2]));

        KiviMenuContributionService.INSTANCE.addToolbarButton(this, ALL_BUTTON_ID, "Focus all",
                "Show all hierarchy levels.", iconPlusPlus, SWT.PUSH,
                LocationScheme.MENU_POPUP_TOOLBAR, null, null, EDITOR_IDS.toArray(new String[2]));
    }

    /**
     * Main Combination logic.
     * 
     * @param button
     *            listens to ButtonTriggers
     * @param selection
     *            listens to a SelectionTrigger
     * @param diagram
     *            listens to a DiagramTrigger
     */
    public void execute(final ButtonState button, final SelectionState selection,
            final DiagramState diagram) {
        // first check buttons
        boolean showAll = false;
        if (this.getTriggerState() instanceof ButtonState) {
            if (button.getButtonId().equals(PLUS_BUTTON_ID)) {
                zoomLevel++;
            } else if (button.getButtonId().equals(MINUS_BUTTON_ID)) {
                zoomLevel--;
            } else if (button.getButtonId().equals(ALL_BUTTON_ID)) {
                showAll = true;
            }

        }

        this.enable(button.isPushedIn(FOCUS_BUTTON_ID), diagram);

        // if enabled, do something
        if (this.enabled) {
            int level = zoomLevel;
            List<EObject> focus = selection.getSelectedEObjects();
            // if we want to see everything, select root element and do a full child focus
            if (showAll) {
                focus.add(diagram.getSemanticModel());
                level = Integer.MAX_VALUE;
            } else {
                // if nothing is selected, use the model root as the focus
                if (focus.isEmpty()) {
                    focus.add(diagram.getSemanticModel());
                }
            }
            FocusContextEffect focusEffect = new FocusContextEffect(diagram.getDiagramPart());
            focusEffect.addFocus(focus, level);
            this.schedule(focusEffect);
            this.schedule(new LayoutEffect(diagram.getDiagramPart(), null, true, false, true));
        } 
    }

    /**
     * Enable or disable this functionality by graying out buttons.
     * 
     * @param enable
     *            true if enabled
     * @param diagram
     */
    private void enable(final boolean enable, final DiagramState diagram) {
        boolean validDiagram = EDITOR_IDS.contains(diagram.getDiagramType());
        if (!validDiagram) {
            this.enabled = false;
            return;
        }
        if (this.enabled && !enable) {
            this.schedule(new MenuItemEnableStateEffect(PLUS_BUTTON_ID, false));
            this.schedule(new MenuItemEnableStateEffect(MINUS_BUTTON_ID, false));
            this.enabled = enable;
        } else if (!this.enabled && enable) {
            this.schedule(new MenuItemEnableStateEffect(PLUS_BUTTON_ID, true));
            this.schedule(new MenuItemEnableStateEffect(MINUS_BUTTON_ID, true));
            // reset zoom level
            zoomLevel = DEFAULT_ZOOM_LEVEL;
            this.enabled = enable;
        }
    }

}
