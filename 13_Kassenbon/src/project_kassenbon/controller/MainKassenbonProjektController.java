package project_kassenbon.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

import project_kassenbon.model.Artikel;
import project_kassenbon.model.Receipt;
import project_kassenbon.model.ReceiptItem;
import project_kassenbon.view.MainFrame;


public class MainKassenbonProjektController {


	private MainFrame mainFrame;
	private JComboBox addItemComboBox;
	private JComboBox deleteItemComboBox;
	private Receipt receipt;
	
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
		
		Artikel.addArtikel("15 Fischstäbchen", 1.79);
		Artikel.addArtikel("Steaks", 3.99);
		Artikel.addArtikel("Naturell (1l)", 4.99);
		Artikel.addArtikel("Magnum Eiscreme", 2.99);
		
		for (int i = 1; i <= 10; i++) {
			Artikel.addArtikel("Random Artikel " + i, 10.99 + i);
		}
		

		receipt = new Receipt();
		receipt.addReceiptItem(1, 3);
		receipt.addReceiptItem(2, 5);
		receipt.addReceiptItem(3, 6);
		receipt.addReceiptItem(4, 2);
		
		System.out.println(receipt);
		
		addItemComboBox = mainFrame.getComboBox_addItem();
//		addItemComboBox.setModel(new DefaultComboBoxModel(Artikel.getArtikelListe().toArray()));
		
//		mainFrame.getReceiptTextPane().setText(receipt.toString()); // später in eigene Methode auslagern
		
		
		deleteItemComboBox = mainFrame.getComboBox_deleteItem();
//		deleteItemComboBox.setModel(new DefaultComboBoxModel(receipt.getReceiptItemList().toArray()));
		
		updateGUI();
		
		mainFrame.getBtnDeleteItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiptItem toDeleteReceiptItem = (ReceiptItem) deleteItemComboBox.getSelectedItem();
//				System.out.println(toDeleteReceiptItem);
				receipt.remove(toDeleteReceiptItem);
				updateGUI();
			}
		});
		
		mainFrame.getBtnNewItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiptItem toAddReceiptItem = new ReceiptItem((Artikel) addItemComboBox.getSelectedItem(), Integer.parseInt(mainFrame.getFormattedTextField_itemCount().getText()));
				receipt.addReceiptItem(toAddReceiptItem);
				updateGUI();
			}
		});
		
	}
	
	private void updateGUI() {
		addItemComboBox.setModel(new DefaultComboBoxModel(Artikel.getArtikelListe().toArray()));
		deleteItemComboBox.setModel(new DefaultComboBoxModel(receipt.getReceiptItemList().toArray()));         
		mainFrame.getReceiptTextPane().setText(receipt.toString()); 
		mainFrame.getFormattedTextField_itemCount().setText("1");
	}
	
}
