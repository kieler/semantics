/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
import java.util.HashMap
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
import static extension java.lang.Integer.parseInt
import static extension java.lang.Double.parseDouble

/**
 * @author ssm
 * 
 */
class SCTGeneratorDialog extends TitleAreaDialog {

    private static val DIALOG_WIDTH = (Display.getDefault.getMonitors.get(0).getBounds.width * 0.66) as int 
    
    private val propertyInputs = <IProperty<?>, List<Text>>newHashMap

    new(Shell parentShell) {
        super(parentShell)
        propertyInputs.clear
    }

    override create() {
        super.create();
        setTitle("SCT Generator");
        setMessage("Specify the generation parameter of the SCT models.", IMessageProvider.INFORMATION);
    }

    override boolean isResizable() {
        return true;
    }

    override void okPressed() {
        saveInput()
        super.okPressed()
    }    
    
    override Control createDialogArea(Composite parent) {
        val area = super.createDialogArea(parent) as Composite
        val composite = new Composite(area, SWT.NONE)
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true) => [ minimumWidth = DIALOG_WIDTH ])
        composite.setLayout(new GridLayout(2, false))
        
        val generator = SCTGeneratorDialogHandler.getInjector.getInstance(SCTGenerator)
        val HashMap<String, List<IProperty<?>>> tabbedProperties = generator.getTabbedProperties

        for(key : tabbedProperties.keySet) {
            val group = new Group(composite, SWT.NONE)
            group.setText(key.split("\\.").last)
            group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true))
            val layout = new GridLayout(5, false)
            group.setLayout(layout)
            
            for(property : tabbedProperties.get(key)) {
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
    
    
    private def void saveInput() {
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

    
    
    private def createCountInput(Value<?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.insertDummy(1)
            it += container.createText(data.value.toString)
            container.insertDummy(2)
        ]
    }    
    
    private def createMinMaxInput(MinMax<?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.createLabel("min")
            it += container.createText(data.min.toString)
            container.createLabel("max")
            it += container.createText(data.max.toString)
        ]
    }

    private def createChanceMaxInput(ChanceMax<?, ?> data, Composite container) {
        <Text>newLinkedList => [
            container.createLabel(data.caption) 
            container.createLabel("rnd")
            it += container.createText(data.chance.toString)
            container.createLabel("max")
            it += container.createText(data.max.toString)
        ]
    }

    private def createLabel(Composite container, String text) {
        val lbtDummy = new Label(container, SWT.NONE)
        lbtDummy.setText(text)
    }

    private def Text createText(Composite container, String defaultText) {
        val data = new GridData()
        data.grabExcessHorizontalSpace = true
        data.horizontalAlignment = GridData.FILL

        var text = new Text(container, SWT.BORDER)
        text.text = defaultText
        text.setLayoutData(data)
        text
    }

    private def insertDummy(Composite container, int count) {
        for (var int i = 0; i < count; i++) {
            val lbtDummy = new Label(container, SWT.NONE);
            lbtDummy.setText("")
        }
    }   

}
