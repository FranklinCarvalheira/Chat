package chat;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    public static void main(String[] args){
        ClienteChat cliente = new ClienteChat("192.168.15.23", 12345);//IP e porta do Servidor
        try {
            cliente.executa();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}