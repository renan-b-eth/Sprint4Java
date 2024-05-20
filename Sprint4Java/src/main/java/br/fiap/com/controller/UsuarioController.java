package br.fiap.com.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.beans.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Path("/usuarios")
public class UsuarioController {

    private static List<Admin> admins = new ArrayList<>();
    /*dava para usar o spark ou springbot que ficaria melhor.*/
    @POST
    @Path("/cadastrar")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response cadastrarUsuario(
            @FormParam("nome") String nome,
            @FormParam("dataNascimento") String dataNascimento,
            @FormParam("sexo") String sexo,
            @FormParam("telefone") String telefone,
            @FormParam("email") String email,
            @FormParam("senha") String senha) {
    	
    	Random gerador = new Random();
    	int id = gerador.nextInt(1000); // gera um inteiro entre 0 (inclusive) e 100 (exclusive)

        Admin admin = new Admin(id, nome, dataNascimento, sexo, telefone, email, senha);
        admins.add(admin);

        return Response.status(201).entity("Admin cadastrado com sucesso!").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Admin> getAllUsuarios() {
        return admins;
    }
}