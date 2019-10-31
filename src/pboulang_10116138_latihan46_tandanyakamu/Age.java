/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan46_tandanyakamu;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Tandanya Kamu
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\33[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    


    public int getYearBirth(int nextInt) {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {

        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu (int umur){
        String tandanya = null;
        
        if ((0<=umur)&&(umur<=5)){
                tandanya = (red+"Lagi Lucu-lucunya");
        }else if ((5<umur)&&(umur<=10)){
                tandanya = (red+"Masih Anak-anak");
        }else if ((10<umur)&&(umur<=13)){
                tandanya = (red+"Masih Remadja");
        }else if ((13<umur)&&(umur<=19)){
                tandanya = (red+"Alay");
        }else if ((19<umur)&&(umur<=29)){
                tandanya = (red+"Lagi Galau nyari jodoh");
        }else if ((29<umur)&&(umur<=35)){
                tandanya = (red+"Lagi Sibuk nyari uang");
        }else if ((35<umur)&&(umur<=150)){
                tandanya = (red+"Sudah Tua");
        }else if ((0>umur)&&(umur>150)){
                tandanya = (red+"Tidak Terdeteksi di Kehidupan");
        }
        return tandanya;
        
    }

}
