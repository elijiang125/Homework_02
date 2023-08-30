public interface LispList {
    boolean empty();
    Object head();
    LispList tail();
    int length();
    LispList merge(LispList other);

    boolean contains(Object obj);
}
