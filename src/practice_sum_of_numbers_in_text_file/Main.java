package practice_sum_of_numbers_in_text_file;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.ReadFileExample(path);
    }
}
