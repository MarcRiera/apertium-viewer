/*
 * Copyright 2015 Jacob Nordfalk
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 */
package apertiumview;

public class ApertiumViewAboutBox extends javax.swing.JDialog {

    public ApertiumViewAboutBox(java.awt.Frame parent) {
		super(parent);
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
    javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
    javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
    javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
    closeButton = new javax.swing.JButton();
    javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
    javax.swing.JLabel imageLabel = new javax.swing.JLabel();
    javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
    javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
    javax.swing.JLabel versionLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Apertium-viewer");
    setModal(true);
    setName("aboutBox"); // NOI18N
    setResizable(false);

    homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
    homepageLabel.setText("Homepage:");

    appHomepageLabel.setText("http://wiki.apertium.org/wiki/Apertium-viewer");

    vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
    vendorLabel.setText("Vendor:");

    appVendorLabel.setText("Jacob Nordfalk");

    closeButton.setMnemonic('C');
    closeButton.setText("Close");
    closeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeButtonActionPerformed(evt);
      }
    });

    appDescLabel.setText("<html>A tool to view and edit the output of the various stages of an apertium translation, and an editor of the source files");

    imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apertiumview/resources/apertium.png"))); // NOI18N

    appVersionLabel.setText("2.3");

    appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
    appTitleLabel.setText("Apertium-viewer");

    versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
    versionLabel.setText("Product Version:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(imageLabel)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(versionLabel)
                  .addComponent(vendorLabel)
                  .addComponent(homepageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(appVersionLabel)
                  .addComponent(appVendorLabel)
                  .addComponent(appHomepageLabel)))
              .addComponent(appTitleLabel, javax.swing.GroupLayout.Alignment.LEADING))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(closeButton)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(appTitleLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(versionLabel)
          .addComponent(appVersionLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(vendorLabel)
          .addComponent(appVendorLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(homepageLabel)
          .addComponent(appHomepageLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(closeButton)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
    // TODO add your handling code here:
    setVisible(false);
  }//GEN-LAST:event_closeButtonActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton closeButton;
  // End of variables declaration//GEN-END:variables
}
