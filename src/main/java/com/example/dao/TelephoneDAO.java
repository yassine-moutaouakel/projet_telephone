package com.example.dao;

import com.example.db.DBConnect;
import com.example.model.Telephone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelephoneDAO {
    public List<Telephone> getAllTelephones() {
        List<Telephone> telephones = new ArrayList<>();
        String sql = "SELECT * FROM telephone";

        try (Connection conn = DBConnect.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Telephone telephone = new Telephone();
                telephone.setId(rs.getInt("id"));
                telephone.setMarque(rs.getString("marque"));
                telephone.setModele(rs.getString("modele"));
                telephone.setPrix(rs.getDouble("prix"));
                telephone.setDescription(rs.getString("description"));
                telephone.setUrlImage(rs.getString("url_image"));
                telephones.add(telephone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return telephones;
    }
}
