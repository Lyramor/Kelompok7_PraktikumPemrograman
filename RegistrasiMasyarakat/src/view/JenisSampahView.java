package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JenisSampahView extends JFrame {
    private JButton btnLogam;
    private JButton btnPlastik;
    private JButton btnKaca;
    private JButton btnKomponenElektronik;
    private JButton btnBaterai;
    private JButton btnKembali;

    public JenisSampahView() {
        // Set up the frame
        setTitle("Jenis Sampah");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(420, 660);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(230, 230, 230)); // Sama seperti HalamanAwalView

        // Back button panel
        JPanel backButtonPanel = new JPanel();
        backButtonPanel.setLayout(new BorderLayout());
        backButtonPanel.setBackground(new Color(230, 230, 230));
        backButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));

        btnKembali = new JButton("\u2190 Kembali"); // Unicode untuk panah kiri
        btnKembali.setFont(new Font("Arial", Font.PLAIN, 12));
        btnKembali.setForeground(new Color(1, 88, 88)); // Warna teks
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        btnKembali.setFocusPainted(false);

        backButtonPanel.add(btnKembali, BorderLayout.WEST);

        // Title Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(new Color(230, 230, 230));
        titlePanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 30, 0));

        JLabel lblTitle = new JLabel("Jenis Sampah", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 32));
        lblTitle.setForeground(new Color(51, 51, 51));
        titlePanel.add(lblTitle, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(230, 230, 230)); // Sama seperti HalamanAwalView
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Buttons
        btnLogam = createStyledButton("Logam");
        btnPlastik = createStyledButton("Plastik");
        btnKaca = createStyledButton("Kaca");
        btnKomponenElektronik = createStyledButton("Komponen Elektronik");
        btnBaterai = createStyledButton("Baterai");

        // Add buttons to button panel
        gbc.gridx = 0;

        gbc.gridy = 0;
        buttonPanel.add(btnLogam, gbc);

        gbc.gridy = 1;
        buttonPanel.add(btnPlastik, gbc);

        gbc.gridy = 2;
        buttonPanel.add(btnKaca, gbc);

        gbc.gridy = 3;
        buttonPanel.add(btnKomponenElektronik, gbc);

        gbc.gridy = 4;
        buttonPanel.add(btnBaterai, gbc);

        // Add panels to main panel
        mainPanel.add(backButtonPanel, BorderLayout.NORTH);
        mainPanel.add(titlePanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        // Debugging: Output untuk memastikan frame berhasil diinisialisasi
        System.out.println("Jenis Sampah View initialized");
    }

    // Method untuk menambahkan listener tombol kembali
    public void addBackButtonListener(ActionListener listener) {
        btnKembali.addActionListener(listener);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(300, 45));
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(1, 88, 88)); // Warna tombol sama seperti HalamanAwalView
        button.setForeground(Color.WHITE);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JenisSampahView jenisSampahView = new JenisSampahView();
            jenisSampahView.setVisible(true);
        });
    }
}
