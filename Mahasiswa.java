package model;
public class Mahasiswa extends Orang{
    private String nim;
    private Kelas[] kelas;
    public Mahasiswa(String nama, String noTelp, String alamat, String nim){
        super(nama,noTelp,alamat);
        this.nim=nim;
    }
    @Override
    public String getNama(){
        return nama;
    }
    public void joinKelasVirtual(){
        
    }
}
