package view;

import javax.swing.*;
import java.awt.*;

public class KategoriSampahView extends JFrame {
    public KategoriSampahView() {
        // Set up the frame
        setTitle("Kategori Sampah");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(420, 660);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(245, 245, 245));

        // Title Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(new Color(245, 245, 245));
        titlePanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 30, 0));

        JLabel lblTitle = new JLabel("Kategori Sampah", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 32));
        lblTitle.setForeground(new Color(51, 51, 51));
        titlePanel.add(lblTitle, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(new Color(245, 245, 245));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] kategori = {
            "Sampah Elektronik Rumah Tangga",
            "Sampah Elektronik Kantor",
            "Sampah Elektronik Hiburan",
            "Sampah Elektronik Komunikasi",
            "Sampah Elektronik Kesehatan"
        };

        for (int i = 0; i < kategori.length; i++) {
            JButton btnKategori = new JButton(kategori[i]);
            btnKategori.setHorizontalAlignment(SwingConstants.LEFT); // Teks rata kiri
            btnKategori.setPreferredSize(new Dimension(300, 45));
            btnKategori.setFont(new Font("Arial", Font.BOLD, 14));
            btnKategori.setBackground(new Color(70, 130, 180));
            btnKategori.setForeground(Color.WHITE);
            btnKategori.setBorderPainted(false);
            btnKategori.setFocusPainted(false);

            gbc.gridx = 0;
            gbc.gridy = i;
            buttonPanel.add(btnKategori, gbc);
        }

        // Add panels to main panel
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add main panel to frame
        add(mainPanel);

        // Debugging: Output untuk memastikan tampilan dibuat
        System.out.println("KategoriSampahView initialized");
    }
}

