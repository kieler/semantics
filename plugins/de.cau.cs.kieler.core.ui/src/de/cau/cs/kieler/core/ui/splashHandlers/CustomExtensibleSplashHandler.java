package de.cau.cs.kieler.core.ui.splashHandlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.splash.BasicSplashHandler;

/**
 * 
 * @author soh
 */
public class CustomExtensibleSplashHandler extends BasicSplashHandler {

    private List<Image> fImageList;

    private List<String> fTooltipList;

    private List<String> fTextList;

    private static final String F_SPLASH_EXTENSION_ID = "de.cau.cs.kieler.core.ui.customSplashExtension";

    private static final String F_ELEMENT_ICON = "icon";

    private static final String F_ELEMENT_TOOLTIP = "tooltip";

    private static final String F_ELEMENT_TEXT = "text";

    private static final String F_DEFAULT_TOOLTIP = "Image";

    private static final int F_IMAGE_WIDTH = 50;

    private static final int F_IMAGE_HEIGHT = 50;

    private static final int F_MARGIN = 190;

    private static final int F_SPLASH_SCREEN_BEVEL = 5;

    private Composite fIconPanel;

    private Composite fTextPanel;
    
    Color labelColor;

    /**
     * 
     * Creates a new CustomExtensibleSplashHandler.
     * 
     */
    public CustomExtensibleSplashHandler() {
        super();
        fImageList = new ArrayList<Image>();
        fTooltipList = new ArrayList<String>();
        fTextList = new ArrayList<String>();
        fIconPanel = null;
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void init(final Shell splash) {
        // Store the shell
        super.init(splash);
        // Configure the shell layout
        configureUISplash();
        // Load all splash extensions
        loadSplashExtensions();
        // If no splash extensions were loaded abort the splash handler
        if (!hasSplashExtensions()) {
            return;
        }
        // Create UI
        createUI();
        // Configure the image panel bounds
        configureUICompositeIconPanelBounds();
        // Enter event loop and prevent the RCP application from
        // loading until all work is done
        doEventLoop();
    }

    @Override
    public IProgressMonitor getBundleProgressMonitor() {
        return new NullProgressMonitor();
    }

    /**
     * @return
     */
    private boolean hasSplashExtensions() {
        return !(fTextList.isEmpty() && fImageList.isEmpty());
    }

    /**
     * 
     */
    private void createUI() {
        // Create the icon panel
        createUICompositeIconPanel();
        // Create the images
        createUIImages();
    }

    /**
     * 
     */
    private void createUIImages() {
        labelColor = new Color(Display.getDefault(), SHADING, SHADING, SHADING);
        Iterator<Image> imageIterator = fImageList.iterator();
        Iterator<String> tooltipIterator = fTooltipList.iterator();
        Iterator<String> textIterator = fTextList.iterator();
        int i = 1;
        int columnCount = ((GridLayout) fIconPanel.getLayout()).numColumns;
        // Create all the images
        // Abort if we run out of columns (left-over images will not fit within
        // the usable splash screen width)
        while (imageIterator.hasNext() && (i <= columnCount)) {
            Image image = imageIterator.next();
            String tooltip = tooltipIterator.next();
            // Create the image using a label widget
            createUILabel(image, tooltip);
            i++;
        }
        while (textIterator.hasNext()) {
            String text = textIterator.next();
            createTextLabel(text);
        }
    }

    /** the grey value for label color. */
    private static final int SHADING = 200;
    
    /**
     * @param text
     */
    private void createTextLabel(final String text) {
        Label label = new Label(fTextPanel, SWT.NONE);
        label.setText(text);
        label.setForeground(labelColor);
        Font f = label.getFont();
        if (f.getFontData() != null) {
            FontData fd = f.getFontData()[0];
            int height = (fd.getHeight() * 4);
            String name = fd.getName();
            int style = fd.getStyle();
            Font f2 = new Font(f.getDevice(), name, height, style);
            label.setFont(f2);
        }
    }

    /**
     * @param image
     * @param tooltip
     */
    private void createUILabel(final Image image, final String tooltip) {
        // Create the label (no text)
        Label label = new Label(fIconPanel, SWT.NONE);
        label.setImage(image);
        label.setToolTipText(tooltip);
    }

    /**
     * 
     */
    private void createUICompositeIconPanel() {
        Shell splash = getSplash();
        // Create the composite
        fIconPanel = new Composite(splash, SWT.NONE);
        // Determine the maximum number of columns that can fit on the splash
        // screen. One 50x50 image per column.
        int maxColumnCount = getUsableSplashScreenWidth() / F_IMAGE_WIDTH;
        // Limit size to the maximum number of columns if the number of images
        // exceed this amount; otherwise, use the exact number of columns
        // required.
        int actualColumnCount = Math.min(fImageList.size(), maxColumnCount);
        // Configure the layout
        GridLayout layout = new GridLayout(actualColumnCount, true);
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 0;
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        fIconPanel.setLayout(layout);

        fTextPanel = new Composite(splash, SWT.NONE);
        GridLayout layout2 = new GridLayout(1, true);
        layout2.marginTop = F_MARGIN;
        fTextPanel.setLayout(layout2);
    }

    /**
     * 
     */
    private void configureUICompositeIconPanelBounds() {
        // Determine the size of the panel and position it at the bottom-right
        // of the splash screen.
        Point panelSize = fIconPanel
                .computeSize(SWT.DEFAULT, SWT.DEFAULT, true);

        int xCoord = getSplash().getSize().x - F_SPLASH_SCREEN_BEVEL
                - panelSize.x;
        int yCoord = getSplash().getSize().y - F_SPLASH_SCREEN_BEVEL
                - panelSize.y;
        int xWidth = panelSize.x;
        int yWidth = panelSize.y;

        fIconPanel.setBounds(xCoord, yCoord, xWidth, yWidth);
    }

    /**
     * @return
     */
    private int getUsableSplashScreenWidth() {
        // Splash screen width minus two graphic border bevel widths
        return getSplash().getSize().x - (F_SPLASH_SCREEN_BEVEL * 2);
    }

    /**
     * @return
     */
    private int getUsableSplashScreenHeight() {
        // Splash screen width minus two graphic border bevel widths
        return getSplash().getSize().y - (F_SPLASH_SCREEN_BEVEL * 2);
    }

    /**
     * 
     */
    private void loadSplashExtensions() {
        // Get all splash handler extensions
        IExtension[] extensions = Platform.getExtensionRegistry()
                .getExtensionPoint(F_SPLASH_EXTENSION_ID).getExtensions();
        // Process all splash handler extensions
        for (int i = 0; i < extensions.length; i++) {
            processSplashExtension(extensions[i]);
        }
    }

    /**
     * @param extension
     */
    private void processSplashExtension(final IExtension extension) {
        // Get all splash handler configuration elements
        IConfigurationElement[] elements = extension.getConfigurationElements();
        // Process all splash handler configuration elements
        for (int j = 0; j < elements.length; j++) {
            processSplashElements(elements[j]);
        }
    }

    /**
     * @param configurationElement
     */
    private void processSplashElements(
            final IConfigurationElement configurationElement) {
        // Attribute: icon
        processSplashElementIcon(configurationElement);
        // Attribute: tooltip
        processSplashElementTooltip(configurationElement);
        // Attribute: text
        processSplashText(configurationElement);
    }

    /**
     * @param configurationElement
     */
    private void processSplashText(
            final IConfigurationElement configurationElement) {
        String text = configurationElement.getAttribute(F_ELEMENT_TEXT);

        if ((text == null) || (text.length() == 0)) {
            return;
        }
        fTextList.add(text);
    }

    /**
     * @param configurationElement
     */
    private void processSplashElementTooltip(
            final IConfigurationElement configurationElement) {
        // Get attribute tooltip
        String tooltip = configurationElement.getAttribute(F_ELEMENT_TOOLTIP);
        // If a tooltip is not defined, give it a default
        if ((tooltip == null) || (tooltip.length() == 0)) {
            fTooltipList.add(F_DEFAULT_TOOLTIP);
        } else {
            fTooltipList.add(tooltip);
        }
    }

    /**
     * @param configurationElement
     */
    private void processSplashElementIcon(
            final IConfigurationElement configurationElement) {
        // Get attribute icon
        String iconImageFilePath = configurationElement
                .getAttribute(F_ELEMENT_ICON);
        // Abort if an icon attribute was not specified
        if ((iconImageFilePath == null) || (iconImageFilePath.length() == 0)) {
            return;
        }
        // Create a corresponding image descriptor
        ImageDescriptor descriptor = AbstractUIPlugin
                .imageDescriptorFromPlugin(
                        configurationElement.getNamespaceIdentifier(),
                        iconImageFilePath);
        // Abort if no corresponding image was found
        if (descriptor == null) {
            return;
        }
        // Create the image
        Image image = descriptor.createImage();
        // Abort if image creation failed
        if (image == null) {
            return;
        }
        // Abort if the image does not have dimensions of 50x50
        if ((image.getBounds().width != F_IMAGE_WIDTH)
                || (image.getBounds().height != F_IMAGE_HEIGHT)) {
            // Dipose of the image
            image.dispose();
            return;
        }
        // Store the image and tooltip
        fImageList.add(image);
    }

    /**
     * 
     */
    private void configureUISplash() {
        // Configure layout
        GridLayout layout = new GridLayout(1, true);
        getSplash().setLayout(layout);
        // Force shell to inherit the splash background
        getSplash().setBackgroundMode(SWT.INHERIT_DEFAULT);
    }

    /**
     * 
     */
    private void doEventLoop() {
        Shell splash = getSplash();
        if (!splash.getDisplay().readAndDispatch()) {
            splash.getDisplay().sleep();
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.splash.AbstractSplashHandler#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        // Check to see if any images were defined
        if ((fImageList == null) || fImageList.isEmpty()) {
            return;
        }
        // Dispose of all the images
        Iterator<Image> iterator = fImageList.iterator();
        while (iterator.hasNext()) {
            Image image = iterator.next();
            image.dispose();
        }
        // Dispose of the label color
        labelColor.dispose();
    }
}
