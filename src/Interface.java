import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;

public class Interface {

	private JFrame frame;
	private JTextField textField_Name;
	private JTextField textField_pNbr;
	private JTextField textField_pNbr2;
	private JTextField textField_pNbr3;
	private Controller controller = new Controller();

	private JTextField textField_accNbr;
	private JButton btnNewButton_removePerson;
	private JButton btnNewButton_findPerson;
	private JButton btnNewButton_addPerson;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnLggTillKonto;
	private JLabel lblAccountNumber;
	private JButton btnShowAccounts;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 541, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnNewButton_removePerson = new JButton("Radera person");
		btnNewButton_removePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNbr = textField_pNbr3.getText();
				Person p = controller.findPerson(pNbr);
				textArea.setText(p.getName().toUpperCase() + " är borttagen.");
				controller.removePerson(pNbr);
			}
		});
		btnNewButton_removePerson.setBounds(364, 40, 106, 25);
		frame.getContentPane().add(btnNewButton_removePerson);

		btnNewButton_findPerson = new JButton("Hitta");
		btnNewButton_findPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNbr = textField_pNbr3.getText();
				Person p = controller.findPerson(pNbr);
				if (p != null) {
					textArea.setText(p.getName().toUpperCase());
				} else {
					textArea.setText("Inget resultat");

				}
			}
		});
		btnNewButton_findPerson.setBounds(131, 40, 106, 25);
		frame.getContentPane().add(btnNewButton_findPerson);

		btnNewButton_addPerson = new JButton("L\u00E4gg till person");
		btnNewButton_addPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_Name.getText();
				String pNbr = textField_pNbr.getText();
				Person p = new Person();
				controller.addPerson(name, pNbr, p);
				textArea.setText("Personen är tillagd i registret");
			}
		});
		btnNewButton_addPerson.setBounds(341, 131, 129, 25);
		frame.getContentPane().add(btnNewButton_addPerson);

		textField_Name = new JTextField();
		textField_Name.setBounds(173, 134, 116, 22);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);

		lblNewLabel = new JLabel("Namn:");
		lblNewLabel.setBounds(173, 112, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Persnr:");
		lblNewLabel_1.setBounds(26, 112, 106, 16);
		frame.getContentPane().add(lblNewLabel_1);

		textField_pNbr = new JTextField();
		textField_pNbr.setBounds(26, 134, 116, 22);
		frame.getContentPane().add(textField_pNbr);
		textField_pNbr.setColumns(10);

		btnLggTillKonto = new JButton("Lägg till konto");
		btnLggTillKonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.addAccount(new Account(),
				controller.findPerson(textField_pNbr2.getText()), textField_accNbr.getText());
				Person tmp = controller.findPerson(textField_pNbr.getText());
				textArea.setText("Kontot " + (textField_accNbr.getText()) + " har lagts till personen: " + tmp.getName().toUpperCase());

			}
		});
		btnLggTillKonto.setBounds(341, 217, 129, 25);
		frame.getContentPane().add(btnLggTillKonto);

		textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textArea.setBounds(26, 296, 467, 178);
		frame.getContentPane().add(textArea);

		lblAccountNumber = new JLabel("Kontonummer:");
		lblAccountNumber.setBounds(173, 193, 106, 16);
		frame.getContentPane().add(lblAccountNumber);

		textField_accNbr = new JTextField();
		textField_accNbr.setBounds(173, 220, 116, 22);
		frame.getContentPane().add(textField_accNbr);
		textField_accNbr.setColumns(10);

		btnShowAccounts = new JButton("Visa konton");
		btnShowAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNbr = textField_pNbr3.getText();
				textArea.setText("");
				for (Account a : controller.findPerson(pNbr).getHarAccount()) {	
					textArea.append(a.getOwner().getName().toUpperCase() + " har konton: " + a.getNbr() + "\n");
				}
				
			}
		});
		btnShowAccounts.setBounds(247, 40, 106, 25);
		frame.getContentPane().add(btnShowAccounts);
		
		JLabel lblPersnr = new JLabel("Persnr.");
		lblPersnr.setBounds(26, 195, 46, 14);
		frame.getContentPane().add(lblPersnr);
		
		textField_pNbr2 = new JTextField();
		textField_pNbr2.setBounds(26, 222, 116, 20);
		frame.getContentPane().add(textField_pNbr2);
		textField_pNbr2.setColumns(10);
		
		textField_pNbr3 = new JTextField();
		textField_pNbr3.setBounds(26, 45, 86, 20);
		frame.getContentPane().add(textField_pNbr3);
		textField_pNbr3.setColumns(10);
		
		JLabel lblPersnr_1 = new JLabel("Persnr.");
		lblPersnr_1.setBounds(26, 20, 46, 14);
		frame.getContentPane().add(lblPersnr_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 94, 505, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 183, 505, -3);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 178, 505, 2);
		frame.getContentPane().add(separator_2);
	}
}
