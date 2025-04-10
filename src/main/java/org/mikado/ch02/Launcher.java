package org.mikado.ch02;

import org.mikado.ch02.db.FileDB;
import org.mikado.ch02.ui.App;
import org.mikado.ch02.ui.ApplicationException;

public class Launcher {
    public static void main(String[] argv) {
        try {
            App app = new App();
            app.launch(new FileDB(argv[0]));
        } catch (ApplicationException e) {
            System.err.println("Could not start application");
            e.printStackTrace();
        }
    }
}
