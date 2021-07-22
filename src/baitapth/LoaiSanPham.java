/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapth;

/**
 *
 * @author DELL
 */
public class LoaiSanPham {
    public String Maloaisp;
    public String Tenloaisp;

    public LoaiSanPham(String Maloaisp, String Tenloaisp) {
        this.Maloaisp = Maloaisp;
        this.Tenloaisp = Tenloaisp;
    }

    public String getMaloaisp() {
        return Maloaisp;
    }

    public void setMaloaisp(String Maloaisp) {
        this.Maloaisp = Maloaisp;
    }

    public String getTenloaisp() {
        return Tenloaisp;
    }

    public void setTenloaisp(String Tenloaisp) {
        this.Tenloaisp = Tenloaisp;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "Maloaisp=" + Maloaisp + ", Tenloaisp=" + Tenloaisp + '}';
    }
    
    
}
