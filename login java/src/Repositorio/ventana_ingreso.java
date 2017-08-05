package Repositorio;
import javax.swing.*;
public class ventana_ingreso extends JFrame
{
    JLabel      mensaje;
    public ventana_ingreso(){
        setTitle("Ventana de ingreso");
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mensaje=new  JLabel();
        mensaje.setText("Todo salió ok");
        mensaje.setBounds(200,200,150,30);
        getContentPane().add(mensaje);
    }
}
