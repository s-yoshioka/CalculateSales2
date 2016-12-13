package jp.co.ability.net.yoshioka_shun.caluculate_sales;

public class CalculateSales {
	public static void main (String[] args){
		try{
			File file = new File (args[0], "branch.lst");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) !=null){





			  br.close();

			}
		}catch(IOException e ){
			System.out.println(e);
		}
	}

}
