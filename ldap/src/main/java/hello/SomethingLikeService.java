package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SomethingLikeService {
    @Autowired
    private SomethingThatLooksLikeDao dao;

    public List<String> getAllNames() {
        List<String> names = dao.getAllPersonNames();
        List<String> result = new ArrayList<>(names.size());

        names.forEach((item)->result.add(item));

        return result;
    }
}
