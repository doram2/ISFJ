
public class Ex16 {

	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6};
		for(int num : i) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num = 0; num < i.length; num++) {
			System.out.print(i[num]+" ");
		}
		System.out.println();
		
		
		String[] str = {"±èÃá½Ä","±èÀÏÀÌ","±èÀÌ»ï","±è»ï»ç"};
		for(String s : str) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(int num = 0; num < str.length; num++) {
			System.out.print(str[num]+" ");
		}
		System.out.println();
		
		
		double[] d = {10.5, 20.6, 40.7, 200.8};
		for(double num : d) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num = 0; num < d.length; num++) {
			System.out.print(d[num]+" ");
		}
		System.out.println();
		
		
		WEEK1[] days = WEEK1.values();
		for(WEEK1 num : days) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num = 0; num < days.length; num++) {
			System.out.print(days[num]+" ");
		}
		System.out.println();
		
		
		String[][] locations = {{"¿µµîÆ÷","³ë·®Áø","Á¾·Î"},
								{"°¡","³ª","´Ù"},
								{"¸ð¶õ","¼ö³»","¹Ì±Ý"}};
		for(String[] row: locations) {
			for(String col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for(int j = 0; j < locations.length; j++) {
			for(int k = 0; k < locations[j].length; k++) {
				System.out.print(locations[j][k]+" ");
			}
			System.out.println();
		}
		
		
		int[][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		for(int[] j : vals) {
			for(int k : j) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int j = 0; j < vals.length; j++) {
			for(int k = 0; k < vals[j].length; k++) {
				System.out.print(vals[j][k]+" ");
			}
			System.out.println();
		}

	}

}
