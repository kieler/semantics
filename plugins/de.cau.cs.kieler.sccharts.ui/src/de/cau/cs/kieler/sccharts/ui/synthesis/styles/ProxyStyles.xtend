/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil
import de.cau.cs.kieler.klighd.util.KlighdProperties

/**
 * @author mka
 *
 */
class ProxyStyles {
    
    /** The maximum number of characters to be shown in a proxy label. */
    public static final int MAX_PROXY_LABEL_LENGTH = 5
    
    /** Minimum size of proxies. */
    public static final int MIN_PROXY_SIZE = 10
    
    static def setProxySize(KNode node, KNode proxy) {
        // Set size to be at least minimal node size
        val proxyBounds = PlacementUtil.estimateSize(proxy)
        val minProxySize = StateStyles.DEFAULT_FIGURE_MIN_NODE_SIZE
        // Don't need to resize proxy if the node is already big enough by itself
        val isBigEnough = proxyBounds.width > ProxyStyles.MIN_PROXY_SIZE 
            && proxyBounds.height > ProxyStyles.MIN_PROXY_SIZE
        
        proxy.width = isBigEnough ? proxyBounds.width : minProxySize
        proxy.height = isBigEnough ? proxyBounds.height : minProxySize
        
        node.setProperty(KlighdProperties.PROXY_VIEW_RENDER_NODE_AS_PROXY, true)
        node.setProperty(KlighdProperties.PROXY_VIEW_PROXY_RENDERING, proxy.data)
        
    }
    
}