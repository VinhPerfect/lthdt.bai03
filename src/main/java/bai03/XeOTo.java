/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai03;

/**
 *
 * @author lqv20
 */
public class XeOTo {
    private String hangxe;
    private int namsanxuat;
    private float dongco;

    public XeOTo(String hangxe, int namsanxuat, float dongco) {
        this.hangxe = hangxe;
        this.setNamsanxuat(namsanxuat);
        this.setDongco(dongco);
    }

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        if(namsanxuat<1886 || namsanxuat>2024){
            System.out.println("nam san xuat khong phu hop");
        }else {
            this.namsanxuat = namsanxuat;
        }
        
    }

    public float getDongco() {
        return dongco;
    }

    public void setDongco(float dongco) {
        if (dongco<60 || dongco>700){
            System.out.println("Ma luc khong phu hop theo yeu cau cua ban");
        }else{
            this.dongco = dongco;
        }
    }

    @Override
    public String toString() {
        if (namsanxuat == 0 && dongco == 0){
             return "Xe O To { " + "hang xe = " + hangxe + "}";
        }else if(dongco == 0) {
            return "Xe O To" + " hang xe = " + hangxe + ", nam san xuat = " + namsanxuat;
        }else if (namsanxuat==0) {
            return "Xe O To { " + "hang xe = " + hangxe + ", dong co = " + dongco + " ma luc}";
        }else {
            return "Xe O To { " + "hang xe = " + hangxe + ", nam san xuat = " + namsanxuat + "dong co = " + dongco + " ma luc}";
        }
        
    }
    
    
}
