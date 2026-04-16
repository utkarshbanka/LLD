package DocumentEditorLld;

import java.util.Objects;

public class ImageElement implements  DcoumentElement {

    String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {

        return "[ImagePath:" + imagePath + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImageElement that = (ImageElement) o;
        return Objects.equals(imagePath, that.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(imagePath);
    }
}
