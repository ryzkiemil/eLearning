package model;
public class Orang {
    String nama;
    private String alamat;
    private String noTelp;
    
    public Orang(String nama,String noTelp,String alamat){
        this.nama=nama;
        this.noTelp=noTelp;
        this.alamat=alamat;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp=noTelp;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
}
