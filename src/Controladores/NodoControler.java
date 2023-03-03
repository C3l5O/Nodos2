
package Controladores;
        
import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NodoControler implements ActionListener {
    
   //LEVANTAR EL FORMULARIO PRINCIPAL
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public NodoControler(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAgregarNodos.addActionListener(this);

        //LEVANTAR LISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregarNodos)
        {
            //ABRIR LA VISTA NODOS
             //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA NODOS
            this.VistaNodos.btnApilar.addActionListener(this);
            this.VistaNodos.btnEncolar.addActionListener(this);
            
            //LEVANTAR EL FORMULARIO VISTA NODOS
            this.VistaNodos.setLocationRelativeTo(null);
            this.VistaNodos.setVisible(true);
        }
        
        if(e.getSource() == this.VistaNodos.btnApilar)
        {
            this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
            
        }
        
        
        
    }
    
    
    
}
