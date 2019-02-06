package resource;

import model.AccountStatement;
import service.AccountStatementService;

import javax.ws.rs.*;
import java.util.List;

@Path(value = "/accountStatement")
public class AccountStatementRest {

    AccountStatementService statementService;

    public AccountStatementRest(AccountStatementService statementService) {
        this.statementService = statementService;
    }

    @POST
    @Path(value = "/deposit/{id}")
    public void deposit(@PathParam("id") int id, @QueryParam("amount") double amount) {
        statementService.deposit(id, amount);
    }

    @POST
    @Path(value = "/withdrawal/{id}")
    public void withdrawal(@PathParam("id") int id, @QueryParam("amount") double amount) {
        statementService.withdrawal(id, amount);
    }

    @GET
    @Path(value = "/history")
    public List<AccountStatement> historyOperation() {
        return statementService.historyOperation();
    }

}
