import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UI {
    private JTextField textField2;
    private JTextField textField4;
    private JTable table1;
    private JTextField textField5;
    private JButton ADDButton;
    private JButton EDITButton;
    private JButton DELETEButton;
    private JComboBox<Integer> comboBox1;
    public JPanel mainPanel;
    private JComboBox comboBox2;
    ArrayList<Person> personList;

    public UI(){
    personList = new ArrayList<Person>();
    setComboBox();
    personList.add(new Person("M001", "MAULA", 2006, "ABC@gmail.com", "LULUS"));
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() == null) return;
                try {
                    int year = Integer.parseInt(comboBox1.getSelectedItem().toString().trim());
                    String Category = comboBox2.getSelectedItem().toString();
                    personList.add(new Person(
                            textField5.getText(),
                            textField2.getText(),
                            year,
                            textField4.getText(),
                            Category
                    ));
                    setTable();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainPanel, "Invalid year selection.");
                }
            }
        });

        EDITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = findPersonIndexById(textField5.getText());
                String Category = comboBox2.getSelectedItem().toString();
                if (index != -1 && comboBox1.getSelectedItem() != null) {
                    try {
                        int year = Integer.parseInt(comboBox1.getSelectedItem().toString().trim());
                        personList.set(index, new Person(
                                textField5.getText(),
                                textField2.getText(),
                                year,
                                textField4.getText(),
                                Category
                        ));
                        setTable();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(mainPanel, "Invalid year selection.");
                    }
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Person ID not found.");
                }
            }
        });

        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = findPersonIndexById(textField5.getText());
                if (index != -1) {
                    int confirm = JOptionPane.showConfirmDialog(mainPanel, "Are you sure to delete this data?", "CONFIRMATION", JOptionPane.YES_NO_OPTION);
                    if(confirm == 0) {
                        personList.remove(index);
                    }
                    setTable();
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Person ID not found.");
                }
            }
        });

        setTable();
    }
    public void setComboBox() {
        if (comboBox1 == null) {
            comboBox1 = new JComboBox<>();
        } else {
            comboBox1.removeAllItems();
        }
        if (comboBox2 == null) {
            comboBox2 = new JComboBox<>();
        } else {
            comboBox2.removeAllItems();
        }
        String[] category = {"LULUS", "TIDAK LULUS", "MENGUNDURKAN DIRI", "DIKELUARKAN"};
        comboBox2.setModel(new DefaultComboBoxModel<>(category));
        for (int i = 1900; i <= 2026; i++) {
            comboBox1.addItem(i);
        }
        comboBox1.setSelectedItem(2026);
    }
    private int findPersonIndexById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equalsIgnoreCase(id.trim())) {
                return i;
            }
        }
        return -1;
    }
    public void setTable(){

        String[] Header = {"ID", "NAME", "YEAR", "EMAIL", "CATEGORY"};
        DefaultTableModel model = new DefaultTableModel(Header, 0);
        for(Person person: personList){
            Object[] data = {person.getId(), person.getName(), person.getYear(), person.getEmail(),person.getCategory()};
            model.addRow(data);
        }
        table1.setModel(model);

    }
    /*public static void main(String[] args){
        JFrame frame = new JFrame("PERSONS");
        UI uii = new UI();


        frame.setContentPane(uii.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }*/



}
