package DocumentEditorLld;

import java.util.Objects;

public class DocumentEditor {

    private  Document document;

    private Persitance persitance;

    private String renderDocument = "";

    public DocumentEditor(Document document, Persitance persitance) {
        this.document = document;
        this.persitance = persitance;
    }


    public void  addText(String text){
        document.addElement(new TextElement(text));
    }


    public void addImage(String image){
        document.addElement(new ImageElement(image));
    }

    public void addSpace(){
        document.addElement(new SpaceElement());
    }

    public  void addNewLine(){
        document.addElement(new NewLineElement());
    }

    public String renderDocument(){
        if(renderDocument.isEmpty()){
            renderDocument = document.render();
        }
        return renderDocument;
    }

    public void saveDocument(){
        persitance.save(renderDocument());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DocumentEditor that = (DocumentEditor) o;
        return Objects.equals(document, that.document) && Objects.equals(persitance, that.persitance) && Objects.equals(renderDocument, that.renderDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(document, persitance, renderDocument);
    }
}
