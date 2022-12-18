package ra.academy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Write your code here
        float width ; // Khai báo biến chiều rộng .
        float height ; // Khai báo biến chiều dài.
        Scanner sc = new Scanner(System.in);//Khởi tạo đối tượng sc từ lớp Scanner của gói java.util để nhập dữ liệu.
        System.out.println("Enter width : ");
        width = sc.nextFloat(); // Nhập vào chiều rộng gán vào biến width .
        System.out.println("Enter height : ");
        height = sc.nextFloat(); // Nhập vào chiều cao gán vào biến height .
        float area = width * height; // Khai báo biến area đồng thời tính diện tích và gán vào biến area .
        System.out.println("Area is : "+area); // In kết quả tính diện tích ra.

    }
}
