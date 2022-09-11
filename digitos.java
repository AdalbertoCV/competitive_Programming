import java.util.*;
public class digitos{
	public static void main(String args[]){
		Scanner t = new Scanner(System.in);
		
		int n = t.nextInt();
		
		String result;
		double res = Math.pow(3 + Math.sqrt(5), n);
		result = res + "";
		String[] resArr = result.split("");
		String salida = "";
		for (int i =0; i< resArr.length; i++){
			String actual = resArr[i];
			System.out.println(actual);
			if (actual.equals(".")){
				if (i==1){
					salida = "00"+ resArr[i-1];
				}
				else{
					if(i==2){
						salida = "0" + resArr[i-2] + resArr[i-1];
					}
					else{
						if (i>2){
							salida = resArr[i-3] + resArr[i-2] + resArr[i-1];
						}
					}
				}
			}
		}
		
		System.out.println(salida);
	}
}