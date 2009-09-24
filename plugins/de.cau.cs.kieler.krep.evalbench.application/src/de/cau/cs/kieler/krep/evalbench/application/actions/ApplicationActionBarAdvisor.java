package de.cau.cs.kieler.krep.evalbench.application.actions;

import org.eclipse.jface.action.*;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Configures the action bars of this application's
 * workbench window.
 * 
 * @author msp
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	/** The workbench window to register actions */
	private IWorkbenchWindow window;
	
	private IWorkbenchAction showHelpAction; 
	private IWorkbenchAction searchHelpAction; 
	private IWorkbenchAction dynamicHelpAction;
	/**
	 * Creates the action bar advisor for this application.
	 * @param configurer the action bar configurer
	 */
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
     */
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		this.window = window;
		registerAsGlobal(ActionFactory.NEW_WIZARD_DROP_DOWN.create(window));
		registerAsGlobal(ActionFactory.SAVE.create(window));
		registerAsGlobal(ActionFactory.SAVE_AS.create(window));
		registerAsGlobal(ActionFactory.ABOUT.create(window));
		registerAsGlobal(ActionFactory.SAVE_ALL.create(window));
		registerAsGlobal(ActionFactory.UNDO.create(window));
		registerAsGlobal(ActionFactory.REDO.create(window));
		registerAsGlobal(ActionFactory.CUT.create(window));
		registerAsGlobal(ActionFactory.COPY.create(window));
		registerAsGlobal(ActionFactory.PASTE.create(window));
		registerAsGlobal(ActionFactory.SELECT_ALL.create(window));
		registerAsGlobal(ActionFactory.FIND.create(window));
		registerAsGlobal(ActionFactory.CLOSE.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL_SAVED.create(window));
		registerAsGlobal(ActionFactory.REVERT.create(window));
		registerAsGlobal(ActionFactory.HELP_CONTENTS.create(window));
		registerAsGlobal(ActionFactory.PREFERENCES.create(window));
		registerAsGlobal(ActionFactory.RESET_PERSPECTIVE.create(window));
		registerAsGlobal(ActionFactory.QUIT.create(window));
		
		showHelpAction = ActionFactory.HELP_CONTENTS.create(window); // NEW
		register(showHelpAction); 

		searchHelpAction = ActionFactory.HELP_SEARCH.create(window); // NEW
		register(searchHelpAction); 

		dynamicHelpAction = ActionFactory.DYNAMIC_HELP.create(window); // NEW
		register(dynamicHelpAction);
	}
	
	/**
	 * Registers the action as global action and registers it for disposal.
	 * 
	 * @param action the action to register
	 */
	private void registerAsGlobal(IAction action) {
		getActionBarConfigurer().registerGlobalAction(action);
		register(action);
	}

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
     */
	@Override
	protected void fillMenuBar(IMenuManager menubar) {
		menubar.add(createFileMenu());
		menubar.add(createEditMenu());
		menubar.add(createWindowMenu());
		menubar.add(createActionMenu());
		menubar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menubar.add(createHelpMenu());
		
		
	}

	/**
	 * Creates and returns the Action menu.
	 * 
	 * @return a menu manager holding the Action menu
	 */
	private MenuManager createActionMenu() {
	    MenuManager menu = new MenuManager("&Action", null);
//	    menu.add(new )
	    return menu;
	}

	/**
	 * Creates and returns the File menu.
	 * 
	 * @return a menu manager holding the File menu
	 */
	private MenuManager createFileMenu() {
		MenuManager menu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));

		MenuManager newMenu = new MenuManager("&New", null); 
		newMenu.add(ContributionItemFactory.NEW_WIZARD_SHORTLIST.create(window));
		menu.add(newMenu);
		
		menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
		menu.add(getAction(ActionFactory.CLOSE.getId()));
		menu.add(getAction(ActionFactory.CLOSE_ALL.getId()));

		menu.add(new GroupMarker(IWorkbenchActionConstants.CLOSE_EXT));
		menu.add(new Separator());
		menu.add(getAction(ActionFactory.SAVE.getId()));
		menu.add(getAction(ActionFactory.SAVE_AS.getId()));
		menu.add(getAction(ActionFactory.SAVE_ALL.getId()));

		menu.add(getAction(ActionFactory.REVERT.getId()));
		menu.add(ContributionItemFactory.REOPEN_EDITORS.create(getActionBarConfigurer().getWindowConfigurer().getWindow()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.MRU));
		menu.add(new Separator());
		menu.add(getAction(ActionFactory.QUIT.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		return menu;
	}

	/**
	 * Creates and returns the Edit menu.
	 * 
	 * @return a menu manager holding the Edit menu
	 */
	private MenuManager createEditMenu() {
		MenuManager menu = new MenuManager("&Edit", IWorkbenchActionConstants.M_EDIT);
		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

		menu.add(getAction(ActionFactory.UNDO.getId()));
		menu.add(getAction(ActionFactory.REDO.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));

		menu.add(getAction(ActionFactory.CUT.getId()));
		menu.add(getAction(ActionFactory.COPY.getId()));
		menu.add(getAction(ActionFactory.PASTE.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));

		menu.add(getAction(ActionFactory.SELECT_ALL.getId()));
		menu.add(new Separator());

		menu.add(getAction(ActionFactory.FIND.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FIND_EXT));
		menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));

		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
		return menu;
	}
	
	/**
	 * Creates and returns the Window menu.
	 * 
	 * @return a menu manager holding the Window menu.
	 */
	private MenuManager createWindowMenu() {
		MenuManager menu = new MenuManager("&Window", IWorkbenchActionConstants.M_WINDOW);

		MenuManager perspectiveMenu = new MenuManager("&Open Perspective", null);
		perspectiveMenu.add(ContributionItemFactory.PERSPECTIVES_SHORTLIST.create(window));
		menu.add(perspectiveMenu);
		
		MenuManager viewMenu = new MenuManager("Show &View", null);
		viewMenu.add(ContributionItemFactory.VIEWS_SHORTLIST.create(window));
		menu.add(viewMenu);
		
		menu.add(getAction(ActionFactory.RESET_PERSPECTIVE.getId()));
		menu.add(new Separator());
		
		menu.add(getAction(ActionFactory.PREFERENCES.getId()));
		
		menu.add(new GroupMarker(IWorkbenchActionConstants.WINDOW_EXT));
		return menu;
	}

	/**
	 * Creates and returns the Help menu.
	 * 
	 * @return a menu manager holding the Help menu
	 */
	private MenuManager createHelpMenu() {
		MenuManager menu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
		//menu.add(getAction(ActionFactory.HELP_CONTENTS.getId()));
		menu.add(showHelpAction); 
		menu.add(searchHelpAction); 
		menu.add(dynamicHelpAction);
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
		
		menu.add(new Separator("about")); //$NON-NLS-1$
		menu.add(getAction(ActionFactory.ABOUT.getId()));

		return menu;
	}
    
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
	 */
	@Override
	protected void fillCoolBar(ICoolBarManager cbManager) {
		cbManager.add(new GroupMarker("group.file")); //$NON-NLS-1$
		{ // File Group
			IToolBarManager fileToolBar = new ToolBarManager(cbManager.getStyle());
			fileToolBar.add(new Separator(IWorkbenchActionConstants.NEW_GROUP));
			fileToolBar.add(getAction(ActionFactory.NEW_WIZARD_DROP_DOWN.getId()));
			fileToolBar.add(new GroupMarker(IWorkbenchActionConstants.OPEN_EXT));
			fileToolBar.add(new GroupMarker(IWorkbenchActionConstants.SAVE_GROUP));
			fileToolBar.add(getAction(ActionFactory.SAVE.getId()));
			
			// Add to the cool bar manager
			cbManager.add(new ToolBarContributionItem(fileToolBar,IWorkbenchActionConstants.TOOLBAR_FILE));
		}
		
		cbManager.add(new GroupMarker(IWorkbenchActionConstants.GROUP_EDITOR));
	}
	
}
