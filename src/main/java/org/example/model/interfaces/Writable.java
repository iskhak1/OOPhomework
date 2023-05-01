package org.example.model.interfaces;

import java.io.IOException;

public interface Writable {

    void write(String title,String content) throws IOException;

}
