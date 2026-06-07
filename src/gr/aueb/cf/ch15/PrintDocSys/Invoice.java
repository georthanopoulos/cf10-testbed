package gr.aueb.cf.ch15.PrintDocSys;

public class Invoice implements Printable2 {

    String invoiceName;

    public Invoice(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    @Override
    public String toString() {
        return "Invoice name is: " + invoiceName;
    }

    @Override
    public void print() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(this);
    }
}
