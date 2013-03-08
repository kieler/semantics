package de.cau.cs.kieler.yakindu.ui.editor.module;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.yakindu.sct.ui.editor.editor.guice.IMetaModelTypeFactory;
import org.yakindu.sct.ui.editor.module.SCTModule;
import org.yakindu.sct.ui.editor.providers.ISCTPaletteFactory;
import org.yakindu.sct.ui.editor.wizards.IDiagramInitializer;

import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncDiagramInitializer;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncMetaModelTypeFactory;
import de.cau.cs.kieler.yakindu.ui.editor.factory.SyncPaletteFactory;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncRegionNameEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncStateEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncStateNameEditPart;
import de.cau.cs.kieler.yakindu.ui.editor.parts.SyncTransitionEditPart;

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
