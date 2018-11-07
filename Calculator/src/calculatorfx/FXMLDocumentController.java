/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author guicp
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button oito;

    @FXML
    private Button quatro;

    @FXML
    private Button nove;

    @FXML
    private Button sete;

    @FXML
    private Button cinco;

    @FXML
    private Button tres;

    @FXML
    private Button seis;

    @FXML
    private Button dois;

    @FXML
    private Button um;

    @FXML
    private Button limpa;

    @FXML
    private Button resto;

    @FXML
    private Button div;

    @FXML
    private Button sub;

    @FXML
    private Button soma;

    @FXML
    private Button mult;

    @FXML
    private Button zerozero;

    @FXML
    private Button zero;

    @FXML
    private Button ponto;

    @FXML
    private Button hashtag;

    @FXML
    private TextField campo;
    
    private long s;
    private long f;
    private String operacao;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }
       @FXML
        public void um_click() {
            String aux = campo.getText();
            String valor = "1";
            campo.setText(aux + valor);
        }
        public void dois_click() {
             String aux = campo.getText();
            String valor = "2";
            campo.setText(aux + valor);
        }
        public void tres_click() {
             String aux = campo.getText();
            String valor = "3";
            campo.setText(aux + valor);
        }
        public void quatro_click() {
             String aux = campo.getText();
            String valor = "4";
            campo.setText(aux + valor);
        }
        public void cinco_click() {
             String aux = campo.getText();
            String valor = "5";
            campo.setText(aux + valor);
        }
        public void seis_click() {
             String aux = campo.getText();
            String valor = "6";
            campo.setText(aux + valor);
        }
        public void sete_click() {
             String aux = campo.getText();
            String valor = "7";
            campo.setText(aux + valor);
        }
        public void oito_click() {
             String aux = campo.getText();
            String valor = "8";
            campo.setText(aux + valor);
        }
        public void nove_click() {
             String aux = campo.getText();
            String valor = "9";
            campo.setText(aux + valor);
        }
        public void zero_click() {
             String aux = campo.getText();
            String valor = "0";
            campo.setText(aux + valor);
        }
        public void zerozero_click() {
             String aux = campo.getText();
            String valor = "00";
            campo.setText(aux + valor);
        }
        public void ponto_click() {
             String aux = campo.getText();
            String valor = ".";
            campo.setText(aux + valor);
        }
        public void mult_click() {
            String valor = campo.getText();
            long valorLong = Integer.parseInt(valor);
            this.f = valorLong;
            campo.setText("");
            operacao = "x";
        }
        public void div_click() {
            String valor = campo.getText();
            long valorLong = Integer.parseInt(valor);
            this.f = valorLong;
            campo.setText("");
            operacao = "/";
        }
        public void soma_click() {
            String valor = campo.getText();
            long valorLong = Integer.parseInt(valor);
            this.f = valorLong;
            campo.setText("");
            operacao = "+";
        }
        public void sub_click() {
            String valor = campo.getText();
            long valorLong = Integer.parseInt(valor);
            this.f = valorLong;
            campo.setText("");
            operacao = "-";
        }
        public void igual_click() {
            switch(operacao) {
                case "+":
                    String valorSoma = campo.getText();
                    this.s = Integer.parseInt(valorSoma);
                    long auxSoma = this.f + this.s;
                    campo.setText(String.valueOf(auxSoma));
                    break;
                    
                case "-":
                    String valorSub = campo.getText();
                    this.s = Integer.parseInt(valorSub);
                    long auxSub = this.f + this.s;
                    campo.setText(String.valueOf(auxSub));
                    break;
                    
                case "x":
                    String valorVezes = campo.getText();
                    this.s = Integer.parseInt(valorVezes);
                    long auxVezes = this.f + this.s;
                    campo.setText(String.valueOf(auxVezes));
                    break;
                
                case "/":
                    String valorDiv = campo.getText();
                    this.s = Integer.parseInt(valorDiv);
                    long auxDiv = this.f + this.s;
                    campo.setText(String.valueOf(auxDiv));
                    break;
                
           
            }
        }
        public void resto_click() {
            
        }
        
        
    }    
    

