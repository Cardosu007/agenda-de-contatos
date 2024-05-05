public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 99217896);
        agendaContatos.adicionarContato("João", 99265896);
        agendaContatos.adicionarContato("Pedro", 98214587);
        agendaContatos.adicionarContato("Marcia", 97852145);
        agendaContatos.adicionarContato("Monica", 98521235);

        agendaContatos.exibirContatos();
        System.out.println("---------------------------------");
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println("---------------------------------");
        System.out.println(agendaContatos.atualizarNumeroContato("Maria", 555555));
        System.out.println("---------------------------------");
        agendaContatos.exibirContatos();
        System.out.println("---------------------------------");



    }
}