/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.properties;

import java.text.MessageFormat;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;

/**
 * @author delphino
 * 
 */
public abstract class EditableDialogCellEditor extends TextCellEditor {

    /**
     * Image registry key for three dot image (value <code>"cell_editor_dots_button_image"</code>).
     */
    public static final String CELL_EDITOR_IMG_DOTS_BUTTON = "cell_editor_dots_button_image";//$NON-NLS-1$

    /**
     * The editor control.
     */
    private Composite editor;

    /** The opening dialog. */
    private boolean openingDialog = false;

    /**
     * The current contents.
     */
    private Control contents;


    /** The is editable. */
    protected boolean isEditable = true;

    /**
     * The button.
     */
    private Button button;

    /**
     * Listens for 'focusLost' events and fires the 'apply' event as long as the focus wasn't lost
     * because the dialog was opened.
     */
    private FocusListener buttonFocusListener;

    /**
     * The value of this cell editor; initially <code>null</code>.
     */
    private Object value = null;

    static {
        ImageRegistry reg = JFaceResources.getImageRegistry();
        reg.put(CELL_EDITOR_IMG_DOTS_BUTTON,
                ImageDescriptor.createFromFile(DialogCellEditor.class, "images/dots_button.gif"));//$NON-NLS-1$
    }

    /**
     * Internal class for laying out the dialog.
     */
    private class DialogCellLayout extends Layout {
        public void layout(Composite editor, boolean force) {
            Rectangle bounds = editor.getClientArea();
            Point size = button.computeSize(SWT.DEFAULT, SWT.DEFAULT, force);
            if (contents != null) {
                contents.setBounds(0, 0, bounds.width - size.x, bounds.height);
            }
            button.setBounds(bounds.width - size.x, 0, size.x, bounds.height);
        }

        public Point computeSize(Composite editor, int wHint, int hHint, boolean force) {
            if (wHint != SWT.DEFAULT && hHint != SWT.DEFAULT) {
                return new Point(wHint, hHint);
            }
            Point contentsSize = contents.computeSize(SWT.DEFAULT, SWT.DEFAULT, force);
            Point buttonSize = button.computeSize(SWT.DEFAULT, SWT.DEFAULT, force);
            // Just return the button width to ensure the button is not clipped
            // if the label is long.
            // The label will just use whatever extra width there is
            Point result = new Point(buttonSize.x, Math.max(contentsSize.y, buttonSize.y));
            return result;
        }
    }

    /**
     * Default DialogCellEditor style
     */
    private static final int defaultStyle = SWT.NONE;

    /**
     * Creates a new dialog cell editor with no control
     * 
     * @since 2.1
     */
    public EditableDialogCellEditor(boolean isEditableParam) {
        this.isEditable = isEditableParam;
        setStyle(defaultStyle);
    }

    /**
     * Creates a new dialog cell editor parented under the given control. The cell editor value is
     * <code>null</code> initially, and has no validator.
     * 
     * @param parent
     *            the parent control
     */
    protected EditableDialogCellEditor(Composite parent, boolean isEditableParam) {
        this(parent, defaultStyle, isEditableParam);
    }

    /**
     * Creates a new dialog cell editor parented under the given control. The cell editor value is
     * <code>null</code> initially, and has no validator.
     * 
     * @param parent
     *            the parent control
     * @param style
     *            the style bits
     * @since 2.1
     */
    protected EditableDialogCellEditor(Composite parent, int style, boolean isEditableParam) {
        this.isEditable = isEditableParam;
//        super(parent, style);
        super.setStyle(style);
        create(parent);
    }

    /**
     * Creates the button for this cell editor under the given parent control.
     * <p>
     * The default implementation of this framework method creates the button display on the right
     * hand side of the dialog cell editor. Subclasses may extend or reimplement.
     * </p>
     * 
     * @param parent
     *            the parent control
     * @return the new button control
     */
    protected Button createButton(Composite parent) {
        Button result = new Button(parent, SWT.DOWN);
        result.setText("..."); //$NON-NLS-1$
        return result;
    }


