package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main1{

	public static void main(String[] args) {

        new Main_GUI();
	}

}

class Main_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;	//�α���
	JButton btn4;
	JButton btn5;

	JTable tbl1;
	JTable tbl2;
	JLabel txt3;

	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;
	
	JTextField srch;
	DefaultTableModel model;

	Main_GUI() {
		// Frame
		super("");
		setBounds(100, 100, 900, 900);

		// Panel
		JPanel panel = new JPanel(); // �гλ���

		panel.setLayout(null);

		// Component
		btn1 = new JButton("�� �ۼ�");
		btn2 = new JButton("���� ����");
		btn3 = new JButton("�α���");
		btn4 = new JButton("ȸ������");
		btn5 = new JButton("�˻�");
		tbl1 = new JTable();
		tbl2 = new JTable();
		txt3 = new JLabel("�Խ���");
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);
		srch = new JTextField();


		// Positioning
		tbl1.setBounds(10, 130, 860, 200); // �α��
		tbl2.setBounds(10, 340, 860, 450); // ���α�
		txt3.setBounds(280, 10, 300, 60); // ����

		btn1.setBounds(680, 80, 90, 30); // ���ۼ�
		btn2.setBounds(775, 80, 90, 30); // ���� �� ��
		btn3.setBounds(680, 800, 90, 30);	//�α���
		btn4.setBounds(775, 800, 90, 30); // ȸ������
		btn5.setBounds(160, 800, 60, 30); // �˻�

		scroll1.setBounds(10, 130, 860, 200); // �α�� ��ũ��
		scroll2.setBounds(10, 340, 860, 450); // ���α� ��ũ��

		srch.setBounds(15, 800, 140, 30); // �˻�

		// Eventó��
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new WriterMain_GUI();
				dispose();
			}
		}); // ���ۼ�

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
		
		String[] columns = { "number", "�۾���", "������", "�ۼ���¥"};
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String searchKeyword = srch.getText();
				boolean found = false;
				int count = 0;
				DefaultTableModel searchModel = new DefaultTableModel(columns, 0);

				for (int row = 0; row < model.getRowCount(); row++) {
					String author = (String) model.getValueAt(row, 1);
					String title = (String) model.getValueAt(row, 2);

					if (author.equalsIgnoreCase(searchKeyword) || title.equalsIgnoreCase(searchKeyword)) {
						found = true;
						count++;
						searchModel.addRow(new Object[]{model.getValueAt(row, 0), author, title, model.getValueAt(row, 3)});
					}
				}

				if (found) {
					JOptionPane.showMessageDialog(null, count + "���� �Խù��� �˻��Ǿ����ϴ�.");
					new Search_GUI(searchKeyword, searchModel);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "�˻��� ����� �����ϴ�.");
				}
			}
		});
		
		
		tbl1.addKeyListener(this);
		area1.setEditable(false);

		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));
		btn3.setFont(new Font("����",Font.BOLD,12));
		btn4.setFont(new Font("����", Font.BOLD, 12));
		btn5.setFont(new Font("����", Font.BOLD, 12));

		txt3.setFont(new Font("����", Font.BOLD, 30)); // ����

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);

		panel.add(txt3);	//�� ���� �Խ��� ����

		panel.add(srch);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
		// DB�����ؼ� ����â�� ����
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/�Խ���";

		// JDBC��������
		Connection conn = null; // DB����� ��������
		PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
		ResultSet rs = null; // SQL���� ���(SELECT���) ���ſ� ��������

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // ����̺� ����
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw); // �����ϸ� Connection��ü�� ��ȯ
			System.out.println("DB Connected!");

			String[] column = { "number", "�۾���", "������", "�ۼ���¥", "��ȸ��" };
			Object[][] data = {};
			
			model = new DefaultTableModel(data,column) {
				
				public boolean isCellEditable(int i, int c) {
					return false;
				} 
				
			};

			// ������
			pstmt = conn.prepareStatement("select * from tbl_�Խ���");

			rs = pstmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {
					Object[] rowData = { rs.getInt("number"), rs.getString("�۾���"), rs.getString("������"),
							rs.getString("�ۼ���¥") };
					model.addRow(rowData);
				}
			}

			JTable table = new JTable(model);
			JScrollPane scroll = new JScrollPane(table);
			scroll.setBounds(10, 130, 860, 650);

			table.getColumnModel().getColumn(0).setMaxWidth(50);
			table.getColumnModel().getColumn(1).setMaxWidth(200);
			table.getColumnModel().getColumn(2).setMaxWidth(800);
			table.getColumnModel().getColumn(3).setMaxWidth(300);
			table.getColumnModel().getColumn(4).setMaxWidth(100);

			panel.add(scroll);
			panel.setLayout(null);
			
			
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int selectedRow = table.getSelectedRow();
					int selectedColumn = table.getSelectedColumn();

//					// ������ ���� ������ ��������
					int number = (int) table.getValueAt(selectedRow, 0);
			        String writer = (String) table.getValueAt(selectedRow, 1);
			        String title = (String) table.getValueAt(selectedRow, 2);
			        String date = (String) table.getValueAt(selectedRow, 3);
			        // ���� �� Ȯ��
			        System.out.println("Number: " + number);
			        System.out.println("Writer: " + writer);
			        System.out.println("Title: " + title);
			        System.out.println("Date: " + date);
					new DB_GUI(number, writer, title, date);
					
				}
			});
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	

	

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {}

}