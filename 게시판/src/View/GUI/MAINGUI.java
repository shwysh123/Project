package View.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Domain.Common.Dao.BoardDao;
import Domain.Common.Dao.BoardDaoImpl;
import Domain.Common.Dto.BoardDto;

public class MAINGUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1; // ���ۼ�
	JButton btn2; // ���� �� ��
	JButton btn3; // �α���
	JButton btn4; // ȸ������
	JButton btn5; // �˻�

	JTable tbl1; // �α��
	JTable tbl2; // ���α�

	JLabel lbl1; // �Խ��Ƕ�

	JTextArea area1;
	JScrollPane scroll1; // �α�� ��ũ��
	JScrollPane scroll2; // ���α� ��ũ��

	JTextField srch; // �˻�â
	DefaultTableModel model;

	MAINGUI() {
		super("MAIN MENU");
		setBounds(100, 100, 900, 900);

//		�г�
		JPanel panel = new JPanel();
		panel.setLayout(null);

//		���̺� ���̸�
		String[] columns = { "No", "���̵�", "����", "�ۼ���¥", "��ȸ��" };
//		���̺� ������
//		���̺� ��
		DefaultTableModel model = new DefaultTableModel(columns, 0);

// 		Component
		btn1 = new JButton("�� �ۼ�");
		btn2 = new JButton("���� ����");
		btn3 = new JButton("�α���");
		btn4 = new JButton("ȸ������");
		btn5 = new JButton("�˻�");
		tbl1 = new JTable();
		tbl2 = new JTable();
		lbl1 = new JLabel("�Խ���");
		area1 = new JTextArea();
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(tbl2);
		srch = new JTextField();

//		Position
		tbl1.setBounds(10, 130, 860, 200); // �α��
		tbl2.setBounds(10, 340, 860, 450); // ���α�
		lbl1.setBounds(280, 10, 300, 60); // ����

		btn1.setBounds(680, 80, 90, 30); // ���ۼ�
		btn2.setBounds(775, 80, 90, 30); // ���� �� ��
		btn3.setBounds(680, 800, 90, 30); // �α���
		btn4.setBounds(775, 800, 90, 30); // ȸ������
		btn5.setBounds(160, 800, 60, 30); // �˻�

		scroll1.setBounds(10, 130, 860, 200); // �α�� ��ũ��
		scroll2.setBounds(10, 340, 860, 450); // ���α� ��ũ��

		srch.setBounds(15, 800, 140, 30); // �˻�

//		event ó��

//		tbl2�� ��ü �Խù� �����ֱ�
		// ���� DAO �ν��Ͻ� ����
		BoardDao boardDao = BoardDaoImpl.getInstance();

		// �Խù� ���� ��������
		List<BoardDto> boardList = null;
		try {
			boardList = boardDao.select();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// �Խù� ������ ���̺� �߰�
		for (BoardDto board : boardList) {
			String number = String.valueOf(board.getNumber());
			String id = board.getId();
			String title = board.getTitle();
			String date = board.getDate();
			int hits = board.getHits();
			// �� �߰�
			model.addRow(new Object[] { number, id, title, date, hits });
		}

		tbl2.setModel(model);

//		���ۼ�
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Writer_GUI();
				dispose();
			}
		});

//		���� �� ��
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyWriter_GUI();
				dispose();
			}
		});
		// �α��� ȭ������ �̵�
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login_GUI();
				dispose();
			}
		});
		// ȸ������ ȭ������ �̵�
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Join_GUI();
				dispose();
			}
		});

		tbl1.addKeyListener(this);
		tbl2.addKeyListener(this);
		area1.setEditable(false);

		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));
		btn3.setFont(new Font("����", Font.BOLD, 12));
		btn4.setFont(new Font("����", Font.BOLD, 12));
		btn5.setFont(new Font("����", Font.BOLD, 12));
		lbl1.setFont(new Font("����", Font.BOLD, 30)); // ����

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(tbl1);
		panel.add(scroll2);
		panel.add(lbl1); // �� ���� �Խ��� ����

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