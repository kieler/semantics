package de.cau.cs.kieler.synccharts.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action3EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Action4EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.ActionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.SignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionsCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEntryActionsCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionsCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateExitActionsCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionsCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateInnerActionsCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateRegionCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartment2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSuspensionTriggerCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.Messages;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsNavigatorContentProvider implements
        ICommonContentProvider {

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
                        for (Iterator it = myEditingDomain.getResourceSet()
                                .getResources().iterator(); it.hasNext();) {
                            Resource nextResource = (Resource) it.next();
                            nextResource.unload();
                        }
                        if (myViewer != null) {
                            myViewer.getControl().getDisplay().asyncExec(
                                    myViewerRefreshRunnable);
                        }
                        return true;
                    }

                    public boolean handleResourceDeleted(Resource resource) {
                        for (Iterator it = myEditingDomain.getResourceSet()
                                .getResources().iterator(); it.hasNext();) {
                            Resource nextResource = (Resource) it.next();
                            nextResource.unload();
                        }
                        if (myViewer != null) {
                            myViewer.getControl().getDisplay().asyncExec(
                                    myViewerRefreshRunnable);
                        }
                        return true;
                    }

                    public boolean handleResourceMoved(Resource resource,
                            final URI newURI) {
                        for (Iterator it = myEditingDomain.getResourceSet()
                                .getResources().iterator(); it.hasNext();) {
                            Resource nextResource = (Resource) it.next();
                            nextResource.unload();
                        }
                        if (myViewer != null) {
                            myViewer.getControl().getDisplay().asyncExec(
                                    myViewerRefreshRunnable);
                        }
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
        for (Iterator it = myEditingDomain.getResourceSet().getResources()
                .iterator(); it.hasNext();) {
            Resource resource = (Resource) it.next();
            resource.unload();
        }
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
            URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
                    .toString(), true);
            Resource resource = myEditingDomain.getResourceSet().getResource(
                    fileURI, true);
            Collection result = new ArrayList();
            result.addAll(createNavigatorItems(selectViewsByType(resource
                    .getContents(), RegionEditPart.MODEL_ID), file, false));
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

        case RegionEditPart.VISUAL_ID: {
            Collection result = new ArrayList();
            SyncchartsNavigatorGroup links = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Region_1000_links,
                    "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection connectedViews = getChildrenByType(Collections
                    .singleton(view), SyncchartsVisualIDRegistry
                    .getType(StateEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getDiagramLinksByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(TransitionEditPart.VISUAL_ID));
            links
                    .addChildren(createNavigatorItems(connectedViews, links,
                            false));
            if (!links.isEmpty()) {
                result.add(links);
            }
            return result.toArray();
        }

        case StateEditPart.VISUAL_ID: {
            Collection result = new ArrayList();
            SyncchartsNavigatorGroup incominglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_2001_incominglinks,
                    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup outgoinglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_2001_outgoinglinks,
                    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection connectedViews = getChildrenByType(Collections
                    .singleton(view), SyncchartsVisualIDRegistry
                    .getType(StateRegionCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Region2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateSignalCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(SignalEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateEntryActionsCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(ActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateInnerActionsCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateExitActionsCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action3EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateSuspensionTriggerCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action4EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getIncomingLinksByType(
                    Collections.singleton(view), SyncchartsVisualIDRegistry
                            .getType(TransitionEditPart.VISUAL_ID));
            incominglinks.addChildren(createNavigatorItems(connectedViews,
                    incominglinks, true));
            connectedViews = getOutgoingLinksByType(
                    Collections.singleton(view), SyncchartsVisualIDRegistry
                            .getType(TransitionEditPart.VISUAL_ID));
            outgoinglinks.addChildren(createNavigatorItems(connectedViews,
                    outgoinglinks, true));
            if (!incominglinks.isEmpty()) {
                result.add(incominglinks);
            }
            if (!outgoinglinks.isEmpty()) {
                result.add(outgoinglinks);
            }
            return result.toArray();
        }

        case Region2EditPart.VISUAL_ID: {
            Collection result = new ArrayList();
            Collection connectedViews = getChildrenByType(Collections
                    .singleton(view), SyncchartsVisualIDRegistry
                    .getType(RegionStateCompartmentEditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(State2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            return result.toArray();
        }

        case State2EditPart.VISUAL_ID: {
            Collection result = new ArrayList();
            SyncchartsNavigatorGroup incominglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_3002_incominglinks,
                    "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup outgoinglinks = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_State_3002_outgoinglinks,
                    "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection connectedViews = getChildrenByType(Collections
                    .singleton(view), SyncchartsVisualIDRegistry
                    .getType(StateRegionCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Region2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateSignalCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(SignalEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateEntryActionsCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(ActionEditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateInnerActionsCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action2EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateExitActionsCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action3EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getChildrenByType(
                    Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(StateSuspensionTriggerCompartment2EditPart.VISUAL_ID));
            connectedViews = getChildrenByType(connectedViews,
                    SyncchartsVisualIDRegistry
                            .getType(Action4EditPart.VISUAL_ID));
            result.addAll(createNavigatorItems(connectedViews, parentElement,
                    false));
            connectedViews = getIncomingLinksByType(
                    Collections.singleton(view), SyncchartsVisualIDRegistry
                            .getType(TransitionEditPart.VISUAL_ID));
            incominglinks.addChildren(createNavigatorItems(connectedViews,
                    incominglinks, true));
            connectedViews = getOutgoingLinksByType(
                    Collections.singleton(view), SyncchartsVisualIDRegistry
                            .getType(TransitionEditPart.VISUAL_ID));
            outgoinglinks.addChildren(createNavigatorItems(connectedViews,
                    outgoinglinks, true));
            if (!incominglinks.isEmpty()) {
                result.add(incominglinks);
            }
            if (!outgoinglinks.isEmpty()) {
                result.add(outgoinglinks);
            }
            return result.toArray();
        }

        case TransitionEditPart.VISUAL_ID: {
            Collection result = new ArrayList();
            SyncchartsNavigatorGroup target = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Transition_4001_target,
                    "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            SyncchartsNavigatorGroup source = new SyncchartsNavigatorGroup(
                    Messages.NavigatorGroupName_Transition_4001_source,
                    "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
            Collection connectedViews = getLinksTargetByType(Collections
                    .singleton(view), SyncchartsVisualIDRegistry
                    .getType(StateEditPart.VISUAL_ID));
            target.addChildren(createNavigatorItems(connectedViews, target,
                    true));
            connectedViews = getLinksTargetByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(State2EditPart.VISUAL_ID));
            target.addChildren(createNavigatorItems(connectedViews, target,
                    true));
            connectedViews = getLinksSourceByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
            source.addChildren(createNavigatorItems(connectedViews, source,
                    true));
            connectedViews = getLinksSourceByType(Collections.singleton(view),
                    SyncchartsVisualIDRegistry
                            .getType(State2EditPart.VISUAL_ID));
            source.addChildren(createNavigatorItems(connectedViews, source,
                    true));
            if (!target.isEmpty()) {
                result.add(target);
            }
            if (!source.isEmpty()) {
                result.add(source);
            }
            return result.toArray();
        }
        }
        return EMPTY_ARRAY;
    }

    /**
     * @generated
     */
    private Collection getLinksSourceByType(Collection edges, String type) {
        Collection result = new ArrayList();
        for (Iterator it = edges.iterator(); it.hasNext();) {
            Edge nextEdge = (Edge) it.next();
            View nextEdgeSource = nextEdge.getSource();
            if (type.equals(nextEdgeSource.getType())
                    && isOwnView(nextEdgeSource)) {
                result.add(nextEdgeSource);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection getLinksTargetByType(Collection edges, String type) {
        Collection result = new ArrayList();
        for (Iterator it = edges.iterator(); it.hasNext();) {
            Edge nextEdge = (Edge) it.next();
            View nextEdgeTarget = nextEdge.getTarget();
            if (type.equals(nextEdgeTarget.getType())
                    && isOwnView(nextEdgeTarget)) {
                result.add(nextEdgeTarget);
            }
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection getOutgoingLinksByType(Collection nodes, String type) {
        Collection result = new ArrayList();
        for (Iterator it = nodes.iterator(); it.hasNext();) {
            View nextNode = (View) it.next();
            result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection getIncomingLinksByType(Collection nodes, String type) {
        Collection result = new ArrayList();
        for (Iterator it = nodes.iterator(); it.hasNext();) {
            View nextNode = (View) it.next();
            result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection getChildrenByType(Collection nodes, String type) {
        Collection result = new ArrayList();
        for (Iterator it = nodes.iterator(); it.hasNext();) {
            View nextNode = (View) it.next();
            result.addAll(selectViewsByType(nextNode.getChildren(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection getDiagramLinksByType(Collection diagrams, String type) {
        Collection result = new ArrayList();
        for (Iterator it = diagrams.iterator(); it.hasNext();) {
            Diagram nextDiagram = (Diagram) it.next();
            result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
        }
        return result;
    }

    /**
     * @generated
     */
    private Collection selectViewsByType(Collection views, String type) {
        Collection result = new ArrayList();
        for (Iterator it = views.iterator(); it.hasNext();) {
            View nextView = (View) it.next();
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
        return RegionEditPart.MODEL_ID.equals(SyncchartsVisualIDRegistry
                .getModelID(view));
    }

    /**
     * @generated
     */
    private Collection createNavigatorItems(Collection views, Object parent,
            boolean isLeafs) {
        Collection result = new ArrayList();
        for (Iterator it = views.iterator(); it.hasNext();) {
            result.add(new SyncchartsNavigatorItem((View) it.next(), parent,
                    isLeafs));
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
