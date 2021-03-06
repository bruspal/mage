/*
 *  Copyright 2011 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

/*
 * TournamentPlayerPanel.java
 *
 * Created on Jan 28, 2011, 1:50:29 PM
 */

package mage.client.table;

import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import mage.cards.decks.DeckCardLists;
import mage.client.SessionHandler;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class TournamentPlayerPanel extends javax.swing.JPanel {


    /** Creates new form TournamentPlayerPanel */
    public TournamentPlayerPanel() {
        initComponents();
        this.pnlPlayerName.setVisible(false);
    }

    public void init(int playerNum) {
        cbPlayerType.setModel(new DefaultComboBoxModel(SessionHandler.getPlayerTypes()));
        this.lblPlayerNum.setText("Player " + playerNum);
    }

    public JComboBox getPlayerType() {
        return this.cbPlayerType;
    }

    public boolean joinTournamentTable(UUID roomId, UUID tableId, DeckCardLists deckCardLists) {
        if (!this.cbPlayerType.getSelectedItem().equals("Human")) {
            return SessionHandler.joinTournamentTable(
                    roomId,
                    tableId,
                    this.txtPlayerName.getText(),
                    (String)this.cbPlayerType.getSelectedItem(),
                    (Integer)spnLevel.getValue(),
                    deckCardLists,
                    "");
         }
        return true;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbPlayerType = new javax.swing.JComboBox();
        lblPlayerNum = new javax.swing.JLabel();
        pnlPlayerName = new javax.swing.JPanel();
        txtPlayerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnLevel = new javax.swing.JSpinner();

        jLabel1.setLabelFor(cbPlayerType);
        jLabel1.setText("Type:");

        cbPlayerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPlayerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlayerTypeActionPerformed(evt);
            }
        });

        lblPlayerNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPlayerNum.setText("Player Num:");

        jLabel2.setText("Name:");

        jLabel3.setText("Skill:");

        spnLevel.setModel(new javax.swing.SpinnerNumberModel(6, 1, 10, 1));
        spnLevel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlPlayerNameLayout = new javax.swing.GroupLayout(pnlPlayerName);
        pnlPlayerName.setLayout(pnlPlayerNameLayout);
        pnlPlayerNameLayout.setHorizontalGroup(
            pnlPlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerNameLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        pnlPlayerNameLayout.setVerticalGroup(
            pnlPlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(jLabel2)
                .addComponent(spnLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPlayerNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPlayerType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(lblPlayerNum)
                .addComponent(jLabel1)
                .addComponent(cbPlayerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlayerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlayerTypeActionPerformed
        if (!this.cbPlayerType.getSelectedItem().equals("Human")) {
            this.pnlPlayerName.setVisible(true);
            if (this.txtPlayerName.getText().isEmpty()) {
                this.txtPlayerName.setText("Computer " + this.lblPlayerNum.getText());
            }
        }
        else {
            this.pnlPlayerName.setVisible(false);
        }
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_cbPlayerTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbPlayerType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPlayerNum;
    private javax.swing.JPanel pnlPlayerName;
    private javax.swing.JSpinner spnLevel;
    private javax.swing.JTextField txtPlayerName;
    // End of variables declaration//GEN-END:variables

}
