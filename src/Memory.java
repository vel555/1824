import java.util.LinkedList;

public class Memory {
    private LinkedList<String> memory;
    private static final int MAX_SIZE = 5;

    public Memory() {
        this.memory = new LinkedList<>();
    }

    public void add(String input) throws MemoryOverflowException {
        if (memory.size() >= MAX_SIZE) {
            throw  new MemoryOverflowException ("память переполнена. максимум" + MAX_SIZE + "элементов");
        }
        memory.add(input);
    }

    public String get() throws MemoryEmptyException {
        if (memory.isEmpty()) {
            throw new MemoryEmptyException ("память пуста. невозможно получить элемент.");
        }
        return memory.poll();
    }
}
