package pl.lait;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		    	//1 sposob inicjalizacji tablicy gdy na poczatku nie znamy wartosci
			String[] tablica1 = new String[5];
			tablica1[0] = "pierwszy";
			tablica1[1] = "2gi";
			tablica1[2] = "trzeci";
			tablica1[3] = "4ty";
			tablica1[4] = "5ty";
				// 1 sposob koniec
			
				//2 sposob inicjalizacji tablicy - gdy znamy wartosci
			String[] tablica2 = {"pierwszy_", "2gi_", "trzeci_"};
			
			for(int i = 0; i<tablica1.length; i++){
				System.out.println(tablica1[i]);
				}
			
			for(int i = 0; i<tablica2.length; i++){
				System.out.println(tablica2[i]);
			    }
					
	}
}
