
import models.Funcionario;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class) 
public class TesteFuncionario {
    
    public TesteFuncionario() {
    Funcionario f = new Funcionario();
    //double result = f.calculaINSS(600);
    
    //assertEquals(174.0, f.calculaINSS(600.0));
    
    Assert.assertEquals(true, f.calculaINSS(600)== 174);
    
    
    Assert.assertEquals(true, f.totalEncargos(700) == 497);
    
    }
}
    