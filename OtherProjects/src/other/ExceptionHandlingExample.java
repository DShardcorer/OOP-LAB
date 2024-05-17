//Đoạn mã Java này có thể gây ra ngoại lệ NullPointerException nếu người dùng không nhập vào một số nguyên hợp lệ. Để xử lý cả NumberFormatException và NullPointerException, ta cần bổ sung kiểm tra và xử lý như sau:
package other;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer intNumber = null;

        try {
            System.out.println("Hãy nhập vào một số nguyên: ");
            String strNumber = input.nextLine();
            intNumber = Integer.valueOf(strNumber); // Sử dụng valueOf thay vì new Integer
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập vào một số nguyên hợp lệ.");
        } catch (NullPointerException e) {
            System.out.println("Lỗi: Giá trị không hợp lệ.");
        } finally {
            if (intNumber != null) {
                System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
            } else {
                System.out.println("Không thể chuyển đổi vì không có số nguyên hợp lệ.");
            }
            input.close();
        }
    }
}
//Trong đoạn mã này:

//try block chứa mã có thể gây ra ngoại lệ.
//catch (NumberFormatException e) để xử lý trường hợp người dùng nhập vào một chuỗi không thể chuyển đổi thành số nguyên.
//catch (NullPointerException e) để xử lý trường hợp intNumber là null.
//finally block để thực hiện các hành động cuối cùng, trong đó có kiểm tra intNumber trước khi chuyển đổi và đóng Scanner.