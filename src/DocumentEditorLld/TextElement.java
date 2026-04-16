package DocumentEditorLld;

import java.util.Objects;

public class TextElement implements DcoumentElement {

    String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String render() {
         return text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TextElement that = (TextElement) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(text);
    }
}
