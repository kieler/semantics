/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 *
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

import { injectable } from 'inversify'
import { Message, ReactWidget } from '@theia/core/lib/browser'
import { Emitter } from '@theia/core'
import { Event } from '@theia/core/lib/common'
import { SynthesisOption, TransformationOptionType } from '../common/option-models'
import { isNullOrUndefined } from 'util'
import * as React from 'react'

@injectable()
export class DiagramOptionsViewWidget extends ReactWidget {
    public static widgetId = 'diagramoptions-view'

    readonly onDidChangeOpenStateEmitter = new Emitter<boolean>()
    private synthesisOptions: SynthesisOption[]
    public sourceModelPath: string
    public hasContent: boolean
    private categoryMap: Map<string, SynthesisOption[]> = new Map

    constructor(
    ) {
        super()

        this.id = DiagramOptionsViewWidget.widgetId
        this.title.label = 'Diagram Options'
        this.addClass('theia-diagramoptions-view')
        // TODO: add this.update?
    }

    public setDiagramOptions(options: SynthesisOption[]): void {
        this.synthesisOptions = options
        this.update()
    }

    public getDiagramOptions(): SynthesisOption[] {
        return this.synthesisOptions
    }

    protected onUpdateRequest(msg: Message): void {
        super.onUpdateRequest(msg)
    }

    protected render(): JSX.Element {
        if (isNullOrUndefined(this.synthesisOptions)) {
            this.hasContent = false
            // TODO: add a button to update the view!
            return <div>
                {'Diagram options are not loaded yet. Please open a diagram first and then open or update this view.'}
            </div>
        } else {
            this.hasContent = true
            return this.renderOptions(this.synthesisOptions)
        }
    }

    /**
     * Renders the options, it is assumed that the options are ordered in a way
     * that the category for each option comes before its correspoding options.
     * @param synthesisOptions options for diagram synthesis
     */
    private renderOptions(synthesisOptions: SynthesisOption[]): JSX.Element {
        this.categoryMap.clear()
        let children: JSX.Element[] = []
        let optionsToRender: SynthesisOption[] = []
        // add all options to their categories
        synthesisOptions.forEach(option => {
            if (option.type === TransformationOptionType.CATEGORY) {
                this.categoryMap.set(option.name, [])
                if (option.category) {
                    let list = this.categoryMap.get(option.category.name)
                    if (list) {
                        list.push(option)
                    }
                } else {
                    optionsToRender.push(option)
                }
            } else {
                if (option.category) {
                    let list = this.categoryMap.get(option.category.name)
                    if (list) {
                        list.push(option)
                    }
                } else {
                    optionsToRender.push(option)
                }
            }
        })
        // render all top level options
        optionsToRender.forEach(option => {
            switch (option.type) {
                case TransformationOptionType.CHECK: {
                    children.push(this.renderCheck(option))
                    break
                }
                case TransformationOptionType.CHOICE: {
                    children.push(this.renderChoice(option))
                    break
                }
                case TransformationOptionType.RANGE: {
                    // TODO: implement
                    break
                }
                case TransformationOptionType.SEPARATOR: {
                    // TODO: implement
                    break
                }
                case TransformationOptionType.CATEGORY: {
                    const list = this.categoryMap.get(option.name)
                    if (list) {
                        children.push(this.renderCategory(option.name, list))
                    }
                    break
                }
            }
        })
        return <div>{...children}</div>
    }

    private renderCategory(name: string, synthesisOptions: SynthesisOption[]): JSX.Element {
        return <div>
            <details>
                <summary>{name}</summary>
                {this.renderCategoryOptions(synthesisOptions)}
            </details>
        </div>
    }

    private renderCategoryOptions(options: SynthesisOption[]): JSX.Element {
        let children: JSX.Element[] = []
        options.forEach(option => {
            switch (option.type) {
                case TransformationOptionType.CHECK: {
                    children.push(this.renderCheck(option))
                    break
                }
                case TransformationOptionType.CHOICE: {
                    children.push(this.renderChoice(option))
                    break
                }
                case TransformationOptionType.RANGE: {
                    // TODO: implement
                    break
                }
                case TransformationOptionType.SEPARATOR: {
                    // TODO: implement
                    break
                }
                case TransformationOptionType.CATEGORY: {
                    const list = this.categoryMap.get(option.name)
                    if (list) {
                        children.push(this.renderCategory(option.name, list))
                    }
                    break
                }
            }
        })
        return <div>{...children}</div>
    }

    /**
     * Renders a check SynthesisOption as a HTML checkbox
     * @param option The ckeck option to render
     */
    private renderCheck(option: SynthesisOption): JSX.Element { // TODO: remove inputAttrs in renderChoiceValue
        const currentValue = option.currentValue
        let inputAttrs = {
            type: "checkbox",
            id: option.name,
            name: option.name,
            defaultChecked: currentValue,
            onClick: (e: React.MouseEvent) => this.onCheck(e, option)
        }

        return <div key = {option.name}>
            <input {...inputAttrs}/>
            <label htmlFor = {option.name}>{option.name}</label>
        </div>
    }

    private onCheck(event: React.MouseEvent, option: SynthesisOption) {
        option.currentValue = (event.currentTarget as HTMLInputElement).checked
        this.sendNewOptions()
    }

    private onChoice(option: SynthesisOption, value: any) {
        option.currentValue = value
        this.sendNewOptions()
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg)
        this.onUpdateRequest(msg)
    }

    protected readonly onSendNewOptionsEmitter = new Emitter<DiagramOptionsViewWidget | undefined>()

    /**
     * Emit when options have been changed.
     */
    readonly onSendNewOptions: Event<DiagramOptionsViewWidget | undefined> = this.onSendNewOptionsEmitter.event

    public sendNewOptions(): void {
        this.onSendNewOptionsEmitter.fire(this)
    }

    /**
     * Returns a JSX element containing a choice SynthesisOption as a HTML fieldset with multiple radio buttons.
     *
     * @param option The choice option to generate
     */
    private renderChoice(option: SynthesisOption): JSX.Element {
        return <fieldset key = {option.name}>
            <legend>{option.name}</legend>
            {option.values.map(value => this.renderChoiceValue(value, option))}
        </fieldset>
    }

    /**
     * Returns a JSX Element as a radio button input containing to a choice option
     *
     * @param value The value of the choice option.
     * @param option The option this radio button belongs to.
     */
    private renderChoiceValue(value: any, option: SynthesisOption): JSX.Element {
        return <div key = {value}>
            <input
                type = "radio"
                id = {value}
                name = {option.name}
                defaultChecked = {value === option.currentValue}
                onClick = {e => this.onChoice(option, value)}
            />
            <label htmlFor = {value}/>
            {value}
        </div>
    }
}