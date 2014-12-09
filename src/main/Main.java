package main;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	static JFrame frame;
	JButton server;
	JButton client;
	
	public Main(){
		frame = new JFrame();
		frame.pack();
		frame.setSize(299,100);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setTitle("Messenger");
		frame.setVisible(true);
		
		server = new JButton();
		server.setLocation(10,5);
		server.setSize(new Dimension(135, 60));
		server.setText("Erstelle Server");
		frame.add(server);
		server.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
					servercreate();
			}
		});
		
		client = new JButton();
		client.setLocation(150, 5);
		client.setSize(new Dimension(135, 60));
		client.setText("Erstelle Client");
		frame.add(client);
		client.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				clientcreate();
			}
		});
	}
	public static void main(String[] args) {
		new Main();
		frame.setSize(300,100);

	}
	
	public void servercreate(){
		//new Server();
	}
	
	public void clientcreate(){
		//new Client();
	}

}
