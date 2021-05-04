package assignment2;

import javax.swing.JOptionPane;

public class UnitConverter {

	final static double CM_TO_IN = 0.254;
	final static double IN_TO_CM = 2.54;
	final static double YD_TO_M = 0.9144;
	final static double M_TO_YD = 1.09361;
	final static double OZ_TO_GM = 28.3495;
	final static double GM_TO_OZ = 0.035274;
	final static double LB_TO_KG = 0.453592;
	final static double KG_TO_LB = 2.20462;

		public static void main(String[] args) {
			String input = JOptionPane.showInputDialog("Input a distance or weight amount:");
			String unit = input.substring(input.length() - 2);
			String value = input.substring(0, input.length() - 2);
			double num = Double.parseDouble(value);

			if (unit.equals("in"))
			{
				System.out.print(input + " = " + num*IN_TO_CM +"cm");
			}
			else if (unit.equals("cm"))
			{
				System.out.print(input + " = " + num*CM_TO_IN +"in");
			}
			else if (unit.equals(" m"))
			{
				System.out.print(input + " = " +  num*M_TO_YD +"yd");
			}
			else if (unit.equals("yd"))
			{
				System.out.print(input + " = " +  num*YD_TO_M +" m");
			}
			else if (unit.equals("gm"))
			{
				System.out.print(input + " = " +  num*GM_TO_OZ +"oz");
			}
			else if (unit.equals("oz"))
			{
				System.out.print(input + "=" +  num*OZ_TO_GM +"gm");
			}
			else if (unit.equals("kg"))
			{
				System.out.print(input + " = " +  num*KG_TO_LB +"lb");
			}
			else if (unit.equals("lb"))
			{
				System.out.print(input + " = " +  num*LB_TO_KG +"kg");
			}
			
		}

	}

