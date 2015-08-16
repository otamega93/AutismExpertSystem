/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AESViews;

import AESDAO.DiagnosisDAO;
import AESData.DiagnosisData;
import javax.swing.JOptionPane;

/**
 *
 * @author otamega
 */
public class JInternalFrameStartDiagnosis extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameStartDiagnosis
     */
    
    private double inferenceCounter = 0;
    private int threatment = 0;
    private String result = "";
    public static int test;
    
    public JInternalFrameStartDiagnosis() {
        javax.swing.JScrollPane scrb;
        initComponents();
        buttonGroup();
        buttonDefaultSelection();
    }
    
    private void buttonGroup() {
    
    //Those are the button groups for the ES inference
        buttonGroupFirstQuestion.add(jRadioButtonQ1_1);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_1_5);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_2);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_2_5);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_3);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_3_5);
        buttonGroupFirstQuestion.add(jRadioButtonQ1_4);
        
        buttonGroupSecondQuestion.add(jRadioButtonQ2_1);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_1_5);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_2);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_2_5);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_3);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_3_5);
        buttonGroupSecondQuestion.add(jRadioButtonQ2_4);
        
        buttonGroupThirdQuestion.add(jRadioButtonQ3_1);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_1_5);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_2);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_2_5);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_3);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_3_5);
        buttonGroupThirdQuestion.add(jRadioButtonQ3_4);
        
        buttonGroupFourthQuestion.add(jRadioButtonQ4_1);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_1_5);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_2);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_2_5);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_3);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_3_5);
        buttonGroupFourthQuestion.add(jRadioButtonQ4_4); 
        
        buttonGroupFifthQuestion.add(jRadioButtonQ5_1);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_1_5);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_2);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_2_5);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_3);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_3_5);
        buttonGroupFifthQuestion.add(jRadioButtonQ5_4); 
        
        buttonGroupSixthQuestion.add(jRadioButtonQ6_1);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_1_5);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_2);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_2_5);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_3);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_3_5);
        buttonGroupSixthQuestion.add(jRadioButtonQ6_4); 
        
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_1);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_1_5);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_2);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_2_5);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_3);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_3_5);
        buttonGroupSeventhQuestion.add(jRadioButtonQ7_4);
        
        buttonGroupEighthQuestion.add(jRadioButtonQ8_1);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_1_5);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_2);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_2_5);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_3);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_3_5);
        buttonGroupEighthQuestion.add(jRadioButtonQ8_4);
        
        buttonGroupNinthQuestion.add(jRadioButtonQ9_1);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_1_5);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_2);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_2_5);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_3);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_3_5);
        buttonGroupNinthQuestion.add(jRadioButtonQ9_4);
        
        buttonGroupTenthQuestion.add(jRadioButtonQ10_1);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_1_5);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_2);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_2_5);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_3);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_3_5);
        buttonGroupTenthQuestion.add(jRadioButtonQ10_4);
        
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_1);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_1_5);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_2);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_2_5);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_3);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_3_5);
        buttonGroupEleventhQuestion.add(jRadioButtonQ11_4);
        
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_1);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_1_5);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_2);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_2_5);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_3);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_3_5);
        buttonGroupTwelfthQuestion.add(jRadioButtonQ12_4);
        
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_1);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_1_5);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_2);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_2_5);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_3);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_3_5);
        buttonGroupThirteenthQuestion.add(jRadioButtonQ13_4);
        
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_1);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_1_5);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_2);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_2_5);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_3);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_3_5);
        buttonGroupFourteenthQuestion.add(jRadioButtonQ14_4);
        
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_1);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_1_5);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_2);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_2_5);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_3);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_3_5);
        buttonGroupFifteenthQuestion.add(jRadioButtonQ15_4);
    }
    
    private void buttonDefaultSelection() {
        
        jRadioButtonQ1_1.setSelected(true);
        jRadioButtonQ2_1.setSelected(true);
        jRadioButtonQ3_1.setSelected(true);
        jRadioButtonQ4_1.setSelected(true);
        jRadioButtonQ5_1.setSelected(true);
        jRadioButtonQ6_1.setSelected(true);
        jRadioButtonQ7_1.setSelected(true);
        jRadioButtonQ8_1.setSelected(true);
        jRadioButtonQ9_1.setSelected(true);
        jRadioButtonQ10_1.setSelected(true);
        jRadioButtonQ11_1.setSelected(true);
        jRadioButtonQ12_1.setSelected(true);
        jRadioButtonQ13_1.setSelected(true);
        jRadioButtonQ14_1.setSelected(true);
        jRadioButtonQ15_1.setSelected(true);   
        
    }

    private void inference() {
        
        //First question
        if (jRadioButtonQ1_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ1_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ1_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ1_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ1_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ1_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ1_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Second question
        if (jRadioButtonQ2_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ2_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ2_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ2_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ2_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ2_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ2_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Third question
        if (jRadioButtonQ3_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ3_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ3_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ3_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ3_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ3_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ3_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Fourth question
        if (jRadioButtonQ4_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ4_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ4_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ4_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ4_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ4_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ4_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Fifth question
        if (jRadioButtonQ5_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ5_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ5_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ5_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ5_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ5_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ5_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Sixth question
        if (jRadioButtonQ6_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ6_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ6_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ6_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ6_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ6_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ6_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Seventh question
        if (jRadioButtonQ7_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ7_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ7_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ7_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ7_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ7_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ7_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Eighth question
        if (jRadioButtonQ8_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ8_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ8_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ8_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ8_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ8_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ8_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Ninth question
        if (jRadioButtonQ9_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ9_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ9_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ9_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ9_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ9_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ9_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Tenth question
        if (jRadioButtonQ10_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ10_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ10_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ10_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ10_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ10_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ10_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Eleventh question
        if (jRadioButtonQ11_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ11_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ11_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ11_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ11_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ11_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ11_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Twelveth question
        if (jRadioButtonQ12_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ12_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ12_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ12_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ12_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ12_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ12_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Thirteenth question
        if (jRadioButtonQ13_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ13_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ13_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ13_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ13_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ13_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ13_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Fourteenth question
        if (jRadioButtonQ14_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ14_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ14_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ14_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ14_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ14_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ14_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Fifteenth question
        if (jRadioButtonQ15_1.isSelected()) {
            inferenceCounter = inferenceCounter + 1;
        } else if (jRadioButtonQ15_1_5.isSelected()) {
            inferenceCounter = inferenceCounter + 1.5;
        } else if (jRadioButtonQ15_2.isSelected()) {
            inferenceCounter = inferenceCounter + 2;
        } else if (jRadioButtonQ15_2_5.isSelected()) {
            inferenceCounter = inferenceCounter + 2.5;
        } else if (jRadioButtonQ15_3.isSelected()) {
            inferenceCounter = inferenceCounter + 3;
        } else if (jRadioButtonQ15_3_5.isSelected()) {
            inferenceCounter = inferenceCounter + 3.5;
        } else if (jRadioButtonQ15_4.isSelected()) {
            inferenceCounter = inferenceCounter + 4;    
        }
        
        //Getting the severeness of the illnes and threatment identifier
        if (inferenceCounter >= 36) {
            result = "Autismo severo";
            threatment = 1;
        } else if (inferenceCounter >= 30 && inferenceCounter < 36) {
            result = "Autismo moderado";
            threatment = 2;
        } else {
            result = "Ausencia del síndrome";
            threatment = 3;
        }       
        
        System.out.println(inferenceCounter);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFirstQuestion = new javax.swing.ButtonGroup();
        buttonGroupSecondQuestion = new javax.swing.ButtonGroup();
        buttonGroupThirdQuestion = new javax.swing.ButtonGroup();
        buttonGroupFourthQuestion = new javax.swing.ButtonGroup();
        buttonGroupFifthQuestion = new javax.swing.ButtonGroup();
        buttonGroupSixthQuestion = new javax.swing.ButtonGroup();
        buttonGroupSeventhQuestion = new javax.swing.ButtonGroup();
        buttonGroupEighthQuestion = new javax.swing.ButtonGroup();
        buttonGroupNinthQuestion = new javax.swing.ButtonGroup();
        buttonGroupTenthQuestion = new javax.swing.ButtonGroup();
        buttonGroupEleventhQuestion = new javax.swing.ButtonGroup();
        buttonGroupTwelfthQuestion = new javax.swing.ButtonGroup();
        buttonGroupFourteenthQuestion = new javax.swing.ButtonGroup();
        buttonGroupFifteenthQuestion = new javax.swing.ButtonGroup();
        buttonGroupThirteenthQuestion = new javax.swing.ButtonGroup();
        jScrollPaneDiagnosis = new javax.swing.JScrollPane();
        jPanelDiagnosis = new javax.swing.JPanel();
        jLabelDiagnosisTitle = new javax.swing.JLabel();
        jLabelQ1 = new javax.swing.JLabel();
        jRadioButtonQ1_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ1_1 = new javax.swing.JRadioButton();
        jRadioButtonQ1_2 = new javax.swing.JRadioButton();
        jRadioButtonQ1_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ1_3 = new javax.swing.JRadioButton();
        jRadioButtonQ1_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ1_4 = new javax.swing.JRadioButton();
        jLabelQ2 = new javax.swing.JLabel();
        jRadioButtonQ2_1 = new javax.swing.JRadioButton();
        jRadioButtonQ2_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ2_2 = new javax.swing.JRadioButton();
        jRadioButtonQ2_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ2_3 = new javax.swing.JRadioButton();
        jRadioButtonQ2_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ2_4 = new javax.swing.JRadioButton();
        jLabelQ3 = new javax.swing.JLabel();
        jRadioButtonQ3_1 = new javax.swing.JRadioButton();
        jRadioButtonQ3_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ3_2 = new javax.swing.JRadioButton();
        jRadioButtonQ3_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ3_3 = new javax.swing.JRadioButton();
        jRadioButtonQ3_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ3_4 = new javax.swing.JRadioButton();
        jLabelQ4 = new javax.swing.JLabel();
        jRadioButtonQ4_1 = new javax.swing.JRadioButton();
        jRadioButtonQ4_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ4_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ4_2 = new javax.swing.JRadioButton();
        jRadioButtonQ4_4 = new javax.swing.JRadioButton();
        jRadioButtonQ4_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ4_3 = new javax.swing.JRadioButton();
        jLabelQ5 = new javax.swing.JLabel();
        jRadioButtonQ5_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ5_1 = new javax.swing.JRadioButton();
        jRadioButtonQ5_4 = new javax.swing.JRadioButton();
        jRadioButtonQ5_2 = new javax.swing.JRadioButton();
        jRadioButtonQ5_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ5_3 = new javax.swing.JRadioButton();
        jLabelQ6 = new javax.swing.JLabel();
        jRadioButtonQ6_1 = new javax.swing.JRadioButton();
        jRadioButtonQ6_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ6_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ6_4 = new javax.swing.JRadioButton();
        jRadioButtonQ6_2 = new javax.swing.JRadioButton();
        jRadioButtonQ6_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ6_3 = new javax.swing.JRadioButton();
        jRadioButtonQ7_1 = new javax.swing.JRadioButton();
        jRadioButtonQ7_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ7_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ7_2 = new javax.swing.JRadioButton();
        jRadioButtonQ7_4 = new javax.swing.JRadioButton();
        jRadioButtonQ7_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ7_3 = new javax.swing.JRadioButton();
        jLabelQ7 = new javax.swing.JLabel();
        jLabelQ8 = new javax.swing.JLabel();
        jRadioButtonQ8_4 = new javax.swing.JRadioButton();
        jRadioButtonQ8_3 = new javax.swing.JRadioButton();
        jRadioButtonQ8_2 = new javax.swing.JRadioButton();
        jRadioButtonQ8_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ8_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ8_1 = new javax.swing.JRadioButton();
        jRadioButtonQ8_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ9_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ9_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ9_2 = new javax.swing.JRadioButton();
        jRadioButtonQ9_4 = new javax.swing.JRadioButton();
        jLabelQ9 = new javax.swing.JLabel();
        jRadioButtonQ9_1 = new javax.swing.JRadioButton();
        jRadioButtonQ9_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ9_3 = new javax.swing.JRadioButton();
        jRadioButtonQ5_1_5 = new javax.swing.JRadioButton();
        jLabelQ10 = new javax.swing.JLabel();
        jRadioButtonQ10_1 = new javax.swing.JRadioButton();
        jRadioButtonQ10_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ10_4 = new javax.swing.JRadioButton();
        jRadioButtonQ10_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ10_2 = new javax.swing.JRadioButton();
        jRadioButtonQ10_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ10_3 = new javax.swing.JRadioButton();
        jLabelQ11 = new javax.swing.JLabel();
        jRadioButtonQ11_1 = new javax.swing.JRadioButton();
        jRadioButtonQ11_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ11_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ11_2 = new javax.swing.JRadioButton();
        jRadioButtonQ11_4 = new javax.swing.JRadioButton();
        jRadioButtonQ11_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ11_3 = new javax.swing.JRadioButton();
        jLabelQ12 = new javax.swing.JLabel();
        jRadioButtonQ12_1 = new javax.swing.JRadioButton();
        jRadioButtonQ12_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ12_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ12_4 = new javax.swing.JRadioButton();
        jRadioButtonQ12_2 = new javax.swing.JRadioButton();
        jRadioButtonQ12_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ12_3 = new javax.swing.JRadioButton();
        jLabelQ13 = new javax.swing.JLabel();
        jRadioButtonQ13_1 = new javax.swing.JRadioButton();
        jRadioButtonQ13_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ13_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ13_2 = new javax.swing.JRadioButton();
        jRadioButtonQ13_4 = new javax.swing.JRadioButton();
        jRadioButtonQ13_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ13_3 = new javax.swing.JRadioButton();
        jLabelQ14 = new javax.swing.JLabel();
        jRadioButtonQ14_1 = new javax.swing.JRadioButton();
        jRadioButtonQ14_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ14_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ14_4 = new javax.swing.JRadioButton();
        jRadioButtonQ14_2 = new javax.swing.JRadioButton();
        jRadioButtonQ14_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ14_3 = new javax.swing.JRadioButton();
        jLabelQ15 = new javax.swing.JLabel();
        jRadioButtonQ15_1 = new javax.swing.JRadioButton();
        jRadioButtonQ15_3_5 = new javax.swing.JRadioButton();
        jRadioButtonQ15_4 = new javax.swing.JRadioButton();
        jRadioButtonQ15_1_5 = new javax.swing.JRadioButton();
        jRadioButtonQ15_2_5 = new javax.swing.JRadioButton();
        jRadioButtonQ15_2 = new javax.swing.JRadioButton();
        jRadioButtonQ15_3 = new javax.swing.JRadioButton();
        jButtonExecuteDiagnosis = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setTitle("Diagnóstico");

        jLabelDiagnosisTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelDiagnosisTitle.setText("Test de diagnóstico");

        jLabelQ1.setText("1- ¿Qué tan complicado resulta la interacción con los demás?");

        jRadioButtonQ1_1_5.setText("Cierta timidez");
        jRadioButtonQ1_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_1.setText("Sin dificultades");
        jRadioButtonQ1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_2.setText("Muy timido");
        jRadioButtonQ1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_2_5.setText("Muy timido. Dependiente");
        jRadioButtonQ1_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_3.setText("Distante. Interacción dificultosa");
        jRadioButtonQ1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_3_5.setText("Distante. poca interacción");
        jRadioButtonQ1_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ1_4.setText("Muy distante. Muy poca interacción");
        jRadioButtonQ1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1_4ActionPerformed(evt);
            }
        });

        jLabelQ2.setText("2- ¿Cuán dificil resulta para el paciente imitar conductas?");

        jRadioButtonQ2_1.setText("Sin dificultades");
        jRadioButtonQ2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_1_5.setText("Cierta dificultad");
        jRadioButtonQ2_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_2.setText("Imita conductas simples");
        jRadioButtonQ2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_2_5.setText("Imita conductas con cierto esfuerzo");
        jRadioButtonQ2_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_3.setText("Imita conductas con gran esfuerzo");
        jRadioButtonQ2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_3_5.setText("Imita con rara frecuencia y con ayuda");
        jRadioButtonQ2_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ2_4.setText("Nunca imita. Ni con ayuda");
        jRadioButtonQ2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2_4ActionPerformed(evt);
            }
        });

        jLabelQ3.setText("3- ¿Qué tan propenso es el paciente a demostrar afecto?");

        jRadioButtonQ3_1.setText("Sin dificultades");
        jRadioButtonQ3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_1_5.setText("Algunas dificultades");
        jRadioButtonQ3_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_2.setText("En ocasiones");
        jRadioButtonQ3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_2_5.setText("Ciertas respuestas emocionales inadecuadas");
        jRadioButtonQ3_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_3.setText("Respuestas emocionales inadecuadas");
        jRadioButtonQ3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_3_5.setText("Respuestas emocionales inadecuadas excesivas");
        jRadioButtonQ3_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ3_4.setText("Respuestas raramente apropiadas. Rigidez.");
        jRadioButtonQ3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3_4ActionPerformed(evt);
            }
        });

        jLabelQ4.setText("4- ¿Qué tan normales son sus habilidades motrícez?");

        jRadioButtonQ4_1.setText("Sin dificultades");
        jRadioButtonQ4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_3_5.setText("Autoagresión");
        jRadioButtonQ4_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_1_5.setText("Cierta torpeza");
        jRadioButtonQ4_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_2.setText("Torpeza. Movimientos repetitivos");
        jRadioButtonQ4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_4.setText("Últimas conductas descritas con mayor intensidad");
        jRadioButtonQ4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_2_5.setText("Pobre coordinación");
        jRadioButtonQ4_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ4_3.setText("Movimientos y posturas extrañas");
        jRadioButtonQ4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ4_3ActionPerformed(evt);
            }
        });

        jLabelQ5.setText("5- Acerca de su interés en objetos y su uso.");

        jRadioButtonQ5_3_5.setText("Poco interés en juguetes. Fascinación por la luz");
        jRadioButtonQ5_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_1.setText("Interés en objetos y juguetes");
        jRadioButtonQ5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_4.setText("Últimas conductas descritas con mayor intensidad");
        jRadioButtonQ5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_2.setText("Interés atípico");
        jRadioButtonQ5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_2_5.setText("Interés atípico. Juego muy infantil");
        jRadioButtonQ5_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_3.setText("Poco interés en juguetes");
        jRadioButtonQ5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_3ActionPerformed(evt);
            }
        });

        jLabelQ6.setText("6- ¿Qué tan buena es su respuesta a los cambios?");

        jRadioButtonQ6_1.setText("Apropiada");
        jRadioButtonQ6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_3_5.setText("Reacción de tristeza o enfado ante los cambios");
        jRadioButtonQ6_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_1_5.setText("Cierta resistencia");
        jRadioButtonQ6_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_4.setText("Reacciones severas al cambio");
        jRadioButtonQ6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_2.setText("Persistencia en la actividad");
        jRadioButtonQ6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_2_5.setText("Persistencia (aún con intervención adulta)");
        jRadioButtonQ6_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ6_3.setText("Resistencia activa al cambio");
        jRadioButtonQ6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ6_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_1.setText("Adecuada");
        jRadioButtonQ7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_3_5.setText("Sujeta objetos muy cerca de sus ojos.");
        jRadioButtonQ7_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_1_5.setText("Regular");
        jRadioButtonQ7_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_2.setText("Olvida mirar objetos. Evita la mirada");
        jRadioButtonQ7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_4.setText("Evita resistentemente la mirada. Mayor intensidad de puntos anteriores");
        jRadioButtonQ7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_2_5.setText("Interés en espejos o luces. Evita la mirada");
        jRadioButtonQ7_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ7_3.setText("Mirada fija desde angulos extraños.");
        jRadioButtonQ7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ7_3ActionPerformed(evt);
            }
        });

        jLabelQ7.setText("7- ¿Cuán efectiva resulta su respuesta visual?");

        jLabelQ8.setText("8- ¿Cuán efectiva resulta su respuesta auditiva?");

        jRadioButtonQ8_4.setText("Reacción extrema o no reacción a sonidos");
        jRadioButtonQ8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_3.setText("Ignorar. Asustarse y cubrirse los oídos");
        jRadioButtonQ8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_2.setText("Puede existir falta de respuesta o reacción extrema");
        jRadioButtonQ8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_3_5.setText("Respuesta variante. Ignora, reacciona exageradamente a sonidos conocidos");
        jRadioButtonQ8_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_2_5.setText("Entre falta de respuesta e ignorar");
        jRadioButtonQ8_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_1.setText("Adecuada");
        jRadioButtonQ8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ8_1_5.setText("Regular");
        jRadioButtonQ8_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ8_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_1_5.setText("Objetos en la boca que no son comestibles");
        jRadioButtonQ9_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_3_5.setText("Absorto y con niveles de reacción altos o bajos");
        jRadioButtonQ9_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_2.setText("Persistencia a los objetos en la boca. Prueba y huele objetos");
        jRadioButtonQ9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_4.setText("Altamente absorto. Ignora o sobrereacciona");
        jRadioButtonQ9_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_4ActionPerformed(evt);
            }
        });

        jLabelQ9.setText("9- ¿Cuán efectivo resultan sus sentidos del tacto, gusto y olfato?");

        jRadioButtonQ9_1.setText("Uso normal de los sentidos");
        jRadioButtonQ9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_2_5.setText("Ignora o reacciona extrañamente a olores suaves");
        jRadioButtonQ9_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ9_3.setText("Moderadamente absorto oliendo, probando y tocando");
        jRadioButtonQ9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ9_3ActionPerformed(evt);
            }
        });

        jRadioButtonQ5_1_5.setText("Cierto interés");
        jRadioButtonQ5_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ5_1_5ActionPerformed(evt);
            }
        });

        jLabelQ10.setText("10- ¿Cuán efectiva resulta su respuesta al miedo y a la ansiedad?");

        jRadioButtonQ10_1.setText("Conducta adecuada para ambas");
        jRadioButtonQ10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_3_5.setText("Bastante más miedo de lo típico");
        jRadioButtonQ10_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_4.setText("Miedos persisten. difícil de calmar. Puede fallar en reconocer peligros");
        jRadioButtonQ10_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_1_5.setText("Conducta algo adecuada");
        jRadioButtonQ10_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_2.setText("Ocasionalmente excesivas");
        jRadioButtonQ10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_2_5.setText("Muestras excesivas: mucho o poco");
        jRadioButtonQ10_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ10_3.setText("Más o menos miedo de lo típico");
        jRadioButtonQ10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ10_3ActionPerformed(evt);
            }
        });

        jLabelQ11.setText("11- ¿Cuán efectiva resulta su comunicación verbal?");

        jRadioButtonQ11_1.setText("Adecuada");
        jRadioButtonQ11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_3_5.setText("Inversión, repetición y mezcla del habla");
        jRadioButtonQ11_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_1_5.setText("Retraso del habla leve");
        jRadioButtonQ11_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_2.setText("Poco significado en el habla");
        jRadioButtonQ11_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_4.setText("Sin uso del habla con significados");
        jRadioButtonQ11_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_2_5.setText("Habla sin sentido. Ausencia del habla");
        jRadioButtonQ11_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ11_3.setText("Mezcla de lenguaje. Repeticiones");
        jRadioButtonQ11_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ11_3ActionPerformed(evt);
            }
        });

        jLabelQ12.setText("12- ¿Cuán efectiva resulta su comunicación no verbal?");

        jRadioButtonQ12_1.setText("Adecuada");
        jRadioButtonQ12_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_3_5.setText("Incapaz de comunicarse sin habla");
        jRadioButtonQ12_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_1_5.setText("Levemente inmaduro");
        jRadioButtonQ12_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_4.setText("No capta gestos o expresiones. Hace gestos estrambóticos");
        jRadioButtonQ12_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_2.setText("Inmaduro. Puede señalar vagamente");
        jRadioButtonQ12_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_2_5.setText("Algo incapaz de comunicarse sin habla");
        jRadioButtonQ12_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ12_3.setText("No entiende comunicación no verbal");
        jRadioButtonQ12_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ12_3ActionPerformed(evt);
            }
        });

        jLabelQ13.setText("13- ¿Cuáles son sus niveles de actividad?");

        jRadioButtonQ13_1.setText("Normal");
        jRadioButtonQ13_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_3_5.setText("Energía ilimitada o excesivo esfuerzo para realizar tareas");
        jRadioButtonQ13_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_1_5.setText("Poco movido o vago");
        jRadioButtonQ13_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_2.setText("Vago. Interfiere con sus actividades");
        jRadioButtonQ13_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_4.setText("Exhibe extremos. Cambia de una al otro");
        jRadioButtonQ13_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_2_5.setText("Algo sobreactivo");
        jRadioButtonQ13_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ13_3.setText("Bastante activo o bastante inactivo");
        jRadioButtonQ13_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ13_3ActionPerformed(evt);
            }
        });

        jLabelQ14.setText("14- ¿Cuál es su nivel y su consistencia de la respuesta intelectual?");

        jRadioButtonQ14_1.setText("Inteligencia normal");
        jRadioButtonQ14_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_3_5.setText("Funciona un poco mejor solo en una o más áreas");
        jRadioButtonQ14_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_1_5.setText("Poco más baja de lo normal");
        jRadioButtonQ14_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_4.setText("Menos brillante. Destaca en pocas áreas");
        jRadioButtonQ14_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_2.setText("No es tan brillante. Habilidades retardadas");
        jRadioButtonQ14_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_2_5.setText("Habilidades retardadas en todas las áreas");
        jRadioButtonQ14_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ14_3.setText("Menos brillante en general. Normal en pocas áreas");
        jRadioButtonQ14_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ14_3ActionPerformed(evt);
            }
        });

        jLabelQ15.setText("15- ¿Cuál es la impresión general del paciente?");

        jRadioButtonQ15_1.setText("No muestra síntomas característicos del autismo");
        jRadioButtonQ15_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_1ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_3_5.setText("Muestra varios síntomas de autismo");
        jRadioButtonQ15_3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_3_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_4.setText("Muestra muchos síntomas o grado extremo de autismo");
        jRadioButtonQ15_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_4ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_1_5.setText("Muestra algunos síntomas leves");
        jRadioButtonQ15_1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_1_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_2_5.setText("Muestra cierto número de síntomas");
        jRadioButtonQ15_2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_2_5ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_2.setText("Síntomas o grado leve de autismo");
        jRadioButtonQ15_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ15_2ActionPerformed(evt);
            }
        });

        jRadioButtonQ15_3.setText("Síntomas o grado moderado de autismo");

        jButtonExecuteDiagnosis.setText("Diagnosticar");
        jButtonExecuteDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteDiagnosisActionPerformed(evt);
            }
        });

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDiagnosisLayout = new javax.swing.GroupLayout(jPanelDiagnosis);
        jPanelDiagnosis.setLayout(jPanelDiagnosisLayout);
        jPanelDiagnosisLayout.setHorizontalGroup(
            jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDiagnosisTitle)
                            .addComponent(jLabelQ1)))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonQ1_4)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ1_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ1_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ1_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ1_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ1_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ1_3_5))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQ2))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ2_3_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ2_4))
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ2_1)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButtonQ2_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ2_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ2_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ2_3))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQ3))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ3_3_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ3_4))
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ3_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ3_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ3_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ3_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ3_3))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQ4))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ4_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ4_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ4_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ4_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ4_3))
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ4_3_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ4_4))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQ5))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelQ6))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ5_3_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ5_4))
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ5_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ5_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonQ5_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ5_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ5_3))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ6_3_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ6_4))
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addComponent(jRadioButtonQ6_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ6_1_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ6_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ6_2_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonQ6_3))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ7)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ7_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ7_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ7_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ7_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ7_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ7_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ7_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ8)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ8_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ8_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ8_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ8_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ8_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ8_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ8_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ9)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ9_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ9_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ9_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ9_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ9_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ9_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ9_2_5))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ10)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ10_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ10_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ10_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ10_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ10_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ10_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ10_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ11)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ11_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ11_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ11_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ11_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ11_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ11_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ11_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ12)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ12_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ12_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ12_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ12_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ12_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ12_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ12_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ13)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ13_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ13_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ13_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ13_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ13_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ13_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonQ13_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ14)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ14_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ14_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ14_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ14_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ14_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ14_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ14_3))))))
                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQ15)
                            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ15_3_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ15_4))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonQ15_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ15_1_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ15_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ15_2_5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonQ15_3))
                                    .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                                        .addComponent(jButtonExecuteDiagnosis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDiagnosisLayout.setVerticalGroup(
            jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiagnosisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDiagnosisTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelQ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ1_1_5)
                    .addComponent(jRadioButtonQ1_1)
                    .addComponent(jRadioButtonQ1_2_5)
                    .addComponent(jRadioButtonQ1_3)
                    .addComponent(jRadioButtonQ1_3_5)
                    .addComponent(jRadioButtonQ1_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQ1_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelQ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ2_1)
                    .addComponent(jRadioButtonQ2_1_5)
                    .addComponent(jRadioButtonQ2_2)
                    .addComponent(jRadioButtonQ2_2_5)
                    .addComponent(jRadioButtonQ2_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ2_3_5)
                    .addComponent(jRadioButtonQ2_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelQ3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ3_1)
                    .addComponent(jRadioButtonQ3_1_5)
                    .addComponent(jRadioButtonQ3_2)
                    .addComponent(jRadioButtonQ3_2_5)
                    .addComponent(jRadioButtonQ3_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ3_3_5)
                    .addComponent(jRadioButtonQ3_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ4_1)
                    .addComponent(jRadioButtonQ4_1_5)
                    .addComponent(jRadioButtonQ4_2)
                    .addComponent(jRadioButtonQ4_2_5)
                    .addComponent(jRadioButtonQ4_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ4_3_5)
                    .addComponent(jRadioButtonQ4_4))
                .addGap(12, 12, 12)
                .addComponent(jLabelQ5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ5_1)
                    .addComponent(jRadioButtonQ5_2)
                    .addComponent(jRadioButtonQ5_2_5)
                    .addComponent(jRadioButtonQ5_3)
                    .addComponent(jRadioButtonQ5_1_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ5_3_5)
                    .addComponent(jRadioButtonQ5_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ6_1)
                    .addComponent(jRadioButtonQ6_1_5)
                    .addComponent(jRadioButtonQ6_2)
                    .addComponent(jRadioButtonQ6_2_5)
                    .addComponent(jRadioButtonQ6_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ6_3_5)
                    .addComponent(jRadioButtonQ6_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ7_1)
                    .addComponent(jRadioButtonQ7_1_5)
                    .addComponent(jRadioButtonQ7_2)
                    .addComponent(jRadioButtonQ7_2_5)
                    .addComponent(jRadioButtonQ7_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ7_3_5)
                    .addComponent(jRadioButtonQ7_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ8_1)
                    .addComponent(jRadioButtonQ8_1_5)
                    .addComponent(jRadioButtonQ8_2)
                    .addComponent(jRadioButtonQ8_2_5)
                    .addComponent(jRadioButtonQ8_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ8_3_5)
                    .addComponent(jRadioButtonQ8_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ9_1)
                    .addComponent(jRadioButtonQ9_1_5)
                    .addComponent(jRadioButtonQ9_2)
                    .addComponent(jRadioButtonQ9_2_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ9_3_5)
                    .addComponent(jRadioButtonQ9_4)
                    .addComponent(jRadioButtonQ9_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ10_1)
                    .addComponent(jRadioButtonQ10_1_5)
                    .addComponent(jRadioButtonQ10_2)
                    .addComponent(jRadioButtonQ10_2_5)
                    .addComponent(jRadioButtonQ10_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ10_3_5)
                    .addComponent(jRadioButtonQ10_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ11_1)
                    .addComponent(jRadioButtonQ11_1_5)
                    .addComponent(jRadioButtonQ11_2)
                    .addComponent(jRadioButtonQ11_2_5)
                    .addComponent(jRadioButtonQ11_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ11_3_5)
                    .addComponent(jRadioButtonQ11_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ12_1)
                    .addComponent(jRadioButtonQ12_1_5)
                    .addComponent(jRadioButtonQ12_2)
                    .addComponent(jRadioButtonQ12_2_5)
                    .addComponent(jRadioButtonQ12_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ12_3_5)
                    .addComponent(jRadioButtonQ12_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ13_1)
                    .addComponent(jRadioButtonQ13_1_5)
                    .addComponent(jRadioButtonQ13_2)
                    .addComponent(jRadioButtonQ13_2_5)
                    .addComponent(jRadioButtonQ13_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ13_3_5)
                    .addComponent(jRadioButtonQ13_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ14_1)
                    .addComponent(jRadioButtonQ14_1_5)
                    .addComponent(jRadioButtonQ14_2)
                    .addComponent(jRadioButtonQ14_2_5)
                    .addComponent(jRadioButtonQ14_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ14_3_5)
                    .addComponent(jRadioButtonQ14_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQ15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ15_1)
                    .addComponent(jRadioButtonQ15_1_5)
                    .addComponent(jRadioButtonQ15_2)
                    .addComponent(jRadioButtonQ15_2_5)
                    .addComponent(jRadioButtonQ15_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ15_3_5)
                    .addComponent(jRadioButtonQ15_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExecuteDiagnosis)
                    .addComponent(jButtonExit))
                .addContainerGap())
        );

        jScrollPaneDiagnosis.setViewportView(jPanelDiagnosis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonQ1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_1ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ1_1ActionPerformed

    private void jRadioButtonQ2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_1ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_1ActionPerformed

    private void jRadioButtonQ2_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_1_5ActionPerformed

    private void jRadioButtonQ2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_2ActionPerformed

    private void jRadioButtonQ2_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_2_5ActionPerformed

    private void jRadioButtonQ2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_3ActionPerformed

    private void jRadioButtonQ2_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_3_5ActionPerformed

    private void jRadioButtonQ2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2_4ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ2_4ActionPerformed

    private void jRadioButtonQ3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_1ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ3_1ActionPerformed

    private void jRadioButtonQ4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ4_1ActionPerformed

    private void jRadioButtonQ5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ5_1ActionPerformed

    private void jRadioButtonQ5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ5_4ActionPerformed

    private void jRadioButtonQ6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ6_1ActionPerformed

    private void jRadioButtonQ6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ6_4ActionPerformed

    private void jRadioButtonQ7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ7_1ActionPerformed

    private void jRadioButtonQ7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ7_4ActionPerformed

    private void jRadioButtonQ8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ8_1ActionPerformed

    private void jRadioButtonQ8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ8_4ActionPerformed

    private void jRadioButtonQ9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ9_1ActionPerformed

    private void jRadioButtonQ9_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ9_4ActionPerformed

    private void jRadioButtonQ11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ11_1ActionPerformed

    private void jRadioButtonQ11_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ11_4ActionPerformed

    private void jRadioButtonQ12_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ12_1ActionPerformed

    private void jRadioButtonQ12_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ12_4ActionPerformed

    private void jRadioButtonQ13_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ13_1ActionPerformed

    private void jRadioButtonQ13_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ13_4ActionPerformed

    private void jRadioButtonQ14_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ14_1ActionPerformed

    private void jRadioButtonQ14_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ14_4ActionPerformed

    private void jRadioButtonQ15_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_1ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ15_1ActionPerformed

    private void jRadioButtonQ15_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ15_4ActionPerformed

    private void jRadioButtonQ15_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_2ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ15_2ActionPerformed

    private void jRadioButtonQ10_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_4ActionPerformed
    
    }//GEN-LAST:event_jRadioButtonQ10_4ActionPerformed

    private void jRadioButtonQ10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_1ActionPerformed

    }//GEN-LAST:event_jRadioButtonQ10_1ActionPerformed

    private void jRadioButtonQ1_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_1_5ActionPerformed

    }//GEN-LAST:event_jRadioButtonQ1_1_5ActionPerformed

    private void jRadioButtonQ1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ1_2ActionPerformed

    private void jRadioButtonQ1_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ1_2_5ActionPerformed

    private void jRadioButtonQ1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ1_3ActionPerformed

    private void jRadioButtonQ1_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_3_5ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ1_3_5ActionPerformed

    private void jRadioButtonQ1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1_4ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ1_4ActionPerformed

    private void jRadioButtonQ3_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ3_1_5ActionPerformed

    private void jRadioButtonQ3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_2ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ3_2ActionPerformed

    private void jRadioButtonQ3_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ3_2_5ActionPerformed

    private void jRadioButtonQ3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_3ActionPerformed
     
    }//GEN-LAST:event_jRadioButtonQ3_3ActionPerformed

    private void jRadioButtonQ3_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_3_5ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ3_3_5ActionPerformed

    private void jRadioButtonQ3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3_4ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ3_4ActionPerformed

    private void jRadioButtonQ4_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_1_5ActionPerformed

    private void jRadioButtonQ4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_2ActionPerformed

    private void jRadioButtonQ4_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_2_5ActionPerformed

    private void jRadioButtonQ4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_3ActionPerformed

    private void jRadioButtonQ4_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_3_5ActionPerformed

    private void jRadioButtonQ4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ4_4ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ4_4ActionPerformed

    private void jButtonExecuteDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteDiagnosisActionPerformed
        inference();
        int j = JOptionPane.showConfirmDialog(rootPane, "Estudio finalizado. El resultado del diagnóstico es: " + result +". ¿Desea guardar?", "Resultados", JOptionPane.OK_CANCEL_OPTION);
            if ((j) == JOptionPane.OK_OPTION) {
                
            DiagnosisData diagnosisData = new DiagnosisData();
            DiagnosisDAO diagnosisDAO = new DiagnosisDAO();
            
            diagnosisData.setDiagnosisResult(result);
            //diagnosisData.setDiagnosisThreatment(threatment);
            diagnosisData.setThreatmentID(threatment);
            diagnosisDAO.add(diagnosisData);
            
            JFrameSaveDiagnosisIntoPatient jFrameSaveDiagnosisIntoPatient = new JFrameSaveDiagnosisIntoPatient();
            jFrameSaveDiagnosisIntoPatient.setVisible(true);
            jFrameSaveDiagnosisIntoPatient.show();
           
                JOptionPane.showMessageDialog(rootPane, "Diagnostico guardado");
                
            }
            
        this.dispose();
        
    }//GEN-LAST:event_jButtonExecuteDiagnosisActionPerformed

    private void jRadioButtonQ5_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ5_1_5ActionPerformed

    private void jRadioButtonQ5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ5_2ActionPerformed

    private void jRadioButtonQ5_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ5_2_5ActionPerformed

    private void jRadioButtonQ5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ5_3ActionPerformed

    private void jRadioButtonQ5_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ5_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ5_3_5ActionPerformed

    private void jRadioButtonQ6_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ6_1_5ActionPerformed

    private void jRadioButtonQ6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ6_2ActionPerformed

    private void jRadioButtonQ6_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_2_5ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ6_2_5ActionPerformed

    private void jRadioButtonQ6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ6_3ActionPerformed

    private void jRadioButtonQ6_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ6_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ6_3_5ActionPerformed

    private void jRadioButtonQ7_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ7_1_5ActionPerformed

    private void jRadioButtonQ7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ7_2ActionPerformed

    private void jRadioButtonQ7_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_2_5ActionPerformed
       
    }//GEN-LAST:event_jRadioButtonQ7_2_5ActionPerformed

    private void jRadioButtonQ7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ7_3ActionPerformed

    private void jRadioButtonQ7_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ7_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ7_3_5ActionPerformed

    private void jRadioButtonQ8_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ8_1_5ActionPerformed

    private void jRadioButtonQ8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ8_2ActionPerformed

    private void jRadioButtonQ8_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ8_2_5ActionPerformed

    private void jRadioButtonQ8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ8_3ActionPerformed

    private void jRadioButtonQ8_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ8_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ8_3_5ActionPerformed

    private void jRadioButtonQ9_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ9_1_5ActionPerformed

    private void jRadioButtonQ9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ9_2ActionPerformed

    private void jRadioButtonQ9_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ9_2_5ActionPerformed

    private void jRadioButtonQ9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ9_3ActionPerformed

    private void jRadioButtonQ9_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ9_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ9_3_5ActionPerformed

    private void jRadioButtonQ10_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ10_1_5ActionPerformed

    private void jRadioButtonQ10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ10_2ActionPerformed

    private void jRadioButtonQ10_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ10_2_5ActionPerformed

    private void jRadioButtonQ10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ10_3ActionPerformed

    private void jRadioButtonQ10_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ10_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ10_3_5ActionPerformed

    private void jRadioButtonQ11_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ11_1_5ActionPerformed

    private void jRadioButtonQ11_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ11_2ActionPerformed

    private void jRadioButtonQ11_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ11_2_5ActionPerformed

    private void jRadioButtonQ11_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ11_3ActionPerformed

    private void jRadioButtonQ11_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ11_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ11_3_5ActionPerformed

    private void jRadioButtonQ12_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ12_1_5ActionPerformed

    private void jRadioButtonQ12_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ12_2ActionPerformed

    private void jRadioButtonQ12_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ12_2_5ActionPerformed

    private void jRadioButtonQ12_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ12_3ActionPerformed

    private void jRadioButtonQ12_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ12_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ12_3_5ActionPerformed

    private void jRadioButtonQ13_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ13_1_5ActionPerformed

    private void jRadioButtonQ13_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ13_2ActionPerformed

    private void jRadioButtonQ13_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ13_2_5ActionPerformed

    private void jRadioButtonQ13_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ13_3ActionPerformed

    private void jRadioButtonQ13_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ13_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ13_3_5ActionPerformed

    private void jRadioButtonQ14_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ14_1_5ActionPerformed

    private void jRadioButtonQ14_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_2ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ14_2ActionPerformed

    private void jRadioButtonQ14_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ14_2_5ActionPerformed

    private void jRadioButtonQ14_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_3ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ14_3ActionPerformed

    private void jRadioButtonQ14_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ14_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ14_3_5ActionPerformed

    private void jRadioButtonQ15_1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_1_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ15_1_5ActionPerformed

    private void jRadioButtonQ15_2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_2_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ15_2_5ActionPerformed

    private void jRadioButtonQ15_3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ15_3_5ActionPerformed
        
    }//GEN-LAST:event_jRadioButtonQ15_3_5ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEighthQuestion;
    private javax.swing.ButtonGroup buttonGroupEleventhQuestion;
    private javax.swing.ButtonGroup buttonGroupFifteenthQuestion;
    private javax.swing.ButtonGroup buttonGroupFifthQuestion;
    private javax.swing.ButtonGroup buttonGroupFirstQuestion;
    private javax.swing.ButtonGroup buttonGroupFourteenthQuestion;
    private javax.swing.ButtonGroup buttonGroupFourthQuestion;
    private javax.swing.ButtonGroup buttonGroupNinthQuestion;
    private javax.swing.ButtonGroup buttonGroupSecondQuestion;
    private javax.swing.ButtonGroup buttonGroupSeventhQuestion;
    private javax.swing.ButtonGroup buttonGroupSixthQuestion;
    private javax.swing.ButtonGroup buttonGroupTenthQuestion;
    private javax.swing.ButtonGroup buttonGroupThirdQuestion;
    private javax.swing.ButtonGroup buttonGroupThirteenthQuestion;
    private javax.swing.ButtonGroup buttonGroupTwelfthQuestion;
    private javax.swing.JButton jButtonExecuteDiagnosis;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelDiagnosisTitle;
    private javax.swing.JLabel jLabelQ1;
    private javax.swing.JLabel jLabelQ10;
    private javax.swing.JLabel jLabelQ11;
    private javax.swing.JLabel jLabelQ12;
    private javax.swing.JLabel jLabelQ13;
    private javax.swing.JLabel jLabelQ14;
    private javax.swing.JLabel jLabelQ15;
    private javax.swing.JLabel jLabelQ2;
    private javax.swing.JLabel jLabelQ3;
    private javax.swing.JLabel jLabelQ4;
    private javax.swing.JLabel jLabelQ5;
    private javax.swing.JLabel jLabelQ6;
    private javax.swing.JLabel jLabelQ7;
    private javax.swing.JLabel jLabelQ8;
    private javax.swing.JLabel jLabelQ9;
    private javax.swing.JPanel jPanelDiagnosis;
    private javax.swing.JRadioButton jRadioButtonQ10_1;
    private javax.swing.JRadioButton jRadioButtonQ10_1_5;
    private javax.swing.JRadioButton jRadioButtonQ10_2;
    private javax.swing.JRadioButton jRadioButtonQ10_2_5;
    private javax.swing.JRadioButton jRadioButtonQ10_3;
    private javax.swing.JRadioButton jRadioButtonQ10_3_5;
    private javax.swing.JRadioButton jRadioButtonQ10_4;
    private javax.swing.JRadioButton jRadioButtonQ11_1;
    private javax.swing.JRadioButton jRadioButtonQ11_1_5;
    private javax.swing.JRadioButton jRadioButtonQ11_2;
    private javax.swing.JRadioButton jRadioButtonQ11_2_5;
    private javax.swing.JRadioButton jRadioButtonQ11_3;
    private javax.swing.JRadioButton jRadioButtonQ11_3_5;
    private javax.swing.JRadioButton jRadioButtonQ11_4;
    private javax.swing.JRadioButton jRadioButtonQ12_1;
    private javax.swing.JRadioButton jRadioButtonQ12_1_5;
    private javax.swing.JRadioButton jRadioButtonQ12_2;
    private javax.swing.JRadioButton jRadioButtonQ12_2_5;
    private javax.swing.JRadioButton jRadioButtonQ12_3;
    private javax.swing.JRadioButton jRadioButtonQ12_3_5;
    private javax.swing.JRadioButton jRadioButtonQ12_4;
    private javax.swing.JRadioButton jRadioButtonQ13_1;
    private javax.swing.JRadioButton jRadioButtonQ13_1_5;
    private javax.swing.JRadioButton jRadioButtonQ13_2;
    private javax.swing.JRadioButton jRadioButtonQ13_2_5;
    private javax.swing.JRadioButton jRadioButtonQ13_3;
    private javax.swing.JRadioButton jRadioButtonQ13_3_5;
    private javax.swing.JRadioButton jRadioButtonQ13_4;
    private javax.swing.JRadioButton jRadioButtonQ14_1;
    private javax.swing.JRadioButton jRadioButtonQ14_1_5;
    private javax.swing.JRadioButton jRadioButtonQ14_2;
    private javax.swing.JRadioButton jRadioButtonQ14_2_5;
    private javax.swing.JRadioButton jRadioButtonQ14_3;
    private javax.swing.JRadioButton jRadioButtonQ14_3_5;
    private javax.swing.JRadioButton jRadioButtonQ14_4;
    private javax.swing.JRadioButton jRadioButtonQ15_1;
    private javax.swing.JRadioButton jRadioButtonQ15_1_5;
    private javax.swing.JRadioButton jRadioButtonQ15_2;
    private javax.swing.JRadioButton jRadioButtonQ15_2_5;
    private javax.swing.JRadioButton jRadioButtonQ15_3;
    private javax.swing.JRadioButton jRadioButtonQ15_3_5;
    private javax.swing.JRadioButton jRadioButtonQ15_4;
    private javax.swing.JRadioButton jRadioButtonQ1_1;
    private javax.swing.JRadioButton jRadioButtonQ1_1_5;
    private javax.swing.JRadioButton jRadioButtonQ1_2;
    private javax.swing.JRadioButton jRadioButtonQ1_2_5;
    private javax.swing.JRadioButton jRadioButtonQ1_3;
    private javax.swing.JRadioButton jRadioButtonQ1_3_5;
    private javax.swing.JRadioButton jRadioButtonQ1_4;
    private javax.swing.JRadioButton jRadioButtonQ2_1;
    private javax.swing.JRadioButton jRadioButtonQ2_1_5;
    private javax.swing.JRadioButton jRadioButtonQ2_2;
    private javax.swing.JRadioButton jRadioButtonQ2_2_5;
    private javax.swing.JRadioButton jRadioButtonQ2_3;
    private javax.swing.JRadioButton jRadioButtonQ2_3_5;
    private javax.swing.JRadioButton jRadioButtonQ2_4;
    private javax.swing.JRadioButton jRadioButtonQ3_1;
    private javax.swing.JRadioButton jRadioButtonQ3_1_5;
    private javax.swing.JRadioButton jRadioButtonQ3_2;
    private javax.swing.JRadioButton jRadioButtonQ3_2_5;
    private javax.swing.JRadioButton jRadioButtonQ3_3;
    private javax.swing.JRadioButton jRadioButtonQ3_3_5;
    private javax.swing.JRadioButton jRadioButtonQ3_4;
    private javax.swing.JRadioButton jRadioButtonQ4_1;
    private javax.swing.JRadioButton jRadioButtonQ4_1_5;
    private javax.swing.JRadioButton jRadioButtonQ4_2;
    private javax.swing.JRadioButton jRadioButtonQ4_2_5;
    private javax.swing.JRadioButton jRadioButtonQ4_3;
    private javax.swing.JRadioButton jRadioButtonQ4_3_5;
    private javax.swing.JRadioButton jRadioButtonQ4_4;
    private javax.swing.JRadioButton jRadioButtonQ5_1;
    private javax.swing.JRadioButton jRadioButtonQ5_1_5;
    private javax.swing.JRadioButton jRadioButtonQ5_2;
    private javax.swing.JRadioButton jRadioButtonQ5_2_5;
    private javax.swing.JRadioButton jRadioButtonQ5_3;
    private javax.swing.JRadioButton jRadioButtonQ5_3_5;
    private javax.swing.JRadioButton jRadioButtonQ5_4;
    private javax.swing.JRadioButton jRadioButtonQ6_1;
    private javax.swing.JRadioButton jRadioButtonQ6_1_5;
    private javax.swing.JRadioButton jRadioButtonQ6_2;
    private javax.swing.JRadioButton jRadioButtonQ6_2_5;
    private javax.swing.JRadioButton jRadioButtonQ6_3;
    private javax.swing.JRadioButton jRadioButtonQ6_3_5;
    private javax.swing.JRadioButton jRadioButtonQ6_4;
    private javax.swing.JRadioButton jRadioButtonQ7_1;
    private javax.swing.JRadioButton jRadioButtonQ7_1_5;
    private javax.swing.JRadioButton jRadioButtonQ7_2;
    private javax.swing.JRadioButton jRadioButtonQ7_2_5;
    private javax.swing.JRadioButton jRadioButtonQ7_3;
    private javax.swing.JRadioButton jRadioButtonQ7_3_5;
    private javax.swing.JRadioButton jRadioButtonQ7_4;
    private javax.swing.JRadioButton jRadioButtonQ8_1;
    private javax.swing.JRadioButton jRadioButtonQ8_1_5;
    private javax.swing.JRadioButton jRadioButtonQ8_2;
    private javax.swing.JRadioButton jRadioButtonQ8_2_5;
    private javax.swing.JRadioButton jRadioButtonQ8_3;
    private javax.swing.JRadioButton jRadioButtonQ8_3_5;
    private javax.swing.JRadioButton jRadioButtonQ8_4;
    private javax.swing.JRadioButton jRadioButtonQ9_1;
    private javax.swing.JRadioButton jRadioButtonQ9_1_5;
    private javax.swing.JRadioButton jRadioButtonQ9_2;
    private javax.swing.JRadioButton jRadioButtonQ9_2_5;
    private javax.swing.JRadioButton jRadioButtonQ9_3;
    private javax.swing.JRadioButton jRadioButtonQ9_3_5;
    private javax.swing.JRadioButton jRadioButtonQ9_4;
    private javax.swing.JScrollPane jScrollPaneDiagnosis;
    // End of variables declaration//GEN-END:variables
}
