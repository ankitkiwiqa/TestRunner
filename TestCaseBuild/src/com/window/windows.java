package com.window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneLayout;

import javax.swing.border.LineBorder;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class windows {

	private JFrame frame;
	JFileChooser filechooser = new JFileChooser();
	JLabel lblNoFileSelected = new JLabel("No file Selected");
	JPanel panel = new JPanel();
	JPanel panel_Total_Test = new JPanel();
	File indexsuite = new File("c:/");
	final JScrollPane panel_CheckBox = new JScrollPane();
	List<Element> nodes = new ArrayList<Element>();
	ArrayList<String> xmlread = new ArrayList<String>();
	static ArrayList<String> testname = new ArrayList<String>();
	ArrayList<JCheckBox> box = new ArrayList<JCheckBox>();

	private final JPanel panel_2 = new JPanel();
	private final JButton btnBuild = new JButton("Build");
	private final JLabel lblTotalTestcases = new JLabel("Total TestCases");
	private final JLabel label_total_val = new JLabel("0");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windows window = new windows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLocationByPlatform(true);
		frame.setBounds(100, 100, 666, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 650,
						Short.MAX_VALUE)
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(panel_Total_Test,
										GroupLayout.PREFERRED_SIZE, 457,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(panel_2,
										GroupLayout.DEFAULT_SIZE, 155,
										Short.MAX_VALUE).addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addComponent(panel,
												GroupLayout.PREFERRED_SIZE, 75,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_Total_Test,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_2,
																				GroupLayout.DEFAULT_SIZE,
																				383,
																				Short.MAX_VALUE)
																		.addGap(25)))));

		JButton btnLoadTests = new JButton("Load Tests");
		btnLoadTests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					DocumentFactory df = new DocumentFactory().getInstance();
					SAXReader reader = new SAXReader(df);
					Document doc = reader.read(indexsuite);
					Element root = doc.getRootElement();
					// lbl_select.setText(root.getName());
					nodes = root.selectNodes("test");

					label_total_val.setText(String.valueOf(nodes.size()));

					// final JFrame frame = new JFrame("Test");
					//panel_CheckBox.setLayout(new ScrollPaneLayout());
					 panel_CheckBox.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				       panel_CheckBox.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
					
					for (int i = 0; i < nodes.size(); i++) {
						System.out.println(nodes.get(i).attribute("name")
								.getValue());

						JCheckBox j_cb = new JCheckBox(nodes.get(i)
								.attribute("name").getValue());
						box.add(j_cb);

						panel_CheckBox.add(j_cb);
						panel_CheckBox.validate();
						panel_CheckBox.repaint();
						// System.out.println("here");

					}

					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					// frame.setSize(400, 800);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_panel_2
						.createSequentialGroup()
						.addContainerGap(40, Short.MAX_VALUE)
						.addGroup(
								gl_panel_2
										.createParallelGroup(
												Alignment.TRAILING, false)
										.addComponent(btnLoadTests,
												Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnBuild,
												Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE, 96,
												Short.MAX_VALUE)).addGap(19)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addGap(24)
						.addComponent(btnLoadTests, GroupLayout.PREFERRED_SIZE,
								37, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnBuild, GroupLayout.PREFERRED_SIZE, 36,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(247, Short.MAX_VALUE)));
		btnBuild.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int k = 0;
				for (int i = 0; i < box.size(); i++) {
					if (box.get(i).isSelected()) {
						testname.add(box.get(i).getText());
					}
				}

				try {
					String line = "";
					BufferedReader br = new BufferedReader(new FileReader(
							indexsuite));
					FileWriter fw = new FileWriter(
							"D:/testsuite/new_testsuite.xml");
					// line = br.readLine();
					String pattern1 = "(<test)(.*)";

					while ((line = br.readLine()) != null) {
						Pattern p = Pattern.compile(pattern1);
						Matcher m = p.matcher(line);
						if (m.find()) {
							break;
						}
						fw.write(line + "\n");
						System.out.println("line : " + line);
					}

				

					
					while (line != null) {

						try {

							String pattern2 = "(.*)(" + testname.get(k)
									+ ")(.*)";
						//	System.out.println("pattern Line :"+line);
				//System.out.println("pattern "+pattern2);
							Pattern p = Pattern.compile(pattern2);
							Matcher m = p.matcher(line);

						if(!line.trim().equals(""))
						{
							if (m.find()) {
								System.out.println("match : " + line);
								String pattern3 = "(.*)(</test>)(.*)";
								Pattern p2 = Pattern.compile(pattern3);
								Matcher m2 = p2.matcher(line);
								while (!m2.find()) {

									// System.out.println("========found=== "+line);

									System.out.println("Line Writen : "+line);
									fw.write(line + "\n");
									m2 = p2.matcher(line);
									line = br.readLine();
									
								}
								k++;
							
							} else {
								System.out.println("in Else code===========");
								System.out.println("match : " + line);
								String pattern3 = "(.*)(</test>)(.*)";
								Pattern p2 = Pattern.compile(pattern3);
								Matcher m2 = p2.matcher(line);
								while (!m2.find()) {

									// System.out.println("========found=== "+line);

									 System.out.println("not writen : "+line);

									m2 = p2.matcher(line);
									line = br.readLine();

								}

							}
						}
						} catch (IndexOutOfBoundsException e) {
							System.out.println("Index out of bund is thrown");
						}
						
						  
						line = br.readLine();
						 fw.write(line+"\n");
					}

					
					fw.close();
					br.close();
					for (int j = 0; j < box.size(); j++) {
						if (box.get(j).isSelected()) {
							System.out.println("is :" + box.get(j).getText());
						}
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		panel_2.setLayout(gl_panel_2);

		GroupLayout gl_panel_Total_Test = new GroupLayout(panel_Total_Test);
		gl_panel_Total_Test
				.setHorizontalGroup(gl_panel_Total_Test
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_Total_Test
										.createSequentialGroup()
										.addGap(26)
										.addGroup(
												gl_panel_Total_Test
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_CheckBox,
																GroupLayout.PREFERRED_SIZE,
																397,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_panel_Total_Test
																		.createSequentialGroup()
																		.addComponent(
																				lblTotalTestcases)
																		.addGap(47)
																		.addComponent(
																				label_total_val)))
										.addContainerGap(34, Short.MAX_VALUE)));
		panel_CheckBox.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		gl_panel_Total_Test
				.setVerticalGroup(gl_panel_Total_Test
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_Total_Test
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_Total_Test
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblTotalTestcases)
														.addComponent(
																label_total_val))
										.addGap(44)
										.addComponent(panel_CheckBox,
												GroupLayout.PREFERRED_SIZE,
												304, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(24, Short.MAX_VALUE)));
		
		JScrollPane scrollPane_check = new JScrollPane();
		GroupLayout gl_panel_CheckBox = new GroupLayout(panel_CheckBox);
		gl_panel_CheckBox.setHorizontalGroup(
			gl_panel_CheckBox.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_check, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
		);
		gl_panel_CheckBox.setVerticalGroup(
			gl_panel_CheckBox.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_check, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
		);
		gl_panel_CheckBox.setAutoCreateContainerGaps(true);
		//panel_CheckBox.setLayout(gl_panel_CheckBox);
		panel_Total_Test.setLayout(gl_panel_Total_Test);

		JButton btnNewButton = new JButton("Select TestCase File");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File file = new File("c:/");
				filechooser.setCurrentDirectory(file);
				filechooser.showOpenDialog(panel);
				int retVal = filechooser.APPROVE_OPTION;
				if (retVal == JFileChooser.APPROVE_OPTION) {
					lblNoFileSelected.setText(filechooser.getSelectedFile()
							.getAbsolutePath());
					indexsuite = filechooser.getSelectedFile();
				}

				JCheckBox j_ck = new JCheckBox("new_ck");
				panel_Total_Test.add(j_ck);
				panel_Total_Test.revalidate();
			}
		});

		lblNoFileSelected.setName("lbl_file_select");
		lblNoFileSelected.setLabelFor(btnNewButton);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup().addGap(74)
						.addComponent(btnNewButton).addGap(79)
						.addComponent(lblNoFileSelected)
						.addContainerGap(294, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(32)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblNoFileSelected)
												.addComponent(btnNewButton))
								.addContainerGap(131, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
