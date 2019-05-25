package lesson12;

public interface Phone {
    public abstract// по умолчанию, можно не указывать
    void call();
    void sendMessage(String message);
}
