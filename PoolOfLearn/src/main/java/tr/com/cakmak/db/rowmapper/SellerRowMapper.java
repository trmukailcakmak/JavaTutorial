package tr.com.cakmak.db.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import tr.com.cakmak.db.entity.SellerEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SellerRowMapper implements RowMapper<SellerEntity> {
    @Override
    public SellerEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        SellerEntity seller = new SellerEntity();

        seller.setId(rs.getInt("ID"));
        seller.setFullName(rs.getString("FULL_NAME"));
        seller.setEmail(rs.getString("EMAIL"));
        seller.setPassword(rs.getString("PASSWORD"));
        seller.setPhone(rs.getString("PHONE"));

        return seller;
    }
}
