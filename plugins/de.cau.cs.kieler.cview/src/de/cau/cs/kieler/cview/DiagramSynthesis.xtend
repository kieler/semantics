package de.cau.cs.kieler.cview

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.KlighdConstants
import java.util.EnumSet
import org.eclipse.elk.core.options.SizeConstraint
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.Colors
import org.eclipse.emf.ecore.EObject
import java.lang.Object
import org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.File
import de.cau.cs.kieler.cview.model.cViewModel.Folder
import java.util.HashMap
import de.cau.cs.kieler.cview.model.cViewModel.FileOrFolder
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.microlayout.Bounds

import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KNodeAbstractNode
import org.eclipse.emf.common.util.EList
import java.util.List
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KChildAreaNode
import de.cau.cs.kieler.klighd.SynthesisOption
import java.util.LinkedHashSet

/* Package and import statements... */
class DiagramSynthesis extends AbstractDiagramSynthesis<CViewModel> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions

    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    /** Option for enabling adaptive zoom */
    public static final SynthesisOption EXPAND_ALL = SynthesisOption.createCheckOption(
            "Expand Nodes", false);

    public static final SynthesisOption EXPANDED_SLIDER = SynthesisOption.createRangeOption("Expanded Layers", 1, 5, 2);

    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        // Add general options
        options.addAll(EXPANDED_SLIDER);
        return options.toList;
    }

    override KNode transform(CViewModel model) {
//        allNodes.clear
        // If you get a NPE here, then add "de.cau.cs.kieler.klighd.syntheses.GuiceBasedSynthesisFactory:" before the
        // class name of the synthesis defined in the plugin.xml under "<diagramSynthesis>" 
        val root = model.createNode().associateWith(model);
        val depth = 1;

        // val parentNode = model.createNode().associateWith(model);
        for (item : model.folders) {
            if (item.parent == null) {
                root.children.add(item.transformItem(depth))
            }
        }
        for (item : model.files) {
            if (item.parent == null) {
                root.children.add(item.transformItem(depth))
            }
        }

//        parentNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
//            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//
//
//        root.children.add(parentNode)
        return root;
    }

    def KNode transformItem(FileOrFolder item, int depth) {
        if (item instanceof File) {
            return item.transformItemFile()
        } else if (item instanceof Folder) {
            return item.transformItemFolder(depth)
        }
    }

    def KNode transformItemFile(File item) {
        val childNode = item.createNode().associateWith(item);
        val childRect = childNode.addRoundedRectangle(4, 4, 2);
        val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
            KlighdConstants.DEFAULT_FONT_NAME);
        childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
        childRect.background = "WHITE".color;
        childRect.addDoubleClickAction(OpenEditorAction.ID);
        label.getFirstText.addDoubleClickAction(OpenEditorAction.ID);

        return childNode
    }

    def boolean hieararchical(Folder item) {
        return !item.children.nullOrEmpty;
    }

    def KNode transformItemFolder(Folder item, int depth) {
        val childNodeOuter = item.createNode().associateWith(item);

        val rectCol = childNodeOuter.addRoundedRectangle(4, 4, 2);
        rectCol.background = "YELLOW".color;
        rectCol.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        rectCol.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        //rectCol.addDoubleClickAction(OpenEditorAction.ID);

        val rectExp = childNodeOuter.addRoundedRectangle(4, 4, 2);
        rectExp.background = "YEWLLO".color;
        rectExp.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        rectExp.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        //rectExp.addDoubleClickAction(OpenEditorAction.ID);

        childNodeOuter.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

        val itemLabel = item.name
        val label = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
            KlighdConstants.DEFAULT_FONT_NAME);
        label.associateWith(item)

        if (item.hieararchical) {
            // Hierarchical case
            label.firstText.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            label.firstText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            //label.firstText.addDoubleClickAction(OpenEditorAction.ID);
            
            val childArea = item.children.createNode().associateWith(item)
            val childAreaRect = childArea.addRoundedRectangle(1, 1, 1)
            childAreaRect.background = "WHITE".color;
            childAreaRect.foreground = "GRAY".color;
            label.firstText.setAreaPlacementData().from(LEFT, -2, 0, TOP, -4, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
            childNodeOuter.children.add(childArea)
            childArea.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
            
            childNodeOuter.setProperty(KlighdProperties.EXPAND, (EXPANDED_SLIDER.intValue > 4 || EXPANDED_SLIDER.intValue > depth));
            
            for (child : item.children) {
                childArea.children += child.transformItem(depth+1);
            }
        }

        return childNodeOuter
    }





//        label.getFirstText.setAsExpandedView

//        val labelCollapsed = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
//            KlighdConstants.DEFAULT_FONT_NAME);
//        labelCollapsed.associateWith(item)
//        labelCollapsed.getFirstText.setAsCollapsedView



