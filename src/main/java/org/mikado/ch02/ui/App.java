package org.mikado.ch02.ui;

import org.mikado.ch02.db.Database;
import org.mikado.ch02.db.FileDB;

public class App {

    private UI ui;

    public void launch(Database database) throws ApplicationException {
        ui = new UI(database);
        ui.showLogin();
    }
}
