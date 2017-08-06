package com.henry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hqi on 8/5/17.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
