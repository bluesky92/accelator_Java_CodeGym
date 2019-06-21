import java.util.Scanner;

public class TimGiaTRiTrongMang {
	public static void main(String[] args) {
		//khai báo một mảng chứa danh sách sinh viên
		String[] students= {"huy","hung","ngat","bach"};
		// Khai báo một biến lưu tên cần tìm kiếm với giá trị được nhập 
		// vào từ bàn phím
		// bật phương thức scan từ bàn phím
		Scanner input = new Scanner(System.in);
		// hiển thị thông báo ra màn hình, kêu nhập liệu từ bàn phím
		System.out.println("nhập tên sinh viên bạn muốn kiểm tra: ");
		// gán giá trị vừa nhập vào biến 
		String input_name =input.nextLine();
		// đóng phương thức scan lại
		input.close();
		System.out.println("Tên sinh viên vừa nhập là : "+input_name);
		// xử lý lõi 
		boolean check = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(input_name)){
				System.out.println("Sinh viên "+input_name+" ở vị trí thứ: "+i+" trong danh sách");
				//System.out.println("Sinh viên "+students[i]+" ở vị trí thứ: "+i+" trong danh sách");
				check = true;
			}
			
		}
		if (check == false) System.out.println("Không tìm thấy");
		
	}
}
