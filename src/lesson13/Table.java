package lesson13;

import java.util.Objects;

public class Table {
    private int height;
    private int lenght;
    private int width;

    public Table() {
    }

    public Table(int height, int lenght, int width) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;
        Table table = (Table) o;
        return getHeight() == table.getHeight() &&
                getLenght() == table.getLenght() &&
                getWidth() == table.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getLenght(), getWidth());
    }
}
