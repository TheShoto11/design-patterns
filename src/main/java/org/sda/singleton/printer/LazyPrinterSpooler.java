package org.sda.singleton.printer;

public class LazyPrinterSpooler {
    private static LazyPrinterSpooler instance;

    private LazyPrinterSpooler() {}

    public static LazyPrinterSpooler getInstance(){
        System.out.println("LOADING INSTANCE");
        if (instance == null){
            System.out.println("DATABASE NOT INITIALIZED. LOADING DATABASE");
            try {
                Thread.sleep(5000);
            } catch (Exception e){
                System.out.println("ERROR");
            }
            System.out.println("LOADED SUCCESFULLY");
            instance = new LazyPrinterSpooler();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyPrinterSpooler lps1 = LazyPrinterSpooler.getInstance();

        LazyPrinterSpooler lps2 = new LazyPrinterSpooler();

        System.out.println(lps1 == lps2);
    }
}
