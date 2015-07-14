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
package de.cau.cs.kieler.kex.model;

import org.eclipse.core.runtime.Assert;

/**
 * The example category model.
 * 
 * @author pkl
 * 
 */
public class Category {

    private String id;

    private String title;

    private String description;

    private String iconPath;

    private String parentId;

    private String namespaceId;

    /**
     * creates a new example category.
     * 
     * @param idParam
     *            , {@link String}, required.
     * @param titleParam
     *            , {@link String}, required.
     * @param descriptionParam
     *            , {@link String}, additional.
     * @param iconPathParam
     *            , {@link String}, additional.
     * @param parentIdParam
     *            , {@link Category}, set the parent category if that category is a sub category a
     *            parent category.
     */
    public Category(final String idParam, final String titleParam, final String descriptionParam,
            final String iconPathParam, final String parentIdParam) {
        Assert.isNotNull(idParam);
        Assert.isNotNull(titleParam);
        setId(idParam);
        setTitle(titleParam);
        setDescription(descriptionParam);
        setIconPath(iconPathParam);
        setParentId(parentIdParam);
    }

    private void setId(final String idParam) {
        this.id = idParam;
    }

    /**
     * Getter for category id.
     * 
     * @return {@link String}
     */
    public String getId() {
        return id;
    }

    private void setTitle(final String titleParam) {
        this.title = titleParam;
    }

    /**
     * Getter for category title.
     * 
     * @return {@link String}
     */
    public String getTitle() {
        return title;
    }

    private void setIconPath(final String iconPathParam) {
        this.iconPath = iconPathParam;
    }

    /**
     * Getter for category icon path.
     * 
     * @return {@link String}
     */
    public String getIconPath() {
        return iconPath;
    }

    private void setParentId(final String parentIdParam) {
        this.parentId = parentIdParam;
    }

    /**
     * Getter for category parent id.
     * 
     * @return {@link String}
     */
    public String getParentId() {
        return parentId;
    }

    private void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    /**
     * Getter for category description.
     * 
     * @return String
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("Category [id= ").append(id).append(", title= ")
                .append(title).append("]").toString();
    }

    /**
     * Setter for namespace id of an example.
     * 
     * @param namespaceId
     *            , String
     */
    public void setNamespaceId(final String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * Getter for namespaceId.
     * 
     * @return String
     */
    public String getNamespaceId() {
        return namespaceId;
    }

}
