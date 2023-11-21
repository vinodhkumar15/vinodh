package task;

public class Birds {

	public static void main(String[] args) {
		String st ="The birds are flying in the sky";
		String  newString="";
		
		
		for (int i = 0;i<St.length();i++) {
			if(string.chartAt(i)!='') {
				newString+=string.charAt(i);
			}
			else {
				if(i+1<string.length()&& string.chartAt(i+1)!='') {
					newString+=string.chartAt(i);
				}
			}
			
		}
		System.out.println(newString);

	}

}
