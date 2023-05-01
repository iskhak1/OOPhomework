package org.example.model.interfaces;

import java.io.IOException;

public interface Deletable {

    void delete(String title) throws IOException;
    void delete(int id) throws IOException;

}
