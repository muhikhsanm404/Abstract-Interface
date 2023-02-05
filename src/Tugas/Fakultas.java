/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Muh Ikhsan M
 */
public class Fakultas implements Informatika ,Siskom {
    
    //Method interface Informatika
    @Override
    public void dekan1(){
        System.out.println("DEKAN 1 = TURUNAN INTERFACE INFORMATIKA");
    }
    @Override
    public void dosen1(){
        System.out.println("DOSEN 1 = TURUNAN INTERFACE INFORMATIKA");
    }
    @Override
    public void mhs1(){
        System.out.println("MAHASISWA 1 = TURUNAN INTERFACE INFORMATIKA");
    }
    //Method interface Siskom
    @Override
        public void dekan2(){
        System.out.println("DEKAN 2 = TURUNAN INTERFACE SISKOM");
    }
    @Override
    public void dosen2(){
        System.out.println("DOSEN 2 = TURUNAN INTERFACE SISKOM");
    }
    @Override
    public void mhs2(){
        System.out.println("MAHASISWA 2 = TURUNAN INTERFACE SISKOM");
    }
}
