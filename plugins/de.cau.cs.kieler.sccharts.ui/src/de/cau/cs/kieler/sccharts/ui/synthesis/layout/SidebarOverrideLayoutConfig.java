package de.cau.cs.kieler.sccharts.ui.synthesis.layout;

/**
 * 
 * This layout config overrides the global options of the sidebar layout options and add a more user
 * friendly behavior.
 * 
 * @author als
 * @kieler.design 2015-12-14 proposed
 * @kieler.rating 2015-12-14 proposed yellow
 */
public class SidebarOverrideLayoutConfig {}
// NOT YET MIGRATED TO PRACMATICS 2016-05
//public class SidebarOverrideLayoutConfig extends KGraphPropertyLayoutConfig {
//
//    public static final IProperty<Float> FIXED_SPACING =
//            new Property<Float>("de.cau.cs.kieler.sccharts.ui.layout.fixedspacing", null);
//
//    @Override
//    public int getPriority() {
//        return KlighdConstants.SIDE_BAR_LAYOUT_CONFIG_PRIORITY + 1;
//    }
//
//    @Override
//    public Object getContextValue(IProperty<?> property, LayoutContext context) {
//        return null;
//    }
//
//    @Override
//    public Object getOptionValue(LayoutOptionData optionData, LayoutContext context) {
//        // Only handle direction
//        if (LayoutOptions.DIRECTION.getId().equals(optionData.getId())) {
//            final IWorkbenchPart workbenchPart =
//                    context.getProperty(EclipseLayoutConfig.WORKBENCH_PART);
//            // Access sidebar config via view part
//            if (workbenchPart instanceof ILayoutConfigProvider) {
//                final Direction sidebarDirection =
//                        (Direction) ((ILayoutConfigProvider) workbenchPart).getLayoutConfig()
//                                .getOptionValue(optionData, context);
//                if (context.getProperty(LayoutContext.GRAPH_ELEM) == null) {
//                    // In this case the sidebar is requesting the initial value because no layout
//                    // graph is given
//                    return Direction.UNDEFINED;
//                } else if (sidebarDirection == null || sidebarDirection == Direction.UNDEFINED) {
//                    // In this case the sidebar option should be overridden by diagram configs
//                    return super.getOptionValue(optionData, context);
//                } else {
//                    // In case the sidebar layout option is set to a valid value the direction
//                    // should take effect
//                    return sidebarDirection;
//                }
//            }
//        }
//        if (LayoutOptions.SPACING.getId().equals(optionData.getId())) {
//            Object part = context.getProperty(LayoutContext.DIAGRAM_PART);
//            if (part instanceof KNode) {
//                KLayoutData data = ((KNode) part).getData(KLayoutData.class);
//                if (data != null) {
//                    // Check special override property
//                    return data.getProperty(FIXED_SPACING);
//                }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Collection<IProperty<?>> getAffectedOptions(LayoutContext context) {
//        final IWorkbenchPart workbenchPart =
//                context.getProperty(EclipseLayoutConfig.WORKBENCH_PART);
//        if (workbenchPart instanceof IDiagramWorkbenchPart) {
//            final ViewContext viewContext =
//                    ((IDiagramWorkbenchPart) workbenchPart).getViewContext();
//            if (viewContext != null && viewContext.getInputModel() instanceof Scope) {
//                // Activate this layout config only if a diagram view with scchart is given as
//                // source
//                return CollectionLiterals.newLinkedList(LayoutOptions.DIRECTION,
//                        LayoutOptions.SPACING);
//            }
//        }
//        return Collections.emptyList();
//    }
//
//}
