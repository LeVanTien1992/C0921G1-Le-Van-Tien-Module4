package repository.ipml;

import bean.Dictionary;
import repository.DictionaryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepositoryIpml implements DictionaryRepository {
   private static Map<Integer, Dictionary> map = new HashMap<Integer, Dictionary>();
    static {
        map.put(1, new Dictionary("hello", "xin chào"));
        map.put(2, new Dictionary("good bye", "tạm biệt"));
        map.put(3, new Dictionary("dog", "con chó"));
        map.put(4, new Dictionary("cat", "con mèo"));
        map.put(5, new Dictionary("love", "yêu"));
        map.put(6, new Dictionary("hate", "ghét"));
        map.put(7, new Dictionary("english", "tiếng anh"));
        map.put(8, new Dictionary("code", "viết mã"));
    }

    public List<Dictionary> fillAll() {
        return new ArrayList<Dictionary>(map.values());
    }
}
