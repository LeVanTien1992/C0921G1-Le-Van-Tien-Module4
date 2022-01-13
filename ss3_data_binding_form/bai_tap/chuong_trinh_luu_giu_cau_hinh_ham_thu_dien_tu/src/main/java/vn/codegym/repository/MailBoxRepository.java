package vn.codegym.repository;

import vn.codegym.model.MailBox;

import java.util.List;

public interface MailBoxRepository {
    List<MailBox> findAll();
    MailBox updateByPage(int pageSize);
    void save(MailBox mailBox);
}
