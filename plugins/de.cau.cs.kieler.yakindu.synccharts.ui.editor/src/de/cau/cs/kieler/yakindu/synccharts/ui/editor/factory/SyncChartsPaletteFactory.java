package de.cau.cs.kieler.yakindu.synccharts.ui.editor.factory;

import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.FrameworkUtil;

import de.cau.cs.kieler.yakindu.ui.editor.factory.KielerPaletteFactory;

public class SyncChartsPaletteFactory extends KielerPaletteFactory {

	@Override
	protected ImageDescriptor findIcon(String iconPath) {
		return super.getImageDescriptor(iconPath, FrameworkUtil.getBundle(this.getClass()).getBundleContext().getBundle());
	}

}
