package models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Custos {
      
 
     public String denominacao;
    public static final String PROP_DENOMINACAO = "denominacao";

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        String oldDenominacao = this.denominacao;
        this.denominacao = denominacao;
        propertyChangeSupport.firePropertyChange(PROP_DENOMINACAO, oldDenominacao, denominacao);
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

     public double custo;
    public static final String PROP_CUSTO = "custo";

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        double oldCusto = this.custo;
        this.custo = custo;
        propertyChangeSupport.firePropertyChange(PROP_CUSTO, oldCusto, custo);
    }    
}
