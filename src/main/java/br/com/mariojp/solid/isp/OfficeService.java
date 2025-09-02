package br.com.mariojp.solid.isp;

public class OfficeService {
    private Printer printera;

    public OfficeService(Printer printera){
        this.printera = printera;
    }

    public void printReport(String content){
        printera.print(content);
    }
}
