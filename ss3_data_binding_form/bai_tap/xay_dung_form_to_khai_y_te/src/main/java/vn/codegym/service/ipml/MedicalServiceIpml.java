package vn.codegym.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Medical;
import vn.codegym.repository.MedicalRepository;
import vn.codegym.service.MedicalService;

import java.util.List;
@Service
public class MedicalServiceIpml implements MedicalService {

    @Autowired
    private MedicalRepository medicalRepository ;

    @Override
    public List<Medical> findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public void save(Medical medical) {
        medicalRepository.save(medical);
    }

    @Override
    public Medical getById(int index) {
        return null;
    }
}
