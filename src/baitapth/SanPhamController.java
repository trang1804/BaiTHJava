package baitapth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class SanPhamController{
    public static ArrayList<SanPham> getAllSanPham() throws SQLException{
       ArrayList<SanPham> list = new ArrayList<>();
        Connection conn = ConnectDB.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SanPham");
            while (rs.next()){
                String ma = rs.getString("MaSP");
                String ten = rs.getString("TenSP");
                String nxs = rs.getString("NhaSanXuat");
                String maloai = rs.getString("MaLoaiSP");
                
                SanPham sp = new SanPham(ma,ten,nxs,maloai);
                list. add(sp);              
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}