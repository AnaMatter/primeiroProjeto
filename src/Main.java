import modelo.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente( 2l, "Val", "val@gmail.com");
        // cliente.setId(new Long(1));
        cliente.setId(1l);
        cliente.setNome("ANINHA");
        cliente.setEmail("anamatter@hotmail.com");


        System.out.println(cliente.transformarNomeEmMinusculo());

   }


}