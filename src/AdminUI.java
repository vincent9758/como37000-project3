import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {

    public UserModel user = null;

    public JFrame view;

    public JButton btnconfigSystem = new JButton("Setup Configure System");
    public JButton btnAddUser = new JButton("Add User");
    public JButton btnDeleteUser = new JButton("Delete User");

    public AdminUI(UserModel user) {

        this.user = user;

        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Customer View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("Adminname: " + user.mFullname));

        view.getContentPane().add(panelUser);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnconfigSystem);
        panelButtons.add(btnDeleteUser);
        panelButtons.add(btnAddUser);

        view.getContentPane().add(panelButtons);


        btnDeleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        btnconfigSystem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });



    }
}