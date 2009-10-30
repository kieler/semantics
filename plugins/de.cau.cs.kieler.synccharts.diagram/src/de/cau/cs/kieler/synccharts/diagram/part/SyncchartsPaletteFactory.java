package de.cau.cs.kieler.synccharts.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class SyncchartsPaletteFactory {

    /**
     * @generated
     */
    public void fillPalette(PaletteRoot paletteRoot) {
        paletteRoot.add(createSynccharts1Group());
    }

    /**
     * Creates "synccharts" palette tool group
     * @generated
     */
    private PaletteContainer createSynccharts1Group() {
        PaletteGroup paletteContainer = new PaletteGroup(Messages.Synccharts1Group_title);
        paletteContainer.setId("createSynccharts1Group"); //$NON-NLS-1$
        paletteContainer.add(createState1CreationTool());
        paletteContainer.add(createTransition2CreationTool());
        return paletteContainer;
    }

    /**
     * @generated
     */
    private ToolEntry createState1CreationTool() {
        List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
        types.add(SyncchartsElementTypes.State_2001);
        types.add(SyncchartsElementTypes.State_3002);
        NodeToolEntry entry = new NodeToolEntry(Messages.State1CreationTool_title,
                Messages.State1CreationTool_desc, types);
        entry.setId("createState1CreationTool"); //$NON-NLS-1$
        entry.setSmallIcon(SyncchartsElementTypes
                .getImageDescriptor(SyncchartsElementTypes.State_2001));
        entry.setLargeIcon(entry.getSmallIcon());
        return entry;
    }

    /**
     * @generated
     */
    private ToolEntry createTransition2CreationTool() {
        List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
        types.add(SyncchartsElementTypes.Transition_4001);
        LinkToolEntry entry = new LinkToolEntry(Messages.Transition2CreationTool_title,
                Messages.Transition2CreationTool_desc, types);
        entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
        entry.setSmallIcon(SyncchartsElementTypes
                .getImageDescriptor(SyncchartsElementTypes.Transition_4001));
        entry.setLargeIcon(entry.getSmallIcon());
        return entry;
    }

    /**
     * @generated
     */
    private static class NodeToolEntry extends ToolEntry {

        /**
         * @generated
         */
        private final List elementTypes;

        /**
         * @generated
         */
        private NodeToolEntry(String title, String description, List elementTypes) {
            super(title, description, null, null);
            this.elementTypes = elementTypes;
        }

        /**
         * @generated
         */
        public Tool createTool() {
            Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
            tool.setProperties(getToolProperties());
            return tool;
        }
    }

    /**
     * @generated
     */
    private static class LinkToolEntry extends ToolEntry {

        /**
         * @generated
         */
        private final List relationshipTypes;

        /**
         * @generated
         */
        private LinkToolEntry(String title, String description, List relationshipTypes) {
            super(title, description, null, null);
            this.relationshipTypes = relationshipTypes;
        }

        /**
         * @generated
         */
        public Tool createTool() {
            Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
            tool.setProperties(getToolProperties());
            return tool;
        }
    }
}
