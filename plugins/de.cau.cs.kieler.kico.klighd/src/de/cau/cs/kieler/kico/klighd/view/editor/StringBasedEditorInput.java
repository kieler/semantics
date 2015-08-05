/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.editor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

/**
 * Editor Input which can handle Strings as editor input without a file in as resource. If content
 * should be persisted 'Save as' option should be used.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class StringBasedEditorInput implements IStorageEditorInput {

    class StringStorage implements IStorage {
        /** String content. */
        protected String content;
        /** Read only flag. */
        private boolean readOnly;

        /** The resource extension. */
        private String resourceExtension;

        /**
         * Standard Constructor
         * 
         * @param content
         *            string content
         * @param readonly
         *            if editing should be enabled before saving
         */
        public StringStorage(String content, boolean readOnly, String resourceExtension) {
            super();
            this.content = content;
            this.readOnly = readOnly;
            this.resourceExtension = resourceExtension;
        }

        /**
         * {@inheritDoc}
         */
        public InputStream getContents() throws CoreException {
            return new ByteArrayInputStream(content.getBytes());
        }

        /**
         * {@inheritDoc}
         */
        public IPath getFullPath() {
            String num = (this.hashCode() + "").replace("-", "");
            // URI uri = URI.createURI("dummy:/inmemory." + num + "." + resourceExtension);
            IPath path = new Path("dummy:/inmemory/" + num + "." + resourceExtension);
            return path;
        }

        /**
         * {@inheritDoc}
         */
        public Object getAdapter(Class adapter) {
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public String getName() {
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isReadOnly() {
            return readOnly;
        }

        /**
         * {@inheritDoc}
         */
        public boolean equals(Object obj) {
            if (obj instanceof StringStorage) {
                return ((StringStorage) obj).content.equals(content);
            }
            return false;
        }
    }

    /** Editor title. */
    private final String name;
    /** Editor tooltip. */
    private final String tooltip;
    /** Editor string content storage. */
    private final StringStorage storage;

    /**
     * Constructs editor input with given name.
     * 
     * @param name
     *            title text maybe null
     * @param tooltip
     *            tooltip text maybe null
     * @param content
     *            content
     * @param readonly
     *            if editing should be enabled before saving
     */
    public StringBasedEditorInput(String name, String tooltip, String content, boolean readonly,
            String resourceExtension) {
        this.name = name == null ? "Anonymous" : name;
        this.tooltip = tooltip == null ? "" : tooltip;
        this.storage = new StringStorage(content, readonly, resourceExtension);
    }

    /**
     * {@inheritDoc}
     */
    public boolean exists() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public ImageDescriptor getImageDescriptor() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    public IPersistableElement getPersistable() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public IStorage getStorage() {
        return storage;
    }

    /**
     * {@inheritDoc}
     */
    public String getToolTipText() {
        return tooltip;
    }

    /**
     * {@inheritDoc}
     */
    public Object getAdapter(Class adapter) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(Object obj) {
        if (obj instanceof StringBasedEditorInput) {
            return ((StringBasedEditorInput) obj).storage.equals(storage);
        }
        return false;
    }

}
