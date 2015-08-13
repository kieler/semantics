/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kex.ui.wizards.importing;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.Bundle;

import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.ui.util.TreeViewerCheckStateHandler;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kex.controller.ExampleManager;
import de.cau.cs.kieler.kex.model.Category;
import de.cau.cs.kieler.kex.model.Example;
import de.cau.cs.kieler.kex.ui.util.ImageConverter;

/**
 * This class represents the import page of importwizard. It contains a tree which shows the
 * importable examples. Secondly there is a description and a preview picture field. The
 * {@link WizardResourceImportPage} is extended because of getting a Workspace Directory Chooser.
 * 
 * @author pkl
 * 
 */
public class ImportExamplePage extends WizardPage {

    private static final int FIRST_ELEMENT = 3;
    private static final int SECOND_ELEMENT = 7;

    private static final int IMAGE_PRE_WIDTH = 426;
    private static final int IMAGE_PRE_HEIGHT = 238;

    private static final int DESC_HEIGHT_HINT = 200;
    private static final int DESC_MIN_HEIGHT = 160;

    private static final int TREE_MIN_WIDTH = 200;
    private static final int HORIZONTAL_INDENT = 10;
    private static final int VERTICAL_INDENT = 10;

    private SashForm sashForm;
    private Text exampleDescField;
    private Label imageLabel;
    private Example selectedExample;
    private Composite previewComp;
    private Label previewDesc;
    private CheckboxTreeViewer treeViewer;

    private boolean isPreviewAvailable;

    private List<Pair<Category, ArrayList<Object>>> allCategoryPairs 
        = new ArrayList<Pair<Category, ArrayList<Object>>>();

    /**
     * The constructor will be called with following parameters.
     * 
     * @param name
     *            , the name of page, works as page title, too.
     * @param selection
     *            , the selected resource will be set as default as import location.
     */

    public ImportExamplePage(final String name, final IStructuredSelection selection) {
        super(name);
        setTitle("Select Examples");
        setDescription(Messages.getString("importExamplePageDescription"));
    }

    /**
     * Creates the control composite of the wizardpage. Devides the components of the page into
     * left(treeviewer) and right(previewpicture + description).
     * 
     * @param parent
     *            , Composite
     */
    public void createControl(final Composite parent) {
        sashForm = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
        sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
        setControl(sashForm);
        createLeft(sashForm);
        createRight(sashForm);
        sashForm.setWeights(new int[] { FIRST_ELEMENT, SECOND_ELEMENT });
    }

    private void createLeft(final Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout());
        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.minimumWidth = TREE_MIN_WIDTH;

