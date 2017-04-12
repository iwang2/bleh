import java.util.*;

//a + bi form input
//raise complex number to nth power
//finds all roots of unity

public class Complex{
    
    //convert string to "processable" values
    // a + bi --> [a, b]
    public static double[] values(String equation){
	String a = "", b = "";
        while(equation.charAt(0) != '+'){
	    if(equation.charAt(0) != ' '){
		a += equation.charAt(0);
	    }
	    equation = equation.substring(1);
	}
	while(equation.charAt(0) != 'i'){
	    if(equation.charAt(0) != ' '){
		b += equation.charAt(0);
	    }
	    equation = equation.substring(1);
	}
	double ai = Double.parseDouble(a),
	    bi = Double.parseDouble(b);
	double[] ans = {ai, bi};
	return ans;
    }

    // [a, b] --> [r, theta]
    private static double[] toPolar(double[] rectangular){
	double a = rectangular[0], b = rectangular[1];
	double r = Math.sqrt(a*a + b*b),
	    theta = Math.atan(b/a);
	double[] ans = {r, theta};
	return ans;
    }

    // [r, theta] ^ power --> [r ^ power, theta * power]
    private static double[] power(double[] in, double exp){
	double r = in[0], theta = in[1];
	r = Math.pow(r, exp);
	theta = theta * exp;
	double[] ans = {r, theta};
	return ans;
    }
    
    public static void main(String[] args){
	double[] a = values("3 + 3i");
	System.out.println(a[0]);
	System.out.println(a[1]);
	double[] a1 = toPolar(a);
	a1 = power(a1, 2);
	System.out.println(a1[0]);
	System.out.println(a1[1]);
    }
}
