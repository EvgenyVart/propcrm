package net.protezov.bestprotez.controllers;

import net.protezov.bestprotez.entity.Client;
import net.protezov.bestprotez.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public Client findById(@RequestParam Long id){
        return null;
    }

    @GetMapping("/all")
    public String findAllCliens(Model model){
        List<Client> clientList = clientService.findAll();
        model.addAttribute("clients",clientList);
        return "clientlist";
    }

    @GetMapping("/create")
    public String createClientForm(Client client){
        return "clientcreate";
    }

    @PostMapping
    public String createClient(Client client){
        clientService.saveClient(client);
        return "redirect:/all";
    }

}
