/**
 *
 */
package de.tu_berlin.cs.tfs.muvitorkit.animation;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Action to toggle animation performed by {@link MultipleAnimation}. Switches
 * the flag {@link AnimatingCommand#isPerformAnimation()}.
 * 
 * @author Tony Modica
 */
public class ToggleAnimationAction extends Action {

	private static final String ID = "muvitorkit.animation.ToggleAnimationAction";

	private static final String ICON = "org.eclipse.jdt.ui.icons.full.elcl16/refresh_nav.gif";

	private static final String ICON_PATH = "$nl$/icons/";

	private static final String ENABLED_ICON_OVERLAY = "org.eclipse.jdt.ui.icons.full.ovr16/run_co.gif";

	private static final String DISABLED_ICON_OVERLAY = "org.eclipse.jdt.ui.icons.full.ovr16/maxlevel_co.gif";

	private static final ImageDescriptor enabledImage;

	private static final ImageDescriptor disabledImage;

	static {
		final Image image = AbstractUIPlugin.imageDescriptorFromPlugin(
				"MuvitorKit", ICON_PATH + ICON).createImage();
		final ImageDescriptor enabled_overlay = AbstractUIPlugin
				.imageDescriptorFromPlugin("MuvitorKit", ICON_PATH
						+ ENABLED_ICON_OVERLAY);
		final ImageDescriptor disabled_overlay = AbstractUIPlugin
				.imageDescriptorFromPlugin("MuvitorKit", ICON_PATH
						+ DISABLED_ICON_OVERLAY);
		enabledImage = new DecorationOverlayIcon(image, enabled_overlay,
				IDecoration.BOTTOM_RIGHT);
		disabledImage = new DecorationOverlayIcon(image, disabled_overlay,
				IDecoration.BOTTOM_RIGHT);
	}

	public ToggleAnimationAction() {
		super("Toggle Animation", AS_PUSH_BUTTON);
		setEnabled(true);
		setId(ID);
		AnimatingCommand.setPerformAnimation(false);
		switchState();
	}

	@Override
	public void run() {
		switchState();
	}

	private void switchState() {
		AnimatingCommand.setPerformAnimation(!AnimatingCommand
				.isPerformAnimation());
		if (AnimatingCommand.isPerformAnimation()) {
			setImageDescriptor(enabledImage);
			setToolTipText("Toggle Animation, currently enabled");
		} else {
			setImageDescriptor(disabledImage);
			setToolTipText("Toggle Animation, currently disabled");
		}
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void runWithEvent(final Event event) {
		run();
	}

}