    /*
     * (non-Javadoc) Method declared on CellEditor.
     */
    protected Control createControl(Composite parent) {

        Font font = parent.getFont();
        Color bg = parent.getBackground();

        editor = new Composite(parent, getStyle());
        editor.setFont(font);
        editor.setBackground(bg);
        editor.setLayout(new DialogCellLayout());

        if (isEditable) {
            // use text editor instead of label
            contents = super.createControl(editor);
        } else {
            contents = super.createControl(editor);
            text.setEditable(false);
            //contents = createContents(editor);
        }
        updateContents(value);

        button = createButton(editor);
        button.setFont(font);

        button.addKeyListener(new KeyAdapter() {
            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.KeyListener#keyReleased(org.eclipse.swt.events.KeyEvent)
             */
            public void keyReleased(KeyEvent e) {
                if (e.character == '\u001b') { // Escape
                    fireCancelEditor();
                }
            }
        });

        button.addSelectionListener(new SelectionAdapter() {
            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.
             * SelectionEvent)
             */
            public void widgetSelected(SelectionEvent event) {
                openingDialog = true;

                // Remove the button's focus listener since it's guaranteed
                // to lose focus when the dialog opens
                button.removeFocusListener(getButtonFocusListener());

                Object newValue = openDialogBox(editor);

                // Re-add the listener once the dialog closes
                button.addFocusListener(getButtonFocusListener());

                if (newValue != null) {
                    boolean newValidState = isCorrect(newValue);
                    if (newValidState) {
                        markDirty();
                        doSetValue(newValue);
                    } else {
                        // try to insert the current value into the error message.
                        setErrorMessage(MessageFormat.format(getErrorMessage(),
                                new Object[] { newValue.toString() }));
                    }
                    openingDialog = false;
                    fireApplyEditorValue();
                }
            }
        });

        setValueValid(true);

        doSetFocus();

        return editor;
    }

    /*
     * (non-Javadoc)
     * 
     * Override in order to remove the button's focus listener if the celleditor is deactivating.
     * 
     * @see org.eclipse.jface.viewers.CellEditor#deactivate()
     */
    public void deactivate() {
        if (button != null && !button.isDisposed()) {
            button.removeFocusListener(getButtonFocusListener());
        }
        if (text != null) {
            super.deactivate();

        }
    }

    /*
     * (non-Javadoc) Method declared on CellEditor.
     */
    protected Object doGetValue() {
        return text.getText();
    }

    /*
     * (non-Javadoc) Method declared on CellEditor. The focus is set to the cell editor's button.
     */
    protected void doSetFocus() {
        if (text != null) {
            super.doSetFocus();
        }

        // add a FocusListener to the button
        button.addFocusListener(getButtonFocusListener());
    }

    /**
     * Return a listener for button focus.
     * 
     * @return FocusListener
     */
    private FocusListener getButtonFocusListener() {
        if (buttonFocusListener == null) {
            buttonFocusListener = new FocusListener() {

                /*
                 * (non-Javadoc)
                 * 
                 * @see
                 * org.eclipse.swt.events.FocusListener#focusGained(org.eclipse.swt.events.FocusEvent
                 * )
                 */
                public void focusGained(FocusEvent e) {
                    // Do nothing
                }

                /*
                 * (non-Javadoc)
                 * 
                 * @see
                 * org.eclipse.swt.events.FocusListener#focusLost(org.eclipse.swt.events.FocusEvent)
                 */
                public void focusLost(FocusEvent e) {
                    EditableDialogCellEditor.this.focusLost();
                }
            };
        }

        return buttonFocusListener;
    }

    /*
     * (non-Javadoc) Method declared on CellEditor.
     */
    protected void doSetValue(Object value) {
        this.value = value;
        updateContents(value);
        if (text != null) {
            super.doSetValue(value);
        }
    }

    /**
     * Processes a focus lost event that occurred in this cell editor.
     * <p>
     * The default implementation of this framework method applies the current value and deactivates
     * the cell editor. Subclasses should call this method at appropriate times. Subclasses may also
     * extend or reimplement.
     * </p>
     */
    protected void focusLost() {
        if (isActivated() && !openingDialog) {
            System.out.println("fireApplyEditorValue()");
            if (text == null) {
                 fireApplyEditorValue();
                 deactivate();
            }
        }
    }

    /**
     * Opens a dialog box under the given parent control and returns the dialog's value when it
     * closes, or <code>null</code> if the dialog was canceled or no selection was made in the
     * dialog.
     * <p>
     * This framework method must be implemented by concrete subclasses. It is called when the user
     * has pressed the button and the dialog box must pop up.
     * </p>
     * 
     * @param cellEditorWindow
     *            the parent control cell editor's window so that a subclass can adjust the dialog
     *            box accordingly
     * @return the selected value, or <code>null</code> if the dialog was canceled or no selection
     *         was made in the dialog
     */
    protected abstract Object openDialogBox(Control cellEditorWindow);

    /**
     * Updates the controls showing the value of this cell editor.
     * <p>
     * The default implementation of this framework method just converts the passed object to a
     * string using <code>toString</code> and sets this as the text of the label widget.
     * </p>
     * <p>
     * Subclasses may reimplement. If you reimplement this method, you should also reimplement
     * <code>createContents</code>.
     * </p>
     * 
     * @param value
     *            the new value of this cell editor
     */
    protected void updateContents(Object value) {

        String text = "";//$NON-NLS-1$
        if (value != null) {
            text = value.toString();
        }
        if (this.text != null) {
            this.text.setText(text);
            this.text.update();
            this.text.redraw();
        }
    }

}
