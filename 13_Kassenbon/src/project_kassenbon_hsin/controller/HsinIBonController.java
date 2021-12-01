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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import project_kassenbon.model.Artikel;
import project_kassenbon.model.IBon;
import project_kassenbon.model.sortiment.Produkt;
import project_kassenbon.model.sortiment.Sortiment;
//import project_kassenbon.model.sortiment.Produkt;
//import project_kassenbon.model.sortiment.Sortiment;
//import project_kassenbon_hsin.model.Product;
//import project_kassenbon_hsin.model.Assortment;
import project_kassenbon_hsin.model.Receipt;
import project_kassenbon_hsin.model.ReceiptItem;
import project_kassenbon_hsin.model.sortiment.DB_Storage;
import project_kassenbon_hsin.model.sortiment.DefaultProducts;
import project_kassenbon_hsin.model.sortiment.FileStorage;
import project_kassenbon_hsin.view.MainFrame;


public class HsinIBonController {

	private MainFrame mainFrame;
	private JComboBox<Object> addItemComboBox;
	private JComboBox<Object> deleteItemComboBox;
	private IBon<ReceiptItem, String, String> iBon;
	private Sortiment sortiment;

	private final Action addNewItemAction = new AddNewItemAction();

	public HsinIBonController() {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {

					mainFrame = new MainFrame();
					init();
					mainFrame.setVisible(true);
					mainFrame.getFormattedTextField_id().requestFocusInWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	public void init() {

//		DefaultProducts myStorage = new DefaultProducts();
		FileStorage myStorage = new FileStorage();
//		DB_Storage myStorage = new DB_Storage();
		sortiment = new Sortiment(myStorage);

		iBon = new Receipt();

		iBon.addEintrag(new ReceiptItem(sortiment.getProduktByID(1), 3));
		iBon.addEintrag(new ReceiptItem(sortiment.getProduktByID(2), 5));
		iBon.addEintrag(new ReceiptItem(sortiment.getProduktByID(3), 6));
		iBon.addEintrag(new ReceiptItem(sortiment.getProduktByID(4), 2));

		addItemComboBox = mainFrame.getComboBox_addItem();
		deleteItemComboBox = mainFrame.getComboBox_deleteItem();

		updateGUI();

		mainFrame.getTextField_Artikelname().requestFocusInWindow();

		mainFrame.getBtnNewItem().setAction(addNewItemAction);

		mainFrame.getFormattedTextField_itemCount().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode() == 10)) {
					addNewItemAction.actionPerformed(null);
				}
			}
		});

		mainFrame.getTextField_Artikelname().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode() == 10)) {
					addNewItemAction.actionPerformed(null);
				}
			}
		});

		mainFrame.getFormattedTextField_Preis().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode() == 10)) {
					addNewItemAction.actionPerformed(null);
				}
			}
		});

		mainFrame.getFormattedTextField_id().addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
//				if ((e.getKeyCode() == e.VK_ENTER)) {
					if (mainFrame.getFormattedTextField_id().getText().equals("")) {
						mainFrame.getFormattedTextField_Preis().setValue(0);
						if ((e.getKeyCode() == e.VK_ENTER)) {
							mainFrame.getFormattedTextField_id().setValue(sortiment.getLastId());
							mainFrame.getTextField_Artikelname().setText("Bitte Produktname und Preis eingeben");
							mainFrame.getTextField_Artikelname().requestFocusInWindow();
						} else {
							mainFrame.getTextField_Artikelname().setText("");
						}
						
						
					} else { // ID feld nicht leer
						Produkt produkt = sortiment.getProduktByID(Integer.parseInt(mainFrame.getFormattedTextField_id().getText()));
						System.out.println(produkt);
						if (produkt != null) {
							mainFrame.getTextField_Artikelname().setText(produkt.getBezeichnung());
							mainFrame.getFormattedTextField_Preis().setValue((produkt.getPreis()));
						} else {
							mainFrame.getTextField_Artikelname().setText("");
							mainFrame.getFormattedTextField_Preis().setValue(0);
						}
						if ((e.getKeyCode() == e.VK_ENTER)) {
							mainFrame.getTextField_Artikelname().requestFocusInWindow();
//							System.out.println(e.getKeyCode());
						}
					}
