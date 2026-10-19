package uk.ac.westminster.products_api;

public class Digitalproduct extends product {
    private String downloadUrl;
    private double fileSizeMB;

    public Digitalproduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        //super(id,name,price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public Digitalproduct() {


    }

    public String getdownloadUrl() {
        return downloadUrl;
    }

    public double getfileSizeMB() {
    return fileSizeMB;
    }
}
