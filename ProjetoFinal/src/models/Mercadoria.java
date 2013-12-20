package models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Mercadoria extends Custos {
  
   
     private int quantidade;
    public static final String PROP_QUANTIDADE = "quantidade";

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        propertyChangeSupport.firePropertyChange(PROP_QUANTIDADE, oldQuantidade, quantidade);
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

     @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

     @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

     
     @Override
     public double getCusto() {
         return getCusto() * getQuantidade();
     }
    
}