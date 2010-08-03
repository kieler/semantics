package de.cau.cs.kieler.synccharts.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TextualCodeEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.Messages;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsNavigatorContentProvider implements ICommonContentProvider {

    /**
     * @generated
     */
    private static final Object[] EMPTY_ARRAY = new Object[0];

    /**
     * @generated
     */
    private Viewer myViewer;

    /**
     * @generated
     */
    private AdapterFactoryEditingDomain myEditingDomain;

    /**
     * @generated
     */
    private WorkspaceSynchronizer myWorkspaceSynchronizer;

    /**
     * @generated
     */
    private Runnable myViewerRefreshRunnable;

    /**
     * @generated
     */
    @SuppressWarnings({"unchecked", "serial", "rawtypes"})
    public SyncchartsNavigatorContentProvider() {
        TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
                .createEditingDomain();
        myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
        myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
            public Object get(Object key) {
                if (!containsKey(key)) {
                    put(key, Boolean.TRUE);
                }
                return super.get(key);
            }
        });
        myViewerRefreshRunnable = new Runnable() {
            public void run() {
                if (myViewer != null) {
                    myViewer.refresh();
                }
            }
        };
        myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
                new WorkspaceSynchronizer.Delegate() {
                    public void dispose() {
                    }

                    public boolean handleResourceChanged(final Resource resource) {
                        unloadAllResources();
                        asyncRefresh();
                        return true;
                    }

                    public boolean handleResourceDeleted(Resource resource) {
                        unloadAllResources();
                        asyncRefresh();
                        return true;
                    }

                    public boolean handleResourceMoved(Resource resource, final URI newURI) {
                        unloadAllResources();
                        asyncRefresh();
                        return true;
                    }
                });
    }

    /**
     * @generated
     */
    public void dispose() {
        myWorkspaceSynchronizer.dispose();
        myWorkspaceSynchronizer = null;
        myViewerRefreshRunnable = null;
        myViewer = null;
        unloadAllResources();
        ((TransactionalEditingDomain) myEditingDomain).dispose();
        myEditingDomain = null;
    }

    /**
     * @generated
     */
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        myViewer = viewer;
    }

    /**
     * @generated
     */
    void unloadAllResources() {
        for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
            nextResource.unload();
        }
    }

    /**
     * @generated
     */
    void asyncRefresh() {
        if (myViewer != null && !myViewer.getControl().isDisposed()) {
            myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
        }
    }

    /**
     * @generated
     */
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    /**
     * @generated
     */
    public void restoreState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public void saveState(IMemento aMemento) {
    }

    /**
     * @generated
     */
    public void init(ICommonContentExtensionSite aConfig) {
    }

    /**
     * @generated
     */
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof IFile) {
            IFile file = (IFile) parentElement;
            URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
            ArrayList<SyncchartsNavigatorItem> result = new ArrayList<SyncchartsNavigatorItem>();
            ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
            for (EObject o : resource.getContents()) {
                if (o instanceof View) {
                    topViews.add((View) o);
                }
            }
            result.addAll(createNavigatorItems(selectViewsByType(topViews, RegionEditPart.MODEL_ID),
                    file, false));
            return result.toArray();
        }

        if (parentElement instanceof SyncchartsNavigatorGroup) {
            SyncchartsNavigatorGroup group = (SyncchartsNavigatorGroup) parentElement;
            return group.getChildren();
        }

        if (parentElement instanceof SyncchartsNavigatorItem) {
            SyncchartsNavigatorItem navigatorItem = (SyncchartsNavigatorItem) parentElement;
            if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
                return EMPTY_ARRAY;
            }
            return getViewChildren(navigatorItem.getView(), parentElement);
        }

        return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    private Object[] getViewChildren(View view, Object parentElement) {
        switch (SyncchartsVisualIDRegistry.getVisualID(view)) {

        case TransitionEditPart.VISUAL_ID: {
            LinkedList<SyncchartsAbstractNavigatorItem> result = new LinkedList<SyncchartsAbstractNavigatorItem>();
            Edge sv = (Edge) view;
            SyncchartsNavigatorGroup target = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Transition_4004_target,
                    "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup source = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Transition_4004_source,
                    "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection<View> connectedViews;
            connectedViews = getLinksTargetByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
            target.addChildren(createNavigatorItems(connectedViews, target, true));
            connectedViews = getLinksTargetByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
            target.addChildren(createNavigatorItems(connectedViews, target, true));
            connectedViews = getLinksSourceByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
            source.addChildren(createNavigatorItems(connectedViews, source, true));
            connectedViews = getLinksSourceByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
            source.addChildren(createNavigatorItems(connectedViews, source, true));
            if (!target.isEmpty()) {
                result.add(target);
            }
            if (!source.isEmpty()) {
                result.add(source);
            }
            return result.toArray();
        }

        case Region2EditPart.VISUAL_ID: {
            LinkedList<SyncchartsAbstractNavigatorItem> result = new LinkedList<SyncchartsAbstractNavigatorItem>();
            Node sv = (Node) view;
            Collection<View> connectedViews;
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(RegionStateCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            return result.toArray();
        }

        case State2EditPart.VISUAL_ID: {
            LinkedList<SyncchartsAbstractNavigatorItem> result = new LinkedList<SyncchartsAbstractNavigatorItem>();
            Node sv = (Node) view;
            SyncchartsNavigatorGroup incominglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_3032_incominglinks,
                    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup outgoinglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_3032_outgoinglinks,
                    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection<View> connectedViews;
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateRegionCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateSignalCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(SignalEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateEntryActionCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateEntryActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateInnerActionCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateInnerActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateExitActionCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateExitActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry
                            .getType(StateSuspensionTriggerCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateSuspensionTriggerEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TextualCodeEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getIncomingLinksByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
            incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
            connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
            outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
            if (!incominglinks.isEmpty()) {
                result.add(incominglinks);
            }
            if (!outgoinglinks.isEmpty()) {
                result.add(outgoinglinks);
            }
            return result.toArray();
        }

        case RegionEditPart.VISUAL_ID: {
            LinkedList<SyncchartsAbstractNavigatorItem> result = new LinkedList<SyncchartsAbstractNavigatorItem>();
            Diagram sv = (Diagram) view;
            SyncchartsNavigatorGroup links = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Region_1000_links,
                    "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection<View> connectedViews;
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getDiagramLinksByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
            links.addChildren(createNavigatorItems(connectedViews, links, false));
            if (!links.isEmpty()) {
                result.add(links);
            }
            return result.toArray();
        }

        case StateEditPart.VISUAL_ID: {
            LinkedList<SyncchartsAbstractNavigatorItem> result = new LinkedList<SyncchartsAbstractNavigatorItem>();
            Node sv = (Node) view;
            SyncchartsNavigatorGroup incominglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_2004_incominglinks,
                    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup outgoinglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_2004_outgoinglinks,
                    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection<View> connectedViews;
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateRegionCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateSignalCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(SignalEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateEntryActionCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateEntryActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateInnerActionCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateInnerActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(StateExitActionCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateExitActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry
                            .getType(StateSuspensionTriggerCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry.getType(StateSuspensionTriggerEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getChildrenByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TextualCodeEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement, false));
            connectedViews = getIncomingLinksByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
            incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
            connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
                    SyncchartsVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
            outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
            if (!incominglinks.isEmpty()) {
                result.add(incominglinks);
            }
            if (!outgoinglinks.isEmpty()) {
                result.add(outgoinglinks);
            }
            return result.toArray();
        }
        }
        return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
        LinkedList<View> result = new LinkedList<View>();
        for (Edge nextEdge : edges) {
            View nextEdgeSource = nextEdge.getSource();
            if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
                result.add(nextEdgeSource);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
        LinkedList<View> result = new LinkedList<View>();
        for (Edge nextEdge : edges) {
            View nextEdgeTarget = nextEdge.getTarget();
            if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
                result.add(nextEdgeTarget);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
        LinkedList<View> result = new LinkedList<View>();
        for (View nextNode : nodes) {
            result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
        LinkedList<View> result = new LinkedList<View>();
        for (View nextNode : nodes) {
            result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
        LinkedList<View> result = new LinkedList<View>();
        for (View nextNode : nodes) {
            result.addAll(selectViewsByType(nextNode.getChildren(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
        ArrayList<View> result = new ArrayList<View>();
        for (Diagram nextDiagram : diagrams) {
            result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
        }
        return result;
    }

    // TODO refactor as static method
    /**
     * @generated
     */
    private Collection<View> selectViewsByType(Collection<View> views, String type) {
        ArrayList<View> result = new ArrayList<View>();
        for (View nextView : views) {
            if (type.equals(nextView.getType()) && isOwnView(nextView)) {
                result.add(nextView);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    private boolean isOwnView(View view) {
        return RegionEditPart.MODEL_ID.equals(SyncchartsVisualIDRegistry.getModelID(view));
    }

    /**
     * @generated
     */
    private Collection<SyncchartsNavigatorItem> createNavigatorItems(Collection<View> views,
            Object parent, boolean isLeafs) {
        ArrayList<SyncchartsNavigatorItem> result = new ArrayList<SyncchartsNavigatorItem>(views.size());
        for (View nextView : views) {
            result.add(new SyncchartsNavigatorItem(nextView, parent, isLeafs));
        }
        return result;
    }

    /**
     * @generated
     */
    public Object getParent(Object element) {
        if (element instanceof SyncchartsAbstractNavigatorItem) {
            SyncchartsAbstractNavigatorItem abstractNavigatorItem = (SyncchartsAbstractNavigatorItem) element;
            return abstractNavigatorItem.getParent();
        }
        return null;
    }

    /**
     * @generated
     */
    public boolean hasChildren(Object element) {
        return element instanceof IFile || getChildren(element).length > 0;
    }

}
