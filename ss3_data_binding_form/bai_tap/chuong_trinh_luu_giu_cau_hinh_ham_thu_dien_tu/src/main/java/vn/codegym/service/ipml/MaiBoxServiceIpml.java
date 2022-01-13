package vn.codegym.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.MailBox;
import vn.codegym.repository.MailBoxRepository;
import vn.codegym.service.MaiBoxService;

import java.util.List;
@Service
public class MaiBoxServiceIpml implements MaiBoxService {

    @Autowired
    private MailBoxRepository mailBoxRepository;
    @Override
    public List<MailBox> findAll() {
        return mailBoxRepository.findAll();
    }

    @Override
    public MailBox updateByPage(int pageSize) {
        return mailBoxRepository.updateByPage(pageSize);
    }

    @Override
    public void save(MailBox mailBox) {
        mailBoxRepository.save(mailBox);
    }
}
