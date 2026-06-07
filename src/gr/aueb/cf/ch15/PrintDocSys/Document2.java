package gr.aueb.cf.ch15.PrintDocSys;

public class Document2 implements Printable2 {

   String docName;

   public Document2() {

   }

   public Document2(String docName) {
       this.docName = docName;
   }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
       return "Document name is: " + docName;
    }

    @Override
    public void print() {

       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
       }
       System.out.println(this);
    }
}
