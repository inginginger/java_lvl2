package src.java02.less04;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ChatWindow extends JFrame {
    String chatHistory = "";
    String chatLine;

    public ChatWindow() {
        setTitle("UI - Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JPanel textEntering = new JPanel(new BorderLayout());
        JTextField textField = new JTextField(10);

        JButton sendButton = new JButton("Send");
        textEntering.add(textField, BorderLayout.CENTER);
        textEntering.add(sendButton, BorderLayout.EAST);

        JTextArea content = new JTextArea();
        JScrollPane scrollContent = new JScrollPane(content);
        add(scrollContent, BorderLayout.CENTER);
        add(textEntering, BorderLayout.SOUTH);

        setVisible(true);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatLine = textField.getText();
                content.setText(setChatHistory(chatLine));
                textField.setText("");
                fileWrite(chatLine);
            }
        });

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatLine = textField.getText();
                content.setText(setChatHistory(chatLine));
                fileWrite(chatLine);
                textField.setText("");
            }
        });
    }

    public String setChatHistory(String chatLine) {
        return chatHistory = chatHistory + chatLine + "\n";
    }

    public void fileWrite(String chatLine) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("1.txt"));
            pw.write(this.chatLine + "\n");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
