package DocumentEditorLld;

public class DocumentClient {


    public static void main(String[] args) {

        Document document = new Document();
        Persitance  persitance = new SaveToFile();

        DocumentEditor documentEditor = new DocumentEditor(document,persitance);

        documentEditor.addText("This is a test");
        documentEditor.addNewLine();
        documentEditor.addImage("picture.jpg");
        System.out.println(documentEditor.renderDocument() +"Something went wrong");

        documentEditor.saveDocument();

    }




}