        composite.setLayoutData(gridData);
        // create filter text
        final Text filterText = new Text(composite, SWT.BORDER);
        filterText.setText(Messages.getString("initialFilterText"));
        filterText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        filterText.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));

        // create tree viewer
        treeViewer = new CheckboxTreeViewer(composite, SWT.SINGLE | SWT.CHECK | SWT.BORDER
                | SWT.V_SCROLL | SWT.H_SCROLL);
        final ExampleContentProvider contentProvider = new ExampleContentProvider();
        treeViewer.setContentProvider(contentProvider);
        treeViewer.setLabelProvider(new ExampleLabelProvider());
        treeViewer.setSorter(new ViewerSorter() {
            @Override
            public void sort(final Viewer viewer, final Object[] elements) {
                // FIXME sort so that, the categories will be displayed at first.
                super.sort(viewer, elements);
            }
        });
        treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        fillTreeViewer();
        treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @SuppressWarnings("unchecked")
            public void selectionChanged(final SelectionChangedEvent event) {
                TreeSelection treeEvent = (TreeSelection) event.getSelection();
                Object firstElement = treeEvent.getFirstElement();
                if (firstElement instanceof Pair) {
                    String desc = ((Pair<Category, ArrayList<Object>>) firstElement).getFirst()
                            .getDescription();
                    getExampleDescField().setText(desc != null ? desc : "");
                    updateImageLabel(initPreviewImage());
                    isPreviewAvailable = false;
                } else if (firstElement instanceof Example) {
                    selectedExample = (Example) firstElement;
                    updateDescriptionLabel((Example) firstElement);
                    Image computeImage = computeImage(selectedExample.getOverviewPic(),
                            selectedExample.getNamespaceId(), imageLabel.getSize().x,
                            imageLabel.getSize().y, java.awt.Image.SCALE_SMOOTH);
                    isPreviewAvailable = computeImage != null;
                    updateImageLabel(isPreviewAvailable ? computeImage : noPreviewPic());
                }
            }
        });
        treeViewer.addCheckStateListener(new ICheckStateListener() {
            public void checkStateChanged(final CheckStateChangedEvent event) {
                boolean checked = event.getChecked();
                treeViewer.setSubtreeChecked(event.getElement(), checked);
                updateTreeChecks(event, checked);
            }

            public void updateTreeChecks(final CheckStateChangedEvent event, final boolean check) {
                Object element = event.getElement();
                while (true) {
                    Pair<Category, ArrayList<Object>> parent = getParent(element);
                    if (parent == null) {
                        break;
                    }
                    if (check) {
                        if (!treeViewer.getChecked(parent) || treeViewer.getGrayed(parent)) {
                            if (allElementsChecked(parent)) {
                                treeViewer.setChecked(parent, true);
                                treeViewer.setGrayed(parent, false);
                            } else {
                                treeViewer.setChecked(parent, true);
                                treeViewer.setGrayed(parent, true);
                            }
                            if (parent.getFirst().getParentId() != null) {
                                element = parent;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!hasCheckedElements(parent)) {
                        treeViewer.setChecked(parent, false);
                        if (parent.getFirst().getParentId() != null) {
                            element = parent;
                        } else {
                            break;
                        }
                    } else {
                        treeViewer.setGrayed(parent, true);
                        if (parent.getFirst().getParentId() != null) {
                            element = parent;
                        } else {
                            break;
                        }
                    }
                }
            }

            private boolean allElementsChecked(final Pair<Category, ArrayList<Object>> parent) {
                for (Object ob : parent.getSecond()) {
                    if (!treeViewer.getChecked(ob)) {
                        return false;
                    }
                }
                return true;
            }

            private boolean hasCheckedElements(final Pair<Category, ArrayList<Object>> parent) {
                for (Object element : parent.getSecond()) {
                    if (treeViewer.getChecked(element)) {
                        return true;
                    }
                }
                return false;
            }

            @SuppressWarnings("unchecked")
            private Pair<Category, ArrayList<Object>> getParent(final Object element) {
                String categoryId = null;
                if (element instanceof Example) {
                    categoryId = ((Example) element).getCategoryId();
                } else {
                    categoryId = ((Pair<Category, ArrayList<Object>>) element).getFirst()
                            .getParentId();
                }
                for (Pair<Category, ArrayList<Object>> cat : allCategoryPairs) {
                    if (cat.getFirst().getId().equals(categoryId)) {
                        return cat;
                    }
                }
                return null;
            }

        });
        final Maybe<Boolean> filterChanged = new Maybe<Boolean>(Boolean.FALSE);
        filterText.addModifyListener(new ModifyListener() {
            public void modifyText(final ModifyEvent e) {
                if (!filterChanged.get()) {
                    filterChanged.set(Boolean.TRUE);
                    filterText.setForeground(null);
                    int pos = filterText.getCaretPosition();
                    String newText = filterText.getText(pos - 1, pos - 1);
                    filterText.setText(newText);
                    filterText.setSelection(pos);
                } else {
                    contentProvider.updateFilter(filterText.getText());
                    treeViewer.refresh();
                    treeViewer.expandAll();
                }
            }
        });
        treeViewer.addFilter(new ViewerFilter() {
            @Override
            public boolean select(final Viewer viewer, final Object parentElement,
                    final Object element) {
                return contentProvider.applyFilter(element);
            }
        });
    }

    private Image computeImage(final String imagePath, final String nameSpaceId,
            final int displayWidth, final int displayHeight, final int scaleType) {

        if (imagePath != null && imagePath.length() > 0) {
            Bundle bundle = Platform.getBundle(nameSpaceId);
            URL resource = bundle
                    .getEntry(imagePath.startsWith(String.valueOf(Path.SEPARATOR)) ? imagePath
                            : Path.SEPARATOR + imagePath);
            if (resource != null) {
                ImageDescriptor descriptor = ImageDescriptor.createFromURL(resource);
                Image image = null;
                if (!(displayWidth == -1 || displayHeight == -1)) {
                    ImageData imgData = descriptor.getImageData();
                    double resizeFactor = Math.max((double) imgData.width / (double) displayWidth,
                            (double) imgData.height / (double) displayHeight);
                    if (resizeFactor != 1) {
                        if (resizeFactor < 1) {
                            resizeFactor = 1;
                        }
                        imgData = ImageConverter.scaleSWTImage(imgData,
                                (int) (imgData.width / resizeFactor),
                                (int) (imgData.height / resizeFactor), scaleType);
                    }
                    image = new Image(this.getShell().getDisplay(), imgData);
                } else {
                    image = descriptor.createImage();
                }
                if (image != null) {
                    return image;
                }
            }
        }
        return null;
    }

    private void fillTreeViewer() {
        List<Category> categories = ExampleManager.get().getCategories();
        Collection<Example> values = ExampleManager.get().getExamples().values();
        List<Pair<Category, ArrayList<Object>>> viewElement = Lists.newArrayList();
        List<Pair<Category, ArrayList<Object>>> categoryPairList = Lists.newArrayList();

        // create categories
        for (Category category : categories) {
            Pair<Category, ArrayList<Object>> categoryPair = new Pair<Category, ArrayList<Object>>();
            ArrayList<Object> categoryList = new ArrayList<Object>();
            categoryPair.setFirst(category);
            categoryPair.setSecond(categoryList);
            categoryPairList.add(categoryPair);
            allCategoryPairs.add(categoryPair);
        }

        // structure subcategories
        structCatsRec(categoryPairList);

        // fill with examples
        for (Pair<Category, ArrayList<Object>> categoryPair : categoryPairList) {
            Category first = categoryPair.getFirst();
            String catId = first.getId();
            for (Example example : values) {
                if (example.getCategoryId().equals(catId)) {
                    categoryPair.getSecond().add(example);
                }
            }
            if (first.getParentId() == null && !categoryPair.getSecond().isEmpty()) {
                viewElement.add(categoryPair);
            }
        }
        treeViewer.setInput(viewElement);
        TreeViewerCheckStateHandler checkStateManager = new TreeViewerCheckStateHandler(treeViewer);
        checkStateManager.checkElements(values);
    }

    /**
     * Builder for category-pairs, recursively.
     */
    private void structCatsRec(final List<Pair<Category, ArrayList<Object>>> categoryPairList) {
        boolean changed = false;
        for (Pair<Category, ArrayList<Object>> pair : categoryPairList) {
            String parentId = pair.getFirst().getParentId();
            if (parentId != null) {
                for (Pair<Category, ArrayList<Object>> pair2 : categoryPairList) {
                    if (pair2.getFirst().getId().equals(parentId)) {
                        if (!pair2.getSecond().contains(pair)) {
                            pair2.getSecond().add(pair);
                            changed = true;
                        }
                        break;
                    }
                }
            }
        }
        if (changed) {
            structCatsRec(categoryPairList);
        }
    }

    /**
     * Contentprovider for the example treeviewer.
     * 
     * @author pkl
     * 
     */
    private static class ExampleContentProvider implements ITreeContentProvider {

        // Maybe use treeElements which are implemented in an revision before.
        private List<Pair<Category, List<Object>>> input;
        /** the filter map that stores visibility information. */
        private final Map<Object, Boolean> filterMap = new HashMap<Object, Boolean>();
        /** the current filter value. */
        private String filterValue;

        public void dispose() {
        }

        /**
         * Update the filter value for this provider.
         * 
         * @param filter
         *            the new filter value
         */
        public void updateFilter(final String filter) {
            this.filterValue = filter;
            if (filterValue != null) {
                filterValue = filterValue.toLowerCase();
            }
            filterMap.clear();
        }

        public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        }

        @SuppressWarnings("unchecked")
        public Object[] getElements(final Object inputElement) {
            input = (ArrayList<Pair<Category, List<Object>>>) inputElement;
            return input.toArray();
        }

        @SuppressWarnings("unchecked")
        public Object[] getChildren(final Object parentElement) {
            if (parentElement instanceof Pair) {
                Pair<Category, List<Object>> elements = (Pair<Category, List<Object>>) parentElement;
                return elements.getSecond().toArray();
            } else {
                return Collections.EMPTY_LIST.toArray();
            }
        }

        public Object getParent(final Object element) {
            if (element instanceof Example) {
                for (Pair<Category, List<Object>> pair : input) {
                    if ((pair.getFirst()).getId().equals(((Example) element).getCategoryId())) {
                        return pair.getFirst();
                    }
                }
            }
            return null;
        }

        public boolean hasChildren(final Object element) {
            return getChildren(element).length > 0;
        }

        /**
         * Apply the current filter to the given element.
         * 
         * @param element
         *            an element from the content
         * @return true if the filter admits the element
         */
        public boolean applyFilter(final Object element) {
            Boolean result = filterMap.get(element);
            if (result == null) {
                if (filterValue != null && filterValue.length() > 0) {
                    if (element instanceof Pair) {
                        @SuppressWarnings("unchecked")
                        Pair<Category, ArrayList<Object>> pair 
                            = (Pair<Category, ArrayList<Object>>) element;
                        Category category = pair.getFirst();
                        result = category.getTitle().toLowerCase().contains(filterValue);
                        if (result) {
                            for (Object ob : pair.getSecond()) {
                                filterMap.put(ob, Boolean.TRUE);
                            }
                        } else {
                            boolean hasFilteredChild = false;
                            for (Object ob : pair.getSecond()) {
                                // ob can only be a new pair (for category with
                                // its childs) or an example.
                                hasFilteredChild |= applyFilter(ob);
                            }
                            result = hasFilteredChild;
                        }
                    } else if (element instanceof Example) {
                        Example example = (Example) element;
                        return Boolean.valueOf(example.getTitle().toLowerCase()
                                .contains(filterValue));
                    }
                } else {
                    result = Boolean.TRUE;
                }
                filterMap.put(element, result);
            }
            if (result == null) {
                throw new IllegalStateException("ImportExamplePage: result of applyFilter is null!");
            }
            return result;
        }

    }

    /**
     * Labelprovider for the example treeviewer.
     * 
     * @author pkl
     * 
     */
    private class ExampleLabelProvider extends LabelProvider implements ILabelProvider {

        private static final int ICON_WIDTH = 16;
        private static final int ICON_HEIGHT = 16;

        @SuppressWarnings("unchecked")
        @Override
        public String getText(final Object element) {
            if (element instanceof Pair) {
                Pair<Category, List<Object>> pair = (Pair<Category, List<Object>>) element;
                return pair.getFirst().getTitle();
            }
            if (element instanceof Example) {
                return ((Example) element).getTitle();
            }
            return null;
        }

        @Override
        public Image getImage(final Object element) {
            if (element instanceof Pair) {
                @SuppressWarnings("unchecked")
                Pair<Category, List<Object>> pair = (Pair<Category, List<Object>>) element;
                Category first = pair.getFirst();
                return computeImage(first.getIconPath(), first.getNamespaceId(), ICON_WIDTH,
                        ICON_HEIGHT, java.awt.Image.SCALE_SMOOTH);
            }
            // if (element instanceof Example) {
            // return computeImage(((Example) element).getOverviewPic(),
            // ((Example) element).getNamespaceId(), ICON_WIDTH, ICON_HEIGHT, true);
            // }
            return null;
        }
    }

    private void createRight(final Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        createPreviewComp(composite);
        createDescriptionComp(composite);
    }

    /**
     * Creates the preview picture component.
     * 
     * @param composite
     * @param controlComp
     */
    private void createPreviewComp(final Composite composite) {
        previewDesc = new Label(composite, SWT.NONE);
        previewDesc.setText(Messages.getString("previewLabel"));
        GridData previewDescData = new GridData(GridData.FILL_HORIZONTAL);
        previewDesc.setLayoutData(previewDescData);

        previewComp = new Composite(composite, SWT.BORDER);
        previewComp.setBackground(composite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        GridLayout imageCompositeLayout = new GridLayout(1, false);
        imageCompositeLayout.marginHeight = 0;
        imageCompositeLayout.marginWidth = 0;
        previewComp.setLayout(imageCompositeLayout);
        GridData imageCompositeGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        imageCompositeGridData.heightHint = IMAGE_PRE_HEIGHT;
        imageCompositeGridData.minimumHeight = DESC_MIN_HEIGHT;
        imageCompositeGridData.horizontalIndent = HORIZONTAL_INDENT;
        previewComp.setLayoutData(imageCompositeGridData);

        imageLabel = new Label(previewComp, SWT.CENTER);
        imageLabel.setBackground(composite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        imageLabel.setImage(initPreviewImage());
        imageLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDown(final MouseEvent e) {
                super.mouseDown(e);
                if (selectedExample == null || !isPreviewAvailable) {
                    return;
                }
                Dialog dialog = new Dialog(imageLabel.getShell()) {

                    private static final int IMAGE_WIDTH = 800;
                    private static final int IMAGE_HEIGHT = 600;

                    private Image image;

                    @Override
                    protected void createButtonsForButtonBar(final Composite parent) {
                        super.createButton(parent, IDialogConstants.OK_ID,
                                IDialogConstants.OK_LABEL, true);
                    }

                    @Override
                    protected Control createDialogArea(final Composite parent) {
                        // scrolling
                        Composite composite = (Composite) super.createDialogArea(parent);
                        Composite innerComp = new Composite(composite, SWT.BORDER);
                        innerComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
                        GridLayout layout = new GridLayout(1, false);
                        layout.marginHeight = 0;
                        layout.marginWidth = 0;
                        innerComp.setLayout(layout);
                        Label imgLabel = new Label(innerComp, SWT.CENTER);
                        imgLabel.setText("BLA!");
                        imgLabel.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
                        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
                        gridData.heightHint = IMAGE_HEIGHT;
                        gridData.widthHint = IMAGE_WIDTH;
                        imgLabel.setLayoutData(gridData);
                        image = computeImage(selectedExample.getOverviewPic(),
                                selectedExample.getNamespaceId(), IMAGE_WIDTH, IMAGE_HEIGHT,
                                java.awt.Image.SCALE_SMOOTH);
                        imgLabel.setImage(image);
                        imgLabel.pack();
                        return composite;
                    }

                    @Override
                    protected void configureShell(final Shell newShell) {
                        super.configureShell(newShell);
                        newShell.setText(Messages.getString("previewImageDialogDescription"));
                    }

                    @Override
                    public boolean close() {
                        if (image != null) {
                            image.dispose();
                        }
                        return super.close();
                    }
                };
                dialog.open();
            }
        });
        imageLabel.addMouseTrackListener(new MouseTrackAdapter() {
            @Override
            public void mouseHover(final MouseEvent e) {
                imageLabel.setCursor(new Cursor(imageLabel.getDisplay(), SWT.CURSOR_HAND));
            }
        });
    }

    private void createDescriptionComp(final Composite composite) {
        Label descriptionLabel = new Label(composite, SWT.NONE);
        descriptionLabel.setText(Messages.getString("descriptionLabel"));
        GridData descriptionLabelData = new GridData();
        descriptionLabelData.verticalIndent = VERTICAL_INDENT;
        descriptionLabel.setLayoutData(descriptionLabelData);

        this.exampleDescField = new Text(composite, SWT.WRAP | SWT.MULTI | SWT.V_SCROLL
                | SWT.H_SCROLL | SWT.BORDER);
        GridData descData = new GridData(GridData.FILL_HORIZONTAL);
        descData.heightHint = DESC_HEIGHT_HINT;
        descData.minimumHeight = DESC_MIN_HEIGHT;
        descData.horizontalIndent = HORIZONTAL_INDENT;
        this.exampleDescField.setLayoutData(descData);
        this.exampleDescField.setEditable(false);
    }

    /**
     * Updates the label of preview picture.
     * 
     * @param image
     *            , {@link Image}
     */
    private void updateImageLabel(final Image image) {
        Image oldImg = imageLabel.getImage();
        if (oldImg != null) {
            oldImg.dispose();
        }
        imageLabel.setImage(image);
    }

    private void updateDescriptionLabel(final Example example) {
        StringBuilder sb = new StringBuilder();
        Date generationDate = example.getGenerationDate();
        sb.append(Messages.getString("title"))
                .append(example.getTitle() != null ? example.getTitle() : "")
                .append("\n")
                .append(Messages.getString("author"))
                .append(example.getAuthor() != null ? example.getAuthor() : "")
                .append("\n")
                .append(Messages.getString("contact"))
                .append(example.getContact() != null ? example.getContact() : "")
                .append("\n")
                .append(Messages.getString("generatedAt"))
                .append(generationDate != null ? new SimpleDateFormat(Messages
                        .getString("englishDataFormat")).format(generationDate) : "").append("\n")
                .append("\n")
                .append(example.getDescription() != null ? example.getDescription() : "");
        getExampleDescField().setText(sb.toString());
    }

    /**
     * loads "no preview" picture.
     * 
     * @return "no preview" picture
     */
    private Image noPreviewPic() {
        return new Image(this.previewComp.getDisplay(), ExampleManager.get().getEmptyPic());
    }

    /**
     * initializes the preview image.
     * 
     * @return
     */
    private Image initPreviewImage() {
        Image preview = new Image(previewComp.getDisplay(), IMAGE_PRE_WIDTH, IMAGE_PRE_HEIGHT);
        GC gc = new GC(preview);
        gc.setBackground(previewComp.getBackground());
        gc.fillRectangle(preview.getBounds());
        return preview;
    }

    /**
     * filters checked examples from example tree.
     * 
     * @return list of examples.
     */
    public List<Example> getCheckedExamples() {
        List<Example> result = new ArrayList<Example>();
        Object[] checkedElements = this.treeViewer.getCheckedElements();
        for (Object ob : checkedElements) {
            if (ob instanceof Example) {
                result.add((Example) ob);
            }
        }
        return result;
    }

    /**
     * getter for example description field. It is a browser.
     * 
     * @return Text
     */
    public Text getExampleDescField() {
        return exampleDescField;
    }

}
