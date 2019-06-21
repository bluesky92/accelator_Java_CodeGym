import java.util.Scanner;

public class Timgiatrilonnhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int[] arr;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào kích thước: ");
			size = scanner.nextInt();
			if(size > 20) System.out.println("Vui long nhập vào kích thước nhỏ hơn 20");
		} while (size >20);
		
		arr = new int[size];
		int i =0;
		while (i < arr.length ) {
			System.out.println(" Giá trị tài sản thứ ["+(i+1)+"]");
			arr[i]=scanner.nextInt();
			i++;
		}
		
		System.out.println("danh sach tai san:");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		// process
		int max = arr[0];
		int idx =0;
		for (int j = 1; j < arr.length; j++) {
			if (max < arr[j])  {
				max = arr[j];
				idx =j;	
				}
			}
		System.out.println("tài sản thứ "+ idx + " là lớn nhất là: "+ max + " tỷ");
		}
	}

 
