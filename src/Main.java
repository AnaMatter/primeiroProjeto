import modelo.Cliente;
import modelo.Produto;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente( 2l, "Val", "val@gmail.com", "fisica", "06554545", 30 );

        // cliente.setId(new Long(1));
        cliente.setId(1l);
        cliente.setNome("ANINHA");
        cliente.setEmail("anamatter@hotmail.com");
        cliente.setIdade(15);

        Produto produto = new Produto( 1l,"chocolate", 1l, "unidade", 2.5);

        Produto produto2 = new Produto();

        produto2.setId(2l);
        produto2.setDescricao("sorvete");
        produto2.setCodigo(5l);
        produto2.setUnMedida("unidade");
        produto2.setVlUnitario(35.80);




//        System.out.println(cliente.transformarNomeEmMinusculo());
//        System.out.println(cliente);
//        System.out.println(cliente2);
//        System.out.println(cliente.calcularIdade(5));
//        System.out.println(cliente.alterarNome(" MATTER"));
//        System.out.println(cliente.corrigirEmail());

   }


}