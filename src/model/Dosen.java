package model;
public class Dosen extends Orang{
    private Kelas[] listKelas;
    private String nip;
    private int n=0;
    
    public Dosen(String nama,String noTelp, String alamat, String nip){
        super(nama,noTelp,alamat);
        this.nip=nip;
    }
    public void createKelas(String namaKelas, Matakuliah matkul, Dosen dosen){
        Kelas k = new Kelas(namaKelas,matkul,dosen);
        listKelas[n]=k;
        n++;
    }
}
