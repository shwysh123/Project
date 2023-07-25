package View.GUI;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Domain.Common.Dao.BoardDao;
import Domain.Common.Dao.BoardDaoImpl;
import Domain.Common.Dto.BoardDto;

//	id�� JLabel�� ����Ͽ� �ҷ����Բ�....

public class Writer_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1; // ����
	JButton btn2; // ������
	JTextField txt1; // title
	JTextField txt2; // contents
	JTextArea area1;
	JScrollPane scroll1;

	Writer_GUI() {
//		Frame
		super("�۾���");
		setBounds(100, 100, 1000, 800);

//		Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

// 		Component
		btn1 = new JButton("����");
		btn2 = new JButton("������");
		txt1 = new JTextField("����");
		txt2 = new JTextField("����");
		area1 = new JTextArea();
		scroll1 = new JScrollPane(area1);

// 		Positioning
		txt1.setBounds(40, 70, 700, 40);
		txt2.setBounds(40, 125, 950, 570);

		btn1.setBounds(770, 10, 90, 30); // ����
		btn2.setBounds(870, 700, 90, 30); // ������

		scroll1.setBounds(40, 125, 950, 570);

// 		Eventó��
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		txt2.addKeyListener(this);
//		txt1.setBounds(40, 15, 300, 40); // ���̵� ���� ��ġ

		txt1.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txt2.getText().equals("title")) {
					txt2.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txt2.getText().isEmpty()) {
					txt2.setText("title");
				}
			}
		});
		txt2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txt2.getText().equals("contents")) {
					txt2.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txt2.getText().isEmpty()) {
					txt2.setText("contents");
				}
			}
		});

		// ���� DAO �ν��Ͻ� ����
		BoardDao boardDao = BoardDaoImpl.getInstance();

		// �����ư ������ �� �̺�Ʈ ó��
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����Ͻ�?");

				// ����ڰ� �Է��� ����� ������ ������
				String title = txt1.getText();
				String contents = txt2.getText();

				// BoardDto ��ü�� �����Ͽ� �Է��� ������ ����
				BoardDto boardDto = new BoardDto();
				boardDto.setTitle(title);
				boardDto.setContents(contents);

				try {
					// DAO�� ����Ͽ� ������ ����
					int result = boardDao.insert(boardDto, "role"); // role���� ������ ���� �����ؾ� �մϴ�.

					if (result > 0) {
						// ���� �Ϸ� �޽��� ǥ��
						JOptionPane.showMessageDialog(null, "���� ����Ǿ����ϴ�.");

						// ���� �Ŀ��� ���ϴ� ������ �����ϵ��� ����

						// ���� GUI â �ݱ�
						dispose();

						// �ٸ� GUI â ����
						new MAINGUI();
					} else {
						// ���� ���� �޽��� ǥ��
						JOptionPane.showMessageDialog(null, "�� ���忡 �����߽��ϴ�.");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "�α����� �ϰ� ���� ���.");
					// ���� ó�� �۾�
				}
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������?");
				dispose(); // ���� GUI â �ݱ�

				new MAINGUI(); // GUI1���� ���ư���
			}
		});

//		�۾�ü
		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));

//		tapŰ ���� ����
		List<Component> tabOrder = new ArrayList<>(); // tapŰ ���� ����
		tabOrder.add(txt1);
		tabOrder.add(txt2);
		tabOrder.add(btn1);
		tabOrder.add(btn2);

//		add_panel_component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(scroll1);

//		Frame
		add(panel);
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