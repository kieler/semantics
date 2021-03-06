/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kicool.ui;

import com.google.inject.Injector;
import de.cau.cs.kieler.kicool.ui.internal.KiCoolActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class KiCoolExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(KiCoolActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		KiCoolActivator activator = KiCoolActivator.getInstance();
		return activator != null ? activator.getInjector(KiCoolActivator.DE_CAU_CS_KIELER_KICOOL_KICOOL) : null;
	}

}
