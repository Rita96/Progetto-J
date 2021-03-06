package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import model.Card;
import model.Game;

/**
 * Pannello del Board
 */
public class BoardPanel extends GamePanel {

    private final List<JLabel> cardLabels;
    
    /**
     * Costruttore di BoardPanel
     * @param game la partita
     */
    public BoardPanel(Game game) {
        super(game);
        initComponents();
        cardLabels = new ArrayList<>();
        cardLabels.add(card1Label);
        cardLabels.add(card2Label);
        cardLabels.add(card3Label);
        cardLabels.add(card4Label);
        cardLabels.add(card5Label);
        updateCards(null);
        updateBetting(0, 0);
        setBackground(GUIConstants.TABLE_COLOR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card5Label = new javax.swing.JLabel();
        betLabel = new javax.swing.JLabel();
        potLabel = new javax.swing.JLabel();
        card4Label = new javax.swing.JLabel();
        card3Label = new javax.swing.JLabel();
        card2Label = new javax.swing.JLabel();
        card1Label = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        betDescriptionLabel = new javax.swing.JLabel();
        potDescriptionLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 63, 43), 4));

        card5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card5Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        betLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        betLabel.setForeground(new java.awt.Color(255, 205, 51));
        betLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        betLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));
        betLabel.setMaximumSize(new java.awt.Dimension(26, 20));
        betLabel.setMinimumSize(new java.awt.Dimension(26, 20));
        betLabel.setPreferredSize(new java.awt.Dimension(26, 20));

        potLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        potLabel.setForeground(new java.awt.Color(255, 205, 51));
        potLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        potLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));

        card4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card4Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        card3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card3Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        card2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card2Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        card1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        messageLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 205, 51));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));

        headerLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 205, 51));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)));

        betDescriptionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        betDescriptionLabel.setForeground(new java.awt.Color(255, 153, 0));
        betDescriptionLabel.setText("Puntata Corrente:");

        potDescriptionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        potDescriptionLabel.setForeground(new java.awt.Color(255, 153, 0));
        potDescriptionLabel.setText("Pot Totale:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card5Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(betLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(betDescriptionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(potDescriptionLabel)
                                    .addComponent(potLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betDescriptionLabel)
                    .addComponent(potDescriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(betLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(potLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Aggiorna il pannello
     * @param bet la puntata
     * @param totalPot il pot complessivo
     */
    public void updateBetting(int bet, int totalPot)
    {
        if (bet == 0)
        {
            betLabel.setText("");
        }
        else
        {
            betLabel.setText("€ " + bet);
        }
        if (totalPot == 0)
        {
            potLabel.setText("");
        }
        else
        {
            potLabel.setText("€ " + totalPot);
        }    
    }
    
    /**
     * Aggiorna la visualizzazione delle carte
     * @param cards le carte comuni
     */
    public void updateCards(List<Card> cards)
    {
        
        int noOfCards;
        if(cards == null)
        {
            noOfCards = 0;
        }
        else
        {
            noOfCards = cards.size();
        }
        for (int i = 0; i < GUIConstants.MAX_BOARD_CARDS; i++)
        {
            if (i<noOfCards)
            {
                cardLabels.get(i).setIcon(GUIResourcesHandler.getCardImage(cards.get(i)));
            }
            else
            {
                cardLabels.get(i).setIcon(GUIResourcesHandler.getCardOff());
            }
        }
        switch(noOfCards)
        {
            case 3:
                setMessage("Il dealer distribuisce il flop");
                break;
            case 4:
                setMessage("Il dealer distribuisce il turn");
                break;
            case 5:
                setMessage("Il dealer distribuisce il river");
                break;
            default:
                break;

        }
    }
    
    /**
     * Imposta l'header
     * @param header la stringa per l'intestazione
     */
    public void setHeader(String header)
    {
        if (header.length() == 0) 
        {
            headerLabel.setText("");
        } 
        else 
        {
            headerLabel.setText(header);
        }    
    }
    
    /**
     * Imposta il messaggio
     * @param message la stringa messaggio
     */
    public void setMessage(String message) 
    {
        if (message.length() == 0) 
        {
            messageLabel.setText("");
        } 
        else 
        {
            messageLabel.setText(message);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel betDescriptionLabel;
    private javax.swing.JLabel betLabel;
    private javax.swing.JLabel card1Label;
    private javax.swing.JLabel card2Label;
    private javax.swing.JLabel card3Label;
    private javax.swing.JLabel card4Label;
    private javax.swing.JLabel card5Label;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel potDescriptionLabel;
    private javax.swing.JLabel potLabel;
    // End of variables declaration//GEN-END:variables
}