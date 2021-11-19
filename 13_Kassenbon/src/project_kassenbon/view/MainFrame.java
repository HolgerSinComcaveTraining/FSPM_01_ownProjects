package project_kassenbon.view;

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
	private JTextField textField_verkaeufer;
	private JComboBox comboBox_addItem;
	private JFormattedTextField formattedTextField_itemCount;
	private final Action action = new SwingAction();
	private JComboBox comboBox_deleteItem;
	private JButton btnDeleteItem;
	private JButton btnNewItem;
	private JTextPane receiptTextPane;
	

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
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_receipt = new JPanel();
		panel_receipt.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.add(panel_receipt);
		panel_receipt.setLayout(new BoxLayout(panel_receipt, BoxLayout.Y_AXIS));
		
		JButton btnNewBon = new JButton("Neuer Kassenbon");
		panel_receipt.add(btnNewBon);
		
		JButton btnSaveBon = new JButton("Kassenbon speichern");
		panel_receipt.add(btnSaveBon);
		
		JPanel panel__verkaeufer = new JPanel();
		panel__verkaeufer.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_receipt.add(panel__verkaeufer);
		panel__verkaeufer.setLayout(new BoxLayout(panel__verkaeufer, BoxLayout.Y_AXIS));
		
		JLabel lblVerkaeufer = new JLabel("Verk\u00E4ufer");
		panel__verkaeufer.add(lblVerkaeufer);
		
		JPanel panel_verkauferTextField = new JPanel();
		panel__verkaeufer.add(panel_verkauferTextField);
		
		textField_verkaeufer = new JTextField();
		textField_verkaeufer.setColumns(15);
		panel_verkauferTextField.add(textField_verkaeufer);
		
		JPanel panel_receiptItem = new JPanel();
		panel_receiptItem.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.add(panel_receiptItem);
		panel_receiptItem.setLayout(new BoxLayout(panel_receiptItem, BoxLayout.Y_AXIS));
		
		JPanel panel_newItem = new JPanel();
		panel_newItem.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Artikel eingeben", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		panel_receiptItem.add(panel_newItem);
		panel_newItem.setLayout(new BoxLayout(panel_newItem, BoxLayout.Y_AXIS));
		
		btnNewItem = new JButton("Artikel hinzuf\u00FCgen");
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
		
		JPanel panel_itemCount = new JPanel();
		panel_newItem.add(panel_itemCount);
		panel_itemCount.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblArtikelZahl = new JLabel("Anzahl Artikel");
		panel_itemCount.add(lblArtikelZahl);
		
		formattedTextField_itemCount = new JFormattedTextField();
		formattedTextField_itemCount.setColumns(5);
		panel_itemCount.add(formattedTextField_itemCount);
		
		JPanel panel_deleteItem = new JPanel();
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
		
		btnDeleteItem = new JButton("Artikel l\u00F6schen");
		panel_receiptItem.add(btnDeleteItem);
		btnDeleteItem.setAlignmentX(0.5f);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		
		receiptTextPane = new JTextPane();
		receiptTextPane.setFont(new Font("Courier New", Font.PLAIN, 11));
		panel_1.add(receiptTextPane);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextField_verkaeufer() {
		return textField_verkaeufer;
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
