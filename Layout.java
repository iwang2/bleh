import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame implements ActionListener{
    private Container pane;
    private JLabel expression;
    private JTextField input;
    private JButton calculate;

    public Layout(){
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setBackground(Color.black);
	this.setSize(800,600);
	
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());

	GridBagConstraints constraints = new GridBagConstraints();

	expression = new JLabel("EXPRESSION");
	
	calculate = new JButton("CALCULATE");
	calculate.addActionListener(this);
	calculate.setActionCommand("calculate");

	input = new JTextField(12);

	constraints.gridx = 0;
	constraints.gridy = 0;
	pane.add(expression, constraints);

	constraints.gridx = 1;
	pane.add(input, constraints);

	constraints.gridx = 0;
	constraints.gridy = 1;
	constraints.gridwidth = 2;
	constraints.fill = GridBagConstraints.HORIZONTAL;
	pane.add(calculate, constraints);
    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("calculate")){
	    //insert conversion calculation stuff here
	}
    }
    
    public static void main(String[] args){
	Layout a = new Layout();
	a.setVisible(true);
    }
}
