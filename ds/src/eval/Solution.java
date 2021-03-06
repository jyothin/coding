package eval;

import java.util.Stack;

public class Solution {
	public double evaluate(String str) {
        Stack<String> ops  = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        int i = 0;
        while (i < str.length()) { //str.charAt(i) != ' ') {
        	String s = str.substring(i, i+1);
            if      (s.equals("("))               ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
            i++;
        }
        return vals.pop();
	}
}