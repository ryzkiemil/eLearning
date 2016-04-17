package model;
public class Kelas {
    private String namaKelas;
    private Matakuliah mataKuliah;
    private Mahasiswa[] anggota;
    private Tugas[] listTugas;
    private int n=0;
    private int a=0;
    private Dosen dosen;
    
    public Kelas(String namaKelas,Matakuliah matkul, Dosen dosen){
        this.namaKelas=namaKelas;
        this.mataKuliah=matkul;
        this.dosen=dosen;
    }
    public void setMatakuliah(Matakuliah matkul){
        this.mataKuliah=matkul;
    }
    public void setDosen(Dosen dosen){
        this.dosen=dosen;
    }
    public void createTugas(String nama){
        Tugas tugas = new Tugas(nama);
        listTugas[n]=tugas;
        n++;
    }
    public void addMahasiswa(Mahasiswa mhs){
        anggota[a]=mhs;
        a++;
    }
    public void getAnggota(){
        for (int i=0;i<a;i++){
            System.out.println(anggota[i].getNama());
            i++;
        }
    }
    public void getTugas(){
        for (int i=0;i<n;i++){
            System.out.println(listTugas[i].getTugas());
            i++;
        }
    }
}
