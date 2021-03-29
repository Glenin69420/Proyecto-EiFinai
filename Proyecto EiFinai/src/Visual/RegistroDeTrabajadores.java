package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;

public class RegistroDeTrabajadores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroDeTrabajadores dialog = new RegistroDeTrabajadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroDeTrabajadores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroDeTrabajadores.class.getResource("/Imagenes/cliente (1).png")));
		setTitle("Registro de trabajador");
		setResizable(false);
		setBounds(100, 100, 706, 391);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.BLUE, null, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Imformacion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(10, 10, 662, 135);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setBounds(10, 26, 45, 13);
			panel_1.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(65, 23, 96, 19);
			panel_1.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Nombre:");
			lblNewLabel_1.setBounds(10, 56, 48, 13);
			panel_1.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(65, 53, 96, 19);
			panel_1.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Apellido:");
			lblNewLabel_2.setBounds(10, 86, 50, 13);
			panel_1.add(lblNewLabel_2);
			
			textField_2 = new JTextField();
			textField_2.setBounds(65, 83, 96, 19);
			panel_1.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Edad:");
			lblNewLabel_3.setBounds(247, 26, 45, 13);
			panel_1.add(lblNewLabel_3);
			
			textField_3 = new JTextField();
			textField_3.setBounds(315, 23, 96, 19);
			panel_1.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("Sexo:");
			lblNewLabel_4.setBounds(247, 56, 45, 13);
			panel_1.add(lblNewLabel_4);
			
			textField_4 = new JTextField();
			textField_4.setBounds(315, 53, 96, 19);
			panel_1.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Direccion:");
			lblNewLabel_5.setBounds(247, 86, 60, 13);
			panel_1.add(lblNewLabel_5);
			
			textField_5 = new JTextField();
			textField_5.setBounds(315, 83, 96, 19);
			panel_1.add(textField_5);
			textField_5.setColumns(10);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Tipo de trabajador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 155, 662, 59);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Jefe de proyecto.");
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setBounds(20, 19, 140, 21);
			panel_2.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Programadores.");
			rdbtnNewRadioButton_1.setBounds(180, 19, 140, 21);
			panel_2.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Planificadores.");
			rdbtnNewRadioButton_2.setBounds(340, 19, 140, 21);
			panel_2.add(rdbtnNewRadioButton_2);
			
			JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Dise\u00F1adores.");
			rdbtnNewRadioButton_3.setBounds(500, 19, 140, 21);
			panel_2.add(rdbtnNewRadioButton_3);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new TitledBorder(null, "Jefe de proyecto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBounds(10, 224, 662, 59);
			panel.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_6 = new JLabel("Cantidad de trabajadores:");
			lblNewLabel_6.setBounds(10, 25, 148, 13);
			panel_3.add(lblNewLabel_6);
			
			textField_6 = new JTextField();
			textField_6.setBounds(160, 23, 96, 19);
			panel_3.add(textField_6);
			textField_6.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
