package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private char[] stack;
    public CharStackImpl() {
        stack = new char[0];
    } //leer.

    @Override
    public void push(char c) {
        char[] neu = new char[stack.length + 1];
        System.arraycopy(stack, 0, neu, 0, stack.length);
        neu[stack.length] = c;
        stack = neu;
    }

    @Override
    public char pop() {
        char c;
        if (stack.length == 0) {
            throw new NoSuchElementException();
        } else {
            char[] neu = new char[stack.length - 1];
            c = stack[stack.length -1];
            System.arraycopy(stack, 0, neu, 0, neu.length);
            stack = neu;
        }

        return c;
    }

    @Override
    public int size() {
        return stack.length;
    }
}
