package de.cau.cs.kieler.sccharts.klighd

class SCChartsDiagramSynthesisControlflowRegions {
	
    public def KNode translate(ControlflowRegion r, boolean loadLazy) {
    	regionCounter = regionCounter + 1
    	if (regionCounter % 100 == 0) System.out.print("r")
    	if (regionCounter % 2000 == 0) System.out.println("")
        val regionNode = r.createNode() => [ node |
            node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot")
            node.addLayoutParam(LayoutOptions::EDGE_ROUTING, EdgeRouting::SPLINES)
            node.setLayoutOption(LayoutOptions::SPACING, 40f);
            if (loadLazy) {
                node.setLayoutOption(KlighdProperties::EXPAND, false);       
                     
            } else {
                for (s : r.states) {
                    node.children += s.translate;
                }
                
                // semantic comments
                if (r.hasCommentAnnotation) {
                    val initialStateNode = r.states.filter[ isInitial ].head.node
                    for(commentAnnotation : r.getCommentAnnotations) {
                        val commentNode = createCommentNode(commentAnnotation)
                        node.children += commentNode
                        createEdge => [ edge |
                            edge.target = initialStateNode
                            edge.source = commentNode
                            edge.KRendering => [ invisible = true ]
                        ]                        
                    }
                }
            }
            var regionLabelVar = r.label
            val regionLabel = regionLabelVar
//            if (r.eContainer == null) {
//                return;
//            }
            node.addRectangle() => [
                it.associateWith(r)
                it.setAsExpandedView;
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(2, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[-]" + if(r.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(r) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.suppressSelectability
                ];
                if (r.empty || !r.label.nullOrEmpty) {
//                if (!r.allContainedStates.nullOrEmpty) {
                    it.addChildArea().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
                }
            ];
            node.addRectangle() => [
                it.associateWith(r)
                it.setAsCollapsedView;
                it.setBackgroundGradient("white".color, SCCHARTSGRAY, 90);
                it.setSurroundingSpace(4, 0);
                it.invisible = false;
                it.foreground = "gray".color
                it.lineWidth = 1;
                it.addText("[+]" + if(r.label.nullOrEmpty) "" else " " + regionLabel).putToLookUpWith(r) => [
                    if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                    it.foreground = "dimGray".color
                    it.fontSize = 10
                    it.setPointPlacementData(createKPosition(LEFT, 5, 0, TOP, 2, 0), H_LEFT, V_TOP, 10, 10, 0, 0);
                    if (loadLazy) {
                        it.addDoubleClickAction(SCChartsReferenceExpandAction.ID);
                    } else {
                        it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    }
                    it.suppressSelectability
                ];
                if (r.empty) {
                    it.addRectangle().setAreaPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0).invisible = true;
                }
            ]
        ]
        
        if (loadLazy) {
            regionNode.suppressSelectability
        }
        regionNode.putToLookUpWith(r)
        
        return regionNode
    }
	
	
}