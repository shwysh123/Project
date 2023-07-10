package View.GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Domain.Common.Dto.MemberDto;
import Domain.Common.Service.MemberServiceImpl;

public class Join_GUI extends JFrame implements ActionListener, KeyListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JTextField txt1; //���̵�
	JTextField txt2; //���
	
	Join_GUI() {
		// Frame
		super("");
		setBounds(100, 100, 500, 500);

		// Panel
		JPanel panel = new JPanel(); // �гλ���

		panel.setLayout(null);

		// Component
		btn1 = new JButton("ȸ������");
		btn2 = new JButton("���");
		btn3 = new JButton("�ߺ�Ȯ��");
		txt1 = new JTextField("ID : ");
		txt2 = new JTextField("PW : ");


		// Positioning

		btn1.setBounds(110, 250, 120, 40); // ȸ������
		btn2.setBounds(250, 250, 120, 40); // ���
		btn3.setBounds(315, 70, 90, 25); // �ߺ�Ȯ��
		txt1.setBounds(60,100,350,40);	// ���̵�
		txt2.setBounds(60,160,350,40);	// ���

		// Eventó��
		
//		�����ؾߵ� !!!!!!!!!!!!!!!!!!!!!!!
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̵�� �н����� ��������
		        String id = txt1.getText();
		        String password = txt2.getText();

		        // MemberDto ����
		        MemberDto dto = new MemberDto(id, password);

		        try {
		            // ȸ������ ó��
		            boolean success = MemberServiceImpl.getInstance().Join(dto);
		            if (success) {
		                // ȸ������ ����
		            	JOptionPane.showMessageDialog(Join_GUI.this, "ȸ�������� �Ϸ�Ǿ����ϴ�.", "ȸ������ ����", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		                // ȸ������ ����
		            	JOptionPane.showMessageDialog(Join_GUI.this, "ȸ�����Կ� �����Ͽ����ϴ�.", "ȸ������ ����", JOptionPane.ERROR_MESSAGE);
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		


		btn1.setFont(new Font("����", Font.BOLD, 12));
		btn2.setFont(new Font("����", Font.BOLD, 12));
		btn3.setFont(new Font("����", Font.BOLD, 12));

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(txt1);
		panel.add(txt2);

		// Frame
		add(panel); // �����ӿ� panel�߰�

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

//		btn1 ȸ������ ��� �߰��ؾߵ�
		
		//ȸ������ ��� �� ����ȭ������ �̵�
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MAINGUI();
				
			}
		});
		
		// ��Ŀ�� �� ����ó��
        txt1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt1.getText().equals("ID : ")) {
                    txt1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txt1.getText().isEmpty()) {
                    txt1.setText("ID : ");
                }
            }
        });

        txt2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txt2.getText().equals("PW : ")) {
                    txt2.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txt2.getText().isEmpty()) {
                    txt2.setText("PW : ");
                }
            }
        });

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