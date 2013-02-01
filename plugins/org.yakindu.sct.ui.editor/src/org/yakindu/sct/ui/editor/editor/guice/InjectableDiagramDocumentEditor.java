/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.guice;

import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;
import org.yakindu.sct.ui.editor.providers.SCTPaletteProvider;

import com.google.inject.Inject;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public abstract class InjectableDiagramDocumentEditor extends
		DiagramDocumentEditor {

	@Inject
	private EditPartFactory editPartFactory;
	@Inject
	private IMetaModelTypeFactory typeFactory;

	public InjectableDiagramDocumentEditor(boolean hasFlyoutPalette) {
		super(hasFlyoutPalette);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		typeFactory.registerElementTypes();
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(editPartFactory);
	}

}
