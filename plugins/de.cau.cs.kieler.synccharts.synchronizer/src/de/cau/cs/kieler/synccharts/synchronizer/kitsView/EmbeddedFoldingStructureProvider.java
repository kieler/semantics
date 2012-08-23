//CHECKSTYLEOFF PackageName|Header|Javadoc|FinalParameters|LineLength|StaticVariableName|MagicNumber|VisibilityModifier|HiddenField
package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.projection.IProjectionListener;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.folding.FoldedPosition;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;

import com.google.common.base.Predicate;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * Default implementation of interface {@link IFoldingStructureProvider}
 * 
 * @author Michael Clay - Initial contribution and API
 * @author Mikael Barbero - Dependant of Embedded XtextEditor
 * @kieler.ignore (excluded from review process)
 */
public class EmbeddedFoldingStructureProvider implements IXtextModelListener {

    @Inject
    private IFoldingRegionProvider foldingRegionProvider;
    private EmbeddedXtextEditor editor;
    private ProjectionViewer viewer;
    private ProjectionChangeListener projectionListener;

    public void install(EmbeddedXtextEditor editor, ProjectionViewer viewer) {
        Assert.isNotNull(editor);
        Assert.isNotNull(viewer);
        uninstall();
        this.editor = editor;
        this.viewer = viewer;
        projectionListener = new ProjectionChangeListener(viewer);
    }

    public void initialize() {
        calculateProjectionAnnotationModel(false);
    }

    public void uninstall() {
        if (isInstalled()) {
            handleProjectionDisabled();
            projectionListener.dispose();
            projectionListener = null;
            editor = null;
        }
    }

    /**
     * Returns <code>true</code> if the provider is installed, <code>false</code> otherwise.
     * 
     * @return <code>true</code> if the provider is installed, <code>false</code> otherwise
     */
    protected final boolean isInstalled() {
        return editor != null;
    }

    /**
     * @see org.eclipse.xtext.ui.editor.model.IXtextModelListener#modelChanged(org.eclipse.xtext.resource.XtextResource)
     */
    public void modelChanged(XtextResource resource) {
        boolean existingSyntaxErrors = Iterables.any(resource.getErrors(),
                new Predicate<Diagnostic>() {
                    public boolean apply(Diagnostic diagnostic) {
                        return diagnostic instanceof XtextSyntaxDiagnostic;
                    }
                });

        if (!existingSyntaxErrors) {
            calculateProjectionAnnotationModel(false);
        }
    }

    protected void handleProjectionEnabled() {
        handleProjectionDisabled();
        if (isInstalled()) {
            initialize();
            editor.getDocument().addModelListener(this);
        }
    }

    protected void handleProjectionDisabled() {
        if (editor.getDocument() != null) {
            editor.getDocument().removeModelListener(this);
        }
    }

    protected void calculateProjectionAnnotationModel(boolean allowCollapse) {
        ProjectionAnnotationModel projectionAnnotationModel = this.viewer
                .getProjectionAnnotationModel();
        if (projectionAnnotationModel != null) {
            Collection<FoldedPosition> foldingRegions = foldingRegionProvider
                    .getFoldingRegions(editor.getDocument());
            HashBiMap<Position, FoldedPosition> positionsMap = toPositionIndexedMap(foldingRegions);
            Annotation[] newRegions = mergeFoldingRegions(positionsMap, projectionAnnotationModel);
            updateFoldingRegions(allowCollapse, projectionAnnotationModel, positionsMap, newRegions);
        }
    }

    protected HashBiMap<Position, FoldedPosition> toPositionIndexedMap(
            Collection<FoldedPosition> foldingRegions) {
        HashBiMap<Position, FoldedPosition> positionsMap = HashBiMap.create();
        for (FoldedPosition foldingRegion : foldingRegions) {
            // positionsMap.put(foldingRegion.getPosition(), foldingRegion);
            positionsMap.put(new Position(foldingRegion.getOffset(), foldingRegion.getLength()),
                    foldingRegion);
        }
        return positionsMap;
    }

    @SuppressWarnings("unchecked")
    protected Annotation[] mergeFoldingRegions(HashBiMap<Position, FoldedPosition> positionsMap,
            ProjectionAnnotationModel projectionAnnotationModel) {
        List<Annotation> deletions = new ArrayList<Annotation>();
        for (Iterator<Annotation> iterator = projectionAnnotationModel.getAnnotationIterator(); iterator
                .hasNext();) {
            Annotation annotation = iterator.next();
            if (annotation instanceof ProjectionAnnotation) {
                Position position = projectionAnnotationModel.getPosition(annotation);
                if (positionsMap.remove(position) == null) {
                    deletions.add(annotation);
                }
            }
        }
        return deletions.toArray(new Annotation[deletions.size()]);
    }

    protected void updateFoldingRegions(boolean allowCollapse, ProjectionAnnotationModel model,
            HashBiMap<Position, FoldedPosition> positionsMap, Annotation[] deletions) {
        Map<ProjectionAnnotation, Position> additionsMap = new HashMap<ProjectionAnnotation, Position>();
        for (Iterator<FoldedPosition> iterator = positionsMap.values().iterator(); iterator
                .hasNext();) {
            FoldedPosition foldingRegion = iterator.next();
            addProjectionAnnotation(allowCollapse, foldingRegion, additionsMap);
        }
        if (deletions.length != 0 || additionsMap.size() != 0) {
            model.modifyAnnotations(deletions, additionsMap, new Annotation[] {});
        }
    }

    protected void addProjectionAnnotation(boolean allowCollapse, FoldedPosition foldingRegion,
            Map<ProjectionAnnotation, Position> additionsMap) {
        ProjectionAnnotation projectionAnnotation = createProjectionAnnotation(allowCollapse,
                foldingRegion);
        // additionsMap.put(projectionAnnotation, foldingRegion.getPosition());
        additionsMap.put(projectionAnnotation, new Position(foldingRegion.getOffset(),
                foldingRegion.getLength()));
    }

    protected ProjectionAnnotation createProjectionAnnotation(boolean allowCollapse,
            FoldedPosition foldingRegion) {
        return new ProjectionAnnotation(allowCollapse);
    }

    /**
     * Internal projection listener.
     */
    public class ProjectionChangeListener implements IProjectionListener {
        private ProjectionViewer projectionViewer;

        /**
         * Registers the listener with the viewer.
         * 
         * @param viewer
         *            the viewer to register a listener with
         */
        public ProjectionChangeListener(ProjectionViewer viewer) {
            Assert.isLegal(viewer != null);
            projectionViewer = viewer;
            projectionViewer.addProjectionListener(this);
        }

        /**
         * Disposes of this listener and removes the projection listener from the viewer.
         */
        public void dispose() {
            if (projectionViewer != null) {
                projectionViewer.removeProjectionListener(this);
                projectionViewer = null;
            }
        }

        public void projectionEnabled() {
            handleProjectionEnabled();
        }

        public void projectionDisabled() {
            handleProjectionDisabled();
        }
    }

    public void install(XtextEditor editor, ProjectionViewer viewer) {
        // TODO Auto-generated method stub

    }
}
