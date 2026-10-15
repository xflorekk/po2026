package agh.po.lab1;

public class Choinka {
	static void myMethod(int a) {
		String [] x = new String[a];
		for (int i = 0; i<a ;i++) {
			x[i] = "*";
			for (int k=0; k <= i; k++) {
				if (k<i){
					System.out.print(x[k]);
				} else {
					System.out.println(x[k]);
				}			
			}	
		}
	}
	public static void main (String[] args) {
		myMethod(Integer.parseInt(args[10]));
	}
}

