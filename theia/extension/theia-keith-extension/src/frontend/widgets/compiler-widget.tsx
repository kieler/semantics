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

import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable, LazyServiceIdentifer, inject } from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants, CompilationSystems } from "keith-language-extension/lib/frontend/utils";

import '../../src/frontend/widgets/style/index.css'
import { KiCoolContribution } from "../language/kicool-contribution";

/**
 * Widget to compile and navigate compilation results. Should be linked to editor.
 */
@injectable()
export class CompilerWidget extends ReactWidget {
    systems: CompilationSystems[]

    autoCompile: boolean
    compileInplace: boolean
    showPrivateSystems: boolean

    constructor(
        @inject(new LazyServiceIdentifer(() => KiCoolContribution)) protected readonly commands: KiCoolContribution
    ) {
        super();
        this.id = Constants.compilerWidgetId
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.title.closable = false
        this.addClass(Constants.compilerWidgetId) // class for index.css
        this.systems = [{id: "NONE", label: "NONE", isPublic: true}]
        this.node.draggable = false
        this.show()
        this.node.focus()
        this.autoCompile = false
        this.showPrivateSystems = false
        this.compileInplace = false
    }

    render(): React.ReactNode {
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

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.update()
    }

    renderShowButtons(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        const uri = this.commands.getStringUriOfCurrentEditor()
        if (!uri) {
            return
        }
        const snapshots = this.commands.resultMap.get(uri)
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((snapshot, index) => {

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

    onUpdateRequest(msg: Message): void {
        this.commands.requestSystemDescriptions().then(() => {
            super.onUpdateRequest(msg)
            this.render()
        })
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
}