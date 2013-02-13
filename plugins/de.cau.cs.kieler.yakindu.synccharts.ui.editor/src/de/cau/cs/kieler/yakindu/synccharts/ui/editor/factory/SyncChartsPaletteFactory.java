package de.cau.cs.kieler.yakindu.synccharts.ui.editor.factory;

import org.eclipse.jface.resource.ImageDescriptor;

import de.cau.cs.kieler.yakindu.synccharts.ui.editor.editor.Activator;
import de.cau.cs.kieler.yakindu.ui.editor.factory.KielerPaletteFactory;

public class SyncChartsPaletteFactory extends KielerPaletteFactory {

	@Override
	protected ImageDescriptor findIcon(String iconPath) {
		return super.getImageDescriptor(iconPath, Activator.getDefault()
				.getBundle());
	}

}
