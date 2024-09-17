package sistemasoperacionais;

public class MinhasInformacoes {
    // Seu código aqui

    // Thread para exibir o nome
    static class NomeThread extends Thread {
        @Override
        public void run() {
            System.out.println("Meu nome é: Kauã");
            try {
                Thread.sleep(1000);  // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Thread para exibir a idade
    static class IdadeThread extends Thread {
        @Override
        public void run() {
            System.out.println("Tenho 18 Anos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Thread para exibir a cidade
    static class CidadeThread extends Thread {
        @Override
        public void run() {
            System.out.println("Moro em: ceilandia");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Thread para exibir a despedida
    static class DespedidaThread extends Thread {
        @Override
        public void run() {
            System.out.println("Obrigado por visualizar minhas informações! Até breve.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Instanciando e iniciando as threads
        NomeThread nomeThread = new NomeThread();
        IdadeThread idadeThread = new IdadeThread();
        CidadeThread cidadeThread = new CidadeThread();
        DespedidaThread despedidaThread = new DespedidaThread();

        // Iniciando as threads em sequência
        nomeThread.start();
        try {
            nomeThread.join();  // Aguarda a thread do nome
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        idadeThread.start();
        try {
            idadeThread.join();  // Aguarda a thread da idade
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        cidadeThread.start();
        try {
            cidadeThread.join();  // Aguarda a thread da cidade
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        despedidaThread.start();
    }
}
