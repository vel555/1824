import java.sql.SQLOutput;

public class MemoryService {
    private final Memory memory;

    public MemoryService() {
        this.memory = new Memory();
    }

    public void addInput(String input) {
        try {
            memory.add(input);
            System.out.println("элемент добавлен: " + input);
        } catch (MemoryOverflowException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getOldest() {
        try {
            String oldest = memory.get();
            System.out.println("самый старый элемент: "+ oldest);
        } catch (MemoryEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
