package helper;

import javax.swing.*;

public class TablePopupMenu extends JPopupMenu {

    private JMenuItem delete;
    private JMenuItem show;

    public TablePopupMenu() {
        addMenuItems();
    }

    private void addMenuItems() {
        this.add(getDelete());
        this.add(getShow());
    }

    public JMenuItem getDelete() {
        if (delete == null) {
            delete = new JMenuItem("delete");
        }
        return delete;
    }

    public JMenuItem getShow() {
        if (show == null) {
            show = new JMenuItem("show");
        }
        return show;
    }
}
