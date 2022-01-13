package vn.codegym.repository.ipml;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Medical;
import vn.codegym.repository.MedicalRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MedicalRepositoryIpml implements MedicalRepository {

    private static List<Medical> medicalList;
    static {
        medicalList= new ArrayList<>();
        medicalList.add(new Medical("Tien", "1990", 1, "Việt Nam", "9438043349", "Tàu Thuyền", "VN123",121,
                "21-12-2021", "22-12-2021", "Không", "10 Phạm Văn Nghị", "100 Nguyễn Văn Linh",
                "0902434932","tien@Ggmail.com", "Bình Thường", "không"));
        medicalList.add(new Medical("Binh", "1990", 0, "Việt Nam", "9438043349", "Tàu Thuyền", "VN123",121,
                "21-12-2021", "22-12-2021", "Không", "10 Phạm Văn Nghị", "100 Nguyễn Văn Linh",
                "0902434932","tien@Ggmail.com", "Bình Thường", "không"));
        medicalList.add(new Medical("Trang", "1990", 1, "Việt Nam", "9438043349", "Tàu Thuyền", "VN123",121,
                "21-12-2021", "22-12-2021", "Không", "10 Phạm Văn Nghị", "100 Nguyễn Văn Linh",
                "0902434932","tien@Ggmail.com", "Bình Thường", "không"));
        medicalList.add(new Medical("Tinh", "1990", 0, "Việt Nam", "9438043349", "Tàu Thuyền", "VN123",121,
                "21-12-2021", "22-12-2021", "Không", "10 Phạm Văn Nghị", "100 Nguyễn Văn Linh",
                "0902434932","tien@Ggmail.com", "Bình Thường", "không"));
        medicalList.add(new Medical("Vinh", "1990", 1, "Việt Nam", "9438043349", "Tàu Thuyền", "VN123",121,
                "21-12-2021", "22-12-2021", "Không", "10 Phạm Văn Nghị", "100 Nguyễn Văn Linh",
                "0902434932","tien@Ggmail.com", "Bình Thường", "không"));
    }
    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public void save(Medical medical) {
        medicalList.add(medical);
    }

    @Override
    public Medical getById(int index) {
        return null;
    }
}
