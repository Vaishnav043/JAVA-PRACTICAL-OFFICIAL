class Sample{
	static int charCount(String s1,String s2){
		int count=0;
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)==s1.charAt(0)) count++;
		}
		return count;
	}

	static int charCount2(String s1,String s2){
		int count=0;
		char[] arr=s2.toCharArray();
		for(char chr:arr){
			if(chr==s1.charAt(0)){
				count++;
			}
		}
		return count;
	}


	static int charCount4(String s1,String s2){
		String a=s2.replace(s1,"");
		return s2.length()-a.length();
	}

	static void fun(int... var1){
		System.out.println("Executed...1");
	}

	static void fun(String... var2){
		System.out.println("Executed...2");
	}

	public static void main(String[] args){
		System.out.println("Character count is:"+Sample.charCount(args[0],args[1]));
		System.out.println("Character count is:"+Sample.charCount2(args[0],args[1]));
		System.out.println("Character count is:"+Sample.charCount4(args[0],args[1]));
		Sample.fun();
	}
}