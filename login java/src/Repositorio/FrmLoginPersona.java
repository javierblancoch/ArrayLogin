package Repositorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class FrmLoginPersona extends JFrame implements ActionListener
{
     JLabel      lblNumero;
     JTextField  txtCodigo,txtClave;
     JButton     btnInsertar;
     JTextArea   txtArea;
     JScrollPane barra;
     String a,b;
     int pos;
     
     //arrays de validación(usuario y clave)
     String usuario[]={"u100","u101","u102","u103","u104"};
     String clave[]={"123","4321","456","128","192"};
     
    public static void main(String[] args) {
        FrmLoginPersona ventana=new FrmLoginPersona();
                        ventana.setVisible(true);
    }
    //Constructor 
    public FrmLoginPersona(){
        setSize(400,300);
        setTitle("Login Java");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        lblNumero=new  JLabel();
        lblNumero.setText("Usuario : ");
        lblNumero.setBounds(70,50,150,30);
        getContentPane().add(lblNumero);
        
        txtCodigo=new JTextField();
        txtCodigo.setBounds(150,50,150,30);
        getContentPane().add(txtCodigo);
        
        lblNumero=new  JLabel();
        lblNumero.setText("Clave : ");
        lblNumero.setBounds(70,100,150,30);
        getContentPane().add(lblNumero);
        
        txtClave=new JTextField();
        txtClave.setBounds(150,100,150,30);
        getContentPane().add(txtClave);
        
        btnInsertar=new  JButton();
        btnInsertar.setText("Entrar");
        btnInsertar.setBounds(150,200,90,30);
        btnInsertar.addActionListener(this);
        getContentPane().add(btnInsertar);
    }
    //método ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnInsertar)
       {
           //Obteniendo valores del JTextField y comparando con los arrays
           a=txtCodigo.getText();
           b=txtClave.getText();
           for(int i=0;i<usuario.length;i++){
               if(a.equals(usuario[i])){
                  pos=i;
               }
           }
           if(b.equals(clave[pos])){
               JOptionPane.showMessageDialog(null,"Bienvenido!!!");
               //nuevo objeto (ventana) de la clase ventana_ingreso
               ventana_ingreso ingreso=new ventana_ingreso();
                               ingreso.setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null,"Usuario y clave incorrecto");
               txtCodigo.setText("");
               txtClave.setText("");
           }
       }
    } 
}
