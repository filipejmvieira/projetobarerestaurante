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
        pCS.firePropertyChange(PROP_QUANTIDADE, oldQuantidade, quantidade);
    }
    private transient final PropertyChangeSupport pCS = new PropertyChangeSupport(this);

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pCS.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pCS.removePropertyChangeListener(listener);
    }
}