 // challenge 1 - add 5 inputs
 class Input {
	public static void main (String a[]){
		String input1, input2, input3, input4, input5;
		  int sum, pro, diff, div;
		  int ai, bi, ci, di, ei;
			input1 = a[0]; input2 = a[1]; input3 = a[2]; input4 = a[3]; input5 = a[4];
			 ai = Integer.parseInt(a[0]);
			 bi = Integer.parseInt(a[1]);
			 ci = Integer.parseInt(a[2]);
			 di = Integer.parseInt(a[3]);
			 ei = Integer.parseInt(a[4]);
			System.out.println(ai+ "  ");
			System.out.println(bi+"  ");
			System.out.println(ci+ "  ");
			System.out.println(di+ "  ");
			System.out.println(ei+ "\n");
		System.out.println(input1 + input2 + input3 + input4 + input5);
		sum = ai+bi+ci+di+ei;
		pro = ai*bi*ci*di*ei;
		diff = -(ai) - bi - ci - di - ei;
		div = ai/bi/ci/di/ei;
		
		System.out.println("sum:"+sum);
		System.out.println("pro:" + pro);
		System.out.println("diff:" + diff);
		System.out.println("div:" + div);
		System.out.println("\n");
	}


}
