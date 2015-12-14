package de.cau.cs.kieler.sccharts.klighd.layout;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.config.LayoutContext;
import de.cau.cs.kieler.kiml.options.Direction;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.service.EclipseLayoutConfig;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.internal.ILayoutConfigProvider;
import de.cau.cs.kieler.klighd.internal.macrolayout.KGraphPropertyLayoutConfig;

/**
 * 
 * This layout config overrides the global options of the sidebar layout options and add a more user
 * friendly behavior.
 * 
 * @author als
 * @kieler.design 2015-01-01 proposed
 * @kieler.rating 2015-01-01 proposed yellow
 */
@SuppressWarnings("restriction")
public class SidebarDirectionLayoutConfig extends KGraphPropertyLayoutConfig {

    @Override
    public int getPriority() {
        return KlighdConstants.SIDE_BAR_LAYOUT_CONFIG_PRIORITY + 1;
    }

    @Override
    public Object getContextValue(IProperty<?> property, LayoutContext context) {
        return null;
    }

    @Override
    public Object getOptionValue(LayoutOptionData optionData, LayoutContext context) {
        // Only handle direction
        if (LayoutOptions.DIRECTION.getId().equals(optionData.getId())) {
            final IWorkbenchPart workbenchPart =
                    context.getProperty(EclipseLayoutConfig.WORKBENCH_PART);
            // Access sidebar config via view part
            if (workbenchPart instanceof ILayoutConfigProvider) {
                final Direction sidebarDirection =
                        (Direction) ((ILayoutConfigProvider) workbenchPart).getLayoutConfig()
                                .getOptionValue(optionData, context);
                if (context.getProperty(LayoutContext.GLOBAL)) {
                    // In this case the sidebar is requesting the initial value
                    return Direction.UNDEFINED;
                } else if (sidebarDirection == null || sidebarDirection == Direction.UNDEFINED) {
                    // In this case the sidebar option should be overridden by diagram configs
                    return super.getOptionValue(optionData, context);
                } else {
                    // In case the sidebar layout option is set to a valid value the direction
                    // should take effect
                    return sidebarDirection;
                }
            }
        }
        return null;
    }

    @Override
    public Collection<IProperty<?>> getAffectedOptions(LayoutContext context) {
        if (context.getProperty(LayoutContext.DIAGRAM_PART) instanceof KNode) {
            return CollectionLiterals.newLinkedList(LayoutOptions.DIRECTION);
        } else {
            return Collections.emptyList();
        }
    }

}
