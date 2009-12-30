/**
 * Archivists' Toolkit(TM) Copyright © 2005-2007 Regents of the University of California, New York University, & Five Colleges, Inc.  
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
 * @author Lee Mandell
 * Date: Jul 16, 2009
 * Time: 10:49:47 AM
 */

package edu.yale.plugins.instanceEditor;

import org.archiviststoolkit.mydomain.DomainEditor;
import org.archiviststoolkit.mydomain.DomainObject;
import org.archiviststoolkit.model.ArchDescriptionInstances;
import org.archiviststoolkit.swing.InfiniteProgressPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;


/**
 * Editor for dealing with the contact domain object.
 */

public class YaleAnalogInstancesEditor extends DomainEditor {


//    /**
//     * Constructor.
//     *
//     * @param parentFrame the parentframe to render this editor to.
//     */
//    public YaleAnalogInstancesEditor(JFrame parentFrame) {
//        super(ArchDescriptionInstances.class, parentFrame);
//        init();
//
//        this.setContentPanel(editorFields);
//    }

	/**
	 * Constructor.
	 *
	 * @param parentFrame the parentframe to render this editor to.
	 */
	public YaleAnalogInstancesEditor(JDialog parentFrame) {
		super(ArchDescriptionInstances.class, parentFrame);
		init();

	}

	private void init() {
		editorFields = new YaleAnalogInstancesFields(this);
	}

	public void setModel(final DomainObject model, InfiniteProgressPanel progressPanel) {
		this.setContentPanel(editorFields);
		this.pack();
		this.invalidate();
		this.repaint();
		super.setModel(model, progressPanel);
	}

	/**
	 * capture and handle action events.
	 *
	 * @param ae the action event
	 */

	public void actionPerformed(final ActionEvent ae) {
		super.actionPerformed(ae);
	}


	public void commitChangesToCurrentRecord() {
//		digitalEditorFields.commitChangesToCurrentRecord();
	}

	/**
	 * Displays the dialog box representing the editor.
	 *
	 * @return true if it displayed okay
	 */

	public int showDialog() {
		return super.showDialog();	//To change body of overridden methods use File | Settings | File Templates.
	}

}
