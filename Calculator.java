package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
		JFrame frame;
		JTextField textField;
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt, blog;
		Double firstNumber;
		Double secondNumber;
		Double result;
		int operator;
		public Calculator() {
			frame=new JFrame("Calculator - Created by Matthew");
			frame.setLayout(null);
			frame.getContentPane().setBackground(java.awt.Color.GRAY);
			textField=new JTextField();
			textField.setBounds(30, 40, 410, 30);
			frame.add(textField);
			bdec=new JButton(".");
			bdec.setBounds(45, 310, 50, 40);
			bdec.setBackground(java.awt.Color.GREEN);
			frame.add(bdec);
			b1=new JButton("1");
			b1.setBounds(45, 240, 50, 40);
			b1.setBackground(java.awt.Color.GREEN);
			frame.add(b1);
			b4=new JButton("4");
			b4.setBounds(45, 170, 50, 40);
			b4.setBackground(java.awt.Color.GREEN);
			frame.add(b4);
			b7=new JButton("7");
			b7.setBounds(45, 100, 50, 40);
			b7.setBackground(java.awt.Color.GREEN);
			frame.add(b7);
			b0=new JButton("0");
			b0.setBounds(115, 310, 50, 40);
			b0.setBackground(java.awt.Color.GREEN);
			frame.add(b0);
			b2=new JButton("2");
			b2.setBounds(115, 240, 50, 40);
			b2.setBackground(java.awt.Color.GREEN);
			frame.add(b2);
			b5=new JButton("5");
			b5.setBounds(115, 170, 50, 40);
			b5.setBackground(java.awt.Color.GREEN);
			frame.add(b5);
			b8=new JButton("8");
			b8.setBounds(115, 100, 50, 40);
			b8.setBackground(java.awt.Color.GREEN);
			frame.add(b8);
			beq=new JButton("=");
			beq.setBounds(185, 310, 50, 40);
			beq.setBackground(java.awt.Color.GREEN);
			frame.add(beq);
			b3=new JButton("3");
			b3.setBounds(185, 240, 50, 40);
			b3.setBackground(java.awt.Color.GREEN);
			frame.add(b3);
			b6=new JButton("6");
			b6.setBounds(185, 170, 50, 40);
			b6.setBackground(java.awt.Color.GREEN);
			frame.add(b6);
			b9=new JButton("9");
			b9.setBounds(185, 100, 50, 40);
			b9.setBackground(java.awt.Color.GREEN);
			frame.add(b9);
			bdiv=new JButton("/");
			bdiv.setBounds(255, 310, 50, 40);
			bdiv.setBackground(java.awt.Color.GREEN);
			frame.add(bdiv);
			bmul=new JButton("*");
			bmul.setBounds(255, 240, 50, 40);
			bmul.setBackground(java.awt.Color.GREEN);
			frame.add(bmul);
			bsub=new JButton("-");
			bsub.setBounds(255, 170, 50, 40);
			bsub.setBackground(java.awt.Color.GREEN);
			frame.add(bsub);
			badd=new JButton("+");
			badd.setBounds(255, 100, 50, 40);
			badd.setBackground(java.awt.Color.GREEN);
			frame.add(badd);
			blog=new JButton("Log(10)");
			blog.setBounds(325, 310, 100, 40);
			blog.setBackground(java.awt.Color.GREEN);
			frame.add(blog);
			bsqt=new JButton("Sq. Root");
			bsqt.setBounds(325, 240, 100, 40);
			bsqt.setBackground(java.awt.Color.GREEN);
			frame.add(bsqt);
			bcbe=new JButton("Cube");
			bcbe.setBounds(325, 170, 100, 40);
			bcbe.setBackground(java.awt.Color.GREEN);
			frame.add(bcbe);
			bsqr=new JButton("Square");
			bsqr.setBounds(325, 100, 100, 40);
			bsqr.setBackground(java.awt.Color.GREEN);
			frame.add(bsqr);
			bclr=new JButton("Clear");
			bclr.setBounds(45, 380, 190, 40);
			bclr.setBackground(java.awt.Color.GREEN);
			frame.add(bclr);
			bksp=new JButton("Backspace");
			bksp.setBounds(255, 380, 170, 40);
			bksp.setBackground(java.awt.Color.GREEN);
			frame.add(bksp);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(470, 550);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b0.addActionListener(this);
			bdec.addActionListener(this);
			badd.addActionListener(this);
			bsub.addActionListener(this);
			bmul.addActionListener(this);
			bdiv.addActionListener(this);
			beq.addActionListener(this);
			bclr.addActionListener(this);
			bksp.addActionListener(this);
			bsqr.addActionListener(this);
			bcbe.addActionListener(this);
			bsqt.addActionListener(this);
			blog.addActionListener(this);
			frame.setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)
				textField.setText(textField.getText().concat("1"));
			if(e.getSource()==b2)
				textField.setText(textField.getText().concat("2"));
			if(e.getSource()==b3)
				textField.setText(textField.getText().concat("3"));
			if(e.getSource()==b4)
				textField.setText(textField.getText().concat("4"));
			if(e.getSource()==b5)
				textField.setText(textField.getText().concat("5"));
			if(e.getSource()==b6)
				textField.setText(textField.getText().concat("6"));
			if(e.getSource()==b7)
				textField.setText(textField.getText().concat("7"));
			if(e.getSource()==b8)
				textField.setText(textField.getText().concat("8"));
			if(e.getSource()==b9)
				textField.setText(textField.getText().concat("9"));
			if(e.getSource()==b0)
				textField.setText(textField.getText().concat("0"));
			if(e.getSource()==bdec)
				textField.setText(textField.getText().concat("."));
			if(e.getSource()==bclr)
				textField.setText("");
			if(e.getSource()==bksp) {
				String s=textField.getText();
				textField.setText("");
				for(int i=0;i<s.length()-1;i++)
				textField.setText(textField.getText()+s.charAt(i));
			}
			if(e.getSource()==badd) {
				firstNumber=Double.parseDouble(textField.getText());
				operator=1;
				textField.setText("");
			}
			if(e.getSource()==bsub) {
				firstNumber=Double.parseDouble(textField.getText());
				operator=2;
				textField.setText("");
			}
			if(e.getSource()==bmul) {
				firstNumber=Double.parseDouble(textField.getText());
				operator=3;
				textField.setText("");
			}
			if(e.getSource()==bdiv) {
				firstNumber=Double.parseDouble(textField.getText());
				operator=4;
				textField.setText("");
			}
			if(e.getSource()==bsqr) {
				firstNumber=Double.parseDouble(textField.getText());
				result=Math.pow(firstNumber, 2);
				textField.setText(""+result);
			}
			if(e.getSource()==bcbe) {
				firstNumber=Double.parseDouble(textField.getText());
				result=Math.pow(firstNumber, 3);
				textField.setText(""+result);
			}
			if(e.getSource()==bsqt) {
				firstNumber=Double.parseDouble(textField.getText());
				result=Math.pow(firstNumber, 0.5);
				textField.setText(""+result);
			}
			if(e.getSource()==blog) {
				firstNumber=Double.parseDouble(textField.getText());
				result=Math.log10(firstNumber);
				textField.setText(""+result);
			}
			if(e.getSource()==beq) {
				secondNumber=Double.parseDouble(textField.getText());
				switch(operator) {
				case 1:
					result=firstNumber+secondNumber;
					break;
				case 2:
					result=firstNumber-secondNumber;
					break;
				case 3:
					result=firstNumber*secondNumber;
					break;
				case 4:
					result=firstNumber/secondNumber;
					break;
				default: result=0.0;
				}
				textField.setText(""+result);
			}
		}
}
