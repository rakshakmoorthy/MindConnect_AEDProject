/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.common;

import business.EcoSystem;
import business.common.SendEmailAndTextMessage;
import business.common.ValidateDateOfBirth;
import business.common.ValidateEmailTextField;
import business.common.ValidateNumbers;
import business.common.ValidatePasswords;
import business.common.ValidatePhoneNumber;
import business.common.ValidateStrings;
import business.common.Validation;
import business.enterprisepkg.Enterprise;
import business.enterprisepkg.InsuranceEnterprise;
import business.enterprisepkg.HospitalEnterprise;
import business.Network.Network;
import business.organizationpkg.DoctorOrganization;
import business.organizationpkg.PharmacyOrganization;
import business.organizationpkg.Organization;
import business.organizationpkg.DepartmentsOrganization;
import business.organizationpkg.PatientOrganization;
import business.personpkg.Patient;
import business.personpkg.Person;
import business.personpkg.PersonDirectory;
import business.personpkg.Volunteer;
import business.rolepkg.DoctorRole;
import business.rolepkg.DepartmentsAdminRole;
import business.rolepkg.PatientRole;
import business.rolepkg.SystemAdminRole;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SupervisorWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tanvireddy
 */
public class RegistrationWorkAreaPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private Organization organization;

    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    public RegistrationWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;

        helpSeekerPane.setVisible(false);

        addInputVerifiers();

        populateCountryComboBox();
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);

        //     fillForm();
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//        int w = getWidth();
//        int h = getHeight();
//
//        Color c1 = new Color(153, 197, 85);
//        Color c2 = Color.white;
//
//        GradientPaint gp = new GradientPaint(w / 4, 0, c2, w / 4, h, c1);
//        setOpaque(false);
//        g2d.setPaint(gp);
//        g2d.fillRect(0, 0, w, h);
//        setOpaque(true);
//    }
    private void addInputVerifiers() {

        InputVerifier stringValidation = new ValidateStrings();
        firstNameField.setInputVerifier(stringValidation);
        lastNameField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        //addressField2.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        //occupationField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        //addressField2.setInputVerifier(stringValidation);
        userNameJTxtField.setInputVerifier(stringValidation);

        InputVerifier passwordValidation = new ValidatePasswords();
        passwordField.setInputVerifier(passwordValidation);
        confirmPasswordField.setInputVerifier(passwordValidation);

        InputVerifier dobValidtion = new ValidateDateOfBirth();
        DobField.setInputVerifier(dobValidtion);

        InputVerifier numberValidation = new ValidateNumbers();
        zipCodeField.setInputVerifier(numberValidation);

        InputVerifier emailValidtion = new ValidateEmailTextField();
        emailIDField.setInputVerifier(emailValidtion);

        InputVerifier phnumberValidation = new ValidatePhoneNumber();
        phoneNumberField.setInputVerifier(phnumberValidation);

    }

    private void populateCountryComboBox() {
        countryComboBox.removeAllItems();
        if (ecoSystem.getNetworkList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");
            return;
        }
        countryComboBox.addItem("Please select a country");
        String networkVal = "";
        HashSet<String> hs = new HashSet();

        for (Network network : ecoSystem.getNetworkList()) {
            if (!network.getCountry().equals(networkVal)) {
                hs.add(network.getCountry());
            }
        }
        for (String s : hs) {
            countryComboBox.addItem(s);
        }
    }

    private void populateNetworkComboBox() {

        helpSeekerNetworkCombo.removeAllItems();
        if (ecoSystem.getNetworkList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");
            return;
        }
        helpSeekerNetworkCombo.addItem("Please Choose a Network");

        for (Network network : ecoSystem.getNetworkList()) {
            helpSeekerNetworkCombo.addItem(network);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        DobField = new javax.swing.JFormattedTextField();
        addressField1 = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        emailIDField1 = new javax.swing.JTextField();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        createProfileButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        isPatient = new javax.swing.JRadioButton();
        isVolunteer = new javax.swing.JRadioButton();
        helpSeekerPane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        userNameJTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        helpSeekerNetworkCombo = new javax.swing.JComboBox();
        manageEnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        isDoctorRadioBtn = new javax.swing.JRadioButton();
        volNetwork = new javax.swing.JLabel();
        volNetworkCombo = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(1, 33, 46));

        emailID1.setForeground(new java.awt.Color(255, 255, 255));
        emailID1.setText("Confirm Email Address:");

        town.setForeground(new java.awt.Color(255, 255, 255));
        town.setText("Town/City: ");

        zipCode.setForeground(new java.awt.Color(255, 255, 255));
        zipCode.setText("Zip Code:");

        emailID.setForeground(new java.awt.Color(255, 255, 255));
        emailID.setText("Email Address:");

        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("First Name:");

        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setText("Phone Number:");

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        createProfileButton.setBackground(new java.awt.Color(50, 192, 160));
        createProfileButton.setText("Register");
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });

        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name:");

        dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address1.setForeground(new java.awt.Color(255, 255, 255));
        address1.setText("Address Line1 : ");

        buttonGroup1.add(isPatient);
        isPatient.setForeground(new java.awt.Color(255, 255, 255));
        isPatient.setText("Are you a patient");
        isPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPatientActionPerformed(evt);
            }
        });

        buttonGroup1.add(isVolunteer);
        isVolunteer.setForeground(new java.awt.Color(255, 255, 255));
        isVolunteer.setText("Are you a volunteer");
        isVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isVolunteerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create User Account:");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");

        helpSeekerNw.setForeground(new java.awt.Color(255, 255, 255));
        helpSeekerNw.setText("Nearest landmark");

        helpSeekerNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpSeekerNetworkComboActionPerformed(evt);
            }
        });

        helpSeekerPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(passwordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(userNameJTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(confirmPasswordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(helpSeekerNw, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(helpSeekerNetworkCombo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout helpSeekerPaneLayout = new javax.swing.GroupLayout(helpSeekerPane);
        helpSeekerPane.setLayout(helpSeekerPaneLayout);
        helpSeekerPaneLayout.setHorizontalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(helpSeekerNw))
                        .addGap(27, 27, 27)
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpSeekerNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );

        helpSeekerPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmPasswordField, helpSeekerNetworkCombo, passwordField, userNameJTxtField});

        helpSeekerPaneLayout.setVerticalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpSeekerNw)
                    .addComponent(helpSeekerNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        manageEnt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(255, 255, 255));
        manageEnt.setText("Platform: Mental Healthcare ");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gender:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Country:");

        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("State:");

        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(isDoctorRadioBtn);
        isDoctorRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        isDoctorRadioBtn.setText("Are you a doctor");
        isDoctorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDoctorRadioBtnActionPerformed(evt);
            }
        });

        volNetwork.setForeground(new java.awt.Color(255, 255, 255));
        volNetwork.setText("Nearest landmark");

        volNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volNetworkComboActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(17, 180, 205));
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(town, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zipCode))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstName)
                                        .addComponent(LastName))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateOfBirth)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(address1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DobField)
                                        .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailID)
                                    .addComponent(volNetwork)
                                    .addComponent(phoneNumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(emailID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(isPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isVolunteer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isDoctorRadioBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)
                        .addGap(297, 297, 297)
                        .addComponent(createProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LastName, address1, dateOfBirth, emailID, emailID1, firstName, jLabel1, jLabel3, jLabel6, phoneNumber, town, volNetwork, zipCode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(manageEnt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isDoctorRadioBtn)
                            .addComponent(isVolunteer)
                            .addComponent(isPatient))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address1)
                    .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(town)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailID1)
                    .addComponent(emailIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volNetwork)
                    .addComponent(volNetworkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(createProfileButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(14, 14, 14))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed

        try {
            if (countryComboBox.getSelectedIndex() < 1 || stateComboBox.getSelectedIndex() < 1) {
                JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (genderComboBox.getSelectedIndex() < 1) {
                JOptionPane.showMessageDialog(null, "Please Enter valid gender ", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(DobField.getText());
            // Calculate age using dob
            int age = Validation.calculateAge(dateOfBirthVal);

            String phoneNumber = phoneNumberField.getText();
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String address1 = addressField1.getText();
            // String address2 = addressField2.getText();
            String town = townField.getText();
            String zipCode = zipCodeField.getText();
            String emailId = emailIDField.getText();
            String confirmEmail = emailIDField1.getText();
            // String occupation = occupationField.getText();
            String gender = (String) genderComboBox.getSelectedItem();
            String country = (String) countryComboBox.getSelectedItem();
            String state = (String) stateComboBox.getSelectedItem();

            if (firstName != null && !firstName.isEmpty()
                    && lastName != null && !lastName.isEmpty()
                    && address1 != null && !address1.isEmpty()
                    // && address2 != null && !address2.isEmpty()
                    && town != null && !town.isEmpty()
                    //&& occupation != null && !occupation.isEmpty()
                    && emailId != null && !emailId.isEmpty()
                    && confirmEmail != null && !confirmEmail.isEmpty()
                    && zipCode != null && !zipCode.isEmpty()
                    && gender != null && !gender.isEmpty() && age > 0 && !phoneNumber.isEmpty()
                    && country != null && !country.isEmpty()
                    && state != null && !state.isEmpty()) {
                if (buttonGroup1.getSelection() == null) {
                    JOptionPane.showMessageDialog(null, "Please select radio button to know if you are volunteer or need help or a doctor ", "warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (!(confirmEmail.equals(emailId))) {
                    JOptionPane.showMessageDialog(null, "Email Address does not match, Please Enter valid email Address", "warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Person person = null;
                if (isPatient.isSelected()) {
                    if (passwordField.getPassword().length == 0 || confirmPasswordField.getPassword().length == 0
                            || userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex() < 1) {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    if (helpSeekerNetworkCombo.getSelectedIndex() < 1) {
                        JOptionPane.showMessageDialog(null, "Please choose a closest city", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
//                    if ( age != 0) {
//                        JOptionPane.showMessageDialog(null, "Your age does not qualify as help seeker", "warning", JOptionPane.WARNING_MESSAGE);
//                        return;
//                    }
                    String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword = String.valueOf(confirmPasswordField.getPassword());

                    Network helpSeekerNw = (Network) helpSeekerNetworkCombo.getSelectedItem();
                    if (!(password.equals(confirmPassword))) {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address", "warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPaientList().remove(person);
                        return;
                    }

                    getEnterprise(helpSeekerNw);
                    if (enterprise == null) {
                        JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " + helpSeekerNw.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    getOrganization("Patient Organization", enterprise);

                    if (organization == null) {
                        JOptionPane.showMessageDialog(null, "Patient Organization does not exist for the enterprise! " + enterprise.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    person =  organization.getPersonDirectory().addPatient();
                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setName();
                    person.setPatient(true);

                    for (Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUserName().equals(userName)) {
                                JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                                return;
                            } else {
                                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                    for (UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()) {
                                        if (ua1.getUserName().equals(userName)) {
                                            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPaientList().remove((Patient) person);
                        return;
                    }
                    
            System.out.println(userName);
System.out.println(password);
System.out.println(person);
                    // To get help seeker org

                    UserAccount userAccountPatient = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new PatientRole());
                    userAccountPatient.setEnabled(true);
                    userAccountPatient.setPerson(person);
                    userAccountPatient.setNetwork((Network) helpSeekerNw);

                    // Send Req to Supervisor for approval       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccountPatient);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());

//                    // For Supervisor  
//                    for (Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (e instanceof InsuranceEnterprise) {
//                            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
//                                if (organization instanceof LabOrganization) {
//                                    this.organization = organization;
//                                    this.personDirectory = organization.getPersonDirectory();
//                                }
//                            }
//
//                        }
//                    }

                    if (organization != null) {
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccountPatient.getWorkQueue().getWorkRequestList().add(request);
                        userAccountPatient.setEnabled(false);
                    }
                } else if (isVolunteer.isSelected()) {
                    if (age < 10 || age == 0 || age > 100) {
                        JOptionPane.showMessageDialog(null, "Your age does not qualify as Volunteer", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (volNetworkCombo.getSelectedIndex() < 1) {
                        JOptionPane.showMessageDialog(null, "Please choose a closest city", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    Network volNetwork = (Network) volNetworkCombo.getSelectedItem();
                    getEnterprise(volNetwork);

                    if (enterprise == null) {
                        JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " + volNetwork.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    getOrganization("Volunteer", enterprise);
                    if (organization == null) {
                        JOptionPane.showMessageDialog(null, "Volunteer Organization does not exist for the enterprise! " + enterprise.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    person = organization.getPersonDirectory().addVolunteer();
                    person.setVolunteer(true);

                    String userName = SendEmailAndTextMessage.generateUserName(lastNameField.getText());
                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        userName = SendEmailAndTextMessage.generateUserName(lastNameField.getText());
                    }
                    String password = SendEmailAndTextMessage.generatePassword(firstNameField.getText());
                    String emailMsg = buildEmailTxtMsg(userName, password);

                    boolean emailSent = SendEmailAndTextMessage.sendEmail(emailMsg, emailIDField.getText(), userName, password);
                    if (!emailSent) {
                        JOptionPane.showMessageDialog(null, "Please Enter a valid Email address! ", "warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getVolunteerList().remove((Volunteer) person);
                        return;
                    }

                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new DepartmentsAdminRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(volNetwork);

                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());

//                    // For Supervisor  
//                    for (Enterprise e : volNetwork.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (e instanceof InsuranceEnterprise) {
//                            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
//                                if (organization instanceof LabOrganization) {
//                                    this.organization = organization;
//                                    this.personDirectory = organization.getPersonDirectory();
//                                }
//                            }
//
//                        }
//                    }

                    if (organization != null) {
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }
                if (isDoctorRadioBtn.isSelected()) {
                    if (age < 20 || age == 0) {
                        JOptionPane.showMessageDialog(null, "Your age does not qualify as Dcotor", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (passwordField.getPassword().length == 0 || confirmPasswordField.getPassword().length == 0
                            || userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex() < 1) {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword = String.valueOf(confirmPasswordField.getPassword());

                    Network docNw = (Network) helpSeekerNetworkCombo.getSelectedItem();

                    if (!(password.equals(confirmPassword))) {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address", "warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }

                    getEnterprise(docNw);
                    if (enterprise == null) {
                        JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " + docNw.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    getOrganization("Doctor", enterprise);
                    if (organization == null) {
                        JOptionPane.showMessageDialog(null, "Doctor Organization does not exist for the enterprise! " + enterprise.getName(), "warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    person = organization.getPersonDirectory().addPerson();

                    for (Enterprise e : docNw.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()) {
                            if (ua.getUserName().equals(userName)) {
                                JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                                return;
                            } else {
                                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                    for (UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()) {
                                        if (ua1.getUserName().equals(userName)) {
                                            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name", "warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }
                    // To get Doctor org

                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new DoctorRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(docNw);

                    // Request to Supervisor       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());

                    // For Supervisor  
//                    for (Enterprise e : docNw.getEnterpriseDirectory().getEnterpriseList()) {
//                        if (e instanceof InsuranceEnterprise) {
//                            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
//                                if (organization instanceof LabOrganization) {
//                                    this.organization = organization;
//                                    this.personDirectory = organization.getPersonDirectory();
//                                }
//                            }
//
//                        }
//                    }
                    if (organization != null) {
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }

                person.setFirstName(firstName);
                person.setLastName(lastName);
                // person.setAddress2(address2);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                //  person.setOccupation(occupation);
                person.setEmailId(emailId);
                person.setDob(dateOfBirthVal);
                person.setPhoneNumber(phoneNumber);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);

                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();

            } else {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        } catch (NumberFormatException npe) {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");
            return;
        } catch (ParseException npe) {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
            return;
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Organization does not exist! ");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
            return;
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed
    public void resetFields() {
        userNameJTxtField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        DobField.setText("");
        addressField1.setText("");
        //addressField2.setText("");
        townField.setText("");
        zipCodeField.setText("");
        // occupationField.setText("");
        emailIDField.setText("");
        emailIDField1.setText("");
        phoneNumberField.setText("");
        isPatient.setSelected(false);
        isVolunteer.setSelected(false);
        isDoctorRadioBtn.setSelected(false);

    }

    public void getEnterprise(Network network) {
        try {
            for (Network n : ecoSystem.getNetworkList()) {
                if (n.getCity().equals(network.getCity())) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                           if(e instanceof SchoolEnterprise && isVolunteer.isSelected())
//                           {
//                             this.enterprise = e;
//                             network = n;
//                            }
                         if (e instanceof HospitalEnterprise && isDoctorRadioBtn.isSelected()) {
                            this.enterprise = e;
                            network = n;
                        }
                         else if (e instanceof HospitalEnterprise && isPatient.isSelected()) {
                            this.enterprise = e;
                            network = n;
                        }
//                        else if (e instanceof InsuranceEnterprise ) {
//                            this.enterprise = e;
//                            network = n;
//                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please create Enterprise", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    public String buildEmailTxtMsg(String usrNm, String pwd) {
        StringBuilder emailMsgTxt = new StringBuilder();
        emailMsgTxt.append("Please find username and password to login into our application");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("username : ".concat(usrNm));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("password : ".concat(pwd));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("Thank You");
        emailMsgTxt.append("HeartHelp");

        return emailMsgTxt.toString();
    }

    public void getOrganization(String orgVal, Enterprise e) {

        try {
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                System.out.println(organization);
                if (orgVal.equals("Volunteer") && organization instanceof DepartmentsOrganization) {
                    this.organization = organization;
                    this.personDirectory = organization.getPersonDirectory();

                } else if (orgVal.equals("HelpSeeker") && organization instanceof PharmacyOrganization) {
                    this.organization = organization;
                    this.personDirectory = organization.getPersonDirectory();
                } else if (orgVal.equals("Doctor") && organization instanceof DoctorOrganization) {
                    this.organization = organization;
                    this.personDirectory = organization.getPersonDirectory();
                }
                 else if (orgVal.equals("Patient Organization") && organization instanceof PatientOrganization) {
                    this.organization = organization;
                    this.personDirectory = organization.getPersonDirectory();
                }
            }
        } catch (Exception ex) {
            return;
        }
    }


    private void isPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPatientActionPerformed

        helpSeekerPane.setVisible(true);
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();

    }//GEN-LAST:event_isPatientActionPerformed

    private void isVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isVolunteerActionPerformed
        helpSeekerPane.setVisible(false);
        volNetworkCombo.setVisible(true);
        volNetwork.setVisible(true);
        populateVolNetworkComboBox();
    }//GEN-LAST:event_isVolunteerActionPerformed

    private void populateVolNetworkComboBox() {
        volNetworkCombo.removeAllItems();
        if (ecoSystem.getNetworkList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");
            return;
        }
        volNetworkCombo.addItem("Please Choose a Network");

        for (Network network : ecoSystem.getNetworkList()) {
            volNetworkCombo.addItem(network);
        }

    }

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed

        stateComboBox.removeAllItems();

        if (countryComboBox.getSelectedIndex() > 0) {
            stateComboBox.addItem("Please select a State");
            HashSet<String> hsstateVal = new HashSet<>();
            for (Network network : ecoSystem.getNetworkList()) {
                if (network.getCountry().equals(countryComboBox.getSelectedItem())) {
                    hsstateVal.add(network.getState());
                }
            }
            for (String s1 : hsstateVal) {
                stateComboBox.addItem(s1);
            }
        }

    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed

    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void helpSeekerNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpSeekerNetworkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpSeekerNetworkComboActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void isDoctorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDoctorRadioBtnActionPerformed
        helpSeekerPane.setVisible(true);
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
    }//GEN-LAST:event_isDoctorRadioBtnActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void volNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volNetworkComboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_volNetworkComboActionPerformed

    public void fillForm() {
        firstNameField.setText("John");
        lastNameField.setText("Peter");
        DobField.setText("12/12/1938");
        genderComboBox.setSelectedItem("Female");
        addressField1.setText("433");
        //  addressField2.setText("Kenmore");
        townField.setText("boston");
        zipCodeField.setText("02145");
        // occupationField.setText("student");
        emailIDField.setText("sameer@gmail.com");
        emailIDField1.setText("sameer@gmail.com");
        phoneNumberField.setText("8974882584");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DobField;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address1;
    private javax.swing.JTextField addressField1;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JTextField emailIDField1;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JComboBox helpSeekerNetworkCombo;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLayeredPane helpSeekerPane;
    private javax.swing.JRadioButton isDoctorRadioBtn;
    private javax.swing.JRadioButton isPatient;
    private javax.swing.JRadioButton isVolunteer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JTextField userNameJTxtField;
    private javax.swing.JLabel volNetwork;
    private javax.swing.JComboBox volNetworkCombo;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
