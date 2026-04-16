package DocumentEditorLld;

import java.util.ArrayList;
import java.util.List;

public class Document  {


    List<DcoumentElement> documentElements  = new ArrayList<>();

     public void addElement(DcoumentElement element){
        documentElements.add(element);
     }

     public String render() {

         StringBuilder result = new StringBuilder();
         for (DcoumentElement element : documentElements) {
                result.append(element.render());
         }
         return result.toString();
     }

}