//    def static <T extends KRendering> T setAsExpandedView(T krendering) {
//        krendering.getProperties().removeKey(KlighdProperties.COLLAPSED_RENDERING);
//        krendering.setProperty(KlighdProperties.EXPANDED_RENDERING, true);
//        return krendering;
//    }
//
//    def static <T extends KRendering> T setAsCollapsedView(T krendering) {
//        krendering.getProperties().removeKey(KlighdProperties.EXPANDED_RENDERING);
//        krendering.setProperty(KlighdProperties.COLLAPSED_RENDERING, true);
//        return krendering;
//    }

//        (childNodeOuter.class.getMethod("setExpanded", boolean).invoke(childNodeOuter, false))
//        DiagramController.
//        allNodes.add(childNodeOuter)
//            val childArea = item.createNode().associateWith(item)
//            val areaRect = childArea.addRoundedRectangle(4, 4, 1)
//            childNode.children.add(childArea)
//            childArea.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
//                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//            childArea.addInsideTopCenteredNodeLabel("child area", KlighdConstants.DEFAULT_FONT_SIZE,
//                KlighdConstants.DEFAULT_FONT_NAME).associateWith(item);
//            areaRect.background = "WHITE".color;
//            (item as Folder).children.forEach[s|childArea.children += transformItem(s)]
//            // Expanded
//            childNode.addMacroFigure => [
//                setAsExpandedView
//                associateWith(item)
//                it.addRegionFigure.addChildArea(itemLabel.nullOrEmpty)
//                addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//            ]
//
//            // Collapsed
//            childNode.addDefaultFigure => [
//                //.getNode().addRegionFigure
//                setAsCollapsedView
//                associateWith(item)
//                addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//            ]
//        val childNodeInner = item.children.createNode().associateWith(item);
//        val rect2 = childNodeInner.addRoundedRectangle(4, 4, 1);
//        rect2.foreground =  "BLUE".color;
//        if (!item.hieararchical) {
//            
//            // Hierarchy
//            childNode.addMacroFigure
////            childNode.addInsideTopCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
////                KlighdConstants.DEFAULT_FONT_NAME).associateWith(item);
//        } else {
//            // No further files
//            childNode.addDefaultFigure
////            val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
////                KlighdConstants.DEFAULT_FONT_NAME);
////            childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
////                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//        }
//        rect.background = "YELLOW".color
//        for (subitem : item.children) {
//            if (subitem.parent == null) {
//            }
//        }
//    def KRectangle addRegionFigure(KNode node) {
//        node.addRectangle() => [
//            background = "WHITE".color;
//            foreground = "GRAY".color;
//            lineWidth = 1;
//            setSurroundingSpace(2, 0);
//        ]
//    }
//
//    def addChildArea(KContainerRendering container, boolean useHeaderSpace) {
//        container.addChildArea() => [
//            if (useHeaderSpace) {
//                setAreaPlacementData().from(LEFT, -2, 0, TOP, -2, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
//            } else {
//                setAreaPlacementData().from(LEFT, -2, 0, TOP, 8, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
//            }
//        ]
//    }
//    def KText addButtonTop(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_CENTRAL, V_TOP, 8, 8, size.width, size.height);
//        ]
//    }
//
//    def KText addButtonCenter(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_CENTRAL, V_CENTRAL, 8, 8, size.width, size.height);
//        ]
//    }
//        /**
//     * Adds a button with text.
//     */
//    def KText addButton(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_LEFT, V_TOP, 8, 8, size.width, size.height);
//        ]
//    }
//    
//    def KRoundedRectangle addMacroFigure(KNode node) {
//        node.setMinimalNodeSize(34, 34); // same as default figure
//        node.addRoundedRectangle(8, 8, 2) => [
//            // Mark this figure as container for further content
//            //setProperty(IS_CONTENT_CONTAINER, true);
//            //setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
//            //not? setBackground("YELLOW".color);
//            foreground = "BLACK".color;
//            background = "YELLOW".color;
//            setGridPlacement(1);
//        ]
//    }    
//    
//    def KRoundedRectangle addDefaultFigure(KNode node) {
//        node.setMinimalNodeSize(34, 34); // 2 x corner radius
//        node.addRoundedRectangle(17, 17, 2) => [
//            // Mark this figure as container for further content
//            //setProperty(IS_CONTENT_CONTAINER, true);
//            foreground = "BLACK".color;
//            background = "YELLOW".color;
//        ]
//    }    
//    val static Bounds estimateTextSize(KText kText) {
//        return estimateTextSize(kText, kText.getText());
//    }
//    public static val List<KNode> allNodes = newArrayList
//    public static val List<KChildAreaNode> allChildAreas = newArrayList
}
