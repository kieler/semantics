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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.Assert;

/**
 * The mainmodel class of KEX. This model has all attributes for an KEX example.
 * 
 * @author pkl
 * 
 */
public class Example {

    private final Date generationDate = Calendar.getInstance().getTime();

    private final List<ExampleResource> resources = new ArrayList<ExampleResource>();

    private String id;

    private String title;

    private String categoryId;

    private SourceType sourceType;

    private String description;

    private String contact;

    private String author;

    private String namespaceId;

    private String rootDir;

    private String overviewPic;

    private Boolean isProject;

    /**
     * Creates a new example model.
     * 
     * @param id
     *            , {@link String}
     * @param title
     *            , {@link String}
     * @param categoryId
     *            , {@link Category}
     * @param sourceTypeParam
     *            , {@link SourceType}
     */
    public Example(final String id, final String title, final String categoryId,
            final SourceType sourceTypeParam) {
        Assert.isNotNull(id);
        Assert.isNotNull(title);
        Assert.isNotNull(categoryId);
        Assert.isNotNull(sourceTypeParam);
        setId(id);
        setTitle(title);
        setCategoryId(categoryId);
        setSourceType(sourceTypeParam);
    }

    @Override
    public String toString() {
        return new StringBuffer().append("Example [id= ").append(getId()).append(", title= ")
                .append(getTitle()).append(", category= ").append(getCategoryId())
                .append(", source type= ").append(SourceType.map(this.getSourceType()))
                .append(", contact= ").append(getContact()).append(", author= ")
                .append(getAuthor()).append(", generated at= ")
                .append(getGenerationDate().toString()).append(", description= ")
                .append(getDescription()).append("]").toString();
    }

    /**
     * Searches for a category.
     * 
     * @param categoryIdParam
     *            , {@link String}
     * @return boolean
     */
    public boolean contains(final String categoryIdParam) {
        if (getCategoryId().equals(categoryIdParam)) {
            return true;
        }
        return false;
    }

    /**
     * Getter for generationdate.
     * 
     * @return {@link Date}
     */
    public Date getGenerationDate() {
        return this.generationDate;
    }

    /**
     * Getter for sourcetype.
     * 
     * @return {@link SourceType}
     */
    public SourceType getSourceType() {
        return this.sourceType;
    }

    private void setSourceType(final SourceType sourceTypeParam) {
        this.sourceType = sourceTypeParam;
    }

    /**
     * adds new example resources to example.
     * 
     * @param exampleResources
     *            {@link List} of {@link ExampleResource}s
     */
    public void addResources(final List<ExampleResource> exampleResources) {
        this.resources.addAll(exampleResources);
    }

    /**
     * Getter for example resources.
     * 
     * @return {@link List} of {@link ExampleResource}s
     */
    public List<ExampleResource> getResources() {
        return resources;
    }

    /**
     * Setter for example description.
     * 
     * @param descriptionParam
     *            , {@link String}
     */
    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    /**
     * Getter for example description.
     * 
     * @return {@link String}
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter for contact.
     * 
     * @return {@link String}
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * Setter for example contact.
     * 
     * @param contactParam
     *            , {@link String}
     */
    public void setContact(final String contactParam) {
        this.contact = contactParam;
    }

    /**
     * Setter for example namespaceId.
     * 
     * @param namespaceIdParam
     *            , {@link String}
     */
    public void setNamespaceId(final String namespaceIdParam) {
        this.namespaceId = namespaceIdParam;
    }

    /**
     * Getter for example namespace id.
     * 
     * @return {@link String}
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * Setter for example root directory.
     * 
     * @param rootDirParam
     *            , {@link String}
     */
    public void setRootDir(final String rootDirParam) {
        this.rootDir = rootDirParam;
    }

    /**
     * Getter for root directory.
     * 
     * @return {@link String}
     */
    public String getRootDir() {
        return this.rootDir;
    }

    /**
     * Setter for example author.
     * 
     * @param authorParam
     *            , {@link String}
     */
    public void setAuthor(final String authorParam) {
        this.author = authorParam;
    }

    /**
     * Getter for example author.
     * 
     * @return {@link String}
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for example overviewPic.
     * 
     * @param overviewPicParam
     *            , {@link String}
     */
    public void setOverviewPic(final String overviewPicParam) {
        this.overviewPic = overviewPicParam;
    }

    /**
     * Getter for example overview picture.
     * 
     * @return {@link String}
     */
    public String getOverviewPic() {
        return overviewPic;
    }

    /**
     * checks if the example resources contains a project.
     * 
     * @return boolean
     */
    public boolean isProject() {
        // should only be loaded one time.
        if (isProject == null) {
            for (ExampleResource resource : resources) {
                if (ExampleResource.Type.PROJECT == resource.getResourceType()) {
                    isProject = Boolean.valueOf(true);
                    return isProject;
                }
            }
            isProject = Boolean.valueOf(false);
            return isProject;
        } else {
            return isProject;
        }

    }

    private void setId(final String idParam) {
        this.id = idParam;
    }

    /**
     * Getter for example id.
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
     * Getter for example title.
     * 
     * @return {@link String}
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for example categoryId.
     * 
     * @return {@link String}
     */
    public String getCategoryId() {
        return categoryId;
    }

    private void setCategoryId(final String categoryIdParam) {
        this.categoryId = categoryIdParam;
    }

}
