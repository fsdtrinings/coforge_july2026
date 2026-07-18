package p2;

public class MainClass2 {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		
		arr[0] = 44;
		arr[2] = 434;
		arr[1] = 144;
		
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for (int value : arr) {
			System.out.println(value);
		}
		
		
		
	}
}
