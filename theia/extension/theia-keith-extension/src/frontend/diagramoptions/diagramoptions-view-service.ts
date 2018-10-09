// import { injectable, inject } from 'inversify'
// import { Event, Emitter, DisposableCollection } from '@theia/core'
// import { WidgetFactory } from '@theia/core/lib/browser'
// import { DiagramOptionsViewWidget, DiagramOptionsViewWidgetFactory, DiagramOptionsSymbolInformationNode } from './diagramoptions-view-widget'
// import { Widget } from '@phosphor/widgets'

// @injectable()
// export class DiagramOptionsViewService implements WidgetFactory {

//     id = 'diagramoptions-view'

//     protected widget?: DiagramOptionsViewWidget
//     protected readonly onDidChangeDiagramOptionsEmitter = new Emitter<DiagramOptionsSymbolInformationNode[]>()
//     protected readonly onDidChangeOpenStateEmitter = new Emitter<boolean>()
//     protected readonly onDidSelectEmitter = new Emitter<DiagramOptionsSymbolInformationNode>()
//     protected readonly onDidOpenEmitter = new Emitter<DiagramOptionsSymbolInformationNode>()

//     constructor(@inject(DiagramOptionsViewWidgetFactory) protected factory: DiagramOptionsViewWidgetFactory) { }

//     get onDidSelect(): Event<DiagramOptionsSymbolInformationNode> {
//         return this.onDidSelectEmitter.event
//     }

//     get onDidOpen(): Event<DiagramOptionsSymbolInformationNode> {
//         return this.onDidOpenEmitter.event
//     }

//     get onDidChangeDiagramOptions(): Event<DiagramOptionsSymbolInformationNode[]> {
//         return this.onDidChangeDiagramOptionsEmitter.event
//     }

//     get onDidChangeOpenState(): Event<boolean> {
//         return this.onDidChangeOpenStateEmitter.event
//     }

//     get open(): boolean {
//         return this.widget !== undefined && this.widget.isVisible
//     }

//     // publish(roots: DiagramOptionsSymbolInformationNode[]): void {
//     //     if (this.widget) {
//     //         this.widget.setDiagramOptionsTree(roots)
//     //         this.onDidChangeDiagramOptionsEmitter.fire(roots)
//     //     }
//     // }

//     createWidget(): Promise<Widget> {
//         this.widget = this.factory()
//         const disposables = new DisposableCollection()
//         disposables.push(this.widget.onDidChangeOpenStateEmitter.event(open => this.onDidChangeOpenStateEmitter.fire(open)))
//         disposables.push(this.widget.model.onOpenNode(node => this.onDidOpenEmitter.fire(node as DiagramOptionsSymbolInformationNode)))
//         disposables.push(this.widget.model.onSelectionChanged(selection => this.onDidSelectEmitter.fire(selection[0] as DiagramOptionsSymbolInformationNode)))
//         this.widget.disposed.connect(() => {
//             this.widget = undefined
//             disposables.dispose()
//         })
//         return Promise.resolve(this.widget)
//     }
// }