package DataStructure.Stack.ArrayBasedStack;
import java.util.*;
class UndoBuffer {
    private String[] data;
    private int top;

    UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    boolean push(String edit) {
    if (top == data.length - 1) return false; // at capacity: reject (or evict oldest,per policy)
    data[++top] = edit;
    return true;
    }

    String pop() {
        if (isEmpty())
            throw new RuntimeException("Nothing to undo");
            return data[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class fixedundo {
    public static void main(String[] args) {
        UndoBuffer ud=new UndoBuffer(0);
        
    }
}
