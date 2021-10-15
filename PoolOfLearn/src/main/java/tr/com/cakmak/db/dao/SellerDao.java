package tr.com.cakmak.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tr.com.cakmak.db.entity.SellerEntity;
import tr.com.cakmak.db.rowmapper.SellerRowMapper;

import java.util.List;

@Repository
public class SellerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<SellerEntity> getAllSeller() {
        List<SellerEntity> sellers = jdbcTemplate.query("select * from Seller", (result, rowNum) ->
            {
                SellerRowMapper mapper = new SellerRowMapper();
                return mapper.mapRow(result, rowNum);
            }
        );
        return sellers;
    }
}
