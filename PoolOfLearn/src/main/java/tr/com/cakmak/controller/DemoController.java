package tr.com.cakmak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.com.cakmak.db.dao.SellerDao;
import tr.com.cakmak.db.entity.SellerEntity;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    SellerDao sellerDao;

    //restfull web servisi
    @RequestMapping(
            value = {"/test","/test2"},
            method = {RequestMethod.GET,RequestMethod.POST},
            consumes = {"application/json","application/xml","text/html","text/plain", MediaType.ALL_VALUE},
            produces = {"application/json","application/xml","text/html"}
    )
    @ResponseBody
    public String testMethod(){

        String a = "";

        for(int i=0;i<10;i++){
            a  = a+ "<b style=\"background:red;color:white;\">Mukail</b> ";
        }

        return a;
    }


    @RequestMapping(
            value = {"/tum-saticiler-getir"},
            method = {RequestMethod.GET,RequestMethod.POST},
            consumes = {"application/json","application/xml","text/html","text/plain", MediaType.ALL_VALUE},
            produces = {"application/json","application/xml","text/html"}
    )
    @ResponseBody
    public String tumSaticilerGetir(){

        List<SellerEntity> sellerList = sellerDao.getAllSeller();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < sellerList.size(); i++) {
            builder.append(i+".Satici<br>");
            builder.append("id : "+sellerList.get(i).getId()+"<br>");
            builder.append("FullName : "+sellerList.get(i).getFullName()+"<br>");
            builder.append("Email : "+sellerList.get(i).getEmail()+"<br>");
            builder.append("Phone : "+sellerList.get(i).getPhone()+"<br>");
            builder.append("Password : "+sellerList.get(i).getPassword()+"<br>");
        }

        return builder.toString();
    }

}
