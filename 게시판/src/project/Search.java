package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class Search {

	public static void main(String[] args) {
	    DefaultTableModel model = new DefaultTableModel();
	    String searchKeyword = ""; // ���ϴ� �˻� Ű���带 �Է��ϼ���
	    new Search_GUI(searchKeyword, model);
	}

}

class Search_GUI extends JFrame implements ActionListener, KeyListener {
	

	JButton btn1;

	JLabel lbl1;
	JTable tbl2;
	DefaultTableModel searchModel;
	
	JTextArea area1;
	
	JScrollPane scroll1;
	JScrollPane scroll2;

	 Search_GUI(String searchKeyword, DefaultTableModel model) {

	        // Frame
	        super("�˻��� ��");
	        setBounds(100, 100, 900, 900);

	        // Panel
	        JPanel panel = new JPanel(); // �гλ���
	        panel.setLayout(null);

	        // Component
	        btn1 = new JButton("������");
	        lbl1 = new JLabel();
	        tbl2 = new JTable();

	        JTextField srch = new JTextField(searchKeyword);
	        searchModel = new DefaultTableModel(
	                new Object[]{"number", "�۾���", "������", "�ۼ���¥", "��ȸ��"}, 0); // �÷� �̸� ����

	        // Positioning
	        lbl1.setBounds(10, 10, 860, 80);     //����
	        tbl2.setBounds(10, 100, 860, 680);    //�ۼ� �� 
	        
//	        �۾��� or �������� searchKeyword�� ������ ������ �����´�
//	        equalsIgnoreCase�� ��ҹ��ڸ� ������ ���·� ��ġ ���� Ȯ��
	        
	        lbl1.setText("'" + searchKeyword + "'" + "(��)�� �˻��� ����Դϴ�.");
	        for (int row = 0; row < model.getRowCount(); row++) {
	            String title = (String) model.getValueAt(row, 2);
	            String author = (String) model.getValueAt(row, 1);
	            if (title.equalsIgnoreCase(searchKeyword) || author.equalsIgnoreCase(searchKeyword)) {
	                Object[] rowData = {
	                    model.getValueAt(row, 0),
	                    author,
	                    title,
	                    model.getValueAt(row, 3)
	                };
	                searchModel.addRow(rowData);
	            }
	        }
	        

	        btn1.setBounds(770, 800, 90, 30);        //������

	        // Eventó��
	        btn1.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null, "������?");
	                dispose(); // ���� GUI â �ݱ�
	                new Main_GUI(); // GUI1���� ���ư���
	            }
	        });        //���ۼ�

	        lbl1.addKeyListener(this);

	        btn1.setFont(new Font("����", Font.BOLD, 12));
	        lbl1.setFont(new Font("����", Font.BOLD, 30));

	        // Add_Panel_Component
	        panel.add(btn1);
	        panel.add(lbl1);

	        // ���̺� �� ����
	        tbl2.setModel(searchModel);
	        scroll2 = new JScrollPane(tbl2);
	        scroll2.setBounds(10, 100, 860, 680);
	        panel.add(scroll2);
	        
	        // ���̺� Ŭ�� �̺�Ʈ ó��
	        tbl2.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                int row = tbl2.getSelectedRow();
	                int number = (int) tbl2.getValueAt(row, 0);
	                String author = (String) tbl2.getValueAt(row, 1);
	                String title = (String) tbl2.getValueAt(row, 2);
	                String date = (String) tbl2.getValueAt(row, 3);

	                dispose(); // ���� GUI â �ݱ�
	                new DB_GUI(number, author, title, date); // DB_GUI ����
	            }
	        });
	        
//	        ������ ���� ���� ����
	        tbl2.getColumnModel().getColumn(0).setMaxWidth(50);
	        tbl2.getColumnModel().getColumn(1).setMaxWidth(200);
	        tbl2.getColumnModel().getColumn(2).setMaxWidth(1000);
	        tbl2.getColumnModel().getColumn(3).setMaxWidth(400);
	        tbl2.getColumnModel().getColumn(4).setMaxWidth(100);


	        // Frame
	        add(panel); // �����ӿ� panel�߰�

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }
		


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}