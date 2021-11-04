
public class Ex08 {

	public static void main(String[] args) {
		int i = -128;
		System.out.println(-i);
		int i1 = 1;
		i1 = i1 + 1; // i1 = 1 + 1
		System.out.println(i1);
		i1 = i1 + 1;
		System.out.println(i1);
		++i1; //선행연산
		System.out.println(i1);
		i1++; //후행연산
		System.out.println(i1);
		
		int y = ++i1; // i1 = i1+1 -> y = i1
		System.out.println(y);
		System.out.println(i1);
		
		y = i1++;
		System.out.println(y);
		System.out.println(i1);
		
		int i2 = 10;
		i2 = i2 - 1;
		System.out.println(i2);
		i2 = i2 - 1;
		System.out.println(i2);
		--i2;
		System.out.println(i2);
		i2--;
		System.out.println(i2);
		
		int x = --i2;
		System.out.println(x);
		System.out.println(i2);
		
		x = i2--;
		System.out.println(x);
		System.out.println(i2);
		
		i1 = 10;
		System.out.println(++i1); //11
		System.out.println(i1);
		
		i1 = 10;
		System.out.println(i1++);
		System.out.println(i1); //11
		
		System.out.println(i1);
		int i3 = 10;
		int j = 20;
		int z = ++i3 + j++;
		System.out.println("z: "+z);
		System.out.println("i3: "+i3);
		System.out.println("j: "+j);
	}

}
