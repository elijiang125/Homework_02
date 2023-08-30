
public class EmptyList implements LispList{
    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public Object head() {
        return null;
    }

    @Override
    public LispList tail() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public LispList merge(LispList other) {
        return other;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    public String toString() {
        return "";
    }
}
