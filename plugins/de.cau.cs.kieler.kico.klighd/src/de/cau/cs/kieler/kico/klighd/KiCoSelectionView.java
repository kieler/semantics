package de.cau.cs.kieler.kico.klighd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.TransformationDummy;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.IViewerProvider;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.internal.options.DiagramSideBar;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.viewers.ContextViewer;

public class KiCoSelectionView extends DiagramViewPart {
    
    static KiCoSelectionView instance;
    Composite parent;
    static final String ID = "de.cau.cs.kieler.kico.selection";
    
    static List<String> selectedTransformations = new ArrayList<String>();
    
    public void setViewContext(final IViewer<?> iViewer) {
        this.getViewer().getContextViewer().setModel(iViewer);
    }

    public KiCoSelectionView() {
        super();
        instance = this;
    }
    
    public static List<String> getSelectedTransformations() {
        return KiCoSelectionView.selectedTransformations;
    }
    
    public static void addSelectedTransformation(TransformationDummy transformationDummy) {
        
    }
    
    
    public void createPartControl(final Composite parent) {
        Object model = KielerCompiler.buildGraph();
        super.createPartControl(parent);
        DiagramViewManager.getInstance().registerView(this);
        DiagramViewManager.getInstance().createView(getPartId(), null, model, KlighdSynthesisProperties.newInstance(null));
   }
    
    @Override
    public String getPartId() {
        return ID;
    }
    
    public static KiCoSelectionView getInstance() {
        return instance;
    }

}



