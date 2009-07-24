/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.AbstractContributionFactory;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.services.IServiceLocator;

public class KiemProblems {
	public void addProblemsViewMenuContribution() {
	    IMenuService menuService = (IMenuService) PlatformUI.getWorkbench()
	            .getService(IMenuService.class);
	 
	    AbstractContributionFactory viewMenuAddition = new AbstractContributionFactory(
	            "menu:org.eclipse.ui.views.ProblemView?after=additions", null) {
	        public void createContributionItems(IMenuService menuService,
	                List additions) {
	            CommandContributionItem item = new CommandContributionItem(
	                    null, "org.eclipse.ui.views.problems.sorting", null,
	                    null, null, null, null, "Sorting...", "S",
	                    "Change the Sort order",
	                    CommandContributionItem.STYLE_PUSH);
	            additions.add(item);
	 
	            MenuManager submenu = new MenuManager("Group &By",
	                    "org.eclipse.ui.views.problems.groupBy.menu");
	            IContributionItem dynamicItem = new CompoundContributionItem(
	                    "org.eclipse.ui.views.problems.groupBy.items") {
	                protected IContributionItem[] getContributionItems() {
	                    // Here's where you would dynamically generate your list
	                    IContributionItem[] list = new IContributionItem[2];
	                    Map parms = new HashMap();
	                    parms.put("groupBy", "Severity");
	                    String id = ""; 
	                    list[0] = new CommandContributionItem(null,
	                            "org.eclipse.ui.views.problems.grouping",
	                            id, parms, null, null, null, "Severity", null,
	                            null, CommandContributionItem.STYLE_PUSH);
	 
	                    parms = new HashMap();
	                    parms.put("groupBy", "None");
	                    id = "";
						list[1] = new CommandContributionItem(null,
	                            "org.eclipse.ui.views.problems.grouping",
	                            id , parms, null, null, null, "None", null, null,
	                            CommandContributionItem.STYLE_PUSH);
	                    return list;
	                }
	            };
	            submenu.add(dynamicItem);
	 
	            additions.add(submenu);
	            additions.add(new Separator("group.filter"));
	 
	            submenu = new MenuManager("&Filters",
	                    "org.eclipse.ui.views.problems.filters.menu");
	            dynamicItem = new CompoundContributionItem(
	                    "org.eclipse.ui.views.problems.filters.items") {
	                protected IContributionItem[] getContributionItems() {
	                    // Here's where you would dynamically generate your list
	                    IContributionItem[] list = new IContributionItem[1];
	                    Map parms = new HashMap();
	                    parms.put("filter", "Default");
	                    String id = "";
						list[0] = new CommandContributionItem(null,
	                            "org.eclipse.ui.views.problems.filters", id , parms,
	                            null, null, null, "Default", null, null,
	                            CommandContributionItem.STYLE_PUSH);
	                    return list;
	                }
	            };
	            submenu.add(dynamicItem);
	 
	            additions.add(submenu);
	 
	            ImageDescriptor filterIcon = PlatformUI.getWorkbench()
	                    .getSharedImages().getImageDescriptor(
	                            "elcl16/filter_ps.gif");
	            item = new CommandContributionItem(null,
	                    "org.eclipse.ui.views.problems.configureFilters", null,
	                    null, filterIcon, null, null, "Configure Filters...", "C",
	                    "Configure the filters to be applied to this view",
	                    CommandContributionItem.STYLE_PUSH);
	            additions.add(item);
	 
	            Map parms = new HashMap();
	            parms.put("markerEnablementName", "LIMIT_PROBLEMS");
	            parms.put("markerLimitName", "PROBLEMS_LIMIT");
	            String location = "";
				item = new CommandContributionItem(null,
	                    "org.eclipse.ui.preferences.viewPreferences", location , parms,
	                    null, null, null, "Preference", "P",
	                    "Open the preference dialog",
	                    CommandContributionItem.STYLE_PUSH);
	            additions.add(item);
	        }
	 
	        public void releaseContributionItems(IMenuService menuService,
	                List items) {
	            // for us this is a no-op
	        }

			@Override
			public void createContributionItems(IServiceLocator serviceLocator,
					IContributionRoot additions) {
				// TODO Auto-generated method stub
				
			}
	    };
	    menuService.addContributionFactory(viewMenuAddition);
	}
}
