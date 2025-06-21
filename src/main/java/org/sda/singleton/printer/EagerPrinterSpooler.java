package org.sda.singleton.printer;

public class EagerPrinterSpooler {
    private static final EagerPrinterSpooler instance = new EagerPrinterSpooler();

    private EagerPrinterSpooler(){}

    public static EagerPrinterSpooler getInstance(){
        return instance;
    }

    public void print(String documentName){
        System.out.println("Printing document from eager printer: " + documentName);
    }

    public static void main(String[] args) {
        EagerPrinterSpooler eps1 = EagerPrinterSpooler.getInstance();
        eps1.print("Java");

        EagerPrinterSpooler eps2 = EagerPrinterSpooler.getInstance();
        eps2.print("C++");

        System.out.println("Are both instances the same? " + (eps1==eps2));
    }
}
