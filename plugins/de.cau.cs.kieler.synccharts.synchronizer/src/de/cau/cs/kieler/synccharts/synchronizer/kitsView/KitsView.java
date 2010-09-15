package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.parsetree.reconstr.XtextSerializationException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.synchronizer.Activator;
import de.cau.cs.kieler.synccharts.synchronizer.KitsSynchronizeLinker;
import de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin;
import de.cau.cs.kieler.synccharts.text.kits.KitsResource;
import de.cau.cs.kieler.synccharts.text.kits.scoping.KitsEmbeddedScopeProvider;

public class KitsView extends ViewPart implements ISelectionChangedListener {

	private EmbeddedXtextEditor editor;
	
	private static KitsView INSTANCE = null;

	@Override
	public void createPartControl(Composite parent) {
		INSTANCE = this;
		parent.setLayout(new GridLayout());
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Injector injector = KitsUIPlugin.getInstance().getInjector(KitsUIPlugin.KITS_LANGUAGE_EMBEDDED);

		editor = new EmbeddedXtextEditor(parent, injector);
		
		editor.getDocument().addModelListener(new IXtextModelListener() {
			public void modelChanged(XtextResource resource) {
				reconcileChangedModel();
			}
		});

	}
	
	private void reconcileChangedModel() {
		
	}

	public void selectionChanged(SelectionChangedEvent event) {
		
		EObject model = null;
		
		StructuredSelection selection = null;
		if (event.getSelection() instanceof StructuredSelection) {
			selection = (StructuredSelection) event.getSelection();
			
			if (selection.size() != 0
					&& selection.getFirstElement() instanceof EditPart) {
				EditPart part = (EditPart) selection.getFirstElement();
				
				if (part.getModel() instanceof View) {
					model = ((View) part.getModel()).getElement();
				}
			}
		}
		
		if (model == null) {
			return;
		}
		
		while (!SyncchartsPackage.eINSTANCE.getRegion().isInstance(model)) {
			model = model.eContainer();
		}
		
		final Region region = (Region) model;
		final Region rootRegion = (Region) EcoreUtil.getRootContainer(region);		
				
		try {
			editor.getDocumentEditor().process(
					new IUnitOfWork.Void<XtextResource>() {

						@Override
						public void process(XtextResource state)
								throws Exception {
							Region rootCopy = EcoreUtil.copy(rootRegion);
							Region copy = null;

							KitsResource resource = (KitsResource) editor.createResource();
							resource.getContents().clear();
							resource.getContents().add(rootCopy);

							try {
								copy = new KitsSynchronizeLinker()
										.consultSrcAndCopy(rootRegion, rootCopy)
										.linkElement(rootCopy)
										.getMatched(region);
								KitsEmbeddedScopeProvider.logicalContainer = (State) copy.eContainer();
							} catch (ClassCastException e) {
								System.out.println("Problem");
								return;
							}							
							
							state.getContents().clear();
							state.getContents().add(copy);
						}

					}, editor.getDocument());
		} catch (XtextSerializationException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							IStatus.OK, "Problem", e));
		}
	}
	
	public void dispose() {
		INSTANCE = null;
		super.dispose();
	}
	
	public static KitsView getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void setFocus() {
		
	}

}