//				} else { // andere Taste als Enter gedr�ckt
//					
//					if (mainFrame.getFormattedTextField_id().getText().equals("")) {
//
//					} else {
//						Produkt produkt = sortiment.getProduktByID(Integer.parseInt(mainFrame.getFormattedTextField_id().getText()));
//						System.out.println(produkt);
//						if (produkt != null) {
//							mainFrame.getTextField_Artikelname().setText(produkt.getBezeichnung());
//							mainFrame.getFormattedTextField_Preis().setValue((produkt.getPreis()));
//						} else {
//							mainFrame.getTextField_Artikelname().setText("");
//							mainFrame.getFormattedTextField_Preis().setValue(0);
//
//						}
//
//					}

//				}
			}
		});

		// Action Listener

		mainFrame.getBtnDeleteProdukt().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Produkt toDeleteProdukt = (Produkt) addItemComboBox.getSelectedItem();
				sortiment.entfernen(toDeleteProdukt);
				updateGUI();
			}
		});

		mainFrame.getBtnDeleteItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiptItem toDeleteReceiptItem = (ReceiptItem) deleteItemComboBox.getSelectedItem();
//				System.out.println(toDeleteReceiptItem);
				iBon.removeEintrag(toDeleteReceiptItem);
				updateGUI();
			}
		});

		mainFrame.getBtnSaveBon().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String newVerkaeuferName = mainFrame.getTxtField_Verkaeufer().getText();
				iBon.setVerkaeufer(newVerkaeuferName);
				updateGUI();
			}
		});

		mainFrame.getBtnNewBon().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				iBon.resetEintraege();
				updateGUI();
			}
		});

		addItemComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mainFrame.getTextField_Artikelname().setText(((Produkt) addItemComboBox.getSelectedItem()).getBezeichnung());
				mainFrame.getFormattedTextField_Preis().setValue((((Produkt) addItemComboBox.getSelectedItem()).getPreis()));
				mainFrame.getFormattedTextField_id().setValue(((Produkt) addItemComboBox.getSelectedItem()).getId());
				mainFrame.getFormattedTextField_itemCount().requestFocusInWindow();

				// updateGUI();

			}
		});

	}

	private void updateGUI() {
		addItemComboBox.setModel(new DefaultComboBoxModel(sortiment.getSortiment().toArray()));
		deleteItemComboBox.setModel(new DefaultComboBoxModel(iBon.getEintraege().toArray()));
		mainFrame.getReceiptTextPane().setText(iBon.toString());
		mainFrame.getFormattedTextField_itemCount().setText("1");
	}

	private Produkt getProduktByName(String name) {
		for (Produkt produkt : sortiment.getSortiment()) {
			if (produkt.getBezeichnung().equalsIgnoreCase(name)) {
				return produkt;
			}
		}
		return null;

	}

	public class AddNewItemAction extends AbstractAction {
		public AddNewItemAction() {
			putValue(NAME, "Eintrag hinzuf�gen");
			putValue(SHORT_DESCRIPTION, "F�gt einen Eintrag dem Kassenbon hinzu, ggf. auch einem Artikel dem Sortiment");
		}

		public void actionPerformed(ActionEvent e) {
			if (mainFrame.getTextField_Artikelname().getText().equals("")) {
				System.out.println("Artikelbezeichnung darf nicht leer sein");
				return;
			}
			if (mainFrame.getFormattedTextField_id().getText().equals("")) {
				System.out.println("ID Feld darf nicht leer sein");
				return;
			}
//			Produkt produktToAdd = getProduktByName(mainFrame.getTextField_Artikelname().getText());
			int newID = Integer.parseInt(mainFrame.getFormattedTextField_id().getText());
			Produkt produktToAdd =  sortiment.getProduktByID(newID);
			if (produktToAdd == null) {
				NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
				Number preisNumber = 0;
				try {
					preisNumber = numberFormat.parse(mainFrame.getFormattedTextField_Preis().getText());
				} catch (ParseException e1) {
					System.out.println("Exception catched, unable to parse number, no product added");
					e1.printStackTrace();
					return;
				}
				double preisDouble = preisNumber.doubleValue();
				
				newID = sortiment.getLastId();
				
				produktToAdd = new Produkt(mainFrame.getTextField_Artikelname().getText(), preisDouble, newID);
				sortiment.hinzufuegen(produktToAdd);

			}
			int itemCount;
			if (mainFrame.getFormattedTextField_itemCount().getText().equals("")) {
				itemCount=0;
			} else {
				itemCount = Integer.parseInt(mainFrame.getFormattedTextField_itemCount().getText());
			}
			if (itemCount < 1) {
				updateGUI();
				return;
			}
			ReceiptItem toAddReceiptItem = new ReceiptItem(produktToAdd, itemCount);
			iBon.addEintrag(toAddReceiptItem);
			updateGUI();
		}
	}

}
