package one.facade;

import subsystem1.crm.CrmSystem;
import subsystem2.cep.CepApi;

// problema: tem uma base de clientes e precisa fazer uma migração desses clientes para uma nova base ou incrementar a base atual.
// base atual só tem nome e cep
//consumir uma api de cep, para que apartir do cep que já está no bd, para consolidar as informações com endereço, logradouro, complemento, cidade, estado
public class Facade {

    public void MigrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmSystem.gravarCliente(nome, cep, cidade, estado);

        
    }
    
}
