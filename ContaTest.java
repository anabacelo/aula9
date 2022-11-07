import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste ContaTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class ContaTest
{
    /**
     * Construtor default para a classe de teste ContaTest
     */
    public ContaTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testaSacar()
    {
        Conta conta1 = new Conta(1000, 123);
        conta1.sacar(100);
        assertEquals(900, conta1.getSaldo(), 0.1);
    }

    @Test
    public void testaDepositar()
    {
        Conta conta1 = new Conta(1000, 123);
        conta1.depositar(500);
        assertEquals(1500, conta1.getSaldo(), 0.1);
    }

    @Test
    public void testeTransferir()
    {
        Conta conta1 = new Conta(1000, 123);
        Conta conta2 = new Conta(1000, 456);
        conta1.transferir(conta2, 500);
        assertEquals(500, conta1.getSaldo(), 0.1);
        assertEquals(1500, conta2.getSaldo(), 0.1);
    }
}



