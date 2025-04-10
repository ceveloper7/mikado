package org.mikado.ch02.db;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface Database {
    List<String> load(String key);
    void store(Map<String, Serializable> data);
}
