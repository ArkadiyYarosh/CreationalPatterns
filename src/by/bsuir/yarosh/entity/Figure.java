package by.bsuir.yarosh.entity;

/**
 * Created by Lemm on 16.11.14.
 */
public class Figure {
    private Type type;
    private Color color;
    private Size size;

    public Figure() {
    }

    public Figure(Type type, Color color, Size size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (color != figure.color) return false;
        if (size != figure.size) return false;
        if (type != figure.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Figure{");
        sb.append("type=").append(type);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
