import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MemoryService memoryService = new MemoryService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите данные (введите 'get' для получения старого элемента, 'exit' для выхода):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.equalsIgnoreCase("get")) {
                memoryService.getOldest();
            }else {
                memoryService.addInput(input);
            }
        }

        scanner.close();
    }
}