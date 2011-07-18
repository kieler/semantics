/**
 * Copyright (c) 2010 ProxiAD
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *    itemis AG - source viewer configuration
 *    Sebastian Zarnekow (itemis AG) - synthetic resource creation and source viewer configuration 
 */
/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * further developed by
 *     Christian Schneider
 */
package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.expressions.Expression;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.commands.ActionHandler;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ISynchronizable;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.AnnotationPainter;
import org.eclipse.jface.text.source.AnnotationRulerColumn;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.IVerticalRulerColumn;
import org.eclipse.jface.text.source.IVerticalRulerExtension;
import org.eclipse.jface.text.source.OverviewRuler;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.ActiveShellExpression;
import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
//import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.MarkerAnnotationPreferences;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.bracketmatching.BracketMatchingPreferencesInitializer;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import de.cau.cs.kieler.core.WrappedException;

public class EmbeddedXtextEditor {

	private static final String XTEXT_UI_FORMAT_ACTION = "org.eclipse.xtext.ui.FormatAction";
	private static final String XTEXT_UI_TOGGLE_SL_COMMENT_ACTION = "org.eclipse.xtext.ui.ToggleCommentAction";

	private Composite fControl;
	private int fStyle;
	
	private XtextSourceViewer fSourceViewer;
	private XtextResource fResource;
	private XtextDocument fDocument;
	
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fFileExtension;

	private XtextSourceViewerConfiguration fViewerConfiguration;
	
	@Inject
	private HighlightingHelper fHighlightingHelper;
	
	@Inject
	private IResourceSetProvider fResourceSetProvider;

	@Inject
	private IGrammarAccess fGrammarAccess;
	
	@Inject
	private XtextSourceViewer.Factory fSourceViewerFactory;

	@Inject
	private Provider<XtextSourceViewerConfiguration> fSourceViewerConfigurationProvider;

	@Inject
	private Provider<XtextDocument> fDocumentProvider;

	@Inject
	private IResourceValidator fResourceValidator;

	@Inject
	private IPreferenceStoreAccess fPreferenceStoreAccess;
	
	@Inject
	private ICharacterPairMatcher characterPairMatcher;
	
	@Inject(optional = true)
	private AnnotationPainter.IDrawingStrategy projectionAnnotationDrawingStrategy;
	

//	// CHSCH:
//	@Inject
//	private IDocumentEditor documentEditor;
	
	private IPreferenceStore fPreferenceStore;

	/** The editor's font. */
	private Font fFont;
	// CHSCH end
	
	
	private EmbeddedFoldingStructureProvider fFoldingStructureProvider;
	
	private IOverviewRuler fOverviewRuler;
	
	private IAnnotationAccess fAnnotationAccess;
	
	/**
	 * Creates a new EmbeddedXtextEditor.
	 * 
	 * @param control the parent composite that will contain the editor
	 * @param injector the Guice injector to get Xtext configuration elements
	 * @param job the synchronization job that will be scheduled/rescheduled at each 
	 * 		modification of the editor text. It may be use to reconcile the content of 
	 * 		the editor with something else. 
	 * @param style the SWT style of the {@link SourceViewer} of this editor.
	 * @param fileExtension the file extension (without the DOT) of the textual DSL to edit
	 */
	public EmbeddedXtextEditor(Composite control, Injector injector, int style) {
		fControl = control;
		fStyle = style;
		
		fAnnotationPreferences = (MarkerAnnotationPreferences) new AbstractDecoratedTextEditor() {
		}.getAdapter(MarkerAnnotationPreferences.class);
		// EditorsPlugin.getDefault().getMarkerAnnotationPreferences();
		
		fFoldingStructureProvider = new EmbeddedFoldingStructureProvider();
		
		injector.injectMembers(this);
		
		// CHSCH
		fPreferenceStore = fPreferenceStoreAccess.getPreferenceStore();

		createEditor(fControl);
	}
	
