/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.ui.sctgenerator

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ChanceMax
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.MinMax
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.Value
import java.util.List
import org.eclipse.jface.dialogs.IMessageProvider
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Group
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text

import static extension java.lang.Double.parseDouble
import static extension java.lang.Integer.parseInt

/**
 * Creates a generic dialog for the SCT Generator.
 * Therefore, for each property a appropriate input mask is created. 
 * Subsequent to user confirmation, the values are written back to their properties.  
 * 
 * @author ssm
 * @kieler.design 2016-06-07 proposed 
 * @kieler.rating 2016-06-07 proposed yellow
 */
class SCTGeneratorDialog extends TitleAreaDialog {

    /** Default dialog width is {@code DIALOG_WIDTH} pixels. */
    private static val DIALOG_WIDTH = (Display.getDefault.getMonitors.get(0).getBounds.width * 0.6) as int 
    
    /** {@code propertyInputs} maps all properties to corresponding {@code Text} SWT widgets. */
    private val propertyInputs = <IProperty<?>, List<Text>>newHashMap

    /**
     * {@inheritDoc}
     */
    new(Shell parentShell) {
        super(parentShell)
        propertyInputs.clear
    }

    /**
     * {@inheritDoc}
     */
    override create() {
        super.create();
        setTitle("SCT Generator");
        setMessage("Specify the generation parameter of the SCT models.", IMessageProvider.INFORMATION);
    }

    /**
     * {@inheritDoc}
     */
    override boolean isResizable() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    override void okPressed() {
        saveInput()
        super.okPressed()
    }    
    
    /**
     * {@inheritDoc}
     */    
    override Control createDialogArea(Composite parent) {
        // Create the parent area widget.
        val area = super.createDialogArea(parent) as Composite
        val composite = new Composite(area, SWT.NONE)
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true) => [ minimumWidth = DIALOG_WIDTH ])
        composite.setLayout(new GridLayout(2, false))
        
        // Retrieve the SCT Generator to query all properties. 
        val generator = SCTGeneratorDialogHandler.getInjector.getInstance(SCTGenerator)
        val categorizedProperties = generator.getCategorizedProperties

        // Create a SWT group for each category.
        for(key : categorizedProperties.keySet) {
            val group = new Group(composite, SWT.NONE)
            group.setText(key.split("\\.").last)
            group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true))
            val layout = new GridLayout(5, false)
            group.setLayout(layout)
            
            // Add corresponding inputs for each property data.
            for(property : categorizedProperties.get(key)) {
                val propertyData = generator.getProperty(property)
                if (propertyData instanceof Value<?>) {
                    propertyInputs.put(property, propertyData.createCountInput(group))
                } else if (propertyData instanceof MinMax<?>) {
                    propertyInputs.put(property, propertyData.createMinMaxInput(group))
                } else if (propertyData instanceof ChanceMax<?, ?>) {
                    propertyInputs.put(property, propertyData.createChanceMaxInput(group))
                }
            }
        }        

        area
    }
    
    /**
     * Save the inputs back to the properties.
     * 
     * @returns void
     */
    protected def void saveInput() {
        // Use the property input list to assign the SWT Text values back to their properties. 
        val generator = SCTGeneratorDialogHandler.getInjector.getInstance(SCTGenerator)
        for(property : propertyInputs.keySet) {
            val propertyData = generator.getProperty(property)
            val propertyInput = propertyInputs.get(property)
            if (propertyData instanceof Value<?>) {
                if (propertyData.value instanceof Integer) {
                    generator.setProperty(property as IProperty<Value<?>>,
                        new Value<Integer>(
                            propertyData.caption, 
                            propertyInput.get(0).text.parseInt
                        )
                    )
                } else if (propertyData.value instanceof Double) {
                    generator.setProperty(property as IProperty<Value<?>>,
                        new Value<Double>(
                            propertyData.caption, 
                            propertyInput.get(0).text.parseDouble
                        )
                    )
                }
            } else if (propertyData instanceof MinMax<?>) {
                generator.setProperty(property as IProperty<MinMax<?>>, 
                    new MinMax<Integer>(
                        propertyData.caption, 
                        propertyInput.get(0).text.parseInt, 
                        propertyInput.get(1).text.parseInt
                    )
                )
            } else if (propertyData instanceof ChanceMax<?, ?>) {
                generator.setProperty(property as IProperty<ChanceMax<?, ?>>, 
                    new ChanceMax<Double, Integer>(
                        propertyData.caption, 
                        propertyInput.get(0).text.parseDouble, 
                        propertyInput.get(1).text.parseInt
                    )
                )
            }
        }
    }
    
    /**
     * Creates an input field for values.
     * 
     * @param data gives an SCT Generator Value property.
     * @param container defines the SWT container.
     * @returns a list of Text widgets.
     */
    protected def List<Text> createCountInput(Value<?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.insertDummy(1)
            it += container.createText(data.value.toString)
            container.insertDummy(2)
        ]
    }    
    
    /**
     * Create input fields for MinMax properties.
     * 
     * @param data gives an SCT Generator MinMax property.
     * @param container defines the SWT container.
     * @returns a list of Text widgets.
     */
    protected def createMinMaxInput(MinMax<?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.createLabel("min")
            it += container.createText(data.min.toString)
            container.createLabel("max")
            it += container.createText(data.max.toString)
        ]
    }

    /**
     * Create input fields for ChanceMax properties.
     * 
     * @param data gives an SCT Generator ChanceMax property.
     * @param container defines the SWT container.
     * @returns a list of Text widgets.
     */    
     protected def createChanceMaxInput(ChanceMax<?, ?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.createLabel("rnd")
            it += container.createText(data.chance.toString)
            container.createLabel("max")
            it += container.createText(data.max.toString)
        ]
    }

    /**
     * Creates a new SWT {@link Label}.
     * 
     * @param container defines the SWT container.
     * @param text holds the text.
     * @returns the newly created {@link Label}.
     */
    private def Label createLabel(Composite container, String text) {
        new Label(container, SWT.NONE) => [
            setText(text)
        ]
    }

    /**
     * Creates a new SWT {@link Text}.
     * 
     * @param container defines the SWT container.
     * @param defaultText holds the initial text.
     * @returns the newly created {@link Text}.
     */
    private def Text createText(Composite container, String defaultText) {
        val data = new GridData()
        data.grabExcessHorizontalSpace = true
        data.horizontalAlignment = GridData.FILL

        var text = new Text(container, SWT.BORDER)
        text.text = defaultText
        text.setLayoutData(data)
        text
    }

    /**
     * Creates one or more dummy SWT element(s) to fill the grid layout. 
     * Therefore, a empty SWT {@link Label} is created.
     * 
     * @param container defines the SWT container.
     * @param count holds the number of dummy elements.
     * @returns the newly created {@link Label}.
     */
    private def insertDummy(Composite container, int count) {
        for (var int i = 0; i < count; i++) {
            new Label(container, SWT.NONE) => [
                setText("")
            ]
        }
    }   

}
