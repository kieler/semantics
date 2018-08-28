import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable, LazyServiceIdentifer, inject } from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants, CompilationSystems } from "../../common/util";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import "../../../src/frontend/widgets/style/index.css";
import { KeithContribution } from "../language/keith-contribution";

@injectable()
export class CompilerWidget extends ReactWidget {
    
    systems: CompilationSystems[]

    autoCompile: boolean
    compileInplace: boolean
    showPrivateSystems: boolean
    
    constructor(
        @inject(new LazyServiceIdentifer(() => KeithContribution)) protected readonly commands: KeithContribution
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
            <div id="compilation-panel">
                {this.renderCompileButton()}
                <select id='compilation-list'>
                    {compilationElements}
                </select>
                {this.renderPrivateButton()}
                {this.renderInplaceButton()}
                {this.renderAutoCompileButton()}
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
        var uri = this.commands.getStringUriOfCurrentEditor()
        if (!uri) {
            return
        }
        var snapshots = this.commands.resultMap.get(uri)
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
                    {snapshot.snapshotIndex == 0 ? snapshot.name : ""}
                </div >
            )
        });
        return <div id="showButtonContainer0" className='buttonContainer'>
            {showButtons}
        </div>
    }

    renderCompileButton(): React.ReactNode {
        return <div id='compile-button' title="Compile"
            onClick={event => {
                this.compileSelectedCompilationSystem()
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }
    
    renderPrivateButton(): React.ReactNode {
        return <div title="Show private Systems" key="private-button" id='compile-button'
            onClick={event => {
                this.showPrivateSystems = !this.showPrivateSystems
                this.update()
            }}>
            <div className={this.showPrivateSystems ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderInplaceButton(): React.ReactNode {
        return <div title="Inplace" key="inplace-button" id='compile-button'
            onClick={event => {
                this.compileInplace = !this.compileInplace
                this.update()
            }}>
            <div className={this.compileInplace ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderAutoCompileButton(): React.ReactNode {
        return <div title="Auto compile" key="auto-compile-button" id='compile-button'
            onClick={event => {
                this.autoCompile = !this.autoCompile
                this.update()
            }}>
            <div className={this.autoCompile ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }

    onUpdateRequest(msg: Message): void {
        this.commands.requestSystemDescriptions().then(() => {
            super.onUpdateRequest(msg)
            this.render()
        })
    }

    public compileSelectedCompilationSystem(): void {
        var selection = document.getElementById("compilation-list") as HTMLSelectElement;
        if (this.systems.length > 0) {
            this.commands.compile(this.systems[selection.selectedIndex].id)
        } else {
            this.commands.message("No compilation systems found", "error")
            return
        }
    }
}