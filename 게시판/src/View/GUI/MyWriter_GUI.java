package View.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWriter_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JLabel lbl1;
	JTable tbl1;
	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;

	MyWriter_GUI() {
		// Frame
		super("���� �� ��");
		setBounds(100, 100, 900, 900);

		// Panel
		JPanel panel = new JPanel(); // �гλ���
		panel.setLayout(null);

		// Component
		btn1 = new JButton("������");

		lbl1 = new JLabel("���� �� �� ���");
		tbl1 = new JTable();

		area1 = new JTextArea();
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);

		JTextField srch = new JTextField();

		// Positioning
		lbl1.setBounds(10, 10, 860, 80); // ����
		tbl1.setBounds(10, 100, 860, 680); // �ۼ� ��
		btn1.setBounds(770, 800, 90, 30); // ������

		// Eventó��
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������?");
				dispose(); // ���� GUI â �ݱ�

				new MAINGUI(); // GUI1���� ���ư���
			}
		});

		lbl1.addKeyListener(this);
		area1.setEditable(false);
		btn1.setFont(new Font("����", Font.BOLD, 12));
		lbl1.setFont(new Font("����", Font.BOLD, 30));

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(lbl1);
		panel.add(tbl1);
		panel.add(scroll1);
		panel.add(scroll2);
		panel.add(srch);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}