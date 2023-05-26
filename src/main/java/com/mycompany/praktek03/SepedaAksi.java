package com.mycompany.praktek03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        
        s.setMerk("Butterfly");
        s.setWarna("Merah");
        s.setHarga(1000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("Suzuka");
        sm.setWarna("Putih");
        sm.setHarga(180000);
        sm.setJenisMotor("Listrik");
        sm.cetakInfo();
        System.out.println("Jenis : "+sm.getJenisMotor());
        sm.throttle();
     
    }
    
}
