package CV;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;


public class Generateur_CV {
	//declaration des Inputs et les champs de combobox

	JFrame frmResumebuilder;
	private JTextField prenom;
	private JTextField nom;
	private JTextField email;
	private JTextField phonenum;
	private JTextField desig1;
	private JTextField comp2;
	private JTextField desig2;
	private JTextField comp3;
	private JTextField desig3;
	private JTextField comp4;
	private JTextField desig4;
	private JTextField comskill1;
	private JTextField comskill2;
	private JTextField comskill3;
	private JTextField comskill4;
	private JTextField lang3;
	private JTextField lang4;
	private JTextField lang2;
	private JTextField lang1;
	private JTextField sports1;
	private JTextField sports2;
	public String date[]= {"__","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
	public String month[]= {"__","Janvier","Fevrier","Mars","Avril","Mai","juin","Juillet","Aout","Septembre","octobre","Novembre","Decembre"};
	public String Year[]= {"__","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year1[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year2[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year3[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year4[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year5[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year6[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year7[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year8[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year9[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year10[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year11[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Year12[]= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
	public String Matric[]= {"Financiere","Security","Compta","Info"};
	public String Inter[]= {"Systemes Info","Cyber security","Finance","Comptabilite"};
	public String Uni[]= {"__","SC.SVT","SC.PC","SC.MATH","LETTER","ECO"};
	public String grade[]= {"Passable","Assez Bien"," Bien","Très Bien"};
	public String s;
	public String n;
	public String filename;
			int temp1;
	
	
	
	// démarrage de l'interface graphique de l'application.
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generateur_CV window = new Generateur_CV();
					window.frmResumebuilder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Creation de  lapplication.
	 */
	public Generateur_CV() {
		initialize();
	}

	/**
	 * Initialiser le contenu du frame.getExtendedState(
	 */
	@SuppressWarnings("unchecked")
	//creation de l'interface graphique
	private void initialize() {
		frmResumebuilder = new JFrame();
		frmResumebuilder.getContentPane().setBackground(new Color(205, 205, 205));
		frmResumebuilder.getContentPane().addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
			}
		});
		frmResumebuilder.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				
			}
		});
		frmResumebuilder.setTitle("Generateur_fichier_CV");
		frmResumebuilder.addWindowListener(new WindowAdapter() {
			
			
			public void windowOpened(WindowEvent e) {
				frmResumebuilder.setExtendedState(frmResumebuilder.getExtendedState()|JFrame.MAXIMIZED_BOTH);
			}
		});
		frmResumebuilder.setBounds(100, 100, 1300, 790);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("icon.png"));
		frmResumebuilder.setIconImage(icon1.getImage());
		frmResumebuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResumebuilder.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layeredPane.setForeground(new Color(50, 205, 50));
		layeredPane.setBounds(10, 58, 345, 311);
		frmResumebuilder.getContentPane().add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 205, 205));
		panel.setBounds(10, 11, 325, 290);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFullName = new JLabel("Nom:");
		lblFullName.setBounds(10, 11, 72, 25);
		panel.add(lblFullName);
		
		setFullname(new JTextField());
		getFullname().setBounds(92, 11, 223, 25);
		panel.add(getFullname());
		getFullname().setColumns(10);
		
		JLabel lblFatherName = new JLabel("Prenom:");
		lblFatherName.setBounds(10, 47, 48, 25);
		panel.add(lblFatherName);
		
		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.LEFT);
		nom.setBounds(92, 47, 223, 25);
		panel.add(nom);
		nom.setColumns(10);
		
		JLabel lblPhone = new JLabel("Num Tele:");
		lblPhone.setBounds(10, 83, 72, 25);
		panel.add(lblPhone);
		
		phonenum = new JTextField();
		phonenum.setHorizontalAlignment(SwingConstants.LEFT);
		phonenum.setBounds(92, 83, 223, 25);
		panel.add(phonenum);
		phonenum.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(10, 119, 72, 25);
		panel.add(lblEmail);
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.LEFT);
		email.setForeground(new Color(30, 144, 255));
		email.setBounds(92, 121, 223, 23);
		panel.add(email);
		email.setColumns(10);
		
		JLabel lblDob = new JLabel("D.D.N :");
		lblDob.setBounds(10, 165, 48, 14);
		panel.add(lblDob);
		
		JLabel lblDay = new JLabel("Jour");
		lblDay.setBounds(92, 145, 48, 14);
		panel.add(lblDay);
		
		JLabel lblMonth = new JLabel("Mois");
		lblMonth.setBounds(164, 145, 48, 14);
		panel.add(lblMonth);
		
		JLabel lblYear = new JLabel("Anne");
		lblYear.setBounds(243, 145, 48, 14);
		panel.add(lblYear);
		
		@SuppressWarnings("rawtypes")
		JComboBox dob = new JComboBox();
		dob.setEditable(true);
		dob.setBounds(92, 161, 48, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel dm = new DefaultComboBoxModel(date);
		dob.setModel(dm);
		panel.add(dob);
		
		@SuppressWarnings("rawtypes")
		JComboBox mob = new JComboBox();
		mob.setEditable(true);
		mob.setBounds(143, 161, 95, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel mo=new DefaultComboBoxModel(month);
		mob.setModel(mo);
		panel.add(mob);
		
		@SuppressWarnings("rawtypes")
		JComboBox yob = new JComboBox();
		yob.setEditable(true);
		yob.setBounds(243, 161, 72, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr = new DefaultComboBoxModel(Year);
		yob.setModel(yr);
		panel.add(yob);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 214, 60, 14);
		panel.add(lblAddress);
		
		JTextArea address = new JTextArea();
		address.setBounds(92, 209, 211, 69);
		panel.add(address);
		
		JLabel lblPersonalInformation = new JLabel("Information personnel:");
		lblPersonalInformation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPersonalInformation.setBounds(21, 33, 142, 22);
		frmResumebuilder.getContentPane().add(lblPersonalInformation);
		
		JLabel lblAcademicQualification = new JLabel("Qualification académique:");
		lblAcademicQualification.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblAcademicQualification.setBounds(21, 380, 153, 22);
		frmResumebuilder.getContentPane().add(lblAcademicQualification);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(205, 205, 205));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 407, 345, 296);
		frmResumebuilder.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(172, 5, 1, 1);
		panel_1.add(layeredPane_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBackground(new Color(135, 206, 250));
		layeredPane_2.setBounds(10, 17, 325, 275);
		panel_1.add(layeredPane_2);
		
		JLabel lblGraduation = new JLabel("BACCALAUREAT:");
		lblGraduation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblGraduation.setBounds(115, 11, 130, 22);
		layeredPane_2.add(lblGraduation);
		
		JLabel lblProgram = new JLabel("Spécialité:");
		lblProgram.setBounds(10, 35, 81, 22);
		layeredPane_2.add(lblProgram);
		
		@SuppressWarnings("rawtypes")
		JComboBox graduation_pro = new JComboBox();
		graduation_pro.setEditable(true);
		graduation_pro.setBackground(new Color(255, 255, 255));
		graduation_pro.setBounds(0, 60, 129, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel gp=new DefaultComboBoxModel(Uni);
		graduation_pro.setModel(gp);
		layeredPane_2.add(graduation_pro);
		
		JLabel lblCgpa = new JLabel("Mentions:");
		lblCgpa.setBounds(138, 38, 60, 15);
		layeredPane_2.add(lblCgpa);
		
		@SuppressWarnings("rawtypes")
		JComboBox cgpa = new JComboBox();
		cgpa.setEditable(true);
		cgpa.setBounds(139, 60, 80, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel Grade=new DefaultComboBoxModel(grade);
		cgpa.setModel(Grade);
		layeredPane_2.add(cgpa);
		
		JLabel lblPassingYear = new JLabel("Anne:");
		lblPassingYear.setBounds(220, 35, 94, 22);
		layeredPane_2.add(lblPassingYear);
		
		@SuppressWarnings("rawtypes")
		JComboBox graduation_Year = new JComboBox();
		graduation_Year.setEditable(true);
		graduation_Year.setBounds(220, 60, 81, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr1 = new DefaultComboBoxModel(Year1);
		graduation_Year.setModel(yr1);
		layeredPane_2.add(graduation_Year);
		
		JLabel lblIntermadiate = new JLabel(" LICENCE:");
		lblIntermadiate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblIntermadiate.setBounds(115, 93, 118, 26);
		layeredPane_2.add(lblIntermadiate);
		
		JLabel lblCourse = new JLabel("Spécialité:");
		lblCourse.setBounds(10, 119, 85, 22);
		layeredPane_2.add(lblCourse);
		
		JLabel lblGrade = new JLabel("Mentions:");
		lblGrade.setBounds(138, 119, 85, 22);
		layeredPane_2.add(lblGrade);
		
		JLabel lblPassingYear_1 = new JLabel("Anne:");
		lblPassingYear_1.setBounds(220, 119, 81, 22);
		layeredPane_2.add(lblPassingYear_1);
		
		@SuppressWarnings("rawtypes")
		JComboBox inter_program = new JComboBox();
		inter_program.setEditable(true);
		inter_program.setBounds(0, 142, 129, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel ip=new DefaultComboBoxModel(Inter);
		inter_program.setModel(ip);
		layeredPane_2.add(inter_program);
		
		@SuppressWarnings("rawtypes")
		JComboBox Inter_grade = new JComboBox();
		Inter_grade.setEditable(true);
		Inter_grade.setBounds(139, 142, 80, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel Grade1=new DefaultComboBoxModel(grade);
		Inter_grade.setModel(Grade1);
		layeredPane_2.add(Inter_grade);
		
		@SuppressWarnings("rawtypes")
		JComboBox inter_year = new JComboBox();
		inter_year.setEditable(true);
		inter_year.setBounds(220, 142, 81, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr2 = new DefaultComboBoxModel(Year2);
		inter_year.setModel(yr2);
		layeredPane_2.add(inter_year);
		
		JLabel lblMatriculation = new JLabel(" MASTER:");
		lblMatriculation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMatriculation.setBounds(115, 175, 118, 22);
		layeredPane_2.add(lblMatriculation);
		
		JLabel lblCourse_1 = new JLabel("ingenierie:");
		lblCourse_1.setBounds(10, 204, 80, 14);
		layeredPane_2.add(lblCourse_1);
		
		JLabel lblGrade_1 = new JLabel("Grade:");
		lblGrade_1.setBounds(138, 204, 48, 14);
		layeredPane_2.add(lblGrade_1);
		
		JLabel lblPassingYear_2 = new JLabel("Anne:");
		lblPassingYear_2.setBounds(220, 204, 81, 14);
		layeredPane_2.add(lblPassingYear_2);
		
		@SuppressWarnings("rawtypes")
		JComboBox matric_course = new JComboBox();
		matric_course.setEditable(true);
		matric_course.setBounds(0, 229, 129, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel mp=new DefaultComboBoxModel(Matric);
		matric_course.setModel(mp);
		layeredPane_2.add(matric_course);
		
		@SuppressWarnings("rawtypes")
		JComboBox matric_Grade = new JComboBox();
		matric_Grade.setEditable(true);
		matric_Grade.setBounds(139, 229, 80, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel Grade2=new DefaultComboBoxModel(grade);
		matric_Grade.setModel(Grade2);
		layeredPane_2.add(matric_Grade);
		
		@SuppressWarnings("rawtypes")
		JComboBox matric_year = new JComboBox();
		matric_year.setEditable(true);
		matric_year.setBounds(220, 229, 81, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr3 = new DefaultComboBoxModel(Year3);
		matric_year.setModel(yr3);
		layeredPane_2.add(matric_year);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layeredPane_3.setBounds(365, 58, 622, 311);
		frmResumebuilder.getContentPane().add(layeredPane_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(205, 205, 205));
		panel_2.setBounds(10, 11, 602, 289);
		layeredPane_3.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCompany = new JLabel("Nom d'entreprise:");
		lblCompany.setBounds(35, 11, 124, 32);
		panel_2.add(lblCompany);
		
		JLabel lblDesignation = new JLabel("Lieu:");
		lblDesignation.setBounds(274, 11, 110, 32);
		panel_2.add(lblDesignation);
		
		JLabel lblWorkExperience = new JLabel("Durée");
		lblWorkExperience.setBounds(462, 11, 119, 32);
		panel_2.add(lblWorkExperience);
		
		JTextField comp1 = new JTextField();
		comp1.setBackground(new Color(255, 255, 255));
		comp1.setBounds(35, 41, 228, 23);
		panel_2.add(comp1);
		comp1.setColumns(10);
		
		desig1 = new JTextField();
		desig1.setBackground(new Color(255, 255, 255));
		desig1.setBounds(274, 41, 177, 23);
		panel_2.add(desig1);
		desig1.setColumns(10);
		
		comp2 = new JTextField();
		comp2.setColumns(10);
		comp2.setBounds(35, 93, 228, 24);
		panel_2.add(comp2);
		
		desig2 = new JTextField();
		desig2.setColumns(10);
		desig2.setBounds(274, 93, 177, 24);
		panel_2.add(desig2);
		
		comp3 = new JTextField();
		comp3.setColumns(10);
		comp3.setBounds(35, 153, 228, 23);
		panel_2.add(comp3);
		
		desig3 = new JTextField();
		desig3.setColumns(10);
		desig3.setBounds(274, 153, 177, 23);
		panel_2.add(desig3);
		
		comp4 = new JTextField();
		comp4.setColumns(10);
		comp4.setBounds(35, 213, 228, 21);
		panel_2.add(comp4);
		
		desig4 = new JTextField();
		desig4.setColumns(10);
		desig4.setBounds(274, 213, 177, 21);
		panel_2.add(desig4);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear1 = new JComboBox();
		fromyear1.setEditable(true);
		fromyear1.setBackground(new Color(255, 255, 255));
		fromyear1.setBounds(462, 41, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr4 = new DefaultComboBoxModel(Year4);
		fromyear1.setModel(yr4);
		panel_2.add(fromyear1);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear1 = new JComboBox();
		toyear1.setEditable(true);
		toyear1.setBackground(new Color(255, 255, 255));
		toyear1.setBounds(525, 41, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr5 = new DefaultComboBoxModel(Year5);
		toyear1.setModel(yr5);
		panel_2.add(toyear1);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear2 = new JComboBox();
		fromyear2.setEditable(true);
		fromyear2.setBounds(462, 95, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr6 = new DefaultComboBoxModel(Year6);
		fromyear2.setModel(yr6);
		panel_2.add(fromyear2);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear2 = new JComboBox();
		toyear2.setEditable(true);
		toyear2.setBounds(525, 95, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr7 = new DefaultComboBoxModel(Year7);
		toyear2.setModel(yr7);
		panel_2.add(toyear2);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear3 = new JComboBox();
		fromyear3.setEditable(true);
		fromyear3.setBounds(462, 153, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr8 = new DefaultComboBoxModel(Year8);
		fromyear3.setModel(yr8);
		panel_2.add(fromyear3);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear3 = new JComboBox();
		toyear3.setEditable(true);
		toyear3.setBounds(525, 153, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr9 = new DefaultComboBoxModel(Year9);
		toyear3.setModel(yr9);
		panel_2.add(toyear3);
		
		@SuppressWarnings("rawtypes")
		JComboBox fromyear4 = new JComboBox();
		fromyear4.setEditable(true);
		fromyear4.setBounds(462, 213, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr10 = new DefaultComboBoxModel(Year10);
		fromyear4.setModel(yr10);
		panel_2.add(fromyear4);
		
		@SuppressWarnings("rawtypes")
		JComboBox toyear4 = new JComboBox();
		toyear4.setEditable(true);
		toyear4.setBounds(525, 213, 67, 22);
		@SuppressWarnings("rawtypes")
		DefaultComboBoxModel yr11 = new DefaultComboBoxModel(Year11);
		toyear4.setModel(yr11);
		panel_2.add(toyear4);
		
		JLabel lblExperience = new JLabel("Experience:");
		lblExperience.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblExperience.setBounds(382, 33, 78, 22);
		frmResumebuilder.getContentPane().add(lblExperience);
		
		JLayeredPane photo = new JLayeredPane();
		photo.setBackground(new Color(135, 206, 250));
		photo.setBorder(new LineBorder(new Color(0, 0, 0)));
		photo.setBounds(1034, 81, 222, 205);
		frmResumebuilder.getContentPane().add(photo);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-30, -21, 268, 226);
		photo.add(label);

		
		JLabel lblPicture = new JLabel("Personnel photo");
		lblPicture.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPicture.setBounds(1080, 37, 200, 29);
		frmResumebuilder.getContentPane().add(lblPicture);
                    //importation de la photo personnel
		JButton btnAttachPhoto = new JButton("Ajouter Votre Photo");
		btnAttachPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				Affichage window = new Affichage();
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				filename=f.getAbsolutePath();
				@SuppressWarnings("unused")
				Image getabsolutePath=null;
				ImageIcon icon = new ImageIcon(filename);
				@SuppressWarnings("unused")
				Image image =icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
				 label.setIcon(icon);
				 
				 
			}
		});
		btnAttachPhoto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAttachPhoto.setForeground(Color.white);
		btnAttachPhoto.setBackground(new Color(0, 0, 0));
		btnAttachPhoto.setBounds(1050, 320, 200, 29);
		frmResumebuilder.getContentPane().add(btnAttachPhoto);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		layeredPane_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layeredPane_5.setBounds(365, 407, 622, 300);
		frmResumebuilder.getContentPane().add(layeredPane_5);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		layeredPane_6.setBackground(new Color(135, 206, 250));
		layeredPane_6.setBounds(10, 11, 602, 274);
		layeredPane_5.add(layeredPane_6);
		
		JLabel lblComputer = new JLabel("Informatique :");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblComputer.setBounds(45, 11, 100, 14);
		layeredPane_6.add(lblComputer);
		
		comskill1 = new JTextField();
		comskill1.setBounds(45, 36, 244, 20);
		layeredPane_6.add(comskill1);
		comskill1.setColumns(10);
		
		comskill2 = new JTextField();
		comskill2.setColumns(10);
		comskill2.setBounds(299, 36, 259, 20);
		layeredPane_6.add(comskill2);
		
		comskill3 = new JTextField();
		comskill3.setColumns(10);
		comskill3.setBounds(45, 67, 244, 20);
		layeredPane_6.add(comskill3);
		
		comskill4 = new JTextField();
		comskill4.setColumns(10);
		comskill4.setBounds(299, 67, 259, 20);
		layeredPane_6.add(comskill4);
		
		JLabel lblLanguages = new JLabel("Langue :");
		lblLanguages.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblLanguages.setBounds(45, 98, 86, 14);
		layeredPane_6.add(lblLanguages);
		
		lang3 = new JTextField();
		lang3.setColumns(10);
		lang3.setBounds(45, 153, 244, 20);
		layeredPane_6.add(lang3);
		
		lang4 = new JTextField();
		lang4.setColumns(10);
		lang4.setBounds(299, 153, 259, 20);
		layeredPane_6.add(lang4);
		
		lang2 = new JTextField();
		lang2.setColumns(10);
		lang2.setBounds(299, 122, 259, 20);
		layeredPane_6.add(lang2);
		
		lang1 = new JTextField();
		lang1.setColumns(10);
		lang1.setBounds(45, 122, 244, 20);
		layeredPane_6.add(lang1);
		
		JLabel lblSports = new JLabel("Sports :");
		lblSports.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblSports.setBounds(45, 193, 48, 14);
		layeredPane_6.add(lblSports);
		
		sports1 = new JTextField();
		sports1.setColumns(10);
		sports1.setBounds(45, 218, 244, 20);
		layeredPane_6.add(sports1);
		
		sports2 = new JTextField();
		sports2.setColumns(10);
		sports2.setBounds(299, 218, 259, 20);
		layeredPane_6.add(sports2);
		
		JLabel lblSkills = new JLabel("Competence:");
		lblSkills.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblSkills.setBounds(382, 381, 120, 19);
		frmResumebuilder.getContentPane().add(lblSkills);
		
		//le botton qui responsable sur l'affichage du cv avant le telecharger
		JButton btnGo = new JButton("Afficher");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("rawtypes")
				Print p= new Print();
				Affichage window = new Affichage();
				window.name.setText(prenom.getText());
				window.father.setText(nom.getText());
				window.phone.setText(phonenum.getText());
				window.email1.setText(email.getText());
				window.homeaddress.setText(address.getText());
				window.gpro.setText((String) graduation_pro.getSelectedItem());
				window.ipro.setText((String) inter_program.getSelectedItem());
				window.mpro.setText((String) matric_course.getSelectedItem());
				window.ggrade.setText((String) cgpa.getSelectedItem());
				window.mgrade.setText((String) matric_Grade.getSelectedItem());
				window.igrade.setText((String) Inter_grade.getSelectedItem());
				window.gy.setText((String) graduation_Year.getSelectedItem());
				window.iy.setText((String) inter_year.getSelectedItem());
				window.my.setText((String) matric_year.getSelectedItem());
				window.C1.setText(comp1.getText());
				window.C2.setText(comp2.getText());
				window.C3.setText(comp3.getText());
				window.C4.setText(comp4.getText());
				window.D1.setText(desig1.getText());
				window.D2.setText(desig2.getText());
				window.D3.setText(desig3.getText());
				window.D4.setText(desig4.getText());
				@SuppressWarnings("unused")
				String a=(String) toyear1.getSelectedItem();
				window.Y1.setText(p.year((String) toyear1.getSelectedItem(),(String) fromyear1.getSelectedItem())+" Years");
				window.Y2.setText(p.year((String) toyear2.getSelectedItem(),(String) fromyear2.getSelectedItem())+" Years");
				window.Y3.setText(p.year((String) toyear3.getSelectedItem(),(String) fromyear3.getSelectedItem())+" Years");
				window.Y4.setText(p.year((String) toyear4.getSelectedItem(),(String) fromyear4.getSelectedItem())+" Years");
				window.s1.setText(comskill1.getText());
				window.s2.setText(comskill2.getText());
				window.s3.setText(comskill3.getText());
				window.s4.setText(comskill4.getText());
				window.l1.setText(lang1.getText());
				window.l2.setText(lang2.getText());
				window.l3.setText(lang3.getText());
				window.l4.setText(lang4.getText());
				window.S1.setText(sports1.getText());
				window.S2.setText(sports2.getText());
				window.my.setText((String) matric_year.getSelectedItem());
				
				window.Dob.setText((String) dob.getSelectedItem()+" - "+(String) mob.getSelectedItem()+" - "+(String) yob.getSelectedItem());

                                        //affictation de l'image personnel au notre cv

				ImageIcon icon1 = new ImageIcon(filename);
				@SuppressWarnings("unused")
				Image image1 =icon1.getImage().getScaledInstance(window.finalphoto.getWidth(), window.finalphoto.getHeight(),Image.SCALE_SMOOTH);
				window.finalphoto.setIcon(icon1);
				window.frmSample.setVisible(true);

				
				
			}
		});
		btnGo.setBounds(1118, 579, 89, 23);
		frmResumebuilder.getContentPane().add(btnGo);
		
		JLabel lblClickHereFor = new JLabel("Creer CV");
		lblClickHereFor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClickHereFor.setForeground(new Color(47, 79, 79));
		lblClickHereFor.setBounds(1086, 539, 170, 29);
		frmResumebuilder.getContentPane().add(lblClickHereFor);
		//le botton de supprission
		JButton clear = new JButton("Supprimer Tous");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prenom.setText("");
				nom.setText("");
				address.setText("");
				phonenum.setText("");
				comp1.setText("");
				desig1.setText("");
				comp2.setText("");
				desig2.setText("");
				comp3.setText("");
				desig3.setText("");
				comp4.setText("");
				desig4.setText("");
				comskill1.setText("");
				comskill2.setText("");
				comskill3.setText("");
				comskill4.setText("");
				email.setText("");
				lang1.setText("");
				lang2.setText("");
				lang3.setText("");
				lang4.setText("");
				sports1.setText("");
				sports2.setText("");
				
				label.setIcon(null);
			}
		});
		clear.setForeground(Color.white);
		clear.setBackground(Color.BLACK);
		clear.setBounds(762, 11, 200, 36);
		frmResumebuilder.getContentPane().add(clear);
		
	

		
	}

	
	public JTextField getFullname() {
		return prenom;
	}

	
	public void setFullname(JTextField prenom) {
		this.prenom = prenom;
		prenom.setHorizontalAlignment(SwingConstants.LEFT);
	}



}
