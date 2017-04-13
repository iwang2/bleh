import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout extends JFrame implements ActionListener{
    private Container pane;
    // power
    private JLabel open, pplus, close, poutput;
    private JTextField pa, pb, power;
    private JButton pcalculate;

    // root
    private JLabel rootof, rplus, i, routput;
    private JTextField root, ra, rb;
    private JButton rcalculate;

    public Layout(){
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setBackground(Color.black);
	this.setSize(800,600);
	
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());

	GridBagConstraints constraints = new GridBagConstraints();

	pcalculate = new JButton("CALCULATE");
	constraints.gridx = 0;
	constraints.gridy = 0;
	constraints.gridheight = 2;
	constraints.fill = GridBagConstraints.VERTICAL;
	pane.add(pcalculate, constraints);

	open = new JLabel("(");
	constraints.gridx = 1;
	constraints.gridheight = 1;
	pane.add(open, constraints);

	pa = new JTextField(5);
	constraints.gridx = 2;
	pane.add(pa, constraints);

	pplus = new JLabel(" + ");
	constraints.gridx = 3;
	pane.add(pplus, constraints);

	pb = new JTextField(5);
	constraints.gridx = 4;
	constraints.gridwidth = 2;
	pane.add(pb, constraints);

	close = new JLabel("i) ^ ");
	constraints.gridx = 6;
	constraints.gridwidth = 2;
	pane.add(close, constraints);

	power = new JTextField(5);
	constraints.gridx = 8;
	constraints.gridwidth = 1;
	pane.add(power, constraints);

	poutput = new JLabel("returned expression");
	constraints.gridx = 1;
	constraints.gridy = 1;
	constraints.gridwidth = 9;
	constraints.fill = GridBagConstraints.HORIZONTAL;
	pane.add(poutput, constraints);


	//root
	rcalculate = new JButton("CALCULATE");
	constraints.gridx = 0;
	constraints.gridy = 2;
	constraints.gridwidth = 1;
	constraints.gridheight = 2;
	constraints.fill = GridBagConstraints.VERTICAL;
	pane.add(rcalculate, constraints);

	root = new JTextField(5);
	constraints.gridx = 2;
	constraints.gridheight = 1;
	pane.add(root, constraints);

	rootof = new JLabel(" root of ");
	constraints.gridx = 3;
	constraints.gridwidth = 2;
	pane.add(rootof, constraints);

	ra = new JTextField(5);
	constraints.gridx = 5;
	pane.add(ra, constraints);

	rplus = new JLabel(" + ");
	constraints.gridx = 7;
	constraints.gridwidth = 1;
	pane.add(rplus, constraints);

	rb = new JTextField(5);
	constraints.gridx = 8;
	pane.add(rb, constraints);

	i = new JLabel("i");
	constraints.gridx = 9;
	pane.add(i, constraints);

	routput = new JLabel("returned expression");
	constraints.gridx = 1;
	constraints.gridwidth = 9;
	constraints.gridy = 3;
	constraints.fill = GridBagConstraints.HORIZONTAL;
	pane.add(routput, constraints);
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
