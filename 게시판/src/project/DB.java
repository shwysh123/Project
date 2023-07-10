package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

public class DB extends MyWriteMain {

	public static void main(String[] args) {
//		new DB_GUI();
	}

}

class DB_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JLabel lbl1;
	JLabel tbl1;
	JLabel tbl2;
	JLabel tbl3;
	JTable tbl4;
	JLabel tbl5;
//	JTextArea comment; // ���
	JTextArea area1;
	JScrollPane scroll1;

	JTextArea comment = new JTextArea();
	
	DefaultTableModel commentmodel;	//DB���� ����� ��۸���� ������ ���� 

//	����� ������ ����Ʈ
	List<String> commentList = new ArrayList<>();

	// DefaultTableModel ���� �߰�
	DefaultTableModel model4;

	DB_GUI(int number, String writer, String title, String date) {

		// Frame
		super("Ŭ���� �Խù�");
		setBounds(100, 100, 900, 900);
		setResizable(false);

		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Component
		btn1 = new JButton("������");
		lbl1 = new JLabel("�Խù� ��ȸ");
		area1 = new JTextArea();
		JButton uploadBtn = new JButton("��� ���ε�");
		uploadBtn.setBounds(720, 700, 120, 50);
		area1.setBounds(10, 90, 210, 500);

		JTextField srch = new JTextField();

		// ---------------------------------------------------------------
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/�Խ���";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			comment = new JTextArea();
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success..");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");

			tbl1 = new JLabel("NO : " + number);
			tbl2 = new JLabel("�۾��� :" + writer);
			tbl3 = new JLabel("������ : " + title);
			tbl5 = new JLabel("�ۼ���¥ : " + date);
//			Component comment = new JTextArea(); // ��۾��� â

			String[] column4 = { "�۳���" };

			model4 = new DefaultTableModel(column4, 0);
			tbl4 = new JTable(model4);
			tbl4.setRowHeight(300);
//			���̺� ���� �Ұ���
			tbl4.setEnabled(false);

			JScrollPane scroll4 = new JScrollPane(tbl4);

			scroll4.setBounds(10, 200, 850, 300);
			lbl1.setBounds(10, 30, 400, 50);
			tbl1.setBounds(10, 100, 100, 50);
			tbl2.setBounds(130, 100, 730, 50);
			tbl3.setBounds(10, 150, 850, 50);
			tbl5.setBounds(10, 750, 850, 50);
			comment.setBounds(8, 700, 700, 50);
			panel.add(tbl1);
			panel.add(tbl2);
			panel.add(tbl3);
			panel.add(tbl5); 
			panel.add(comment); // ��۾���â �߰�
			panel.add(uploadBtn);

			// �۳��븸 �������
			pstmt = conn.prepareStatement("SELECT �۳��� FROM tbl_bao WHERE number = ?");
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String content = rs.getString("�۳���");
				model4.addRow(new Object[] { content });
			}

//			tbl4.setModel(model4);
			scroll4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			panel.add(scroll4);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {

				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������?");
				dispose();
			}
		});
		// ��� ���� �ڵ�------------------------------------------------------------------
		// ���ε� ��ư�� ������ ��, �̺�Ʈ ó��
		uploadBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					String id = "root";
					String pw = "1234";
					String url = "jdbc:mysql://localhost:3306/�Խ���";

					Connection conn = null;
					PreparedStatement pstmt = null;
					ResultSet rs = null;

					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("���Driver Loading Success..");

					conn = DriverManager.getConnection(url, id, pw);

					System.out.println("��� DB Connected..");
//					JTextArea comment = new JTextArea(); // ���
					String numberText = tbl1.getText().substring(4).trim(); // tbl1���� ������ ���� �κ��� ������ �����ϰ� �����Ͽ� ����
					String nameText = tbl2.getText().substring(5).trim(); // tbl2���� ������ �۾��� �κ��� ������ �����ϰ� �����Ͽ� ����

					pstmt = conn
							.prepareStatement("INSERT INTO tbl_��� (number, ��۳���, �۾���, �ۼ���¥) VALUES (?, ?, ?, NOW())");
					pstmt.setInt(1, Integer.parseInt(numberText)); // ���ڷ� ��ȯ�Ͽ� ������ ����
					pstmt.setString(2, comment.getText());
					pstmt.setString(3, nameText); // ������ ����\

					int result = pstmt.executeUpdate();

					if (result > 0) {
						System.out.println("����� ���������� ����Ǿ����ϴ�.");
						// ��� �Է� �ʵ� �ʱ�ȭ
						comment.setText("");
					} else {
						System.out.println("��� ���忡 �����߽��ϴ�.");
					}

					pstmt.close();
					conn.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} // ����̹� ����

			}
		});

		//tbl_��� DB�� �����ֱ�------------------------------------------------------
		


		
		
		//-------------------------------------------------------------------------
		
		area1.setEditable(false);

		btn1.setFont(new Font("����", Font.BOLD, 17));
		lbl1.setFont(new Font("����", Font.BOLD, 30));
		tbl1.setFont(new Font("����", Font.BOLD, 15));
		tbl2.setFont(new Font("����", Font.BOLD, 15));
		tbl3.setFont(new Font("����", Font.BOLD, 17));
		tbl4.setFont(new Font("����", Font.BOLD, 20));
		tbl5.setFont(new Font("����", Font.BOLD, 20));

		panel.add(btn1);
		panel.add(lbl1);
		panel.add(srch);

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