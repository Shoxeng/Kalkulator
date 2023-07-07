

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Admin
 *
 */
public class Stos {
    LinkedList<String> stack;

    public Stos(){
        stack = new LinkedList<String>();
    }

    public void pop() throws IndexOutOfBoundsException {
        if(stack.isEmpty()) throw new IndexOutOfBoundsException("Stos jest pusty, nie mozna z niego zdjac");
        stack.removeFirst();
    }

    public void push(String string) {
        stack.addFirst(string);
    }

    public String head() throws NoSuchElementException {
        return stack.getFirst();
    }

    public int getSize() {
        return stack.size();
    }

    public boolean isempty() {
        return stack.size() == 0;
    }
}
