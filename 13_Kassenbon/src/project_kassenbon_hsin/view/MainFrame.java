package project_kassenbon_hsin.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import project_kassenbon.model.Artikel;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtField_Verkaeufer;
	private JComboBox comboBox_addItem;
	private JFormattedTextField formattedTextField_itemCount;
	private final Action action = new SwingAction();
	private JComboBox comboBox_deleteItem;
	private JButton btnNewItem;
	private JTextPane receiptTextPane;
	private JButton btnSaveBon;
	private JButton btnNewBon;
	private JTextField textField_Artikelname;
	private JTextField textField_Preis;
	private JButton btnDeleteItem;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Kassenbon Projekt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane);
		
		JPanel panel_left = new JPanel();
		splitPane.setLeftComponent(panel_left);
		panel_left.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_receipt = new JPanel();
		panel_receipt.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_left.add(panel_receipt);
		panel_receipt.setLayout(new BoxLayout(panel_receipt, BoxLayout.Y_AXIS));
		
		btnNewBon = new JButton("Neuer Kassenbon");
		panel_receipt.add(btnNewBon);
		
		btnSaveBon = new JButton("Verk\u00E4ufer speichern");
		panel_receipt.add(btnSaveBon);
		
		JPanel panel__verkaeufer = new JPanel();
		panel__verkaeufer.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_receipt.add(panel__verkaeufer);
		panel__verkaeufer.setLayout(new BoxLayout(panel__verkaeufer, BoxLayout.Y_AXIS));
		
		JLabel lblVerkaeufer = new JLabel("Verk\u00E4ufer");
		panel__verkaeufer.add(lblVerkaeufer);
		
		JPanel panel_verkauferTextField = new JPanel();
		panel__verkaeufer.add(panel_verkauferTextField);
		
		txtField_Verkaeufer = new JTextField();
		txtField_Verkaeufer.setText("Herr Max Mustermann");
		txtField_Verkaeufer.setColumns(15);
		panel_verkauferTextField.add(txtField_Verkaeufer);
		
		JPanel panel_receiptItem = new JPanel();
		panel_receiptItem.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_left.add(panel_receiptItem);
		panel_receiptItem.setLayout(new BoxLayout(panel_receiptItem, BoxLayout.Y_AXIS));
		
		JPanel panel_newItem = new JPanel();
		panel_newItem.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Kassenbon Eintrag hinzuf\u00FCgen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_receiptItem.add(panel_newItem);
		panel_newItem.setLayout(new BoxLayout(panel_newItem, BoxLayout.Y_AXIS));
		
		btnNewItem = new JButton("Eintrag hinzuf\u00FCgen");
		btnNewItem.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_newItem.add(btnNewItem);
		
		JPanel panel_artikelComboBox = new JPanel();
		panel_newItem.add(panel_artikelComboBox);
		
		comboBox_addItem = new JComboBox();
		comboBox_addItem.setFont(new Font("Courier New", Font.PLAIN, 11));
		comboBox_addItem.setModel(new DefaultComboBoxModel(new String[] {"Test", "test2", "dies ist ein sehr langer Text"}));
		comboBox_addItem.setPreferredSize(new Dimension(250, 22));
		comboBox_addItem.setMinimumSize(new Dimension(100, 22));
		panel_artikelComboBox.add(comboBox_addItem);
		
		JPanel panel_artikelTextFields = new JPanel();
		panel_newItem.add(panel_artikelTextFields);
		
		textField_Artikelname = new JTextField();
		textField_Artikelname.setToolTipText("Artikelbezeichnung");
		panel_artikelTextFields.add(textField_Artikelname);
		textField_Artikelname.setColumns(20);
		
		textField_Preis = new JTextField();
		textField_Preis.setToolTipText("Preis");
		panel_artikelTextFields.add(textField_Preis);
		textField_Preis.setColumns(5);
		
		JPanel panel_itemCount = new JPanel();
		panel_newItem.add(panel_itemCount);
		panel_itemCount.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblArtikelZahl = new JLabel("Anzahl Artikel");
		panel_itemCount.add(lblArtikelZahl);
		
		formattedTextField_itemCount = new JFormattedTextField();
		formattedTextField_itemCount.setColumns(5);
		panel_itemCount.add(formattedTextField_itemCount);
		
		JPanel panel_deleteItem = new JPanel();
		panel_deleteItem.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Eintrag l\u00F6schen", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_receiptItem.add(panel_deleteItem);
		panel_deleteItem.setLayout(new BoxLayout(panel_deleteItem, BoxLayout.Y_AXIS));
		
		JPanel panel_ComboBoxDeleteItem = new JPanel();
		panel_deleteItem.add(panel_ComboBoxDeleteItem);
		panel_ComboBoxDeleteItem.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		comboBox_deleteItem = new JComboBox();
		comboBox_deleteItem.setPreferredSize(new Dimension(250, 22));
		comboBox_deleteItem.setMinimumSize(new Dimension(100, 22));
		comboBox_deleteItem.setFont(new Font("Courier New", Font.PLAIN, 11));
		panel_ComboBoxDeleteItem.add(comboBox_deleteItem);
		
		btnDeleteItem = new JButton("Eintrag l\u00F6schen");
		btnDeleteItem.setAlignmentX(0.5f);
		panel_deleteItem.add(btnDeleteItem);
		
		JPanel panel_right = new JPanel();
		splitPane.setRightComponent(panel_right);
		
		receiptTextPane = new JTextPane();
		receiptTextPane.setFont(new Font("Courier New", Font.PLAIN, 11));
		panel_right.add(receiptTextPane);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextField_verkaeufer() {
		return txtField_Verkaeufer;
	}

	public JTextPane getReceiptTextPane() {
		return receiptTextPane;
	}

	public JComboBox getComboBox_addItem() {
		return comboBox_addItem;
	}

	public JFormattedTextField getFormattedTextField_itemCount() {
		return formattedTextField_itemCount;
	}
	
	
	
	public JComboBox getComboBox_deleteItem() {
		return comboBox_deleteItem;
	}



	public JButton getBtnDeleteItem() {
		return btnDeleteItem;
	}



	public JButton getBtnNewItem() {
		return btnNewItem;
	}


	
	
	public JTextField getTxtField_Verkaeufer() {
		return txtField_Verkaeufer;
	}

	public JButton getBtnSaveBon() {
		return btnSaveBon;
	}

	public JButton getBtnNewBon() {
		return btnNewBon;
	}




	public JTextField getTextField_Artikelname() {
		return textField_Artikelname;
	}

	public JTextField getTextField_Preis() {
		return textField_Preis;
	}




	// aktuell nicht genutzt
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Artikel entfernen");
			putValue(SHORT_DESCRIPTION, "Liste mit Artikeln auf Kassenbon anzeigen, gewählten Artikel löschen");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("SwingAction ausgelöst");
		}
	}
}
