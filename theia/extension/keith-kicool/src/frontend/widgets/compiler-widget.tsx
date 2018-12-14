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

// import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable, LazyServiceIdentifer, inject } from "inversify";
import { Message,
    StatefulWidget,
    CompositeTreeNode,
    SelectableTreeNode,
    ExpandableTreeNode,
    TreeNode, TreeModel,
    TreeWidget, TreeProps,
    ContextMenuRenderer } from "@theia/core/lib/browser";
import { Event } from '@theia/core/lib/common'
import * as React from "react";
import { Constants, CompilationSystems, Snapshots } from "keith-language/lib/frontend/utils";
import { KiCoolContribution } from "../language/kicool-contribution";
import { Emitter } from "@theia/core";
import '../../src/frontend/widgets/style/index.css'

export interface KiCoolSymbolInformationNode extends CompositeTreeNode, SelectableTreeNode, ExpandableTreeNode {
    iconClass: string
}

export namespace KiCoolSymbolInformationNode {
    export function is(node: TreeNode): node is KiCoolSymbolInformationNode {
        return !!node && SelectableTreeNode.is(node) && 'iconClass' in node
    }
}

export type KiCoolViewWidgetFactory = () => CompilerWidget
export const KiCoolViewWidgetFactory = Symbol('KiCoolViewWidgetFactory')

/**
 * Widget to compile and navigate compilation results. Should be linked to editor.
 */
@injectable()
export class CompilerWidget extends TreeWidget implements StatefulWidget {

    public static widgetId = Constants.compilerWidgetId


    protected readonly onRequestSystemDescriptionsEmitter = new Emitter<CompilerWidget | undefined>()
    /**
     * Emit when compilation systems are requested.
     */
    readonly requestSystemDescriptions: Event<CompilerWidget | undefined> = this.onRequestSystemDescriptionsEmitter.event
    readonly onDidChangeOpenStateEmitter = new Emitter<boolean>()

    systems: CompilationSystems[]

    autoCompile: boolean
    compileInplace: boolean
    showPrivateSystems: boolean
    public sourceModelPath: string

    constructor(
        @inject(TreeProps) protected readonly treeProps: TreeProps,
        @inject(TreeModel) model: TreeModel,
        @inject(ContextMenuRenderer) protected readonly contextMenuRenderer: ContextMenuRenderer,
        @inject(new LazyServiceIdentifer(() => KiCoolContribution)) protected readonly commands: KiCoolContribution
    ) {
        super(treeProps, model, contextMenuRenderer);
        this.id = Constants.compilerWidgetId
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.addClass(Constants.compilerWidgetId) // class for index.css
        this.systems = [{id: "NONE", label: "NONE", isPublic: true}]
        this.autoCompile = false
        this.showPrivateSystems = false
        this.compileInplace = false
    }

    render(): React.ReactNode {
        if (!this.systems || this.systems.length === 1) {
            if (this.commands) {
                this.commands.requestSystemDescriptions()
            }
            return <div className='spinnerContainer'>
                <div className='fa fa-spinner fa-pulse fa-3x fa-fw'></div>
            </div>;
        } else {
            const compilationElements: React.ReactNode[] = [];
            this.systems.forEach(system => {
                if (this.showPrivateSystems || system.isPublic) {
                    compilationElements.push(<option value={system.id} key={system.id}>{system.label}</option>)
                }
            });
            return <React.Fragment>
                <div className="compilation-panel">
                    {this.renderPrivateButton()}
                    {this.renderInplaceButton()}
                    {this.renderAutoCompileButton()}
                    <select id='compilation-list' className='compilation-list'>
                        {compilationElements}
                    </select>
                    {this.renderCompileButton()}
                </div>
                {this.renderShowButtons()}
            </React.Fragment>
        }
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.update()
    }

    renderShowButtons(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        const uri = this.sourceModelPath
        if (!uri) {
            return
        }
        const snapshots = this.commands.resultMap.get(uri)
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((snapshot: Snapshots, index: number) => {

            showButtons.push(
                <div key={index} id={"showButton" + (index < 10 ? "0" + index : index)} className={'show-button'.concat((snapshot.errors.length > 0) ? ' error' :
                    (snapshot.warnings.length > 0) ? ' warn' : (snapshot.infos.length > 0 ) ? ' info' : '')}
                    title={snapshot.name}
                    onClick={event => {
                        if (!uri) {
                            return
                        }
                        this.commands.show(uri.toString(), index)
                    }}>
                    {snapshot.snapshotIndex === 0 ? snapshot.name : ""}
                </div >
            )
        });
        return <div id="showButtonContainer0" className='buttonContainer'>
            {showButtons}
        </div>
    }

    renderCompileButton(): React.ReactNode {
        return <div className='compile-button' title="Compile"
            onClick={event => {
                this.compileSelectedCompilationSystem()
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }

    renderPrivateButton(): React.ReactNode {
        return <div title="Show private Systems" key="private-button" className={'preference-button' + (this.showPrivateSystems ? '' : ' off')}
            onClick={event => {
                this.showPrivateSystems = !this.showPrivateSystems
                this.update()
            }}>
            <div className='fa fa-unlock-alt'> </div>
        </div>
    }

    renderInplaceButton(): React.ReactNode {
        return <div title="Inplace" key="inplace-button" className={'preference-button' + (this.compileInplace ? '' : ' off')}
            onClick={event => {
                this.compileInplace = !this.compileInplace
                this.update()
            }}>
            <div className='fa fa-share'> </div>
        </div>
    }

    renderAutoCompileButton(): React.ReactNode {
        return <div title="Auto compile" key="auto-compile-button" className={'preference-button' + (this.autoCompile ? '' : ' off')}
            onClick={event => {
                this.autoCompile = !this.autoCompile
                this.update()
            }}>
            <div className='fa fa-cog'> </div>
        </div>
    }

    public compileSelectedCompilationSystem(): void {
        const selection = document.getElementById("compilation-list") as HTMLSelectElement;
        const systems = this.systems.filter(system => {
            return this.showPrivateSystems || system.isPublic
        })
        if (systems.length > 0) {
            this.commands.compile(systems[selection.selectedIndex].id)
        } else {
            this.commands.message("No compilation systems found", "error")
            return
        }
    }

    storeState(): CompilerWidget.Data {
        return {
            autoCompile : this.autoCompile,
            compileInplace : this.compileInplace,
            showPrivateSystems : this.showPrivateSystems
        }
    }

    restoreState(oldState: CompilerWidget.Data): void {
        this.autoCompile = oldState.autoCompile
        this.compileInplace = oldState.compileInplace
        this.showPrivateSystems = oldState.showPrivateSystems
    }
}

export namespace CompilerWidget {
    export interface Data {
        autoCompile: boolean,
        compileInplace: boolean,
        showPrivateSystems: boolean
    }
}