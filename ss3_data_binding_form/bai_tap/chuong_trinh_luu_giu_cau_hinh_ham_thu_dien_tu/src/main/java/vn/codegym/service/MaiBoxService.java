package vn.codegym.service;

import vn.codegym.model.MailBox;

import java.util.List;

public interface MaiBoxService {
    List<MailBox> findAll();
    MailBox updateByPage(int pageSize);
    void save(MailBox mailBox);
}
