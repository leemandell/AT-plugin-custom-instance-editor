
package edu.yale.plugins.instanceEditor;

import org.java.plugin.Plugin;
import org.archiviststoolkit.plugin.ATPlugin;
import org.archiviststoolkit.ApplicationFrame;
import org.archiviststoolkit.dialog.ErrorDialog;
import org.archiviststoolkit.model.ArchDescriptionAnalogInstances;
import org.archiviststoolkit.model.ResourcesCommon;
import org.archiviststoolkit.editor.ArchDescriptionFields;
import org.archiviststoolkit.swing.InfiniteProgressPanel;
import org.archiviststoolkit.swing.StandardEditor;
import org.archiviststoolkit.mydomain.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Archivists' Toolkit(TM) Copyright � 2005-2007 Regents of the University of California, New York University, & Five Colleges, Inc.
 * All rights reserved.
 *
 * This software is free. You can redistribute it and / or modify it under the terms of the Educational Community License (ECL)
 * version 1.0 (http://www.opensource.org/licenses/ecl1.php)
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the ECL license for more details about permissions and limitations.
 *
 *
 * Archivists' Toolkit(TM)
 * http://www.archiviststoolkit.org
 * info@archiviststoolkit.org
 *
 * A simple plugin to test the functionality of 
 *
 * Created by IntelliJ IDEA.
 *                  
 * @author: Nathan Stevens
 * Date: Feb 10, 2009
 * Time: 1:07:45 PM
 */

public class AnalogInstance extends Plugin implements ATPlugin {
    protected ApplicationFrame mainFrame;
    private ATPluginDemo1Frame frame;
	protected ArchDescriptionFields parentEditorFields;
	private ResourcesCommon resourceOrComponent;

    protected YaleAnalogInstancesFields editorFields;
	private DomainEditor analogInstanceEditor;
	private JTable callingTable;
	private int selectedRow;
    protected ArchDescriptionAnalogInstances analogInstance;

	// the default constructor
    public AnalogInstance() { }

	// get the category this plugin belongs to
    public String getCategory() {
        return ATPlugin.EDITOR_CATEGORY;
        //return ATPlugin.DEFAULT_CATEGORY + " " + ATPlugin.EMBEDDED_EDITOR_CATEGORY;
        //return ATPlugin.IMPORT_CATEGORY;
    }

    // get the name of this plugin
    public String getName() {
        return "Yale Analog Instance Editor";
    }

    // Method to set the main frame
    public void setApplicationFrame(ApplicationFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    // Method that display the window
    public void showPlugin() {
        frame = new ATPluginDemo1Frame();
        frame.setApplicationFrame(mainFrame);
        frame.setVisible(true);
    }

    // method to display a plugin that needs a parent frame
    public void showPlugin(Frame owner) {
        MyEditorDialog1 dialog = new MyEditorDialog1(owner);
        dialog.setModel(analogInstance);
        dialog.setVisible(true);
    }

    // method to display a plugin that needs a parent dialog
    public void showPlugin(Dialog owner) {
		editorFields = new YaleAnalogInstancesFields((DomainEditor)owner);
		analogInstanceEditor = new DomainEditor(ArchDescriptionAnalogInstances.class, owner, "Analog Instances", editorFields);
//		dialogInstances.setResourceInfo((Resources) getParentEditor().getModel());
		try {
			analogInstanceEditor.setCallingTable(callingTable);
		} catch (UnsupportedTableModelException e) {
			new ErrorDialog("Unsupported Table", e).showDialog();
		}
		analogInstanceEditor.setNavigationButtons();
		analogInstanceEditor.setNavigationButtonListeners(analogInstanceEditor);
		analogInstanceEditor.setContentPanel(editorFields);
		analogInstanceEditor.setModel(analogInstance, null);
		int returnStatus = analogInstanceEditor.showDialog();
		if (returnStatus == JOptionPane.OK_OPTION) {
			resourceOrComponent.addInstance(analogInstance);
			((DomainSortableTable)callingTable).getEventList().add(analogInstance);
//			findLocationForInstance(newInstance);
			ApplicationFrame.getInstance().setRecordDirty(); // set the analogInstance dirty
		} else if (returnStatus == StandardEditor.OK_AND_ANOTHER_OPTION) {
			resourceOrComponent.addInstance(analogInstance);
			((DomainSortableTable)callingTable).getEventList().add(analogInstance);
//			findLocationForInstance(newInstance);
			ApplicationFrame.getInstance().setRecordDirty(); // set the analogInstance dirty
		}
	}

    // Method to return the jpanels for plugins that are in an AT editor
    public HashMap getEmbeddedPanels() {
        return null;
    }

	public void setEditorField(DomainEditorFields domainEditorFields) {
	}

	// Method to set the editor field component
    public void setEditorField(ArchDescriptionFields editorField) {
        this.parentEditorFields = editorField;
		resourceOrComponent = (ResourcesCommon)parentEditorFields.getModel();
    }

    /**
     * Method to set the domain object for this plugin
     */
    public void setModel(DomainObject domainObject, InfiniteProgressPanel monitor) {
        analogInstance = (ArchDescriptionAnalogInstances)domainObject;
    }

    /**
     * Method to get the table from which the record was selected
     * @param callingTable The table containing the record
     */
    public void setCallingTable(JTable callingTable) {
		this.callingTable = callingTable;
	}

    /**
     * Method to set the selected row of the calling table
     * @param selectedRow
     */
    public void setSelectedRow(int selectedRow) {
		this.selectedRow = selectedRow;
	}

    /**
     * Method to set the current record number along with the total number of records
     * @param recordNumber The current record number
     * @param totalRecords The total number of records
     */
    public void setRecordPositionText(int recordNumber, int totalRecords) { }

    // Method to do a specific task in the plugin
    public void doTask(String task) {
        frame = new ATPluginDemo1Frame(this);
        frame.textArea1.setText("Doing Task : " + task + "\n\n");
        frame.setApplicationFrame(mainFrame);
        frame.setVisible(true);
    }

    // Method to get the list of specific task the plugin can perform
    public String[] getTaskList() {
        return null;
    }

    // Method to return the editor type for this plugin
    public String getEditorType() {
        String editorType = ATPlugin.INSTANCE_EDITOR;
        return editorType;
    }

    // code that is executed when plugin starts. not used here
    protected void doStart()  { }

    // code that is executed after plugin stops. not used here
    protected void doStop()  { }

    // main method for testing only
    public static void main(String[] args) {
        AnalogInstance demo = new AnalogInstance();
        demo.showPlugin();
    }
}
