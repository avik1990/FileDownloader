package com.app.filedownloader;

public class FileData {

    String id;
    String productname;
    String fileUrl;


    public FileData(String id, String productname, String fileUrl) {
        this.id = id;
        this.productname = productname;
        this.fileUrl = fileUrl;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
