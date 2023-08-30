public class NonEmptyList implements LispList{
    String str;
    LispList next;

    //static variable?
    static LispList NIL = new EmptyList();

    public NonEmptyList(String str) {
        this.str = str;
        this.next = NIL;
    }

    public NonEmptyList(String str, LispList tail) {
        this.str = str;
        this.next = tail;
    }

    //convenience method?
    public NonEmptyList cons(String str) {
        return new NonEmptyList(str);
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public Object head() {
        return str;
    }

    @Override
    public LispList tail() {
        return next;
    }

    @Override
    public int length() {
        int result = 1; //we'll include the head
        LispList temp = tail();
        while (!temp.empty()) {
            //while next lisp isn't empty
            result++;
            temp = tail().tail();
        }
        return result;
    }

    @Override
    public LispList merge(LispList other) {
        if (other.empty()) {
            return this; //if empty list, return this
        } else {
            return new NonEmptyList(head().toString(), other.merge(tail()));
        }
    }

    @Override
    public boolean contains(Object obj) {
        while (!next.empty()) {
            if (head() == obj) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return head() + " " + tail().toString();
    }
}
