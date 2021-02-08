package org.example.view;




import org.example.enums.CustomerOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerView extends JPanel{
    //private JFrame frame;
    private JPanel sidePanel;
    private JPanel mainPanel;
    private JPanel bottomPanel;
    private CardLayout layout;
    final static String SAVE = "save";
    final static String UPDATE = "update";
    final static String GET = "get";
    final static String LIST = "list";
    final static String DELETE = "delete";

    private JButton save;
    private JButton update;
    private JButton delete;
    private JButton get;
    private JButton list;
    private JButton submit;
    private JButton clear;

    private JTextField id;
    private JTextField idD;
    private JTextField name;
    private JTextField phone;
    private JTextField address;
    private JTextField city;
    private JTextField state;
    private JTextField zip;
    private JTextField country;
    private JTextField credit_limit;


    private int options;
    public customerView(){
        layout = new CardLayout();
        prepareGui();
        options = CustomerOptions.SAVE.getValue();//default
    }

    public JButton getSubmit() {
        return submit;
    }

    public JButton getClear() {
        return clear;
    }

    public JTextField getId() {
        return id;
    }


    public JTextField getCustomerName() {
        return name;
    }

    public JTextField getPhone() {
        return phone;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getCity() {
        return city;
    }

    public JTextField getState() {
        return state;
    }

    public JTextField getZip() {
        return zip;
    }

    public JTextField getCountry() {
        return country;
    }

    public JTextField getCredit_limit() {
        return credit_limit;
    }

    public String idTxt(){return id.getText();}

    public int getOptions() { return options; }

    private void prepareGui() {
        mainPanel = new JPanel();
        prepareMainPanel();
        sidePanel = new JPanel();
        prepareSidePanel();
        bottomPanel = prepareBottomPanel();

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 layout.show(mainPanel, "save");
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                layout.show(mainPanel, "update");
                options = CustomerOptions.UPDATE.getValue();
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                layout.show(mainPanel, "delete");
                options = CustomerOptions.DELETE.getValue();
            }
        });
        get.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                layout.show(mainPanel, "get");
                options = CustomerOptions.GET.getValue();
            }
        });
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                layout.show(mainPanel, "list");
                options = CustomerOptions.LIST.getValue();
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id.setText("");
                name.setText("");
                phone.setText("");
                address.setText("");
                city.setText("");
                state.setText("");
                zip.setText("");
                country.setText("");
                credit_limit.setText("");

            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("submit");
                System.out.println(idTxt());
                //customerService.deleteCustomer(Integer.parseInt(custView.idTxt()));
            }
        });

        add(sidePanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void prepareMainPanel() {
        mainPanel.setLayout(layout);
        mainPanel.add(generateMainPanel("save"),SAVE);
        mainPanel.add(generateMainPanel("update"),UPDATE);
        mainPanel.add(generateMainPanel("delete"),DELETE);
        mainPanel.add(generateMainPanel("get"),GET);
        mainPanel.add(generateMainPanel("list"),LIST);
    }

    private JPanel prepareBottomPanel() {
        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        panel.setLayout(layout);

        //radio buttons
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        panel.add(submit);
        //WW panel.add(clear);
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        return panel;
    }

    private void prepareSidePanel() {

        sidePanel.setLayout(new FlowLayout());

        //radio buttons
        save = new JButton("Save");
        update = new JButton("Update");
        delete = new JButton("Delete");
        get = new JButton("Get");
        list = new JButton("List");

        sidePanel.add(save);
        sidePanel.add(update);
        sidePanel.add(delete);
        sidePanel.add(get);
        sidePanel.add(list);
        sidePanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

    }

    private JPanel generateMainPanel(String type){

        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(9,20);
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        layout.setVgap(10);
        panel.setLayout(layout);

        JLabel idlbl;
        id = new JTextField();
        if(type.equalsIgnoreCase("delete") || type.equalsIgnoreCase("get")){
            if(type.equalsIgnoreCase("delete"))
                idlbl = new JLabel("Enter Customer Id to delete: ");
            else
                idlbl = new JLabel("Enter Customer Id to retrieve information: ");
            panel.add(idlbl);
            panel.add(id);
        }
        else if(type.equalsIgnoreCase("list")){
            return panel;//edit here
        }
        else{
            if(type.equalsIgnoreCase("update")){
                idlbl = new JLabel("Customer Id: ");
                panel.add(idlbl);
                panel.add(id);
            }
            JLabel namelbl = new JLabel("Customer Name: ");
            name = new JTextField("");
            JLabel phonelbl = new JLabel("Phone: ");
            phone = new JTextField("");
            JLabel addresslbl = new JLabel("Address Line: ");
            address = new JTextField("");
            JLabel citylbl = new JLabel("City: ");
            city = new JTextField("");
            JLabel statelbl = new JLabel("State: ");
            state = new JTextField("");
            JLabel zipcode = new JLabel("Postal Code: ");
            zip = new JTextField("");
            JLabel countrylbl = new JLabel("Country: ");
            country = new JTextField("");
            JLabel creditLimitlbl = new JLabel("Credit Limit: ");
            credit_limit = new JTextField("");


            panel.add(namelbl);
            panel.add(name);
            panel.add(phonelbl);
            panel.add(phone);
            panel.add(addresslbl);
            panel.add(address);
            panel.add(citylbl);
            panel.add(city);
            panel.add(statelbl);
            panel.add(state);
            panel.add(zipcode);
            panel.add(zip);
            panel.add(countrylbl);
            panel.add(country);
            panel.add(creditLimitlbl);
            panel.add(credit_limit);

        }

        return panel;
    }

    private JPanel listAll() {
        System.out.println("list");
        return new JPanel();
    }

    public JFrame returnView(){
        JFrame frame;
        frame = new JFrame();
        frame.setTitle("CustomerView");
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(sidePanel, BorderLayout.NORTH);
        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        return frame;
    }


}


class main_panel{
    
}