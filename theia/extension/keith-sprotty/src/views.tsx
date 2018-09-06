/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
/** @jsx svg */
import { svg } from 'snabbdom-jsx'
import { RenderingContext, IView/*, setAttr*/ } from "sprotty/lib"
import { VNode } from "snabbdom/vnode"
import { KNode, KPort, KLabel, KEdge} from "./kgraph-models"
import { getRendering } from "./views-rendering"
// import * as snabbdom from 'snabbdom-jsx'
// const JSX = {createElement: snabbdom.svg}



export class KNodeView implements IView {
    // Then all the functions could also be in that class
    render(node: KNode, context: RenderingContext): VNode {
        // reset this property, if the diagram is drawn a second time
        node.areChildrenRendered = false
        let rendering = getRendering(node.data, node, context as any) // TODO: 'as any' is not very nice, but KGraphRenderingContext cannot be used here (two undefined members)
        if (rendering === null) {
            console.error('Did not find a rendering for the KNode :' )
            console.error(node)
            console.error('\n\nfound data:')
            console.error(node.data)
            return <g>
                {context.renderChildren(node)}
            </g>
        }
        if (node.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            // TODO: sometimes the children should be rendered, although there is no child area (kgt without explicit childArea)
            // and sometimes the children should not be rendered, when there is no child area (collapsed renderings of sct) (not tested yet)
            // how should that be handled?
            return <g>
                {rendering}
                {context.renderChildren(node)}
            </g>
        }
    }
}

export class KPortView implements IView {
    render(port: KPort, context: RenderingContext): VNode {
        port.areChildrenRendered = false
        let rendering = getRendering(port.data, port, context as any)
        if (rendering === null) {
            console.error('Did not find a rendering for the KPort ' + port + '\n\n'
                + 'found data:' + port.data)
            return <g>
                {context.renderChildren(port)}
            </g>
        }
        if (port.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(port)}
            </g>
        }
    }
}

export class KLabelView implements IView {
    render(label: KLabel, context: RenderingContext): VNode {
        label.areChildrenRendered = false
        let rendering = getRendering(label.data, label, context as any)
        if (rendering === null) {
            console.error('Did not find a rendering for the KLabel ' + label + '\n\n'
                + 'found data:' + label.data)
            return <g>
                {context.renderChildren(label)}
            </g>
        }
        if (label.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(label)}
            </g>
        }
    }
}

export class KEdgeView implements IView {
    render(edge: KEdge, context: RenderingContext): VNode {
        edge.areChildrenRendered = false
        let rendering = getRendering(edge.data, edge, context as any)
        if (rendering === null) {
            console.error('Did not find a rendering for the KEdge ' + edge + '\n\n'
                + 'found data:' + edge.data)
            return <g>
                {context.renderChildren(edge)}
            </g>
        }
        if (edge.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(edge)}
            </g>
        }
    }
}
