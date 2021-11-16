package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Kunde;
import model.Kundenspeicher;
import view.MainFrame;

public class MainController {
	
	private MainFrame mainFrame;
	private Kundenspeicher kundenspeicher;
	private int counter = 0;
	
	public MainController() {
		
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
		kundenspeicher = new Kundenspeicher();
		for (int i = 0; i < 10; i++) {
			kundenspeicher.add(new Kunde("Max " + i, "Mustermann" + i, "Bielefeld " + i*2));
		}
		mainFrame.getContenPanel().getBtn_east().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainFrame.getContenPanel().getTxtF_center_vorname().setText(kundenspeicher.getKundenListe().get(counter).getVorname());
				mainFrame.getContenPanel().getTxtF_center_name().setText(kundenspeicher.getKundenListe().get(counter).getName());
				mainFrame.getContenPanel().getTxtF_center_adresse().setText(kundenspeicher.getKundenListe().get(counter).getAdresse());
				counter++;
				if (counter == kundenspeicher.getKundenListe().size()) {
					counter = 0;
				}
			}
		});
		mainFrame.getContenPanel().getBtn_east().setText("next");
	}
	
	
	
}
