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
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import java.util.HashMap
import java.util.List
import org.eclipse.jface.dialogs.IMessageProvider
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.xtend.lib.annotations.Accessors

import static extension java.lang.Double.*
import static extension java.lang.Integer.*
import org.eclipse.swt.widgets.Group

/**
 * @author ssm
 * 
 */
class SCTGeneratorDialog extends TitleAreaDialog {

    private var Text txtNumberOfModels
    private var Text txtNumberOfStatesMin
    private var Text txtNumberOfStatesMax
    private var Text txtChanceForNewTransition
    private var Text txtMaxTransitions
    private var Text txtChanceForImmediate
    private var Text txtChanceForSuperstate
    private var Text txtMaxHierarchyDepth
    private var Text txtNumberOfInputsMin
    private var Text txtNumberOfInputsMax
    private var Text txtNumberOfOutputsMin
    private var Text txtNumberOfOutputsMax
    private var Text txtChanceForConcurrency
    private var Text txtMaxConcurrency     
    private var Text txtMaxExpressionDepth
    private var Text txtChanceForExpressions
    
    @Accessors private var int numberOfModels
    @Accessors private var int numberOfStatesMin
    @Accessors private var int numberOfStatesMax
    @Accessors private var double chanceForNewTransition
    @Accessors private var int maxTransitions
    @Accessors private var double chanceForImmediate
    @Accessors private var double chanceForSuperstate
    @Accessors private var int maxHierarchyDepth
    @Accessors private var int numberOfInputsMin
    @Accessors private var int numberOfInputsMax
    @Accessors private var int numberOfOutputsMin
    @Accessors private var int numberOfOutputsMax
    @Accessors private var double chanceForConcurrency
    @Accessors private var int maxConcurrency
    @Accessors private var int maxExpressionDepth
    @Accessors private var double chanceForExpressions
    

    new(Shell parentShell) {
        super(parentShell)
    }

    override create() {
        super.create();
        setTitle("SCT Generator");
        setMessage("Specify the generation parameter of the SCT models.", IMessageProvider.INFORMATION);
    }

    override Control createDialogArea(Composite parent) {
        val area = super.createDialogArea(parent) as Composite
        
        val injector = SCTGeneratorDialogHandler.getInjector
        val generator = injector.getInstance(typeof(SCTGenerator));
        val HashMap<String, List<IProperty<?>>> tabbedProperties = generator.getTabbedProperties

        for(key : tabbedProperties.keySet) {
//            val container = new Composite(area, SWT.NONE)
            val container = new Group(area, SWT.NONE)
            container.setText(key.split("\\.").last)
            container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true))
            val layout = new GridLayout(5, false)
            container.setLayout(layout)
        }        

        area
    }

    private def void createNumberOfModels(Composite container) {
        container.createLabel("Number of models")
        container.insertDummy(1)
        txtNumberOfModels = container.createText("10")
        container.insertDummy(2)
    }

    private def void createNumberOfStates(Composite container) {
        container.createLabel("Number of states")

        container.createLabel("min")
        txtNumberOfStatesMin = container.createText("3")
        container.createLabel("max")
        txtNumberOfStatesMax = container.createText("15")
    }

    private def void createChanceForSuperstate(Composite container) {
        container.createLabel("Chance for superstate")
        container.createLabel("rnd")
        txtChanceForSuperstate = container.createText("0.1")
        container.createLabel("max")
        txtMaxHierarchyDepth = container.createText("3")
    }

    private def void createChanceForConcurrency(Composite container) {
        container.createLabel("Chance for concurrency")
        container.createLabel("rnd")
        txtChanceForConcurrency = container.createText("0.1")
        container.createLabel("max")
        txtMaxConcurrency = container.createText("3")
    }

    private def void createNumberOfTransitions(Composite container) {
        container.createLabel("Chance for new transitions")

        container.createLabel("rnd")
        txtChanceForNewTransition = container.createText("0.2")
        container.createLabel("max")
        txtMaxTransitions = container.createText("3")
    }

    private def void createChanceForImmediate(Composite container) {
        container.createLabel("Chance for immediate")
        container.insertDummy(1)
        txtChanceForImmediate = container.createText("0.25")
        container.insertDummy(2)
    }

    private def void createNumberOfInputs(Composite container) {
        container.createLabel("Number of inputs")

        container.createLabel("min")
        txtNumberOfInputsMin = container.createText("1")
        container.createLabel("max")
        txtNumberOfInputsMax = container.createText("4")
    }

    private def void createNumberOfOutputs(Composite container) {
        container.createLabel("Number of outputs")

        container.createLabel("min")
        txtNumberOfOutputsMin = container.createText("1")
        container.createLabel("max")
        txtNumberOfOutputsMax = container.createText("2")
    }
    
    private def void createMaxExpressionDepth(Composite container) {
        container.createLabel("Chance for expressions")
        container.createLabel("rnd")
        txtChanceForExpressions = container.createText("0.25")
        container.createLabel("max")
        txtMaxExpressionDepth = container.createText("3")
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

    @Override
    override boolean isResizable() {
        return true;
    }

    private def void saveInput() {
        this.numberOfModels = txtNumberOfModels.text.parseInt
        this.numberOfStatesMin = txtNumberOfStatesMin.text.parseInt
        this.numberOfStatesMax = txtNumberOfStatesMax.text.parseInt
        this.chanceForNewTransition = txtChanceForNewTransition.text.parseDouble
        this.maxTransitions = txtMaxTransitions.text.parseInt
        this.chanceForImmediate = txtChanceForImmediate.text.parseDouble
        this.chanceForSuperstate = txtChanceForSuperstate.text.parseDouble
        this.maxHierarchyDepth = txtMaxHierarchyDepth.text.parseInt
        this.numberOfInputsMin = txtNumberOfInputsMin.text.parseInt
        this.numberOfInputsMax = txtNumberOfInputsMax.text.parseInt
        this.numberOfOutputsMin = txtNumberOfOutputsMin.text.parseInt
        this.numberOfOutputsMax = txtNumberOfInputsMax.text.parseInt
        this.chanceForConcurrency = txtChanceForConcurrency.text.parseDouble
        this.maxConcurrency = txtMaxConcurrency.text.parseInt
        this.maxExpressionDepth = txtMaxExpressionDepth.text.parseInt
        this.chanceForExpressions = txtChanceForExpressions.text.parseDouble
    }

    override void okPressed() {
        saveInput()
        super.okPressed()
    }


}
