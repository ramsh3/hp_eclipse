package com.methods_and_objinvoke;  
//one type of mthod calling
/*public class Methoding_Type {
	 static int Stocks_Open_Interest(int call_Writers, int put_Writers ) {
		//int change_In_OI;
		int change_In_OI=put_Writers-call_Writers;
		return change_In_OI;
	}
	public static void main(String[] args) {
		System.out.println("change in oi = "+Stocks_Open_Interest(131321432, 342343256));
	}

}
//2nd type of mthod calling
public class Methoding_Type {
	 static void Stocks_Open_Interest() {
		 int call_Writers=42234;
		 int put_Writers=1231;
		//int change_In_OI;
		int change_In_OI = put_Writers-call_Writers;
		System.out.println("change in oi = "+change_In_OI);

	}
	public static void main(String[] args) {
		Stocks_Open_Interest();
		
	}
}*/

class Open_Interest{
	int call_Writers;
	int put_Writers;
	int change_In_OI= call_Writers-put_Writers;
		//return call_Writers-put_Writers;
}
class Diff_In_Prices{
	int open;
	int close;
	int change_In_Price() {
		return open-close;
		//= open-close;
	}
		//return open-close;
}

public class Methoding_Type {
	public static void main(String[] args) {
		Open_Interest coi = new Open_Interest();
		Diff_In_Prices roi = new Diff_In_Prices();
		coi.call_Writers=132;
		coi.put_Writers=136;
		System.out.println("change in oi = "+coi.change_In_OI);
		roi.open=100;
		roi.close=150;
		System.out.println("change in price = "+roi.change_In_Price());
		
	}
	
}
