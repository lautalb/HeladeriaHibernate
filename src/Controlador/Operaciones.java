/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Helado;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author lautalb
 */
public class Operaciones {
    
    public void altaHelado(Helado helado){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(helado);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado correctamente");
        
    }
}
