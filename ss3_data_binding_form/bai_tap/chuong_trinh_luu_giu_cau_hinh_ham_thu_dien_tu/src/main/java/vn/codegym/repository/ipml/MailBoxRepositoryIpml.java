package vn.codegym.repository.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.codegym.model.MailBox;
import vn.codegym.repository.MailBoxRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MailBoxRepositoryIpml implements MailBoxRepository {

   private static List<MailBox> mailBoxList;
    static {
        mailBoxList= new ArrayList<>();
        mailBoxList.add(new MailBox("English", 10, true, "King, Asgard"));
        mailBoxList.add(new MailBox("Vietnamese", 20, false, "King"));
        mailBoxList.add(new MailBox("Japanese", 100, true, "King, Asgard"));
        mailBoxList.add(new MailBox("Chinese", 50, false, "King, Thor"));
    }
    @Override
    public List<MailBox> findAll() {
        return new ArrayList<>(mailBoxList);
    }

    @Override
    public MailBox updateByPage(int pageSize) {
        for (MailBox mailBox: mailBoxList) {
            if(pageSize == mailBox.getPageSize()){
                return mailBox;
            }
        }
        return null;
    }

    @Override
    public void save(MailBox mailBox) {
        int pageSize = mailBoxList.indexOf(mailBox);
        // nếu chưa có mailBox trong list thì thêm mới
        if(pageSize == -1){
            mailBoxList.add(mailBox);
        }else {
            // nếu có rồi thì update
            mailBoxList.set(pageSize, mailBox);
        }
    }
}
