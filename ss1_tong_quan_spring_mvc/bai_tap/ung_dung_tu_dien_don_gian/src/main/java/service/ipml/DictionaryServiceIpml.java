package service.ipml;

import bean.Dictionary;
import repository.DictionaryRepository;
import repository.ipml.DictionaryRepositoryIpml;
import service.DictionaryService;

import java.util.List;
import java.util.Map;

public class DictionaryServiceIpml implements DictionaryService {
      DictionaryRepository dictionaryRepository = new DictionaryRepositoryIpml();
    public List<Dictionary> fillAll() {
        return this.dictionaryRepository.fillAll();
    }
}
