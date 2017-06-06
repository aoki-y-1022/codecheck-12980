package codecheck;

public class App {
	public static void main(String[] args) {
			System.out.println(makeSeries(Integer.valueOf(args[0])));
		}
	

	private static String makeSeries(int num){
		if(num == 1){
			return "1";
		}else{
			String str = String.valueOf(makeSeries(num-1));
			int i=0;
			String answer = "";
			while(i < str.length()){
				int j=0;
				while(i+(++j) <str.length() && str.charAt(i+j) == str.charAt(i)){}
				answer = answer + String.valueOf(j) + str.charAt(i);
				i = i + j;
			}
			
			return answer;
		}
	}
}
