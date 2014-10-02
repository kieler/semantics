/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.module;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.yakindu.sct.ui.editor.editor.guice.IMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.module.SCTModule;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;
import org.yakindu.sct.ui.editor.wizards.IDiagramInitializer;

import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncDiagramInitializer;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncPaletteFactory;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncRegionEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncRegionNameEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncStateEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncStateNameEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncTransitionEditPart;

/**
 * Initial contribution and api. This class extends the SCTModule class to
 * register the SyncTransition, SyncState, and SyncRegion edit parts and to use
 * the SyncPalette and SyncDiagramInitializer.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncModule extends SCTModule {
	@Override
	protected Class<? extends IGraphicalEditPart> getTransitionEditPart() {
		return SyncTransitionEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getStateEditPart() {
		return SyncStateEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getRegionNameEditPart() {
		return SyncRegionNameEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getRegionEditPart() {
		return SyncRegionEditPart.class;
	}

	@Override
	protected Class<? extends IGraphicalEditPart> getStateNameEditPart() {
		return SyncStateNameEditPart.class;
	}

	@Override
	protected Class<? extends IMetaModelTypeFactory> getMetaModelTypeFactory() {
		return SyncMetaModelTypeFactory.class;
	}

	@Override
	protected Class<? extends ISCTPaletteFactory> getPaletteFactory() {
		return SyncPaletteFactory.class;
	}

	@Override
	protected Class<? extends IDiagramInitializer> getDiagramInitializer() {
		return SyncDiagramInitializer.class;
	}

	@Override
	protected void configure() {
		super.configure();

	}

}
