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

import { injectable, inject } from 'inversify'
import { Event, Emitter, DisposableCollection } from '@theia/core'
import { WidgetFactory } from '@theia/core/lib/browser'
import { CompilerWidget, KiCoolViewWidgetFactory, KiCoolSymbolInformationNode } from './compiler-widget'
import { Widget } from '@phosphor/widgets'
import { compilerWidgetId } from '../common';

@injectable()
export class KiCoolViewService implements WidgetFactory {

    id = compilerWidgetId

    protected widget?: CompilerWidget
    protected readonly onDidChangeDiagramOptionsEmitter = new Emitter<KiCoolSymbolInformationNode[]>()
    protected readonly onDidChangeOpenStateEmitter = new Emitter<boolean>()
    protected readonly onDidSelectEmitter = new Emitter<KiCoolSymbolInformationNode>()
    protected readonly onDidOpenEmitter = new Emitter<KiCoolSymbolInformationNode>()

    constructor(@inject(KiCoolViewWidgetFactory) protected factory: KiCoolViewWidgetFactory) { }

    get onDidSelect(): Event<KiCoolSymbolInformationNode> {
        return this.onDidSelectEmitter.event
    }

    get onDidOpen(): Event<KiCoolSymbolInformationNode> {
        return this.onDidOpenEmitter.event
    }

    get onDidChangeDiagramOptions(): Event<KiCoolSymbolInformationNode[]> {
        return this.onDidChangeDiagramOptionsEmitter.event
    }

    get onDidChangeOpenState(): Event<boolean> {
        return this.onDidChangeOpenStateEmitter.event
    }

    get open(): boolean {
        return this.widget !== undefined && this.widget.isVisible
    }

    createWidget(): Promise<Widget> {
        this.widget = this.factory()
        const disposables = new DisposableCollection()
        disposables.push(this.widget.onDidChangeOpenStateEmitter.event(open => this.onDidChangeOpenStateEmitter.fire(open)))
        disposables.push(this.widget.model.onOpenNode(node => this.onDidOpenEmitter.fire(node as KiCoolSymbolInformationNode)))
        disposables.push(this.widget.model.onSelectionChanged(selection => this.onDidSelectEmitter.fire(selection[0] as KiCoolSymbolInformationNode)))
        this.widget.disposed.connect(() => {
            this.widget = undefined
            disposables.dispose()
        })
        return Promise.resolve(this.widget)
    }
}