	/**
	 * Creates a new EmbeddedXtextEditor.
	 * 
	 * Equivalent to EmbeddedXtextEditor(control, injector, job, fileExtension, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
	 * 
	 * @param control the parent composite that will contain the editor
	 * @param injector the Guice injector to get Xtext configuration elements
	 * @param job the synchronization job that will be scheduled/rescheduled at each 
	 * 		modification of the editor text. It may be use to reconcile the content of 
	 * 		the editor with something else. 
	 * @param fileExtension the file extension (without the DOT) of the textual DSL to edit
	 * @param fileExtension
	 */
	public EmbeddedXtextEditor(Composite control, Injector injector) {
		this(control, injector, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
	}

	public Composite getControl() {
		return fControl;
	}
	
	public XtextSourceViewer getViewer() {
		return fSourceViewer;
	}
	
	public XtextResource getResource() {
		return fResource;
	}
	
	public IXtextDocument getDocument() {
		return fDocument;
	}
	
//	public IDocumentEditor getDocumentEditor() {
//		return documentEditor;
//	}
	
	/**
	 * Should be called only once, during initialization. 
	 * 
	 * Then, you should call {@link #updateText(String, String, String)};
	 * 
	 * @param document
	 * @param prefix
	 * @param editablePart
	 * @param suffix
	 */
	protected void setText(XtextDocument document, String editablePart) {
		document.set(editablePart);
		fResource = createResource(editablePart);
		document.setInput(fResource);
		AnnotationModel annotationModel = new AnnotationModel();
		if (document instanceof ISynchronizable) {
			Object lock= ((ISynchronizable)document).getLockObject();
			if (lock == null) {
				lock= new Object();
				((ISynchronizable)document).setLockObject(lock);
			}
			((ISynchronizable) annotationModel).setLockObject(lock);
		}
		fSourceViewer.setDocument(document, annotationModel);
	}
	
	private XtextResource createResource(String content) {
		XtextResource result = createResource();
		try {
			result.load(new StringInputStream(content, result.getEncoding()), Collections.emptyMap());
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		return result;
	}
	
	private void createEditor(Composite parent) {
		createViewer(parent);
		
		Control control = fSourceViewer.getControl();
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		control.setLayoutData(data);

		createActions();
	}
	
	private void createViewer(Composite parent) {
		createSourceViewer(parent);
		installFoldingSupport(fSourceViewer);
		setText(fDocument, "");
		fHighlightingHelper.install(fViewerConfiguration, fSourceViewer);
	}
	
	/**
	 * Creates the vertical ruler to be used by this editor.
	 * Subclasses may re-implement this method.
	 *
	 * @return the vertical ruler
	 */
	private IVerticalRuler createVerticalRuler() {
		return new CompositeRuler();
	}
	
	/** The editor's vertical ruler. */
	private IVerticalRuler fVerticalRuler;
	
	/**
	 * Creates the annotation ruler column. Subclasses may re-implement or extend.
	 *
	 * @param ruler the composite ruler that the column will be added
	 * @return an annotation ruler column
	 * @since 3.2
	 */
	protected IVerticalRulerColumn createAnnotationRulerColumn(CompositeRuler ruler) {
		return new AnnotationRulerColumn(VERTICAL_RULER_WIDTH, getAnnotationAccess());
	}

	
	private void createSourceViewer(Composite parent) {
		fVerticalRuler = createVerticalRuler();
		fSourceViewer = fSourceViewerFactory.createSourceViewer(parent, fVerticalRuler, getOverviewRuler(), true, fStyle);
		fViewerConfiguration = fSourceViewerConfigurationProvider.get();
		fSourceViewer.configure(fViewerConfiguration);	
		
		initializeViewerFont(fSourceViewer);
		
		fProjectionSupport = installProjectionSupport(fSourceViewer);
		
		// make sure the source viewer decoration support is initialized
		getSourceViewerDecorationSupport(fSourceViewer);
		
		fSourceViewer.getTextWidget().addFocusListener(new SourceViewerFocusListener());
		
		fSourceViewerDecorationSupport.install(fPreferenceStoreAccess.getPreferenceStore());
		parent.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				fSourceViewerDecorationSupport.dispose();
			}
		});
		fDocument = fDocumentProvider.get();
		ValidationJob job = new ValidationJob(fResourceValidator, fDocument, 
				new IValidationIssueProcessor() {
					private AnnotationIssueProcessor annotationIssueProcessor;
					
					public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
						if (annotationIssueProcessor == null) {
							annotationIssueProcessor = new AnnotationIssueProcessor(fDocument, 
									fSourceViewer.getAnnotationModel(), 
									new IssueResolutionProvider.NullImpl());
						}
						if (annotationIssueProcessor != null)
							annotationIssueProcessor.processIssues(issues, monitor);						
					}
				}, CheckMode.FAST_ONLY);
		fDocument.setValidationJob(job);
	}
	
	/**
	 * Initializes the given viewer's font.
	 *
	 * @param viewer the viewer
	 * @since 2.0
	 */
	private void initializeViewerFont(ISourceViewer viewer) {

		boolean isSharedFont= true;
		Font font= null;

		if (fPreferenceStore != null) {
			// Backward compatibility
			if (fPreferenceStore.contains(JFaceResources.TEXT_FONT) && !fPreferenceStore.isDefault(JFaceResources.TEXT_FONT)) {
				FontData data= PreferenceConverter.getFontData(fPreferenceStore, JFaceResources.TEXT_FONT);

				if (data != null) {
					isSharedFont= false;
					font= new Font(viewer.getTextWidget().getDisplay(), data);
				}
			}
		}
		if (font == null)
			font= JFaceResources.getTextFont();

		if (!font.equals(fSourceViewer.getTextWidget().getFont())) {
			setFont(viewer, font);

			// disposeFont();
			{
				if (fFont != null) {
					fFont.dispose();
					fFont = null;
				}
			}
			
			if (!isSharedFont)
				fFont= font;
		} else if (!isSharedFont) {
			font.dispose();
		}
	}

	/**
	 * Sets the font for the given viewer sustaining selection and scroll position.
	 *
	 * @param sourceViewer the source viewer
	 * @param font the font
	 * @since 2.0
	 */
	private void setFont(ISourceViewer sourceViewer, Font font) {
		if (sourceViewer.getDocument() != null) {

			ISelectionProvider provider= sourceViewer.getSelectionProvider();
			ISelection selection= provider.getSelection();
			int topIndex= sourceViewer.getTopIndex();

			StyledText styledText= sourceViewer.getTextWidget();
			Control parent= styledText;
			if (sourceViewer instanceof ITextViewerExtension) {
				ITextViewerExtension extension= (ITextViewerExtension) sourceViewer;
				parent= extension.getControl();
			}

			parent.setRedraw(false);

			styledText.setFont(font);

			if (fVerticalRuler instanceof IVerticalRulerExtension) {
				IVerticalRulerExtension e= (IVerticalRulerExtension) fVerticalRuler;
				e.setFont(font);
			}

			provider.setSelection(selection);
			sourceViewer.setTopIndex(topIndex);

			if (parent instanceof Composite) {
				Composite composite= (Composite) parent;
				composite.layout(true);
			}

			parent.setRedraw(true);


		} else {

			StyledText styledText= sourceViewer.getTextWidget();
			styledText.setFont(font);

			if (fVerticalRuler instanceof IVerticalRulerExtension) {
				IVerticalRulerExtension e= (IVerticalRulerExtension) fVerticalRuler;
				e.setFont(font);
			}
		}
	}

	private ProjectionSupport fProjectionSupport;
	
	private static final String ERROR_ANNOTATION_TYPE = "org.eclipse.xtext.ui.editor.error";
	private static final String WARNING_ANNOTATION_TYPE = "org.eclipse.xtext.ui.editor.warning";
	
	private ProjectionSupport installProjectionSupport(ProjectionViewer projectionViewer) {
		ProjectionSupport projectionSupport = new ProjectionSupport(projectionViewer, getAnnotationAccess(),
				getSharedColors());
		projectionSupport.addSummarizableAnnotationType(WARNING_ANNOTATION_TYPE); //$NON-NLS-1$
		projectionSupport.addSummarizableAnnotationType(ERROR_ANNOTATION_TYPE); //$NON-NLS-1$
		projectionSupport.setAnnotationPainterDrawingStrategy(projectionAnnotationDrawingStrategy);
		projectionSupport.install();
		return projectionSupport;
	}
	
	/**
	 * Helper for managing the decoration support of this editor's viewer.
	 *
	 * <p>This field should not be referenced by subclasses. It is <code>protected</code> for API
	 * compatibility reasons and will be made <code>private</code> soon. Use
	 * {@link #getSourceViewerDecorationSupport(ISourceViewer)} instead.</p>
	 */
	private SourceViewerDecorationSupport fSourceViewerDecorationSupport;
	
	private void installFoldingSupport(ProjectionViewer projectionViewer) {
		fFoldingStructureProvider.install(this, projectionViewer);
		projectionViewer.doOperation(ProjectionViewer.TOGGLE);
		fFoldingStructureProvider.initialize();
	}
	
	/**
	 * Returns the source viewer decoration support.
	 *
	 * @param viewer the viewer for which to return a decoration support
	 * @return the source viewer decoration support
	 */
	private SourceViewerDecorationSupport getSourceViewerDecorationSupport(ISourceViewer viewer) {
		if (fSourceViewerDecorationSupport == null) {
			fSourceViewerDecorationSupport= new SourceViewerDecorationSupport(viewer, getOverviewRuler(), getAnnotationAccess(), getSharedColors());
			configureSourceViewerDecorationSupport(fSourceViewerDecorationSupport);
		}
		return fSourceViewerDecorationSupport;
	}
	
	/**
	 * Configures the decoration support for this editor's source viewer. Subclasses may override this
	 * method, but should call their superclass' implementation at some point.
	 *
	 * @param support the decoration support to configure
	 */
	private void configureSourceViewerDecorationSupport(SourceViewerDecorationSupport support) {

		Iterator<AnnotationPreference> e = Iterators.filter(fAnnotationPreferences.getAnnotationPreferences().iterator(), AnnotationPreference.class);
		while (e.hasNext())
			support.setAnnotationPreference((AnnotationPreference) e.next());

		support.setCursorLinePainterPreferenceKeys(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_CURRENT_LINE, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_CURRENT_LINE_COLOR);
		support.setMarginPainterPreferenceKeys(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN_COLOR, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN_COLUMN);
//		support.setSymbolicFontName(getFontPropertyPreferenceKey());
		
		if (characterPairMatcher != null) {
			support.setCharacterPairMatcher(characterPairMatcher);
			support.setMatchingCharacterPainterPreferenceKeys(BracketMatchingPreferencesInitializer.IS_ACTIVE_KEY,
					BracketMatchingPreferencesInitializer.COLOR_KEY);
		}
	}
	
	/**
	 * Returns the overview ruler.
	 *
	 * @return the overview ruler
	 */
	private IOverviewRuler getOverviewRuler() {
		if (fOverviewRuler == null)
			fOverviewRuler= createOverviewRuler(getSharedColors());
		return fOverviewRuler;
	}
	
	/** The width of the vertical ruler. */
	private static final int VERTICAL_RULER_WIDTH= 12;
	
	/**
	 * Returns the annotation access.
	 *
	 * @return the annotation access
	 */
	private IAnnotationAccess getAnnotationAccess() {
		if (fAnnotationAccess == null)
			fAnnotationAccess= createAnnotationAccess();
		return fAnnotationAccess;
	}
	
	/**
	 * Creates the annotation access for this editor.
	 *
	 * @return the created annotation access
	 */
	private IAnnotationAccess createAnnotationAccess() {
		return new DefaultMarkerAnnotationAccess() {
			@Override
			public int getLayer(Annotation annotation) {
				if (annotation.isMarkedDeleted()) {
					return IAnnotationAccessExtension.DEFAULT_LAYER;
				}
				return super.getLayer(annotation);
			}
		};
	}
	
	/**
	 * The annotation preferences.
	 */
	private MarkerAnnotationPreferences fAnnotationPreferences;
	
	private IOverviewRuler createOverviewRuler(ISharedTextColors sharedColors) {
		IOverviewRuler ruler= new OverviewRuler(getAnnotationAccess(), VERTICAL_RULER_WIDTH, sharedColors);

		Iterator<?> e= fAnnotationPreferences.getAnnotationPreferences().iterator();
		while (e.hasNext()) {
			AnnotationPreference preference= (AnnotationPreference) e.next();
			if (preference.contributesToHeader())
				ruler.addHeaderAnnotationType(preference.getAnnotationType());
		}
		return ruler;
	}
	
	private ISharedTextColors getSharedColors() {
		return EditorsUI.getSharedTextColors();
	}
	
	/**
	 * Updates the text of this editor with the given String
	 * 
	 * @param model
	 */
	public void update(String model) {
		IDocument document = fSourceViewer.getDocument();
		
		fSourceViewer.setRedraw(false);
		document.set(model);
		fSourceViewer.setVisibleRegion(0, model.length());
		fSourceViewer.setRedraw(true);
	}
	
	/**
	 * Updates the text of this editor with the given String or the 
	 * serialized form of the EObject if the semantic model of the 
	 * String does not contain any error and is different from the 
	 * given EObject.
	 * 
	 * @param eObject
	 * @param asString
	 */
	public void update(EObject eObject, String asString) {
		if (eObject != null) {
			EObject asStringEObject = null;
			XtextResource asStringResource = (XtextResource) fResourceSetProvider.get(null).createResource(URI.createURI("asStringResource." + fFileExtension));
			try {
				asStringResource.load(new StringInputStream(asString), Collections.emptyMap());
				if (!asStringResource.getContents().isEmpty()) {
					asStringEObject = asStringResource.getContents().get(0);
				}
			} catch (IOException e) {
				// ignore, will set the string to the serialization of the given eObject
			}

			try {
				EcoreUtil.resolveAll(asStringResource);
			} catch (Exception e) {
				// ignore
			}
			
//                        if (!asStringResource.getErrors().isEmpty() || (asStringResource.getParseResult() != null && !asStringResource.getParseResult().getParseErrors().isEmpty())) {
                        if (!asStringResource.getErrors().isEmpty() || (asStringResource.getParseResult() != null && !asStringResource.getParseResult().getSyntaxErrors().iterator().hasNext())) {
				// if there are parsing errors in the saved string, then we update with it
				update(asString);
			} else if (asStringEObject != null) {
				try {
					Resource copyResource = (XtextResource) fResourceSetProvider.get(null).createResource(URI.createURI("copyResource." + fFileExtension));
					
					try {
						EObject copyEObject = EcoreUtil.copy(eObject);
						copyResource.getContents().add(copyEObject);
						EcoreUtil.resolveAll(copyResource);
						if (!equals(copyEObject, asStringEObject)) {
//							String model = getResource().getSerializer().serialize(copyEObject, SaveOptions.newBuilder().noValidation().format().getOptions());
							update(asString); // FIXME: should update with the serialized form of the copyEObject but throw RuntimeException!!! 
						} else {
							// if there is no error and the content are equals, then we also update with the string
							update(asString);
						}
					} catch (Exception e) {
						update(asString);
					}

					copyResource.unload();
					copyResource.getResourceSet().getResources().remove(copyResource);
				} catch (Exception e) {
					update(asString);
				}
			} else {
				update("");
			}
			
			asStringResource.unload();
			asStringResource.getResourceSet().getResources().remove(asStringResource);
		} else {
			update("");
		}
	}
	
	private void createActions() {
		{
			TextViewerAction action = new TextViewerAction(fSourceViewer, ISourceViewer.CONTENTASSIST_PROPOSALS);
			action.setText("Content Assist");
			setAction(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS, action);
		}
		
		if (fViewerConfiguration.getContentFormatter(fSourceViewer) != null) {
			TextViewerAction action = new TextViewerAction(fSourceViewer, ISourceViewer.FORMAT);
			action.setText("Format");
			setAction(XTEXT_UI_FORMAT_ACTION, action);
		}

		{
			ToggleSLCommentAction action = new ToggleSLCommentAction(fSourceViewer); //$NON-NLS-1$
			setAction(XTEXT_UI_TOGGLE_SL_COMMENT_ACTION, action);
			action.configure(fSourceViewer, fViewerConfiguration);
		}
	}
	
	private void setAction(final String actionID, final IAction action) {
		if (action.getId() == null)
			action.setId(actionID); // make sure the action ID has been set
		
		fActionHandlers.add(new ActionHandler(action));
	}
	
	private List<ActionHandler> fActionHandlers = Lists.newArrayList();
	
	/**
	 * Source viewer focus listener that activates/deactivates action handlers on focus state change.
	 * 
	 * @author Mikaël Barbero
	 *
	 */
	private final class SourceViewerFocusListener implements FocusListener {
//		private static final String EMBEDEDXTEXT_EDITOR_CONTEXT = "org.eclipselabs.xtfo.embededxtextEditor.context"; //$NON-NLS-1$
		
		private final Expression fExpression;
		private final List<IHandlerActivation> fHandlerActivations;
//		private IContextActivation fContextActivation;
		
		public SourceViewerFocusListener() {
			fExpression = new ActiveShellExpression(fSourceViewer.getControl().getShell());
			fHandlerActivations = Lists.newArrayList();
			
			fSourceViewer.getControl().addDisposeListener(new DisposeListener() {
				public void widgetDisposed(DisposeEvent e) {
					IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getAdapter(IHandlerService.class);
					handlerService.deactivateHandlers(fHandlerActivations);
					fHandlerActivations.clear();
				}
			});
		}
		
		public void focusLost(FocusEvent e) {
//			IContextService contextService = (IContextService) PlatformUI.getWorkbench().
//					getActiveWorkbenchWindow().
//					getActivePage().
//					getActiveEditor().
//					getSite().
//					getService(IContextService.class);
//			contextService.deactivateContext(fContextActivation);
			
			IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getAdapter(IHandlerService.class);
			handlerService.deactivateHandlers(fHandlerActivations);
		}

		public void focusGained(FocusEvent e) {
//			IContextService contextService = (IContextService) PlatformUI.getWorkbench().
//					getActiveWorkbenchWindow().
//					getActivePage().
//					getActiveEditor().
//					getSite().
//					getService(IContextService.class);
//			fContextActivation = contextService.activateContext(EMBEDEDXTEXT_EDITOR_CONTEXT);
	
			IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getAdapter(IHandlerService.class);
			
			for (ActionHandler actionHandler : fActionHandlers) {
				fHandlerActivations.add(handlerService.activateHandler(actionHandler.getAction().getId(), actionHandler, fExpression));
			}			
		}
	}
	
	public XtextResource createResource() {
		ResourceSet resourceSet = fResourceSetProvider.get(null);
		XtextResource result = (XtextResource) resourceSet.createResource(
				URI.createURI(fGrammarAccess.getGrammar().getName() + "." + fFileExtension));
		return result;
	}
		
	private static boolean equals(EObject expected, EObject actual) {
		Map<String, Object> options = ImmutableMap.<String, Object> builder().put(MatchOptions.OPTION_IGNORE_XMI_ID, Boolean.TRUE).build();
	    MatchModel match = null;
	    try {
	        match = MatchService.doMatch(expected, actual, options);
	        DiffModel diff = DiffService.doDiff(match, false);
	        return diff.getDifferences().isEmpty();
	    }
	    catch (InterruptedException e) {
	        throw new AssertionError(e);
	    }
	}
	
	
	/**
	 * @author chsch
	 */
	public void dispose() {
		if (fSourceViewer.getTextWidget() != null) {
			fSourceViewer.getTextWidget().dispose();
		}
		fProjectionSupport.dispose();
		fHighlightingHelper.uninstall();
	}
	
	
	/**
	 * @author chsch
	 */
	public void bringOnTop() {
	    if (fControl.getLayout() instanceof StackLayout) {
	        ((StackLayout) fControl.getLayout()).topControl = getViewer().getControl();
	        getControl().layout();
	    }
	}
}
