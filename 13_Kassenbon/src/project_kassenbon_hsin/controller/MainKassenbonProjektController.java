package project_kassenbon_hsin.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

import project_kassenbon_hsin.model.Artikel;
import project_kassenbon_hsin.model.Artikelliste;
import project_kassenbon_hsin.model.Receipt;
import project_kassenbon_hsin.model.ReceiptItem;
import project_kassenbon_hsin.view.MainFrame;

public class MainKassenbonProjektController {

	private MainFrame mainFrame;
	private JComboBox addItemComboBox;
	private JComboBox deleteItemComboBox;
	private Receipt receipt;
	
	private final Action addNewItemAction = new AddNewItemAction();

	public MainKassenbonProjektController() {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					mainFrame = new MainFrame();
					init();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void init() {
		
		
		receipt = new Receipt();
		receipt.addReceiptItem(1, 3);
		receipt.addReceiptItem(2, 5);
		receipt.addReceiptItem(3, 6);
		receipt.addReceiptItem(4, 2);

		System.out.println(receipt);

		addItemComboBox = mainFrame.getComboBox_addItem();

		deleteItemComboBox = mainFrame.getComboBox_deleteItem();

		updateGUI();
		
		mainFrame.getBtnNewItem().setAction(addNewItemAction);
		
		mainFrame.getFormattedTextField_itemCount().addKeyListener(new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
//				System.out.println(e.getKeyCode());
				if ((e.getKeyCode() == 10)) {
					addNewItemAction.actionPerformed(null);
				}
			}
		});

		mainFrame.getTextField_Artikelname().addKeyListener(new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
//				System.out.println(e.getKeyCode());
				if ((e.getKeyCode() == 10)) {
					addNewItemAction.actionPerformed(null);
				}
			}
		});

		mainFrame.getBtnDeleteItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiptItem toDeleteReceiptItem = (ReceiptItem) deleteItemComboBox.getSelectedItem();
//				System.out.println(toDeleteReceiptItem);
				receipt.remove(toDeleteReceiptItem);
				updateGUI();
			}
		});

	

		mainFrame.getBtnSaveBon().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String newVerkaeuferName = mainFrame.getTxtField_Verkaeufer().getText();
				receipt.setVerkaeufer(newVerkaeuferName);
				updateGUI();
			}
		});
		
		mainFrame.getBtnNewBon().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				receipt.resetReceiptItemList();
				updateGUI();
			}
		});
		
		addItemComboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getTextField_Artikelname().setText(((Artikel) addItemComboBox.getSelectedItem()).getName());
				mainFrame.getFormattedTextField_Preis().setValue((((Artikel) addItemComboBox.getSelectedItem()).getPreis()));
				//updateGUI();
				
			}
		});
		

	}
	
	
	
	private void updateGUI() {
		addItemComboBox.setModel(new DefaultComboBoxModel(receipt.getArtikelliste().getListe().toArray()));
		deleteItemComboBox.setModel(new DefaultComboBoxModel(receipt.getReceiptItemList().toArray()));
		mainFrame.getReceiptTextPane().setText(receipt.toString());
		mainFrame.getFormattedTextField_itemCount().setText("1");
	}

	public class AddNewItemAction extends AbstractAction{
		public AddNewItemAction() {
			putValue(NAME, "Eintrag hinzufügen");
			putValue(SHORT_DESCRIPTION, "Fügt einen Eintrag dem Kassenbon hinzu, ggf. auch einem Artikel dem Sortiment");
		}

		public void actionPerformed(ActionEvent e) {
			Artikel toAddArtikel = receipt.getArtikelliste().getArtikelByName(mainFrame.getTextField_Artikelname().getText());
			if (toAddArtikel == null) {
				NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
				Number preisNumber = 0;
				try {
					preisNumber = numberFormat.parse(mainFrame.getFormattedTextField_Preis().getText());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					System.out.println("Exception catched");
					e1.printStackTrace();
				}
				double preisDouble = preisNumber.doubleValue();
				receipt.getArtikelliste().addArtikel(mainFrame.getTextField_Artikelname().getText(), preisDouble);
				toAddArtikel = receipt.getArtikelliste().getArtikelByName(mainFrame.getTextField_Artikelname().getText());
			}
			ReceiptItem toAddReceiptItem = new ReceiptItem(toAddArtikel,
					Integer.parseInt(mainFrame.getFormattedTextField_itemCount().getText()));
			receipt.addReceiptItem(toAddReceiptItem);
			updateGUI();
		}
	}

	
}
