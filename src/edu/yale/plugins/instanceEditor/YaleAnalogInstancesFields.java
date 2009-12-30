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
 * Created by JFormDesigner on Tue Mar 14 08:54:41 PST 2006
 */

package edu.yale.plugins.instanceEditor;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.binding.adapter.BasicComponentFactory;
import org.archiviststoolkit.swing.ATBasicComponentFactory;
import org.archiviststoolkit.model.ArchDescriptionAnalogInstances;
import org.archiviststoolkit.mydomain.DomainEditorFields;
import org.archiviststoolkit.mydomain.DomainEditor;
import org.archiviststoolkit.util.SequencedObjectsUtils;
import org.archiviststoolkit.util.LookupListUtils;
import org.archiviststoolkit.structure.ATFieldInfo;

public class YaleAnalogInstancesFields extends DomainEditorFields {

	protected YaleAnalogInstancesFields(DomainEditor parent) {
		super();
		this.setParentEditor(parent);
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		label_subjectTermType = new JLabel();
		container1Type = ATBasicComponentFactory.createComboBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER1_TYPE, ArchDescriptionAnalogInstances.class);
		label_subjectSource5 = new JLabel();
		containerLabel4 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER1_INDICATOR));
		label_subjectSource4 = new JLabel();
		containerLabel3 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_BARCODE));
		separator1 = new JSeparator();
		label_subjectTermType2 = new JLabel();
		container2Type = ATBasicComponentFactory.createComboBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER2_TYPE, ArchDescriptionAnalogInstances.class);
		label_subjectSource6 = new JLabel();
		containerLabel5 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER2_INDICATOR));
		separator3 = new JSeparator();
		label_subjectTermType3 = new JLabel();
		container3Type = ATBasicComponentFactory.createComboBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER3_TYPE, ArchDescriptionAnalogInstances.class);
		label_subjectSource7 = new JLabel();
		containerLabel6 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER3_INDICATOR));
		separator2 = new JSeparator();
		label_subjectTerm2 = new JLabel();
		containerLabel2 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_LOCATION_LABEL));
		label_date1Begin6 = new JLabel();
		dateExpression2 = ATBasicComponentFactory.createTextField(detailsModel.getModel(ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_STRING1),false);
		label_date1Begin7 = new JLabel();
		container3Type2 = ATBasicComponentFactory.createComboBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_STRING2, LookupListUtils.getLookupListValues(ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER3_TYPE));
		panel1 = new JPanel();
		rights3 = ATBasicComponentFactory.createCheckBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_BOOLEAN1, ArchDescriptionAnalogInstances.class);
		rights2 = ATBasicComponentFactory.createCheckBox(detailsModel, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_BOOLEAN2, ArchDescriptionAnalogInstances.class);
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setBorder(Borders.DLU4_BORDER);
		setBackground(new Color(234, 201, 250));
		setOpaque(false);
		setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		setLayout(new FormLayout(
			new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				new ColumnSpec("max(default;400px):grow")
			},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.LINE_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC
			}));

		//---- label_subjectTermType ----
		label_subjectTermType.setText("Container 1 Type");
		label_subjectTermType.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectTermType, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER1_TYPE);
		add(label_subjectTermType, cc.xy(1, 1));

		//---- container1Type ----
		container1Type.setOpaque(false);
		container1Type.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(container1Type, cc.xywh(3, 1, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

		//---- label_subjectSource5 ----
		label_subjectSource5.setText("Container 1 Indicator");
		label_subjectSource5.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectSource5, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER1_INDICATOR);
		add(label_subjectSource5, cc.xy(1, 3));

		//---- containerLabel4 ----
		containerLabel4.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(containerLabel4, cc.xy(3, 3));

		//---- label_subjectSource4 ----
		label_subjectSource4.setText("Barcode");
		label_subjectSource4.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectSource4, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_BARCODE);
		add(label_subjectSource4, cc.xy(1, 5));

		//---- containerLabel3 ----
		containerLabel3.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(containerLabel3, cc.xy(3, 5));

		//---- separator1 ----
		separator1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		separator1.setForeground(new Color(147, 131, 86));
		add(separator1, cc.xywh(1, 7, 3, 1));

		//---- label_subjectTermType2 ----
		label_subjectTermType2.setText("Container 2 Type");
		label_subjectTermType2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectTermType2, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER2_TYPE);
		add(label_subjectTermType2, cc.xy(1, 9));

		//---- container2Type ----
		container2Type.setOpaque(false);
		container2Type.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(container2Type, cc.xywh(3, 9, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

		//---- label_subjectSource6 ----
		label_subjectSource6.setText("Container 2  Indicator");
		label_subjectSource6.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectSource6, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER2_INDICATOR);
		add(label_subjectSource6, cc.xy(1, 11));

		//---- containerLabel5 ----
		containerLabel5.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(containerLabel5, cc.xy(3, 11));

		//---- separator3 ----
		separator3.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		separator3.setForeground(new Color(147, 131, 86));
		add(separator3, cc.xywh(1, 13, 3, 1));

		//---- label_subjectTermType3 ----
		label_subjectTermType3.setText("Container 3 Type");
		label_subjectTermType3.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectTermType3, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER3_TYPE);
		add(label_subjectTermType3, cc.xy(1, 15));

		//---- container3Type ----
		container3Type.setOpaque(false);
		container3Type.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(container3Type, cc.xywh(3, 15, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

		//---- label_subjectSource7 ----
		label_subjectSource7.setText("Container 3  Indicator");
		label_subjectSource7.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectSource7, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_CONTAINER3_INDICATOR);
		add(label_subjectSource7, cc.xy(1, 17));

		//---- containerLabel6 ----
		containerLabel6.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(containerLabel6, cc.xy(3, 17));

		//---- separator2 ----
		separator2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		separator2.setForeground(new Color(147, 131, 86));
		add(separator2, cc.xywh(1, 19, 3, 1));

		//---- label_subjectTerm2 ----
		label_subjectTerm2.setText("Location");
		label_subjectTerm2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_subjectTerm2, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_LOCATION);
		add(label_subjectTerm2, cc.xy(1, 21));

		//---- containerLabel2 ----
		containerLabel2.setEditable(false);
		containerLabel2.setOpaque(false);
		containerLabel2.setBorder(null);
		containerLabel2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(containerLabel2, cc.xy(3, 21));

		//---- label_date1Begin6 ----
		label_date1Begin6.setText("User Defined String 1");
		label_date1Begin6.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_date1Begin6, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_STRING1);
		add(label_date1Begin6, cc.xy(1, 23));

		//---- dateExpression2 ----
		dateExpression2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(dateExpression2, new CellConstraints(3, 23, 1, 1, CellConstraints.DEFAULT, CellConstraints.DEFAULT, new Insets( 0, 0, 0, 5)));

		//---- label_date1Begin7 ----
		label_date1Begin7.setText("User Defined String 2");
		label_date1Begin7.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		ATFieldInfo.assignLabelInfo(label_date1Begin7, ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_STRING2);
		add(label_date1Begin7, cc.xy(1, 25));

		//---- container3Type2 ----
		container3Type2.setOpaque(false);
		container3Type2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		add(container3Type2, cc.xywh(3, 25, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				new ColumnSpec[] {
					new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW),
					FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
					new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT, FormSpec.DEFAULT_GROW)
				},
				RowSpec.decodeSpecs("default")));

			//---- rights3 ----
			rights3.setText("User Defined Boolean 1");
			rights3.setOpaque(false);
			rights3.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
			rights3.setText(ATFieldInfo.getLabel(ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_BOOLEAN1));
			panel1.add(rights3, cc.xywh(1, 1, 2, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

			//---- rights2 ----
			rights2.setText("User Defined Boolean 2");
			rights2.setOpaque(false);
			rights2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
			rights2.setText(ATFieldInfo.getLabel(ArchDescriptionAnalogInstances.class, ArchDescriptionAnalogInstances.PROPERTYNAME_USER_DEFINED_BOOLEAN2));
			panel1.add(rights2, cc.xywh(3, 1, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));
		}
		add(panel1, cc.xywh(1, 27, 3, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner non-commercial license
	private JLabel label_subjectTermType;
	public JComboBox container1Type;
	private JLabel label_subjectSource5;
	public JTextField containerLabel4;
	private JLabel label_subjectSource4;
	public JTextField containerLabel3;
	private JSeparator separator1;
	private JLabel label_subjectTermType2;
	public JComboBox container2Type;
	private JLabel label_subjectSource6;
	public JTextField containerLabel5;
	private JSeparator separator3;
	private JLabel label_subjectTermType3;
	public JComboBox container3Type;
	private JLabel label_subjectSource7;
	public JTextField containerLabel6;
	private JSeparator separator2;
	private JLabel label_subjectTerm2;
	public JTextField containerLabel2;
	private JLabel label_date1Begin6;
	public JTextField dateExpression2;
	private JLabel label_date1Begin7;
	public JComboBox container3Type2;
	private JPanel panel1;
	public JCheckBox rights3;
	public JCheckBox rights2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	public Component getInitialFocusComponent() {
		return container1Type;
	}
}
