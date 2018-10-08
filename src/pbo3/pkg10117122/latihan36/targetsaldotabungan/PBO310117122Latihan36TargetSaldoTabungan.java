/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan36.targetsaldotabungan;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : melakukan perhitungan lama tabungan sampai mencapai saldo 
 *                     target dan menampilkannya.
 */
public class PBO310117122Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
        System.out.println();
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }  
}
