class Exercise3_8
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // 30
		char ch = 'A';
		ch = (char)(ch + 2);   // 67
		float f = 3 / 2f;  //1.5
		long l = 3000 * 3000 * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}